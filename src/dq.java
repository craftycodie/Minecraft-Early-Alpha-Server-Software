/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dq
/*     */   extends eq
/*     */ {
/*     */   public hm a;
/*     */   public MinecraftServer b;
/*     */   public hw ac;
/*     */   public double ad;
/*     */   public double ae;
/*  18 */   public List af = new LinkedList();
/*     */   
/*  20 */   public Set ag = new HashSet();
/*     */   
/*     */   public double ah;
/*     */   
/*     */   public dq(MinecraftServer paramMinecraftServer, dp paramdp, String paramString, hw paramhw) {
/*  25 */     super(paramdp);
/*     */     
/*  27 */     int i = paramdp.l + this.Q.nextInt(20) - 10;
/*  28 */     int j = paramdp.n + this.Q.nextInt(20) - 10;
/*  29 */     int k = paramdp.d(i, j);
/*  30 */     c(i + 0.5D, k, j + 0.5D, 0.0F, 0.0F);
/*  31 */     this.b = paramMinecraftServer;
/*  32 */     this.M = 0.0F;
/*  33 */     paramhw.a = this;
/*  34 */     this.ap = paramString;
/*  35 */     this.ac = paramhw;
/*  36 */     this.B = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_() {}
/*     */ 
/*     */   
/*     */   public void f(db paramdb) {}
/*     */   
/*     */   public boolean a(db paramdb, int paramInt) {
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {}
/*     */   
/*     */   public void h() {
/*  53 */     super.b_();
/*     */     
/*  55 */     ih ih = null;
/*  56 */     double d = 0.0D; byte b;
/*  57 */     for (b = 0; b < this.af.size(); b++) {
/*  58 */       ih ih1 = this.af.get(b);
/*  59 */       double d1 = ih1.a(this);
/*  60 */       if (b == 0 || d1 < d) {
/*  61 */         ih = ih1;
/*  62 */         d = ih1.a(this);
/*     */       } 
/*     */     } 
/*  65 */     if (ih != null) {
/*  66 */       b = 0;
/*     */       
/*  68 */       if (d < 1024.0D) b = 1; 
/*  69 */       if (this.a.b() < 2) b = 1;
/*     */       
/*  71 */       if (b != 0) {
/*  72 */         this.af.remove(ih);
/*  73 */         this.a.b(new cs(ih.a * 16, 0, ih.b * 16, 16, 128, 16, this.b.e));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void x() {
/*  79 */     this.n = this.o = this.p = 0.0D;
/*  80 */     this.bd = false;
/*  81 */     super.x();
/*     */   }
/*     */   
/*     */   public void c(db paramdb, int paramInt) {
/*  85 */     if (!paramdb.A && 
/*  86 */       paramdb instanceof fa) {
/*  87 */       this.a.b(new eb(((fa)paramdb).a, paramInt));
/*  88 */       this.b.k.a(paramdb, new bz(paramdb.c, this.c));
/*     */     } 
/*     */     
/*  91 */     super.c(paramdb, paramInt);
/*     */   }
/*     */   
/*     */   public void y() {
/*  95 */     if (!this.an) {
/*  96 */       this.ao = -1;
/*  97 */       this.an = true;
/*  98 */       this.b.k.a(this, new n(this, 1));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected float n() {
/* 103 */     return 1.62F;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */