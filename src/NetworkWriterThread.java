
/*    */ class NetworkWriterThread
/*    */   extends Thread
/*    */ {
    final NetworkManager a; /* synthetic field */
/*    */   NetworkWriterThread(NetworkManager paramaw, String paramString) {
/* 67 */     super(paramString);
            a = paramaw;
/*    */   } public void run() {
/* 69 */     synchronized (NetworkManager.a) {
/* 70 */       NetworkManager.c++;
/*    */     } 
/*    */     try {
/* 73 */       while (NetworkManager.a(this.a)) {
/* 74 */         NetworkManager.d(this.a);
/*    */       }
/*    */     } finally {
/* 77 */       synchronized (NetworkManager.a) {
/* 78 */         NetworkManager.c--;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */