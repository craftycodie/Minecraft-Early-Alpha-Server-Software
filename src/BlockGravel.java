/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockGravel
/*    */   extends BlockSand
/*    */ {
/*    */   public BlockGravel(int paramInt1, int paramInt2) {
/*  9 */     super(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 13 */     if (paramRandom.nextInt(10) == 0) return Item.an.aQ;
/* 14 */     return this.blockId;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundStoneFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */