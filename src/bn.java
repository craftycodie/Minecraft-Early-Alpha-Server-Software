/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bn
/*     */   extends o
/*     */ {
/*     */   private int b;
/*  11 */   private int c = 0;
/*     */   
/*     */   protected bn(int paramInt1, int paramInt2) {
/*  14 */     super(paramInt1, paramInt2, hz.h, false);
/*  15 */     this.b = paramInt2;
/*  16 */     a(true);
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  20 */     this.c = 0;
/*  21 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*  22 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  26 */     if (paramdp.a(paramInt1, paramInt2, paramInt3) != this.ba)
/*  27 */       return;  int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  28 */     if (i == 0 || i != paramInt4 - 1)
/*  29 */       return;  g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     if (this.c++ >= 100)
/*  34 */       return;  int i = paramdp.c(paramInt1, paramInt2 - 1, paramInt3).a() ? 16 : 0;
/*     */     
/*  36 */     int j = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  37 */     if (j == 0) {
/*  38 */       j = 1;
/*  39 */       paramdp.b(paramInt1, paramInt2, paramInt3, 1);
/*     */     } 
/*  41 */     i = f(paramdp, paramInt1, paramInt2 - 1, paramInt3, i);
/*  42 */     i = f(paramdp, paramInt1, paramInt2, paramInt3 - 1, i);
/*  43 */     i = f(paramdp, paramInt1, paramInt2, paramInt3 + 1, i);
/*  44 */     i = f(paramdp, paramInt1 - 1, paramInt2, paramInt3, i);
/*  45 */     i = f(paramdp, paramInt1 + 1, paramInt2, paramInt3, i);
/*  46 */     int k = i - 1;
/*  47 */     if (k < 10) {
/*  48 */       k = 1;
/*     */     }
/*     */     
/*  51 */     if (k != j) {
/*  52 */       paramdp.b(paramInt1, paramInt2, paramInt3, k);
/*  53 */       e(paramdp, paramInt1, paramInt2 - 1, paramInt3, j);
/*  54 */       e(paramdp, paramInt1, paramInt2 + 1, paramInt3, j);
/*  55 */       e(paramdp, paramInt1, paramInt2, paramInt3 - 1, j);
/*  56 */       e(paramdp, paramInt1, paramInt2, paramInt3 + 1, j);
/*  57 */       e(paramdp, paramInt1 - 1, paramInt2, paramInt3, j);
/*  58 */       e(paramdp, paramInt1 + 1, paramInt2, paramInt3, j);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int f(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  63 */     int i = paramdp.a(paramInt1, paramInt2, paramInt3);
/*  64 */     if (i == et.J.ba) return 16; 
/*  65 */     if (i == this.ba) {
/*  66 */       int j = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  67 */       if (j != 0 && j > paramInt4) return j; 
/*     */     } 
/*  69 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  73 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  74 */     if (i == 0) {
/*  75 */       this.c = 0;
/*  76 */       g(paramdp, paramInt1, paramInt2, paramInt3);
/*  77 */     } else if (i == 1) {
/*  78 */       h(paramdp, paramInt1, paramInt2, paramInt3);
/*  79 */     } else if (paramRandom.nextInt(10) == 0) {
/*  80 */       g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  85 */     a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/*  86 */     paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/*  90 */     return (paramRandom.nextInt(20) == 0) ? 1 : 0;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  94 */     return et.y.ba;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  98 */     return !this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, db paramdb) {
/* 107 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramdb);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */