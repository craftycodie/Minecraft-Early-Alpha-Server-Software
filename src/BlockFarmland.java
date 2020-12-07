/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockFarmland
/*    */   extends Block
/*    */ {
/*    */   protected BlockFarmland(int paramInt) {
/* 12 */     super(paramInt, Material.b);
/* 13 */     this.aZ = 87;
/* 14 */     a(true);
/* 15 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
/* 16 */     c(255);
/*    */   }
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 20 */     return AxisAlignedBB.b((paramInt1 + 0), (paramInt2 + 0), (paramInt3 + 0), (paramInt1 + 1), (paramInt2 + 1), (paramInt3 + 1));
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 24 */     return false;
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
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 38 */     if (paramRandom.nextInt(5) == 0) {
/* 39 */       if (h(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 40 */         paramdp.b(paramInt1, paramInt2, paramInt3, 7);
/*    */       } else {
/* 42 */         int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 43 */         if (i > 0) {
/* 44 */           paramdp.b(paramInt1, paramInt2, paramInt3, i - 1);
/*    */         }
/* 46 */         else if (!g(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 47 */           paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.v.blockId);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb) {
/* 55 */     if (paramdp.k.nextInt(4) == 0) {
/* 56 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.v.blockId);
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 61 */     int b = 0;
/* 62 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 63 */       for (int j = paramInt3 - b; j <= paramInt3 + b; j++) {
/* 64 */         if (paramdp.getBlockId(i, paramInt2 + 1, j) == Block.az.blockId)
/* 65 */           return true; 
/*    */       } 
/*    */     } 
/* 68 */     return false;
/*    */   }
/*    */   
/*    */   private boolean h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 72 */     for (int i = paramInt1 - 4; i <= paramInt1 + 4; i++) {
/* 73 */       for (int j = paramInt2; j <= paramInt2 + 1; j++) {
/* 74 */         for (int k = paramInt3 - 4; k <= paramInt3 + 4; k++) {
/* 75 */           if (paramdp.getBlockMaterial(i, j, k) == Material.f)
/* 76 */             return true; 
/*    */         } 
/*    */       } 
/* 79 */     }  return false;
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 83 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 84 */     Material hz = paramdp.getBlockMaterial(paramInt1, paramInt2 + 1, paramInt3);
/* 85 */     if (hz.a()) {
/* 86 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.v.blockId);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 95 */     return Block.v.a(0, paramRandom);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */