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
/*     */ public class fz
/*     */   implements if
/*     */ {
/*  17 */   public gc[] a = new gc[36];
/*  18 */   public gc[] b = new gc[4];
/*  19 */   public gc[] c = new gc[4];
/*  20 */   public int d = 0;
/*     */   private eq e;
/*     */   
/*     */   public fz(eq parameq) {
/*  24 */     this.e = parameq;
/*     */   }
/*     */   
/*     */   public gc b() {
/*  28 */     return this.a[this.d];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int c(int paramInt) {
/*  39 */     for (byte b = 0; b < this.a.length; b++) {
/*  40 */       if (this.a[b] != null && (this.a[b]).c == paramInt && (this.a[b]).a < this.a[b].b() && (this.a[b]).a < d()) return b; 
/*     */     } 
/*  42 */     return -1;
/*     */   }
/*     */   
/*     */   private int g() {
/*  46 */     for (byte b = 0; b < this.a.length; b++) {
/*  47 */       if (this.a[b] == null) return b; 
/*     */     } 
/*  49 */     return -1;
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
/*     */   private int a(int paramInt1, int paramInt2) {
/*  95 */     int i = c(paramInt1);
/*  96 */     if (i < 0) i = g(); 
/*  97 */     if (i < 0) return paramInt2; 
/*  98 */     if (this.a[i] == null) {
/*  99 */       this.a[i] = new gc(paramInt1, 0);
/*     */     }
/*     */     
/* 102 */     int j = paramInt2;
/* 103 */     if (j > this.a[i].b() - (this.a[i]).a) {
/* 104 */       j = this.a[i].b() - (this.a[i]).a;
/*     */     }
/* 106 */     if (j > d() - (this.a[i]).a) {
/* 107 */       j = d() - (this.a[i]).a;
/*     */     }
/*     */     
/* 110 */     if (j == 0) return paramInt2;
/*     */     
/* 112 */     paramInt2 -= j;
/* 113 */     (this.a[i]).a += j;
/* 114 */     (this.a[i]).b = 5;
/*     */     
/* 116 */     return paramInt2;
/*     */   }
/*     */   
/*     */   public void c() {
/* 120 */     for (byte b = 0; b < this.a.length; b++) {
/* 121 */       if (this.a[b] != null && (this.a[b]).b > 0) (this.a[b]).b--;
/*     */     
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
/*     */   public boolean a(gc paramgc) {
/* 139 */     if (paramgc.d == 0) {
/* 140 */       paramgc.a = a(paramgc.c, paramgc.a);
/* 141 */       if (paramgc.a == 0) return true;
/*     */     
/*     */     } 
/* 144 */     int i = g();
/* 145 */     if (i >= 0) {
/* 146 */       this.a[i] = paramgc;
/* 147 */       (this.a[i]).b = 5;
/* 148 */       return true;
/*     */     } 
/* 150 */     return false;
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
/*     */   public void a(int paramInt, gc paramgc) {
/* 175 */     gc[] arrayOfGc = this.a;
/* 176 */     if (paramInt >= arrayOfGc.length) {
/* 177 */       paramInt -= arrayOfGc.length;
/* 178 */       arrayOfGc = this.b;
/*     */     } 
/* 180 */     if (paramInt >= arrayOfGc.length) {
/* 181 */       paramInt -= arrayOfGc.length;
/* 182 */       arrayOfGc = this.c;
/*     */     } 
/*     */     
/* 185 */     arrayOfGc[paramInt] = paramgc;
/*     */   }
/*     */   
/*     */   public float a(et paramet) {
/* 189 */     float f = 1.0F;
/* 190 */     if (this.a[this.d] != null) f *= this.a[this.d].a(paramet); 
/* 191 */     return f;
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
/*     */   public int a() {
/* 236 */     return this.a.length + 4;
/*     */   }
/*     */   
/*     */   public gc a(int paramInt) {
/* 240 */     gc[] arrayOfGc = this.a;
/* 241 */     if (paramInt >= arrayOfGc.length) {
/* 242 */       paramInt -= arrayOfGc.length;
/* 243 */       arrayOfGc = this.b;
/*     */     } 
/* 245 */     if (paramInt >= arrayOfGc.length) {
/* 246 */       paramInt -= arrayOfGc.length;
/* 247 */       arrayOfGc = this.c;
/*     */     } 
/*     */     
/* 250 */     return arrayOfGc[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 258 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(et paramet) {
/* 268 */     if (paramet.bl != hz.d && paramet.bl != hz.e && paramet.bl != hz.t && paramet.bl != hz.s) return true;
/*     */     
/* 270 */     gc gc1 = a(this.d);
/* 271 */     if (gc1 != null) return gc1.b(paramet); 
/* 272 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int e() {
/* 280 */     int i = 0;
/* 281 */     int j = 0;
/* 282 */     int k = 0;
/* 283 */     for (byte b = 0; b < this.b.length; b++) {
/* 284 */       if (this.b[b] != null && this.b[b].a() instanceof ga) {
/* 285 */         int m = this.b[b].c();
/* 286 */         int n = (this.b[b]).d;
/*     */         
/* 288 */         int i1 = m - n;
/* 289 */         j += i1;
/* 290 */         k += m;
/*     */         
/* 292 */         int i2 = ((ga)this.b[b].a()).aW;
/*     */         
/* 294 */         i += i2;
/*     */       } 
/*     */     } 
/* 297 */     if (k == 0) return 0; 
/* 298 */     return (i - 1) * j / k + 1;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 302 */     for (byte b = 0; b < this.b.length; b++) {
/* 303 */       if (this.b[b] != null && this.b[b].a() instanceof ga) {
/* 304 */         this.b[b].a(paramInt);
/* 305 */         if ((this.b[b]).a == 0) {
/* 306 */           this.b[b].a(this.e);
/* 307 */           this.b[b] = null;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void f() {
/*     */     byte b;
/* 314 */     for (b = 0; b < this.a.length; b++) {
/* 315 */       if (this.a[b] != null) {
/* 316 */         this.e.a(this.a[b], true);
/* 317 */         this.a[b] = null;
/*     */       } 
/*     */     } 
/* 320 */     for (b = 0; b < this.b.length; b++) {
/* 321 */       if (this.b[b] != null) {
/* 322 */         this.e.a(this.b[b], true);
/* 323 */         this.b[b] = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */