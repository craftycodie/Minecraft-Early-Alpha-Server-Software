/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aq
/*    */   extends et
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public aq(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 15 */     super(paramInt1, paramInt2, hz.d);
/* 16 */     if (paramBoolean) {
/* 17 */       a(true);
/*    */     }
/* 19 */     this.a = paramBoolean;
/*    */   }
/*    */   
/*    */   public int c() {
/* 23 */     return 30;
/*    */   }
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/* 27 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/* 28 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*    */   }
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, db paramdb) {
/* 32 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/* 33 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramdb);
/*    */   }
/*    */   
/*    */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/* 37 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/* 38 */     return super.a(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*    */   }
/*    */   
/*    */   private void g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 42 */     h(paramdp, paramInt1, paramInt2, paramInt3);
/* 43 */     if (this.ba == et.aN.ba) {
/* 44 */       paramdp.d(paramInt1, paramInt2, paramInt3, et.aO.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 49 */     if (this.ba == et.aO.ba) {
/* 50 */       paramdp.d(paramInt1, paramInt2, paramInt3, et.aN.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 55 */     return en.aA.aQ;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 59 */     return 4 + paramRandom.nextInt(2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void h(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 69 */     Random random = paramdp.k;
/* 70 */     double d = 0.0625D;
/* 71 */     for (byte b = 0; b < 6; b++) {
/* 72 */       double d1 = (paramInt1 + random.nextFloat());
/* 73 */       double d2 = (paramInt2 + random.nextFloat());
/* 74 */       double d3 = (paramInt3 + random.nextFloat());
/* 75 */       if (b == 0 && !paramdp.d(paramInt1, paramInt2 + 1, paramInt3)) d2 = (paramInt2 + 1) + d; 
/* 76 */       if (b == 1 && !paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) d2 = (paramInt2 + 0) - d; 
/* 77 */       if (b == 2 && !paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) d3 = (paramInt3 + 1) + d; 
/* 78 */       if (b == 3 && !paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) d3 = (paramInt3 + 0) - d; 
/* 79 */       if (b == 4 && !paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) d1 = (paramInt1 + 1) + d; 
/* 80 */       if (b == 5 && !paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) d1 = (paramInt1 + 0) - d; 
/* 81 */       if (d1 < paramInt1 || d1 > (paramInt1 + 1) || d2 < 0.0D || d2 > (paramInt2 + 1) || d3 < paramInt3 || d3 > (paramInt3 + 1))
/* 82 */         paramdp.a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\aq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */