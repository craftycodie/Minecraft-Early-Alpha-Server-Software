/*     */ import java.util.ArrayList;
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
/*     */ public class et
/*     */ {
/*  43 */   public static final bl e = new bl("stone", 1.0F, 1.0F);
/*  44 */   public static final bl f = new bl("wood", 1.0F, 1.0F);
/*  45 */   public static final bl g = new bl("gravel", 1.0F, 1.0F);
/*  46 */   public static final bl h = new bl("grass", 1.0F, 1.0F);
/*  47 */   public static final bl i = new bl("stone", 1.0F, 1.0F);
/*  48 */   public static final bl j = new bl("stone", 1.0F, 1.5F);
/*  49 */   public static final bl k = new aa("stone", 1.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   public static final bl l = new bl("cloth", 1.0F, 1.0F);
/*  55 */   public static final bl m = new z("sand", 1.0F, 1.0F);
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
/*  77 */   public static final et[] n = new et[256];
/*     */   
/*  79 */   public static final boolean[] o = new boolean[256];
/*  80 */   public static final boolean[] p = new boolean[256];
/*  81 */   public static final int[] q = new int[256];
/*  82 */   public static final boolean[] r = new boolean[256];
/*  83 */   public static final int[] s = new int[256];
/*     */ 
/*     */   
/*  86 */   public static final et t = (new cw(1, 1)).c(1.5F).b(10.0F).a(i);
/*  87 */   public static final gl u = (gl)(new gl(2)).c(0.6F).a(h);
/*  88 */   public static final et v = (new al(3, 2)).c(0.5F).a(g);
/*  89 */   public static final et w = (new et(4, 16, hz.d)).c(2.0F).b(10.0F).a(i);
/*  90 */   public static final et x = (new et(5, 4, hz.c)).c(2.0F).b(5.0F).a(f);
/*  91 */   public static final et y = (new ex(6, 15)).c(0.0F).a(h);
/*  92 */   public static final et z = (new et(7, 17, hz.d)).c(-1.0F).b(6000000.0F).a(i);
/*  93 */   public static final et A = (new ai(8, hz.f)).c(100.0F).c(3);
/*  94 */   public static final et B = (new v(9, hz.f)).c(100.0F).c(3);
/*  95 */   public static final et C = (new ai(10, hz.g)).c(0.0F).a(1.0F).c(255);
/*  96 */   public static final et D = (new v(11, hz.g)).c(100.0F).a(1.0F).c(255);
/*  97 */   public static final et E = (new em(12, 18)).c(0.5F).a(m);
/*  98 */   public static final et F = (new i(13, 19)).c(0.6F).a(g);
/*  99 */   public static final et G = (new f(14, 32)).c(3.0F).b(5.0F).a(i);
/* 100 */   public static final et H = (new f(15, 33)).c(3.0F).b(5.0F).a(i);
/* 101 */   public static final et I = (new f(16, 34)).c(3.0F).b(5.0F).a(i);
/* 102 */   public static final et J = (new fh(17)).c(2.0F).a(f);
/* 103 */   public static final bn K = (bn)(new bn(18, 52)).c(0.2F).c(1).a(h);
/* 104 */   public static final et L = (new gv(19)).c(0.6F).a(h);
/* 105 */   public static final et M = (new dt(20, 49, hz.o, false)).c(0.3F).a(k);
/* 106 */   public static final et N = null;
/* 107 */   public static final et O = null;
/* 108 */   public static final et P = null;
/* 109 */   public static final et Q = null;
/* 110 */   public static final et R = null;
/* 111 */   public static final et S = null;
/* 112 */   public static final et T = null;
/* 113 */   public static final et U = null;
/* 114 */   public static final et V = null;
/* 115 */   public static final et W = null;
/* 116 */   public static final et X = null;
/* 117 */   public static final et Y = null;
/* 118 */   public static final et Z = null;
/* 119 */   public static final et aa = null;
/* 120 */   public static final et ab = (new et(35, 64, hz.k)).c(0.8F).a(l);
/* 121 */   public static final et ac = null;
/* 122 */   public static final gb ad = (gb)(new gb(37, 13)).c(0.0F).a(h);
/* 123 */   public static final gb ae = (gb)(new gb(38, 12)).c(0.0F).a(h);
/* 124 */   public static final gb af = (gb)(new dx(39, 29)).c(0.0F).a(h).a(0.125F);
/* 125 */   public static final gb ag = (gb)(new dx(40, 28)).c(0.0F).a(h);
/* 126 */   public static final et ah = (new h(41, 39)).c(3.0F).b(10.0F).a(j);
/* 127 */   public static final et ai = (new h(42, 38)).c(5.0F).b(10.0F).a(j);
/* 128 */   public static final et aj = (new hy(43, true)).c(2.0F).b(10.0F).a(i);
/* 129 */   public static final et ak = (new hy(44, false)).c(2.0F).b(10.0F).a(i);
/* 130 */   public static final et al = (new et(45, 7, hz.d)).c(2.0F).b(10.0F).a(i);
/* 131 */   public static final et am = (new y(46, 8)).c(0.0F).a(h);
/* 132 */   public static final et an = (new ew(47, 35)).c(1.5F).a(f);
/* 133 */   public static final et ao = (new et(48, 36, hz.d)).c(2.0F).b(10.0F).a(i);
/* 134 */   public static final et ap = (new do(49, 37)).c(10.0F).b(2000.0F).a(i);
/* 135 */   public static final et aq = (new fp(50, 80)).c(0.0F).a(0.9375F).a(f);
/* 136 */   public static final hu ar = (hu)(new hu(51, 31)).c(0.0F).a(1.0F).a(f);
/* 137 */   public static final et as = (new bv(52, 65)).c(5.0F).a(j);
/* 138 */   public static final et at = new df(53, x);
/* 139 */   public static final et au = (new b(54)).c(2.5F).a(f);
/* 140 */   public static final et av = (new cz(55, 84)).c(0.0F).a(e);
/* 141 */   public static final et aw = (new f(56, 50)).c(3.0F).b(5.0F).a(i);
/* 142 */   public static final et ax = (new h(57, 40)).c(5.0F).b(10.0F).a(j);
/* 143 */   public static final et ay = (new ds(58)).c(2.5F).a(f);
/* 144 */   public static final et az = (new l(59, 88)).c(0.0F).a(h);
/* 145 */   public static final et aA = (new fm(60)).c(0.6F).a(g);
/* 146 */   public static final et aB = (new dm(61, false)).c(3.5F).a(i);
/* 147 */   public static final et aC = (new dm(62, true)).c(3.5F).a(i).a(0.875F);
/* 148 */   public static final et aD = (new eo(63, hp.class, true)).c(1.0F).a(f);
/* 149 */   public static final et aE = (new hn(64, hz.c)).c(3.0F).a(f);
/* 150 */   public static final et aF = (new cf(65, 83)).c(0.4F).a(f);
/* 151 */   public static final et aG = (new ar(66, 128)).c(0.7F).a(j);
/* 152 */   public static final et aH = new df(67, w);
/* 153 */   public static final et aI = (new eo(68, hp.class, false)).c(1.0F).a(f);
/* 154 */   public static final et aJ = (new hd(69, 96)).c(0.5F).a(f);
/* 155 */   public static final et aK = (new at(70, t.aZ, ck.b)).c(0.5F).a(i);
/* 156 */   public static final et aL = (new hn(71, hz.e)).c(5.0F).a(j);
/* 157 */   public static final et aM = (new at(72, x.aZ, ck.a)).c(0.5F).a(f);
/* 158 */   public static final et aN = (new aq(73, 51, false)).c(3.0F).b(5.0F).a(i);
/* 159 */   public static final et aO = (new aq(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(i);
/* 160 */   public static final et aP = (new bt(75, 115, false)).c(0.0F).a(f);
/* 161 */   public static final et aQ = (new bt(76, 99, true)).c(0.0F).a(0.5F).a(f);
/* 162 */   public static final et aR = (new ag(77, t.aZ)).c(0.5F).a(i);
/* 163 */   public static final et aS = (new gm(78, 66)).c(0.1F).a(l);
/* 164 */   public static final et aT = (new m(79, 67)).c(0.5F).c(3).a(k);
/* 165 */   public static final et aU = (new s(80, 66)).c(0.2F).a(l);
/* 166 */   public static final et aV = (new aj(81, 70)).c(0.4F).a(l);
/* 167 */   public static final et aW = (new co(82, 72)).c(0.6F).a(g);
/* 168 */   public static final et aX = (new ca(83, 73)).c(0.0F).a(h);
/* 169 */   public static final et aY = (new dw(84, 74)).c(2.0F).b(10.0F).a(i);
/*     */   public int aZ;
/*     */   public final int ba;
/*     */   
/*     */   static {
/* 174 */     for (byte b = 0; b < 'Ā'; b++) {
/* 175 */       if (n[b] != null) {
/* 176 */         en.c[b] = new be(b - 256);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected float bb;
/*     */   protected float bc;
/*     */   public double bd;
/*     */   public double be;
/* 186 */   public bl bj = e; public double bf; public double bg; public double bh;
/*     */   public double bi;
/* 188 */   public float bk = 1.0F;
/*     */   public final hz bl;
/* 190 */   public float bm = 0.6F;
/*     */   
/*     */   protected et(int paramInt, hz paramhz) {
/* 193 */     if (n[paramInt] != null) {
/* 194 */       throw new IllegalArgumentException("Slot " + paramInt + " is already occupied by " + n[paramInt] + " when adding " + this);
/*     */     }
/* 196 */     this.bl = paramhz;
/* 197 */     n[paramInt] = this;
/* 198 */     this.ba = paramInt;
/* 199 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 200 */     p[paramInt] = b();
/* 201 */     q[paramInt] = b() ? 255 : 0;
/* 202 */     r[paramInt] = f();
/*     */   }
/*     */   
/*     */   protected et(int paramInt1, int paramInt2, hz paramhz) {
/* 206 */     this(paramInt1, paramhz);
/* 207 */     this.aZ = paramInt2;
/*     */   }
/*     */   
/*     */   protected et a(bl parambl) {
/* 211 */     this.bj = parambl;
/* 212 */     return this;
/*     */   }
/*     */   
/*     */   protected et c(int paramInt) {
/* 216 */     q[this.ba] = paramInt;
/* 217 */     return this;
/*     */   }
/*     */   
/*     */   protected et a(float paramFloat) {
/* 221 */     s[this.ba] = (int)(15.0F * paramFloat);
/* 222 */     return this;
/*     */   }
/*     */   
/*     */   protected et b(float paramFloat) {
/* 226 */     this.bc = paramFloat * 3.0F;
/* 227 */     return this;
/*     */   }
/*     */   
/*     */   private boolean f() {
/* 231 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 239 */     return 0;
/*     */   }
/*     */   
/*     */   protected et c(float paramFloat) {
/* 243 */     this.bb = paramFloat;
/* 244 */     if (this.bc < paramFloat * 5.0F) this.bc = paramFloat * 5.0F; 
/* 245 */     return this;
/*     */   }
/*     */   
/*     */   protected void a(boolean paramBoolean) {
/* 249 */     o[this.ba] = paramBoolean;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 253 */     this.bd = paramFloat1;
/* 254 */     this.be = paramFloat2;
/* 255 */     this.bf = paramFloat3;
/* 256 */     this.bg = paramFloat4;
/* 257 */     this.bh = paramFloat5;
/* 258 */     this.bi = paramFloat6;
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
/*     */   public boolean a(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 276 */     if (paramInt4 == 0 && this.be > 0.0D) return true; 
/* 277 */     if (paramInt4 == 1 && this.bh < 1.0D) return true; 
/* 278 */     if (paramInt4 == 2 && this.bf > 0.0D) return true; 
/* 279 */     if (paramInt4 == 3 && this.bi < 1.0D) return true; 
/* 280 */     if (paramInt4 == 4 && this.bd > 0.0D) return true; 
/* 281 */     if (paramInt4 == 5 && this.bg < 1.0D) return true; 
/* 282 */     return !paramhb.d(paramInt1, paramInt2, paramInt3);
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
/*     */   public int a(int paramInt) {
/* 294 */     return this.aZ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, cy paramcy, ArrayList<cy> paramArrayList) {
/* 302 */     cy cy1 = d(paramdp, paramInt1, paramInt2, paramInt3);
/* 303 */     if (cy1 != null && paramcy.a(cy1)) paramArrayList.add(cy1); 
/*     */   }
/*     */   
/*     */   public cy d(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 307 */     return cy.b(paramInt1 + this.bd, paramInt2 + this.be, paramInt3 + this.bf, paramInt1 + this.bg, paramInt2 + this.bh, paramInt3 + this.bi);
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 311 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/* 315 */     return e();
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 319 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 338 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public int a(Random paramRandom) {
/* 348 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 352 */     return this.ba;
/*     */   }
/*     */   
/*     */   public float a(eq parameq) {
/* 356 */     if (this.bb < 0.0F) return 0.0F; 
/* 357 */     if (!parameq.b(this)) return 1.0F / this.bb / 100.0F; 
/* 358 */     return parameq.a(this) / this.bb / 30.0F;
/*     */   }
/*     */   
/*     */   public void a_(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 362 */     a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
/* 366 */     if (paramdp.t)
/* 367 */       return;  int i = a(paramdp.k);
/* 368 */     for (byte b = 0; b < i; b++) {
/* 369 */       if (paramdp.k.nextFloat() <= paramFloat) {
/* 370 */         int j = a(paramInt4, paramdp.k);
/* 371 */         if (j > 0) {
/* 372 */           float f = 0.7F;
/* 373 */           double d1 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 374 */           double d2 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 375 */           double d3 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 376 */           fa fa = new fa(paramdp, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, new gc(j));
/* 377 */           fa.ac = 10;
/* 378 */           paramdp.a(fa);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } public float a(db paramdb) {
/* 383 */     return this.bc / 5.0F;
/*     */   }
/*     */   
/*     */   public fe a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, as paramas1, as paramas2) {
/* 387 */     a(paramdp, paramInt1, paramInt2, paramInt3);
/* 388 */     paramas1 = paramas1.c(-paramInt1, -paramInt2, -paramInt3);
/* 389 */     paramas2 = paramas2.c(-paramInt1, -paramInt2, -paramInt3);
/*     */     
/* 391 */     as as1 = paramas1.a(paramas2, this.bd);
/* 392 */     as as2 = paramas1.a(paramas2, this.bg);
/*     */     
/* 394 */     as as3 = paramas1.b(paramas2, this.be);
/* 395 */     as as4 = paramas1.b(paramas2, this.bh);
/*     */     
/* 397 */     as as5 = paramas1.c(paramas2, this.bf);
/* 398 */     as as6 = paramas1.c(paramas2, this.bi);
/*     */     
/* 400 */     if (!a(as1)) as1 = null; 
/* 401 */     if (!a(as2)) as2 = null; 
/* 402 */     if (!b(as3)) as3 = null; 
/* 403 */     if (!b(as4)) as4 = null; 
/* 404 */     if (!c(as5)) as5 = null; 
/* 405 */     if (!c(as6)) as6 = null;
/*     */     
/* 407 */     as as7 = null;
/*     */     
/* 409 */     if (as1 != null && (as7 == null || paramas1.a(as1) < paramas1.a(as7))) as7 = as1; 
/* 410 */     if (as2 != null && (as7 == null || paramas1.a(as2) < paramas1.a(as7))) as7 = as2; 
/* 411 */     if (as3 != null && (as7 == null || paramas1.a(as3) < paramas1.a(as7))) as7 = as3; 
/* 412 */     if (as4 != null && (as7 == null || paramas1.a(as4) < paramas1.a(as7))) as7 = as4; 
/* 413 */     if (as5 != null && (as7 == null || paramas1.a(as5) < paramas1.a(as7))) as7 = as5; 
/* 414 */     if (as6 != null && (as7 == null || paramas1.a(as6) < paramas1.a(as7))) as7 = as6;
/*     */     
/* 416 */     if (as7 == null) return null;
/*     */     
/* 418 */     byte b = -1;
/*     */     
/* 420 */     if (as7 == as1) b = 4; 
/* 421 */     if (as7 == as2) b = 5; 
/* 422 */     if (as7 == as3) b = 0; 
/* 423 */     if (as7 == as4) b = 1; 
/* 424 */     if (as7 == as5) b = 2; 
/* 425 */     if (as7 == as6) b = 3;
/*     */     
/* 427 */     return new fe(paramInt1, paramInt2, paramInt3, b, as7.c(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   private boolean a(as paramas) {
/* 431 */     if (paramas == null) return false; 
/* 432 */     return (paramas.b >= this.be && paramas.b <= this.bh && paramas.c >= this.bf && paramas.c <= this.bi);
/*     */   }
/*     */   
/*     */   private boolean b(as paramas) {
/* 436 */     if (paramas == null) return false; 
/* 437 */     return (paramas.a >= this.bd && paramas.a <= this.bg && paramas.c >= this.bf && paramas.c <= this.bi);
/*     */   }
/*     */   
/*     */   private boolean c(as paramas) {
/* 441 */     if (paramas == null) return false; 
/* 442 */     return (paramas.a >= this.bd && paramas.a <= this.bg && paramas.b >= this.be && paramas.b <= this.bh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 453 */     int i = paramdp.a(paramInt1, paramInt2, paramInt3);
/* 454 */     return (i == 0 || (n[i]).bl.d());
/*     */   }
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/* 458 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, db paramdb) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, db paramdb, as paramas) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(hb paramhb, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 492 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 496 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, db paramdb) {}
/*     */   
/*     */   public boolean d(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 503 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean f(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 514 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\et.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */