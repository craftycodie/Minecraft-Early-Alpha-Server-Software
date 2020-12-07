/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gm
/*    */   extends et
/*    */ {
/*    */   protected gm(int paramInt1, int paramInt2) {
/* 13 */     super(paramInt1, paramInt2, hz.s);
/* 14 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/* 15 */     a(true);
/*    */   }
/*    */   
/*    */   public cy d(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 19 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 27 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 35 */     return paramdp.c(paramInt1, paramInt2 - 1, paramInt3).c();
/*    */   }
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 39 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   private boolean g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 43 */     if (!a(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 44 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/* 45 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/* 46 */       return false;
/*    */     } 
/* 48 */     return true;
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
/*    */   public int a(int paramInt, Random paramRandom) {
/* 64 */     return en.aB.aQ;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 68 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 72 */     if (paramdp.a(cr.b, paramInt1, paramInt2, paramInt3) > 11) {
/* 73 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/* 74 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 79 */     hz hz = paramhb.c(paramInt1, paramInt2, paramInt3);
/* 80 */     if (paramInt4 == 1) return true; 
/* 81 */     if (hz == this.bl) return false; 
/* 82 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */