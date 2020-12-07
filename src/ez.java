/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ez
/*    */   extends eu
/*    */ {
/*    */   public ez(World paramdp) {
/*  9 */     super(paramdp);
/* 10 */     this.aB = "/mob/zombie.png";
/* 11 */     this.bf = 0.5F;
/* 12 */     this.ae = 5;
/*    */   }
/*    */   
/*    */   public void x() {
/* 16 */     if (this.g.a()) {
/* 17 */       float f = b(1.0F);
/* 18 */       if (f > 0.5F && 
/* 19 */         this.g.g(fw.b(this.k), fw.b(this.l), fw.b(this.m)) && this.Q.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/* 20 */         this.T = 300;
/*    */       }
/*    */     } 
/*    */     
/* 24 */     super.x();
/*    */   }
/*    */   
/*    */   protected String c() {
/* 28 */     return "mob.zombie";
/*    */   }
/*    */   
/*    */   protected String getHurtSound() {
/* 32 */     return "mob.zombiehurt";
/*    */   }
/*    */   
/*    */   protected String getDeathSound() {
/* 36 */     return "mob.zombiedeath";
/*    */   }
/*    */   
/*    */   protected int g() {
/* 40 */     return Item.J.aQ;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ez.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */