/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockReed
/*    */   extends Block
/*    */ {
/*    */   protected BlockReed(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, Material.i);
/* 13 */     this.aZ = paramInt2;
/* 14 */     float f = 0.375F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/* 16 */     a(true);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 20 */     if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) == 0) {
/* 21 */       int b = 1;
/* 22 */       while (paramdp.getBlockId(paramInt1, paramInt2 - b, paramInt3) == this.blockId) {
/* 23 */         b++;
/*    */       }
/* 25 */       if (b < 3) {
/* 26 */         int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 27 */         if (i == 15) {
/* 28 */           paramdp.setBlockWithNotify(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/* 29 */           paramdp.b(paramInt1, paramInt2, paramInt3, 0);
/*    */         } else {
/* 31 */           paramdp.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 38 */     int i = paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3);
/* 39 */     if (i == this.blockId) return true;
/* 40 */     if (i != Block.u.blockId && i != Block.v.blockId) return false;
/* 41 */     if (paramdp.getBlockMaterial(paramInt1 - 1, paramInt2 - 1, paramInt3) == Material.f) return true;
/* 42 */     if (paramdp.getBlockMaterial(paramInt1 + 1, paramInt2 - 1, paramInt3) == Material.f) return true;
/* 43 */     if (paramdp.getBlockMaterial(paramInt1, paramInt2 - 1, paramInt3 - 1) == Material.f) return true;
/* 44 */     if (paramdp.getBlockMaterial(paramInt1, paramInt2 - 1, paramInt3 + 1) == Material.f) return true;
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 49 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected final void g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 53 */     if (!f(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 54 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 55 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean f(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 60 */     return a(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 64 */     return null;
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 68 */     return Item.aH.aQ;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 76 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a() {
/* 84 */     return 1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ca.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */