/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gb
/*    */   extends et
/*    */ {
/*    */   protected gb(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, hz.i);
/* 12 */     this.aZ = paramInt2;
/* 13 */     a(true);
/* 14 */     float f = 0.2F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 19 */     return b(paramdp.a(paramInt1, paramInt2 - 1, paramInt3));
/*    */   }
/*    */   
/*    */   protected boolean b(int paramInt) {
/* 23 */     return (paramInt == et.u.ba || paramInt == et.v.ba || paramInt == et.aA.ba);
/*    */   }
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 27 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 28 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 32 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected final void g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 36 */     if (!f(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 37 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/* 38 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean f(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 43 */     return ((paramdp.h(paramInt1, paramInt2, paramInt3) >= 8 || paramdp.g(paramInt1, paramInt2, paramInt3)) && b(paramdp.a(paramInt1, paramInt2 - 1, paramInt3)));
/*    */   }
/*    */   
/*    */   public cy d(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 47 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 55 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a() {
/* 63 */     return 1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */