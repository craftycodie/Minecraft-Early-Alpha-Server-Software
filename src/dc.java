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
/*     */ public class dc
/*     */   extends ay
/*     */ {
/*     */   public boolean a(dp paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/*  16 */     byte b1 = 3;
/*  17 */     int i = paramRandom.nextInt(2) + 2;
/*  18 */     int j = paramRandom.nextInt(2) + 2;
/*     */     
/*  20 */     byte b2 = 0; int k;
/*  21 */     for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
/*  22 */       for (int m = paramInt2 - 1; m <= paramInt2 + b1 + 1; m++) {
/*  23 */         for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
/*  24 */           hz hz = paramdp.c(k, m, n);
/*  25 */           if (m == paramInt2 - 1 && !hz.a()) return false; 
/*  26 */           if (m == paramInt2 + b1 + 1 && !hz.a()) return false;
/*     */           
/*  28 */           if ((k == paramInt1 - i - 1 || k == paramInt1 + i + 1 || n == paramInt3 - j - 1 || n == paramInt3 + j + 1) && 
/*  29 */             m == paramInt2 && paramdp.a(k, m, n) == 0 && paramdp.a(k, m + 1, n) == 0) {
/*  30 */             b2++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  38 */     if (b2 < 1 || b2 > 5) return false;
/*     */     
/*  40 */     for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
/*  41 */       for (int m = paramInt2 + b1; m >= paramInt2 - 1; m--) {
/*  42 */         for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
/*     */           
/*  44 */           if (k == paramInt1 - i - 1 || m == paramInt2 - 1 || n == paramInt3 - j - 1 || k == paramInt1 + i + 1 || m == paramInt2 + b1 + 1 || n == paramInt3 + j + 1) {
/*  45 */             if (m >= 0 && !paramdp.c(k, m - 1, n).a()) {
/*  46 */               paramdp.d(k, m, n, 0);
/*  47 */             } else if (paramdp.c(k, m, n).a()) {
/*  48 */               if (m == paramInt2 - 1 && paramRandom.nextInt(4) != 0) {
/*  49 */                 paramdp.d(k, m, n, et.ao.ba);
/*     */               } else {
/*  51 */                 paramdp.d(k, m, n, et.w.ba);
/*     */               } 
/*     */             } 
/*     */           } else {
/*  55 */             paramdp.d(k, m, n, 0);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  61 */     for (k = 0; k < 2; k++) {
/*  62 */       for (byte b = 0; b < 3; b++) {
/*  63 */         int m = paramInt1 + paramRandom.nextInt(i * 2 + 1) - i;
/*  64 */         int n = paramInt2;
/*  65 */         int i1 = paramInt3 + paramRandom.nextInt(j * 2 + 1) - j;
/*  66 */         if (paramdp.a(m, n, i1) == 0) {
/*     */           
/*  68 */           byte b3 = 0;
/*  69 */           if (paramdp.c(m - 1, n, i1).a()) b3++; 
/*  70 */           if (paramdp.c(m + 1, n, i1).a()) b3++; 
/*  71 */           if (paramdp.c(m, n, i1 - 1).a()) b3++; 
/*  72 */           if (paramdp.c(m, n, i1 + 1).a()) b3++;
/*     */           
/*  74 */           if (b3 == 1) {
/*     */             
/*  76 */             paramdp.d(m, n, i1, et.au.ba);
/*  77 */             gn gn = (gn)paramdp.k(m, n, i1);
/*  78 */             for (byte b4 = 0; b4 < 8; b4++) {
/*  79 */               gc gc = a(paramRandom);
/*  80 */               if (gc != null) gn.a(paramRandom.nextInt(gn.a()), gc);
/*     */             
/*     */             } 
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  88 */     paramdp.d(paramInt1, paramInt2, paramInt3, et.as.ba);
/*  89 */     bm bm = (bm)paramdp.k(paramInt1, paramInt2, paramInt3);
/*  90 */     bm.f = b(paramRandom);
/*     */ 
/*     */     
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   private gc a(Random paramRandom) {
/*  97 */     int i = paramRandom.nextInt(11);
/*  98 */     if (i == 0) return new gc(en.ay); 
/*  99 */     if (i == 1) return new gc(en.m, paramRandom.nextInt(4) + 1); 
/* 100 */     if (i == 2) return new gc(en.S); 
/* 101 */     if (i == 3) return new gc(en.R, paramRandom.nextInt(4) + 1); 
/* 102 */     if (i == 4) return new gc(en.K, paramRandom.nextInt(4) + 1); 
/* 103 */     if (i == 5) return new gc(en.I, paramRandom.nextInt(4) + 1); 
/* 104 */     if (i == 6) return new gc(en.au); 
/* 105 */     if (i == 7 && paramRandom.nextInt(100) == 0) return new gc(en.ar); 
/* 106 */     if (i == 8 && paramRandom.nextInt(2) == 0) return new gc(en.aA, paramRandom.nextInt(4) + 1); 
/* 107 */     if (i == 9 && paramRandom.nextInt(10) == 0) return new gc(en.c[en.aO.aQ + paramRandom.nextInt(2)]);
/*     */     
/* 109 */     return null;
/*     */   }
/*     */   
/*     */   private String b(Random paramRandom) {
/* 113 */     int i = paramRandom.nextInt(4);
/* 114 */     if (i == 0) return "Skeleton"; 
/* 115 */     if (i == 1) return "Zombie"; 
/* 116 */     if (i == 2) return "Zombie"; 
/* 117 */     if (i == 3) return "Spider"; 
/* 118 */     return "";
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */