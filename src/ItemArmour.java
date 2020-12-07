/*    */ public class ItemArmour
/*    */   extends Item
/*    */ {
/*  4 */   private static final int[] aY = new int[] { 3, 8, 6, 3 };
/*  5 */   private static final int[] aZ = new int[] { 11, 16, 15, 13 };
/*    */   public final int a;
/*    */   public final int aV;
/*    */   public final int aW;
/*    */   public final int aX;
/*    */   
/*    */   public ItemArmour(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 12 */     super(paramInt1);
/* 13 */     this.a = paramInt2;
/* 14 */     this.aV = paramInt4;
/* 15 */     this.aX = paramInt3;
/* 16 */     this.aW = aY[paramInt4];
/* 17 */     this.aS = aZ[paramInt4] * 3 << paramInt2;
/* 18 */     this.aR = 1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ga.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */