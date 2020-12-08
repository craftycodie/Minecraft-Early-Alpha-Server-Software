/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemHoe
/*    */   extends Item
/*    */ {
/*    */   public ItemHoe(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1);
/* 12 */     this.maxStackSize = 1;
/* 13 */     this.aS = 32 << paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 18 */     Material hz = paramdp.getBlockMaterial(paramInt1, paramInt2 + 1, paramInt3);
/*    */     
/* 20 */     if ((!hz.a() && i == Block.u.blockId) || i == Block.v.blockId) {
/* 21 */       Block et = Block.aA;
/* 22 */       paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), et.bj.c(), (et.bj.a() + 1.0F) / 2.0F, et.bj.b() * 0.8F);
/* 23 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, et.blockId);
/* 24 */       paramgc.a(1);
/*    */       
/* 26 */       if (paramdp.k.nextInt(8) == 0 && i == et.u.blockId) {
/* 27 */         int b1 = 1;
/* 28 */         for (int b2 = 0; b2 < b1; b2++) {
/* 29 */           float f1 = 0.7F;
/* 30 */           float f2 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/* 31 */           float f3 = 1.2F;
/* 32 */           float f4 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/* 33 */           EntityItem fa = new EntityItem(paramdp, (paramInt1 + f2), (paramInt2 + f3), (paramInt3 + f4), new ItemStack(Item.Q));
/* 34 */           fa.delayBeforeCanPickup = 10;
/* 35 */           paramdp.a(fa);
/*    */         } 
/*    */       } 
/*    */       
/* 39 */       return true;
/*    */     } 
/*    */     
/* 42 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */