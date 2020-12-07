/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemRecord
/*    */   extends Item
/*    */ {
/*    */   private String a;
/*    */   
/*    */   protected ItemRecord(int paramInt, String paramString) {
/* 11 */     super(paramInt);
/* 12 */     this.a = paramString;
/* 13 */     this.aR = 1;
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) == Block.aY.blockId && paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) {
/* 18 */       paramdp.b(paramInt1, paramInt2, paramInt3, this.aQ - Item.aO.aQ + 1);
/* 19 */       paramdp.a(this.a, paramInt1, paramInt2, paramInt3);
/* 20 */       paramgc.a--;
/* 21 */       return true;
/*    */     } 
/* 23 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */