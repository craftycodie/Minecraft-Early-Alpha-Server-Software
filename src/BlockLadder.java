/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockLadder
/*    */   extends Block
/*    */ {
/*    */   protected BlockLadder(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, Material.n);
/*    */   }
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 15 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 16 */     float f = 0.125F;
/*    */     
/* 18 */     if (i == 2) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
/* 19 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
/* 20 */     if (i == 4) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 21 */     if (i == 5) a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*    */     
/* 23 */     return super.d(paramdp, paramInt1, paramInt2, paramInt3);
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 43 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a() {
/* 51 */     return 8;
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 55 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3))
/* 56 */       return true; 
/* 57 */     if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3))
/* 58 */       return true; 
/* 59 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1))
/* 60 */       return true; 
/* 61 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) {
/* 62 */       return true;
/*    */     }
/* 64 */     return false;
/*    */   }
/*    */   
/*    */   public void c(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 68 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*    */     
/* 70 */     if ((i == 0 || paramInt4 == 2) && paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) i = 2; 
/* 71 */     if ((i == 0 || paramInt4 == 3) && paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/* 72 */     if ((i == 0 || paramInt4 == 4) && paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) i = 4; 
/* 73 */     if ((i == 0 || paramInt4 == 5) && paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) i = 5;
/*    */     
/* 75 */     paramdp.b(paramInt1, paramInt2, paramInt3, i);
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 79 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 80 */     boolean bool = false;
/*    */     
/* 82 */     if (i == 2 && paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) bool = true; 
/* 83 */     if (i == 3 && paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) bool = true; 
/* 84 */     if (i == 4 && paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) bool = true; 
/* 85 */     if (i == 5 && paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) bool = true; 
/* 86 */     if (!bool) {
/* 87 */       a_(paramdp, paramInt1, paramInt2, paramInt3, i);
/* 88 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */     
/* 91 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 95 */     return 1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */