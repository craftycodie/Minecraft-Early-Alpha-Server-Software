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
/*     */ 
/*     */ 
/*     */ public class EntityBoat
/*     */   extends Entity
/*     */ {
/*  18 */   public int a = 0;
/*  19 */   public int b = 0;
/*  20 */   public int ac = 1;
/*     */   
/*     */   public EntityBoat(World paramdp) {
/*  23 */     super(paramdp);
/*  24 */     this.d = true;
/*  25 */     setSize(1.5F, 0.6F);
/*  26 */     this.yOffset = this.D / 2.0F;
/*  27 */     this.G = false;
/*     */   }
/*     */   
/*     */   public AxisAlignedBB d(Entity paramdb) {
/*  31 */     return paramdb.boundingBox;
/*     */   }
/*     */   
/*     */   public AxisAlignedBB l() {
/*  35 */     return this.boundingBox;
/*     */   }
/*     */   
/*     */   public boolean p() {
/*  39 */     return true;
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
/*     */   public double w() {
/*  56 */     return this.D * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean attackEntityFrom(Entity paramdb, int paramInt) {
/*  60 */     this.ac = -this.ac;
/*  61 */     this.b = 10;
/*  62 */     this.a += paramInt * 10;
/*  63 */     if (this.a > 40) {
/*  64 */       byte b; for (b = 0; b < 3; b++) {
/*  65 */         a(Block.x.blockId, 1, 0.0F);
/*     */       }
/*  67 */       for (b = 0; b < 2; b++) {
/*  68 */         a(Item.B.aQ, 1, 0.0F);
/*     */       }
/*  70 */       setEntityDead();
/*     */     } 
/*  72 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/*  76 */     return !this.isDead;
/*     */   }
/*     */   
/*     */   public void onUpdate() {
/*  80 */     super.onUpdate();
/*  81 */     if (this.b > 0) this.b--; 
/*  82 */     if (this.a > 0) this.a--; 
/*  83 */     this.h = this.posX;
/*  84 */     this.i = this.posY;
/*  85 */     this.j = this.posZ;
/*     */ 
/*     */     
/*  88 */     int b1 = 5;
/*  89 */     double d1 = 0.0D;
/*  90 */     for (int b2 = 0; b2 < b1; b2++) {
/*  91 */       double d9 = this.boundingBox.b + (this.boundingBox.e - this.boundingBox.b) * (b2 + 0) / b1 - 0.125D;
/*  92 */       double d10 = this.boundingBox.b + (this.boundingBox.e - this.boundingBox.b) * (b2 + 1) / b1 - 0.125D;
/*  93 */       AxisAlignedBB cy = AxisAlignedBB.b(this.boundingBox.a, d9, this.boundingBox.c, this.boundingBox.d, d10, this.boundingBox.f);
/*  94 */       if (this.worldObj.b(cy, Material.f)) {
/*  95 */         d1 += 1.0D / b1;
/*     */       }
/*     */     } 
/*     */     
/*  99 */     double d2 = d1 * 2.0D - 1.0D;
/* 100 */     this.motionY += 0.03999999910593033D * d2;
/*     */     
/* 102 */     if (this.e != null) {
/* 103 */       this.motionX += this.e.motionX * 0.2D;
/* 104 */       this.motionZ += this.e.motionZ * 0.2D;
/*     */     } 
/*     */     
/* 107 */     double d3 = 0.4D;
/*     */     
/* 109 */     if (this.motionX < -d3) this.motionX = -d3;
/* 110 */     if (this.motionX > d3) this.motionX = d3;
/* 111 */     if (this.motionZ < -d3) this.motionZ = -d3;
/* 112 */     if (this.motionZ > d3) this.motionZ = d3;
/* 113 */     if (this.onGround) {
/* 114 */       this.motionX *= 0.5D;
/* 115 */       this.motionY *= 0.5D;
/* 116 */       this.motionZ *= 0.5D;
/*     */     } 
/* 118 */     moveEntity(this.motionX, this.motionY, this.motionZ);
/* 119 */     double d4 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
/* 120 */     if (d4 > 0.15D) {
/* 121 */       double d9 = Math.cos(this.rotationYaw * Math.PI / 180.0D);
/* 122 */       double d10 = Math.sin(this.rotationYaw * Math.PI / 180.0D);
/*     */       
/* 124 */       for (int b = 0; b < 1.0D + d4 * 60.0D; b++) {
/*     */         
/* 126 */         double d11 = (this.Q.nextFloat() * 2.0F - 1.0F);
/*     */         
/* 128 */         double d12 = (this.Q.nextInt(2) * 2 - 1) * 0.7D;
/* 129 */         if (this.Q.nextBoolean()) {
/* 130 */           double d13 = this.posX - d9 * d11 * 0.8D + d10 * d12;
/* 131 */           double d14 = this.posZ - d10 * d11 * 0.8D - d9 * d12;
/* 132 */           this.worldObj.a("splash", d13, this.posY - 0.125D, d14, this.motionX, this.motionY, this.motionZ);
/*     */         } else {
/* 134 */           double d13 = this.posX + d9 + d10 * d11 * 0.7D;
/* 135 */           double d14 = this.posZ + d10 - d9 * d11 * 0.7D;
/* 136 */           this.worldObj.a("splash", d13, this.posY - 0.125D, d14, this.motionX, this.motionY, this.motionZ);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 141 */     if (this.w && d4 > 0.15D) {
/* 142 */       setEntityDead(); byte b;
/* 143 */       for (b = 0; b < 3; b++) {
/* 144 */         a(Block.x.blockId, 1, 0.0F);
/*     */       }
/* 146 */       for (b = 0; b < 2; b++) {
/* 147 */         a(Item.B.aQ, 1, 0.0F);
/*     */       }
/*     */     } else {
/* 150 */       this.motionX *= 0.9900000095367432D;
/* 151 */       this.motionY *= 0.949999988079071D;
/* 152 */       this.motionZ *= 0.9900000095367432D;
/*     */     } 
/*     */     
/* 155 */     this.rotationPitch = 0.0F;
/* 156 */     double d5 = this.rotationYaw;
/* 157 */     double d6 = this.h - this.posX;
/* 158 */     double d7 = this.j - this.posZ;
/* 159 */     if (d6 * d6 + d7 * d7 > 0.001D) {
/* 160 */       d5 = (float)(Math.atan2(d7, d6) * 180.0D / Math.PI);
/*     */     }
/*     */     
/* 163 */     double d8 = d5 - this.rotationYaw;
/* 164 */     while (d8 >= 180.0D)
/* 165 */       d8 -= 360.0D; 
/* 166 */     while (d8 < -180.0D) {
/* 167 */       d8 += 360.0D;
/*     */     }
/* 169 */     if (d8 > 20.0D) d8 = 20.0D; 
/* 170 */     if (d8 < -20.0D) d8 = -20.0D;
/*     */     
/* 172 */     this.rotationYaw = (float)(this.rotationYaw + d8);
/* 173 */     b(this.rotationYaw, this.rotationPitch);
/*     */     
/* 175 */     List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 176 */     if (list != null && list.size() > 0) {
/* 177 */       for (int b = 0; b < list.size(); b++) {
/* 178 */         Entity db1 = list.get(b);
/* 179 */         if (db1 != this.e && db1.p() && db1 instanceof EntityBoat) {
/* 180 */           db1.c(this);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 185 */     if (this.e != null && 
/* 186 */       this.e.isDead) this.e = null;
/*     */   
/*     */   }
/*     */   
/*     */   protected void u() {
/* 191 */     double d1 = Math.cos(this.rotationYaw * Math.PI / 180.0D) * 0.4D;
/* 192 */     double d2 = Math.sin(this.rotationYaw * Math.PI / 180.0D) * 0.4D;
/* 193 */     this.e.setPosition(this.posX + d1, this.posY + w() + this.e.v(), this.posZ + d2);
/*     */   }
/*     */   
/*     */   protected void writeEntityToNBT(NBTTagCompound paramr) {}
/*     */   
/*     */   protected void readEntityFromNBT(NBTTagCompound paramr) {}
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */