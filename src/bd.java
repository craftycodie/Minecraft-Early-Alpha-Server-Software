/*    */ 
/*    */ 
/*    */ 
/*    */ public class bd
/*    */   extends en
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public bd(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1);
/* 11 */     this.aR = 1;
/* 12 */     this.aS = 32 << paramInt2;
/* 13 */     if (paramInt2 == 3) this.aS *= 4;
/*    */     
/* 15 */     this.a = 4 + paramInt2 * 2;
/*    */   }
/*    */   
/*    */   public float a(gc paramgc, et paramet) {
/* 19 */     return 1.5F;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(gc paramgc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 27 */     paramgc.a(2);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */