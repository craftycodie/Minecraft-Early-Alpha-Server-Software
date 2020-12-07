/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class an
/*    */   extends ay
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public an(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(dp paramdp, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 16 */     for (byte b = 0; b < 64; b++) {
/* 17 */       int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 18 */       int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 19 */       int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 20 */       if (paramdp.a(i, j, k) == 0 && (
/* 21 */         (gb)et.n[this.a]).f(paramdp, i, j, k)) {
/* 22 */         paramdp.a(i, j, k, this.a);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 27 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */