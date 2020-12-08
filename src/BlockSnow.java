/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockSnow
/*    */   extends Block
/*    */ {
/*    */   protected BlockSnow(int paramInt1, int paramInt2) {
/* 13 */     super(paramInt1, paramInt2, Material.s);
/* 14 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/* 15 */     a(true);
/*    */   }
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 19 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 27 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 35 */     return paramdp.getBlockMaterial(paramInt1, paramInt2 - 1, paramInt3).c();
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 39 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 43 */     if (!a(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 44 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 45 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/* 46 */       return false;
/*    */     } 
/* 48 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 64 */     return Item.aB.aQ;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 68 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 72 */     if (paramdp.a(EnumSkyBlock.Block, paramInt1, paramInt2, paramInt3) > 11) {
/* 73 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 74 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 79 */     Material hz = paramhb.getBlockMaterial(paramInt1, paramInt2, paramInt3);
/* 80 */     if (paramInt4 == 1) return true; 
/* 81 */     if (hz == this.blockMaterial) return false;
/* 82 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */