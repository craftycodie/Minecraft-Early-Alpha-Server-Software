/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dm
/*     */   extends cl
/*     */ {
/*     */   private final boolean a;
/*     */   
/*     */   protected dm(int paramInt, boolean paramBoolean) {
/*  14 */     super(paramInt, hz.d);
/*  15 */     this.a = paramBoolean;
/*  16 */     this.aZ = 45;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  20 */     return et.aB.ba;
/*     */   }
/*     */   
/*     */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  24 */     super.e(paramdp, paramInt1, paramInt2, paramInt3);
/*  25 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  29 */     int i = paramdp.a(paramInt1, paramInt2, paramInt3 - 1);
/*  30 */     int j = paramdp.a(paramInt1, paramInt2, paramInt3 + 1);
/*  31 */     int k = paramdp.a(paramInt1 - 1, paramInt2, paramInt3);
/*  32 */     int m = paramdp.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  34 */     byte b = 3;
/*  35 */     if (et.p[i] && !et.p[j]) b = 3; 
/*  36 */     if (et.p[j] && !et.p[i]) b = 2; 
/*  37 */     if (et.p[k] && !et.p[m]) b = 5; 
/*  38 */     if (et.p[m] && !et.p[k]) b = 4; 
/*  39 */     paramdp.b(paramInt1, paramInt2, paramInt3, b);
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
/*     */   public int a(int paramInt) {
/*  80 */     if (paramInt == 1) return et.t.ba; 
/*  81 */     if (paramInt == 0) return et.t.ba; 
/*  82 */     if (paramInt == 3) return this.aZ - 1; 
/*  83 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/*  87 */     cx cx = (cx)paramdp.k(paramInt1, paramInt2, paramInt3);
/*  88 */     parameq.a(cx);
/*  89 */     return true;
/*     */   }
/*     */   
/*     */   public static void a(boolean paramBoolean, dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  94 */     ap ap = paramdp.k(paramInt1, paramInt2, paramInt3);
/*     */     
/*  96 */     if (paramBoolean) { paramdp.d(paramInt1, paramInt2, paramInt3, et.aC.ba); }
/*  97 */     else { paramdp.d(paramInt1, paramInt2, paramInt3, et.aB.ba); }
/*     */     
/*  99 */     paramdp.b(paramInt1, paramInt2, paramInt3, i);
/* 100 */     paramdp.a(paramInt1, paramInt2, paramInt3, ap);
/*     */   }
/*     */   
/*     */   protected ap a_() {
/* 104 */     return new cx();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */