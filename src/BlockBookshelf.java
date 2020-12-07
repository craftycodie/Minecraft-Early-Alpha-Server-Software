/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockBookshelf
/*    */   extends Block
/*    */ {
/*    */   public BlockBookshelf(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, Material.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt) {
/* 16 */     if (paramInt <= 1) return 4; 
/* 17 */     return this.aZ;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random paramRandom) {
/* 22 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ew.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */