/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntitySpider
/*    */   extends EntityMob
/*    */ {
/*    */   public EntitySpider(World paramdp) {
/* 13 */     super(paramdp);
/* 14 */     this.aB = "/mob/spider.png";
/* 15 */     setSize(1.4F, 0.9F);
/* 16 */     this.bf = 0.8F;
/*    */   }
/*    */   
/*    */   protected Entity h() {
/* 20 */     float f = b(1.0F);
/* 21 */     if (f < 0.5F) {
/* 22 */       double d = 16.0D;
/* 23 */       return this.worldObj.a(this, d);
/*    */     } 
/* 25 */     return null;
/*    */   }
/*    */   
/*    */   protected String c() {
/* 29 */     return "mob.spider";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 33 */     return "mob.spider";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 37 */     return "mob.spiderdeath";
/*    */   }
/*    */   
/*    */   protected void a(Entity paramdb, float paramFloat) {
/* 41 */     float f = b(1.0F);
/* 42 */     if (f > 0.5F && this.Q.nextInt(100) == 0) {
/* 43 */       this.af = null;
/*    */       
/*    */       return;
/*    */     } 
/* 47 */     if (paramFloat > 2.0F && paramFloat < 6.0F && this.Q.nextInt(10) == 0) {
/* 48 */       if (this.v) {
/* 49 */         double d1 = paramdb.posX - this.posX;
/* 50 */         double d2 = paramdb.posZ - this.posZ;
/* 51 */         float f1 = MathHelper.a(d1 * d1 + d2 * d2);
/* 52 */         this.motionX = d1 / f1 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
/* 53 */         this.motionZ = d2 / f1 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
/* 54 */         this.motionY = 0.4000000059604645D;
/*    */       } 
/*    */     } else {
/* 57 */       super.a(paramdb, paramFloat);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 62 */     super.writeEntityToNBT(paramr);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 66 */     super.readEntityFromNBT(paramr);
/*    */   }
/*    */   
/*    */   protected int g() {
/* 70 */     return Item.I.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */