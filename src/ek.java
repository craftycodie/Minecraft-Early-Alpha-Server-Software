/*     */ public class ek extends dy {
/*     */   public void a(x paramx) {
/*   3 */     this.f = paramx.b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*   9 */     if (paramx.a != 10) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  15 */       b("Outdated client!");
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*  23 */     dq dq = this.d.f.a(this, paramx.b, paramx.c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     if (dq != null) {
/*     */ 
/*     */ 
/*     */       
/*  39 */       a.info(b() + " logged in");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  52 */       hm hm = new hm(this.d, this.b, dq);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  63 */       hm.b(new x("", "", 0));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  73 */       this.d.f.a(dq);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  80 */       hm.a(dq.k, dq.l, dq.m, dq.q, dq.r);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  94 */       this.d.c.a(hm);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     this.c = true;
/*     */   }
/*     */   
/*     */   public static Logger a = Logger.getLogger("Minecraft");
/*     */   public aw b;
/*     */   public boolean c = false;
/*     */   private MinecraftServer d;
/*     */   private int e = 0;
/*     */   private String f = null;
/*     */   
/*     */   public ek(MinecraftServer paramMinecraftServer, Socket paramSocket, String paramString) {
/*     */     this.d = paramMinecraftServer;
/*     */     this.b = new aw(paramSocket, paramString, this);
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     if (this.e++ == 100) {
/*     */       b("Took too long to log in");
/*     */     } else {
/*     */       this.b.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*     */     a.info("Disconnecting " + b() + ": " + paramString);
/*     */     this.b.a(new hx(paramString));
/*     */     this.b.c();
/*     */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*     */     a.info(b() + " lost connection");
/*     */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(ha paramha) {
/*     */     b("Protocol error");
/*     */   }
/*     */   
/*     */   public String b() {
/*     */     if (this.f != null)
/*     */       return this.f + " [" + this.b.b().toString() + "]"; 
/*     */     return this.b.b().toString();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ek.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */