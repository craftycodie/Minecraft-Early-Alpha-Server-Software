/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fd
/*    */   extends Item
/*    */ {
/*    */   public fd(int paramInt) {
/* 11 */     super(paramInt);
/* 12 */     this.aS = 64;
/* 13 */     this.aR = 1;
/*    */   }
/*    */   
/*    */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     if (paramInt4 == 0) return false; 
/* 18 */     if (!paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3).a()) return false;
/*    */ 
/*    */     
/* 21 */     if (paramInt4 == 1) paramInt2++;
/*    */     
/* 23 */     if (paramInt4 == 2) paramInt3--; 
/* 24 */     if (paramInt4 == 3) paramInt3++; 
/* 25 */     if (paramInt4 == 4) paramInt1--; 
/* 26 */     if (paramInt4 == 5) paramInt1++;
/*    */     
/* 28 */     if (!Block.aD.a(paramdp, paramInt1, paramInt2, paramInt3)) return false;
/*    */ 
/*    */     
/* 31 */     if (paramInt4 == 1) {
/* 32 */       paramdp.b(paramInt1, paramInt2, paramInt3, Block.aD.blockId, MathHelper.floor_double(((parameq.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 0xF);
/*    */     } else {
/* 34 */       paramdp.b(paramInt1, paramInt2, paramInt3, Block.aI.blockId, paramInt4);
/*    */     } 
/*    */     
/* 37 */     paramgc.a--;
/* 38 */     parameq.a((TileEntitySign)paramdp.k(paramInt1, paramInt2, paramInt3));
/* 39 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */