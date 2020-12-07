/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockOre
/*    */   extends Block
/*    */ {
/*    */   public BlockOre(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2, Material.d);
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 14 */     if (this.blockId == Block.I.blockId) return Item.k.aQ;
/* 15 */     if (this.blockId == Block.aw.blockId) return Item.l.aQ;
/* 16 */     return this.blockId;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 20 */     return 1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundWoodFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */