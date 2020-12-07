/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockSponge
/*    */   extends Block
/*    */ {
/*    */   protected BlockSponge(int paramInt) {
/* 12 */     super(paramInt, Material.j);
/* 13 */     this.aZ = 48;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 18 */     int b = 2;
/* 19 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 20 */       for (int j = paramInt2 - b; j <= paramInt2 + b; j++) {
/* 21 */         for (int k = paramInt3 - b; k <= paramInt3 + b; k++) {
/*    */           
/* 23 */           if (paramdp.getBlockMaterial(i, j, k) == Material.f);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 32 */     int b = 2;
/* 33 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 34 */       for (int j = paramInt2 - b; j <= paramInt2 + b; j++) {
/* 35 */         for (int k = paramInt3 - b; k <= paramInt3 + b; k++)
/*    */         {
/* 37 */           paramdp.g(i, j, k, paramdp.getBlockId(i, j, k));
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */