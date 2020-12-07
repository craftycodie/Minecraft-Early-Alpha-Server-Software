/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockStationary
/*    */   extends cg
/*    */ {
/*    */   protected BlockStationary(int paramInt, Material paramhz) {
/* 10 */     super(paramInt, paramhz);
/*    */     
/* 12 */     a(false);
/* 13 */     if (paramhz == Material.g) a(true);
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 22 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) == this.blockId) {
/* 23 */       i(paramdp, paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   private void i(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 28 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 29 */     paramdp.g = true;
/* 30 */     paramdp.a(paramInt1, paramInt2, paramInt3, this.blockId - 1, i);
/* 31 */     paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/* 32 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId - 1);
/* 33 */     paramdp.g = false;
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 37 */     if (this.blockMaterial == Material.g) {
/* 38 */       int i = paramRandom.nextInt(3);
/* 39 */       for (int b = 0; b < i; b++) {
/* 40 */         paramInt1 += paramRandom.nextInt(3) - 1;
/* 41 */         paramInt2++;
/* 42 */         paramInt3 += paramRandom.nextInt(3) - 1;
/* 43 */         int j = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 44 */         if (j == 0) {
/* 45 */           if (j(paramdp, paramInt1 - 1, paramInt2, paramInt3) || j(paramdp, paramInt1 + 1, paramInt2, paramInt3) || j(paramdp, paramInt1, paramInt2, paramInt3 - 1) || j(paramdp, paramInt1, paramInt2, paramInt3 + 1) || j(paramdp, paramInt1, paramInt2 - 1, paramInt3) || j(paramdp, paramInt1, paramInt2 + 1, paramInt3)) {
/* 46 */             paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.ar.blockId);
/*    */             return;
/*    */           } 
/* 49 */         } else if ((Block.blocksList[j]).blockMaterial.c()) {
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean j(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 58 */     return paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3).e();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */