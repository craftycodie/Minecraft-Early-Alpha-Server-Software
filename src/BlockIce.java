/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockIce
/*    */   extends gk
/*    */ {
/*    */   public BlockIce(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2, Material.r, false);
/* 11 */     this.bm = 0.98F;
/* 12 */     a(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 20 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, 1 - paramInt4);
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 24 */     Material hz = paramdp.getBlockMaterial(paramInt1, paramInt2 - 1, paramInt3);
/* 25 */     if (hz.c() || hz.d()) {
/* 26 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.A.blockId);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 31 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 35 */     if (paramdp.a(EnumSkyBlock.Block, paramInt1, paramInt2, paramInt3) > 11 - Block.lightOpacity[this.blockId]) {
/* 36 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 37 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.B.blockId);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundSandFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */