/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class da
/*     */   extends Entity
/*     */ {
/*  16 */   private int b = -1;
/*  17 */   private int ac = -1;
/*  18 */   private int ad = -1;
/*  19 */   private int ae = 0;
/*     */   private boolean af = false;
/*  21 */   public int a = 0;
/*     */   private EntityLiving ag;
/*     */   private int ah;
/*  24 */   private int ai = 0;
/*     */   
/*     */   public da(World paramdp) {
/*  27 */     super(paramdp);
/*  28 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public da(World paramdp, EntityLiving paramic) {
/*  32 */     super(paramdp);
/*  33 */     this.ag = paramic;
/*     */     
/*  35 */     a(0.5F, 0.5F);
/*     */     
/*  37 */     c(paramic.k, paramic.l, paramic.m, paramic.q, paramic.r);
/*     */ 
/*     */     
/*  40 */     this.k -= (fw.b(this.q / 180.0F * 3.1415927F) * 0.16F);
/*  41 */     this.l -= 0.10000000149011612D;
/*  42 */     this.m -= (fw.a(this.q / 180.0F * 3.1415927F) * 0.16F);
/*  43 */     a(this.k, this.l, this.m);
/*  44 */     this.B = 0.0F;
/*     */ 
/*     */     
/*  47 */     this.n = (-fw.a(this.q / 180.0F * 3.1415927F) * fw.b(this.r / 180.0F * 3.1415927F));
/*  48 */     this.p = (fw.b(this.q / 180.0F * 3.1415927F) * fw.b(this.r / 180.0F * 3.1415927F));
/*  49 */     this.o = -fw.a(this.r / 180.0F * 3.1415927F);
/*     */     
/*  51 */     a(this.n, this.o, this.p, 1.5F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  55 */     float f1 = fw.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/*  57 */     paramDouble1 /= f1;
/*  58 */     paramDouble2 /= f1;
/*  59 */     paramDouble3 /= f1;
/*     */     
/*  61 */     paramDouble1 += this.Q.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  62 */     paramDouble2 += this.Q.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  63 */     paramDouble3 += this.Q.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*     */     
/*  65 */     paramDouble1 *= paramFloat1;
/*  66 */     paramDouble2 *= paramFloat1;
/*  67 */     paramDouble3 *= paramFloat1;
/*     */     
/*  69 */     this.n = paramDouble1;
/*  70 */     this.o = paramDouble2;
/*  71 */     this.p = paramDouble3;
/*     */     
/*  73 */     float f2 = fw.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/*  75 */     this.s = this.q = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D);
/*  76 */     this.t = this.r = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D);
/*  77 */     this.ah = 0;
/*     */   }
/*     */   
/*     */   public void b_() {
/*  81 */     super.b_();
/*     */     
/*  83 */     if (this.a > 0) this.a--;
/*     */     
/*  85 */     if (this.af) {
/*     */ 
/*     */ 
/*     */       
/*  89 */       int i = this.g.getBlockId(this.b, this.ac, this.ad);
/*  90 */       if (i != this.ae) {
/*  91 */         this.af = false;
/*     */         
/*  93 */         this.n *= (this.Q.nextFloat() * 0.2F);
/*  94 */         this.o *= (this.Q.nextFloat() * 0.2F);
/*  95 */         this.p *= (this.Q.nextFloat() * 0.2F);
/*  96 */         this.ah = 0;
/*  97 */         this.ai = 0;
/*     */       } else {
/*  99 */         this.ah++;
/* 100 */         if (this.ah == 1200) i(); 
/*     */         return;
/*     */       } 
/*     */     } else {
/* 104 */       this.ai++;
/*     */     } 
/*     */     
/* 107 */     Vec3D as1 = Vec3D.b(this.k, this.l, this.m);
/* 108 */     Vec3D as2 = Vec3D.b(this.k + this.n, this.l + this.o, this.m + this.p);
/* 109 */     fe fe = this.g.a(as1, as2);
/*     */     
/* 111 */     as1 = Vec3D.b(this.k, this.l, this.m);
/* 112 */     as2 = Vec3D.b(this.k + this.n, this.l + this.o, this.m + this.p);
/* 113 */     if (fe != null) {
/* 114 */       as2 = Vec3D.b(fe.f.a, fe.f.b, fe.f.c);
/*     */     }
/* 116 */     Entity db1 = null;
/* 117 */     List<Entity> list = this.g.b(this, this.u.a(this.n, this.o, this.p).b(1.0D, 1.0D, 1.0D));
/* 118 */     double d = 0.0D;
/* 119 */     for (int b = 0; b < list.size(); b++) {
/* 120 */       Entity db2 = list.get(b);
/* 121 */       if (db2.c_() && (db2 != this.ag || this.ai >= 5)) {
/*     */         
/* 123 */         float f = 0.3F;
/* 124 */         AxisAlignedBB cy = db2.u.b(f, f, f);
/* 125 */         fe fe1 = cy.a(as1, as2);
/* 126 */         if (fe1 != null) {
/* 127 */           double d1 = as1.a(fe1.f);
/* 128 */           if (d1 < d || d == 0.0D) {
/* 129 */             db1 = db2;
/* 130 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 135 */     if (db1 != null) {
/* 136 */       fe = new fe(db1);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     if (fe != null) {
/* 156 */       if (fe.g != null) {
/* 157 */         if (fe.g.a(this.ag, 4)) {
/* 158 */           this.g.a(this, "random.drr", 1.0F, 1.2F / (this.Q.nextFloat() * 0.2F + 0.9F));
/* 159 */           i();
/*     */         } else {
/* 161 */           this.n *= -0.10000000149011612D;
/* 162 */           this.o *= -0.10000000149011612D;
/* 163 */           this.p *= -0.10000000149011612D;
/* 164 */           this.q += 180.0F;
/* 165 */           this.s += 180.0F;
/* 166 */           this.ai = 0;
/*     */         } 
/*     */       } else {
/*     */         
/* 170 */         this.b = fe.b;
/* 171 */         this.ac = fe.c;
/* 172 */         this.ad = fe.d;
/* 173 */         this.ae = this.g.getBlockId(this.b, this.ac, this.ad);
/* 174 */         this.n = (float)(fe.f.a - this.k);
/* 175 */         this.o = (float)(fe.f.b - this.l);
/* 176 */         this.p = (float)(fe.f.c - this.m);
/* 177 */         float f = fw.a(this.n * this.n + this.o * this.o + this.p * this.p);
/* 178 */         this.k -= this.n / f * 0.05000000074505806D;
/* 179 */         this.l -= this.o / f * 0.05000000074505806D;
/* 180 */         this.m -= this.p / f * 0.05000000074505806D;
/*     */         
/* 182 */         this.g.a(this, "random.drr", 1.0F, 1.2F / (this.Q.nextFloat() * 0.2F + 0.9F));
/* 183 */         this.af = true;
/* 184 */         this.a = 7;
/*     */       } 
/*     */     }
/* 187 */     this.k += this.n;
/* 188 */     this.l += this.o;
/* 189 */     this.m += this.p;
/*     */     
/* 191 */     float f1 = fw.a(this.n * this.n + this.p * this.p);
/* 192 */     this.q = (float)(Math.atan2(this.n, this.p) * 180.0D / 3.1415927410125732D);
/* 193 */     this.r = (float)(Math.atan2(this.o, f1) * 180.0D / 3.1415927410125732D);
/*     */     
/* 195 */     while (this.r - this.t < -180.0F)
/* 196 */       this.t -= 360.0F; 
/* 197 */     while (this.r - this.t >= 180.0F) {
/* 198 */       this.t += 360.0F;
/*     */     }
/* 200 */     while (this.q - this.s < -180.0F)
/* 201 */       this.s -= 360.0F; 
/* 202 */     while (this.q - this.s >= 180.0F) {
/* 203 */       this.s += 360.0F;
/*     */     }
/* 205 */     this.r = this.t + (this.r - this.t) * 0.2F;
/* 206 */     this.q = this.s + (this.q - this.s) * 0.2F;
/*     */ 
/*     */     
/* 209 */     float f2 = 0.99F;
/* 210 */     float f3 = 0.03F;
/*     */     
/* 212 */     if (m()) {
/* 213 */       for (int b1 = 0; b1 < 4; b1++) {
/* 214 */         float f = 0.25F;
/* 215 */         this.g.a("bubble", this.k - this.n * f, this.l - this.o * f, this.m - this.p * f, this.n, this.o, this.p);
/*     */       } 
/* 217 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 220 */     this.n *= f2;
/* 221 */     this.o *= f2;
/* 222 */     this.p *= f2;
/* 223 */     this.o -= f3;
/*     */     
/* 225 */     a(this.k, this.l, this.m);
/*     */   }
/*     */   
/*     */   public void a(NBTTagCompound paramr) {
/* 229 */     paramr.a("xTile", (short)this.b);
/* 230 */     paramr.a("yTile", (short)this.ac);
/* 231 */     paramr.a("zTile", (short)this.ad);
/* 232 */     paramr.a("inTile", (byte)this.ae);
/* 233 */     paramr.a("shake", (byte)this.a);
/* 234 */     paramr.a("inGround", (byte)(this.af ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void b(NBTTagCompound paramr) {
/* 238 */     this.b = paramr.c("xTile");
/* 239 */     this.ac = paramr.c("yTile");
/* 240 */     this.ad = paramr.c("zTile");
/* 241 */     this.ae = paramr.b("inTile") & 0xFF;
/* 242 */     this.a = paramr.b("shake") & 0xFF;
/* 243 */     this.af = (paramr.b("inGround") == 1);
/*     */   }
/*     */   
/*     */   public void a(EntityPlayer parameq) {
/* 247 */     if (this.af && this.ag == parameq && this.a <= 0 && 
/* 248 */       parameq.ai.a(new ItemStack(Item.j.aQ, 1))) {
/* 249 */       this.g.a(this, "random.pop", 0.2F, ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 250 */       parameq.c(this, 1);
/* 251 */       i();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\da.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */