/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntitySheep
/*    */   extends EntityAnimal
/*    */ {
/*    */   public boolean a = false;
/*    */   
/*    */   public EntitySheep(World paramdp) {
/* 14 */     super(paramdp);
/* 15 */     this.aB = "/mob/sheep.png";
/* 16 */     setSize(0.9F, 1.3F);
/*    */   }
/*    */   
/*    */   public boolean attackEntityFrom(Entity paramdb, int paramInt) {
/* 20 */     if (!this.a && paramdb instanceof EntityLiving) {
/* 21 */       this.a = true;
/* 22 */       int i = 1 + this.Q.nextInt(3);
/* 23 */       for (int b = 0; b < i; b++) {
/* 24 */         EntityItem fa = a(Block.ab.blockId, 1, 1.0F);
/* 25 */         fa.motionY += (this.Q.nextFloat() * 0.05F);
/* 26 */         fa.motionX += ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.1F);
/* 27 */         fa.motionZ += ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.1F);
/*    */       } 
/*    */     } 
/* 30 */     return super.attackEntityFrom(paramdb, paramInt);
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 34 */     super.writeEntityToNBT(paramr);
/* 35 */     paramr.a("Sheared", this.a);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 39 */     super.readEntityFromNBT(paramr);
/* 40 */     this.a = paramr.getBoolean("Sheared");
/*    */   }
/*    */   
/*    */   protected String c() {
/* 44 */     return "mob.sheep";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 48 */     return "mob.sheep";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 52 */     return "mob.sheep";
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */