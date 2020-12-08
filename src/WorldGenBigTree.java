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
/*     */ public class WorldGenBigTree
/*     */   extends WorldGenerator
/*     */ {
/*  28 */   static final byte[] a = new byte[] { 2, 0, 0, 1, 2, 1 };
/*     */ 
/*     */   
/*  31 */   Random b = new Random();
/*     */ 
/*     */   
/*     */   World c;
/*     */ 
/*     */   
/*  37 */   int[] d = new int[] { 0, 0, 0 };
/*     */   
/*  39 */   int e = 0;
/*     */   
/*     */   int f;
/*  42 */   double g = 0.618D;
/*  43 */   double h = 1.0D;
/*  44 */   double i = 0.381D;
/*  45 */   double j = 1.0D;
/*  46 */   double k = 1.0D;
/*  47 */   int l = 1;
/*  48 */   int m = 12;
/*  49 */   int n = 4;
/*     */ 
/*     */ 
/*     */   
/*     */   int[][] o;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void a() {
/*  59 */     this.f = (int)(this.e * this.g);
/*  60 */     if (this.f >= this.e) this.f = this.e - 1; 
/*  61 */     int i = (int)(1.382D + Math.pow(this.k * this.e / 13.0D, 2.0D));
/*  62 */     if (i < 1) i = 1;
/*     */     
/*  64 */     int[][] arrayOfInt = new int[i * this.e][4];
/*  65 */     int j = this.d[1] + this.e - this.n;
/*  66 */     int b = 1;
/*  67 */     int k = this.d[1] + this.f;
/*  68 */     int m = j - this.d[1];
/*     */     
/*  70 */     arrayOfInt[0][0] = this.d[0];
/*  71 */     arrayOfInt[0][1] = j;
/*  72 */     arrayOfInt[0][2] = this.d[2];
/*  73 */     arrayOfInt[0][3] = k;
/*  74 */     j--;
/*     */     
/*  76 */     while (m >= 0) {
/*  77 */       int b1 = 0;
/*     */       
/*  79 */       float f = a(m);
/*  80 */       if (f < 0.0F) {
/*  81 */         j--;
/*  82 */         m--;
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/*  87 */       double d = 0.5D;
/*  88 */       while (b1 < i) {
/*  89 */         double d1 = this.j * f * (this.b.nextFloat() + 0.328D);
/*  90 */         double d2 = this.b.nextFloat() * 2.0D * 3.14159D;
/*  91 */         int n = (int)(d1 * Math.sin(d2) + this.d[0] + d);
/*  92 */         int i1 = (int)(d1 * Math.cos(d2) + this.d[2] + d);
/*  93 */         int[] arrayOfInt1 = { n, j, i1 };
/*  94 */         int[] arrayOfInt2 = { n, j + this.n, i1 };
/*     */         
/*  96 */         if (a(arrayOfInt1, arrayOfInt2) == -1) {
/*     */ 
/*     */           
/*  99 */           int[] arrayOfInt3 = { this.d[0], this.d[1], this.d[2] };
/* 100 */           double d3 = Math.sqrt(Math.pow(Math.abs(this.d[0] - arrayOfInt1[0]), 2.0D) + Math.pow(Math.abs(this.d[2] - arrayOfInt1[2]), 2.0D));
/* 101 */           double d4 = d3 * this.i;
/* 102 */           if (arrayOfInt1[1] - d4 > k) {
/* 103 */             arrayOfInt3[1] = k;
/*     */           } else {
/*     */             
/* 106 */             arrayOfInt3[1] = (int)(arrayOfInt1[1] - d4);
/*     */           } 
/*     */           
/* 109 */           if (a(arrayOfInt3, arrayOfInt1) == -1) {
/*     */ 
/*     */             
/* 112 */             arrayOfInt[b][0] = n;
/* 113 */             arrayOfInt[b][1] = j;
/* 114 */             arrayOfInt[b][2] = i1;
/* 115 */             arrayOfInt[b][3] = arrayOfInt3[1];
/* 116 */             b++;
/*     */           } 
/*     */         } 
/* 119 */         b1++;
/*     */       } 
/* 121 */       j--;
/* 122 */       m--;
/*     */     } 
/* 124 */     this.o = new int[b][4];
/* 125 */     System.arraycopy(arrayOfInt, 0, this.o, 0, b);
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
/*     */   void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat, byte paramByte, int paramInt4) {
/* 140 */     int i = (int)(paramFloat + 0.618D);
/* 141 */     int b1 = a[paramByte];
/* 142 */     int b2 = a[paramByte + 3];
/* 143 */     int[] arrayOfInt1 = { paramInt1, paramInt2, paramInt3 };
/* 144 */     int[] arrayOfInt2 = { 0, 0, 0 };
/* 145 */     int j = -i;
/* 146 */     int k = -i;
/*     */     
/* 148 */     arrayOfInt2[paramByte] = arrayOfInt1[paramByte];
/* 149 */     while (j <= i) {
/* 150 */       arrayOfInt2[b1] = arrayOfInt1[b1] + j;
/* 151 */       k = -i;
/* 152 */       while (k <= i) {
/* 153 */         double d = Math.sqrt(Math.pow(Math.abs(j) + 0.5D, 2.0D) + Math.pow(Math.abs(k) + 0.5D, 2.0D));
/* 154 */         if (d > paramFloat) {
/* 155 */           k++;
/*     */           continue;
/*     */         } 
/* 158 */         arrayOfInt2[b2] = arrayOfInt1[b2] + k;
/* 159 */         int m = this.c.getBlockId(arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2]);
/* 160 */         if (m != 0 && m != 18) {
/*     */ 
/*     */           
/* 163 */           k++;
/*     */           continue;
/*     */         } 
/* 166 */         this.c.setBlock(arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], paramInt4);
/* 167 */         k++;
/*     */       } 
/* 169 */       j++;
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
/*     */   float a(int paramInt) {
/*     */     float f3;
/* 182 */     if (paramInt < this.e * 0.3D) return -1.618F; 
/* 183 */     float f1 = this.e / 2.0F;
/* 184 */     float f2 = this.e / 2.0F - paramInt;
/*     */     
/* 186 */     if (f2 == 0.0F) { f3 = f1; }
/* 187 */     else if (Math.abs(f2) >= f1) { f3 = 0.0F; }
/* 188 */     else { f3 = (float)Math.sqrt(Math.pow(Math.abs(f1), 2.0D) - Math.pow(Math.abs(f2), 2.0D)); }
/*     */     
/* 190 */     f3 *= 0.5F;
/* 191 */     return f3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float b(int paramInt) {
/* 200 */     if (paramInt < 0 || paramInt >= this.n) return -1.0F; 
/* 201 */     if (paramInt == 0 || paramInt == this.n - 1) return 2.0F; 
/* 202 */     return 3.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void a(int paramInt1, int paramInt2, int paramInt3) {
/* 209 */     int i = paramInt2;
/* 210 */     int j = paramInt2 + this.n;
/*     */     
/* 212 */     while (i < j) {
/* 213 */       float f = b(i - paramInt2);
/* 214 */       a(paramInt1, i, paramInt3, f, (byte)1, 18);
/* 215 */       i++;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void a(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
/*     */     byte b5;
/* 226 */     int[] arrayOfInt1 = { 0, 0, 0 };
/* 227 */     int b1 = 0;
/* 228 */     int b2 = 0;
/* 229 */     while (b1 < 3) {
/* 230 */       arrayOfInt1[b1] = paramArrayOfint2[b1] - paramArrayOfint1[b1];
/* 231 */       if (Math.abs(arrayOfInt1[b1]) > Math.abs(arrayOfInt1[b2])) {
/* 232 */         b2 = b1;
/*     */       }
/* 234 */       b1 = (byte)(b1 + 1);
/*     */     } 
/*     */     
/* 237 */     if (arrayOfInt1[b2] == 0)
/*     */       return; 
/* 239 */     int b3 = a[b2];
/* 240 */     int b4 = a[b2 + 3];
/*     */ 
/*     */ 
/*     */     
/* 244 */     if (arrayOfInt1[b2] > 0) { b5 = 1; }
/* 245 */     else { b5 = -1; }
/*     */     
/* 247 */     double d1 = arrayOfInt1[b3] / arrayOfInt1[b2];
/* 248 */     double d2 = arrayOfInt1[b4] / arrayOfInt1[b2];
/*     */     
/* 250 */     int[] arrayOfInt2 = { 0, 0, 0 };
/*     */     
/* 252 */     int i = 0;
/* 253 */     int j = arrayOfInt1[b2] + b5;
/* 254 */     while (i != j) {
/* 255 */       arrayOfInt2[b2] = MathHelper.floor_double((paramArrayOfint1[b2] + i) + 0.5D);
/* 256 */       arrayOfInt2[b3] = MathHelper.floor_double(paramArrayOfint1[b3] + i * d1 + 0.5D);
/* 257 */       arrayOfInt2[b4] = MathHelper.floor_double(paramArrayOfint1[b4] + i * d2 + 0.5D);
/* 258 */       this.c.setBlock(arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], paramInt);
/* 259 */       i += b5;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void b() {
/* 268 */     int b = 0;
/* 269 */     int i = this.o.length;
/* 270 */     while (b < i) {
/* 271 */       int j = this.o[b][0];
/* 272 */       int k = this.o[b][1];
/* 273 */       int m = this.o[b][2];
/* 274 */       a(j, k, m);
/* 275 */       b++;
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
/*     */   boolean c(int paramInt) {
/* 287 */     if (paramInt < this.e * 0.2D) return false; 
/* 288 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   void c() {
/* 293 */     int i = this.d[0];
/* 294 */     int j = this.d[1];
/* 295 */     int k = this.d[1] + this.f;
/* 296 */     int m = this.d[2];
/* 297 */     int[] arrayOfInt1 = { i, j, m };
/* 298 */     int[] arrayOfInt2 = { i, k, m };
/* 299 */     a(arrayOfInt1, arrayOfInt2, 17);
/* 300 */     if (this.l == 2) {
/* 301 */       arrayOfInt1[0] = arrayOfInt1[0] + 1;
/* 302 */       arrayOfInt2[0] = arrayOfInt2[0] + 1;
/* 303 */       a(arrayOfInt1, arrayOfInt2, 17);
/* 304 */       arrayOfInt1[2] = arrayOfInt1[2] + 1;
/* 305 */       arrayOfInt2[2] = arrayOfInt2[2] + 1;
/* 306 */       a(arrayOfInt1, arrayOfInt2, 17);
/* 307 */       arrayOfInt1[0] = arrayOfInt1[0] + -1;
/* 308 */       arrayOfInt2[0] = arrayOfInt2[0] + -1;
/* 309 */       a(arrayOfInt1, arrayOfInt2, 17);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void d() {
/* 317 */     int b = 0;
/* 318 */     int i = this.o.length;
/* 319 */     int[] arrayOfInt = { this.d[0], this.d[1], this.d[2] };
/* 320 */     while (b < i) {
/* 321 */       int[] arrayOfInt1 = this.o[b];
/* 322 */       int[] arrayOfInt2 = { arrayOfInt1[0], arrayOfInt1[1], arrayOfInt1[2] };
/* 323 */       arrayOfInt[1] = arrayOfInt1[3];
/*     */       
/* 325 */       int j = arrayOfInt[1] - this.d[1];
/* 326 */       if (c(j)) {
/* 327 */         a(arrayOfInt, arrayOfInt2, 17);
/*     */       }
/* 329 */       b++;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
/*     */     byte b5;
/* 341 */     int[] arrayOfInt1 = { 0, 0, 0 };
/* 342 */     int b1 = 0;
/* 343 */     int b2 = 0;
/* 344 */     while (b1 < 3) {
/* 345 */       arrayOfInt1[b1] = paramArrayOfint2[b1] - paramArrayOfint1[b1];
/* 346 */       if (Math.abs(arrayOfInt1[b1]) > Math.abs(arrayOfInt1[b2])) {
/* 347 */         b2 = b1;
/*     */       }
/* 349 */       b1 = (byte)(b1 + 1);
/*     */     } 
/*     */     
/* 352 */     if (arrayOfInt1[b2] == 0) return -1;
/*     */     
/* 354 */     int b3 = a[b2];
/* 355 */     int b4 = a[b2 + 3];
/*     */ 
/*     */ 
/*     */     
/* 359 */     if (arrayOfInt1[b2] > 0) { b5 = 1; }
/* 360 */     else { b5 = -1; }
/*     */     
/* 362 */     double d1 = arrayOfInt1[b3] / arrayOfInt1[b2];
/* 363 */     double d2 = arrayOfInt1[b4] / arrayOfInt1[b2];
/*     */     
/* 365 */     int[] arrayOfInt2 = { 0, 0, 0 };
/*     */     
/* 367 */     int i = 0;
/* 368 */     int j = arrayOfInt1[b2] + b5;
/*     */     
/* 370 */     while (i != j) {
/* 371 */       arrayOfInt2[b2] = paramArrayOfint1[b2] + i;
/* 372 */       arrayOfInt2[b3] = (int)(paramArrayOfint1[b3] + i * d1);
/* 373 */       arrayOfInt2[b4] = (int)(paramArrayOfint1[b4] + i * d2);
/* 374 */       int k = this.c.getBlockId(arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2]);
/* 375 */       if (k != 0 && k != 18) {
/*     */         break;
/*     */       }
/*     */ 
/*     */       
/* 380 */       i += b5;
/*     */     } 
/*     */     
/* 383 */     if (i == j) {
/* 384 */       return -1;
/*     */     }
/*     */ 
/*     */     
/* 388 */     return Math.abs(i);
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
/*     */   boolean e() {
/* 401 */     int[] arrayOfInt1 = { this.d[0], this.d[1], this.d[2] };
/* 402 */     int[] arrayOfInt2 = { this.d[0], this.d[1] + this.e - 1, this.d[2] };
/*     */     
/* 404 */     int i = this.c.getBlockId(this.d[0], this.d[1] - 1, this.d[2]);
/* 405 */     if (i != 2 && i != 3) {
/* 406 */       return false;
/*     */     }
/* 408 */     int j = a(arrayOfInt1, arrayOfInt2);
/*     */     
/* 410 */     if (j == -1) {
/* 411 */       return true;
/*     */     }
/*     */     
/* 414 */     if (j < 6) {
/* 415 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 420 */     this.e = j;
/*     */     
/* 422 */     return true;
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
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 434 */     this.m = (int)(paramDouble1 * 12.0D);
/* 435 */     if (paramDouble1 > 0.5D) this.n = 5; 
/* 436 */     this.j = paramDouble2;
/* 437 */     this.k = paramDouble3;
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
/*     */   public boolean a(World paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 450 */     this.c = paramdp;
/* 451 */     long l = paramRandom.nextLong();
/* 452 */     this.b.setSeed(l);
/*     */     
/* 454 */     this.d[0] = paramInt1;
/* 455 */     this.d[1] = paramInt2;
/* 456 */     this.d[2] = paramInt3;
/*     */     
/* 458 */     if (this.e == 0) {
/* 459 */       this.e = 5 + this.b.nextInt(this.m);
/*     */     }
/* 461 */     if (!e())
/*     */     {
/* 463 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 468 */     a();
/*     */     
/* 470 */     b();
/*     */     
/* 472 */     c();
/*     */     
/* 474 */     d();
/*     */     
/* 476 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */