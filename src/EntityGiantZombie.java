/*    */ 
/*    */ 
/*    */ public class EntityGiantZombie
/*    */   extends EntityMob
/*    */ {
/*    */   public EntityGiantZombie(World paramdp) {
/*  7 */     super(paramdp);
/*  8 */     this.aB = "/mob/zombie.png";
/*  9 */     this.bf = 0.5F;
/* 10 */     this.ae = 50;
/* 11 */     this.health *= 10;
/* 12 */     this.yOffset *= 6.0F;
/* 13 */     setSize(this.C * 6.0F, this.D * 6.0F);
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     return this.worldObj.j(paramInt1, paramInt2, paramInt3) - 0.5F;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\opaqueCubeLookup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */