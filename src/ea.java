/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ea
/*     */ {
/*     */   private volatile transient int e;
/*  18 */   private final float d = 0.75F;
/*  19 */   private int c = 12;
/*  20 */   private transient bo[] a = new bo[16];
/*     */   private transient int b;
/*     */   
/*     */   private static int e(long paramLong) {
/*  24 */     return a((int)(paramLong ^ paramLong >>> 32L));
/*     */   }
/*     */   
/*     */   private static int a(int paramInt) {
/*  28 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  29 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*     */   }
/*     */   
/*     */   private static int a(int paramInt1, int paramInt2) {
/*  33 */     return paramInt1 & paramInt2 - 1;
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
/*     */   public Object a(long paramLong) {
/*  45 */     int i = e(paramLong);
/*  46 */     for (bo bo1 = this.a[a(i, this.a.length)]; bo1 != null; bo1 = bo1.c) {
/*  47 */       if (bo1.a == paramLong) return bo1.b; 
/*     */     } 
/*  49 */     return null;
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
/*     */   public void a(long paramLong, Object paramObject) {
/*  65 */     int i = e(paramLong);
/*  66 */     int j = a(i, this.a.length);
/*  67 */     for (bo bo1 = this.a[j]; bo1 != null; bo1 = bo1.c) {
/*  68 */       if (bo1.a == paramLong) {
/*  69 */         bo1.b = paramObject;
/*     */       }
/*     */     } 
/*     */     
/*  73 */     this.e++;
/*  74 */     a(i, paramLong, paramObject, j);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(int paramInt) {
/*  79 */     bo[] arrayOfBo1 = this.a;
/*  80 */     int i = arrayOfBo1.length;
/*  81 */     if (i == 1073741824) {
/*  82 */       this.c = Integer.MAX_VALUE;
/*     */       
/*     */       return;
/*     */     } 
/*  86 */     bo[] arrayOfBo2 = new bo[paramInt];
/*  87 */     a(arrayOfBo2);
/*  88 */     this.a = arrayOfBo2;
/*  89 */     this.c = (int)(paramInt * this.d);
/*     */   }
/*     */   
/*     */   private void a(bo[] paramArrayOfbo) {
/*  93 */     bo[] arrayOfBo = this.a;
/*  94 */     int i = paramArrayOfbo.length;
/*  95 */     for (byte b = 0; b < arrayOfBo.length; b++) {
/*  96 */       bo bo1 = arrayOfBo[b];
/*  97 */       if (bo1 != null) {
/*  98 */         arrayOfBo[b] = null;
/*     */         do {
/* 100 */           bo bo2 = bo1.c;
/* 101 */           int j = a(bo1.d, i);
/* 102 */           bo1.c = paramArrayOfbo[j];
/* 103 */           paramArrayOfbo[j] = bo1;
/* 104 */           bo1 = bo2;
/* 105 */         } while (bo1 != null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object b(long paramLong) {
/* 111 */     bo bo1 = c(paramLong);
/* 112 */     return (bo1 == null) ? null : bo1.b;
/*     */   }
/*     */   
/*     */   final bo c(long paramLong) {
/* 116 */     int i = e(paramLong);
/* 117 */     int j = a(i, this.a.length);
/* 118 */     bo bo1 = this.a[j];
/* 119 */     bo bo2 = bo1;
/*     */     
/* 121 */     while (bo2 != null) {
/* 122 */       bo bo3 = bo2.c;
/* 123 */       if (bo2.a == paramLong) {
/* 124 */         this.e++;
/* 125 */         this.b--;
/* 126 */         if (bo1 == bo2) { this.a[j] = bo3; }
/* 127 */         else { bo1.c = bo3; }
/* 128 */          return bo2;
/*     */       } 
/* 130 */       bo1 = bo2;
/* 131 */       bo2 = bo3;
/*     */     } 
/*     */     
/* 134 */     return bo2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int paramInt1, long paramLong, Object paramObject, int paramInt2) {
/* 219 */     bo bo1 = this.a[paramInt2];
/* 220 */     this.a[paramInt2] = new bo(paramInt1, paramLong, paramObject, bo1);
/* 221 */     if (this.b++ >= this.c) b(2 * this.a.length); 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ea.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */