/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public abstract class Entity
/*     */ {
/*  19 */   private static int a = 1000000;
/*     */   
/*  21 */   public int entityId = a++;
/*     */   
/*     */   public boolean d = false;
/*     */   
/*     */   public Entity e;
/*     */   
/*     */   public Entity f;
/*     */   protected World worldObj;
/*     */   public double h;
/*     */   public double i;
/*     */   public double j;
/*     */   public double posX;
/*  33 */   public final AxisAlignedBB boundingBox = AxisAlignedBB.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); public double posY; public double posZ; public double motionX; public double motionY; public double motionZ; public float rotationYaw; public float rotationPitch; public float s; public float t;
/*     */   public boolean onGround = false;
/*     */   public boolean w;
/*     */   public boolean x;
/*     */   public boolean y = false;
/*     */   public boolean z = true;
/*     */   public boolean isDead = false;
/*  40 */   public float yOffset = 0.0F;
/*     */   
/*  42 */   public float C = 0.6F;
/*  43 */   public float D = 1.8F;
/*     */   
/*  45 */   public float E = 0.0F;
/*  46 */   public float F = 0.0F;
/*     */   protected boolean G = true;
/*  48 */   protected float H = 0.0F;
/*  49 */   private int b = 1; public double I; public double J;
/*     */   public double K;
/*  51 */   public float ySize = 0.0F;
/*  52 */   public float M = 0.0F;
/*     */   public boolean N = false;
/*  54 */   public float O = 0.0F;
/*     */   
/*     */   public boolean P = false;
/*  57 */   protected Random Q = new Random();
/*  58 */   public int ticksExisted = 0;
/*  59 */   public int S = 1;
/*     */   
/*  61 */   public int T = 0;
/*     */   
/*  63 */   protected int U = 300;
/*     */   protected boolean V = false;
/*  65 */   public int W = 0;
/*  66 */   public int X = 300;
/*     */   
/*     */   private boolean ac = true;
/*     */   
/*     */   private double ad;
/*     */   
/*     */   private double ae;
/*     */   public boolean Y;
/*     */   public int Z;
/*     */   public int aa;
/*     */   public int ab;
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  79 */     if (paramObject instanceof Entity) {
/*  80 */       return (((Entity)paramObject).entityId == this.entityId);
/*     */     }
/*  82 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  86 */     return this.entityId;
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
/*     */   public void setEntityDead() {
/* 106 */     this.isDead = true;
/*     */   }
/*     */   
/*     */   protected void setSize(float paramFloat1, float paramFloat2) {
/* 110 */     this.C = paramFloat1;
/* 111 */     this.D = paramFloat2;
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
/*     */   protected void b(float paramFloat1, float paramFloat2) {
/* 123 */     this.rotationYaw = paramFloat1;
/* 124 */     this.rotationPitch = paramFloat2;
/*     */   }
/*     */   
/*     */   public void setPosition(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 128 */     this.posX = paramDouble1;
/* 129 */     this.posY = paramDouble2;
/* 130 */     this.posZ = paramDouble3;
/* 131 */     float f1 = this.C / 2.0F;
/* 132 */     float f2 = this.D;
/*     */     
/* 134 */     this.boundingBox.c(paramDouble1 - f1, paramDouble2 - this.yOffset + this.ySize, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 - this.yOffset + this.ySize + f2, paramDouble3 + f1);
/*     */   }
/*     */
/*     */   public void onUpdate() {
/* 158 */     j();
/*     */   }
/*     */   
/*     */   public void j() {
/* 162 */     if (this.f != null && this.f.isDead) this.f = null;
/*     */     
/* 164 */     this.ticksExisted++;
/* 165 */     this.E = this.F;
/* 166 */     this.h = this.posX;
/* 167 */     this.i = this.posY;
/* 168 */     this.j = this.posZ;
/* 169 */     this.t = this.rotationPitch;
/* 170 */     this.s = this.rotationYaw;
/*     */     
/* 172 */     if (handleWaterMovement()) {
/* 173 */       if (!this.V && !this.ac) {
/* 174 */         float f1 = MathHelper.sqrt_double(this.motionX * this.motionX * 0.20000000298023224D + this.motionY * this.motionY + this.motionZ * this.motionZ * 0.20000000298023224D) * 0.2F;
/* 175 */         if (f1 > 1.0F) f1 = 1.0F; 
/* 176 */         this.worldObj.playSoundAtEntity(this, "random.splash", f1, 1.0F + (this.Q.nextFloat() - this.Q.nextFloat()) * 0.4F);
/* 177 */         float f2 = MathHelper.floor_double(this.boundingBox.b);
/* 178 */         for (int b = 0; b < 1.0F + this.C * 20.0F; b++) {
/* 179 */           float f3 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 180 */           float f4 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 181 */           this.worldObj.a("bubble", this.posX + f3, (f2 + 1.0F), this.posZ + f4, this.motionX, this.motionY - (this.Q.nextFloat() * 0.2F), this.motionZ);
/*     */         } 
/* 183 */         for (int b = 0; b < 1.0F + this.C * 20.0F; b++) {
/* 184 */           float f3 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 185 */           float f4 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 186 */           this.worldObj.a("splash", this.posX + f3, (f2 + 1.0F), this.posZ + f4, this.motionX, this.motionY, this.motionZ);
/*     */         } 
/*     */       } 
/* 189 */       this.H = 0.0F;
/* 190 */       this.V = true;
/* 191 */       this.T = 0;
/*     */     } else {
/* 193 */       this.V = false;
/*     */     } 
/*     */     
/* 196 */     if (this.T > 0) {
/* 197 */       if (this.T % 20 == 0) {
/* 198 */         attackEntityFrom((Entity)null, 1);
/*     */       }
/* 200 */       this.T--;
/*     */     } 
/*     */     
/* 203 */     if (o()) {
/* 204 */       attackEntityFrom((Entity)null, 10);
/* 205 */       this.T = 600;
/*     */     } 
/*     */     
/* 208 */     if (this.posY < -64.0D) {
/* 209 */       k();
/*     */     }
/*     */     
/* 212 */     this.ac = false;
/*     */   }
/*     */   
/*     */   protected void k() {
/* 216 */     setEntityDead();
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
/*     */   public boolean b(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 229 */     AxisAlignedBB cy1 = this.boundingBox.c(paramDouble1, paramDouble2, paramDouble3);
/* 230 */     List list = this.worldObj.getCollidingBoundingBoxes(this, cy1);
/* 231 */     if (list.size() > 0) return false; 
/* 232 */     if (this.worldObj.b(cy1)) return false;
/*     */     
/* 234 */     return true;
/*     */   }
/*     */   
/*     */   public void moveEntity(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 238 */     if (this.N) {
/* 239 */       this.boundingBox.offset(paramDouble1, paramDouble2, paramDouble3);
/* 240 */       this.posX = (this.boundingBox.a + this.boundingBox.d) / 2.0D;
/* 241 */       this.posY = this.boundingBox.b + this.yOffset - this.ySize;
/* 242 */       this.posZ = (this.boundingBox.c + this.boundingBox.f) / 2.0D;
/*     */       
/*     */       return;
/*     */     } 
/* 246 */     double d1 = this.posX;
/* 247 */     double d2 = this.posZ;
/*     */     
/* 249 */     double d3 = paramDouble1;
/* 250 */     double d4 = paramDouble2;
/* 251 */     double d5 = paramDouble3;
/*     */     
/* 253 */     AxisAlignedBB cy1 = this.boundingBox.copy();
/* 254 */     List<AxisAlignedBB> list = this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox.a(paramDouble1, paramDouble2, paramDouble3));
/*     */     
/*     */     int b1;
/* 257 */     for (b1 = 0; b1 < list.size(); b1++)
/* 258 */       paramDouble2 = ((AxisAlignedBB)list.get(b1)).b(this.boundingBox, paramDouble2);
/* 259 */     this.boundingBox.offset(0.0D, paramDouble2, 0.0D);
/*     */     
/* 261 */     if (!this.z && d4 != paramDouble2) {
/* 262 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 265 */     b1 = (this.onGround || (d4 != paramDouble2 && d4 < 0.0D)) ? 1 : 0;
/*     */     
/* 268 */     for (int b2 = 0; b2 < list.size(); b2++)
/* 269 */       paramDouble1 = ((AxisAlignedBB)list.get(b2)).a(this.boundingBox, paramDouble1);
/* 270 */     this.boundingBox.offset(paramDouble1, 0.0D, 0.0D);
/*     */     
/* 272 */     if (!this.z && d3 != paramDouble1) {
/* 273 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 276 */     for (int b2 = 0; b2 < list.size(); b2++)
/* 277 */       paramDouble3 = ((AxisAlignedBB)list.get(b2)).c(this.boundingBox, paramDouble3);
/* 278 */     this.boundingBox.offset(0.0D, 0.0D, paramDouble3);
/*     */     
/* 280 */     if (!this.z && d5 != paramDouble3) {
/* 281 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 284 */     if (this.M > 0.0F && b1 != 0 && this.ySize < 0.05F && (d3 != paramDouble1 || d5 != paramDouble3)) {
/* 285 */       double d8 = paramDouble1;
/* 286 */       double d9 = paramDouble2;
/* 287 */       double d10 = paramDouble3;
/*     */       
/* 289 */       paramDouble1 = d3;
/* 290 */       paramDouble2 = this.M;
/* 291 */       paramDouble3 = d5;
/*     */       
/* 293 */       AxisAlignedBB cy2 = this.boundingBox.copy();
/* 294 */       this.boundingBox.b(cy1);
/* 295 */       list = this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox.a(paramDouble1, paramDouble2, paramDouble3));
/*     */       
/* 298 */       for (int b = 0; b < list.size(); b++)
/* 299 */         paramDouble2 = ((AxisAlignedBB)list.get(b)).b(this.boundingBox, paramDouble2);
/* 300 */       this.boundingBox.offset(0.0D, paramDouble2, 0.0D);
/*     */       
/* 302 */       if (!this.z && d4 != paramDouble2) {
/* 303 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */ 
/*     */       
/* 307 */       for (int b = 0; b < list.size(); b++)
/* 308 */         paramDouble1 = ((AxisAlignedBB)list.get(b)).a(this.boundingBox, paramDouble1);
/* 309 */       this.boundingBox.offset(paramDouble1, 0.0D, 0.0D);
/*     */       
/* 311 */       if (!this.z && d3 != paramDouble1) {
/* 312 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */       
/* 315 */       for (int b = 0; b < list.size(); b++)
/* 316 */         paramDouble3 = ((AxisAlignedBB)list.get(b)).c(this.boundingBox, paramDouble3);
/* 317 */       this.boundingBox.offset(0.0D, 0.0D, paramDouble3);
/*     */       
/* 319 */       if (!this.z && d5 != paramDouble3) {
/* 320 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */       
/* 323 */       if (d8 * d8 + d10 * d10 >= paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) {
/* 324 */         paramDouble1 = d8;
/* 325 */         paramDouble2 = d9;
/* 326 */         paramDouble3 = d10;
/* 327 */         this.boundingBox.b(cy2);
/*     */       } else {
/* 329 */         this.ySize = (float)(this.ySize + 0.5D);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 334 */     this.posX = (this.boundingBox.a + this.boundingBox.d) / 2.0D;
/* 335 */     this.posY = this.boundingBox.b + this.yOffset - this.ySize;
/* 336 */     this.posZ = (this.boundingBox.c + this.boundingBox.f) / 2.0D;
/*     */     
/* 338 */     this.w = (d3 != paramDouble1 || d5 != paramDouble3);
/* 339 */     this.x = (d4 != paramDouble2);
/* 340 */     this.onGround = (d4 != paramDouble2 && d4 < 0.0D);
/* 341 */     this.y = (this.w || this.x);
/* 342 */     if (this.onGround)
/* 343 */     { if (this.H > 0.0F) {
/* 344 */         a(this.H);
/* 345 */         this.H = 0.0F;
/*     */       }
/*     */        }
/* 348 */     else if (paramDouble2 < 0.0D) { this.H = (float)(this.H - paramDouble2); }
/*     */ 
/*     */     
/* 351 */     if (d3 != paramDouble1) this.motionX = 0.0D;
/* 352 */     if (d4 != paramDouble2) this.motionY = 0.0D;
/* 353 */     if (d5 != paramDouble3) this.motionZ = 0.0D;
/*     */     
/* 355 */     double d6 = this.posX - d1;
/* 356 */     double d7 = this.posZ - d2;
/* 357 */     this.F = (float)(this.F + MathHelper.sqrt_double(d6 * d6 + d7 * d7) * 0.6D);
/*     */     
/* 359 */     if (this.G) {
/* 360 */       int i3 = MathHelper.floor_double(this.posX);
/* 361 */       int i4 = MathHelper.floor_double(this.posY - 0.20000000298023224D - this.yOffset);
/* 362 */       int i5 = MathHelper.floor_double(this.posZ);
/* 363 */       int i6 = this.worldObj.getBlockId(i3, i4, i5);
/* 364 */       if (this.F > this.b && i6 > 0) {
/* 365 */         this.b++;
/* 366 */         StepSound bl = (Block.blocksList[i6]).bj;
/* 367 */         if (this.worldObj.getBlockId(i3, i4 + 1, i5) == Block.aS.blockId) {
/* 368 */           bl = Block.aS.bj;
/* 369 */           this.worldObj.playSoundAtEntity(this, bl.c(), bl.a() * 0.15F, bl.b());
/* 370 */         } else if (!(Block.blocksList[i6]).blockMaterial.d()) {
/* 371 */           this.worldObj.playSoundAtEntity(this, bl.c(), bl.a() * 0.15F, bl.b());
/*     */         } 
/* 373 */         Block.blocksList[i6].b(this.worldObj, i3, i4, i5, this);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 378 */     int i = MathHelper.floor_double(this.boundingBox.a);
/* 379 */     int j = MathHelper.floor_double(this.boundingBox.b);
/* 380 */     int k = MathHelper.floor_double(this.boundingBox.c);
/* 381 */     int m = MathHelper.floor_double(this.boundingBox.d);
/* 382 */     int n = MathHelper.floor_double(this.boundingBox.e);
/* 383 */     int i1 = MathHelper.floor_double(this.boundingBox.f);
/* 384 */     for (int i2 = i; i2 <= m; i2++) {
/* 385 */       for (int i3 = j; i3 <= n; i3++) {
/* 386 */         for (int i4 = k; i4 <= i1; i4++) {
/* 387 */           int i5 = this.worldObj.getBlockId(i2, i3, i4);
/* 388 */           if (i5 > 0) {
/* 389 */             Block.blocksList[i5].a(this.worldObj, i2, i3, i4, this);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 394 */     this.ySize *= 0.4F;
/*     */     
/* 396 */     boolean bool = handleWaterMovement();
/* 397 */     if (this.worldObj.c(this.boundingBox)) {
/* 398 */       dealFireDamage(1);
/* 399 */       if (!bool) {
/* 400 */         this.T++;
/* 401 */         if (this.T == 0) this.T = 300;
/*     */       
/*     */       } 
/* 404 */     } else if (this.T <= 0) {
/* 405 */       this.T = -this.S;
/*     */     } 
/*     */ 
/*     */     
/* 409 */     if (bool && this.T > 0) {
/* 410 */       this.worldObj.playSoundAtEntity(this, "random.fizz", 0.7F, 1.6F + (this.Q.nextFloat() - this.Q.nextFloat()) * 0.4F);
/* 411 */       this.T = -this.S;
/*     */     } 
/*     */   }
/*     */   
/*     */   public AxisAlignedBB l() {
/* 416 */     return null;
/*     */   }
/*     */   
/*     */   protected void dealFireDamage(int paramInt) {
/* 420 */     attackEntityFrom((Entity)null, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(float paramFloat) {}
/*     */   
/*     */   public boolean handleWaterMovement() {
/* 427 */     return this.worldObj.a(this.boundingBox.expand(0.0D, -0.4000000059604645D, 0.0D), Material.f, this);
/*     */   }
/*     */   
/*     */   public boolean a(Material paramhz) {
/* 431 */     double d = this.posY + n();
/* 432 */     int i = MathHelper.floor_double(this.posX);
/* 433 */     int j = MathHelper.floor_float(MathHelper.floor_double(d));
/* 434 */     int k = MathHelper.floor_double(this.posZ);
/* 435 */     int m = this.worldObj.getBlockId(i, j, k);
/* 436 */     if (m != 0 && (Block.blocksList[m]).blockMaterial == paramhz) {
/* 437 */       float f1 = BlockFluid.b(this.worldObj.getBlockMetadata(i, j, k)) - 0.11111111F;
/* 438 */       float f2 = (j + 1) - f1;
/* 439 */       return (d < f2);
/*     */     } 
/* 441 */     return false;
/*     */   }
/*     */   
/*     */   protected float n() {
/* 445 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 449 */     return this.worldObj.a(this.boundingBox.expand(0.0D, -0.4000000059604645D, 0.0D), Material.g);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 453 */     float f1 = MathHelper.c(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
/* 454 */     if (f1 < 0.01F)
/*     */       return; 
/* 456 */     if (f1 < 1.0F) f1 = 1.0F; 
/* 457 */     f1 = paramFloat3 / f1;
/* 458 */     paramFloat1 *= f1;
/* 459 */     paramFloat2 *= f1;
/*     */ 
/*     */     
/* 462 */     float f2 = MathHelper.a(this.rotationYaw * 3.1415927F / 180.0F);
/* 463 */     float f3 = MathHelper.b(this.rotationYaw * 3.1415927F / 180.0F);
/*     */     
/* 465 */     this.motionX += (paramFloat1 * f3 - paramFloat2 * f2);
/* 466 */     this.motionZ += (paramFloat2 * f3 + paramFloat1 * f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public float b(float paramFloat) {
/* 471 */     int i = MathHelper.floor_double(this.posX);
/*     */     
/* 473 */     double d = (this.boundingBox.e - this.boundingBox.b) * 0.66D;
/* 474 */     int j = MathHelper.floor_double(this.posY - this.yOffset + d);
/* 475 */     int k = MathHelper.floor_double(this.posZ);
/* 476 */     return this.worldObj.j(i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPositionAndRotation(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 484 */     this.h = this.posX = paramDouble1;
/* 485 */     this.i = this.posY = paramDouble2;
/* 486 */     this.j = this.posZ = paramDouble3;
/* 487 */     this.rotationYaw = paramFloat1;
/* 488 */     this.rotationPitch = paramFloat2;
/* 489 */     this.ySize = 0.0F;
/*     */     
/* 491 */     double d = (this.s - paramFloat1);
/* 492 */     if (d < -180.0D) this.s += 360.0F; 
/* 493 */     if (d >= 180.0D) this.s -= 360.0F; 
/* 494 */     setPosition(this.posX, this.posY, this.posZ);
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 498 */     this.h = this.posX = paramDouble1;
/* 499 */     this.i = this.posY = paramDouble2 + this.yOffset;
/* 500 */     this.j = this.posZ = paramDouble3;
/* 501 */     this.rotationYaw = paramFloat1;
/* 502 */     this.rotationPitch = paramFloat2;
/* 503 */     setPosition(this.posX, this.posY, this.posZ);
/*     */   }
/*     */   
/*     */   public float a(Entity paramdb) {
/* 507 */     float f1 = (float)(this.posX - paramdb.posX);
/* 508 */     float f2 = (float)(this.posY - paramdb.posY);
/* 509 */     float f3 = (float)(this.posZ - paramdb.posZ);
/* 510 */     return MathHelper.c(f1 * f1 + f2 * f2 + f3 * f3);
/*     */   }
/*     */   
/*     */   public double getDistanceSq(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 514 */     double d1 = this.posX - paramDouble1;
/* 515 */     double d2 = this.posY - paramDouble2;
/* 516 */     double d3 = this.posZ - paramDouble3;
/* 517 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double e(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 521 */     double d1 = this.posX - paramDouble1;
/* 522 */     double d2 = this.posY - paramDouble2;
/* 523 */     double d3 = this.posZ - paramDouble3;
/* 524 */     return MathHelper.sqrt_double(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double b(Entity paramdb) {
/* 528 */     double d1 = this.posX - paramdb.posX;
/* 529 */     double d2 = this.posY - paramdb.posY;
/* 530 */     double d3 = this.posZ - paramdb.posZ;
/* 531 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onCollideWithPlayer(EntityPlayer parameq) {}
/*     */   
/*     */   public void c(Entity paramdb) {
/* 538 */     if (paramdb.e == this || paramdb.f == this)
/*     */       return; 
/* 540 */     double d1 = paramdb.posX - this.posX;
/* 541 */     double d2 = paramdb.posZ - this.posZ;
/*     */ 
/*     */     
/* 544 */     double d3 = MathHelper.a(d1, d2);
/*     */     
/* 546 */     if (d3 >= 0.009999999776482582D) {
/* 547 */       d3 = MathHelper.sqrt_double(d3);
/* 548 */       d1 /= d3;
/* 549 */       d2 /= d3;
/*     */       
/* 551 */       double d = 1.0D / d3;
/* 552 */       if (d > 1.0D) d = 1.0D; 
/* 553 */       d1 *= d;
/* 554 */       d2 *= d;
/*     */       
/* 556 */       d1 *= 0.05000000074505806D;
/* 557 */       d2 *= 0.05000000074505806D;
/*     */       
/* 559 */       d1 *= (1.0F - this.O);
/* 560 */       d2 *= (1.0F - this.O);
/*     */       
/* 562 */       f(-d1, 0.0D, -d2);
/* 563 */       paramdb.f(d1, 0.0D, d2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 568 */     this.motionX += paramDouble1;
/* 569 */     this.motionY += paramDouble2;
/* 570 */     this.motionZ += paramDouble3;
/*     */   }
/*     */   
/*     */   public boolean attackEntityFrom(Entity paramdb, int paramInt) {
/* 574 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c_() {
/* 582 */     return false;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 586 */     return false;
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
/*     */   public void b(Entity paramdb, int paramInt) {}
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
/*     */   public boolean c(NBTTagCompound paramr) {
/* 619 */     String str = q();
/* 620 */     if (this.isDead || str == null) {
/* 621 */       return false;
/*     */     }
/* 623 */     paramr.a("id", str);
/* 624 */     d(paramr);
/* 625 */     return true;
/*     */   }
/*     */   
/*     */   public void d(NBTTagCompound paramr) {
/* 629 */     paramr.a("Pos", a(new double[] { this.posX, this.posY, this.posZ}));
/* 630 */     paramr.a("Motion", a(new double[] { this.motionX, this.motionY, this.motionZ}));
/* 631 */     paramr.a("Rotation", a(new float[] { this.rotationYaw, this.rotationPitch}));
/*     */     
/* 633 */     paramr.a("FallDistance", this.H);
/* 634 */     paramr.setShort("Fire", (short)this.T);
/* 635 */     paramr.setShort("Air", (short)this.X);
/* 636 */     paramr.a("OnGround", this.onGround);
/*     */     
/* 638 */     writeEntityToNBT(paramr);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(NBTTagCompound paramr) {
/* 643 */     NBTTagList de1 = paramr.k("Pos");
/* 644 */     NBTTagList de2 = paramr.k("Motion");
/* 645 */     NBTTagList de3 = paramr.k("Rotation");
/* 646 */     setPosition(0.0D, 0.0D, 0.0D);
/*     */     
/* 648 */     this.motionX = ((NBTTagDouble)de2.a(0)).a;
/* 649 */     this.motionY = ((NBTTagDouble)de2.a(1)).a;
/* 650 */     this.motionZ = ((NBTTagDouble)de2.a(2)).a;
/*     */     
/* 652 */     this.h = this.I = this.posX = ((NBTTagDouble)de1.a(0)).a;
/* 653 */     this.i = this.J = this.posY = ((NBTTagDouble)de1.a(1)).a;
/* 654 */     this.j = this.K = this.posZ = ((NBTTagDouble)de1.a(2)).a;
/*     */     
/* 656 */     this.s = this.rotationYaw = ((NBTTagFloat)de3.a(0)).a;
/* 657 */     this.t = this.rotationPitch = ((NBTTagFloat)de3.a(1)).a;
/*     */     
/* 659 */     this.H = paramr.f("FallDistance");
/* 660 */     this.T = paramr.getShort("Fire");
/* 661 */     this.X = paramr.getShort("Air");
/* 662 */     this.onGround = paramr.getBoolean("OnGround");
/*     */     
/* 664 */     setPosition(this.posX, this.posY, this.posZ);
/*     */     
/* 666 */     readEntityFromNBT(paramr);
/*     */   }
/*     */   
/*     */   protected final String q() {
/* 670 */     return EntityList.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected NBTTagList a(double... paramVarArgs) {
/* 678 */     NBTTagList de = new NBTTagList();
/* 679 */     for (double d : paramVarArgs)
/* 680 */       de.a(new NBTTagDouble(d));
/* 681 */     return de;
/*     */   }
/*     */   
/*     */   protected NBTTagList a(float... paramVarArgs) {
/* 685 */     NBTTagList de = new NBTTagList();
/* 686 */     for (float f : paramVarArgs)
/* 687 */       de.a(new NBTTagFloat(f));
/* 688 */     return de;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityItem a(int paramInt1, int paramInt2) {
/* 696 */     return a(paramInt1, paramInt2, 0.0F);
/*     */   }
/*     */   
/*     */   public EntityItem a(int paramInt1, int paramInt2, float paramFloat) {
/* 700 */     EntityItem fa = new EntityItem(this.worldObj, this.posX, this.posY + paramFloat, this.posZ, new ItemStack(paramInt1, paramInt2));
/* 701 */     fa.delayBeforeCanPickup = 10;
/* 702 */     this.worldObj.a(fa);
/* 703 */     return fa;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 707 */     return !this.isDead;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 711 */     int i = MathHelper.floor_double(this.posX);
/* 712 */     int j = MathHelper.floor_double(this.posY + n());
/* 713 */     int k = MathHelper.floor_double(this.posZ);
/* 714 */     return this.worldObj.d(i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB d(Entity paramdb) {
/* 722 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Entity(World paramdp) {
/* 727 */     this.Y = false;
/*     */     this.worldObj = paramdp;
/*     */     setPosition(0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   public void t() {
/* 732 */     if (this.f.isDead) {
/* 733 */       this.f = null;
/*     */       return;
/*     */     } 
/* 736 */     this.motionX = 0.0D;
/* 737 */     this.motionY = 0.0D;
/* 738 */     this.motionZ = 0.0D;
/* 739 */     onUpdate();
/* 740 */     this.f.u();
/*     */     
/* 742 */     this.ae += (this.f.rotationYaw - this.f.s);
/* 743 */     this.ad += (this.f.rotationPitch - this.f.t);
/*     */     
/* 745 */     while (this.ae >= 180.0D)
/* 746 */       this.ae -= 360.0D; 
/* 747 */     while (this.ae < -180.0D) {
/* 748 */       this.ae += 360.0D;
/*     */     }
/* 750 */     while (this.ad >= 180.0D)
/* 751 */       this.ad -= 360.0D; 
/* 752 */     while (this.ad < -180.0D) {
/* 753 */       this.ad += 360.0D;
/*     */     }
/* 755 */     double d1 = this.ae * 0.5D;
/* 756 */     double d2 = this.ad * 0.5D;
/*     */     
/* 758 */     float f = 10.0F;
/* 759 */     if (d1 > f) d1 = f; 
/* 760 */     if (d1 < -f) d1 = -f; 
/* 761 */     if (d2 > f) d2 = f; 
/* 762 */     if (d2 < -f) d2 = -f;
/*     */     
/* 764 */     this.ae -= d1;
/* 765 */     this.ad -= d2;
/*     */     
/* 767 */     this.rotationYaw = (float)(this.rotationYaw + d1);
/* 768 */     this.rotationPitch = (float)(this.rotationPitch + d2);
/*     */   }
/*     */   
/*     */   protected void u() {
/* 772 */     this.e.setPosition(this.posX, this.posY + w() + this.e.v(), this.posZ);
/*     */   }
/*     */   
/*     */   public double v() {
/* 776 */     return this.yOffset;
/*     */   }
/*     */   
/*     */   public double w() {
/* 780 */     return this.D * 0.75D;
/*     */   }
/*     */   
/*     */   public void e(Entity paramdb) {
/* 784 */     this.ad = 0.0D;
/* 785 */     this.ae = 0.0D;
/* 786 */     if (this.f == paramdb) {
/* 787 */       this.f.e = null;
/* 788 */       this.f = null;
/* 789 */       c(paramdb.posX, paramdb.boundingBox.b + paramdb.D, paramdb.posZ, this.rotationYaw, this.rotationPitch);
/*     */       return;
/*     */     } 
/* 792 */     if (this.f != null) {
/* 793 */       this.f.e = null;
/*     */     }
/* 795 */     if (paramdb.e != null) {
/* 796 */       paramdb.e.f = null;
/*     */     }
/* 798 */     this.f = paramdb;
/* 799 */     paramdb.e = this;
/*     */   }
/*     */   
/*     */   protected abstract void readEntityFromNBT(NBTTagCompound paramr);
/*     */   
/*     */   protected abstract void writeEntityToNBT(NBTTagCompound paramr);
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\db.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */