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
/*     */ public class EntityArrow
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
/*     */   public EntityArrow(World paramdp) {
/*  27 */     super(paramdp);
/*  28 */     setSize(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public EntityArrow(World paramdp, EntityLiving paramic) {
/*  32 */     super(paramdp);
/*  33 */     this.ag = paramic;
/*     */     
/*  35 */     setSize(0.5F, 0.5F);
/*     */     
/*  37 */     c(paramic.posX, paramic.posY, paramic.posZ, paramic.rotationYaw, paramic.rotationPitch);
/*     */ 
/*     */     
/*  40 */     this.posX -= (MathHelper.b(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
/*  41 */     this.posY -= 0.10000000149011612D;
/*  42 */     this.posZ -= (MathHelper.a(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
/*  43 */     setPosition(this.posX, this.posY, this.posZ);
/*  44 */     this.yOffset = 0.0F;
/*     */ 
/*     */     
/*  47 */     this.motionX = (-MathHelper.a(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.b(this.rotationPitch / 180.0F * 3.1415927F));
/*  48 */     this.motionZ = (MathHelper.b(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.b(this.rotationPitch / 180.0F * 3.1415927F));
/*  49 */     this.motionY = -MathHelper.a(this.rotationPitch / 180.0F * 3.1415927F);
/*     */     
/*  51 */     a(this.motionX, this.motionY, this.motionZ, 1.5F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  55 */     float f1 = MathHelper.sqrt_double(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/*  57 */     paramDouble1 /= f1;
/*  58 */     paramDouble2 /= f1;
/*  59 */     paramDouble3 /= f1;
/*     */     
/*  61 */     paramDouble1 += this.Q.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  62 */     paramDouble2 += this.Q.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  63 */     paramDouble3 += this.Q.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*     */     
/*  65 */     paramDouble1 *= paramFloat1;
/*  66 */     paramDouble2 *= paramFloat1;
/*  67 */     paramDouble3 *= paramFloat1;
/*     */     
/*  69 */     this.motionX = paramDouble1;
/*  70 */     this.motionY = paramDouble2;
/*  71 */     this.motionZ = paramDouble3;
/*     */     
/*  73 */     float f2 = MathHelper.sqrt_double(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/*  75 */     this.s = this.rotationYaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D);
/*  76 */     this.t = this.rotationPitch = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D);
/*  77 */     this.ah = 0;
/*     */   }
/*     */   
/*     */   public void onUpdate() {
/*  81 */     super.onUpdate();
/*     */     
/*  83 */     if (this.a > 0) this.a--;
/*     */     
/*  85 */     if (this.af) {
/*     */ 
/*     */ 
/*     */       
/*  89 */       int i = this.worldObj.getBlockId(this.b, this.ac, this.ad);
/*  90 */       if (i != this.ae) {
/*  91 */         this.af = false;
/*     */         
/*  93 */         this.motionX *= (this.Q.nextFloat() * 0.2F);
/*  94 */         this.motionY *= (this.Q.nextFloat() * 0.2F);
/*  95 */         this.motionZ *= (this.Q.nextFloat() * 0.2F);
/*  96 */         this.ah = 0;
/*  97 */         this.ai = 0;
/*     */       } else {
/*  99 */         this.ah++;
/* 100 */         if (this.ah == 1200) setEntityDead();
/*     */         return;
/*     */       } 
/*     */     } else {
/* 104 */       this.ai++;
/*     */     } 
/*     */     
/* 107 */     Vec3D as1 = Vec3D.b(this.posX, this.posY, this.posZ);
/* 108 */     Vec3D as2 = Vec3D.b(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
/* 109 */     fe fe = this.worldObj.a(as1, as2);
/*     */     
/* 111 */     as1 = Vec3D.b(this.posX, this.posY, this.posZ);
/* 112 */     as2 = Vec3D.b(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
/* 113 */     if (fe != null) {
/* 114 */       as2 = Vec3D.b(fe.f.a, fe.f.b, fe.f.c);
/*     */     }
/* 116 */     Entity db1 = null;
/* 117 */     List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.a(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
/* 118 */     double d = 0.0D;
/* 119 */     for (int b = 0; b < list.size(); b++) {
/* 120 */       Entity db2 = list.get(b);
/* 121 */       if (db2.c_() && (db2 != this.ag || this.ai >= 5)) {
/*     */         
/* 123 */         float f = 0.3F;
/* 124 */         AxisAlignedBB cy = db2.boundingBox.expand(f, f, f);
/* 125 */         fe fe1 = cy.a(as1, as2);
/* 126 */         if (fe1 != null) {
/* 127 */           double d1 = as1.a(fe1.f);
/* 128 */           if (d1 < d || d == 0.0D) {
/* 129 */             db1 = db2;
/* 130 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 135 */     if (db1 != null) {
/* 136 */       fe = new fe(db1);
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
/* 155 */     if (fe != null) {
/* 156 */       if (fe.g != null) {
/* 157 */         if (fe.g.attackEntityFrom(this.ag, 4)) {
/* 158 */           this.worldObj.playSoundAtEntity(this, "random.drr", 1.0F, 1.2F / (this.Q.nextFloat() * 0.2F + 0.9F));
/* 159 */           setEntityDead();
/*     */         } else {
/* 161 */           this.motionX *= -0.10000000149011612D;
/* 162 */           this.motionY *= -0.10000000149011612D;
/* 163 */           this.motionZ *= -0.10000000149011612D;
/* 164 */           this.rotationYaw += 180.0F;
/* 165 */           this.s += 180.0F;
/* 166 */           this.ai = 0;
/*     */         } 
/*     */       } else {
/*     */         
/* 170 */         this.b = fe.b;
/* 171 */         this.ac = fe.c;
/* 172 */         this.ad = fe.d;
/* 173 */         this.ae = this.worldObj.getBlockId(this.b, this.ac, this.ad);
/* 174 */         this.motionX = (float)(fe.f.a - this.posX);
/* 175 */         this.motionY = (float)(fe.f.b - this.posY);
/* 176 */         this.motionZ = (float)(fe.f.c - this.posZ);
/* 177 */         float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
/* 178 */         this.posX -= this.motionX / f * 0.05000000074505806D;
/* 179 */         this.posY -= this.motionY / f * 0.05000000074505806D;
/* 180 */         this.posZ -= this.motionZ / f * 0.05000000074505806D;
/*     */         
/* 182 */         this.worldObj.playSoundAtEntity(this, "random.drr", 1.0F, 1.2F / (this.Q.nextFloat() * 0.2F + 0.9F));
/* 183 */         this.af = true;
/* 184 */         this.a = 7;
/*     */       } 
/*     */     }
/* 187 */     this.posX += this.motionX;
/* 188 */     this.posY += this.motionY;
/* 189 */     this.posZ += this.motionZ;
/*     */     
/* 191 */     float f1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
/* 192 */     this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.1415927410125732D);
/* 193 */     this.rotationPitch = (float)(Math.atan2(this.motionY, f1) * 180.0D / 3.1415927410125732D);
/*     */     
/* 195 */     while (this.rotationPitch - this.t < -180.0F)
/* 196 */       this.t -= 360.0F; 
/* 197 */     while (this.rotationPitch - this.t >= 180.0F) {
/* 198 */       this.t += 360.0F;
/*     */     }
/* 200 */     while (this.rotationYaw - this.s < -180.0F)
/* 201 */       this.s -= 360.0F; 
/* 202 */     while (this.rotationYaw - this.s >= 180.0F) {
/* 203 */       this.s += 360.0F;
/*     */     }
/* 205 */     this.rotationPitch = this.t + (this.rotationPitch - this.t) * 0.2F;
/* 206 */     this.rotationYaw = this.s + (this.rotationYaw - this.s) * 0.2F;
/*     */ 
/*     */     
/* 209 */     float f2 = 0.99F;
/* 210 */     float f3 = 0.03F;
/*     */     
/* 212 */     if (handleWaterMovement()) {
/* 213 */       for (int b1 = 0; b1 < 4; b1++) {
/* 214 */         float f = 0.25F;
/* 215 */         this.worldObj.a("bubble", this.posX - this.motionX * f, this.posY - this.motionY * f, this.posZ - this.motionZ * f, this.motionX, this.motionY, this.motionZ);
/*     */       } 
/* 217 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 220 */     this.motionX *= f2;
/* 221 */     this.motionY *= f2;
/* 222 */     this.motionZ *= f2;
/* 223 */     this.motionY -= f3;
/*     */     
/* 225 */     setPosition(this.posX, this.posY, this.posZ);
/*     */   }
/*     */   
/*     */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 229 */     paramr.setShort("xTile", (short)this.b);
/* 230 */     paramr.setShort("yTile", (short)this.ac);
/* 231 */     paramr.setShort("zTile", (short)this.ad);
/* 232 */     paramr.a("inTile", (byte)this.ae);
/* 233 */     paramr.a("shake", (byte)this.a);
/* 234 */     paramr.a("inGround", (byte)(this.af ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 238 */     this.b = paramr.getShort("xTile");
/* 239 */     this.ac = paramr.getShort("yTile");
/* 240 */     this.ad = paramr.getShort("zTile");
/* 241 */     this.ae = paramr.b("inTile") & 0xFF;
/* 242 */     this.a = paramr.b("shake") & 0xFF;
/* 243 */     this.af = (paramr.b("inGround") == 1);
/*     */   }
/*     */   
/*     */   public void onCollideWithPlayer(EntityPlayer parameq) {
/* 247 */     if (this.af && this.ag == parameq && this.a <= 0 && 
/* 248 */       parameq.inventory.addItemStackToInventory(new ItemStack(Item.j.aQ, 1))) {
/* 249 */       this.worldObj.playSoundAtEntity(this, "random.pop", 0.2F, ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 250 */       parameq.onItemPickup(this, 1);
/* 251 */       setEntityDead();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\da.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */