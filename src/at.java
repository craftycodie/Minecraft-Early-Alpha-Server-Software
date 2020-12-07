/*     */ import java.util.List;
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
/*     */ 
/*     */ public class at
/*     */   extends et
/*     */ {
/*     */   private ck a;
/*     */   
/*     */   protected at(int paramInt1, int paramInt2, ck paramck) {
/*  19 */     super(paramInt1, paramInt2, hz.d);
/*  20 */     this.a = paramck;
/*  21 */     a(true);
/*     */     
/*  23 */     float f = 0.0625F;
/*  24 */     a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  29 */     return 20;
/*     */   }
/*     */   
/*     */   public cy d(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  37 */     return false;
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
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  49 */     return paramdp.d(paramInt1, paramInt2 - 1, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  56 */     boolean bool = false;
/*     */     
/*  58 */     if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) bool = true;
/*     */     
/*  60 */     if (bool) {
/*  61 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/*  62 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  67 */     if (paramdp.b(paramInt1, paramInt2, paramInt3) == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  71 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, db paramdb) {
/*  75 */     if (paramdp.b(paramInt1, paramInt2, paramInt3) == 1) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  83 */     boolean bool1 = (paramdp.b(paramInt1, paramInt2, paramInt3) == 1) ? true : false;
/*  84 */     boolean bool2 = false;
/*     */     
/*  86 */     float f = 0.125F;
/*  87 */     List list = null;
/*  88 */     if (this.a == ck.a) list = paramdp.b((db)null, cy.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f))); 
/*  89 */     if (this.a == ck.b) list = paramdp.a(ic.class, cy.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f))); 
/*  90 */     if (this.a == ck.c) list = paramdp.a(eq.class, cy.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f))); 
/*  91 */     if (list.size() > 0) {
/*  92 */       bool2 = true;
/*     */     }
/*     */     
/*  95 */     if (bool2 && !bool1) {
/*  96 */       paramdp.b(paramInt1, paramInt2, paramInt3, 1);
/*  97 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.ba);
/*  98 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*  99 */       paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 101 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     } 
/* 103 */     if (!bool2 && bool1) {
/* 104 */       paramdp.b(paramInt1, paramInt2, paramInt3, 0);
/* 105 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 106 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/* 107 */       paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 109 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/*     */     } 
/*     */     
/* 112 */     if (bool2) {
/* 113 */       paramdp.h(paramInt1, paramInt2, paramInt3, this.ba);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 118 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/* 119 */     if (i > 0) {
/* 120 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 121 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     } 
/* 123 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(hb paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 127 */     boolean bool = (paramhb.b(paramInt1, paramInt2, paramInt3) == 1) ? true : false;
/*     */     
/* 129 */     float f = 0.0625F;
/* 130 */     if (bool) {
/* 131 */       a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */     } else {
/* 133 */       a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(hb paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 138 */     return (paramhb.b(paramInt1, paramInt2, paramInt3) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 143 */     if (paramdp.b(paramInt1, paramInt2, paramInt3) == 0) return false; 
/* 144 */     return (paramInt4 == 1);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 148 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */