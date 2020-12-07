/*    */ 
/*    */ 
/*    */ 
/*    */ public class ci
/*    */   extends en
/*    */ {
/*    */   private et[] aV;
/*  8 */   private float aW = 4.0F;
/*    */   private int aX;
/*    */   protected int a;
/*    */   
/*    */   public ci(int paramInt1, int paramInt2, int paramInt3, et[] paramArrayOfet) {
/* 13 */     super(paramInt1);
/* 14 */     this.a = paramInt3;
/* 15 */     this.aV = paramArrayOfet;
/* 16 */     this.aR = 1;
/* 17 */     this.aS = 32 << paramInt3;
/* 18 */     if (paramInt3 == 3) this.aS *= 4; 
/* 19 */     this.aW = ((paramInt3 + 1) * 2);
/* 20 */     this.aX = paramInt2 + paramInt3;
/*    */   }
/*    */   
/*    */   public float a(gc paramgc, et paramet) {
/* 24 */     for (byte b = 0; b < this.aV.length; b++) {
/* 25 */       if (this.aV[b] == paramet) return this.aW; 
/* 26 */     }  return 1.0F;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(gc paramgc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 34 */     paramgc.a(1);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ci.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */