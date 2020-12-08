/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WorldGenFlowers
/*    */   extends WorldGenerator
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public WorldGenFlowers(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 16 */     for (int b = 0; b < 64; b++) {
/* 17 */       int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 18 */       int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 19 */       int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 20 */       if (paramdp.getBlockId(i, j, k) == 0 && (
/* 21 */         (BlockFlower) Block.blocksList[this.a]).f(paramdp, i, j, k)) {
/* 22 */         paramdp.setBlock(i, j, k, this.a);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 27 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */