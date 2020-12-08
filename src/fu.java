/*     */ 
/*     */ 
/*     */ 
/*     */ public class fu
/*     */   extends EntityLiving
/*     */ {
/*     */   private bx a;
/*     */   protected Entity af;
/*     */   protected boolean ag;
/*     */   
/*     */   public fu(World paramdp) {
/*  12 */     super(paramdp);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  17 */     this.ag = false;
/*     */   }
/*     */   protected void d_() {
/*  20 */     this.ag = false;
/*  21 */     float f = 16.0F;
/*     */     
/*  23 */     if (this.af == null) {
/*  24 */       this.af = h();
/*  25 */       if (this.af != null) {
/*  26 */         this.a = this.g.a(this, this.af, f);
/*     */       }
/*     */     }
/*  29 */     else if (!this.af.r()) {
/*  30 */       this.af = null;
/*     */     } else {
/*  32 */       float f1 = this.af.a(this);
/*  33 */       if (g(this.af)) {
/*  34 */         a(this.af, f1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     if (!this.ag && this.af != null && (this.a == null || this.Q.nextInt(20) == 0)) {
/*  47 */       this.a = this.g.a(this, this.af, f);
/*  48 */     } else if ((this.a == null && this.Q.nextInt(80) == 0) || this.Q.nextInt(80) == 0) {
/*     */       
/*  50 */       boolean bool = false;
/*  51 */       int j = -1;
/*  52 */       int k = -1;
/*  53 */       int m = -1;
/*  54 */       float f1 = -99999.0F;
/*  55 */       for (int b = 0; b < 10; b++) {
/*  56 */         int n = MathHelper.floor_double(this.posX + this.Q.nextInt(13) - 6.0D);
/*  57 */         int i1 = MathHelper.floor_double(this.posY + this.Q.nextInt(7) - 3.0D);
/*  58 */         int i2 = MathHelper.floor_double(this.posZ + this.Q.nextInt(13) - 6.0D);
/*  59 */         float f2 = a(n, i1, i2);
/*  60 */         if (f2 > f1) {
/*  61 */           f1 = f2;
/*  62 */           j = n;
/*  63 */           k = i1;
/*  64 */           m = i2;
/*  65 */           bool = true;
/*     */         } 
/*     */       } 
/*     */       
/*  69 */       if (bool) {
/*  70 */         this.a = this.g.a(this, j, k, m, 10.0F);
/*     */       }
/*     */     } 
/*     */     
/*  74 */     int i = MathHelper.floor_double(this.u.b);
/*     */     
/*  76 */     boolean bool1 = m();
/*  77 */     boolean bool2 = o();
/*  78 */     this.rotationPitch = 0.0F;
/*  79 */     if (this.a == null || this.Q.nextInt(100) == 0) {
/*  80 */       super.d_();
/*  81 */       this.a = null;
/*     */       
/*     */       return;
/*     */     } 
/*  85 */     Vec3D as = this.a.a(this);
/*  86 */     double d = (this.C * 2.0F);
/*  87 */     while (as != null && as.d(this.posX, as.b, this.posZ) < d * d) {
/*  88 */       this.a.a();
/*  89 */       if (this.a.b()) {
/*  90 */         as = null;
/*  91 */         this.a = null; continue;
/*  92 */       }  as = this.a.a(this);
/*     */     } 
/*     */     
/*  95 */     this.bd = false;
/*  96 */     if (as != null) {
/*  97 */       double d1 = as.a - this.posX;
/*  98 */       double d2 = as.c - this.posZ;
/*  99 */       double d3 = as.b - i;
/*     */       
/* 101 */       float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 102 */       float f2 = f1 - this.rotationYaw;
/* 103 */       this.bb = this.bf;
/* 104 */       while (f2 < -180.0F)
/* 105 */         f2 += 360.0F; 
/* 106 */       while (f2 >= 180.0F)
/* 107 */         f2 -= 360.0F; 
/* 108 */       if (f2 > 30.0F) {
/* 109 */         f2 = 30.0F;
/*     */       }
/*     */       
/* 112 */       if (f2 < -30.0F) {
/* 113 */         f2 = -30.0F;
/*     */       }
/*     */       
/* 116 */       this.rotationYaw += f2;
/*     */       
/* 118 */       if (this.ag && 
/* 119 */         this.af != null) {
/* 120 */         double d4 = this.af.posX - this.posX;
/* 121 */         double d5 = this.af.posZ - this.posZ;
/*     */         
/* 123 */         float f3 = this.rotationYaw;
/* 124 */         this.rotationYaw = (float)(Math.atan2(d5, d4) * 180.0D / 3.1415927410125732D) - 90.0F;
/*     */         
/* 126 */         f2 = (f3 - this.rotationYaw + 90.0F) * 3.1415927F / 180.0F;
/* 127 */         this.ba = -MathHelper.a(f2) * this.bb * 1.0F;
/* 128 */         this.bb = MathHelper.b(f2) * this.bb * 1.0F;
/*     */       } 
/*     */       
/* 131 */       if (d3 > 0.0D) {
/* 132 */         this.bd = true;
/*     */       }
/*     */     } 
/*     */     
/* 136 */     if (this.af != null) {
/* 137 */       b(this.af, 30.0F);
/*     */     }
/*     */     
/* 140 */     if (this.w) this.bd = true; 
/* 141 */     if (this.Q.nextFloat() < 0.8F && (bool1 || bool2)) this.bd = true;
/*     */   
/*     */   }
/*     */   
/*     */   protected void a(Entity paramdb, float paramFloat) {}
/*     */   
/*     */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 148 */     return 0.0F;
/*     */   }
/*     */   
/*     */   protected Entity h() {
/* 152 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 156 */     int i = MathHelper.floor_double(this.posX);
/* 157 */     int j = MathHelper.floor_double(this.u.b);
/* 158 */     int k = MathHelper.floor_double(this.posZ);
/* 159 */     return (super.a() && a(i, j, k) >= 0.0F);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */