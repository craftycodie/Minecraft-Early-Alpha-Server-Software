/*    */ 
/*    */ 
/*    */ public class dx
/*    */   extends BlockFlower
/*    */ {
/*    */   protected dx(int paramInt1, int paramInt2) {
/*  7 */     super(paramInt1, paramInt2);
/*  8 */     float f = 0.2F;
/*  9 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   protected boolean b(int paramInt) {
/* 13 */     return Block.opaqueCubeLookup[paramInt];
/*    */   }
/*    */   
/*    */   public boolean f(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     return (paramdp.h(paramInt1, paramInt2, paramInt3) <= 13 && b(paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3)));
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */