/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntitySnowball
/*     */   extends Entity
/*     */ {
/*  16 */   private int b = -1;
/*  17 */   private int ac = -1;
/*  18 */   private int ad = -1;
/*  19 */   private int ae = 0;
/*     */   private boolean af = false;
/*  21 */   public int a = 0;
/*     */   private EntityLiving ag;
/*     */   private int ah;
/*  24 */   private int ai = 0;
/*     */   
/*     */   public EntitySnowball(World paramdp) {
/*  27 */     super(paramdp);
/*  28 */     setSize(0.25F, 0.25F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUpdate() {
/*  89 */     super.onUpdate();
/*     */     
/*  91 */     if (this.a > 0) this.a--;
/*     */     
/*  93 */     if (this.af) {
/*     */ 
/*     */ 
/*     */       
/*  97 */       int i = this.worldObj.getBlockId(this.b, this.ac, this.ad);
/*  98 */       if (i != this.ae) {
/*  99 */         this.af = false;
/*     */         
/* 101 */         this.motionX *= (this.Q.nextFloat() * 0.2F);
/* 102 */         this.motionY *= (this.Q.nextFloat() * 0.2F);
/* 103 */         this.motionZ *= (this.Q.nextFloat() * 0.2F);
/* 104 */         this.ah = 0;
/* 105 */         this.ai = 0;
/*     */       } else {
/* 107 */         this.ah++;
/* 108 */         if (this.ah == 1200) setEntityDead();
/*     */         return;
/*     */       } 
/*     */     } else {
/* 112 */       this.ai++;
/*     */     } 
/*     */     
/* 115 */     Vec3D as1 = Vec3D.b(this.posX, this.posY, this.posZ);
/* 116 */     Vec3D as2 = Vec3D.b(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
/* 117 */     fe fe = this.worldObj.a(as1, as2);
/*     */     
/* 119 */     as1 = Vec3D.b(this.posX, this.posY, this.posZ);
/* 120 */     as2 = Vec3D.b(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
/* 121 */     if (fe != null) {
/* 122 */       as2 = Vec3D.b(fe.f.a, fe.f.b, fe.f.c);
/*     */     }
/* 124 */     Entity db1 = null;
/* 125 */     List<Entity> list = this.worldObj.b(this, this.boundingBox.a(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
/* 126 */     double d = 0.0D; byte b;
/* 127 */     for (b = 0; b < list.size(); b++) {
/* 128 */       Entity db2 = list.get(b);
/* 129 */       if (db2.c_() && (db2 != this.ag || this.ai >= 5)) {
/*     */         
/* 131 */         float f = 0.3F;
/* 132 */         AxisAlignedBB cy = db2.boundingBox.expand(f, f, f);
/* 133 */         fe fe1 = cy.a(as1, as2);
/* 134 */         if (fe1 != null) {
/* 135 */           double d1 = as1.a(fe1.f);
/* 136 */           if (d1 < d || d == 0.0D) {
/* 137 */             db1 = db2;
/* 138 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 143 */     if (db1 != null) {
/* 144 */       fe = new fe(db1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     if (fe != null) {
/* 164 */       if (fe.g == null || 
/* 165 */         fe.g.attackEntityFrom(this.ag, 0));
/*     */ 
/*     */ 
/*     */       
/* 169 */       for (b = 0; b < 8; b++)
/* 170 */         this.worldObj.a("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
/* 171 */       setEntityDead();
/*     */     } 
/* 173 */     this.posX += this.motionX;
/* 174 */     this.posY += this.motionY;
/* 175 */     this.posZ += this.motionZ;
/*     */     
/* 177 */     float f1 = MathHelper.a(this.motionX * this.motionX + this.motionZ * this.motionZ);
/* 178 */     this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.1415927410125732D);
/* 179 */     this.rotationPitch = (float)(Math.atan2(this.motionY, f1) * 180.0D / 3.1415927410125732D);
/*     */     
/* 181 */     while (this.rotationPitch - this.t < -180.0F)
/* 182 */       this.t -= 360.0F; 
/* 183 */     while (this.rotationPitch - this.t >= 180.0F) {
/* 184 */       this.t += 360.0F;
/*     */     }
/* 186 */     while (this.rotationYaw - this.s < -180.0F)
/* 187 */       this.s -= 360.0F; 
/* 188 */     while (this.rotationYaw - this.s >= 180.0F) {
/* 189 */       this.s += 360.0F;
/*     */     }
/* 191 */     this.rotationPitch = this.t + (this.rotationPitch - this.t) * 0.2F;
/* 192 */     this.rotationYaw = this.s + (this.rotationYaw - this.s) * 0.2F;
/*     */ 
/*     */     
/* 195 */     float f2 = 0.99F;
/* 196 */     float f3 = 0.03F;
/*     */     
/* 198 */     if (handleWaterMovement()) {
/* 199 */       for (int b1 = 0; b1 < 4; b1++) {
/* 200 */         float f = 0.25F;
/* 201 */         this.worldObj.a("bubble", this.posX - this.motionX * f, this.posY - this.motionY * f, this.posZ - this.motionZ * f, this.motionX, this.motionY, this.motionZ);
/*     */       } 
/* 203 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 206 */     this.motionX *= f2;
/* 207 */     this.motionY *= f2;
/* 208 */     this.motionZ *= f2;
/* 209 */     this.motionY -= f3;
/*     */     
/* 211 */     setPosition(this.posX, this.posY, this.posZ);
/*     */   }
/*     */   
/*     */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 215 */     paramr.setShort("xTile", (short)this.b);
/* 216 */     paramr.setShort("yTile", (short)this.ac);
/* 217 */     paramr.setShort("zTile", (short)this.ad);
/* 218 */     paramr.a("inTile", (byte)this.ae);
/* 219 */     paramr.a("shake", (byte)this.a);
/* 220 */     paramr.a("inGround", (byte)(this.af ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 224 */     this.b = paramr.getShort("xTile");
/* 225 */     this.ac = paramr.getShort("yTile");
/* 226 */     this.ad = paramr.getShort("zTile");
/* 227 */     this.ae = paramr.b("inTile") & 0xFF;
/* 228 */     this.a = paramr.b("shake") & 0xFF;
/* 229 */     this.af = (paramr.b("inGround") == 1);
/*     */   }
/*     */   
/*     */   public void onCollideWithPlayer(EntityPlayer parameq) {
/* 233 */     if (this.af && this.ag == parameq && this.a <= 0 && 
/* 234 */       parameq.inventory.addItemStackToInventory(new ItemStack(Item.j.aQ, 1))) {
/* 235 */       this.worldObj.playSoundAtEntity(this, "random.pop", 0.2F, ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 236 */       parameq.onItemPickup(this, 1);
/* 237 */       setEntityDead();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\av.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */