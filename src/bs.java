/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bs
/*    */   extends Entity
/*    */ {
/* 11 */   public int a = 0;
/*    */   
/*    */   public bs(World paramdp) {
/* 14 */     super(paramdp);
/* 15 */     this.d = true;
/* 16 */     a(0.98F, 0.98F);
/* 17 */     this.B = this.D / 2.0F;
/*    */   }
/*    */   
/*    */   public bs(World paramdp, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 21 */     this(paramdp);
/*    */     
/* 23 */     a(paramFloat1, paramFloat2, paramFloat3);
/*    */     
/* 25 */     float f = (float)(Math.random() * 3.1415927410125732D * 2.0D);
/* 26 */     this.n = (-fw.a(f * 3.1415927F / 180.0F) * 0.02F);
/* 27 */     this.o = 0.20000000298023224D;
/* 28 */     this.p = (-fw.b(f * 3.1415927F / 180.0F) * 0.02F);
/*    */     
/* 30 */     this.G = false;
/* 31 */     this.a = 80;
/*    */     
/* 33 */     this.h = paramFloat1;
/* 34 */     this.i = paramFloat2;
/* 35 */     this.j = paramFloat3;
/*    */   }
/*    */   
/*    */   public boolean c_() {
/* 39 */     return !this.A;
/*    */   }
/*    */   
/*    */   public void b_() {
/* 43 */     this.h = this.k;
/* 44 */     this.i = this.l;
/* 45 */     this.j = this.m;
/*    */     
/* 47 */     this.o -= 0.03999999910593033D;
/* 48 */     c(this.n, this.o, this.p);
/* 49 */     this.n *= 0.9800000190734863D;
/* 50 */     this.o *= 0.9800000190734863D;
/* 51 */     this.p *= 0.9800000190734863D;
/*    */     
/* 53 */     if (this.v) {
/* 54 */       this.n *= 0.699999988079071D;
/* 55 */       this.p *= 0.699999988079071D;
/* 56 */       this.o *= -0.5D;
/*    */     } 
/*    */     
/* 59 */     if (this.a-- <= 0) {
/* 60 */       i();
/* 61 */       b();
/*    */     } else {
/* 63 */       this.g.a("smoke", this.k, this.l + 0.5D, this.m, 0.0D, 0.0D, 0.0D);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void b() {
/* 69 */     float f = 4.0F;
/* 70 */     this.g.a((Entity)null, this.k, this.l, this.m, f);
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
/*    */   protected void a(NBTTagCompound paramr) {
/* 85 */     paramr.a("Fuse", (byte)this.a);
/*    */   }
/*    */   
/*    */   protected void b(NBTTagCompound paramr) {
/* 89 */     this.a = paramr.b("Fuse");
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */