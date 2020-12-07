/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WorldManager
/*    */   extends World
/*    */ {
/*    */   public ChunkProvider chunkProviderServer;
/*    */   
/*    */   public WorldManager(File paramFile, String paramString) {
/* 13 */     super(paramFile, paramString);
/* 14 */     this.c = false;
/*    */   }
/*    */   
/*    */   protected IChunkProvider a(File paramFile) {
/* 18 */     this.chunkProviderServer = new ChunkProvider(this, new ChunkLoader(paramFile, true), new hi(this, this.p));
/* 19 */     return this.chunkProviderServer;
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 23 */     int i = paramInt1 - this.l;
/* 24 */     int j = paramInt3 - this.n;
/* 25 */     if (i < 0) i = -i; 
/* 26 */     if (j < 0) j = -j; 
/* 27 */     if (i > j) j = i; 
/* 28 */     if (j < 16) return false; 
/* 29 */     return super.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*    */   }
/*    */   
/*    */   public boolean setBlockWithNotify(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 33 */     int i = paramInt1 - this.l;
/* 34 */     int j = paramInt3 - this.n;
/* 35 */     if (i < 0) i = -i; 
/* 36 */     if (j < 0) j = -j; 
/* 37 */     if (i > j) j = i; 
/* 38 */     if (j < 16) return false; 
/* 39 */     return super.setBlockWithNotify(paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\du.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */