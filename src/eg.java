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
/*     */ 
/*     */ 
/*     */ public class eg
/*     */   extends db
/*     */ {
/*  18 */   public int a = 0;
/*  19 */   public int b = 0;
/*  20 */   public int ac = 1;
/*     */   
/*     */   public eg(dp paramdp) {
/*  23 */     super(paramdp);
/*  24 */     this.d = true;
/*  25 */     a(1.5F, 0.6F);
/*  26 */     this.B = this.D / 2.0F;
/*  27 */     this.G = false;
/*     */   }
/*     */   
/*     */   public cy d(db paramdb) {
/*  31 */     return paramdb.u;
/*     */   }
/*     */   
/*     */   public cy l() {
/*  35 */     return this.u;
/*     */   }
/*     */   
/*     */   public boolean p() {
/*  39 */     return true;
/*     */   }
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
/*     */   public double w() {
/*  56 */     return this.D * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean a(db paramdb, int paramInt) {
/*  60 */     this.ac = -this.ac;
/*  61 */     this.b = 10;
/*  62 */     this.a += paramInt * 10;
/*  63 */     if (this.a > 40) {
/*  64 */       byte b; for (b = 0; b < 3; b++) {
/*  65 */         a(et.x.ba, 1, 0.0F);
/*     */       }
/*  67 */       for (b = 0; b < 2; b++) {
/*  68 */         a(en.B.aQ, 1, 0.0F);
/*     */       }
/*  70 */       i();
/*     */     } 
/*  72 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/*  76 */     return !this.A;
/*     */   }
/*     */   
/*     */   public void b_() {
/*  80 */     super.b_();
/*  81 */     if (this.b > 0) this.b--; 
/*  82 */     if (this.a > 0) this.a--; 
/*  83 */     this.h = this.k;
/*  84 */     this.i = this.l;
/*  85 */     this.j = this.m;
/*     */ 
/*     */     
/*  88 */     byte b1 = 5;
/*  89 */     double d1 = 0.0D;
/*  90 */     for (byte b2 = 0; b2 < b1; b2++) {
/*  91 */       double d9 = this.u.b + (this.u.e - this.u.b) * (b2 + 0) / b1 - 0.125D;
/*  92 */       double d10 = this.u.b + (this.u.e - this.u.b) * (b2 + 1) / b1 - 0.125D;
/*  93 */       cy cy = cy.b(this.u.a, d9, this.u.c, this.u.d, d10, this.u.f);
/*  94 */       if (this.g.b(cy, hz.f)) {
/*  95 */         d1 += 1.0D / b1;
/*     */       }
/*     */     } 
/*     */     
/*  99 */     double d2 = d1 * 2.0D - 1.0D;
/* 100 */     this.o += 0.03999999910593033D * d2;
/*     */     
/* 102 */     if (this.e != null) {
/* 103 */       this.n += this.e.n * 0.2D;
/* 104 */       this.p += this.e.p * 0.2D;
/*     */     } 
/*     */     
/* 107 */     double d3 = 0.4D;
/*     */     
/* 109 */     if (this.n < -d3) this.n = -d3; 
/* 110 */     if (this.n > d3) this.n = d3; 
/* 111 */     if (this.p < -d3) this.p = -d3; 
/* 112 */     if (this.p > d3) this.p = d3; 
/* 113 */     if (this.v) {
/* 114 */       this.n *= 0.5D;
/* 115 */       this.o *= 0.5D;
/* 116 */       this.p *= 0.5D;
/*     */     } 
/* 118 */     c(this.n, this.o, this.p);
/* 119 */     double d4 = Math.sqrt(this.n * this.n + this.p * this.p);
/* 120 */     if (d4 > 0.15D) {
/* 121 */       double d9 = Math.cos(this.q * Math.PI / 180.0D);
/* 122 */       double d10 = Math.sin(this.q * Math.PI / 180.0D);
/*     */       
/* 124 */       for (byte b = 0; b < 1.0D + d4 * 60.0D; b++) {
/*     */         
/* 126 */         double d11 = (this.Q.nextFloat() * 2.0F - 1.0F);
/*     */         
/* 128 */         double d12 = (this.Q.nextInt(2) * 2 - 1) * 0.7D;
/* 129 */         if (this.Q.nextBoolean()) {
/* 130 */           double d13 = this.k - d9 * d11 * 0.8D + d10 * d12;
/* 131 */           double d14 = this.m - d10 * d11 * 0.8D - d9 * d12;
/* 132 */           this.g.a("splash", d13, this.l - 0.125D, d14, this.n, this.o, this.p);
/*     */         } else {
/* 134 */           double d13 = this.k + d9 + d10 * d11 * 0.7D;
/* 135 */           double d14 = this.m + d10 - d9 * d11 * 0.7D;
/* 136 */           this.g.a("splash", d13, this.l - 0.125D, d14, this.n, this.o, this.p);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 141 */     if (this.w && d4 > 0.15D) {
/* 142 */       i(); byte b;
/* 143 */       for (b = 0; b < 3; b++) {
/* 144 */         a(et.x.ba, 1, 0.0F);
/*     */       }
/* 146 */       for (b = 0; b < 2; b++) {
/* 147 */         a(en.B.aQ, 1, 0.0F);
/*     */       }
/*     */     } else {
/* 150 */       this.n *= 0.9900000095367432D;
/* 151 */       this.o *= 0.949999988079071D;
/* 152 */       this.p *= 0.9900000095367432D;
/*     */     } 
/*     */     
/* 155 */     this.r = 0.0F;
/* 156 */     double d5 = this.q;
/* 157 */     double d6 = this.h - this.k;
/* 158 */     double d7 = this.j - this.m;
/* 159 */     if (d6 * d6 + d7 * d7 > 0.001D) {
/* 160 */       d5 = (float)(Math.atan2(d7, d6) * 180.0D / Math.PI);
/*     */     }
/*     */     
/* 163 */     double d8 = d5 - this.q;
/* 164 */     while (d8 >= 180.0D)
/* 165 */       d8 -= 360.0D; 
/* 166 */     while (d8 < -180.0D) {
/* 167 */       d8 += 360.0D;
/*     */     }
/* 169 */     if (d8 > 20.0D) d8 = 20.0D; 
/* 170 */     if (d8 < -20.0D) d8 = -20.0D;
/*     */     
/* 172 */     this.q = (float)(this.q + d8);
/* 173 */     b(this.q, this.r);
/*     */     
/* 175 */     List<db> list = this.g.b(this, this.u.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 176 */     if (list != null && list.size() > 0) {
/* 177 */       for (byte b = 0; b < list.size(); b++) {
/* 178 */         db db1 = list.get(b);
/* 179 */         if (db1 != this.e && db1.p() && db1 instanceof eg) {
/* 180 */           db1.c(this);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 185 */     if (this.e != null && 
/* 186 */       this.e.A) this.e = null;
/*     */   
/*     */   }
/*     */   
/*     */   protected void u() {
/* 191 */     double d1 = Math.cos(this.q * Math.PI / 180.0D) * 0.4D;
/* 192 */     double d2 = Math.sin(this.q * Math.PI / 180.0D) * 0.4D;
/* 193 */     this.e.a(this.k + d1, this.l + w() + this.e.v(), this.m + d2);
/*     */   }
/*     */   
/*     */   protected void a(r paramr) {}
/*     */   
/*     */   protected void b(r paramr) {}
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */