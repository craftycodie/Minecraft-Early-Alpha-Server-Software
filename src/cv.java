/*    */ import java.net.InetAddress;
/*    */ import java.net.ServerSocket;
/*    */ import java.util.ArrayList;
/*    */ import java.util.logging.Logger;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cv
/*    */ {
/* 11 */   public static Logger a = Logger.getLogger("Minecraft");
/*    */   
/*    */   private ServerSocket c;
/*    */   private Thread d;
/*    */   public volatile boolean b = false;
/* 16 */   private int e = 0;
/*    */   
/* 18 */   private ArrayList f = new ArrayList();
/* 19 */   private ArrayList g = new ArrayList();
/*    */   private MinecraftServer h;
/*    */   
/*    */   public cv(MinecraftServer paramMinecraftServer, InetAddress paramInetAddress, int paramInt) {
/* 23 */     this.h = paramMinecraftServer;
/* 24 */     this.c = new ServerSocket(paramInt, 0, paramInetAddress);
/* 25 */     this.c.setPerformancePreferences(0, 2, 1);
/*    */     
/* 27 */     this.b = true;
/* 28 */     this.d = new cn(this, "Listen thread", paramMinecraftServer);
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
/* 44 */     this.d.start();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hm paramhm) {
/* 49 */     this.g.add(paramhm);
/*    */   }
/*    */   
/*    */   private void a(ek paramek) {
/* 53 */     if (paramek == null) {
/* 54 */       throw new IllegalArgumentException("Got null pendingconnection!");
/*    */     }
/* 56 */     this.f.add(paramek);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/*    */     byte b;
/* 69 */     for (b = 0; b < this.f.size(); b++) {
/* 70 */       ek ek = this.f.get(b);
/* 71 */       ek.a();
/* 72 */       if (ek.c) {
/* 73 */         this.f.remove(b--);
/*    */       }
/*    */     } 
/*    */     
/* 77 */     for (b = 0; b < this.g.size(); b++) {
/* 78 */       hm hm = this.g.get(b);
/* 79 */       hm.a();
/* 80 */       if (hm.c)
/* 81 */         this.g.remove(b--); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */