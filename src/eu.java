/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eu
/*    */   extends fu
/*    */ {
/* 12 */   protected int ae = 2;
/*    */   
/*    */   public eu(dp paramdp) {
/* 15 */     super(paramdp);
/* 16 */     this.aK = 20;
/*    */   }
/*    */   
/*    */   public void x() {
/* 20 */     float f = b(1.0F);
/* 21 */     if (f > 0.5F) {
/* 22 */       this.aZ += 2;
/*    */     }
/* 24 */     super.x();
/*    */   }
/*    */   
/*    */   public void b_() {
/* 28 */     super.b_();
/* 29 */     if (this.g.j == 0) i(); 
/*    */   }
/*    */   
/*    */   protected db h() {
/* 33 */     eq eq = this.g.a(this, 16.0D);
/* 34 */     if (eq != null && g(eq)) return eq; 
/* 35 */     return null;
/*    */   }
/*    */   
/*    */   public boolean a(db paramdb, int paramInt) {
/* 39 */     if (super.a(paramdb, paramInt)) {
/* 40 */       if (paramdb != this) {
/* 41 */         this.af = paramdb;
/*    */       }
/* 43 */       return true;
/*    */     } 
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   protected void a(db paramdb, float paramFloat) {
/* 49 */     if (paramFloat < 2.5D && paramdb.u.e > this.u.b && paramdb.u.b < this.u.e) {
/* 50 */       this.aQ = 20;
/* 51 */       paramdb.a(this, this.ae);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 56 */     return 0.5F - this.g.j(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(r paramr) {
/* 60 */     super.a(paramr);
/*    */   }
/*    */   
/*    */   public void b(r paramr) {
/* 64 */     super.b(paramr);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 68 */     int i = fw.b(this.k);
/* 69 */     int j = fw.b(this.u.b);
/* 70 */     int k = fw.b(this.m);
/* 71 */     if (this.g.a(cr.a, i, j, k) > this.Q.nextInt(32)) return false; 
/* 72 */     int m = this.g.h(i, j, k);
/* 73 */     return (m <= this.Q.nextInt(8) && super.a());
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */