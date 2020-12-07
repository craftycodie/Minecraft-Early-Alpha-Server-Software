/*     */ class NetworkMasterThread
/*     */   extends Thread
/*     */ {
    final NetworkManager a; /* synthetic field */

    /*     */   NetworkMasterThread(NetworkManager paramaw) {
        a = paramaw;
    }
/*     */   
/*     */   public void run() {
/*     */     try {
/* 169 */       Thread.sleep(5000L);
/* 170 */       if (NetworkManager.e(this.a).isAlive()) {
/*     */         try {
/* 172 */           NetworkManager.e(this.a).stop();
/* 173 */         } catch (Throwable throwable) {}
/*     */       }
/*     */       
/* 176 */       if (NetworkManager.f(this.a).isAlive()) {
/*     */         try {
/* 178 */           NetworkManager.f(this.a).stop();
/* 179 */         } catch (Throwable throwable) {}
/*     */       }
/*     */     }
/* 182 */     catch (InterruptedException interruptedException) {
/* 183 */       interruptedException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */