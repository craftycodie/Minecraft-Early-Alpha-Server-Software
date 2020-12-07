/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
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
/*    */ public class bi
/*    */   extends Thread
/*    */ {
/*    */   public bi(MinecraftServer paramMinecraftServer) {}
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