/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class PlayerInstance
/*     */ {
            private PlayerManager playerManager;
/*  16 */   private List players = new ArrayList();
/*     */   private int chunkX;
/*     */   private int chunkZ;
/*     */   private ChunkCoordIntPair currentChunk;
/*  20 */   private short[] blocksToUpdate = new short[10];
/*  21 */   private int numBlocksToUpdate = 0;
/*     */   private int minX;
/*     */   private int maxX;
/*     */   private int minY;
            private int maxY;
            private int minZ;
            private int maxZ;
/*     */   
/*     */   public PlayerInstance(PlayerManager paramgr, int paramInt1, int paramInt2) {
/*  27 */     this.chunkX = paramInt1;
/*  28 */     this.chunkZ = paramInt2;
/*  29 */     this.currentChunk = new ChunkCoordIntPair(paramInt1, paramInt2);
              this.playerManager = paramgr;
/*  30 */     (PlayerManager.getMinecraftServer(paramgr)).e.chunkProviderServer.d(paramInt1, paramInt2);
/*     */   }
/*     */

/*     */   public void a(EntityPlayerMP paramdq) {
/*  34 */     if (this.players.contains(paramdq)) throw new IllegalStateException("Failed to add player. " + paramdq + " already is in chunk " + this.chunkX + ", " + this.chunkZ);
/*  35 */     paramdq.field_420_ah.add(this.currentChunk);
/*  36 */     paramdq.playerNetServerHandler.sendPacket(new Packet50PreChunk(this.currentChunk.a, this.currentChunk.b, true));
/*  37 */     this.players.add(paramdq);
/*  38 */     paramdq.loadedChunks.add(this.currentChunk);
/*     */   }
/*     */
/*     */   public void removePlayer(EntityPlayerMP paramdq) {
/*  42 */     if (!this.players.contains(paramdq)) {
/*  43 */       (new IllegalStateException("Failed to remove player. " + paramdq + " isn't in chunk " + this.chunkX + ", " + this.chunkZ)).printStackTrace();
/*     */       return;
/*     */     }
/*  46 */     this.players.remove(paramdq);
/*  47 */     if (this.players.size() == 0) {
/*  48 */       long l = this.chunkX + 2147483647L | this.chunkZ + 2147483647L << 32L;
/*  49 */       PlayerManager.getPlayerInstances(this.playerManager).remove(l);
/*  50 */       if (this.numBlocksToUpdate > 0) {
/*  51 */         PlayerManager.getPlayerInstancesToUpdate(this.playerManager).remove(this);
/*     */       }
/*  53 */       (PlayerManager.getMinecraftServer(this.playerManager)).e.chunkProviderServer.func_374_c(this.chunkX, this.chunkZ);
/*     */     }
/*     */
/*  56 */     paramdq.loadedChunks.remove(this.currentChunk);
/*  57 */     if (paramdq.field_420_ah.contains(this.currentChunk)) {
/*  58 */       paramdq.playerNetServerHandler.sendPacket(new Packet50PreChunk(this.chunkX, this.chunkZ, false));
/*     */     }
/*     */   }
/*     */

public void markBlockNeedsUpdate(int i, int j, int k)
{
    if(numBlocksToUpdate == 0)
    {
        PlayerManager.getPlayerInstancesToUpdate(this.playerManager).add(this);
        minX = maxX = i;
        minY = maxY = j;
        minZ = maxZ = k;
    }
    if(minX > i)
    {
        minX = i;
    }
    if(maxX < i)
    {
        maxX = i;
    }
    if(minY > j)
    {
        minY = j;
    }
    if(maxY < j)
    {
        maxY = j;
    }
    if(minZ > k)
    {
        minZ = k;
    }
    if(maxZ < k)
    {
        maxZ = k;
    }
    if(numBlocksToUpdate < 10)
    {
        short word0 = (short)(i << 12 | k << 8 | j);
        for(int l = 0; l < numBlocksToUpdate; l++)
        {
            if(blocksToUpdate[l] == word0)
            {
                return;
            }
        }

        blocksToUpdate[numBlocksToUpdate++] = word0;
    }
}
/*     */   
/*     */   public void sendPacketToPlayersInInstance(Packet paramha) {
/*  90 */     for (int b = 0; b < this.players.size(); b++) {
/*  91 */       EntityPlayerMP dq = (EntityPlayerMP) this.players.get(b);
/*  92 */       if (dq.field_420_ah.contains(this.currentChunk))
/*  93 */         dq.playerNetServerHandler.sendPacket(paramha);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onUpdate() {
/*     */     Packet52MultiBlockChange gs = null;
/*  99 */     if (this.numBlocksToUpdate == 0)
/* 100 */       return;
/* 101 */     if (this.numBlocksToUpdate == 1) {
                int i = this.chunkX * 16 + this.minX;
                int l = this.minY;
                int k1 = this.chunkZ * 16 + this.minZ;
                sendPacketToPlayersInInstance(new Packet53BlockChange(i, l, k1, (PlayerManager.getMinecraftServer(this.playerManager)).e));
///* 102 */       eh = new Packet53BlockChange(this.chunkX * 16 + this.minX, this.minY, this.chunkZ * 16 + this.minZ, (PlayerManager.markBlockNeedsUpdate(this.markBlockNeedsUpdate)).removeEntry);
/* 103 */     } else if (this.numBlocksToUpdate == 10) {
                minY = (minY / 2) * 2;
                maxY = (maxY / 2 + 1) * 2;
                int j = minX + chunkX * 16;
                int i1 = minY;
                int l1 = minZ + chunkZ * 16;
                int j2 = (maxX - minX) + 1;
                int l2 = (maxY - minY) + 2;
                int i3 = (maxZ - minZ) + 1;
                sendPacketToPlayersInInstance(new Packet51MapChunk(j, i1, l1, j2, l2, i3, (PlayerManager.getMinecraftServer(this.playerManager)).e));
/*     */     } else {
/* 114 */       gs = new Packet52MultiBlockChange(this.chunkX, this.chunkZ, this.blocksToUpdate, this.numBlocksToUpdate, (PlayerManager.getMinecraftServer(this.playerManager)).e);
/*     */     }
              if (gs != null)
/* 116 */       sendPacketToPlayersInInstance(gs);
/* 117 */     this.numBlocksToUpdate = 0;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */