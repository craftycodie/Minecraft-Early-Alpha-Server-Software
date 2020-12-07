/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class fq
/*     */ {
/*     */   private dp b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*  14 */   private List g = new ArrayList();
/*     */   
/*     */   public fq(ar paramar, dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  17 */     this.b = paramdp;
/*  18 */     this.c = paramInt1;
/*  19 */     this.d = paramInt2;
/*  20 */     this.e = paramInt3;
/*     */     
/*  22 */     this.f = paramdp.b(paramInt1, paramInt2, paramInt3);
/*  23 */     a();
/*     */   }
/*     */   
/*     */   private void a() {
/*  27 */     this.g.clear();
/*  28 */     if (this.f == 0) {
/*  29 */       this.g.add(new gf(this.c, this.d, this.e - 1));
/*  30 */       this.g.add(new gf(this.c, this.d, this.e + 1));
/*  31 */     } else if (this.f == 1) {
/*  32 */       this.g.add(new gf(this.c - 1, this.d, this.e));
/*  33 */       this.g.add(new gf(this.c + 1, this.d, this.e));
/*  34 */     } else if (this.f == 2) {
/*  35 */       this.g.add(new gf(this.c - 1, this.d, this.e));
/*  36 */       this.g.add(new gf(this.c + 1, this.d + 1, this.e));
/*  37 */     } else if (this.f == 3) {
/*  38 */       this.g.add(new gf(this.c - 1, this.d + 1, this.e));
/*  39 */       this.g.add(new gf(this.c + 1, this.d, this.e));
/*  40 */     } else if (this.f == 4) {
/*  41 */       this.g.add(new gf(this.c, this.d + 1, this.e - 1));
/*  42 */       this.g.add(new gf(this.c, this.d, this.e + 1));
/*  43 */     } else if (this.f == 5) {
/*  44 */       this.g.add(new gf(this.c, this.d, this.e - 1));
/*  45 */       this.g.add(new gf(this.c, this.d + 1, this.e + 1));
/*  46 */     } else if (this.f == 6) {
/*  47 */       this.g.add(new gf(this.c + 1, this.d, this.e));
/*  48 */       this.g.add(new gf(this.c, this.d, this.e + 1));
/*  49 */     } else if (this.f == 7) {
/*  50 */       this.g.add(new gf(this.c - 1, this.d, this.e));
/*  51 */       this.g.add(new gf(this.c, this.d, this.e + 1));
/*  52 */     } else if (this.f == 8) {
/*  53 */       this.g.add(new gf(this.c - 1, this.d, this.e));
/*  54 */       this.g.add(new gf(this.c, this.d, this.e - 1));
/*  55 */     } else if (this.f == 9) {
/*  56 */       this.g.add(new gf(this.c + 1, this.d, this.e));
/*  57 */       this.g.add(new gf(this.c, this.d, this.e - 1));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b() {
/*  62 */     for (byte b = 0; b < this.g.size(); b++) {
/*  63 */       fq fq1 = a(this.g.get(b));
/*  64 */       if (fq1 == null || !fq1.b(this)) {
/*  65 */         this.g.remove(b--);
/*     */       } else {
/*  67 */         this.g.set(b, new gf(fq1.c, fq1.d, fq1.e));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3) {
/*  73 */     if (this.b.a(paramInt1, paramInt2, paramInt3) == this.a.ba) return true; 
/*  74 */     if (this.b.a(paramInt1, paramInt2 + 1, paramInt3) == this.a.ba) return true; 
/*  75 */     if (this.b.a(paramInt1, paramInt2 - 1, paramInt3) == this.a.ba) return true; 
/*  76 */     return false;
/*     */   }
/*     */   
/*     */   private fq a(gf paramgf) {
/*  80 */     if (this.b.a(paramgf.a, paramgf.b, paramgf.c) == this.a.ba) return new fq(this.a, this.b, paramgf.a, paramgf.b, paramgf.c); 
/*  81 */     if (this.b.a(paramgf.a, paramgf.b + 1, paramgf.c) == this.a.ba) return new fq(this.a, this.b, paramgf.a, paramgf.b + 1, paramgf.c); 
/*  82 */     if (this.b.a(paramgf.a, paramgf.b - 1, paramgf.c) == this.a.ba) return new fq(this.a, this.b, paramgf.a, paramgf.b - 1, paramgf.c); 
/*  83 */     return null;
/*     */   }
/*     */   
/*     */   private boolean b(fq paramfq) {
/*  87 */     for (byte b = 0; b < this.g.size(); b++) {
/*  88 */       gf gf = this.g.get(b);
/*  89 */       if (gf.a == paramfq.c && gf.c == paramfq.e) {
/*  90 */         return true;
/*     */       }
/*     */     } 
/*  93 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(int paramInt1, int paramInt2, int paramInt3) {
/*  97 */     for (byte b = 0; b < this.g.size(); b++) {
/*  98 */       gf gf = this.g.get(b);
/*     */       
/* 100 */       if (gf.a == paramInt1 && gf.c == paramInt3) {
/* 101 */         return true;
/*     */       }
/*     */     } 
/* 104 */     return false;
/*     */   }
/*     */   
/*     */   private int c() {
/* 108 */     byte b = 0;
/*     */     
/* 110 */     if (a(this.c, this.d, this.e - 1)) b++; 
/* 111 */     if (a(this.c, this.d, this.e + 1)) b++; 
/* 112 */     if (a(this.c - 1, this.d, this.e)) b++; 
/* 113 */     if (a(this.c + 1, this.d, this.e)) b++;
/*     */     
/* 115 */     return b;
/*     */   }
/*     */   
/*     */   private boolean c(fq paramfq) {
/* 119 */     if (b(paramfq)) return true; 
/* 120 */     if (this.g.size() == 2) {
/* 121 */       return false;
/*     */     }
/* 123 */     if (this.g.size() == 0) {
/* 124 */       return true;
/*     */     }
/*     */     
/* 127 */     gf gf = this.g.get(0);
/* 128 */     if (paramfq.d == this.d && gf.b == this.d) return true;
/*     */     
/* 130 */     return true;
/*     */   }
/*     */   
/*     */   private void d(fq paramfq) {
/* 134 */     this.g.add(new gf(paramfq.c, paramfq.d, paramfq.e));
/*     */     
/* 136 */     boolean bool1 = b(this.c, this.d, this.e - 1);
/* 137 */     boolean bool2 = b(this.c, this.d, this.e + 1);
/* 138 */     boolean bool3 = b(this.c - 1, this.d, this.e);
/* 139 */     boolean bool4 = b(this.c + 1, this.d, this.e);
/*     */     
/* 141 */     byte b = -1;
/*     */     
/* 143 */     if (bool1 || bool2) b = 0; 
/* 144 */     if (bool3 || bool4) b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     if (bool2 && bool4 && !bool1 && !bool3) b = 6; 
/* 150 */     if (bool2 && bool3 && !bool1 && !bool4) b = 7; 
/* 151 */     if (bool1 && bool3 && !bool2 && !bool4) b = 8; 
/* 152 */     if (bool1 && bool4 && !bool2 && !bool3) b = 9; 
/* 153 */     if (b == 0) {
/* 154 */       if (this.b.a(this.c, this.d + 1, this.e - 1) == this.a.ba) b = 4; 
/* 155 */       if (this.b.a(this.c, this.d + 1, this.e + 1) == this.a.ba) b = 5; 
/*     */     } 
/* 157 */     if (b == 1) {
/* 158 */       if (this.b.a(this.c + 1, this.d + 1, this.e) == this.a.ba) b = 2; 
/* 159 */       if (this.b.a(this.c - 1, this.d + 1, this.e) == this.a.ba) b = 3;
/*     */     
/*     */     } 
/* 162 */     if (b < 0) b = 0;
/*     */     
/* 164 */     this.b.b(this.c, this.d, this.e, b);
/*     */   }
/*     */   
/*     */   private boolean c(int paramInt1, int paramInt2, int paramInt3) {
/* 168 */     fq fq1 = a(new gf(paramInt1, paramInt2, paramInt3));
/* 169 */     if (fq1 == null) return false; 
/* 170 */     fq1.b();
/* 171 */     return fq1.c(this);
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 175 */     boolean bool1 = c(this.c, this.d, this.e - 1);
/* 176 */     boolean bool2 = c(this.c, this.d, this.e + 1);
/* 177 */     boolean bool3 = c(this.c - 1, this.d, this.e);
/* 178 */     boolean bool4 = c(this.c + 1, this.d, this.e);
/*     */     
/* 180 */     byte b = -1;
/*     */     
/* 182 */     if ((bool1 || bool2) && !bool3 && !bool4) b = 0; 
/* 183 */     if ((bool3 || bool4) && !bool1 && !bool2) b = 1;
/*     */     
/* 185 */     if (bool2 && bool4 && !bool1 && !bool3) b = 6; 
/* 186 */     if (bool2 && bool3 && !bool1 && !bool4) b = 7; 
/* 187 */     if (bool1 && bool3 && !bool2 && !bool4) b = 8; 
/* 188 */     if (bool1 && bool4 && !bool2 && !bool3) b = 9;
/*     */     
/* 190 */     if (b == -1) {
/* 191 */       if (bool1 || bool2) b = 0; 
/* 192 */       if (bool3 || bool4) b = 1;
/*     */       
/* 194 */       if (paramBoolean) {
/* 195 */         if (bool2 && bool4) b = 6; 
/* 196 */         if (bool3 && bool2) b = 7; 
/* 197 */         if (bool4 && bool1) b = 9; 
/* 198 */         if (bool1 && bool3) b = 8; 
/*     */       } else {
/* 200 */         if (bool1 && bool3) b = 8; 
/* 201 */         if (bool4 && bool1) b = 9; 
/* 202 */         if (bool3 && bool2) b = 7; 
/* 203 */         if (bool2 && bool4) b = 6;
/*     */       
/*     */       } 
/*     */     } 
/* 207 */     if (b == 0) {
/* 208 */       if (this.b.a(this.c, this.d + 1, this.e - 1) == this.a.ba) b = 4; 
/* 209 */       if (this.b.a(this.c, this.d + 1, this.e + 1) == this.a.ba) b = 5; 
/*     */     } 
/* 211 */     if (b == 1) {
/* 212 */       if (this.b.a(this.c + 1, this.d + 1, this.e) == this.a.ba) b = 2; 
/* 213 */       if (this.b.a(this.c - 1, this.d + 1, this.e) == this.a.ba) b = 3;
/*     */     
/*     */     } 
/* 216 */     if (b < 0) b = 0;
/*     */     
/* 218 */     this.f = b;
/* 219 */     a();
/*     */     
/* 221 */     this.b.b(this.c, this.d, this.e, b);
/* 222 */     for (byte b1 = 0; b1 < this.g.size(); b1++) {
/* 223 */       fq fq1 = a(this.g.get(b1));
/* 224 */       if (fq1 != null) {
/* 225 */         fq1.b();
/* 226 */         if (fq1.c(this))
/* 227 */           fq1.d(this); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */