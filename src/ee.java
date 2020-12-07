/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ee
/*    */   extends ay
/*    */ {
/*    */   public boolean a(dp paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 10 */     for (byte b = 0; b < 10; b++) {
/* 11 */       int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 12 */       int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 13 */       int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 14 */       if (paramdp.a(i, j, k) == 0) {
/* 15 */         int m = 1 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 16 */         for (byte b1 = 0; b1 < m; b1++) {
/* 17 */           if (et.aV.f(paramdp, i, j + b1, k)) {
/* 18 */             paramdp.a(i, j + b1, k, et.aV.ba);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 24 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ee.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */