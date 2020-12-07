/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ao
/*    */   extends fu
/*    */ {
/*    */   public ao(dp paramdp) {
/* 13 */     super(paramdp);
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     if (this.g.a(paramInt1, paramInt2 - 1, paramInt3) == et.u.ba) return 10.0F; 
/* 18 */     return this.g.j(paramInt1, paramInt2, paramInt3) - 0.5F;
/*    */   }
/*    */   
/*    */   public void a(r paramr) {
/* 22 */     super.a(paramr);
/*    */   }
/*    */   
/*    */   public void b(r paramr) {
/* 26 */     super.b(paramr);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 30 */     int i = fw.b(this.k);
/* 31 */     int j = fw.b(this.u.b);
/* 32 */     int k = fw.b(this.m);
/* 33 */     return (this.g.a(i, j - 1, k) == et.u.ba && this.g.h(i, j, k) > 8 && super.a());
/*    */   }
/*    */   
/*    */   public int b() {
/* 37 */     return 120;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */