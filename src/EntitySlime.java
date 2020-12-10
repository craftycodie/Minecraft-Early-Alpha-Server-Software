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
/*     */ public class EntitySlime
/*     */   extends EntityLiving
/*     */ {
/*     */   public float a;
/*     */   public float b;
/*  16 */   private int ad = 0;
/*  17 */   public int ac = 1;
/*     */   
/*     */   public EntitySlime(World paramdp) {
/*  20 */     super(paramdp);
/*  21 */     this.aB = "/mob/slime.png";
/*  22 */     this.ac = 1 << this.Q.nextInt(3);
/*  23 */     this.yOffset = 0.0F;
/*  24 */     this.ad = this.Q.nextInt(20) + 10;
/*  25 */     c(this.ac);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/*  29 */     this.ac = paramInt;
/*  30 */     a(0.6F * paramInt, 0.6F * paramInt);
/*  31 */     this.health = paramInt * paramInt;
/*  32 */     a(this.posX, this.posY, this.posZ);
/*     */   }
/*     */   
/*     */   public void writeEntityToNBT(NBTTagCompound paramr) {
/*  36 */     super.writeEntityToNBT(paramr);
/*  37 */     paramr.a("Size", this.ac - 1);
/*     */   }
/*     */   
/*     */   public void readEntityFromNBT(NBTTagCompound paramr) {
/*  41 */     super.readEntityFromNBT(paramr);
/*  42 */     this.ac = paramr.d("Size") + 1;
/*     */   }
/*     */   
/*     */   public void onUpdate() {
/*  46 */     this.b = this.a;
/*  47 */     boolean bool = this.onGround;
/*  48 */     super.onUpdate();
/*  49 */     if (this.onGround && !bool) {
/*  50 */       for (int b = 0; b < this.ac * 8; b++) {
/*  51 */         float f1 = this.Q.nextFloat() * 3.1415927F * 2.0F;
/*  52 */         float f2 = this.Q.nextFloat() * 0.5F + 0.5F;
/*  53 */         float f3 = MathHelper.a(f1) * this.ac * 0.5F * f2;
/*  54 */         float f4 = MathHelper.b(f1) * this.ac * 0.5F * f2;
/*  55 */         this.worldObj.a("slime", this.posX + f3, this.boundingBox.b, this.posZ + f4, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/*  58 */       if (this.ac > 2) {
/*  59 */         this.worldObj.playSoundAtEntity(this, "mob.slime", f(), ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/*     */       }
/*  61 */       this.a = -0.5F;
/*     */     } 
/*  63 */     this.a *= 0.6F;
/*     */   }
/*     */   
/*     */   protected void d_() {
/*  67 */     EntityPlayer eq = this.worldObj.a(this, 16.0D);
/*  68 */     if (eq != null) {
/*  69 */       b(eq, 10.0F);
/*     */     }
/*  71 */     if (this.onGround && this.ad-- <= 0) {
/*  72 */       this.ad = this.Q.nextInt(20) + 10;
/*  73 */       if (eq != null) {
/*  74 */         this.ad /= 3;
/*     */       }
/*  76 */       this.bd = true;
/*  77 */       if (this.ac > 1) {
/*  78 */         this.worldObj.playSoundAtEntity(this, "mob.slime", f(), ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */       }
/*     */       
/*  81 */       this.a = 1.0F;
/*  82 */       this.ba = 1.0F - this.Q.nextFloat() * 2.0F;
/*  83 */       this.bb = (1 * this.ac);
/*     */     } else {
/*  85 */       this.bd = false;
/*  86 */       if (this.onGround) {
/*  87 */         this.ba = this.bb = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void i() {
/*  93 */     if (this.ac > 1 && this.health == 0) {
/*  94 */       for (int b = 0; b < 4; b++) {
/*  95 */         float f1 = ((b % 2) - 0.5F) * this.ac / 4.0F;
/*  96 */         float f2 = ((b / 2) - 0.5F) * this.ac / 4.0F;
/*  97 */         EntitySlime ev1 = new EntitySlime(this.worldObj);
/*  98 */         ev1.c(this.ac / 2);
/*  99 */         ev1.c(this.posX + f1, this.posY + 0.5D, this.posZ + f2, this.Q.nextFloat() * 360.0F, 0.0F);
/* 100 */         this.worldObj.a(ev1);
/*     */       } 
/*     */     }
/* 103 */     super.setEntityDead();
/*     */   }
/*     */   
/*     */   public void a(EntityPlayer parameq) {
/* 107 */     if (this.ac > 1 && 
/* 108 */       g(parameq) && a((Entity)parameq) < 0.6D * this.ac &&
/* 109 */       parameq.attackEntityFrom(this, this.ac)) {
/* 110 */       this.worldObj.playSoundAtEntity(this, "mob.slimeattack", 1.0F, (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getHurtSound() {
/* 118 */     return "mob.slime";
/*     */   }
/*     */   
/*     */   protected String getDeathSound() {
/* 122 */     return "mob.slime";
/*     */   }
/*     */   
/*     */   protected int g() {
/* 126 */     if (this.ac == 1) return Item.aK.aQ;
/* 127 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 131 */     Chunk hv = this.worldObj.a(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY));
/* 132 */     return ((this.ac == 1 || this.worldObj.difficultySetting > 0) && this.Q.nextInt(10) == 0 && hv.a(987234911L).nextInt(100) == 0 && this.posY < 16.0D);
/*     */   }
/*     */   
/*     */   protected float f() {
/* 136 */     return 0.6F;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ev.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */