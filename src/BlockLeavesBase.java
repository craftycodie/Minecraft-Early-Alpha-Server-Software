/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockLeavesBase
/*    */   extends Block
/*    */ {
/*    */   protected boolean a;
/*    */   
/*    */   protected BlockLeavesBase(int paramInt1, int paramInt2, Material paramhz, boolean paramBoolean) {
/* 12 */     super(paramInt1, paramInt2, paramhz);
/* 13 */     this.a = paramBoolean;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 18 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 23 */     int i = paramhb.getBlockId(paramInt1, paramInt2, paramInt3);
/* 24 */     if (!this.a && i == this.blockId) return false;
/* 25 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\tickOnLoad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */