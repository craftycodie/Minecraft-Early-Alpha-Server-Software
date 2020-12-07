/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockSign
/*    */   extends BlockContainer
/*    */ {
/*    */   private Class a;
/*    */   private boolean b;
/*    */   
/*    */   protected BlockSign(int paramInt, Class paramClass, boolean paramBoolean) {
/* 16 */     super(paramInt, Material.c);
/* 17 */     this.b = paramBoolean;
/* 18 */     this.aZ = 4;
/* 19 */     this.a = paramClass;
/* 20 */     float f1 = 0.25F;
/* 21 */     float f2 = 1.0F;
/* 22 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 28 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 37 */     if (this.b)
/*    */       return; 
/* 39 */     int i = paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*    */     
/* 41 */     float f1 = 0.28125F;
/* 42 */     float f2 = 0.78125F;
/* 43 */     float f3 = 0.0F;
/* 44 */     float f4 = 1.0F;
/*    */     
/* 46 */     float f5 = 0.125F;
/*    */     
/* 48 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 49 */     if (i == 2) a(f3, f1, 1.0F - f5, f4, f2, 1.0F); 
/* 50 */     if (i == 3) a(f3, f1, 0.0F, f4, f2, f5); 
/* 51 */     if (i == 4) a(1.0F - f5, f1, f3, 1.0F, f2, f4); 
/* 52 */     if (i == 5) a(0.0F, f1, f3, f5, f2, f4); 
/*    */   }
/*    */   
/*    */   public int a() {
/* 56 */     return -1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 64 */     return false;
/*    */   }
/*    */   
/*    */   protected TileEntity a_() {
/*    */     try {
/* 69 */       return (TileEntity)this.a.newInstance();
/* 70 */     } catch (Exception exception) {
/* 71 */       throw new RuntimeException(exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 76 */     return Item.as.aQ;
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 80 */     boolean bool = false;
/*    */     
/* 82 */     if (this.b) {
/* 83 */       if (!paramdp.getBlockMaterial(paramInt1, paramInt2 - 1, paramInt3).a()) bool = true;
/*    */     } else {
/* 85 */       int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 86 */       bool = true;
/* 87 */       if (i == 2 && paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3 + 1).a()) bool = false;
/* 88 */       if (i == 3 && paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3 - 1).a()) bool = false;
/* 89 */       if (i == 4 && paramdp.getBlockMaterial(paramInt1 + 1, paramInt2, paramInt3).a()) bool = false;
/* 90 */       if (i == 5 && paramdp.getBlockMaterial(paramInt1 - 1, paramInt2, paramInt3).a()) bool = false;
/*    */     } 
/* 92 */     if (bool) {
/* 93 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 94 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */     
/* 97 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */