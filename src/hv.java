/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hv
/*     */ {
/*     */   public static boolean a;
/*     */   public byte[] b;
/*     */   public boolean c;
/*     */   public dp d;
/*     */   public gh e;
/*     */   public gh f;
/*     */   public gh g;
/*     */   public byte[] h;
/*     */   public int i;
/*     */   public final int j;
/*     */   public final int k;
/*  27 */   public Map l = new HashMap<Object, Object>();
/*  28 */   public List[] m = new List[8];
/*     */   
/*     */   public boolean n = false;
/*     */   public boolean o = false;
/*     */   public boolean p;
/*     */   public boolean q = false;
/*     */   public boolean r = false;
/*  35 */   public long s = 0L;
/*     */   
/*     */   public hv(dp paramdp, int paramInt1, int paramInt2) {
/*  38 */     this.d = paramdp;
/*  39 */     this.j = paramInt1;
/*  40 */     this.k = paramInt2;
/*  41 */     this.h = new byte[256];
/*  42 */     for (byte b = 0; b < this.m.length; b++) {
/*  43 */       this.m[b] = new ArrayList();
/*     */     }
/*     */   }
/*     */   
/*     */   public hv(dp paramdp, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  48 */     this(paramdp, paramInt1, paramInt2);
/*     */     
/*  50 */     this.b = paramArrayOfbyte;
/*  51 */     this.e = new gh(paramArrayOfbyte.length);
/*  52 */     this.f = new gh(paramArrayOfbyte.length);
/*  53 */     this.g = new gh(paramArrayOfbyte.length);
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2) {
/*  57 */     return (paramInt1 == this.j && paramInt2 == this.k);
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2) {
/*  61 */     return this.h[paramInt2 << 4 | paramInt1] & 0xFF;
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
/*     */   public void a() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  84 */     int i = 127; byte b;
/*  85 */     for (b = 0; b < 16; b++) {
/*  86 */       for (byte b1 = 0; b1 < 16; b1++) {
/*  87 */         this.h[b1 << 4 | b] = Byte.MIN_VALUE;
/*  88 */         g(b, 127, b1);
/*  89 */         if ((this.h[b1 << 4 | b] & 0xFF) < i) i = this.h[b1 << 4 | b] & 0xFF; 
/*     */       } 
/*     */     } 
/*  92 */     this.i = i;
/*     */     
/*  94 */     for (b = 0; b < 16; b++) {
/*  95 */       for (byte b1 = 0; b1 < 16; b1++) {
/*  96 */         c(b, b1);
/*     */       }
/*     */     } 
/*  99 */     this.o = true;
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2) {
/* 103 */     int i = b(paramInt1, paramInt2);
/*     */     
/* 105 */     int j = this.j * 16 + paramInt1;
/* 106 */     int k = this.k * 16 + paramInt2;
/* 107 */     f(j - 1, k, i);
/* 108 */     f(j + 1, k, i);
/* 109 */     f(j, k - 1, i);
/* 110 */     f(j, k + 1, i);
/*     */   }
/*     */   
/*     */   private void f(int paramInt1, int paramInt2, int paramInt3) {
/* 114 */     int i = this.d.c(paramInt1, paramInt2);
/* 115 */     if (i > paramInt3) {
/* 116 */       this.d.a(cr.a, paramInt1, paramInt3, paramInt2, paramInt1, i, paramInt2);
/* 117 */     } else if (i < paramInt3) {
/* 118 */       this.d.a(cr.a, paramInt1, i, paramInt2, paramInt1, paramInt3, paramInt2);
/*     */     } 
/* 120 */     this.o = true;
/*     */   }
/*     */   
/*     */   private void g(int paramInt1, int paramInt2, int paramInt3) {
/* 124 */     int i = this.h[paramInt3 << 4 | paramInt1] & 0xFF;
/* 125 */     int j = i;
/* 126 */     if (paramInt2 > i) j = paramInt2;
/*     */     
/* 128 */     int k = paramInt1 << 11 | paramInt3 << 7;
/* 129 */     while (j > 0 && et.q[this.b[k + j - 1]] == 0)
/* 130 */       j--; 
/* 131 */     if (j == i)
/*     */       return; 
/* 133 */     this.d.f(paramInt1, paramInt3, j, i);
/* 134 */     this.h[paramInt3 << 4 | paramInt1] = (byte)j;
/*     */     
/* 136 */     if (j < this.i) {
/* 137 */       this.i = j;
/*     */     } else {
/* 139 */       int i3 = 127;
/* 140 */       for (byte b = 0; b < 16; b++) {
/* 141 */         for (byte b1 = 0; b1 < 16; b1++) {
/* 142 */           if ((this.h[b1 << 4 | b] & 0xFF) < i3) i3 = this.h[b1 << 4 | b] & 0xFF; 
/*     */         } 
/* 144 */       }  this.i = i3;
/*     */     } 
/*     */     
/* 147 */     int m = this.j * 16 + paramInt1;
/* 148 */     int n = this.k * 16 + paramInt3;
/* 149 */     if (j < i) {
/* 150 */       for (int i3 = j; i3 < i; i3++) {
/* 151 */         this.f.a(paramInt1, i3, paramInt3, 15);
/*     */       }
/*     */     } else {
/* 154 */       this.d.a(cr.a, m, i, n, m, j, n);
/* 155 */       for (int i3 = i; i3 < j; i3++) {
/* 156 */         this.f.a(paramInt1, i3, paramInt3, 0);
/*     */       }
/*     */     } 
/*     */     
/* 160 */     int i1 = 15;
/* 161 */     int i2 = j;
/* 162 */     while (j > 0 && i1 > 0) {
/* 163 */       j--;
/* 164 */       int i3 = et.q[a(paramInt1, j, paramInt3)];
/* 165 */       if (i3 == 0) i3 = 1; 
/* 166 */       i1 -= i3;
/* 167 */       if (i1 < 0) i1 = 0; 
/* 168 */       this.f.a(paramInt1, j, paramInt3, i1);
/*     */     } 
/*     */     
/* 171 */     while (j > 0 && et.q[a(paramInt1, j - 1, paramInt3)] == 0)
/* 172 */       j--; 
/* 173 */     if (j != i2) {
/* 174 */       this.d.a(cr.a, m - 1, j, n - 1, m + 1, i2, n + 1);
/*     */     }
/*     */     
/* 177 */     this.o = true;
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/* 181 */     return this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2];
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 185 */     byte b = (byte)paramInt4;
/*     */     
/* 187 */     int i = this.h[paramInt3 << 4 | paramInt1] & 0xFF;
/*     */     
/* 189 */     int j = this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] & 0xFF;
/* 190 */     if (j == paramInt4) return false; 
/* 191 */     int k = this.j * 16 + paramInt1;
/* 192 */     int m = this.k * 16 + paramInt3;
/* 193 */     this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] = b;
/* 194 */     if (j != 0 && 
/* 195 */       !this.d.t) et.n[j].b(this.d, k, paramInt2, m);
/*     */     
/* 197 */     this.e.a(paramInt1, paramInt2, paramInt3, paramInt5);
/*     */     
/* 199 */     if (et.q[b] != 0) {
/* 200 */       if (paramInt2 >= i) {
/* 201 */         g(paramInt1, paramInt2 + 1, paramInt3);
/*     */       }
/*     */     }
/* 204 */     else if (paramInt2 == i - 1) {
/* 205 */       g(paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 210 */     this.d.a(cr.a, k, paramInt2, m, k, paramInt2, m);
/* 211 */     this.d.a(cr.b, k, paramInt2, m, k, paramInt2, m);
/*     */     
/* 213 */     c(paramInt1, paramInt3);
/*     */ 
/*     */     
/* 216 */     if (paramInt4 != 0) {
/* 217 */       et.n[paramInt4].e(this.d, k, paramInt2, m);
/*     */     }
/*     */     
/* 220 */     this.o = true;
/* 221 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 225 */     byte b = (byte)paramInt4;
/* 226 */     int i = this.h[paramInt3 << 4 | paramInt1] & 0xFF;
/*     */     
/* 228 */     int j = this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] & 0xFF;
/* 229 */     if (j == paramInt4) return false; 
/* 230 */     int k = this.j * 16 + paramInt1;
/* 231 */     int m = this.k * 16 + paramInt3;
/* 232 */     this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] = b;
/* 233 */     if (j != 0) {
/* 234 */       et.n[j].b(this.d, k, paramInt2, m);
/*     */     }
/* 236 */     this.e.a(paramInt1, paramInt2, paramInt3, 0);
/*     */ 
/*     */     
/* 239 */     if (et.q[b] != 0) {
/* 240 */       if (paramInt2 >= i) {
/* 241 */         g(paramInt1, paramInt2 + 1, paramInt3);
/*     */       }
/*     */     }
/* 244 */     else if (paramInt2 == i - 1) {
/* 245 */       g(paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 250 */     this.d.a(cr.a, k, paramInt2, m, k, paramInt2, m);
/* 251 */     this.d.a(cr.b, k, paramInt2, m, k, paramInt2, m);
/*     */     
/* 253 */     c(paramInt1, paramInt3);
/*     */ 
/*     */     
/* 256 */     if (paramInt4 != 0 && 
/* 257 */       !this.d.t) et.n[paramInt4].e(this.d, k, paramInt2, m);
/*     */ 
/*     */     
/* 260 */     this.o = true;
/* 261 */     return true;
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3) {
/* 265 */     return this.e.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 269 */     this.o = true;
/* 270 */     this.e.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(cr paramcr, int paramInt1, int paramInt2, int paramInt3) {
/* 274 */     if (paramcr == cr.a) return this.f.a(paramInt1, paramInt2, paramInt3); 
/* 275 */     if (paramcr == cr.b) return this.g.a(paramInt1, paramInt2, paramInt3); 
/* 276 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(cr paramcr, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 280 */     this.o = true;
/* 281 */     if (paramcr == cr.a) { this.f.a(paramInt1, paramInt2, paramInt3, paramInt4); }
/* 282 */     else if (paramcr == cr.b) { this.g.a(paramInt1, paramInt2, paramInt3, paramInt4); }
/*     */     else
/*     */     { return; }
/*     */   
/*     */   } public int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 287 */     int i = this.f.a(paramInt1, paramInt2, paramInt3);
/* 288 */     if (i > 0) a = true; 
/* 289 */     i -= paramInt4;
/* 290 */     int j = this.g.a(paramInt1, paramInt2, paramInt3);
/* 291 */     if (j > i) i = j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 305 */     return i;
/*     */   }
/*     */   
/*     */   public void a(db paramdb) {
/* 309 */     if (this.q) {
/*     */       return;
/*     */     }
/*     */     
/* 313 */     this.r = true;
/*     */     
/* 315 */     int i = fw.b(paramdb.k / 16.0D);
/* 316 */     int j = fw.b(paramdb.m / 16.0D);
/* 317 */     if (i != this.j || j != this.k) {
/* 318 */       System.out.println("Wrong location! " + paramdb);
/*     */     }
/* 320 */     int k = fw.b(paramdb.l / 16.0D);
/* 321 */     if (k < 0) k = 0; 
/* 322 */     if (k >= this.m.length) k = this.m.length - 1; 
/* 323 */     paramdb.Y = true;
/* 324 */     paramdb.Z = this.j;
/* 325 */     paramdb.aa = k;
/* 326 */     paramdb.ab = this.k;
/* 327 */     this.m[k].add(paramdb);
/*     */   }
/*     */   
/*     */   public void b(db paramdb) {
/* 331 */     a(paramdb, paramdb.aa);
/*     */   }
/*     */   
/*     */   public void a(db paramdb, int paramInt) {
/* 335 */     if (paramInt < 0) paramInt = 0; 
/* 336 */     if (paramInt >= this.m.length) paramInt = this.m.length - 1; 
/* 337 */     this.m[paramInt].remove(paramdb);
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3) {
/* 341 */     return (paramInt2 >= (this.h[paramInt3 << 4 | paramInt1] & 0xFF));
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
/*     */   public ap d(int paramInt1, int paramInt2, int paramInt3) {
/* 356 */     gf gf = new gf(paramInt1, paramInt2, paramInt3);
/*     */     
/* 358 */     ap ap = (ap)this.l.get(gf);
/* 359 */     if (ap == null) {
/* 360 */       int i = a(paramInt1, paramInt2, paramInt3);
/* 361 */       cl cl = (cl)et.n[i];
/* 362 */       cl.e(this.d, this.j * 16 + paramInt1, paramInt2, this.k * 16 + paramInt3);
/* 363 */       ap = (ap)this.l.get(gf);
/*     */     } 
/* 365 */     return ap;
/*     */   }
/*     */   
/*     */   public void a(ap paramap) {
/* 369 */     int i = paramap.b - this.j * 16;
/* 370 */     int j = paramap.c;
/* 371 */     int k = paramap.d - this.k * 16;
/* 372 */     a(i, j, k, paramap);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, ap paramap) {
/* 376 */     gf gf = new gf(paramInt1, paramInt2, paramInt3);
/*     */     
/* 378 */     paramap.a = this.d;
/* 379 */     paramap.b = this.j * 16 + paramInt1;
/* 380 */     paramap.c = paramInt2;
/* 381 */     paramap.d = this.k * 16 + paramInt3;
/*     */     
/* 383 */     if (a(paramInt1, paramInt2, paramInt3) == 0 || !(et.n[a(paramInt1, paramInt2, paramInt3)] instanceof cl)) {
/* 384 */       System.out.println("Attempted to place a tile entity where there was no entity tile!");
/*     */       
/*     */       return;
/*     */     } 
/* 388 */     if (this.c) {
/* 389 */       if (this.l.get(gf) != null) {
/* 390 */         this.d.a.remove(this.l.get(gf));
/*     */       }
/* 392 */       this.d.a.add(paramap);
/*     */     } 
/* 394 */     this.l.put(gf, paramap);
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2, int paramInt3) {
/* 398 */     gf gf = new gf(paramInt1, paramInt2, paramInt3);
/*     */     
/* 400 */     if (this.c) {
/* 401 */       this.d.a.remove(this.l.remove(gf));
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 406 */     this.c = true;
/* 407 */     this.d.a.addAll(this.l.values());
/* 408 */     for (byte b = 0; b < this.m.length; b++) {
/* 409 */       this.d.a(this.m[b]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 414 */     this.c = false;
/* 415 */     this.d.a.removeAll(this.l.values());
/* 416 */     for (byte b = 0; b < this.m.length; b++) {
/* 417 */       this.d.b(this.m[b]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/* 422 */     this.o = true;
/*     */   }
/*     */   
/*     */   public void a(db paramdb, cy paramcy, List<db> paramList) {
/* 426 */     int i = fw.b((paramcy.b - 2.0D) / 16.0D);
/* 427 */     int j = fw.b((paramcy.e + 2.0D) / 16.0D);
/* 428 */     if (i < 0) i = 0; 
/* 429 */     if (j >= this.m.length) j = this.m.length - 1; 
/* 430 */     for (int k = i; k <= j; k++) {
/* 431 */       List<db> list = this.m[k];
/* 432 */       for (byte b = 0; b < list.size(); b++) {
/* 433 */         db db1 = list.get(b);
/* 434 */         if (db1 != paramdb && db1.u.a(paramcy)) paramList.add(db1); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Class paramClass, cy paramcy, List<db> paramList) {
/* 440 */     int i = fw.b((paramcy.b - 2.0D) / 16.0D);
/* 441 */     int j = fw.b((paramcy.e + 2.0D) / 16.0D);
/* 442 */     if (i < 0) i = 0; 
/* 443 */     if (j >= this.m.length) j = this.m.length - 1; 
/* 444 */     for (int k = i; k <= j; k++) {
/* 445 */       List<db> list = this.m[k];
/* 446 */       for (byte b = 0; b < list.size(); b++) {
/* 447 */         db db = list.get(b);
/* 448 */         if (paramClass.isAssignableFrom(db.getClass()) && db.u.a(paramcy)) paramList.add(db);
/*     */       
/*     */       } 
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
/*     */   public boolean a(boolean paramBoolean) {
/* 462 */     if (this.p) return false; 
/* 463 */     if (this.r && this.d.b != this.s) return true; 
/* 464 */     return this.o;
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
/*     */   public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
/*     */     int i;
/* 493 */     for (i = paramInt1; i < paramInt4; i++) {
/* 494 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 495 */         int k = i << 11 | j << 7 | paramInt2;
/* 496 */         int m = paramInt5 - paramInt2;
/* 497 */         System.arraycopy(this.b, k, paramArrayOfbyte, paramInt7, m);
/* 498 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 501 */     for (i = paramInt1; i < paramInt4; i++) {
/* 502 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 503 */         int k = (i << 11 | j << 7 | paramInt2) >> 1;
/* 504 */         int m = (paramInt5 - paramInt2) / 2;
/* 505 */         System.arraycopy(this.e.a, k, paramArrayOfbyte, paramInt7, m);
/* 506 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 509 */     for (i = paramInt1; i < paramInt4; i++) {
/* 510 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 511 */         int k = (i << 11 | j << 7 | paramInt2) >> 1;
/* 512 */         int m = (paramInt5 - paramInt2) / 2;
/* 513 */         System.arraycopy(this.g.a, k, paramArrayOfbyte, paramInt7, m);
/* 514 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 517 */     for (i = paramInt1; i < paramInt4; i++) {
/* 518 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 519 */         int k = (i << 11 | j << 7 | paramInt2) >> 1;
/* 520 */         int m = (paramInt5 - paramInt2) / 2;
/* 521 */         System.arraycopy(this.f.a, k, paramArrayOfbyte, paramInt7, m);
/* 522 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 525 */     return paramInt7;
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
/*     */   public Random a(long paramLong) {
/* 568 */     return new Random(this.d.p + (this.j * this.j * 4987142) + (this.j * 5947611) + (this.k * this.k) * 4392871L + (this.k * 389711) ^ paramLong);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */