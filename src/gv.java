/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gv
/*    */   extends et
/*    */ {
/*    */   protected gv(int paramInt) {
/* 12 */     super(paramInt, hz.j);
/* 13 */     this.aZ = 48;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 18 */     byte b = 2;
/* 19 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 20 */       for (int j = paramInt2 - b; j <= paramInt2 + b; j++) {
/* 21 */         for (int k = paramInt3 - b; k <= paramInt3 + b; k++) {
/*    */           
/* 23 */           if (paramdp.c(i, j, k) == hz.f);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 32 */     byte b = 2;
/* 33 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 34 */       for (int j = paramInt2 - b; j <= paramInt2 + b; j++) {
/* 35 */         for (int k = paramInt3 - b; k <= paramInt3 + b; k++)
/*    */         {
/* 37 */           paramdp.g(i, j, k, paramdp.a(i, j, k));
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */