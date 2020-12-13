/*     */
/*     */

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ import java.awt.*;
import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.UnknownHostException;
import java.util.ArrayList;
/*     */ import java.util.Collections;
import java.util.HashMap;
/*     */ import java.util.List;
import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ public class MinecraftServer implements Runnable {
/*  18 */   public static Logger a = Logger.getLogger("Minecraft");
/*  19 */   public static HashMap b = new HashMap<Object, Object>();
/*     */   
/*     */   public NetworkListenThread c;
/*     */   
/*     */   public PropertyManager d;
/*     */   
/*     */   public WorldManager worldserver;
/*     */   
/*     */   public fg configManager;
/*     */   private boolean l = true;
/*     */   public boolean g = false;
/*  30 */   int h = 0;
/*     */   
/*     */   public String i;
/*     */   public int j;
/*  34 */   private List m = new ArrayList();
/*  35 */   private List n = Collections.synchronizedList(new ArrayList());
/*     */ 
/*     */   
/*     */   public EntityTracker k;
/*     */ 
/*     */   
/*     */   private boolean startServer() throws UnknownHostException {
/*  42 */     Runtime.getRuntime().addShutdownHook((Thread)new ServerShutdownHook(this));
/*     */
/*     */     
/*  58 */     ThreadCommandReader bi = new ThreadCommandReader(this);
/*     */
/*     */     
/*  71 */     bi.setDaemon(true);
/*  72 */     bi.start();
/*     */     
/*  74 */     ey.a();
/*  75 */     a.info("Alpha 1.0.11 Server Remake V1 by Codie");
/*  75 */     a.info("DEV BUILD");
/*  75 */     a.info("Starting minecraft server.");
/*     */     
/*  77 */     if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
/*  78 */       a.warning("**** NOT ENOUGH RAM!");
/*  79 */       a.warning("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
/*     */     } 
/*     */     
/*  82 */     a.info("Loading properties");
/*  83 */     this.d = new PropertyManager(new File("server.properties"));
/*  84 */     String str1 = this.d.a("server-ip", "");
/*     */     
/*  86 */     InetAddress inetAddress = null;
/*  87 */     if (str1.length() > 0) inetAddress = InetAddress.getByName(str1); 
/*  88 */     int i = this.d.a("server-port", 25565);
/*     */     
/*  90 */     a.info("Starting Minecraft server on " + ((str1.length() == 0) ? "*" : str1) + ":" + i);
/*     */     try {
/*  92 */       this.c = new NetworkListenThread(this, inetAddress, i);
/*  93 */     } catch (IOException iOException) {
/*  94 */       a.warning("**** FAILED TO BIND TO PORT!");
/*  95 */       a.log(Level.WARNING, "The exception was: " + iOException.toString());
/*  96 */       a.warning("Perhaps a server is already running on that port?");
/*  97 */       return false;
/*     */     } 
/*  99 */     this.configManager = new fg(this);
/* 100 */     this.k = new EntityTracker(this);
/*     */     
/* 102 */     String str2 = this.d.a("level-name", "world");
/* 103 */     a.info("Preparing level \"" + str2 + "\"");
/* 104 */     b(str2);
/* 105 */     a.info("Done! For help, type \"help\" or \"?\"");
/* 106 */     return true;
/*     */   }
/*     */   
/*     */   private void b(String paramString) {
/* 110 */     a.info("Preparing start region");
/* 111 */     this.worldserver = new WorldManager(new File("."), paramString);
/* 112 */     this.worldserver.a((ba)new dr(this));
/* 113 */     int b1 = 10;
/* 114 */     for (int b2 = -b1; b2 <= b1; b2++) {
/* 115 */       a("Preparing spawn area", (b2 + b1) * 100 / (b1 + b1 + 1));
/* 116 */       for (int b = -b1; b <= b1; b++) {
/* 117 */         if (!this.l)
/* 118 */           return;  this.worldserver.chunkProviderServer.d((this.worldserver.l >> 4) + b2, (this.worldserver.n >> 4) + b);
/*     */       } 
/*     */     } 
/* 121 */     d();
/*     */   }
/*     */   
/*     */   private void a(String paramString, int paramInt) {
/* 125 */     this.i = paramString;
/* 126 */     this.j = paramInt;
/* 127 */     System.out.println(paramString + ": " + paramInt + "%");
/*     */   }
/*     */   
/*     */   private void d() {
/* 131 */     this.i = null;
/* 132 */     this.j = 0;
/*     */   }
/*     */   
/*     */   private void e() {
/* 136 */     a.info("Saving chunks");
/* 137 */     this.worldserver.a(true, null);
/*     */   }
/*     */   
/*     */   private void f() {
/* 141 */     a.info("Stopping server");
/* 142 */     if (this.worldserver != null) {
/* 143 */       e();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 148 */     this.l = false;
/*     */   }
/*     */   
/*     */   public void run() {
/*     */     try {
/* 153 */       if (startServer()) {
/*     */         
/* 155 */         long l1 = System.currentTimeMillis();
/* 156 */         long l2 = 0L;
/* 157 */         while (this.l) {
/* 158 */           long l3 = System.currentTimeMillis();
/* 159 */           long l4 = l3 - l1;
/* 160 */           if (l4 > 2000L) {
/* 161 */             a.warning("Can't keep up! Did the system time change, or is the server overloaded?");
/* 162 */             l4 = 2000L;
/*     */           } 
/* 164 */           if (l4 < 0L) {
/* 165 */             a.warning("Time ran backwards! Did the system time change?");
/* 166 */             l4 = 0L;
/*     */           } 
/* 168 */           l2 += l4;
/* 169 */           l1 = l3;
/*     */           
/* 171 */           while (l2 > 50L) {
/* 172 */             l2 -= 50L;
/* 173 */             g();
/*     */           } 
/*     */           
/* 176 */           Thread.sleep(1L);
/*     */         } 
/*     */       } else {
/* 179 */         while (this.l) {
/* 180 */           b();
/*     */           try {
/* 182 */             Thread.sleep(10L);
/* 183 */           } catch (InterruptedException interruptedException) {
/* 184 */             interruptedException.printStackTrace();
/*     */           } 
/*     */         } 
/*     */       } 
/* 188 */     } catch (Exception exception) {
/* 189 */       a.log(Level.SEVERE, "Unexpected exception", exception);
/* 190 */       while (this.l) {
/* 191 */         b();
/*     */         try {
/* 193 */           Thread.sleep(10L);
/* 194 */         } catch (InterruptedException interruptedException) {
/* 195 */           interruptedException.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 199 */       f();
/* 200 */       this.g = true;
/* 201 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void g() {
/* 206 */     ArrayList<String> arrayList = new ArrayList();
/* 207 */     for (Object str : b.keySet()) {
/* 208 */       int i = ((Integer)b.get(str)).intValue();
/* 209 */       if (i > 0) {
/* 210 */         b.put(str, Integer.valueOf(i - 1)); continue;
/*     */       } 
/* 212 */       arrayList.add((String)str);
/*     */     }
/* 215 */     for (int b = 0; b < arrayList.size(); b++) {
/* 216 */       this.b.remove(arrayList.get(b));
/*     */     }
/*     */     
/* 219 */     AxisAlignedBB.a();
/* 220 */     Vec3D.a();
/* 221 */     this.h++;
/*     */     
/* 223 */     this.worldserver.e();
/* 224 */     while (this.worldserver.c());
/*     */     
/* 226 */     this.worldserver.b();
/* 227 */     this.c.a();
/* 228 */     this.configManager.b();
/* 229 */     this.k.updateTrackedEntities();
/*     */     
/* 231 */     for (int b = 0; b < this.m.size(); b++) {
/* 232 */       ((IUpdatePlayerListBox)this.m.get(b)).a();
/*     */     }
/*     */     
/*     */     try {
/* 236 */       b();
/* 237 */     } catch (Exception exception) {
/* 238 */       a.log(Level.WARNING, "Unexpected exception while parsing console command", exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/* 244 */     this.n.add(paramString);
/*     */   }
/*     */   
/*     */   public void b() {
/* 248 */     while (this.n.size() > 0) {
/* 249 */       String str = (String)this.n.remove(0);
/* 250 */       if (str.toLowerCase().startsWith("help") || str.toLowerCase().startsWith("?")) {
/* 251 */         a.info("To run the server without a gui, start it like this:");
/* 252 */         a.info("   java -Xmx1024M -Xms1024M -jar minecraft_server.jar nogui");
/* 253 */         a.info("Console commands:");
/* 254 */         a.info("   help  or  ?          shows this message");
/* 255 */         a.info("   kick <player>        removes item player from the server");
/* 256 */         a.info("   give <player> <id>   gives item player item resource");
/* 257 */         a.info("   stop                 gracefully stops the server");
/* 258 */         a.info("   list                 lists all currently connected players");
/* 259 */         a.info("   say <message>        broadcasts item message to all players"); continue;
/* 260 */       }  if (str.toLowerCase().startsWith("list")) {
/* 261 */         a.info("Connected players: " + this.configManager.c()); continue;
/* 262 */       }  if (str.toLowerCase().startsWith("stop")) {
/* 263 */         this.l = false; continue;
/* 264 */       }  if (str.toLowerCase().startsWith("kick ")) {
/* 265 */         String str1 = str.substring(str.indexOf(" ")).trim();
/* 266 */         EntityPlayerMP dq = null;
/* 267 */         for (int b = 0; b < this.configManager.b.size(); b++) {
/* 268 */           EntityPlayerMP dq1 = (EntityPlayerMP)this.configManager.b.get(b);
/* 269 */           if (dq1.username.equalsIgnoreCase(str1)) {
/* 270 */             dq = dq1;
/*     */           }
/*     */         } 
/*     */         
/* 274 */         if (dq != null) {
/* 275 */           dq.playerNetServerHandler.b("Kicked by admin");
/* 276 */           a.log(Level.INFO, "Kicking " + dq.username); continue;
/*     */         } 
/* 278 */         a.log(Level.INFO, "Can't find user " + str1 + ". No kick."); continue;
/*     */       } 
/* 280 */       if (str.toLowerCase().startsWith("give ")) {
/* 281 */         String[] arrayOfString = str.split(" ");
/* 282 */         if (arrayOfString.length != 3) {
/*     */           return;
/*     */         }
/*     */         
/* 286 */         String str1 = arrayOfString[1];
/* 287 */         EntityPlayerMP dq = null; int i;
/* 288 */         for (i = 0; i < this.configManager.b.size(); i++) {
/* 289 */           EntityPlayerMP dq1 = (EntityPlayerMP)this.configManager.b.get(i);
/* 290 */           if (dq1.username.equalsIgnoreCase(str1)) {
/* 291 */             dq = dq1;
/*     */           }
/*     */         } 
/*     */         
/* 295 */         if (dq != null) {
/*     */           try {
/* 297 */             i = Integer.parseInt(arrayOfString[2]);
/* 298 */             if (Item.c[i] != null) {
/* 299 */               a.log(Level.INFO, "Giving " + dq.username + " some " + i);
/* 300 */               dq.a(new ItemStack(i, 1)); continue;
/*     */             } 
/* 302 */             a.log(Level.INFO, "There's no item with id " + i);
/*     */           }
/* 304 */           catch (NumberFormatException numberFormatException) {
/* 305 */             a.log(Level.INFO, "There's no item with id " + arrayOfString[2]);
/*     */           }  continue;
/*     */         } 
/* 308 */         a.log(Level.INFO, "Can't find user " + str1); continue;
/*     */       } 
/* 310 */       if (str.toLowerCase().startsWith("say ")) {
/* 311 */         str = str.substring(str.indexOf(" ")).trim();
/* 312 */         a.info("[Server] " + str);
/* 313 */         this.configManager.a(new Packet3Chat("§d[Server] " + str)); continue;
/*     */       } 
/* 315 */       a.warning("Unknown console command. Type \"help\" for help.");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(IUpdatePlayerListBox paramdn) {
/* 321 */     this.m.add(paramdn);
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString) {
/*     */     try {
/* 326 */       MinecraftServer minecraftServer = new MinecraftServer();
/*     */       
/* 328 */       if (!GraphicsEnvironment.isHeadless() && (paramArrayOfString.length <= 0 || !paramArrayOfString[0].equals("nogui")))
/*     */       {
/* 330 */         ServerGUI.a(minecraftServer);
/*     */       }
/*     */       
/* 333 */       (new ThreadServerApplication("Server thread", minecraftServer)).start();
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 338 */     catch (Exception exception) {
/* 339 */       a.log(Level.SEVERE, "Failed to start the minecraft server", exception);
/*     */     } 
/*     */   }

            public static boolean a(MinecraftServer minecraftServer) {
                return minecraftServer.l;
            }

            public static boolean a(MinecraftServer minecraftServer, boolean bl) {
                minecraftServer.l = bl;
                return minecraftServer.l;
            }
        /*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\net\minecraft\server\MinecraftServer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */