/*    */ import java.awt.event.WindowAdapter;
/*    */ import java.awt.event.WindowEvent;
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
/*    */ final class q
/*    */   extends WindowAdapter
/*    */ {
/*    */   q(MinecraftServer paramMinecraftServer) {}
/*    */   
/*    */   public void windowClosing(WindowEvent paramWindowEvent) {
/* 34 */     this.a.a();
/* 35 */     while (!this.a.g) {
/*    */       try {
/* 37 */         Thread.sleep(100L);
/* 38 */       } catch (InterruptedException interruptedException) {
/* 39 */         interruptedException.printStackTrace();
/*    */       } 
/*    */     } 
/* 42 */     System.exit(0);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */