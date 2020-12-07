/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class m
/*    */   extends gk
/*    */ {
/*    */   public m(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2, hz.r, false);
/* 11 */     this.bm = 0.98F;
/* 12 */     a(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 20 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, 1 - paramInt4);
/*    */   }
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 24 */     hz hz = paramdp.c(paramInt1, paramInt2 - 1, paramInt3);
/* 25 */     if (hz.c() || hz.d()) {
/* 26 */       paramdp.d(paramInt1, paramInt2, paramInt3, et.A.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 31 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 35 */     if (paramdp.a(cr.b, paramInt1, paramInt2, paramInt3) > 11 - et.q[this.ba]) {
/* 36 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/* 37 */       paramdp.d(paramInt1, paramInt2, paramInt3, et.B.ba);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */