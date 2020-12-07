/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hk
/*    */   extends en
/*    */ {
/*    */   public hk(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1);
/* 12 */     this.aR = 1;
/* 13 */     this.aS = 32 << paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(gc paramgc, eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     int i = paramdp.a(paramInt1, paramInt2, paramInt3);
/* 18 */     hz hz = paramdp.c(paramInt1, paramInt2 + 1, paramInt3);
/*    */     
/* 20 */     if ((!hz.a() && i == et.u.ba) || i == et.v.ba) {
/* 21 */       et et = et.aA;
/* 22 */       paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), et.bj.c(), (et.bj.a() + 1.0F) / 2.0F, et.bj.b() * 0.8F);
/* 23 */       paramdp.d(paramInt1, paramInt2, paramInt3, et.ba);
/* 24 */       paramgc.a(1);
/*    */       
/* 26 */       if (paramdp.k.nextInt(8) == 0 && i == et.u.ba) {
/* 27 */         byte b1 = 1;
/* 28 */         for (byte b2 = 0; b2 < b1; b2++) {
/* 29 */           float f1 = 0.7F;
/* 30 */           float f2 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/* 31 */           float f3 = 1.2F;
/* 32 */           float f4 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/* 33 */           fa fa = new fa(paramdp, (paramInt1 + f2), (paramInt2 + f3), (paramInt3 + f4), new gc(en.Q));
/* 34 */           fa.ac = 10;
/* 35 */           paramdp.a(fa);
/*    */         } 
/*    */       } 
/*    */       
/* 39 */       return true;
/*    */     } 
/*    */     
/* 42 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */