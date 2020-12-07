/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */

/*    */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ThreadCommandReader
/*    */   extends Thread
/*    */ {
    final MinecraftServer a; /* synthetic field */

    /*    */   public ThreadCommandReader(MinecraftServer paramMinecraftServer) {
        a = paramMinecraftServer;
    }
/*    */   
/*    */   public void run() {
/* 60 */     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
/* 61 */     String str = null;
/*    */     try {
/* 63 */       while (!this.a.g && MinecraftServer.a(this.a) && (str = bufferedReader.readLine()) != null) {
/* 64 */         this.a.a(str);
/*    */       }
/* 66 */     } catch (IOException iOException) {
/* 67 */       iOException.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */