/*    */ 
/*    */ 
/*    */ 
/*    */ public class gk
/*    */   extends Block
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   protected gk(int paramInt1, int paramInt2, Material paramhz, boolean paramBoolean) {
/* 10 */     super(paramInt1, paramInt2, paramhz);
/* 11 */     this.a = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 15 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 19 */     int i = paramhb.getBlockId(paramInt1, paramInt2, paramInt3);
/* 20 */     if (!this.a && i == this.blockId) return false;
/* 21 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */