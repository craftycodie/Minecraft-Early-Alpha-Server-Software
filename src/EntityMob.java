/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EntityMob
/*    */   extends EntityCreature
/*    */ {
/* 12 */   protected int ae = 2;
/*    */   
/*    */   public EntityMob(World paramdp) {
/* 15 */     super(paramdp);
/* 16 */     this.health = 20;
/*    */   }
/*    */   
/*    */   public void onLivingUpdate() {
/* 20 */     float f = b(1.0F);
/* 21 */     if (f > 0.5F) {
/* 22 */       this.aZ += 2;
/*    */     }
/* 24 */     super.onLivingUpdate();
/*    */   }
/*    */   
/*    */   public void onUpdate() {
/* 28 */     super.onUpdate();
/* 29 */     if (this.worldObj.difficultySetting == 0) setEntityDead();
/*    */   }
/*    */   
/*    */   protected Entity h() {
/* 33 */     EntityPlayer eq = this.worldObj.a(this, 16.0D);
/* 34 */     if (eq != null && g(eq)) return eq; 
/* 35 */     return null;
/*    */   }
/*    */   
/*    */   public boolean attackEntityFrom(Entity paramdb, int paramInt) {
/* 39 */     if (super.attackEntityFrom(paramdb, paramInt)) {
/* 40 */       if (paramdb != this) {
/* 41 */         this.af = paramdb;
/*    */       }
/* 43 */       return true;
/*    */     } 
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   protected void a(Entity paramdb, float paramFloat) {
/* 49 */     if (paramFloat < 2.5D && paramdb.boundingBox.e > this.boundingBox.b && paramdb.boundingBox.b < this.boundingBox.e) {
/* 50 */       this.aQ = 20;
/* 51 */       paramdb.attackEntityFrom(this, this.ae);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 56 */     return 0.5F - this.worldObj.j(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 60 */     super.writeEntityToNBT(paramr);
/*    */   }
/*    */   
/*    */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 64 */     super.readEntityFromNBT(paramr);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 68 */     int i = MathHelper.floor_double(this.posX);
/* 69 */     int j = MathHelper.floor_double(this.boundingBox.b);
/* 70 */     int k = MathHelper.floor_double(this.posZ);
/* 71 */     if (this.worldObj.a(EnumSkyBlock.Sky, i, j, k) > this.Q.nextInt(32)) return false;
/* 72 */     int m = this.worldObj.h(i, j, k);
/* 73 */     return (m <= this.Q.nextInt(8) && super.a());
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */