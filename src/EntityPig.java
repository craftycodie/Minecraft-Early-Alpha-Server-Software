/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityPig
/*    */   extends EntityAnimal
/*    */ {
/*    */   public boolean a = false;
/*    */   
/*    */   public EntityPig(World paramdp) {
/* 13 */     super(paramdp);
/* 14 */     this.aB = "/mob/pig.png";
/* 15 */     setSize(0.9F, 0.9F);
/*    */     
/* 17 */     this.a = false;
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 21 */     super.writeEntityToNBT(paramr);
/* 22 */     paramr.a("Saddle", this.a);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 26 */     super.readEntityFromNBT(paramr);
/* 27 */     this.a = paramr.getBoolean("Saddle");
/*    */   }
/*    */   
/*    */   protected String c() {
/* 31 */     return "mob.pig";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 35 */     return "mob.pig";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 39 */     return "mob.pigdeath";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int g() {
/* 51 */     return Item.ao.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */