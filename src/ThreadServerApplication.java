/*     */ public final class ThreadServerApplication
/*     */   extends Thread
/*     */ {
            final MinecraftServer a;
/*     */   public ThreadServerApplication(String paramString, MinecraftServer paramMinecraftServer) {
/* 333 */     super(paramString);
              this.a = paramMinecraftServer;
/*     */   } public void run() {
/* 335 */     this.a.run();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */