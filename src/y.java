/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class y
/*    */   extends et
/*    */ {
/*    */   public y(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, hz.p);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 15 */     if (paramInt == 0) return this.aZ + 2; 
/* 16 */     if (paramInt == 1) return this.aZ + 1; 
/* 17 */     return this.aZ;
/*    */   }
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     if (paramInt4 > 0 && et.n[paramInt4].d() && 
/* 22 */       paramdp.o(paramInt1, paramInt2, paramInt3)) {
/* 23 */       a(paramdp, paramInt1, paramInt2, paramInt3, 0);
/* 24 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random paramRandom) {
/* 30 */     return 0;
/*    */   }
/*    */   
/*    */   public void c(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 34 */     bs bs = new bs(paramdp, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F);
/* 35 */     bs.a = paramdp.k.nextInt(bs.a / 4) + bs.a / 8;
/* 36 */     paramdp.a(bs);
/*    */   }
/*    */   
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 40 */     bs bs = new bs(paramdp, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F);
/* 41 */     paramdp.a(bs);
/* 42 */     paramdp.a(bs, "random.fuse", 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */