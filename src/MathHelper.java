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
/*    */ public class MathHelper
/*    */ {
/* 16 */   private static float[] a = new float[65536]; static {
/* 17 */     for (int b = 0; b < 65536; b++) {
/* 18 */       a[b] = (float)Math.sin(b * Math.PI * 2.0D / 65536.0D);
/*    */     }
/*    */   }
/*    */   
/*    */   public static final float a(float paramFloat) {
/* 23 */     return a[(int)(paramFloat * 10430.378F) & 0xFFFF];
/*    */   }
/*    */   
/*    */   public static final float b(float paramFloat) {
/* 27 */     return a[(int)(paramFloat * 10430.378F + 16384.0F) & 0xFFFF];
/*    */   }
/*    */   
/*    */   public static final float c(float paramFloat) {
/* 31 */     return (float)Math.sqrt(paramFloat);
/*    */   }
/*    */   
/*    */   public static final float a(double paramDouble) {
/* 35 */     return (float)Math.sqrt(paramDouble);
/*    */   }
/*    */   
/*    */   public static int floor_float(float paramFloat) {
/* 39 */     int i = (int)paramFloat;
/* 40 */     return (paramFloat < i) ? (i - 1) : i;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int floor_double(double paramDouble) {
/* 48 */     int i = (int)paramDouble;
/* 49 */     return (paramDouble < i) ? (i - 1) : i;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static float e(float paramFloat) {
/* 57 */     return (paramFloat >= 0.0F) ? paramFloat : -paramFloat;
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
/*    */   public static double a(double paramDouble1, double paramDouble2) {
/* 86 */     if (paramDouble1 < 0.0D) paramDouble1 = -paramDouble1; 
/* 87 */     if (paramDouble2 < 0.0D) paramDouble2 = -paramDouble2; 
/* 88 */     return (paramDouble1 > paramDouble2) ? paramDouble1 : paramDouble2;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */