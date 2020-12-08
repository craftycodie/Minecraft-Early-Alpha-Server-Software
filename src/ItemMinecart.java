/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemMinecart
/*    */   extends Item
/*    */ {
/*    */   public int a;
/*    */   
/*    */   public ItemMinecart(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1);
/* 13 */     this.maxStackSize = 1;
/* 14 */     this.a = paramInt2;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 20 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/*    */     
/* 22 */     if (i == Block.aG.blockId) {
/* 23 */       paramdp.a(new EntityMinecart(paramdp, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), this.a));
/* 24 */       paramgc.itemID--;
/* 25 */       return true;
/*    */     } 
/* 27 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ce.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */