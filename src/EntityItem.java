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
/*     */ public class EntityItem
/*     */   extends Entity
/*     */ {
/*     */   public ItemStack item;
/*     */   private int field_9170_e;
/*  19 */   public int age = 0;
/*     */   
/*     */   public int delayBeforeCanPickup;
/*  22 */   private int health = 5;
/*     */   
/*  24 */   public float field_432_ae = (float)(Math.random() * Math.PI * 2.0D);
/*     */   
/*     */   public EntityItem(World paramdp, double paramDouble1, double paramDouble2, double paramDouble3, ItemStack paramgc) {
/*  27 */     super(paramdp);
/*  28 */     setSize(0.25F, 0.25F);
/*  29 */     this.yOffset = this.D / 2.0F;
/*  30 */     setPosition(paramDouble1, paramDouble2, paramDouble3);
/*  31 */     this.item = paramgc;
/*     */     
/*  33 */     this.rotationYaw = (float)(Math.random() * 360.0D);
/*     */     
/*  35 */     this.motionX = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  36 */     this.motionY = 0.20000000298023224D;
/*  37 */     this.motionZ = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  38 */     this.G = false;
/*     */   }
/*     */   
/*     */   public EntityItem(World paramdp) {
/*  42 */     super(paramdp);
/*  43 */     setSize(0.25F, 0.25F);
/*  44 */     this.yOffset = this.D / 2.0F;
/*     */   }
/*     */   
/*     */   public void onUpdate() {
/*  48 */     super.onUpdate();
/*  49 */     if (this.delayBeforeCanPickup > 0) this.delayBeforeCanPickup--;
/*  50 */     this.h = this.posX;
/*  51 */     this.i = this.posY;
/*  52 */     this.j = this.posZ;
/*     */     
/*  54 */     this.motionY -= 0.03999999910593033D;
/*  55 */     if (this.worldObj.getBlockMaterial(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Material.g) {
/*  56 */       this.motionY = 0.20000000298023224D;
/*  57 */       this.motionX = ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F);
/*  58 */       this.motionZ = ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F);
/*  59 */       this.worldObj.playSoundAtEntity(this, "random.fizz", 0.4F, 2.0F + this.Q.nextFloat() * 0.4F);
/*     */     } 
/*  61 */     g(this.posX, this.posY, this.posZ);
/*  62 */     handleWaterMovement();
/*  63 */     moveEntity(this.motionX, this.motionY, this.motionZ);
/*     */ 
/*     */     
/*  66 */     float f = 0.98F;
/*  67 */     if (this.onGround) {
/*  68 */       f = 0.58800006F;
/*  69 */       int i = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.b) - 1, MathHelper.floor_double(this.posZ));
/*  70 */       if (i > 0) {
/*  71 */         f = (Block.blocksList[i]).bm * 0.98F;
/*     */       }
/*     */     } 
/*     */     
/*  75 */     this.motionX *= f;
/*  76 */     this.motionY *= 0.9800000190734863D;
/*  77 */     this.motionZ *= f;
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
/*  98 */     if (this.onGround) {
/*  99 */       this.motionY *= -0.5D;
/*     */     }
/*     */     
/* 102 */     this.field_9170_e++;
/* 103 */     this.age++;
/* 104 */     if (this.age >= 6000) {
/* 105 */       setEntityDead();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean handleWaterMovement() {
/* 110 */     return this.worldObj.a(this.boundingBox, Material.f, this);
/*     */   }
/*     */   
/*     */   private boolean g(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 114 */     int i = MathHelper.floor_double(paramDouble1);
/* 115 */     int j = MathHelper.floor_double(paramDouble2);
/* 116 */     int k = MathHelper.floor_double(paramDouble3);
/*     */     
/* 118 */     double d1 = paramDouble1 - i;
/* 119 */     double d2 = paramDouble2 - j;
/* 120 */     double d3 = paramDouble3 - k;
/*     */
/* 122 */     if (Block.opaqueCubeLookup[this.worldObj.getBlockId(i, j, k)]) {
/* 123 */       boolean bool1 = !Block.opaqueCubeLookup[this.worldObj.getBlockId(i - 1, j, k)] ? true : false;
/* 124 */       boolean bool2 = !Block.opaqueCubeLookup[this.worldObj.getBlockId(i + 1, j, k)] ? true : false;
/* 125 */       boolean bool3 = !Block.opaqueCubeLookup[this.worldObj.getBlockId(i, j - 1, k)] ? true : false;
/* 126 */       boolean bool4 = !Block.opaqueCubeLookup[this.worldObj.getBlockId(i, j + 1, k)] ? true : false;
/* 127 */       boolean bool5 = !Block.opaqueCubeLookup[this.worldObj.getBlockId(i, j, k - 1)] ? true : false;
/* 128 */       boolean bool6 = !Block.opaqueCubeLookup[this.worldObj.getBlockId(i, j, k + 1)] ? true : false;
/*     */       
/* 130 */       int b = -1;
/* 131 */       double d = 9999.0D;
/* 132 */       if (bool1 && d1 < d) {
/* 133 */         d = d1;
/* 134 */         b = 0;
/*     */       } 
/* 136 */       if (bool2 && 1.0D - d1 < d) {
/* 137 */         d = 1.0D - d1;
/* 138 */         b = 1;
/*     */       } 
/* 140 */       if (bool3 && d2 < d) {
/* 141 */         d = d2;
/* 142 */         b = 2;
/*     */       } 
/* 144 */       if (bool4 && 1.0D - d2 < d) {
/* 145 */         d = 1.0D - d2;
/* 146 */         b = 3;
/*     */       } 
/* 148 */       if (bool5 && d3 < d) {
/* 149 */         d = d3;
/* 150 */         b = 4;
/*     */       } 
/* 152 */       if (bool6 && 1.0D - d3 < d) {
/* 153 */         d = 1.0D - d3;
/* 154 */         b = 5;
/*     */       } 
/*     */       
/* 157 */       float f = this.Q.nextFloat() * 0.2F + 0.1F;
/* 158 */       if (b == 0) this.motionX = -f;
/* 159 */       if (b == 1) this.motionX = f;
/* 160 */       if (b == 2) this.motionY = -f;
/* 161 */       if (b == 3) this.motionY = f;
/* 162 */       if (b == 4) this.motionZ = -f;
/* 163 */       if (b == 5) this.motionZ = f;
/*     */     
/*     */     } 
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   protected void dealFireDamage(int paramInt) {
/* 170 */     attackEntityFrom((Entity)null, paramInt);
/*     */   }
/*     */   
/*     */   public boolean attackEntityFrom(Entity paramdb, int paramInt) {
/* 174 */     this.health -= paramInt;
/* 175 */     if (this.health <= 0) {
/* 176 */       setEntityDead();
/*     */     }
/* 178 */     return false;
/*     */   }
/*     */   
/*     */   public void writeEntityToNBT(NBTTagCompound paramr) {
/* 182 */     paramr.setShort("Health", (short)(byte)this.health);
/* 183 */     paramr.setShort("Age", (short)this.age);
/* 184 */     paramr.setCompoundTag("Item", this.item.a(new NBTTagCompound()));
/*     */   }
/*     */   
/*     */   public void readEntityFromNBT(NBTTagCompound paramr) {
/* 188 */     this.health = paramr.getShort("Health") & 0xFF;
/* 189 */     this.age = paramr.getShort("Age");
/* 190 */     NBTTagCompound r1 = paramr.j("Item");
/* 191 */     this.item = new ItemStack(r1);
/*     */   }
/*     */
/*     */   public void onCollideWithPlayer(EntityPlayer parameq) {
/* 195 */     if (this.worldObj.singleplayerWorld)
/*     */       return;
/* 197 */     int i = this.item.itemID;
/* 198 */     if (this.delayBeforeCanPickup == 0 && parameq.inventory.addItemStackToInventory(this.item)) {
/* 199 */       this.worldObj.playSoundAtEntity(this, "random.pop", 0.2F, ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 200 */       parameq.onItemPickup(this, i);
/* 201 */       setEntityDead();
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */