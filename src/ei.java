/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ei
/*    */   extends eu
/*    */ {
/*    */   int a;
/*    */   int b;
/* 12 */   int ac = 30;
/* 13 */   int ad = -1;
/*    */   
/*    */   public ei(World paramdp) {
/* 16 */     super(paramdp);
/* 17 */     this.aB = "/mob/creeper.png";
/*    */   }
/*    */   
/*    */   public void a(NBTTagCompound paramr) {
/* 21 */     super.a(paramr);
/*    */   }
/*    */   
/*    */   public void b(NBTTagCompound paramr) {
/* 25 */     super.b(paramr);
/*    */   }
/*    */   
/*    */   protected void d_() {
/* 29 */     this.b = this.a;
/* 30 */     if (this.a > 0 && this.ad < 0) this.a--; 
/* 31 */     if (this.ad >= 0) this.ad = 2; 
/* 32 */     super.d_();
/* 33 */     if (this.ad != 1) this.ad = -1; 
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 37 */     return "mob.creeper";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 41 */     return "mob.creeperdeath";
/*    */   }
/*    */   
/*    */   public void f(Entity paramdb) {
/* 45 */     super.f(paramdb);
/*    */     
/* 47 */     if (paramdb instanceof dz) {
/* 48 */       a(Item.aO.aQ + this.Q.nextInt(2), 1);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(Entity paramdb, float paramFloat) {
/* 53 */     if ((this.ad <= 0 && paramFloat < 3.0F) || (this.ad > 0 && paramFloat < 7.0F)) {
/* 54 */       if (this.a == 0) {
/* 55 */         this.g.a(this, "random.fuse", 1.0F, 0.5F);
/*    */       }
/* 57 */       this.ad = 1;
/* 58 */       this.a++;
/*    */       
/* 60 */       if (this.a == this.ac) {
/* 61 */         this.g.a(this, this.k, this.l, this.m, 3.0F);
/* 62 */         i();
/*    */       } 
/* 64 */       this.ag = true;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int g() {
/* 73 */     return Item.K.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ei.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */