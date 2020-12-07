/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ie
/*    */   extends en
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public ie(int paramInt, et paramet) {
/* 11 */     super(paramInt);
/* 12 */     this.a = paramet.ba;
/*    */   }
/*    */   
/*    */   public boolean a(gc paramgc, eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 16 */     if (paramdp.a(paramInt1, paramInt2, paramInt3) == et.aS.ba) {
/* 17 */       paramInt4 = 0;
/*    */     } else {
/* 19 */       if (paramInt4 == 0) paramInt2--; 
/* 20 */       if (paramInt4 == 1) paramInt2++; 
/* 21 */       if (paramInt4 == 2) paramInt3--; 
/* 22 */       if (paramInt4 == 3) paramInt3++; 
/* 23 */       if (paramInt4 == 4) paramInt1--; 
/* 24 */       if (paramInt4 == 5) paramInt1++;
/*    */     
/*    */     } 
/* 27 */     if (paramgc.a == 0) return false;
/*    */ 
/*    */     
/* 30 */     if (paramdp.a(this.a, paramInt1, paramInt2, paramInt3, false)) {
/* 31 */       et et = et.n[this.a];
/* 32 */       if (paramdp.d(paramInt1, paramInt2, paramInt3, this.a)) {
/* 33 */         et.n[this.a].c(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 34 */         paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), et.bj.c(), (et.bj.a() + 1.0F) / 2.0F, et.bj.b() * 0.8F);
/* 35 */         paramgc.a--;
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ie.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */