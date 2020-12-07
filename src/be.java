/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class be
/*    */   extends en
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public be(int paramInt) {
/* 11 */     super(paramInt);
/* 12 */     this.a = paramInt + 256;
/* 13 */     a(et.n[paramInt + 256].a(2));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(gc paramgc, eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     if (paramdp.a(paramInt1, paramInt2, paramInt3) == et.aS.ba) {
/* 22 */       paramInt4 = 0;
/*    */     } else {
/* 24 */       if (paramInt4 == 0) paramInt2--; 
/* 25 */       if (paramInt4 == 1) paramInt2++; 
/* 26 */       if (paramInt4 == 2) paramInt3--; 
/* 27 */       if (paramInt4 == 3) paramInt3++; 
/* 28 */       if (paramInt4 == 4) paramInt1--; 
/* 29 */       if (paramInt4 == 5) paramInt1++;
/*    */     
/*    */     } 
/* 32 */     if (paramgc.a == 0) return false;
/*    */ 
/*    */     
/* 35 */     if (paramdp.a(this.a, paramInt1, paramInt2, paramInt3, false)) {
/* 36 */       et et = et.n[this.a];
/* 37 */       if (paramdp.d(paramInt1, paramInt2, paramInt3, this.a)) {
/* 38 */         et.n[this.a].c(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 39 */         paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), et.bj.c(), (et.bj.a() + 1.0F) / 2.0F, et.bj.b() * 0.8F);
/* 40 */         paramgc.a--;
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\be.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */