/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityCow
/*    */   extends EntityAnimal
/*    */ {
/*    */   public boolean a = false;
/*    */   
/*    */   public EntityCow(World paramdp) {
/* 13 */     super(paramdp);
/* 14 */     this.aB = "/mob/cow.png";
/* 15 */     setSize(0.9F, 1.3F);
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 19 */     super.writeEntityToNBT(paramr);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 23 */     super.readEntityFromNBT(paramr);
/*    */   }
/*    */   
/*    */   protected String c() {
/* 27 */     return "mob.cow";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 31 */     return "mob.cowhurt";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 35 */     return "mob.cowhurt";
/*    */   }
/*    */   
/*    */   protected float f() {
/* 39 */     return 0.4F;
/*    */   }
/*    */   
/*    */   protected int g() {
/* 43 */     return Item.aD.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\au.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */