/*     */ 
/*     */ 
/*     */ public class Path
/*     */ {
/*   5 */   private PathPoint[] a = new PathPoint[1024];
/*     */   
/*   7 */   private int b = 0;
/*     */ 
/*     */   
/*     */   public PathPoint a(PathPoint parama) {
/*  11 */     if (parama.e >= 0) throw new IllegalStateException("OW KNOWS!");
/*     */     
/*  13 */     if (this.b == this.a.length) {
/*     */       
/*  15 */       PathPoint[] arrayOfA = new PathPoint[this.b << 1];
/*  16 */       System.arraycopy(this.a, 0, arrayOfA, 0, this.b);
/*  17 */       this.a = arrayOfA;
/*     */     } 
/*     */ 
/*     */     
/*  21 */     this.a[this.b] = parama;
/*  22 */     parama.e = this.b;
/*  23 */     a(this.b++);
/*     */     
/*  25 */     return parama;
/*     */   }
/*     */   
/*     */   public void a() {
/*  29 */     this.b = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PathPoint b() {
/*  39 */     PathPoint a1 = this.a[0];
/*  40 */     this.a[0] = this.a[--this.b];
/*  41 */     this.a[this.b] = null;
/*  42 */     if (this.b > 0) b(0); 
/*  43 */     a1.e = -1;
/*  44 */     return a1;
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
/*     */   public void a(PathPoint parama, float paramFloat) {
/*  69 */     float f = parama.h;
/*  70 */     parama.h = paramFloat;
/*  71 */     if (paramFloat < f) {
/*     */       
/*  73 */       a(parama.e);
/*     */     }
/*     */     else {
/*     */       
/*  77 */       b(parama.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int paramInt) {
/*  88 */     PathPoint a1 = this.a[paramInt];
/*  89 */     float f = a1.h;
/*  90 */     while (paramInt > 0) {
/*     */       
/*  92 */       int i = paramInt - 1 >> 1;
/*  93 */       PathPoint a2 = this.a[i];
/*  94 */       if (f < a2.h) {
/*     */         
/*  96 */         this.a[paramInt] = a2;
/*  97 */         a2.e = paramInt;
/*  98 */         paramInt = i;
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     this.a[paramInt] = a1;
/* 103 */     a1.e = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(int paramInt) {
/* 108 */     PathPoint a1 = this.a[paramInt];
/* 109 */     float f = a1.h;
/*     */     while (true) {
/*     */       PathPoint a3;
/*     */       float f2;
/* 113 */       int i = 1 + (paramInt << 1);
/* 114 */       int j = i + 1;
/*     */       
/* 116 */       if (i >= this.b) {
/*     */         break;
/*     */       }
/* 119 */       PathPoint a2 = this.a[i];
/* 120 */       float f1 = a2.h;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       if (j >= this.b) {
/*     */ 
/*     */         
/* 128 */         a3 = null;
/* 129 */         f2 = Float.POSITIVE_INFINITY;
/*     */       }
/*     */       else {
/*     */         
/* 133 */         a3 = this.a[j];
/* 134 */         f2 = a3.h;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 139 */       if (f1 < f2) {
/*     */         
/* 141 */         if (f1 < f) {
/*     */           
/* 143 */           this.a[paramInt] = a2;
/* 144 */           a2.e = paramInt;
/* 145 */           paramInt = i;
/*     */           
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       } 
/* 151 */       if (f2 < f) {
/*     */         
/* 153 */         this.a[paramInt] = a3;
/* 154 */         a3.e = paramInt;
/* 155 */         paramInt = j;
/*     */         
/*     */         continue;
/*     */       } 
/*     */       break;
/*     */     } 
/* 161 */     this.a[paramInt] = a1;
/* 162 */     a1.e = paramInt;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 166 */     return (this.b == 0);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ho.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */