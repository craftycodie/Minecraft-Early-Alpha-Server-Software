/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fd
/*    */   extends en
/*    */ {
/*    */   public fd(int paramInt) {
/* 11 */     super(paramInt);
/* 12 */     this.aS = 64;
/* 13 */     this.aR = 1;
/*    */   }
/*    */   
/*    */   public boolean a(gc paramgc, eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     if (paramInt4 == 0) return false; 
/* 18 */     if (!paramdp.c(paramInt1, paramInt2, paramInt3).a()) return false;
/*    */ 
/*    */     
/* 21 */     if (paramInt4 == 1) paramInt2++;
/*    */     
/* 23 */     if (paramInt4 == 2) paramInt3--; 
/* 24 */     if (paramInt4 == 3) paramInt3++; 
/* 25 */     if (paramInt4 == 4) paramInt1--; 
/* 26 */     if (paramInt4 == 5) paramInt1++;
/*    */     
/* 28 */     if (!et.aD.a(paramdp, paramInt1, paramInt2, paramInt3)) return false;
/*    */ 
/*    */     
/* 31 */     if (paramInt4 == 1) {
/* 32 */       paramdp.b(paramInt1, paramInt2, paramInt3, et.aD.ba, fw.b(((parameq.q + 180.0F) * 16.0F / 360.0F) + 0.5D) & 0xF);
/*    */     } else {
/* 34 */       paramdp.b(paramInt1, paramInt2, paramInt3, et.aI.ba, paramInt4);
/*    */     } 
/*    */     
/* 37 */     paramgc.a--;
/* 38 */     parameq.a((hp)paramdp.k(paramInt1, paramInt2, paramInt3));
/* 39 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */