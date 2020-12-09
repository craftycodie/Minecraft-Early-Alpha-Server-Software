/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityZombie
/*    */   extends EntityMob
/*    */ {
/*    */   public EntityZombie(World paramdp) {
/*  9 */     super(paramdp);
/* 10 */     this.aB = "/mob/zombie.png";
/* 11 */     this.bf = 0.5F;
/* 12 */     this.ae = 5;
/*    */   }
/*    */   
/*    */   public void onLivingUpdate() {
/* 16 */     if (this.worldObj.a()) {
/* 17 */       float f = b(1.0F);
/* 18 */       if (f > 0.5F && 
/* 19 */         this.worldObj.g(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.Q.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/* 20 */         this.T = 300;
/*    */       }
/*    */     } 
/*    */     
/* 24 */     super.onLivingUpdate();
/*    */   }
/*    */   
/*    */   protected String c() {
/* 28 */     return "mob.zombie";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 32 */     return "mob.zombiehurt";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 36 */     return "mob.zombiedeath";
/*    */   }
/*    */   
/*    */   protected int g() {
/* 40 */     return Item.J.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ez.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */