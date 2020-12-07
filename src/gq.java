/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gq
/*     */ {
/*     */   private volatile transient int e;
/*  18 */   private final float d = 0.75F;
/*  19 */   private int c = 12;
/*  20 */   private transient gi[] a = new gi[16];
/*     */   private transient int b;
/*     */   
/*     */   private static int g(int paramInt) {
/*  24 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  25 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*     */   }
/*     */   
/*     */   private static int a(int paramInt1, int paramInt2) {
/*  29 */     return paramInt1 & paramInt2 - 1;
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
/*     */   public Object a(int paramInt) {
/*  41 */     int i = g(paramInt);
/*  42 */     for (gi gi1 = this.a[a(i, this.a.length)]; gi1 != null; gi1 = gi1.c) {
/*  43 */       if (gi1.a == paramInt) return gi1.b; 
/*     */     } 
/*  45 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt) {
/*  49 */     return (c(paramInt) != null);
/*     */   }
/*     */   
/*     */   final gi c(int paramInt) {
/*  53 */     int i = g(paramInt);
/*  54 */     for (gi gi1 = this.a[a(i, this.a.length)]; gi1 != null; gi1 = gi1.c) {
/*  55 */       if (gi1.a == paramInt) return gi1; 
/*     */     } 
/*  57 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, Object paramObject) {
/*  61 */     int i = g(paramInt);
/*  62 */     int j = a(i, this.a.length);
/*  63 */     for (gi gi1 = this.a[j]; gi1 != null; gi1 = gi1.c) {
/*  64 */       if (gi1.a == paramInt) {
/*  65 */         gi1.b = paramObject;
/*     */       }
/*     */     } 
/*     */     
/*  69 */     this.e++;
/*  70 */     a(i, paramInt, paramObject, j);
/*     */   }
/*     */ 
/*     */   
/*     */   private void h(int paramInt) {
/*  75 */     gi[] arrayOfGi1 = this.a;
/*  76 */     int i = arrayOfGi1.length;
/*  77 */     if (i == 1073741824) {
/*  78 */       this.c = Integer.MAX_VALUE;
/*     */       
/*     */       return;
/*     */     } 
/*  82 */     gi[] arrayOfGi2 = new gi[paramInt];
/*  83 */     a(arrayOfGi2);
/*  84 */     this.a = arrayOfGi2;
/*  85 */     this.c = (int)(paramInt * this.d);
/*     */   }
/*     */   
/*     */   private void a(gi[] paramArrayOfgi) {
/*  89 */     gi[] arrayOfGi = this.a;
/*  90 */     int i = paramArrayOfgi.length;
/*  91 */     for (byte b = 0; b < arrayOfGi.length; b++) {
/*  92 */       gi gi1 = arrayOfGi[b];
/*  93 */       if (gi1 != null) {
/*  94 */         arrayOfGi[b] = null;
/*     */         do {
/*  96 */           gi gi2 = gi1.c;
/*  97 */           int j = a(gi1.d, i);
/*  98 */           gi1.c = paramArrayOfgi[j];
/*  99 */           paramArrayOfgi[j] = gi1;
/* 100 */           gi1 = gi2;
/* 101 */         } while (gi1 != null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object d(int paramInt) {
/* 107 */     gi gi1 = e(paramInt);
/* 108 */     return (gi1 == null) ? null : gi1.b;
/*     */   }
/*     */   
/*     */   final gi e(int paramInt) {
/* 112 */     int i = g(paramInt);
/* 113 */     int j = a(i, this.a.length);
/* 114 */     gi gi1 = this.a[j];
/* 115 */     gi gi2 = gi1;
/*     */     
/* 117 */     while (gi2 != null) {
/* 118 */       gi gi3 = gi2.c;
/* 119 */       if (gi2.a == paramInt) {
/* 120 */         this.e++;
/* 121 */         this.b--;
/* 122 */         if (gi1 == gi2) { this.a[j] = gi3; }
/* 123 */         else { gi1.c = gi3; }
/* 124 */          return gi2;
/*     */       } 
/* 126 */       gi1 = gi2;
/* 127 */       gi2 = gi3;
/*     */     } 
/*     */     
/* 130 */     return gi2;
/*     */   }
/*     */   
/*     */   public void a() {
/* 134 */     this.e++;
/* 135 */     gi[] arrayOfGi = this.a;
/* 136 */     for (byte b = 0; b < arrayOfGi.length; b++)
/* 137 */       arrayOfGi[b] = null; 
/* 138 */     this.b = 0;
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
/*     */   private void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3) {
/* 215 */     gi gi1 = this.a[paramInt3];
/* 216 */     this.a[paramInt3] = new gi(paramInt1, paramInt2, paramObject, gi1);
/* 217 */     if (this.b++ >= this.c) h(2 * this.a.length); 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */