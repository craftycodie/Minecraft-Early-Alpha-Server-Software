/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemPainting
/*    */   extends Item
/*    */ {
/*    */   public ItemPainting(int paramInt) {
/*  9 */     super(paramInt);
/* 10 */     this.aS = 64;
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 14 */     if (paramInt4 == 0) return false; 
/* 15 */     if (paramInt4 == 1) return false;
/*    */     
/* 17 */     int b = 0;
/* 18 */     if (paramInt4 == 4) b = 1; 
/* 19 */     if (paramInt4 == 3) b = 2; 
/* 20 */     if (paramInt4 == 5) b = 3;
/*    */     
/* 22 */     EntityPainting bp = new EntityPainting(paramdp, paramInt1, paramInt2, paramInt3, b);
/* 23 */     if (bp.b()) {
/* 24 */       paramdp.a(bp);
/* 25 */       paramgc.itemID--;
/*    */     } 
/* 27 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ht.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */