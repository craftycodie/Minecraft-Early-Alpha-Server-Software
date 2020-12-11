/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemReed
/*    */   extends Item
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public ItemReed(int paramInt, Block paramet) {
/* 11 */     super(paramInt);
/* 12 */     this.a = paramet.blockId;
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 16 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) == Block.aS.blockId) {
/* 17 */       paramInt4 = 0;
/*    */     } else {
/* 19 */       if (paramInt4 == 0) paramInt2--; 
/* 20 */       if (paramInt4 == 1) paramInt2++; 
/* 21 */       if (paramInt4 == 2) paramInt3--; 
/* 22 */       if (paramInt4 == 3) paramInt3++; 
/* 23 */       if (paramInt4 == 4) paramInt1--; 
/* 24 */       if (paramInt4 == 5) paramInt1++;
/*    */     
/*    */     } 
/* 27 */     if (paramgc.b == 0) return false;
/*    */ 
/*    */     
/* 30 */     if (paramdp.a(this.a, paramInt1, paramInt2, paramInt3, false)) {
/* 31 */       Block et = Block.blocksList[this.a];
/* 32 */       if (paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, this.a)) {
/* 33 */         et.blocksList[this.a].c(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 34 */         paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), et.bj.c(), (et.bj.a() + 1.0F) / 2.0F, et.bj.b() * 0.8F);
/* 35 */         paramgc.stackSize--;
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ie.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */