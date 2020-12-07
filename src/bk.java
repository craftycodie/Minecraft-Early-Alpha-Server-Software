
/*    */ public class bk
/*    */   extends Thread
/*    */ {
    final MinecraftServer a; /* synthetic field */

    /*    */   public bk(MinecraftServer paramMinecraftServer) {
        a = paramMinecraftServer;
    }
/*    */   
/*    */   public void run() {
/* 44 */     if (MinecraftServer.a(this.a)) {
/* 45 */       MinecraftServer.a.info("Shutdown intercepted");
/* 46 */       MinecraftServer.a(this.a, false);
/*    */       do {
/*    */         try {
/* 49 */           Thread.sleep(10000L);
/* 50 */         } catch (InterruptedException interruptedException) {
/* 51 */           interruptedException.printStackTrace();
/*    */         } 
/* 53 */       } while (!this.a.g);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */