/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class EntityAnimal
/*    */   extends EntityCreature
/*    */ {
/*    */   public EntityAnimal(World paramdp) {
/* 13 */     super(paramdp);
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     if (this.worldObj.getBlockId(paramInt1, paramInt2 - 1, paramInt3) == Block.u.blockId) return 10.0F;
/* 18 */     return this.worldObj.j(paramInt1, paramInt2, paramInt3) - 0.5F;
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 22 */     super.writeEntityToNBT(paramr);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 26 */     super.readEntityFromNBT(paramr);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 30 */     int i = MathHelper.floor_double(this.posX);
/* 31 */     int j = MathHelper.floor_double(this.boundingBox.b);
/* 32 */     int k = MathHelper.floor_double(this.posZ);
/* 33 */     return (this.worldObj.getBlockId(i, j - 1, k) == Block.u.blockId && this.worldObj.h(i, j, k) > 8 && super.a());
/*    */   }
/*    */   
/*    */   public int b() {
/* 37 */     return 120;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */