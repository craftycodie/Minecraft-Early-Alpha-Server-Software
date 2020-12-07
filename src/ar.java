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
/*     */ public class ar
/*     */   extends et
/*     */ {
/*     */   protected ar(int paramInt1, int paramInt2) {
/* 234 */     super(paramInt1, paramInt2, hz.n);
/* 235 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */   }
/*     */   
/*     */   public cy d(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 239 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 247 */     return false;
/*     */   }
/*     */   
/*     */   public fe a(dp paramdp, int paramInt1, int paramInt2, int paramInt3, as paramas1, as paramas2) {
/* 251 */     a(paramdp, paramInt1, paramInt2, paramInt3);
/* 252 */     return super.a(paramdp, paramInt1, paramInt2, paramInt3, paramas1, paramas2);
/*     */   }
/*     */   
/*     */   public void a(hb paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 256 */     int i = paramhb.b(paramInt1, paramInt2, paramInt3);
/* 257 */     if (i >= 2 && i <= 5) {
/* 258 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*     */     } else {
/* 260 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */     } 
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
/*     */   public int a() {
/* 274 */     return 9;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 278 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean a(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 282 */     if (paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) {
/* 283 */       return true;
/*     */     }
/* 285 */     return false;
/*     */   }
/*     */   
/*     */   public void e(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 289 */     paramdp.b(paramInt1, paramInt2, paramInt3, 15);
/* 290 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 294 */     int i = paramdp.b(paramInt1, paramInt2, paramInt3);
/* 295 */     boolean bool = false;
/*     */     
/* 297 */     if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) bool = true; 
/* 298 */     if (i == 2 && !paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) bool = true; 
/* 299 */     if (i == 3 && !paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) bool = true; 
/* 300 */     if (i == 4 && !paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) bool = true; 
/* 301 */     if (i == 5 && !paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) bool = true;
/*     */     
/* 303 */     if (bool) {
/* 304 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.b(paramInt1, paramInt2, paramInt3));
/* 305 */       paramdp.d(paramInt1, paramInt2, paramInt3, 0);
/*     */     }
/* 307 */     else if (paramInt4 > 0 && et.n[paramInt4].d() && 
/* 308 */       fq.a(new fq(this, paramdp, paramInt1, paramInt2, paramInt3)) == 3) {
/* 309 */       g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void g(dp paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 316 */     (new fq(this, paramdp, paramInt1, paramInt2, paramInt3)).a(paramdp.o(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */