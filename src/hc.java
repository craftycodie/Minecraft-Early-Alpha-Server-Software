/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hc
/*    */   extends WorldGenerator
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public hc(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 16 */     if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) != Block.stone.blockId) return false;
/* 17 */     if (paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3) != Block.stone.blockId) return false;
/* 18 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != 0 && paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != Block.stone.blockId) return false;
/*    */     
/* 20 */     int b1 = 0;
/* 21 */     if (paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3) == Block.stone.blockId) b1++;
/* 22 */     if (paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3) == Block.stone.blockId) b1++;
/* 23 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1) == Block.stone.blockId) b1++;
/* 24 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1) == Block.stone.blockId) b1++;
/*    */     
/* 26 */     int b2 = 0;
/* 27 */     if (paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3) == 0) b2++;
/* 28 */     if (paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3) == 0) b2++;
/* 29 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1) == 0) b2++;
/* 30 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1) == 0) b2++;
/*    */     
/* 32 */     if (b1 == 3 && b2 == 1) {
/* 33 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, this.a);
/*    */     }
/*    */     
/* 36 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */