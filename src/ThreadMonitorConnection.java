/*     */ 
/*     */
/*     */ class ThreadMonitorConnection
/*     */   extends Thread
/*     */ {
            final NetworkManager netManager; /* synthetic field */
/*     */   ThreadMonitorConnection(NetworkManager paramaw) {
                netManager = paramaw;
            }
/*     */   
/*     */   public void run() {
/*     */     try {
/* 236 */       Thread.sleep(2000L);
/* 237 */       if (NetworkManager.isRunning(this.netManager)) {
/* 238 */         NetworkManager.getWriteThread(this.netManager).interrupt();
/* 239 */         this.netManager.a("Connection closed");
/*     */       } 
/* 241 */     } catch (Exception exception) {
/* 242 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */