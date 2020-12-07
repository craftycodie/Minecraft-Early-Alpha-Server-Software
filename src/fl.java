/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public class fl
/*     */ {
/*     */   public db a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   public int g;
/*     */   public int h;
/*  16 */   public int i = 0;
/*     */   
/*     */   private double l;
/*     */   private double m;
/*     */   private double n;
/*     */   private boolean o = false;
/*     */   public boolean j = false;
/*  23 */   public Set k = new HashSet();
/*     */   
/*     */   public fl(db paramdb, int paramInt1, int paramInt2) {
/*  26 */     this.a = paramdb;
/*  27 */     this.b = paramInt1;
/*  28 */     this.c = paramInt2;
/*     */     
/*  30 */     this.d = fw.b(paramdb.k * 32.0D);
/*  31 */     this.e = fw.b(paramdb.l * 32.0D);
/*  32 */     this.f = fw.b(paramdb.m * 32.0D);
/*  33 */     this.g = fw.d(paramdb.q * 256.0F / 360.0F);
/*  34 */     this.h = fw.d(paramdb.r * 256.0F / 360.0F);
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  38 */     if (paramObject instanceof fl) {
/*  39 */       return (((fl)paramObject).a.c == this.a.c);
/*     */     }
/*     */     
/*  42 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  46 */     return this.a.c;
/*     */   }
/*     */   
/*     */   public void a(List paramList) {
/*  50 */     this.j = false;
/*  51 */     if (!this.o || this.a.d(this.l, this.m, this.n) > 16.0D) {
/*  52 */       b(paramList);
/*  53 */       this.l = this.a.k;
/*  54 */       this.m = this.a.l;
/*  55 */       this.n = this.a.m;
/*  56 */       this.o = true;
/*  57 */       this.j = true;
/*     */     } 
/*     */     
/*  60 */     if (this.i++ % this.c == 0) {
/*  61 */       el el; int i = fw.b(this.a.k * 32.0D);
/*  62 */       int j = fw.b(this.a.l * 32.0D);
/*  63 */       int k = fw.b(this.a.m * 32.0D);
/*  64 */       int m = fw.d(this.a.q * 256.0F / 360.0F);
/*  65 */       int n = fw.d(this.a.r * 256.0F / 360.0F);
/*     */       
/*  67 */       boolean bool1 = (i != this.d || j != this.e || k != this.f) ? true : false;
/*  68 */       boolean bool2 = (m != this.g || n != this.h) ? true : false;
/*     */       
/*  70 */       int i1 = i - this.d;
/*  71 */       int i2 = j - this.e;
/*  72 */       int i3 = k - this.f;
/*  73 */       by by = null;
/*     */       
/*  75 */       if (i1 < -128 || i1 >= 128 || i2 < -128 || i2 >= 128 || i3 < -128 || i3 >= 128) {
/*  76 */         by = new by(this.a.c, i, j, k, (byte)m, (byte)n);
/*     */       }
/*  78 */       else if (bool1 && bool2) {
/*  79 */         el = new bc(this.a.c, (byte)i1, (byte)i2, (byte)i3, (byte)m, (byte)n);
/*  80 */       } else if (bool1) {
/*  81 */         el = new di(this.a.c, (byte)i1, (byte)i2, (byte)i3);
/*  82 */       } else if (bool2) {
/*  83 */         el = new cq(this.a.c, (byte)m, (byte)n);
/*     */       } else {
/*  85 */         el = new el(this.a.c);
/*     */       } 
/*     */ 
/*     */       
/*  89 */       if (el != null) {
/*  90 */         a(el);
/*     */       }
/*     */       
/*  93 */       this.d = i;
/*  94 */       this.e = j;
/*  95 */       this.f = k;
/*  96 */       this.g = m;
/*  97 */       this.h = n;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(ha paramha) {
/* 102 */     for (dq dq : this.k) {
/* 103 */       dq.a.b(paramha);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 108 */     a(new cm(this.a.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dq paramdq) {
/* 113 */     if (paramdq == this.a)
/*     */       return; 
/* 115 */     double d1 = paramdq.k - (this.d / 32);
/* 116 */     double d2 = paramdq.m - (this.f / 32);
/* 117 */     if (d1 >= -this.b && d1 <= this.b && d2 >= -this.b && d2 <= this.b) {
/* 118 */       if (!this.k.contains(paramdq)) {
/* 119 */         this.k.add(paramdq);
/* 120 */         paramdq.a.b(b());
/*     */       }
/*     */     
/* 123 */     } else if (this.k.contains(paramdq)) {
/* 124 */       this.k.remove(paramdq);
/* 125 */       paramdq.a.b(new cm(this.a.c));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(List<dq> paramList) {
/* 131 */     for (byte b = 0; b < paramList.size(); b++) {
/* 132 */       a(paramList.get(b));
/*     */     }
/*     */   }
/*     */   
/*     */   private ha b() {
/* 137 */     if (this.a instanceof fa) {
/* 138 */       fa fa = (fa)this.a;
/* 139 */       j j = new j(fa);
/* 140 */       fa.k = j.b / 32.0D;
/* 141 */       fa.l = j.c / 32.0D;
/* 142 */       fa.m = j.d / 32.0D;
/* 143 */       fa.n = j.e / 128.0D;
/* 144 */       fa.o = j.f / 128.0D;
/* 145 */       fa.p = j.g / 128.0D;
/* 146 */       return j;
/*     */     } 
/* 148 */     if (this.a instanceof dq) {
/* 149 */       return new c((eq)this.a);
/*     */     }
/* 151 */     if (this.a instanceof hs) {
/* 152 */       hs hs = (hs)this.a;
/* 153 */       if (hs.ad == 0) return new dd(this.a, 10); 
/* 154 */       if (hs.ad == 1) return new dd(this.a, 11); 
/* 155 */       if (hs.ad == 2) return new dd(this.a, 12); 
/*     */     } 
/* 157 */     if (this.a instanceof eg) {
/* 158 */       return new dd(this.a, 1);
/*     */     }
/* 160 */     throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */