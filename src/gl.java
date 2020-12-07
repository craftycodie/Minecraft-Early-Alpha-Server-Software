/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gl
/*    */   extends et
/*    */ {
/*    */   protected gl(int paramInt) {
/* 12 */     super(paramInt, hz.b);
/* 13 */     this.aZ = 3;
/* 14 */     a(true);
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
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 26 */     if (paramdp.h(paramInt1, paramInt2 + 1, paramInt3) < 4 && paramdp.c(paramInt1, paramInt2 + 1, paramInt3).b()) {
/* 27 */       if (paramRandom.nextInt(4) != 0)
/* 28 */         return;  paramdp.d(paramInt1, paramInt2, paramInt3, et.v.ba);
/*    */     }
/* 30 */     else if (paramdp.h(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/* 31 */       int i = paramInt1 + paramRandom.nextInt(3) - 1;
/* 32 */       int j = paramInt2 + paramRandom.nextInt(5) - 3;
/* 33 */       int k = paramInt3 + paramRandom.nextInt(3) - 1;
/* 34 */       if (paramdp.a(i, j, k) == et.v.ba && paramdp.h(i, j + 1, k) >= 4 && !paramdp.c(i, j + 1, k).b()) {
/* 35 */         paramdp.d(i, j, k, et.u.ba);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 42 */     return et.v.a(0, paramRandom);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */