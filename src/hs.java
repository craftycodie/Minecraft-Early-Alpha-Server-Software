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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hs
/*     */   extends db
/*     */   implements if
/*     */ {
/*  22 */   private gc[] ah = new gc[36];
/*     */ 
/*     */ 
/*     */   
/*  26 */   public int a = 0;
/*  27 */   public int b = 0;
/*  28 */   public int ac = 1;
/*     */   
/*     */   private boolean ai = false;
/*     */   public int ad;
/*     */   
/*     */   public hs(dp paramdp) {
/*  34 */     super(paramdp);
/*  35 */     this.d = true;
/*  36 */     a(0.98F, 0.7F);
/*  37 */     this.B = this.D / 2.0F;
/*  38 */     this.G = false;
/*     */   }
/*     */   public int ae; public double af; public double ag;
/*     */   public cy d(db paramdb) {
/*  42 */     return paramdb.u;
/*     */   }
/*     */   
/*     */   public cy l() {
/*  46 */     return this.u;
/*     */   }
/*     */   
/*     */   public boolean p() {
/*  50 */     return true;
/*     */   }
/*     */   
/*     */   public hs(dp paramdp, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/*  54 */     this(paramdp);
/*  55 */     a(paramDouble1, paramDouble2 + this.B, paramDouble3);
/*     */     
/*  57 */     this.n = 0.0D;
/*  58 */     this.o = 0.0D;
/*  59 */     this.p = 0.0D;
/*     */     
/*  61 */     this.h = paramDouble1;
/*  62 */     this.i = paramDouble2;
/*  63 */     this.j = paramDouble3;
/*  64 */     this.ad = paramInt;
/*     */   }
/*     */   
/*     */   public double w() {
/*  68 */     return this.D * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean a(db paramdb, int paramInt) {
/*  72 */     this.ac = -this.ac;
/*  73 */     this.b = 10;
/*  74 */     this.a += paramInt * 10;
/*  75 */     if (this.a > 40) {
/*  76 */       a(en.ax.aQ, 1, 0.0F);
/*  77 */       if (this.ad == 1) {
/*  78 */         a(et.au.ba, 1, 0.0F);
/*  79 */       } else if (this.ad == 2) {
/*  80 */         a(et.aB.ba, 1, 0.0F);
/*     */       } 
/*  82 */       i();
/*     */     } 
/*  84 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/*  88 */     return !this.A;
/*     */   }
/*     */   
/*     */   public void i() {
/*  92 */     for (byte b = 0; b < a(); b++) {
/*  93 */       gc gc1 = a(b);
/*  94 */       if (gc1 != null) {
/*  95 */         float f1 = this.Q.nextFloat() * 0.8F + 0.1F;
/*  96 */         float f2 = this.Q.nextFloat() * 0.8F + 0.1F;
/*  97 */         float f3 = this.Q.nextFloat() * 0.8F + 0.1F;
/*     */         
/*  99 */         while (gc1.a > 0) {
/* 100 */           int i = this.Q.nextInt(21) + 10;
/* 101 */           if (i > gc1.a) i = gc1.a; 
/* 102 */           gc1.a -= i;
/*     */           
/* 104 */           fa fa = new fa(this.g, this.k + f1, this.l + f2, this.m + f3, new gc(gc1.c, i, gc1.d));
/* 105 */           float f = 0.05F;
/* 106 */           fa.n = ((float)this.Q.nextGaussian() * f);
/* 107 */           fa.o = ((float)this.Q.nextGaussian() * f + 0.2F);
/* 108 */           fa.p = ((float)this.Q.nextGaussian() * f);
/* 109 */           this.g.a(fa);
/*     */         } 
/*     */       } 
/*     */     } 
/* 113 */     super.i();
/*     */   }
/*     */   
/* 116 */   private static final int[][][] aj = new int[][][] { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
/*     */ 
/*     */   
/*     */   private int ak;
/*     */   
/*     */   private double al;
/*     */   
/*     */   private double am;
/*     */   
/*     */   private double an;
/*     */   
/*     */   private double ao;
/*     */   
/*     */   private double ap;
/*     */ 
/*     */   
/*     */   public void b_() {
/* 133 */     if (this.g.t) {
/* 134 */       if (this.ak > 0) {
/* 135 */         double d6 = this.k + (this.al - this.k) / this.ak;
/* 136 */         double d7 = this.l + (this.am - this.l) / this.ak;
/* 137 */         double d8 = this.m + (this.an - this.m) / this.ak;
/*     */         
/* 139 */         double d9 = this.ao - this.q;
/* 140 */         while (d9 < -180.0D)
/* 141 */           d9 += 360.0D; 
/* 142 */         while (d9 >= 180.0D) {
/* 143 */           d9 -= 360.0D;
/*     */         }
/* 145 */         this.q = (float)(this.q + d9 / this.ak);
/* 146 */         this.r = (float)(this.r + (this.ap - this.r) / this.ak);
/*     */         
/* 148 */         this.ak--;
/* 149 */         a(d6, d7, d8);
/* 150 */         b(this.q, this.r);
/*     */       } else {
/* 152 */         a(this.k, this.l, this.m);
/* 153 */         b(this.q, this.r);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 158 */     if (this.b > 0) this.b--; 
/* 159 */     if (this.a > 0) this.a--; 
/* 160 */     this.h = this.k;
/* 161 */     this.i = this.l;
/* 162 */     this.j = this.m;
/*     */     
/* 164 */     this.o -= 0.03999999910593033D;
/*     */     
/* 166 */     int i = fw.b(this.k);
/* 167 */     int j = fw.b(this.l);
/* 168 */     int k = fw.b(this.m);
/* 169 */     if (this.g.a(i, j - 1, k) == et.aG.ba) {
/* 170 */       j--;
/*     */     }
/*     */     
/* 173 */     double d1 = 0.4D;
/* 174 */     boolean bool = false;
/*     */     
/* 176 */     double d2 = 0.0078125D;
/* 177 */     if (this.g.a(i, j, k) == et.aG.ba) {
/* 178 */       as as1 = g(this.k, this.l, this.m);
/* 179 */       int m = this.g.b(i, j, k);
/* 180 */       this.l = j;
/* 181 */       if (m >= 2 && m <= 5) {
/* 182 */         this.l = (j + 1);
/*     */       }
/*     */       
/* 185 */       if (m == 2) this.n -= d2; 
/* 186 */       if (m == 3) this.n += d2; 
/* 187 */       if (m == 4) this.p += d2; 
/* 188 */       if (m == 5) this.p -= d2;
/*     */       
/* 190 */       int[][] arrayOfInt = aj[m];
/*     */       
/* 192 */       double d6 = (arrayOfInt[1][0] - arrayOfInt[0][0]);
/* 193 */       double d7 = (arrayOfInt[1][2] - arrayOfInt[0][2]);
/* 194 */       double d8 = Math.sqrt(d6 * d6 + d7 * d7);
/*     */ 
/*     */       
/* 197 */       double d9 = this.n * d6 + this.p * d7;
/* 198 */       if (d9 < 0.0D) {
/* 199 */         d6 = -d6;
/* 200 */         d7 = -d7;
/*     */       } 
/*     */       
/* 203 */       double d10 = Math.sqrt(this.n * this.n + this.p * this.p);
/*     */       
/* 205 */       this.n = d10 * d6 / d8;
/* 206 */       this.p = d10 * d7 / d8;
/*     */       
/* 208 */       double d11 = 0.0D;
/* 209 */       double d12 = i + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 210 */       double d13 = k + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 211 */       double d14 = i + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 212 */       double d15 = k + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */       
/* 214 */       d6 = d14 - d12;
/* 215 */       d7 = d15 - d13;
/*     */       
/* 217 */       if (d6 == 0.0D) {
/* 218 */         this.k = i + 0.5D;
/* 219 */         d11 = this.m - k;
/* 220 */       } else if (d7 == 0.0D) {
/* 221 */         this.m = k + 0.5D;
/* 222 */         d11 = this.k - i;
/*     */       } else {
/*     */         
/* 225 */         double d18 = this.k - d12;
/* 226 */         double d19 = this.m - d13;
/*     */         
/* 228 */         double d20 = (d18 * d6 + d19 * d7) * 2.0D;
/* 229 */         d11 = d20;
/*     */       } 
/*     */       
/* 232 */       this.k = d12 + d6 * d11;
/* 233 */       this.m = d13 + d7 * d11;
/*     */       
/* 235 */       a(this.k, this.l + this.B, this.m);
/*     */       
/* 237 */       double d16 = this.n;
/* 238 */       double d17 = this.p;
/* 239 */       if (this.e != null) {
/* 240 */         d16 *= 0.75D;
/* 241 */         d17 *= 0.75D;
/*     */       } 
/* 243 */       if (d16 < -d1) d16 = -d1; 
/* 244 */       if (d16 > d1) d16 = d1; 
/* 245 */       if (d17 < -d1) d17 = -d1; 
/* 246 */       if (d17 > d1) d17 = d1; 
/* 247 */       c(d16, 0.0D, d17);
/*     */       
/* 249 */       if (arrayOfInt[0][1] != 0 && fw.b(this.k) - i == arrayOfInt[0][0] && fw.b(this.m) - k == arrayOfInt[0][2]) {
/* 250 */         a(this.k, this.l + arrayOfInt[0][1], this.m);
/* 251 */       } else if (arrayOfInt[1][1] != 0 && fw.b(this.k) - i == arrayOfInt[1][0] && fw.b(this.m) - k == arrayOfInt[1][2]) {
/* 252 */         a(this.k, this.l + arrayOfInt[1][1], this.m);
/*     */       } 
/*     */ 
/*     */       
/* 256 */       if (this.e != null) {
/* 257 */         this.n *= 0.996999979019165D;
/* 258 */         this.o *= 0.0D;
/* 259 */         this.p *= 0.996999979019165D;
/*     */       } else {
/* 261 */         if (this.ad == 2) {
/* 262 */           double d = fw.a(this.af * this.af + this.ag * this.ag);
/* 263 */           if (d > 0.01D) {
/* 264 */             bool = true;
/* 265 */             this.af /= d;
/* 266 */             this.ag /= d;
/* 267 */             double d18 = 0.04D;
/* 268 */             this.n *= 0.800000011920929D;
/* 269 */             this.o *= 0.0D;
/* 270 */             this.p *= 0.800000011920929D;
/* 271 */             this.n += this.af * d18;
/* 272 */             this.p += this.ag * d18;
/*     */           } else {
/* 274 */             this.n *= 0.8999999761581421D;
/* 275 */             this.o *= 0.0D;
/* 276 */             this.p *= 0.8999999761581421D;
/*     */           } 
/*     */         } 
/* 279 */         this.n *= 0.9599999785423279D;
/* 280 */         this.o *= 0.0D;
/* 281 */         this.p *= 0.9599999785423279D;
/*     */       } 
/*     */ 
/*     */       
/* 285 */       as as2 = g(this.k, this.l, this.m);
/* 286 */       if (as2 != null && as1 != null) {
/* 287 */         double d = (as1.b - as2.b) * 0.05D;
/*     */         
/* 289 */         d10 = Math.sqrt(this.n * this.n + this.p * this.p);
/* 290 */         if (d10 > 0.0D) {
/* 291 */           this.n = this.n / d10 * (d10 + d);
/* 292 */           this.p = this.p / d10 * (d10 + d);
/*     */         } 
/* 294 */         a(this.k, as2.b, this.m);
/*     */       } 
/*     */       
/* 297 */       int n = fw.b(this.k);
/* 298 */       int i1 = fw.b(this.m);
/* 299 */       if (n != i || i1 != k) {
/* 300 */         d10 = Math.sqrt(this.n * this.n + this.p * this.p);
/*     */         
/* 302 */         this.n = d10 * (n - i);
/* 303 */         this.p = d10 * (i1 - k);
/*     */       } 
/*     */       
/* 306 */       if (this.ad == 2) {
/* 307 */         double d = fw.a(this.af * this.af + this.ag * this.ag);
/* 308 */         if (d > 0.01D && this.n * this.n + this.p * this.p > 0.001D) {
/* 309 */           this.af /= d;
/* 310 */           this.ag /= d;
/*     */           
/* 312 */           if (this.af * this.n + this.ag * this.p < 0.0D) {
/* 313 */             this.af = 0.0D;
/* 314 */             this.ag = 0.0D;
/*     */           } else {
/* 316 */             this.af = this.n;
/* 317 */             this.ag = this.p;
/*     */           }
/*     */         
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 324 */       if (this.n < -d1) this.n = -d1; 
/* 325 */       if (this.n > d1) this.n = d1; 
/* 326 */       if (this.p < -d1) this.p = -d1; 
/* 327 */       if (this.p > d1) this.p = d1; 
/* 328 */       if (this.v) {
/* 329 */         this.n *= 0.5D;
/* 330 */         this.o *= 0.5D;
/* 331 */         this.p *= 0.5D;
/*     */       } 
/* 333 */       c(this.n, this.o, this.p);
/*     */       
/* 335 */       if (!this.v) {
/*     */         
/* 337 */         this.n *= 0.949999988079071D;
/* 338 */         this.o *= 0.949999988079071D;
/* 339 */         this.p *= 0.949999988079071D;
/*     */       } 
/*     */     } 
/*     */     
/* 343 */     this.r = 0.0F;
/* 344 */     double d3 = this.h - this.k;
/* 345 */     double d4 = this.j - this.m;
/* 346 */     if (d3 * d3 + d4 * d4 > 0.001D) {
/* 347 */       this.q = (float)(Math.atan2(d4, d3) * 180.0D / Math.PI);
/* 348 */       if (this.ai) this.q += 180.0F;
/*     */     
/*     */     } 
/* 351 */     double d5 = (this.q - this.s);
/* 352 */     while (d5 >= 180.0D)
/* 353 */       d5 -= 360.0D; 
/* 354 */     while (d5 < -180.0D)
/* 355 */       d5 += 360.0D; 
/* 356 */     if (d5 < -170.0D || d5 >= 170.0D) {
/* 357 */       this.q += 180.0F;
/* 358 */       this.ai = !this.ai;
/*     */     } 
/* 360 */     b(this.q, this.r);
/*     */     
/* 362 */     List<db> list = this.g.b(this, this.u.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 363 */     if (list != null && list.size() > 0) {
/* 364 */       for (byte b = 0; b < list.size(); b++) {
/* 365 */         db db1 = list.get(b);
/* 366 */         if (db1 != this.e && db1.p() && db1 instanceof hs) {
/* 367 */           db1.c(this);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 372 */     if (this.e != null && 
/* 373 */       this.e.A) this.e = null;
/*     */ 
/*     */     
/* 376 */     if (bool && this.Q.nextInt(4) == 0) {
/* 377 */       this.ae--;
/* 378 */       if (this.ae < 0) {
/* 379 */         this.af = this.ag = 0.0D;
/*     */       }
/* 381 */       this.g.a("largesmoke", this.k, this.l + 0.8D, this.m, 0.0D, 0.0D, 0.0D);
/*     */     } 
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
/*     */   public as g(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 426 */     int i = fw.b(paramDouble1);
/* 427 */     int j = fw.b(paramDouble2);
/* 428 */     int k = fw.b(paramDouble3);
/* 429 */     if (this.g.a(i, j - 1, k) == et.aG.ba) {
/* 430 */       j--;
/*     */     }
/*     */     
/* 433 */     if (this.g.a(i, j, k) == et.aG.ba) {
/* 434 */       int m = this.g.b(i, j, k);
/* 435 */       paramDouble2 = j;
/* 436 */       if (m >= 2 && m <= 5) {
/* 437 */         paramDouble2 = (j + 1);
/*     */       }
/*     */       
/* 440 */       int[][] arrayOfInt = aj[m];
/*     */       
/* 442 */       double d1 = 0.0D;
/* 443 */       double d2 = i + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 444 */       double d3 = j + 0.5D + arrayOfInt[0][1] * 0.5D;
/* 445 */       double d4 = k + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 446 */       double d5 = i + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 447 */       double d6 = j + 0.5D + arrayOfInt[1][1] * 0.5D;
/* 448 */       double d7 = k + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */       
/* 450 */       double d8 = d5 - d2;
/* 451 */       double d9 = (d6 - d3) * 2.0D;
/* 452 */       double d10 = d7 - d4;
/*     */       
/* 454 */       if (d8 == 0.0D) {
/* 455 */         paramDouble1 = i + 0.5D;
/* 456 */         d1 = paramDouble3 - k;
/* 457 */       } else if (d10 == 0.0D) {
/* 458 */         paramDouble3 = k + 0.5D;
/* 459 */         d1 = paramDouble1 - i;
/*     */       } else {
/*     */         
/* 462 */         double d11 = paramDouble1 - d2;
/* 463 */         double d12 = paramDouble3 - d4;
/*     */         
/* 465 */         double d13 = (d11 * d8 + d12 * d10) * 2.0D;
/* 466 */         d1 = d13;
/*     */       } 
/*     */       
/* 469 */       paramDouble1 = d2 + d8 * d1;
/* 470 */       paramDouble2 = d3 + d9 * d1;
/* 471 */       paramDouble3 = d4 + d10 * d1;
/* 472 */       if (d9 < 0.0D) paramDouble2++; 
/* 473 */       if (d9 > 0.0D) paramDouble2 += 0.5D; 
/* 474 */       return as.b(paramDouble1, paramDouble2, paramDouble3);
/*     */     } 
/* 476 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(r paramr) {
/* 480 */     paramr.a("Type", this.ad);
/*     */     
/* 482 */     if (this.ad == 2) {
/* 483 */       paramr.a("PushX", this.af);
/* 484 */       paramr.a("PushZ", this.ag);
/* 485 */       paramr.a("Fuel", (short)this.ae);
/* 486 */     } else if (this.ad == 1) {
/* 487 */       de de = new de();
/*     */       
/* 489 */       for (byte b = 0; b < this.ah.length; b++) {
/* 490 */         if (this.ah[b] != null) {
/* 491 */           r r1 = new r();
/* 492 */           r1.a("Slot", (byte)b);
/* 493 */           this.ah[b].a(r1);
/* 494 */           de.a(r1);
/*     */         } 
/*     */       } 
/* 497 */       paramr.a("Items", de);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(r paramr) {
/* 503 */     this.ad = paramr.d("Type");
/* 504 */     if (this.ad == 2) {
/* 505 */       this.af = paramr.g("PushX");
/* 506 */       this.ag = paramr.g("PushZ");
/* 507 */       this.ae = paramr.c("Fuel");
/* 508 */     } else if (this.ad == 1) {
/* 509 */       de de = paramr.k("Items");
/* 510 */       this.ah = new gc[a()];
/* 511 */       for (byte b = 0; b < de.b(); b++) {
/* 512 */         r r1 = (r)de.a(b);
/* 513 */         int i = r1.b("Slot") & 0xFF;
/* 514 */         if (i >= 0 && i < this.ah.length) this.ah[i] = new gc(r1);
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(db paramdb) {
/* 524 */     if (paramdb == this.e)
/* 525 */       return;  if (paramdb instanceof ic && !(paramdb instanceof eq) && this.ad == 0 && this.n * this.n + this.p * this.p > 0.01D && 
/* 526 */       this.e == null && paramdb.f == null) {
/* 527 */       paramdb.e(this);
/*     */     }
/*     */ 
/*     */     
/* 531 */     double d1 = paramdb.k - this.k;
/* 532 */     double d2 = paramdb.m - this.m;
/*     */     
/* 534 */     double d3 = d1 * d1 + d2 * d2;
/* 535 */     if (d3 >= 9.999999747378752E-5D) {
/* 536 */       d3 = fw.a(d3);
/* 537 */       d1 /= d3;
/* 538 */       d2 /= d3;
/* 539 */       double d = 1.0D / d3;
/* 540 */       if (d > 1.0D) d = 1.0D; 
/* 541 */       d1 *= d;
/* 542 */       d2 *= d;
/* 543 */       d1 *= 0.10000000149011612D;
/* 544 */       d2 *= 0.10000000149011612D;
/*     */ 
/*     */       
/* 547 */       d1 *= (1.0F - this.O);
/* 548 */       d2 *= (1.0F - this.O);
/* 549 */       d1 *= 0.5D;
/* 550 */       d2 *= 0.5D;
/*     */       
/* 552 */       if (paramdb instanceof hs) {
/* 553 */         double d4 = paramdb.n + this.n;
/* 554 */         double d5 = paramdb.p + this.p;
/*     */         
/* 556 */         if (((hs)paramdb).ad == 2 && this.ad != 2) {
/* 557 */           this.n *= 0.20000000298023224D;
/* 558 */           this.p *= 0.20000000298023224D;
/* 559 */           f(paramdb.n - d1, 0.0D, paramdb.p - d2);
/* 560 */           paramdb.n *= 0.699999988079071D;
/* 561 */           paramdb.p *= 0.699999988079071D;
/* 562 */         } else if (((hs)paramdb).ad != 2 && this.ad == 2) {
/* 563 */           paramdb.n *= 0.20000000298023224D;
/* 564 */           paramdb.p *= 0.20000000298023224D;
/* 565 */           paramdb.f(this.n + d1, 0.0D, this.p + d2);
/* 566 */           this.n *= 0.699999988079071D;
/* 567 */           this.p *= 0.699999988079071D;
/*     */         } else {
/* 569 */           d4 /= 2.0D;
/* 570 */           d5 /= 2.0D;
/* 571 */           this.n *= 0.20000000298023224D;
/* 572 */           this.p *= 0.20000000298023224D;
/* 573 */           f(d4 - d1, 0.0D, d5 - d2);
/* 574 */           paramdb.n *= 0.20000000298023224D;
/* 575 */           paramdb.p *= 0.20000000298023224D;
/* 576 */           paramdb.f(d4 + d1, 0.0D, d5 + d2);
/*     */         } 
/*     */       } else {
/*     */         
/* 580 */         f(-d1, 0.0D, -d2);
/* 581 */         paramdb.f(d1 / 4.0D, 0.0D, d2 / 4.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a() {
/* 587 */     return 27;
/*     */   }
/*     */   
/*     */   public gc a(int paramInt) {
/* 591 */     return this.ah[paramInt];
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */