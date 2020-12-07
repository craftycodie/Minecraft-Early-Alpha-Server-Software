/*    */ class NetworkReaderThread
/*    */   extends Thread
/*    */ {
    final NetworkManager a;
/*    */   NetworkReaderThread(NetworkManager paramaw, String paramString) {
/* 50 */     super(paramString);
            a = paramaw;
/*    */   } public void run() {
/* 52 */     synchronized (NetworkManager.a) {
/* 53 */       NetworkManager.b++;
/*    */     } 
/*    */     try {
/* 56 */       while (NetworkManager.a(this.a) && !NetworkManager.b(this.a)) {
/* 57 */         NetworkManager.c(this.a);
/*    */       }
/*    */     } finally {
/* 60 */       synchronized (NetworkManager.a) {
/* 61 */         NetworkManager.b--;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */