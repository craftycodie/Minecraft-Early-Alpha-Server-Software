/*     */ import java.util.Random;
/*     */ 
/*     */ public class ac
/*     */   extends bw
/*     */ {
/*   6 */   private int[] d = new int[512];
/*     */   public double a;
/*     */   public double b;
/*     */   public double c;
/*     */   
/*     */   public ac() {
/*  12 */     this(new Random());
/*     */   }
/*     */   
/*     */   public ac(Random paramRandom) {
/*  16 */     this.a = paramRandom.nextDouble() * 256.0D;
/*  17 */     this.b = paramRandom.nextDouble() * 256.0D;
/*  18 */     this.c = paramRandom.nextDouble() * 256.0D; byte b;
/*  19 */     for (b = 0; b < 'Ā'; b++) {
/*  20 */       this.d[b] = b;
/*     */     }
/*     */     
/*  23 */     for (b = 0; b < 'Ā'; b++) {
/*  24 */       int i = paramRandom.nextInt(256 - b) + b;
/*  25 */       int j = this.d[b];
/*  26 */       this.d[b] = this.d[i];
/*  27 */       this.d[i] = j;
/*     */       
/*  29 */       this.d[b + 256] = this.d[b];
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
/*     */   public double a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  44 */     double d1 = paramDouble1 + this.a;
/*  45 */     double d2 = paramDouble2 + this.b;
/*  46 */     double d3 = paramDouble3 + this.c;
/*     */     
/*  48 */     int i = (int)d1;
/*  49 */     int j = (int)d2;
/*  50 */     int k = (int)d3;
/*     */     
/*  52 */     if (d1 < i) i--; 
/*  53 */     if (d2 < j) j--; 
/*  54 */     if (d3 < k) k--;
/*     */     
/*  56 */     int m = i & 0xFF;
/*  57 */     int n = j & 0xFF;
/*  58 */     int i1 = k & 0xFF;
/*     */     
/*  60 */     d1 -= i;
/*  61 */     d2 -= j;
/*  62 */     d3 -= k;
/*     */     
/*  64 */     double d4 = d1 * d1 * d1 * (d1 * (d1 * 6.0D - 15.0D) + 10.0D);
/*  65 */     double d5 = d2 * d2 * d2 * (d2 * (d2 * 6.0D - 15.0D) + 10.0D);
/*  66 */     double d6 = d3 * d3 * d3 * (d3 * (d3 * 6.0D - 15.0D) + 10.0D);
/*     */     
/*  68 */     int i2 = this.d[m] + n, i3 = this.d[i2] + i1, i4 = this.d[i2 + 1] + i1;
/*  69 */     int i5 = this.d[m + 1] + n, i6 = this.d[i5] + i1, i7 = this.d[i5 + 1] + i1;
/*     */     
/*  71 */     return b(d6, b(d5, b(d4, a(this.d[i3], d1, d2, d3), a(this.d[i6], d1 - 1.0D, d2, d3)), b(d4, a(this.d[i4], d1, d2 - 1.0D, d3), a(this.d[i7], d1 - 1.0D, d2 - 1.0D, d3))), b(d5, b(d4, a(this.d[i3 + 1], d1, d2, d3 - 1.0D), a(this.d[i6 + 1], d1 - 1.0D, d2, d3 - 1.0D)), b(d4, a(this.d[i4 + 1], d1, d2 - 1.0D, d3 - 1.0D), a(this.d[i7 + 1], d1 - 1.0D, d2 - 1.0D, d3 - 1.0D))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  81 */     return paramDouble2 + paramDouble1 * (paramDouble3 - paramDouble2);
/*     */   }
/*     */   
/*     */   public double a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  85 */     int i = paramInt & 0xF;
/*  86 */     double d1 = (i < 8) ? paramDouble1 : paramDouble2;
/*  87 */     double d2 = (i < 4) ? paramDouble2 : ((i == 12 || i == 14) ? paramDouble1 : paramDouble3);
/*  88 */     return (((i & 0x1) == 0) ? d1 : -d1) + (((i & 0x2) == 0) ? d2 : -d2);
/*     */   }
/*     */   
/*     */   public double a(double paramDouble1, double paramDouble2) {
/*  92 */     return a(paramDouble1, paramDouble2, 0.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(double[] paramArrayOfdouble, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7) {
/* 100 */     byte b1 = 0;
/* 101 */     double d1 = 1.0D / paramDouble7;
/* 102 */     int i = -1;
/* 103 */     int j = 0, k = 0, m = 0, n = 0, i1 = 0, i2 = 0;
/* 104 */     double d2 = 0.0D, d3 = 0.0D, d4 = 0.0D, d5 = 0.0D;
/*     */     
/* 106 */     for (byte b2 = 0; b2 < paramInt1; b2++) {
/* 107 */       double d6 = (paramDouble1 + b2) * paramDouble4 + this.a;
/* 108 */       int i3 = (int)d6;
/* 109 */       if (d6 < i3) i3--; 
/* 110 */       int i4 = i3 & 0xFF;
/* 111 */       d6 -= i3;
/* 112 */       double d7 = d6 * d6 * d6 * (d6 * (d6 * 6.0D - 15.0D) + 10.0D);
/*     */ 
/*     */       
/* 115 */       for (byte b = 0; b < paramInt3; b++) {
/* 116 */         double d8 = (paramDouble3 + b) * paramDouble6 + this.c;
/* 117 */         int i5 = (int)d8;
/* 118 */         if (d8 < i5) i5--; 
/* 119 */         int i6 = i5 & 0xFF;
/* 120 */         d8 -= i5;
/* 121 */         double d9 = d8 * d8 * d8 * (d8 * (d8 * 6.0D - 15.0D) + 10.0D);
/*     */ 
/*     */         
/* 124 */         for (byte b3 = 0; b3 < paramInt2; b3++) {
/* 125 */           double d10 = (paramDouble2 + b3) * paramDouble5 + this.b;
/* 126 */           int i7 = (int)d10;
/* 127 */           if (d10 < i7) i7--; 
/* 128 */           int i8 = i7 & 0xFF;
/* 129 */           d10 -= i7;
/* 130 */           double d11 = d10 * d10 * d10 * (d10 * (d10 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 132 */           if (b3 == 0 || i8 != i) {
/* 133 */             i = i8;
/* 134 */             j = this.d[i4] + i8;
/* 135 */             k = this.d[j] + i6;
/* 136 */             m = this.d[j + 1] + i6;
/* 137 */             n = this.d[i4 + 1] + i8;
/* 138 */             i1 = this.d[n] + i6;
/* 139 */             i2 = this.d[n + 1] + i6;
/* 140 */             d2 = b(d7, a(this.d[k], d6, d10, d8), a(this.d[i1], d6 - 1.0D, d10, d8));
/* 141 */             d3 = b(d7, a(this.d[m], d6, d10 - 1.0D, d8), a(this.d[i2], d6 - 1.0D, d10 - 1.0D, d8));
/* 142 */             d4 = b(d7, a(this.d[k + 1], d6, d10, d8 - 1.0D), a(this.d[i1 + 1], d6 - 1.0D, d10, d8 - 1.0D));
/* 143 */             d5 = b(d7, a(this.d[m + 1], d6, d10 - 1.0D, d8 - 1.0D), a(this.d[i2 + 1], d6 - 1.0D, d10 - 1.0D, d8 - 1.0D));
/*     */           } 
/*     */ 
/*     */           
/* 147 */           double d12 = b(d11, d2, d3);
/* 148 */           double d13 = b(d11, d4, d5);
/* 149 */           double d14 = b(d9, d12, d13);
/*     */           
/* 151 */           paramArrayOfdouble[b1++] = paramArrayOfdouble[b1++] + d14 * d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */