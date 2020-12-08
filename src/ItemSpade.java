/*    */ 
/*    */ 
/*    */ public class ItemSpade
/*    */   extends ItemTool
/*    */ {
/*  6 */   private static Block[] aV = new Block[] { Block.u, Block.v, Block.E, Block.F, Block.aS, Block.aU };
/*    */   
/*    */   public ItemSpade(int paramInt1, int paramInt2) {
/*  9 */     super(paramInt1, 1, paramInt2, aV);
/*    */   }
/*    */   
/*    */   public boolean a(Block paramet) {
/* 13 */     if (paramet == Block.aS) return true;
/* 14 */     if (paramet == Block.aU) return true;
/* 15 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */