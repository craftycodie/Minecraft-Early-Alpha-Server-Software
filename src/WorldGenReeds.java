/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WorldGenReeds
/*    */   extends WorldGenerator
/*    */ {
/*    */   public boolean a(World paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 11 */     for (int b = 0; b < 20; b++) {
/* 12 */       int i = paramInt1 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 13 */       int j = paramInt2;
/* 14 */       int k = paramInt3 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 15 */       if (paramdp.getBlockId(i, j, k) == 0 && (
/* 16 */         paramdp.getBlockMaterial(i - 1, j - 1, k) == Material.f || paramdp.getBlockMaterial(i + 1, j - 1, k) == Material.f || paramdp.getBlockMaterial(i, j - 1, k - 1) == Material.f || paramdp.getBlockMaterial(i, j - 1, k + 1) == Material.f)) {
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 21 */         int m = 2 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 22 */         for (int b1 = 0; b1 < m; b1++) {
/* 23 */           if (Block.aX.f(paramdp, i, j + b1, k)) {
/* 24 */             paramdp.setBlock(i, j + b1, k, Block.aX.blockId);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */