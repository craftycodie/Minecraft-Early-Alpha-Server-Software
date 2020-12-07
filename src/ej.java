/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ej
/*    */   extends NoiseGenerator
/*    */ {
/*    */   private NoiseGeneratorPerlin[] a;
/*    */   private int b;
/*    */   
/*    */   public ej(Random paramRandom, int paramInt) {
/* 14 */     this.b = paramInt;
/* 15 */     this.a = new NoiseGeneratorPerlin[paramInt];
/* 16 */     for (int b = 0; b < paramInt; b++) {
/* 17 */       this.a[b] = new NoiseGeneratorPerlin(paramRandom);
/*    */     }
/*    */   }
/*    */   
/*    */   public double a(double paramDouble1, double paramDouble2) {
/* 22 */     double d1 = 0.0D;
/* 23 */     double d2 = 1.0D;
/*    */     
/* 25 */     for (int b = 0; b < this.b; b++) {
/* 26 */       d1 += this.a[b].a(paramDouble1 * d2, paramDouble2 * d2) / d2;
/* 27 */       d2 /= 2.0D;
/*    */     } 
/*    */     
/* 30 */     return d1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double[] a(double[] paramArrayOfdouble, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 46 */     if (paramArrayOfdouble == null) { paramArrayOfdouble = new double[paramInt1 * paramInt2 * paramInt3]; }
/* 47 */     else { for (int b1 = 0; b1 < paramArrayOfdouble.length; b1++) {
/* 48 */         paramArrayOfdouble[b1] = 0.0D;
/*    */       } }
/*    */     
/* 51 */     double d = 1.0D;
/*    */     
/* 53 */     for (int b = 0; b < this.b; b++) {
/*    */       
/* 55 */       this.a[b].a(paramArrayOfdouble, paramDouble1, paramDouble2, paramDouble3, paramInt1, paramInt2, paramInt3, paramDouble4 * d, paramDouble5 * d, paramDouble6 * d, d);
/* 56 */       d /= 2.0D;
/*    */     } 
/*    */     
/* 59 */     return paramArrayOfdouble;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ej.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */