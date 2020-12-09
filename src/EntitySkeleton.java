/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntitySkeleton
/*    */   extends EntityMob
/*    */ {
/*    */   public EntitySkeleton(World paramdp) {
/* 14 */     super(paramdp);
/* 15 */     this.aB = "/mob/skeleton.png";
/*    */   }
/*    */ 
/*    */   
/*    */   protected String c() {
/* 20 */     return "mob.skeleton";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 24 */     return "mob.skeletonhurt";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 28 */     return "mob.skeletonhurt";
/*    */   }
/*    */ 
/*    */   
/*    */   public void onLivingUpdate() {
/* 33 */     if (this.worldObj.a()) {
/* 34 */       float f = b(1.0F);
/* 35 */       if (f > 0.5F && 
/* 36 */         this.worldObj.g(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.Q.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/* 37 */         this.T = 300;
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 42 */     super.onLivingUpdate();
/*    */   }
/*    */   
/*    */   protected void a(Entity paramdb, float paramFloat) {
/* 46 */     if (paramFloat < 10.0F) {
/* 47 */       double d1 = paramdb.posX - this.posX;
/* 48 */       double d2 = paramdb.posZ - this.posZ;
/*    */       
/* 50 */       if (this.aQ == 0) {
/* 51 */         EntityArrow da = new EntityArrow(this.worldObj, this);
/* 52 */         da.posY += 1.399999976158142D;
/*    */         
/* 54 */         double d = paramdb.posY - 0.20000000298023224D - da.posY;
/*    */         
/* 56 */         float f = MathHelper.sqrt_double(d1 * d1 + d2 * d2) * 0.2F;
/*    */         
/* 58 */         this.worldObj.playSoundAtEntity(this, "random.bow", 1.0F, 1.0F / (this.Q.nextFloat() * 0.4F + 0.8F));
/* 59 */         this.worldObj.a(da);
/* 60 */         da.a(d1, d + f, d2, 0.6F, 12.0F);
/* 61 */         this.aQ = 30;
/*    */       } 
/* 63 */       this.rotationYaw = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/*    */       
/* 65 */       this.ag = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 70 */     super.writeEntityToNBT(paramr);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 74 */     super.readEntityFromNBT(paramr);
/*    */   }
/*    */   
/*    */   protected int g() {
/* 78 */     return Item.j.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */