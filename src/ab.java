/*     */ import java.util.ArrayList;
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
/*     */ class ab
/*     */ {
/*  16 */   private List b = new ArrayList();
/*     */   private int c;
/*     */   private int d;
/*     */   private ih e;
/*  20 */   private short[] f = new short[10];
/*  21 */   private int g = 0;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   
/*     */   public ab(gr paramgr, int paramInt1, int paramInt2) {
/*  27 */     this.c = paramInt1;
/*  28 */     this.d = paramInt2;
/*  29 */     this.e = new ih(paramInt1, paramInt2);
/*  30 */     (gr.a(paramgr)).e.u.d(paramInt1, paramInt2);
/*     */   }
/*     */   private int k; private int l; private int m;
/*     */   public void a(dq paramdq) {
/*  34 */     if (this.b.contains(paramdq)) throw new IllegalStateException("Failed to add player. " + paramdq + " already is in chunk " + this.c + ", " + this.d); 
/*  35 */     paramdq.ag.add(this.e);
/*  36 */     paramdq.a.b(new ct(this.e.a, this.e.b, true));
/*  37 */     this.b.add(paramdq);
/*  38 */     paramdq.af.add(this.e);
/*     */   }
/*     */   
/*     */   public void b(dq paramdq) {
/*  42 */     if (!this.b.contains(paramdq)) {
/*  43 */       (new IllegalStateException("Failed to remove player. " + paramdq + " isn't in chunk " + this.c + ", " + this.d)).printStackTrace();
/*     */       return;
/*     */     } 
/*  46 */     this.b.remove(paramdq);
/*  47 */     if (this.b.size() == 0) {
/*  48 */       long l = this.c + 2147483647L | this.d + 2147483647L << 32L;
/*  49 */       gr.b(this.a).b(l);
/*  50 */       if (this.g > 0) {
/*  51 */         gr.c(this.a).remove(this);
/*     */       }
/*  53 */       (gr.a(this.a)).e.u.c(this.c, this.d);
/*     */     } 
/*     */     
/*  56 */     paramdq.af.remove(this.e);
/*  57 */     if (paramdq.ag.contains(this.e)) {
/*  58 */       paramdq.a.b(new ct(this.c, this.d, false));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  63 */     if (this.g == 0) {
/*  64 */       gr.c(this.a).add(this);
/*  65 */       this.h = this.i = paramInt1;
/*  66 */       this.j = this.k = paramInt2;
/*  67 */       this.l = this.m = paramInt3;
/*     */     } 
/*  69 */     if (this.h > paramInt1) this.h = paramInt1; 
/*  70 */     if (this.i < paramInt1) this.i = paramInt1;
/*     */     
/*  72 */     if (this.j > paramInt2) this.j = paramInt2; 
/*  73 */     if (this.k < paramInt2) this.k = paramInt2;
/*     */     
/*  75 */     if (this.l > paramInt3) this.l = paramInt3; 
/*  76 */     if (this.m < paramInt3) this.m = paramInt3;
/*     */     
/*  78 */     if (this.g < 10) {
/*  79 */       short s = (short)(paramInt1 << 12 | paramInt3 << 8 | paramInt2);
/*     */       
/*  81 */       for (byte b = 0; b < this.g; b++) {
/*  82 */         if (this.f[b] == s)
/*     */           return; 
/*     */       } 
/*  85 */       this.f[this.g++] = s;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(ha paramha) {
/*  90 */     for (byte b = 0; b < this.b.size(); b++) {
/*  91 */       dq dq = this.b.get(b);
/*  92 */       if (dq.ag.contains(this.e))
/*  93 */         dq.a.b(paramha); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     gs gs;
/*  99 */     if (this.g == 0)
/* 100 */       return;  eh eh = null;
/* 101 */     if (this.g == 1) {
/* 102 */       eh = new eh(this.c * 16 + this.h, this.j, this.d * 16 + this.l, (gr.a(this.a)).e);
/* 103 */     } else if (this.g == 10) {
/* 104 */       this.j = this.j / 2 * 2;
/* 105 */       this.k = (this.k / 2 + 1) * 2;
/* 106 */       int i = this.h + this.c * 16;
/* 107 */       int j = this.j;
/* 108 */       int k = this.l + this.d * 16;
/* 109 */       int m = this.i - this.h + 1;
/* 110 */       int n = this.k - this.j + 2;
/* 111 */       int i1 = this.m - this.l + 1;
/* 112 */       cs cs = new cs(i, j, k, m, n, i1, (gr.a(this.a)).e);
/*     */     } else {
/* 114 */       gs = new gs(this.c, this.d, this.f, this.g, (gr.a(this.a)).e);
/*     */     } 
/* 116 */     a(gs);
/* 117 */     this.g = 0;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */