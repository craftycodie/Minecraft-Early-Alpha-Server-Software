/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class BlockContainer
/*    */   extends Block
/*    */ {
/*    */   protected BlockContainer(int paramInt, Material paramhz) {
/*  9 */     super(paramInt, paramhz);
/*    */   }
/*    */   
/*    */   protected BlockContainer(int paramInt1, int paramInt2, Material paramhz) {
/* 13 */     super(paramInt1, paramInt2, paramhz);
/*    */   }
/*    */   
/*    */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     super.onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/* 18 */     paramdp.a(paramInt1, paramInt2, paramInt3, a_());
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 22 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/* 23 */     paramdp.l(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected abstract TileEntity a_();
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */