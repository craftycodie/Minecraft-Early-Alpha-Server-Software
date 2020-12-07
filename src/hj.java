/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hj
/*    */   extends en
/*    */ {
/*    */   public hj(int paramInt) {
/*  9 */     super(paramInt);
/* 10 */     this.aR = 1;
/* 11 */     this.aS = 64;
/*    */   }
/*    */   
/*    */   public boolean a(gc paramgc, eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 15 */     if (paramInt4 == 0) paramInt2--; 
/* 16 */     if (paramInt4 == 1) paramInt2++; 
/* 17 */     if (paramInt4 == 2) paramInt3--; 
/* 18 */     if (paramInt4 == 3) paramInt3++; 
/* 19 */     if (paramInt4 == 4) paramInt1--; 
/* 20 */     if (paramInt4 == 5) paramInt1++;
/*    */     
/* 22 */     int i = paramdp.a(paramInt1, paramInt2, paramInt3);
/*    */     
/* 24 */     if (i == 0) {
/* 25 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "fire.ignite", 1.0F, b.nextFloat() * 0.4F + 0.8F);
/* 26 */       paramdp.d(paramInt1, paramInt2, paramInt3, et.ar.ba);
/*    */     } 
/*    */     
/* 29 */     paramgc.a(1);
/* 30 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */