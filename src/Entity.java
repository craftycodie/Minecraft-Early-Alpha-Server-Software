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
/*  19 */   private static int a = 0;
/*     */   
/*  21 */   public int c = a++;
/*     */   
/*     */   public boolean d = false;
/*     */   
/*     */   public Entity e;
/*     */   
/*     */   public Entity f;
/*     */   protected World g;
/*     */   public double h;
/*     */   public double i;
/*     */   public double j;
/*     */   public double k;
/*  33 */   public final AxisAlignedBB u = AxisAlignedBB.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); public double l; public double m; public double n; public double o; public double p; public float q; public float r; public float s; public float t;
/*     */   public boolean v = false;
/*     */   public boolean w;
/*     */   public boolean x;
/*     */   public boolean y = false;
/*     */   public boolean z = true;
/*     */   public boolean A = false;
/*  40 */   public float B = 0.0F;
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
/*  51 */   public float L = 0.0F;
/*  52 */   public float M = 0.0F;
/*     */   public boolean N = false;
/*  54 */   public float O = 0.0F;
/*     */   
/*     */   public boolean P = false;
/*  57 */   protected Random Q = new Random();
/*  58 */   public int R = 0;
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
/*  80 */       return (((Entity)paramObject).c == this.c);
/*     */     }
/*  82 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  86 */     return this.c;
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
/*     */   public void i() {
/* 106 */     this.A = true;
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat1, float paramFloat2) {
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
/* 123 */     this.q = paramFloat1;
/* 124 */     this.r = paramFloat2;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 128 */     this.k = paramDouble1;
/* 129 */     this.l = paramDouble2;
/* 130 */     this.m = paramDouble3;
/* 131 */     float f1 = this.C / 2.0F;
/* 132 */     float f2 = this.D;
/*     */     
/* 134 */     this.u.c(paramDouble1 - f1, paramDouble2 - this.B + this.L, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 - this.B + this.L + f2, paramDouble3 + f1);
/*     */   }
/*     */
/*     */   public void b_() {
/* 158 */     j();
/*     */   }
/*     */   
/*     */   public void j() {
/* 162 */     if (this.f != null && this.f.A) this.f = null;
/*     */     
/* 164 */     this.R++;
/* 165 */     this.E = this.F;
/* 166 */     this.h = this.k;
/* 167 */     this.i = this.l;
/* 168 */     this.j = this.m;
/* 169 */     this.t = this.r;
/* 170 */     this.s = this.q;
/*     */     
/* 172 */     if (m()) {
/* 173 */       if (!this.V && !this.ac) {
/* 174 */         float f1 = fw.a(this.n * this.n * 0.20000000298023224D + this.o * this.o + this.p * this.p * 0.20000000298023224D) * 0.2F;
/* 175 */         if (f1 > 1.0F) f1 = 1.0F; 
/* 176 */         this.g.a(this, "random.splash", f1, 1.0F + (this.Q.nextFloat() - this.Q.nextFloat()) * 0.4F);
/* 177 */         float f2 = fw.b(this.u.b);
/* 178 */         for (int b = 0; b < 1.0F + this.C * 20.0F; b++) {
/* 179 */           float f3 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 180 */           float f4 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 181 */           this.g.a("bubble", this.k + f3, (f2 + 1.0F), this.m + f4, this.n, this.o - (this.Q.nextFloat() * 0.2F), this.p);
/*     */         } 
/* 183 */         for (int b = 0; b < 1.0F + this.C * 20.0F; b++) {
/* 184 */           float f3 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 185 */           float f4 = (this.Q.nextFloat() * 2.0F - 1.0F) * this.C;
/* 186 */           this.g.a("splash", this.k + f3, (f2 + 1.0F), this.m + f4, this.n, this.o, this.p);
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
/* 198 */         a((Entity)null, 1);
/*     */       }
/* 200 */       this.T--;
/*     */     } 
/*     */     
/* 203 */     if (o()) {
/* 204 */       a((Entity)null, 10);
/* 205 */       this.T = 600;
/*     */     } 
/*     */     
/* 208 */     if (this.l < -64.0D) {
/* 209 */       k();
/*     */     }
/*     */     
/* 212 */     this.ac = false;
/*     */   }
/*     */   
/*     */   protected void k() {
/* 216 */     i();
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
/* 229 */     AxisAlignedBB cy1 = this.u.c(paramDouble1, paramDouble2, paramDouble3);
/* 230 */     List list = this.g.a(this, cy1);
/* 231 */     if (list.size() > 0) return false; 
/* 232 */     if (this.g.b(cy1)) return false;
/*     */     
/* 234 */     return true;
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 238 */     if (this.N) {
/* 239 */       this.u.d(paramDouble1, paramDouble2, paramDouble3);
/* 240 */       this.k = (this.u.a + this.u.d) / 2.0D;
/* 241 */       this.l = this.u.b + this.B - this.L;
/* 242 */       this.m = (this.u.c + this.u.f) / 2.0D;
/*     */       
/*     */       return;
/*     */     } 
/* 246 */     double d1 = this.k;
/* 247 */     double d2 = this.m;
/*     */     
/* 249 */     double d3 = paramDouble1;
/* 250 */     double d4 = paramDouble2;
/* 251 */     double d5 = paramDouble3;
/*     */     
/* 253 */     AxisAlignedBB cy1 = this.u.b();
/* 254 */     List<AxisAlignedBB> list = this.g.a(this, this.u.a(paramDouble1, paramDouble2, paramDouble3));
/*     */     
/*     */     int b1;
/* 257 */     for (b1 = 0; b1 < list.size(); b1++)
/* 258 */       paramDouble2 = ((AxisAlignedBB)list.get(b1)).b(this.u, paramDouble2);
/* 259 */     this.u.d(0.0D, paramDouble2, 0.0D);
/*     */     
/* 261 */     if (!this.z && d4 != paramDouble2) {
/* 262 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 265 */     b1 = (this.v || (d4 != paramDouble2 && d4 < 0.0D)) ? 1 : 0;
/*     */     
/*     */     byte b2;
/* 268 */     for (b2 = 0; b2 < list.size(); b2++)
/* 269 */       paramDouble1 = ((AxisAlignedBB)list.get(b2)).a(this.u, paramDouble1);
/* 270 */     this.u.d(paramDouble1, 0.0D, 0.0D);
/*     */     
/* 272 */     if (!this.z && d3 != paramDouble1) {
/* 273 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 276 */     for (b2 = 0; b2 < list.size(); b2++)
/* 277 */       paramDouble3 = ((AxisAlignedBB)list.get(b2)).c(this.u, paramDouble3);
/* 278 */     this.u.d(0.0D, 0.0D, paramDouble3);
/*     */     
/* 280 */     if (!this.z && d5 != paramDouble3) {
/* 281 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 284 */     if (this.M > 0.0F && b1 != 0 && this.L < 0.05F && (d3 != paramDouble1 || d5 != paramDouble3)) {
/* 285 */       double d8 = paramDouble1;
/* 286 */       double d9 = paramDouble2;
/* 287 */       double d10 = paramDouble3;
/*     */       
/* 289 */       paramDouble1 = d3;
/* 290 */       paramDouble2 = this.M;
/* 291 */       paramDouble3 = d5;
/*     */       
/* 293 */       AxisAlignedBB cy2 = this.u.b();
/* 294 */       this.u.b(cy1);
/* 295 */       list = this.g.a(this, this.u.a(paramDouble1, paramDouble2, paramDouble3));
/*     */       
/*     */       byte b;
/* 298 */       for (b = 0; b < list.size(); b++)
/* 299 */         paramDouble2 = ((AxisAlignedBB)list.get(b)).b(this.u, paramDouble2);
/* 300 */       this.u.d(0.0D, paramDouble2, 0.0D);
/*     */       
/* 302 */       if (!this.z && d4 != paramDouble2) {
/* 303 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */ 
/*     */       
/* 307 */       for (b = 0; b < list.size(); b++)
/* 308 */         paramDouble1 = ((AxisAlignedBB)list.get(b)).a(this.u, paramDouble1);
/* 309 */       this.u.d(paramDouble1, 0.0D, 0.0D);
/*     */       
/* 311 */       if (!this.z && d3 != paramDouble1) {
/* 312 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */       
/* 315 */       for (b = 0; b < list.size(); b++)
/* 316 */         paramDouble3 = ((AxisAlignedBB)list.get(b)).c(this.u, paramDouble3);
/* 317 */       this.u.d(0.0D, 0.0D, paramDouble3);
/*     */       
/* 319 */       if (!this.z && d5 != paramDouble3) {
/* 320 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */       
/* 323 */       if (d8 * d8 + d10 * d10 >= paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) {
/* 324 */         paramDouble1 = d8;
/* 325 */         paramDouble2 = d9;
/* 326 */         paramDouble3 = d10;
/* 327 */         this.u.b(cy2);
/*     */       } else {
/* 329 */         this.L = (float)(this.L + 0.5D);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 334 */     this.k = (this.u.a + this.u.d) / 2.0D;
/* 335 */     this.l = this.u.b + this.B - this.L;
/* 336 */     this.m = (this.u.c + this.u.f) / 2.0D;
/*     */     
/* 338 */     this.w = (d3 != paramDouble1 || d5 != paramDouble3);
/* 339 */     this.x = (d4 != paramDouble2);
/* 340 */     this.v = (d4 != paramDouble2 && d4 < 0.0D);
/* 341 */     this.y = (this.w || this.x);
/* 342 */     if (this.v)
/* 343 */     { if (this.H > 0.0F) {
/* 344 */         a(this.H);
/* 345 */         this.H = 0.0F;
/*     */       }
/*     */        }
/* 348 */     else if (paramDouble2 < 0.0D) { this.H = (float)(this.H - paramDouble2); }
/*     */ 
/*     */     
/* 351 */     if (d3 != paramDouble1) this.n = 0.0D; 
/* 352 */     if (d4 != paramDouble2) this.o = 0.0D; 
/* 353 */     if (d5 != paramDouble3) this.p = 0.0D;
/*     */     
/* 355 */     double d6 = this.k - d1;
/* 356 */     double d7 = this.m - d2;
/* 357 */     this.F = (float)(this.F + fw.a(d6 * d6 + d7 * d7) * 0.6D);
/*     */     
/* 359 */     if (this.G) {
/* 360 */       int i3 = fw.b(this.k);
/* 361 */       int i4 = fw.b(this.l - 0.20000000298023224D - this.B);
/* 362 */       int i5 = fw.b(this.m);
/* 363 */       int i6 = this.g.getBlockId(i3, i4, i5);
/* 364 */       if (this.F > this.b && i6 > 0) {
/* 365 */         this.b++;
/* 366 */         StepSound bl = (Block.blocksList[i6]).bj;
/* 367 */         if (this.g.getBlockId(i3, i4 + 1, i5) == Block.aS.blockId) {
/* 368 */           bl = Block.aS.bj;
/* 369 */           this.g.a(this, bl.c(), bl.a() * 0.15F, bl.b());
/* 370 */         } else if (!(Block.blocksList[i6]).blockMaterial.d()) {
/* 371 */           this.g.a(this, bl.c(), bl.a() * 0.15F, bl.b());
/*     */         } 
/* 373 */         Block.blocksList[i6].b(this.g, i3, i4, i5, this);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 378 */     int i = fw.b(this.u.a);
/* 379 */     int j = fw.b(this.u.b);
/* 380 */     int k = fw.b(this.u.c);
/* 381 */     int m = fw.b(this.u.d);
/* 382 */     int n = fw.b(this.u.e);
/* 383 */     int i1 = fw.b(this.u.f);
/* 384 */     for (int i2 = i; i2 <= m; i2++) {
/* 385 */       for (int i3 = j; i3 <= n; i3++) {
/* 386 */         for (int i4 = k; i4 <= i1; i4++) {
/* 387 */           int i5 = this.g.getBlockId(i2, i3, i4);
/* 388 */           if (i5 > 0) {
/* 389 */             Block.blocksList[i5].a(this.g, i2, i3, i4, this);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 394 */     this.L *= 0.4F;
/*     */     
/* 396 */     boolean bool = m();
/* 397 */     if (this.g.c(this.u)) {
/* 398 */       b(1);
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
/* 410 */       this.g.a(this, "random.fizz", 0.7F, 1.6F + (this.Q.nextFloat() - this.Q.nextFloat()) * 0.4F);
/* 411 */       this.T = -this.S;
/*     */     } 
/*     */   }
/*     */   
/*     */   public AxisAlignedBB l() {
/* 416 */     return null;
/*     */   }
/*     */   
/*     */   protected void b(int paramInt) {
/* 420 */     a((Entity)null, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(float paramFloat) {}
/*     */   
/*     */   public boolean m() {
/* 427 */     return this.g.a(this.u.b(0.0D, -0.4000000059604645D, 0.0D), Material.f, this);
/*     */   }
/*     */   
/*     */   public boolean a(Material paramhz) {
/* 431 */     double d = this.l + n();
/* 432 */     int i = fw.b(this.k);
/* 433 */     int j = fw.d(fw.b(d));
/* 434 */     int k = fw.b(this.m);
/* 435 */     int m = this.g.getBlockId(i, j, k);
/* 436 */     if (m != 0 && (Block.blocksList[m]).blockMaterial == paramhz) {
/* 437 */       float f1 = cg.b(this.g.getBlockMetadata(i, j, k)) - 0.11111111F;
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
/* 449 */     return this.g.a(this.u.b(0.0D, -0.4000000059604645D, 0.0D), Material.g);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 453 */     float f1 = fw.c(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
/* 454 */     if (f1 < 0.01F)
/*     */       return; 
/* 456 */     if (f1 < 1.0F) f1 = 1.0F; 
/* 457 */     f1 = paramFloat3 / f1;
/* 458 */     paramFloat1 *= f1;
/* 459 */     paramFloat2 *= f1;
/*     */ 
/*     */     
/* 462 */     float f2 = fw.a(this.q * 3.1415927F / 180.0F);
/* 463 */     float f3 = fw.b(this.q * 3.1415927F / 180.0F);
/*     */     
/* 465 */     this.n += (paramFloat1 * f3 - paramFloat2 * f2);
/* 466 */     this.p += (paramFloat2 * f3 + paramFloat1 * f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public float b(float paramFloat) {
/* 471 */     int i = fw.b(this.k);
/*     */     
/* 473 */     double d = (this.u.e - this.u.b) * 0.66D;
/* 474 */     int j = fw.b(this.l - this.B + d);
/* 475 */     int k = fw.b(this.m);
/* 476 */     return this.g.j(i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 484 */     this.h = this.k = paramDouble1;
/* 485 */     this.i = this.l = paramDouble2;
/* 486 */     this.j = this.m = paramDouble3;
/* 487 */     this.q = paramFloat1;
/* 488 */     this.r = paramFloat2;
/* 489 */     this.L = 0.0F;
/*     */     
/* 491 */     double d = (this.s - paramFloat1);
/* 492 */     if (d < -180.0D) this.s += 360.0F; 
/* 493 */     if (d >= 180.0D) this.s -= 360.0F; 
/* 494 */     a(this.k, this.l, this.m);
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 498 */     this.h = this.k = paramDouble1;
/* 499 */     this.i = this.l = paramDouble2 + this.B;
/* 500 */     this.j = this.m = paramDouble3;
/* 501 */     this.q = paramFloat1;
/* 502 */     this.r = paramFloat2;
/* 503 */     a(this.k, this.l, this.m);
/*     */   }
/*     */   
/*     */   public float a(Entity paramdb) {
/* 507 */     float f1 = (float)(this.k - paramdb.k);
/* 508 */     float f2 = (float)(this.l - paramdb.l);
/* 509 */     float f3 = (float)(this.m - paramdb.m);
/* 510 */     return fw.c(f1 * f1 + f2 * f2 + f3 * f3);
/*     */   }
/*     */   
/*     */   public double d(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 514 */     double d1 = this.k - paramDouble1;
/* 515 */     double d2 = this.l - paramDouble2;
/* 516 */     double d3 = this.m - paramDouble3;
/* 517 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double e(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 521 */     double d1 = this.k - paramDouble1;
/* 522 */     double d2 = this.l - paramDouble2;
/* 523 */     double d3 = this.m - paramDouble3;
/* 524 */     return fw.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double b(Entity paramdb) {
/* 528 */     double d1 = this.k - paramdb.k;
/* 529 */     double d2 = this.l - paramdb.l;
/* 530 */     double d3 = this.m - paramdb.m;
/* 531 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(EntityPlayer parameq) {}
/*     */   
/*     */   public void c(Entity paramdb) {
/* 538 */     if (paramdb.e == this || paramdb.f == this)
/*     */       return; 
/* 540 */     double d1 = paramdb.k - this.k;
/* 541 */     double d2 = paramdb.m - this.m;
/*     */ 
/*     */     
/* 544 */     double d3 = fw.a(d1, d2);
/*     */     
/* 546 */     if (d3 >= 0.009999999776482582D) {
/* 547 */       d3 = fw.a(d3);
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
/* 568 */     this.n += paramDouble1;
/* 569 */     this.o += paramDouble2;
/* 570 */     this.p += paramDouble3;
/*     */   }
/*     */   
/*     */   public boolean a(Entity paramdb, int paramInt) {
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
/* 620 */     if (this.A || str == null) {
/* 621 */       return false;
/*     */     }
/* 623 */     paramr.a("id", str);
/* 624 */     d(paramr);
/* 625 */     return true;
/*     */   }
/*     */   
/*     */   public void d(NBTTagCompound paramr) {
/* 629 */     paramr.a("Pos", a(new double[] { this.k, this.l, this.m }));
/* 630 */     paramr.a("Motion", a(new double[] { this.n, this.o, this.p }));
/* 631 */     paramr.a("Rotation", a(new float[] { this.q, this.r }));
/*     */     
/* 633 */     paramr.a("FallDistance", this.H);
/* 634 */     paramr.a("Fire", (short)this.T);
/* 635 */     paramr.a("Air", (short)this.X);
/* 636 */     paramr.a("OnGround", this.v);
/*     */     
/* 638 */     a(paramr);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(NBTTagCompound paramr) {
/* 643 */     NBTTagList de1 = paramr.k("Pos");
/* 644 */     NBTTagList de2 = paramr.k("Motion");
/* 645 */     NBTTagList de3 = paramr.k("Rotation");
/* 646 */     a(0.0D, 0.0D, 0.0D);
/*     */     
/* 648 */     this.n = ((NBTTagDouble)de2.a(0)).a;
/* 649 */     this.o = ((NBTTagDouble)de2.a(1)).a;
/* 650 */     this.p = ((NBTTagDouble)de2.a(2)).a;
/*     */     
/* 652 */     this.h = this.I = this.k = ((NBTTagDouble)de1.a(0)).a;
/* 653 */     this.i = this.J = this.l = ((NBTTagDouble)de1.a(1)).a;
/* 654 */     this.j = this.K = this.m = ((NBTTagDouble)de1.a(2)).a;
/*     */     
/* 656 */     this.s = this.q = ((NBTTagFloat)de3.a(0)).a;
/* 657 */     this.t = this.r = ((NBTTagFloat)de3.a(1)).a;
/*     */     
/* 659 */     this.H = paramr.f("FallDistance");
/* 660 */     this.T = paramr.c("Fire");
/* 661 */     this.X = paramr.c("Air");
/* 662 */     this.v = paramr.getBoolean("OnGround");
/*     */     
/* 664 */     a(this.k, this.l, this.m);
/*     */     
/* 666 */     b(paramr);
/*     */   }
/*     */   
/*     */   protected final String q() {
/* 670 */     return ge.a(this);
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
/* 700 */     EntityItem fa = new EntityItem(this.g, this.k, this.l + paramFloat, this.m, new ItemStack(paramInt1, paramInt2));
/* 701 */     fa.ac = 10;
/* 702 */     this.g.a(fa);
/* 703 */     return fa;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 707 */     return !this.A;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 711 */     int i = fw.b(this.k);
/* 712 */     int j = fw.b(this.l + n());
/* 713 */     int k = fw.b(this.m);
/* 714 */     return this.g.d(i, j, k);
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
/*     */     this.g = paramdp;
/*     */     a(0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   public void t() {
/* 732 */     if (this.f.A) {
/* 733 */       this.f = null;
/*     */       return;
/*     */     } 
/* 736 */     this.n = 0.0D;
/* 737 */     this.o = 0.0D;
/* 738 */     this.p = 0.0D;
/* 739 */     b_();
/* 740 */     this.f.u();
/*     */     
/* 742 */     this.ae += (this.f.q - this.f.s);
/* 743 */     this.ad += (this.f.r - this.f.t);
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
/* 767 */     this.q = (float)(this.q + d1);
/* 768 */     this.r = (float)(this.r + d2);
/*     */   }
/*     */   
/*     */   protected void u() {
/* 772 */     this.e.a(this.k, this.l + w() + this.e.v(), this.m);
/*     */   }
/*     */   
/*     */   public double v() {
/* 776 */     return this.B;
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
/* 789 */       c(paramdb.k, paramdb.u.b + paramdb.D, paramdb.m, this.q, this.r);
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
/*     */   protected abstract void b(NBTTagCompound paramr);
/*     */   
/*     */   protected abstract void a(NBTTagCompound paramr);
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\db.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */