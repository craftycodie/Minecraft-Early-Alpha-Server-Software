/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockMobSpawner
/*    */   extends BlockContainer
/*    */ {
/*    */   protected BlockMobSpawner(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2, Material.d);
/*    */   }
/*    */   
/*    */   protected TileEntity a_() {
/* 14 */     return new TileEntityMobSpawner();
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 18 */     return 0;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 26 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */