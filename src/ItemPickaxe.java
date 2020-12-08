/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemPickaxe
/*    */   extends ItemTool
/*    */ {
/*  7 */   private static Block[] aV = new Block[] { Block.w, Block.aj, Block.ak, Block.stone, Block.ao, Block.H, Block.ai, Block.I, Block.ah, Block.G, Block.aw, Block.ax, Block.aT };
/*    */   
/*    */   private int aW;
/*    */   
/*    */   public ItemPickaxe(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, 2, paramInt2, aV);
/* 13 */     this.aW = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(Block paramet) {
/* 17 */     if (paramet == Block.ap) return (this.aW == 3);
/* 18 */     if (paramet == Block.ax || paramet == Block.aw) return (this.aW >= 2);
/* 19 */     if (paramet == Block.ah || paramet == Block.G) return (this.aW >= 2);
/* 20 */     if (paramet == Block.ai || paramet == Block.H) return (this.aW >= 1);
/* 21 */     if (paramet == Block.aN || paramet == Block.aO) return (this.aW >= 2);
/* 22 */     if (paramet.blockMaterial == Material.d) return true;
/* 23 */     if (paramet.blockMaterial == Material.e) return true;
/* 24 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */