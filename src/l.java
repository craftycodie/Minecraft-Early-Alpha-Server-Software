/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class l
/*     */   extends gb
/*     */ {
/*     */   protected l(int paramInt1, int paramInt2) {
/*  11 */     super(paramInt1, paramInt2);
/*  12 */     this.aZ = paramInt2;
/*     */     
/*  14 */     a(true);
/*  15 */     float f = 0.5F;
/*  16 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*     */   }
/*     */   
/*     */   protected boolean b(int paramInt) {
/*  20 */     return (paramInt == et.aA.ba);
/*     */   }
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  24 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramRandom);
/*  25 */     if (paramdp.h(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/*     */       
/*  27 */       int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  28 */       if (i < 7) {
/*  29 */         float f = h(paramdp, paramInt1, paramInt2, paramInt3);
/*     */         
/*  31 */         if (paramRandom.nextInt((int)(100.0F / f)) == 0) {
/*  32 */           i++;
/*  33 */           paramdp.b(paramInt1, paramInt2, paramInt3, i);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private float h(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     float f = 1.0F;
/*     */     
/*  42 */     int i = paramdp.a(paramInt1, paramInt2, paramInt3 - 1);
/*  43 */     int j = paramdp.a(paramInt1, paramInt2, paramInt3 + 1);
/*  44 */     int k = paramdp.a(paramInt1 - 1, paramInt2, paramInt3);
/*  45 */     int m = paramdp.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  47 */     int n = paramdp.a(paramInt1 - 1, paramInt2, paramInt3 - 1);
/*  48 */     int i1 = paramdp.a(paramInt1 + 1, paramInt2, paramInt3 - 1);
/*  49 */     int i2 = paramdp.a(paramInt1 + 1, paramInt2, paramInt3 + 1);
/*  50 */     int i3 = paramdp.a(paramInt1 - 1, paramInt2, paramInt3 + 1);
/*     */     
/*  52 */     boolean bool1 = (k == this.ba || m == this.ba) ? true : false;
/*  53 */     boolean bool2 = (i == this.ba || j == this.ba) ? true : false;
/*  54 */     boolean bool3 = (n == this.ba || i1 == this.ba || i2 == this.ba || i3 == this.ba) ? true : false;
/*     */     
/*  56 */     for (int i4 = paramInt1 - 1; i4 <= paramInt1 + 1; i4++) {
/*  57 */       for (int i5 = paramInt3 - 1; i5 <= paramInt3 + 1; i5++) {
/*  58 */         int i6 = paramdp.a(i4, paramInt2 - 1, i5);
/*     */         
/*  60 */         float f1 = 0.0F;
/*  61 */         if (i6 == et.aA.ba) {
/*  62 */           f1 = 1.0F;
/*  63 */           if (paramdp.b(i4, paramInt2 - 1, i5) > 0) f1 = 3.0F;
/*     */         
/*     */         } 
/*  66 */         if (i4 != paramInt1 || i5 != paramInt3) f1 /= 4.0F;
/*     */         
/*  68 */         f += f1;
/*     */       } 
/*     */     } 
/*  71 */     if (bool3 || (bool1 && bool2)) f /= 2.0F;
/*     */     
/*  73 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  82 */     return 6;
/*     */   }
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  86 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/*  88 */     for (byte b = 0; b < 3; b++) {
/*  89 */       if (paramdp.k.nextInt(15) <= paramInt4) {
/*  90 */         float f1 = 0.7F;
/*  91 */         float f2 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  92 */         float f3 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  93 */         float f4 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  94 */         fa fa = new fa(paramdp, (paramInt1 + f2), (paramInt2 + f3), (paramInt3 + f4), new gc(en.Q));
/*  95 */         fa.ac = 10;
/*  96 */         paramdp.a(fa);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public int a(int paramInt, Random paramRandom) {
/* 101 */     System.out.println("Get resource: " + paramInt);
/* 102 */     if (paramInt == 7) {
/* 103 */       return en.R.aQ;
/*     */     }
/*     */     
/* 106 */     return -1;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 110 */     return 1;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */