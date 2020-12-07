/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends cl
/*     */ {
/*  14 */   private Random a = new Random();
/*     */   
/*     */   protected b(int paramInt) {
/*  17 */     super(paramInt, hz.c);
/*  18 */     this.aZ = 26;
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
/*     */   public int a(int paramInt) {
/*  74 */     if (paramInt == 1) return this.aZ - 1; 
/*  75 */     if (paramInt == 0) return this.aZ - 1; 
/*  76 */     if (paramInt == 3) return this.aZ + 1; 
/*  77 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  81 */     byte b1 = 0;
/*     */     
/*  83 */     if (paramdp.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba) b1++; 
/*  84 */     if (paramdp.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba) b1++; 
/*  85 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba) b1++; 
/*  86 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba) b1++;
/*     */     
/*  88 */     if (b1 > 1) return false;
/*     */     
/*  90 */     if (g(paramdp, paramInt1 - 1, paramInt2, paramInt3)) return false; 
/*  91 */     if (g(paramdp, paramInt1 + 1, paramInt2, paramInt3)) return false; 
/*  92 */     if (g(paramdp, paramInt1, paramInt2, paramInt3 - 1)) return false; 
/*  93 */     if (g(paramdp, paramInt1, paramInt2, paramInt3 + 1)) return false; 
/*  94 */     return true;
/*     */   }
/*     */   
/*     */   private boolean g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  98 */     if (paramdp.a(paramInt1, paramInt2, paramInt3) != this.ba) return false; 
/*  99 */     if (paramdp.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba) return true; 
/* 100 */     if (paramdp.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba) return true; 
/* 101 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba) return true; 
/* 102 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba) return true; 
/* 103 */     return false;
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 107 */     gn gn = (gn)paramdp.k(paramInt1, paramInt2, paramInt3);
/* 108 */     for (byte b1 = 0; b1 < gn.a(); b1++) {
/* 109 */       gc gc = gn.a(b1);
/* 110 */       if (gc != null) {
/* 111 */         float f1 = this.a.nextFloat() * 0.8F + 0.1F;
/* 112 */         float f2 = this.a.nextFloat() * 0.8F + 0.1F;
/* 113 */         float f3 = this.a.nextFloat() * 0.8F + 0.1F;
/*     */         
/* 115 */         while (gc.a > 0) {
/* 116 */           int i = this.a.nextInt(21) + 10;
/* 117 */           if (i > gc.a) i = gc.a; 
/* 118 */           gc.a -= i;
/*     */           
/* 120 */           fa fa = new fa(paramdp, (paramInt1 + f1), (paramInt2 + f2), (paramInt3 + f3), new gc(gc.c, i, gc.d));
/* 121 */           float f = 0.05F;
/* 122 */           fa.n = ((float)this.a.nextGaussian() * f);
/* 123 */           fa.o = ((float)this.a.nextGaussian() * f + 0.2F);
/* 124 */           fa.p = ((float)this.a.nextGaussian() * f);
/* 125 */           paramdp.a(fa);
/*     */         } 
/*     */       } 
/*     */     } 
/* 129 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, eq parameq) {
/*     */     ae ae;
/* 133 */     gn gn = (gn)paramdp.k(paramInt1, paramInt2, paramInt3);
/*     */     
/* 135 */     if (paramdp.d(paramInt1, paramInt2 + 1, paramInt3)) return true;
/*     */     
/* 137 */     if (paramdp.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba && paramdp.d(paramInt1 - 1, paramInt2 + 1, paramInt3)) return true; 
/* 138 */     if (paramdp.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba && paramdp.d(paramInt1 + 1, paramInt2 + 1, paramInt3)) return true; 
/* 139 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba && paramdp.d(paramInt1, paramInt2 + 1, paramInt3 - 1)) return true; 
/* 140 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba && paramdp.d(paramInt1, paramInt2 + 1, paramInt3 + 1)) return true;
/*     */     
/* 142 */     if (paramdp.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba) ae = new ae("Large chest", (gn)paramdp.k(paramInt1 - 1, paramInt2, paramInt3), gn); 
/* 143 */     if (paramdp.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba) ae = new ae("Large chest", ae, (gn)paramdp.k(paramInt1 + 1, paramInt2, paramInt3)); 
/* 144 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba) ae = new ae("Large chest", (gn)paramdp.k(paramInt1, paramInt2, paramInt3 - 1), ae); 
/* 145 */     if (paramdp.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba) ae = new ae("Large chest", ae, (gn)paramdp.k(paramInt1, paramInt2, paramInt3 + 1));
/*     */     
/* 147 */     parameq.a(ae);
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   protected ap a_() {
/* 152 */     return new gn();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */