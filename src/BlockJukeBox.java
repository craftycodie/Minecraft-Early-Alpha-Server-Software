/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockJukeBox
/*    */   extends Block
/*    */ {
/*    */   protected BlockJukeBox(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, Material.c);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 15 */     return this.aZ + ((paramInt == 1) ? 1 : 0);
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 19 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 20 */     if (i > 0) {
/* 21 */       f(paramdp, paramInt1, paramInt2, paramInt3, i);
/* 22 */       return true;
/*    */     } 
/* 24 */     return false;
/*    */   }
/*    */   
/*    */   public void f(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 28 */     paramdp.a((String)null, paramInt1, paramInt2, paramInt3);
/* 29 */     paramdp.b(paramInt1, paramInt2, paramInt3, 0);
/* 30 */     int i = Item.aO.aQ + paramInt4 - 1;
/* 31 */     float f = 0.7F;
/* 32 */     double d1 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 33 */     double d2 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.2D + 0.6D;
/* 34 */     double d3 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 35 */     EntityItem fa = new EntityItem(paramdp, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, new ItemStack(i));
/* 36 */     fa.delayBeforeCanPickup = 10;
/* 37 */     paramdp.a(fa);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
            if (paramInt4 > 0) {
/* 43 */       f(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */     }
/* 45 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */