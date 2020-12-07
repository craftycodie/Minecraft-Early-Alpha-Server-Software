/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gt
/*    */   extends ao
/*    */ {
/*    */   public boolean a = false;
/* 10 */   public float b = 0.0F;
/* 11 */   public float ac = 0.0F;
/*    */   public float ad;
/* 13 */   public float ah = 1.0F; public float ae;
/*    */   public int ai;
/*    */   
/*    */   public gt(World paramdp) {
/* 17 */     super(paramdp);
/* 18 */     this.aB = "/mob/chicken.png";
/* 19 */     a(0.3F, 0.4F);
/* 20 */     this.aK = 4;
/* 21 */     this.ai = this.Q.nextInt(6000) + 6000;
/*    */   }
/*    */   
/*    */   public void x() {
/* 25 */     super.x();
/*    */     
/* 27 */     this.ae = this.b;
/* 28 */     this.ad = this.ac;
/*    */     
/* 30 */     this.ac = (float)(this.ac + (this.v ? -1 : 4) * 0.3D);
/* 31 */     if (this.ac < 0.0F) this.ac = 0.0F; 
/* 32 */     if (this.ac > 1.0F) this.ac = 1.0F;
/*    */     
/* 34 */     if (!this.v && this.ah < 1.0F) this.ah = 1.0F; 
/* 35 */     this.ah = (float)(this.ah * 0.9D);
/*    */     
/* 37 */     if (!this.v && this.o < 0.0D) {
/* 38 */       this.o *= 0.6D;
/*    */     }
/*    */     
/* 41 */     this.b += this.ah * 2.0F;
/*    */     
/* 43 */     if (--this.ai <= 0) {
/* 44 */       a(Item.aN.aQ, 1);
/* 45 */       this.ai = this.Q.nextInt(6000) + 6000;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(NBTTagCompound paramr) {
/* 51 */     super.a(paramr);
/*    */   }
/*    */   
/*    */   public void b(NBTTagCompound paramr) {
/* 55 */     super.b(paramr);
/*    */   }
/*    */   
/*    */   protected String c() {
/* 59 */     return "mob.chicken";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 63 */     return "mob.chickenhurt";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 67 */     return "mob.chickenhurt";
/*    */   }
/*    */   
/*    */   protected int g() {
/* 71 */     return Item.J.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */