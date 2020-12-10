/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemRedstone
/*    */   extends Item
/*    */ {
/*    */   public ItemRedstone(int paramInt) {
/*  9 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 13 */     if (paramInt4 == 0) paramInt2--; 
/* 14 */     if (paramInt4 == 1) paramInt2++; 
/* 15 */     if (paramInt4 == 2) paramInt3--; 
/* 16 */     if (paramInt4 == 3) paramInt3++; 
/* 17 */     if (paramInt4 == 4) paramInt1--; 
/* 18 */     if (paramInt4 == 5) paramInt1++; 
/* 19 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != 0) return false;
/* 20 */     if (Block.av.a(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 21 */       paramgc.stackSize--;
/* 22 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.av.blockId);
/*    */     } 
/*    */     
/* 25 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */