/*    */ import java.util.logging.ConsoleHandler;
/*    */ import java.util.logging.FileHandler;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ public class ey
/*    */ {
/*  8 */   public static Logger a = Logger.getLogger("Minecraft");
/*    */   
/*    */   public static void a() {
/* 11 */     gj gj = new gj();
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
/* 40 */     a.setUseParentHandlers(false);
/*    */     
/* 42 */     ConsoleHandler consoleHandler = new ConsoleHandler();
/* 43 */     consoleHandler.setFormatter(gj);
/* 44 */     a.addHandler(consoleHandler);
/*    */     
/*    */     try {
/* 47 */       FileHandler fileHandler = new FileHandler("server.log");
/* 48 */       fileHandler.setFormatter(gj);
/* 49 */       a.addHandler(fileHandler);
/* 50 */     } catch (Exception exception) {
/* 51 */       a.log(Level.WARNING, "Failed to log to server.log", exception);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */