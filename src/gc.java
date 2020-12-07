/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class gc
/*     */ {
/*  11 */   public int a = 0;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   
/*     */   public gc(et paramet) {
/*  17 */     this(paramet, 1);
/*     */   }
/*     */   
/*     */   public gc(et paramet, int paramInt) {
/*  21 */     this(paramet.ba, paramInt);
/*     */   }
/*     */   
/*     */   public gc(en paramen) {
/*  25 */     this(paramen, 1);
/*     */   }
/*     */   
/*     */   public gc(en paramen, int paramInt) {
/*  29 */     this(paramen.aQ, paramInt);
/*     */   }
/*     */   
/*     */   public gc(int paramInt) {
/*  33 */     this(paramInt, 1);
/*     */   }
/*     */   
/*     */   public gc(int paramInt1, int paramInt2) {
/*  37 */     this.c = paramInt1;
/*  38 */     this.a = paramInt2;
/*     */   }
/*     */   
/*     */   public gc(int paramInt1, int paramInt2, int paramInt3) {
/*  42 */     this.c = paramInt1;
/*  43 */     this.a = paramInt2;
/*  44 */     this.d = paramInt3;
/*     */   }
/*     */ 
/*     */   
/*     */   public gc(r paramr) {
/*  49 */     b(paramr);
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
/*     */   public en a() {
/*  63 */     return en.c[this.c];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  71 */     return a().a(this, parameq, paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public float a(et paramet) {
/*  75 */     return a().a(this, paramet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public r a(r paramr) {
/*  83 */     paramr.a("id", (short)this.c);
/*  84 */     paramr.a("Count", (byte)this.a);
/*  85 */     paramr.a("Damage", (short)this.d);
/*  86 */     return paramr;
/*     */   }
/*     */   
/*     */   public void b(r paramr) {
/*  90 */     this.c = paramr.c("id");
/*  91 */     this.a = paramr.b("Count");
/*  92 */     this.d = paramr.c("Damage");
/*     */   }
/*     */   
/*     */   public int b() {
/*  96 */     return a().a();
/*     */   }
/*     */   
/*     */   public int c() {
/* 100 */     return en.c[this.c].b();
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 104 */     this.d += paramInt;
/* 105 */     if (this.d > c()) {
/* 106 */       this.a--;
/* 107 */       if (this.a < 0) this.a = 0; 
/* 108 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 117 */     en.c[this.c].a(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(et paramet) {
/* 125 */     return en.c[this.c].a(paramet);
/*     */   }
/*     */   
/*     */   public void a(eq parameq) {}
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */