/*    */ import java.io.IOException;
/*    */ import java.net.Socket;

/*    */ class NetworkAcceptThread
/*    */   extends Thread
/*    */ {
    final MinecraftServer a; /* synthetic field */
    final NetworkListenThread b; /* synthetic field */
/*    */   NetworkAcceptThread(NetworkListenThread paramcv, String paramString, MinecraftServer paramMinecraftServer) {
/* 28 */     super(paramString);
            this.a = paramMinecraftServer;
            this.b = paramcv;
/*    */   } public void run() {
/* 30 */     while (this.b.b) {
/*    */       try {
/* 32 */         Socket socket = NetworkListenThread.a(this.b).accept();
/* 33 */         if (socket != null) {
/* 34 */           NetLoginHandler ek = new NetLoginHandler(this.a, socket, "Connection #" + NetworkListenThread.b(this.b));
/* 35 */           NetworkListenThread.a(this.b, ek);
/*    */         } 
/* 37 */       } catch (IOException iOException) {
/* 38 */         iOException.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */