import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

/*     */ public class NetLoginHandler extends NetClientManager {
/*     */   public void a(Packet1Login paramx) {
/*   3 */     this.f = paramx.b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*   9 */     if (paramx.a != 11) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  15 */       b("Outdated client!");
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*  23 */     EntityPlayerMP dq = this.d.configManager.a(this, paramx.b, paramx.c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     if (dq != null) {
/*     */ 
/*     */ 
/*     */       
/*  39 */       a.info(b() + " logged in");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  52 */       NetServerHandler hm = new NetServerHandler(this.d, this.b, dq);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  63 */       hm.sendPacket(new Packet1Login("", "", 0));
hm.sendAShitloadOfFuck();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  73 */       this.d.configManager.a(dq);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  80 */       hm.teleportTo(dq.posX, dq.posY, dq.posZ, dq.rotationYaw, dq.rotationPitch);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  94 */       this.d.c.a(hm);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     this.c = true;
/*     */   }
/*     */   
/*     */   public static Logger a = Logger.getLogger("Minecraft");
/*     */   public NetworkManager b;
/*     */   public boolean c = false;
/*     */   private MinecraftServer d;
/*     */   private int e = 0;
/*     */   private String f = null;
/*     */   
/*     */   public NetLoginHandler(MinecraftServer paramMinecraftServer, Socket paramSocket, String paramString) throws IOException {
/*     */     this.d = paramMinecraftServer;
/*     */     this.b = new NetworkManager(paramSocket, paramString, this);
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     if (this.e++ == 100) {
/*     */       b("Took too long to log in");
/*     */     } else {
/*     */       this.b.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*     */     a.info("Disconnecting " + b() + ": " + paramString);
/*     */     this.b.a(new Packet255KickDisconnect(paramString));
/*     */     this.b.c();
/*     */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*     */     a.info(b() + " lost connection");
/*     */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(Packet paramha) {
/*     */     b("Protocol error");
/*     */   }
/*     */   
/*     */   public String b() {
/*     */     if (this.f != null)
/*     */       return this.f + " [" + this.b.b().toString() + "]"; 
/*     */     return this.b.b().toString();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ek.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */