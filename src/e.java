/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class e
/*    */   extends ay
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public e(int paramInt) {
/* 16 */     this.a = et.aW.ba;
/* 17 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(dp paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 21 */     if (paramdp.c(paramInt1, paramInt2, paramInt3) != hz.f) return false;
/*    */     
/* 23 */     float f = paramRandom.nextFloat() * 3.1415927F;
/*    */     
/* 25 */     double d1 = ((paramInt1 + 8) + fw.a(f) * this.b / 8.0F);
/* 26 */     double d2 = ((paramInt1 + 8) - fw.a(f) * this.b / 8.0F);
/* 27 */     double d3 = ((paramInt3 + 8) + fw.b(f) * this.b / 8.0F);
/* 28 */     double d4 = ((paramInt3 + 8) - fw.b(f) * this.b / 8.0F);
/*    */     
/* 30 */     double d5 = (paramInt2 + paramRandom.nextInt(3) + 2);
/* 31 */     double d6 = (paramInt2 + paramRandom.nextInt(3) + 2);
/*    */     
/* 33 */     for (byte b = 0; b <= this.b; b++) {
/* 34 */       double d7 = d1 + (d2 - d1) * b / this.b;
/* 35 */       double d8 = d5 + (d6 - d5) * b / this.b;
/* 36 */       double d9 = d3 + (d4 - d3) * b / this.b;
/*    */       
/* 38 */       double d10 = paramRandom.nextDouble() * this.b / 16.0D;
/* 39 */       double d11 = (fw.a(b * 3.1415927F / this.b) + 1.0F) * d10 + 1.0D;
/* 40 */       double d12 = (fw.a(b * 3.1415927F / this.b) + 1.0F) * d10 + 1.0D;
/*    */       
/* 42 */       for (int i = (int)(d7 - d11 / 2.0D); i <= (int)(d7 + d11 / 2.0D); i++) {
/* 43 */         for (int j = (int)(d8 - d12 / 2.0D); j <= (int)(d8 + d12 / 2.0D); j++) {
/* 44 */           for (int k = (int)(d9 - d11 / 2.0D); k <= (int)(d9 + d11 / 2.0D); k++) {
/* 45 */             double d13 = (i + 0.5D - d7) / d11 / 2.0D;
/* 46 */             double d14 = (j + 0.5D - d8) / d12 / 2.0D;
/* 47 */             double d15 = (k + 0.5D - d9) / d11 / 2.0D;
/* 48 */             if (d13 * d13 + d14 * d14 + d15 * d15 < 1.0D) {
/* 49 */               int m = paramdp.a(i, j, k);
/* 50 */               if (m == et.E.ba) paramdp.a(i, j, k, this.a); 
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 56 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */