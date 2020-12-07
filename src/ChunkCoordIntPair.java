/*    */ 
/*    */ 
/*    */ public class ChunkCoordIntPair
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public ChunkCoordIntPair(int paramInt1, int paramInt2) {
/*  9 */     this.a = paramInt1;
/* 10 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 14 */     return this.a << 8 | this.b;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 18 */     ChunkCoordIntPair ih1 = (ChunkCoordIntPair)paramObject;
/* 19 */     return (ih1.a == this.a && ih1.b == this.b);
/*    */   }
/*    */   
/*    */   public double a(Entity paramdb) {
/* 23 */     double d1 = (this.a * 16 + 8);
/* 24 */     double d2 = (this.b * 16 + 8);
/*    */     
/* 26 */     double d3 = d1 - paramdb.k;
/* 27 */     double d4 = d2 - paramdb.m;
/*    */     
/* 29 */     return d3 * d3 + d4 * d4;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ih.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */