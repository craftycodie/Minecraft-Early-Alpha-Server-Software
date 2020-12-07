/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hl
/*    */   extends ay
/*    */ {
/*    */   public boolean a(dp paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 11 */     int i = paramRandom.nextInt(3) + 4;
/*    */     
/* 13 */     boolean bool = true;
/* 14 */     if (paramInt2 < 1 || paramInt2 + i + 1 > 128) return false; 
/*    */     int j;
/* 16 */     for (j = paramInt2; j <= paramInt2 + 1 + i; j++) {
/* 17 */       byte b = 1;
/* 18 */       if (j == paramInt2) b = 0; 
/* 19 */       if (j >= paramInt2 + 1 + i - 2) b = 2; 
/* 20 */       for (int m = paramInt1 - b; m <= paramInt1 + b && bool; m++) {
/* 21 */         for (int n = paramInt3 - b; n <= paramInt3 + b && bool; n++) {
/* 22 */           if (j >= 0 && j < 128) {
/* 23 */             int i1 = paramdp.a(m, j, n);
/* 24 */             if (i1 != 0 && i1 != et.K.ba) bool = false; 
/*    */           } else {
/* 26 */             bool = false;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     if (!bool) return false;
/*    */     
/* 34 */     j = paramdp.a(paramInt1, paramInt2 - 1, paramInt3);
/* 35 */     if ((j != et.u.ba && j != et.v.ba) || paramInt2 >= 128 - i - 1) return false;
/*    */     
/* 37 */     paramdp.a(paramInt1, paramInt2 - 1, paramInt3, et.v.ba);
/*    */     int k;
/* 39 */     for (k = paramInt2 - 3 + i; k <= paramInt2 + i; k++) {
/* 40 */       int m = k - paramInt2 + i;
/* 41 */       int n = 1 - m / 2;
/* 42 */       for (int i1 = paramInt1 - n; i1 <= paramInt1 + n; i1++) {
/* 43 */         int i2 = i1 - paramInt1;
/* 44 */         for (int i3 = paramInt3 - n; i3 <= paramInt3 + n; i3++) {
/* 45 */           int i4 = i3 - paramInt3;
/* 46 */           if ((Math.abs(i2) != n || Math.abs(i4) != n || (paramRandom.nextInt(2) != 0 && m != 0)) && 
/* 47 */             !et.p[paramdp.a(i1, k, i3)]) paramdp.a(i1, k, i3, et.K.ba); 
/*    */         } 
/*    */       } 
/*    */     } 
/* 51 */     for (k = 0; k < i; k++) {
/* 52 */       int m = paramdp.a(paramInt1, paramInt2 + k, paramInt3);
/* 53 */       if (m == 0 || m == et.K.ba) paramdp.a(paramInt1, paramInt2 + k, paramInt3, et.J.ba); 
/*    */     } 
/* 55 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */