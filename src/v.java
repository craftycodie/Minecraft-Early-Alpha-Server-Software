/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class v
/*    */   extends cg
/*    */ {
/*    */   protected v(int paramInt, hz paramhz) {
/* 10 */     super(paramInt, paramhz);
/*    */     
/* 12 */     a(false);
/* 13 */     if (paramhz == hz.g) a(true);
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 22 */     if (paramdp.a(paramInt1, paramInt2, paramInt3) == this.ba) {
/* 23 */       i(paramdp, paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   private void i(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 28 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/* 29 */     paramdp.g = true;
/* 30 */     paramdp.a(paramInt1, paramInt2, paramInt3, this.ba - 1, i);
/* 31 */     paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/* 32 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.ba - 1);
/* 33 */     paramdp.g = false;
/*    */   }
/*    */   
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 37 */     if (this.bl == hz.g) {
/* 38 */       int i = paramRandom.nextInt(3);
/* 39 */       for (byte b = 0; b < i; b++) {
/* 40 */         paramInt1 += paramRandom.nextInt(3) - 1;
/* 41 */         paramInt2++;
/* 42 */         paramInt3 += paramRandom.nextInt(3) - 1;
/* 43 */         int j = paramdp.a(paramInt1, paramInt2, paramInt3);
/* 44 */         if (j == 0) {
/* 45 */           if (j(paramdp, paramInt1 - 1, paramInt2, paramInt3) || j(paramdp, paramInt1 + 1, paramInt2, paramInt3) || j(paramdp, paramInt1, paramInt2, paramInt3 - 1) || j(paramdp, paramInt1, paramInt2, paramInt3 + 1) || j(paramdp, paramInt1, paramInt2 - 1, paramInt3) || j(paramdp, paramInt1, paramInt2 + 1, paramInt3)) {
/* 46 */             paramdp.d(paramInt1, paramInt2, paramInt3, et.ar.ba);
/*    */             return;
/*    */           } 
/* 49 */         } else if ((et.n[j]).bl.c()) {
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean j(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 58 */     return paramdp.c(paramInt1, paramInt2, paramInt3).e();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */