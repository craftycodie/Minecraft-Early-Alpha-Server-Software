/*    */ import java.io.IOException;
/*    */ import java.net.Socket;
/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ class cn
/*    */   extends Thread
/*    */ {
/*    */   cn(cv paramcv, String paramString, MinecraftServer paramMinecraftServer) {
/* 28 */     super(paramString);
/*    */   } public void run() {
/* 30 */     while (this.b.b) {
/*    */       try {
/* 32 */         Socket socket = cv.a(this.b).accept();
/* 33 */         if (socket != null) {
/* 34 */           ek ek = new ek(this.a, socket, "Connection #" + cv.b(this.b));
/* 35 */           cv.a(this.b, ek);
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