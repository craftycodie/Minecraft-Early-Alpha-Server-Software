/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hy
/*    */   extends et
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public hy(int paramInt, boolean paramBoolean) {
/* 14 */     super(paramInt, 6, hz.d);
/* 15 */     this.a = paramBoolean;
/*    */     
/* 17 */     if (!paramBoolean)
/*    */     {
/* 19 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*    */     }
/* 21 */     c(255);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt) {
/* 26 */     if (paramInt <= 1) return 6; 
/* 27 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 32 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 37 */     if (this != et.ak) {
/*    */       return;
/*    */     }
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 59 */     if (this != et.ak) super.e(paramdp, paramInt1, paramInt2, paramInt3); 
/* 60 */     int i = paramdp.a(paramInt1, paramInt2 - 1, paramInt3);
/*    */     
/* 62 */     if (i == ak.ba) {
/*    */       
/* 64 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/* 65 */       paramdp.d(paramInt1, paramInt2 - 1, paramInt3, et.aj.ba);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 71 */     return et.ak.ba;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 81 */     if (this != et.ak) super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4); 
/* 82 */     if (paramInt4 == 1) return true; 
/* 83 */     if (!super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4)) return false; 
/* 84 */     if (paramInt4 == 0) return true; 
/* 85 */     return (paramhb.a(paramInt1, paramInt2, paramInt3) != this.ba);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */