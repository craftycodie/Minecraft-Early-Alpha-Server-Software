/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */

/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityPlayerMP
/*     */   extends EntityPlayer
/*     */ {
/*     */   public NetServerHandler playerNetServerHandler;
/*     */   public MinecraftServer b;
/*     */   public hw ac;
/*     */   public double ad;
/*     */   public double ae;
/*  18 */   public List loadedChunks = new LinkedList();
/*     */   
/*  20 */   public Set field_420_ah = new HashSet();
/*     */   
/*     */   public double ah;
/*     */   
/*     */   public EntityPlayerMP(MinecraftServer paramMinecraftServer, World paramdp, String paramString, hw paramhw) {
/*  25 */     super(paramdp);
/*     */     
/*  27 */     int i = paramdp.l + this.Q.nextInt(20) - 10;
/*  28 */     int j = paramdp.n + this.Q.nextInt(20) - 10;
/*  29 */     int k = paramdp.d(i, j);
/*  30 */     c(i + 0.5D, k, j + 0.5D, 0.0F, 0.0F);
/*  31 */     this.b = paramMinecraftServer;
/*  32 */     this.M = 0.0F;
/*  33 */     paramhw.a = this;
/*  34 */     this.username = paramString;
/*  35 */     this.ac = paramhw;
/*  36 */     this.B = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_() {}
/*     */ 
/*     */   
/*     */   public void f(Entity paramdb) {}
/*     */   
/*     */   public boolean a(Entity paramdb, int paramInt) {
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {}
/*     */   
/*     */   public void h() {
/*  53 */     super.b_();
/*     */     
/*  55 */     ChunkCoordIntPair ih = null;
/*  56 */     double d = 0.0D;
              int b = 0;
/*  57 */     for (b = 0; b < this.loadedChunks.size(); b++) {
/*  58 */       ChunkCoordIntPair ih1 = (ChunkCoordIntPair)this.loadedChunks.get(b);
/*  59 */       double d1 = ih1.a(this);
/*  60 */       if (b == 0 || d1 < d) {
/*  61 */         ih = ih1;
/*  62 */         d = ih1.a(this);
/*     */       } 
/*     */     } 
/*  65 */     if (ih != null) {
/*  66 */       b = 0;
/*     */       
/*  68 */       if (d < 1024.0D) b = 1; 
/*  69 */       if (this.playerNetServerHandler.b() < 2) b = 1;
/*     */       
/*  71 */       if (b != 0) {
/*  72 */         this.loadedChunks.remove(ih);
/*  73 */         this.playerNetServerHandler.sendPacket(new Packet51MapChunk(ih.a * 16, 0, ih.b * 16, 16, 128, 16, this.b.e));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void x() {
/*  79 */     this.n = this.o = this.p = 0.0D;
/*  80 */     this.bd = false;
/*  81 */     super.x();
/*     */   }
/*     */   
/*     */   public void c(Entity paramdb, int paramInt) {
/*  85 */     if (!paramdb.A && 
/*  86 */       paramdb instanceof EntityItem) {
/*  87 */       this.playerNetServerHandler.sendPacket(new Packet17UnknownItemStack(((EntityItem)paramdb).a, paramInt));
/*  88 */       this.b.k.sendPacketToTrackedPlayers(paramdb, new Packet22Collect(paramdb.entityId, this.entityId));
/*     */     } 
/*     */     
/*  91 */     super.c(paramdb, paramInt);
/*     */   }
/*     */   
/*     */   public void y() {
/*  95 */     if (!this.an) {
/*  96 */       this.ao = -1;
/*  97 */       this.an = true;
/*  98 */       this.b.k.sendPacketToTrackedPlayers(this, new Packet18Animation(this, 1));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected float n() {
/* 103 */     return 1.62F;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */