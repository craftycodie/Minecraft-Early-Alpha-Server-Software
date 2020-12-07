/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cc
/*    */   extends Item
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public cc(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1);
/* 12 */     this.a = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 16 */     if (paramInt4 != 1) return false;
/*    */     
/* 18 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/*    */     
/* 20 */     if (i == Block.aA.blockId) {
/* 21 */       paramdp.setBlockWithNotify(paramInt1, paramInt2 + 1, paramInt3, this.a);
/* 22 */       paramgc.a--;
/* 23 */       return true;
/*    */     } 
/* 25 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */