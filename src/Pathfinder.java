/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pathfinder
/*     */ {
/*     */   private IBlockAccess a;
/*  12 */   private Path b = new Path();
/*  13 */   private MCHash c = new MCHash();
/*     */   
/*  15 */   private PathPoint[] d = new PathPoint[32];
/*     */   
/*     */   public Pathfinder(IBlockAccess paramhb) {
/*  18 */     this.a = paramhb;
/*     */   }
/*     */   
/*     */   public PathEntity a(Entity paramdb1, Entity paramdb2, float paramFloat) {
/*  22 */     return a(paramdb1, paramdb2.posX, paramdb2.boundingBox.b, paramdb2.posZ, paramFloat);
/*     */   }
/*     */   
/*     */   public PathEntity a(Entity paramdb, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/*  26 */     return a(paramdb, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), paramFloat);
/*     */   }
/*     */   
/*     */   private PathEntity a(Entity paramdb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  30 */     this.b.a();
/*  31 */     this.c.clearMap();
/*     */     
/*  33 */     PathPoint a1 = a(MathHelper.floor_double(paramdb.boundingBox.a), MathHelper.floor_double(paramdb.boundingBox.b), MathHelper.floor_double(paramdb.boundingBox.c));
/*  34 */     PathPoint a2 = a(MathHelper.floor_double(paramDouble1 - (paramdb.C / 2.0F)), MathHelper.floor_double(paramDouble2), MathHelper.floor_double(paramDouble3 - (paramdb.C / 2.0F)));
/*     */     
/*  36 */     PathPoint a3 = new PathPoint(MathHelper.floor_float(paramdb.C + 1.0F), MathHelper.floor_float(paramdb.D + 1.0F), MathHelper.floor_float(paramdb.C + 1.0F));
/*  37 */     return a(paramdb, a1, a2, a3, paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private PathEntity a(Entity paramdb, PathPoint parama1, PathPoint parama2, PathPoint parama3, float paramFloat) {
/*  43 */     parama1.f = 0.0F;
/*  44 */     parama1.g = parama1.a(parama2);
/*  45 */     parama1.h = parama1.g;
/*     */     
/*  47 */     this.b.a();
/*  48 */     this.b.a(parama1);
/*     */     
/*  50 */     PathPoint a1 = parama1;
/*     */     
/*  52 */     while (!this.b.c()) {
/*  53 */       PathPoint a2 = this.b.b();
/*     */       
/*  55 */       if (a2.d == parama2.d) {
/*  56 */         return a(parama1, parama2);
/*     */       }
/*     */       
/*  59 */       if (a2.a(parama2) < a1.a(parama2)) {
/*  60 */         a1 = a2;
/*     */       }
/*  62 */       a2.j = true;
/*     */       
/*  64 */       int i = b(paramdb, a2, parama3, parama2, paramFloat);
/*  65 */       for (int b = 0; b < i; b++) {
/*  66 */         PathPoint a3 = this.d[b];
/*     */         
/*  68 */         float f = a2.f + a2.a(a3);
/*  69 */         if (!a3.a() || f < a3.f) {
/*  70 */           a3.i = a2;
/*  71 */           a3.f = f;
/*  72 */           a3.g = a3.a(parama2);
/*  73 */           if (a3.a()) {
/*  74 */             this.b.a(a3, a3.f + a3.g);
/*     */           } else {
/*  76 */             a3.h = a3.f + a3.g;
/*  77 */             this.b.a(a3);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  83 */     if (a1 == parama1) return null; 
/*  84 */     return a(parama1, a1);
/*     */   }
/*     */   
/*     */   private int b(Entity paramdb, PathPoint parama1, PathPoint parama2, PathPoint parama3, float paramFloat) {
/*  88 */     int b = 0;
/*     */     
/*  90 */     boolean bool = false;
/*  91 */     if (a(paramdb, parama1.a, parama1.b + 1, parama1.c, parama2) > 0) bool = true;
/*     */     
/*  93 */     PathPoint a1 = a(paramdb, parama1.a, parama1.b, parama1.c + 1, parama2, bool ? 1 : 0);
/*  94 */     PathPoint a2 = a(paramdb, parama1.a - 1, parama1.b, parama1.c, parama2, bool ? 1 : 0);
/*  95 */     PathPoint a3 = a(paramdb, parama1.a + 1, parama1.b, parama1.c, parama2, bool ? 1 : 0);
/*  96 */     PathPoint a4 = a(paramdb, parama1.a, parama1.b, parama1.c - 1, parama2, bool ? 1 : 0);
/*     */     
/*  98 */     if (a1 != null && !a1.j && a1.a(parama3) < paramFloat) this.d[b++] = a1; 
/*  99 */     if (a2 != null && !a2.j && a2.a(parama3) < paramFloat) this.d[b++] = a2; 
/* 100 */     if (a3 != null && !a3.j && a3.a(parama3) < paramFloat) this.d[b++] = a3; 
/* 101 */     if (a4 != null && !a4.j && a4.a(parama3) < paramFloat) this.d[b++] = a4;
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
/* 115 */     return b;
/*     */   }
/*     */   
/*     */   private PathPoint a(Entity paramdb, int paramInt1, int paramInt2, int paramInt3, PathPoint parama, int paramInt4) {
/* 119 */     PathPoint a1 = null;
/* 120 */     if (a(paramdb, paramInt1, paramInt2, paramInt3, parama) > 0) a1 = a(paramInt1, paramInt2, paramInt3); 
/* 121 */     if (a1 == null && a(paramdb, paramInt1, paramInt2 + paramInt4, paramInt3, parama) > 0) {
/* 122 */       a1 = a(paramInt1, paramInt2 + paramInt4, paramInt3);
/* 123 */       paramInt2 += paramInt4;
/*     */     } 
/*     */     
/* 126 */     if (a1 != null) {
/* 127 */       int b = 0;
/* 128 */       int i = 0;
/* 129 */       while (paramInt2 > 0 && (i = a(paramdb, paramInt1, paramInt2 - 1, paramInt3, parama)) > 0) {
/* 130 */         if (i < 0) return null; 
/* 131 */         if (++b >= 4) return null; 
/* 132 */         paramInt2--;
/*     */       } 
/* 134 */       if (paramInt2 > 0) a1 = a(paramInt1, paramInt2, paramInt3);
/*     */     
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     return a1;
/*     */   }
/*     */   
/*     */   private final PathPoint a(int paramInt1, int paramInt2, int paramInt3) {
/* 145 */     int i = paramInt1 | paramInt2 << 10 | paramInt3 << 20;
/* 146 */     PathPoint a1 = (PathPoint)this.c.lookup(i);
/* 147 */     if (a1 == null) {
/* 148 */       a1 = new PathPoint(paramInt1, paramInt2, paramInt3);
/* 149 */       this.c.addKey(i, a1);
/*     */     } 
/* 151 */     return a1;
/*     */   }
/*     */   
/*     */   private int a(Entity paramdb, int paramInt1, int paramInt2, int paramInt3, PathPoint parama) {
/* 155 */     for (int i = paramInt1; i < paramInt1 + parama.a; i++) {
/* 156 */       for (int j = paramInt2; j < paramInt2 + parama.b; j++) {
/* 157 */         for (int k = paramInt3; k < paramInt3 + parama.c; k++) {
/* 158 */           Material hz = this.a.getBlockMaterial(paramInt1, paramInt2, paramInt3);
/* 159 */           if (hz.c()) return 0; 
/* 160 */           if (hz == hz.f || hz == hz.g) return -1; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 164 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   private PathEntity a(PathPoint parama1, PathPoint parama2) {
/* 169 */     int b = 1;
/* 170 */     PathPoint a1 = parama2;
/* 171 */     while (a1.i != null) {
/* 172 */       b++;
/* 173 */       a1 = a1.i;
/*     */     } 
/*     */     
/* 176 */     PathPoint[] arrayOfA = new PathPoint[b];
/* 177 */     a1 = parama2;
/* 178 */     arrayOfA[--b] = a1;
/* 179 */     while (a1.i != null) {
/* 180 */       a1 = a1.i;
/* 181 */       arrayOfA[--b] = a1;
/*     */     } 
/* 183 */     return new PathEntity(arrayOfA);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ed.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */