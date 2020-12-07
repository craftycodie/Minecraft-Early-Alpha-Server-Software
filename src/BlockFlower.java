/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockFlower
/*    */   extends Block
/*    */ {
/*    */   protected BlockFlower(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, Material.i);
/* 12 */     this.aZ = paramInt2;
/* 13 */     a(true);
/* 14 */     float f = 0.2F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 19 */     return b(paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3));
/*    */   }
/*    */   
/*    */   protected boolean b(int paramInt) {
/* 23 */     return (paramInt == Block.u.blockId || paramInt == Block.v.blockId || paramInt == Block.aA.blockId);
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 27 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 28 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 32 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected final void g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 36 */     if (!f(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 37 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 38 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean f(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 43 */     return ((paramdp.h(paramInt1, paramInt2, paramInt3) >= 8 || paramdp.g(paramInt1, paramInt2, paramInt3)) && b(paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3)));
/*    */   }
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 47 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 55 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a() {
/* 63 */     return 1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */