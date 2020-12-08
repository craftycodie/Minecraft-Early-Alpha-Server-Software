/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class go
/*    */   extends Entity
/*    */ {
/*    */   public int a;
/* 13 */   public int b = 0;
/*    */   
/*    */   public go(World paramdp) {
/* 16 */     super(paramdp);
/*    */   }
/*    */   
/*    */   public go(World paramdp, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/* 20 */     super(paramdp);
/* 21 */     this.a = paramInt;
/* 22 */     this.d = true;
/* 23 */     a(0.98F, 0.98F);
/* 24 */     this.B = this.D / 2.0F;
/* 25 */     a(paramFloat1, paramFloat2, paramFloat3);
/*    */     
/* 27 */     this.n = 0.0D;
/* 28 */     this.o = 0.0D;
/* 29 */     this.p = 0.0D;
/*    */     
/* 31 */     this.G = false;
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
/* 43 */     if (this.a == 0) {
/* 44 */       i();
/*    */       
/*    */       return;
/*    */     } 
/* 48 */     this.h = this.posX;
/* 49 */     this.i = this.posY;
/* 50 */     this.j = this.posZ;
/* 51 */     this.b++;
/*    */     
/* 53 */     this.o -= 0.03999999910593033D;
/* 54 */     c(this.n, this.o, this.p);
/* 55 */     this.n *= 0.9800000190734863D;
/* 56 */     this.o *= 0.9800000190734863D;
/* 57 */     this.p *= 0.9800000190734863D;
/*    */     
/* 59 */     int i = MathHelper.floor_double(this.posX);
/* 60 */     int j = MathHelper.floor_double(this.posY);
/* 61 */     int k = MathHelper.floor_double(this.posZ);
/* 62 */     if (this.g.getBlockId(i, j, k) == this.a) {
/* 63 */       this.g.setBlockWithNotify(i, j, k, 0);
/*    */     }
/*    */     
/* 66 */     if (this.v) {
/* 67 */       this.n *= 0.699999988079071D;
/* 68 */       this.p *= 0.699999988079071D;
/* 69 */       this.o *= -0.5D;
/*    */       
/* 71 */       i();
/*    */       
/* 73 */       if (!this.g.a(this.a, i, j, k, true) || !this.g.setBlockWithNotify(i, j, k, this.a))
/*    */       {
/* 75 */         a(this.a, 1);
/*    */       }
/* 77 */     } else if (this.b > 100) {
/* 78 */       a(this.a, 1);
/* 79 */       i();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(NBTTagCompound paramr) {
/* 85 */     paramr.a("Tile", (byte)this.a);
/*    */   }
/*    */   
/*    */   protected void b(NBTTagCompound paramr) {
/* 89 */     this.a = paramr.b("Tile") & 0xFF;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\go.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */