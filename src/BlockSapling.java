/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockSapling
/*    */   extends BlockFlower
/*    */ {
/*    */   protected BlockSapling(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2);
/*    */     
/* 12 */     float f = 0.4F;
/* 13 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 17 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramRandom);
/*    */     
/* 19 */     if (paramdp.h(paramInt1, paramInt2 + 1, paramInt3) >= 9 && 
/* 20 */       paramRandom.nextInt(5) == 0) {
/* 21 */       int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 22 */       if (i < 15) {
/* 23 */         paramdp.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */       } else {
/* 25 */         WorldGenBigTree fv = null; paramdp.setBlock(paramInt1, paramInt2, paramInt3, 0);
/* 26 */         hl hl = new hl();
/* 27 */         if (paramRandom.nextInt(10) == 0) {
/* 28 */           fv = new WorldGenBigTree();
/*    */         }
/* 30 */         if (!fv.a(paramdp, paramRandom, paramInt1, paramInt2, paramInt3))
/* 31 */           paramdp.setBlock(paramInt1, paramInt2, paramInt3, this.blockId);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */