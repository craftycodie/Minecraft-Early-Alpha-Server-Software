/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dz
/*    */   extends eu
/*    */ {
/*    */   public dz(dp paramdp) {
/* 14 */     super(paramdp);
/* 15 */     this.aB = "/mob/skeleton.png";
/*    */   }
/*    */ 
/*    */   
/*    */   protected String c() {
/* 20 */     return "mob.skeleton";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 24 */     return "mob.skeletonhurt";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 28 */     return "mob.skeletonhurt";
/*    */   }
/*    */ 
/*    */   
/*    */   public void x() {
/* 33 */     if (this.g.a()) {
/* 34 */       float f = b(1.0F);
/* 35 */       if (f > 0.5F && 
/* 36 */         this.g.g(fw.b(this.k), fw.b(this.l), fw.b(this.m)) && this.Q.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/* 37 */         this.T = 300;
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 42 */     super.x();
/*    */   }
/*    */   
/*    */   protected void a(db paramdb, float paramFloat) {
/* 46 */     if (paramFloat < 10.0F) {
/* 47 */       double d1 = paramdb.k - this.k;
/* 48 */       double d2 = paramdb.m - this.m;
/*    */       
/* 50 */       if (this.aQ == 0) {
/* 51 */         da da = new da(this.g, this);
/* 52 */         da.l += 1.399999976158142D;
/*    */         
/* 54 */         double d = paramdb.l - 0.20000000298023224D - da.l;
/*    */         
/* 56 */         float f = fw.a(d1 * d1 + d2 * d2) * 0.2F;
/*    */         
/* 58 */         this.g.a(this, "random.bow", 1.0F, 1.0F / (this.Q.nextFloat() * 0.4F + 0.8F));
/* 59 */         this.g.a(da);
/* 60 */         da.a(d1, d + f, d2, 0.6F, 12.0F);
/* 61 */         this.aQ = 30;
/*    */       } 
/* 63 */       this.q = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/*    */       
/* 65 */       this.ag = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(r paramr) {
/* 70 */     super.a(paramr);
/*    */   }
/*    */   
/*    */   public void b(r paramr) {
/* 74 */     super.b(paramr);
/*    */   }
/*    */   
/*    */   protected int g() {
/* 78 */     return en.j.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */