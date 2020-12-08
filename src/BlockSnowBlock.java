/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockSnowBlock
/*    */   extends Block
/*    */ {
/*    */   protected BlockSnowBlock(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, Material.t);
/* 12 */     a(true);
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 16 */     return Item.aB.aQ;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 20 */     return 4;
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 24 */     if (paramdp.a(EnumSkyBlock.Block, paramInt1, paramInt2, paramInt3) > 11) {
/* 25 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 26 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */