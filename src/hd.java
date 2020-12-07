/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hd
/*     */   extends et
/*     */ {
/*     */   protected hd(int paramInt1, int paramInt2) {
/*  10 */     super(paramInt1, paramInt2, hz.n);
/*     */   }
/*     */   
/*     */   public cy d(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  14 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  22 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  30 */     return 12;
/*     */   }
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  34 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3))
/*  35 */       return true; 
/*  36 */     if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3))
/*  37 */       return true; 
/*  38 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1))
/*  39 */       return true; 
/*  40 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1))
/*  41 */       return true; 
/*  42 */     if (paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) {
/*  43 */       return true;
/*     */     }
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public void c(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  49 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/*     */     
/*  51 */     int j = i & 0x8;
/*  52 */     i &= 0x7;
/*     */     
/*  54 */     if (paramInt4 == 1 && paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) i = 5 + paramdp.k.nextInt(2); 
/*  55 */     if (paramInt4 == 2 && paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) i = 4; 
/*  56 */     if (paramInt4 == 3 && paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/*  57 */     if (paramInt4 == 4 && paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) i = 2; 
/*  58 */     if (paramInt4 == 5 && paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) i = 1;
/*     */     
/*  60 */     paramdp.b(paramInt1, paramInt2, paramInt3, i + j);
/*     */   }
/*     */   
/*     */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  64 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) {
/*  65 */       paramdp.b(paramInt1, paramInt2, paramInt3, 1);
/*  66 */     } else if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) {
/*  67 */       paramdp.b(paramInt1, paramInt2, paramInt3, 2);
/*  68 */     } else if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) {
/*  69 */       paramdp.b(paramInt1, paramInt2, paramInt3, 3);
/*  70 */     } else if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) {
/*  71 */       paramdp.b(paramInt1, paramInt2, paramInt3, 4);
/*  72 */     } else if (paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) {
/*  73 */       paramdp.b(paramInt1, paramInt2, paramInt3, 5 + paramdp.k.nextInt(2));
/*     */     } 
/*  75 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  79 */     if (g(paramdp, paramInt1, paramInt2, paramInt3)) {
/*  80 */       int i = paramdp.b(paramInt1, paramInt2, paramInt3) & 0x7;
/*  81 */       boolean bool = false;
/*     */       
/*  83 */       if (!paramdp.d(paramInt1 - 1, paramInt2, paramInt3) && i == 1) bool = true; 
/*  84 */       if (!paramdp.d(paramInt1 + 1, paramInt2, paramInt3) && i == 2) bool = true; 
/*  85 */       if (!paramdp.d(paramInt1, paramInt2, paramInt3 - 1) && i == 3) bool = true; 
/*  86 */       if (!paramdp.d(paramInt1, paramInt2, paramInt3 + 1) && i == 4) bool = true; 
/*  87 */       if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3) && i == 5) bool = true;
/*     */       
/*  89 */       if (bool) {
/*  90 */         a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/*  91 */         paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  97 */     if (!a(paramdp, paramInt1, paramInt2, paramInt3)) {
/*  98 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/*  99 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/* 100 */       return false;
/*     */     } 
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   public void a(hb paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 106 */     int i = paramhb.b(paramInt1, paramInt2, paramInt3) & 0x7;
/* 107 */     float f = 0.1875F;
/* 108 */     if (i == 1) {
/* 109 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 110 */     } else if (i == 2) {
/* 111 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 112 */     } else if (i == 3) {
/* 113 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 114 */     } else if (i == 4) {
/* 115 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     } else {
/* 117 */       f = 0.25F;
/* 118 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/* 123 */     a(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*     */   }
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/* 127 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/* 128 */     int j = i & 0x7;
/* 129 */     int k = 8 - (i & 0x8);
/*     */     
/* 131 */     paramdp.b(paramInt1, paramInt2, paramInt3, j + k);
/* 132 */     paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 134 */     paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, (k > 0) ? 0.6F : 0.5F);
/*     */     
/* 136 */     paramdp.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 137 */     if (j == 1) {
/* 138 */       paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 139 */     } else if (j == 2) {
/* 140 */       paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 141 */     } else if (j == 3) {
/* 142 */       paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 143 */     } else if (j == 4) {
/* 144 */       paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     } else {
/* 146 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     } 
/*     */     
/* 149 */     return true;
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 153 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/* 154 */     if ((i & 0x8) > 0) {
/* 155 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 156 */       int j = i & 0x7;
/* 157 */       if (j == 1) {
/* 158 */         paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 159 */       } else if (j == 2) {
/* 160 */         paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 161 */       } else if (j == 3) {
/* 162 */         paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 163 */       } else if (j == 4) {
/* 164 */         paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */       } else {
/* 166 */         paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */       } 
/*     */     } 
/* 169 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean b(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 173 */     return ((paramhb.b(paramInt1, paramInt2, paramInt3) & 0x8) > 0);
/*     */   }
/*     */   
/*     */   public boolean d(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 177 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/* 178 */     if ((i & 0x8) == 0) return false; 
/* 179 */     int j = i & 0x7;
/*     */     
/* 181 */     if (j == 5 && paramInt4 == 1) return true; 
/* 182 */     if (j == 4 && paramInt4 == 2) return true; 
/* 183 */     if (j == 3 && paramInt4 == 3) return true; 
/* 184 */     if (j == 2 && paramInt4 == 4) return true; 
/* 185 */     if (j == 1 && paramInt4 == 5) return true;
/*     */     
/* 187 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 192 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */