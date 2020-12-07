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
/*     */ public class av
/*     */   extends db
/*     */ {
/*  16 */   private int b = -1;
/*  17 */   private int ac = -1;
/*  18 */   private int ad = -1;
/*  19 */   private int ae = 0;
/*     */   private boolean af = false;
/*  21 */   public int a = 0;
/*     */   private ic ag;
/*     */   private int ah;
/*  24 */   private int ai = 0;
/*     */   
/*     */   public av(dp paramdp) {
/*  27 */     super(paramdp);
/*  28 */     a(0.25F, 0.25F);
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
/*     */   public void b_() {
/*  89 */     super.b_();
/*     */     
/*  91 */     if (this.a > 0) this.a--;
/*     */     
/*  93 */     if (this.af) {
/*     */ 
/*     */ 
/*     */       
/*  97 */       int i = this.g.a(this.b, this.ac, this.ad);
/*  98 */       if (i != this.ae) {
/*  99 */         this.af = false;
/*     */         
/* 101 */         this.n *= (this.Q.nextFloat() * 0.2F);
/* 102 */         this.o *= (this.Q.nextFloat() * 0.2F);
/* 103 */         this.p *= (this.Q.nextFloat() * 0.2F);
/* 104 */         this.ah = 0;
/* 105 */         this.ai = 0;
/*     */       } else {
/* 107 */         this.ah++;
/* 108 */         if (this.ah == 1200) i(); 
/*     */         return;
/*     */       } 
/*     */     } else {
/* 112 */       this.ai++;
/*     */     } 
/*     */     
/* 115 */     as as1 = as.b(this.k, this.l, this.m);
/* 116 */     as as2 = as.b(this.k + this.n, this.l + this.o, this.m + this.p);
/* 117 */     fe fe = this.g.a(as1, as2);
/*     */     
/* 119 */     as1 = as.b(this.k, this.l, this.m);
/* 120 */     as2 = as.b(this.k + this.n, this.l + this.o, this.m + this.p);
/* 121 */     if (fe != null) {
/* 122 */       as2 = as.b(fe.f.a, fe.f.b, fe.f.c);
/*     */     }
/* 124 */     db db1 = null;
/* 125 */     List<db> list = this.g.b(this, this.u.a(this.n, this.o, this.p).b(1.0D, 1.0D, 1.0D));
/* 126 */     double d = 0.0D; byte b;
/* 127 */     for (b = 0; b < list.size(); b++) {
/* 128 */       db db2 = list.get(b);
/* 129 */       if (db2.c_() && (db2 != this.ag || this.ai >= 5)) {
/*     */         
/* 131 */         float f = 0.3F;
/* 132 */         cy cy = db2.u.b(f, f, f);
/* 133 */         fe fe1 = cy.a(as1, as2);
/* 134 */         if (fe1 != null) {
/* 135 */           double d1 = as1.a(fe1.f);
/* 136 */           if (d1 < d || d == 0.0D) {
/* 137 */             db1 = db2;
/* 138 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 143 */     if (db1 != null) {
/* 144 */       fe = new fe(db1);
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
/* 163 */     if (fe != null) {
/* 164 */       if (fe.g == null || 
/* 165 */         fe.g.a(this.ag, 0));
/*     */ 
/*     */ 
/*     */       
/* 169 */       for (b = 0; b < 8; b++)
/* 170 */         this.g.a("snowballpoof", this.k, this.l, this.m, 0.0D, 0.0D, 0.0D); 
/* 171 */       i();
/*     */     } 
/* 173 */     this.k += this.n;
/* 174 */     this.l += this.o;
/* 175 */     this.m += this.p;
/*     */     
/* 177 */     float f1 = fw.a(this.n * this.n + this.p * this.p);
/* 178 */     this.q = (float)(Math.atan2(this.n, this.p) * 180.0D / 3.1415927410125732D);
/* 179 */     this.r = (float)(Math.atan2(this.o, f1) * 180.0D / 3.1415927410125732D);
/*     */     
/* 181 */     while (this.r - this.t < -180.0F)
/* 182 */       this.t -= 360.0F; 
/* 183 */     while (this.r - this.t >= 180.0F) {
/* 184 */       this.t += 360.0F;
/*     */     }
/* 186 */     while (this.q - this.s < -180.0F)
/* 187 */       this.s -= 360.0F; 
/* 188 */     while (this.q - this.s >= 180.0F) {
/* 189 */       this.s += 360.0F;
/*     */     }
/* 191 */     this.r = this.t + (this.r - this.t) * 0.2F;
/* 192 */     this.q = this.s + (this.q - this.s) * 0.2F;
/*     */ 
/*     */     
/* 195 */     float f2 = 0.99F;
/* 196 */     float f3 = 0.03F;
/*     */     
/* 198 */     if (m()) {
/* 199 */       for (byte b1 = 0; b1 < 4; b1++) {
/* 200 */         float f = 0.25F;
/* 201 */         this.g.a("bubble", this.k - this.n * f, this.l - this.o * f, this.m - this.p * f, this.n, this.o, this.p);
/*     */       } 
/* 203 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 206 */     this.n *= f2;
/* 207 */     this.o *= f2;
/* 208 */     this.p *= f2;
/* 209 */     this.o -= f3;
/*     */     
/* 211 */     a(this.k, this.l, this.m);
/*     */   }
/*     */   
/*     */   public void a(r paramr) {
/* 215 */     paramr.a("xTile", (short)this.b);
/* 216 */     paramr.a("yTile", (short)this.ac);
/* 217 */     paramr.a("zTile", (short)this.ad);
/* 218 */     paramr.a("inTile", (byte)this.ae);
/* 219 */     paramr.a("shake", (byte)this.a);
/* 220 */     paramr.a("inGround", (byte)(this.af ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void b(r paramr) {
/* 224 */     this.b = paramr.c("xTile");
/* 225 */     this.ac = paramr.c("yTile");
/* 226 */     this.ad = paramr.c("zTile");
/* 227 */     this.ae = paramr.b("inTile") & 0xFF;
/* 228 */     this.a = paramr.b("shake") & 0xFF;
/* 229 */     this.af = (paramr.b("inGround") == 1);
/*     */   }
/*     */   
/*     */   public void a(eq parameq) {
/* 233 */     if (this.af && this.ag == parameq && this.a <= 0 && 
/* 234 */       parameq.ai.a(new gc(en.j.aQ, 1))) {
/* 235 */       this.g.a(this, "random.pop", 0.2F, ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 236 */       parameq.c(this, 1);
/* 237 */       i();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\av.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */