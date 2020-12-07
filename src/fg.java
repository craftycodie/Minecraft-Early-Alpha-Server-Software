/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.logging.Logger;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fg
/*    */ {
/* 11 */   public static Logger a = Logger.getLogger("Minecraft");
/* 12 */   public List b = new ArrayList();
/*    */   
/*    */   private MinecraftServer c;
/*    */   private gr d;
/* 16 */   private int e = 20;
/*    */   
/*    */   public fg(MinecraftServer paramMinecraftServer) {
/* 19 */     this.c = paramMinecraftServer;
/* 20 */     this.d = new gr(paramMinecraftServer);
/*    */   }
/*    */   
/*    */   public int a() {
/* 24 */     return this.d.b();
/*    */   }
/*    */   
/*    */   public void a(dq paramdq) {
/* 28 */     this.b.add(paramdq);
/* 29 */     this.c.e.a(paramdq);
/* 30 */     this.d.a(paramdq);
/*    */   }
/*    */   
/*    */   public void b(dq paramdq) {
/* 34 */     this.d.c(paramdq);
/*    */   }
/*    */   
/*    */   public void c(dq paramdq) {
/* 38 */     this.c.e.d(paramdq);
/* 39 */     this.b.remove(paramdq);
/* 40 */     this.d.b(paramdq);
/*    */   }
/*    */   
/*    */   public dq a(ek paramek, String paramString1, String paramString2) {
/* 44 */     if (this.b.size() >= this.e) {
/* 45 */       paramek.b("The server is full!");
/* 46 */       return null;
/*    */     } 
/* 48 */     for (byte b = 0; b < this.b.size(); b++) {
/* 49 */       dq dq = this.b.get(b);
/* 50 */       if (dq.ap.equalsIgnoreCase(paramString1)) {
/* 51 */         dq.a.b("You logged in from another location");
/*    */       }
/*    */     } 
/* 54 */     return new dq(this.c, this.c.e, paramString1, new hw(this.c.e));
/*    */   }
/*    */   
/*    */   public void b() {
/* 58 */     this.d.a();
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 62 */     this.d.a(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(ha paramha) {
/* 66 */     for (byte b = 0; b < this.b.size(); b++) {
/* 67 */       dq dq = this.b.get(b);
/* 68 */       dq.a.b(paramha);
/*    */     } 
/*    */   }
/*    */   
/*    */   public String c() {
/* 73 */     String str = "";
/* 74 */     for (byte b = 0; b < this.b.size(); b++) {
/* 75 */       if (b > 0) str = str + ", "; 
/* 76 */       str = str + ((dq)this.b.get(b)).ap;
/*    */     } 
/* 78 */     return str;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */