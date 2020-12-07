/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dj
/*     */   implements hb
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private hv[][] c;
/*     */   private dp d;
/*     */   
/*     */   public dj(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  16 */     this.d = paramdp;
/*     */     
/*  18 */     this.a = paramInt1 >> 4;
/*  19 */     this.b = paramInt3 >> 4;
/*  20 */     int i = paramInt4 >> 4;
/*  21 */     int j = paramInt6 >> 4;
/*     */     
/*  23 */     this.c = new hv[i - this.a + 1][j - this.b + 1];
/*     */     
/*  25 */     for (int k = this.a; k <= i; k++) {
/*  26 */       for (int m = this.b; m <= j; m++) {
/*  27 */         this.c[k - this.a][m - this.b] = paramdp.b(k, m);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     if (paramInt2 < 0) return 0; 
/*  34 */     if (paramInt2 >= 128) return 0; 
/*  35 */     int i = (paramInt1 >> 4) - this.a;
/*  36 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  38 */     return this.c[i][j].a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
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
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3) {
/*  91 */     if (paramInt2 < 0) return 0; 
/*  92 */     if (paramInt2 >= 128) return 0; 
/*  93 */     int i = (paramInt1 >> 4) - this.a;
/*  94 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  96 */     return this.c[i][j].b(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */   public hz c(int paramInt1, int paramInt2, int paramInt3) {
/* 100 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 101 */     if (i == 0) return hz.a; 
/* 102 */     return (et.n[i]).bl;
/*     */   }
/*     */   
/*     */   public boolean d(int paramInt1, int paramInt2, int paramInt3) {
/* 106 */     et et = et.n[a(paramInt1, paramInt2, paramInt3)];
/* 107 */     if (et == null) return false; 
/* 108 */     return et.b();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */