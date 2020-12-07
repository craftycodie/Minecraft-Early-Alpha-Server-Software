/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class NetworkManager {
/*  10 */   public static final Object a = new Object();
/*     */   public static int b;
/*     */   public static int c;
/*  13 */   private Object d = new Object();
/*     */   private Socket e;
/*     */   private DataInputStream f;
/*     */   private DataOutputStream g;
/*     */   private boolean isRunning = true;
/*  27 */   private List i = Collections.synchronizedList(new LinkedList());
/*  28 */   private List j = Collections.synchronizedList(new LinkedList());
/*  29 */   private List k = Collections.synchronizedList(new LinkedList());
/*     */   private NetClientManager l;
/*     */   private boolean m = false;
/*     */   private Thread n;
/*     */   private Thread o;
/*     */   private boolean p = false;
/*  38 */   private String q = "";
/*  40 */   private int r = 0;
/*  41 */   private int s = 0;
/*     */   private int t;
/*     */
/*     */   public void a(NetClientManager paramdy) {
/*  89 */     this.l = paramdy;
/*     */   }
/*     */   
/*     */   public void a(Packet paramha) {
/*  93 */     if (this.m)
/*  94 */       return;  synchronized (this.d) {
/*  95 */       this.s += paramha.getPacketSize() + 1;
/*  96 */       if (paramha.j) {
/*  97 */         this.k.add(paramha);
/*     */       } else {
/*  99 */         this.j.add(paramha);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */
            static boolean isRunning(NetworkManager networkmanager)
            {
                return networkmanager.isRunning;
            }

            static Thread getWriteThread(NetworkManager networkmanager)
            {
                return networkmanager.n;
            }

    static Thread e(NetworkManager networkmanager)
    {
        return networkmanager.n;
    }

    static Thread f(NetworkManager networkmanager)
    {
        return networkmanager.o;
    }
/*     */ 
/*     */   
/*     */   public NetworkManager(Socket paramSocket, String paramString, NetClientManager paramdy) throws IOException {
/* 109 */     this.t = 0; this.e = paramSocket; this.l = paramdy; paramSocket.setTrafficClass(24); this.f = new DataInputStream(paramSocket.getInputStream()); this.g = new DataOutputStream(paramSocket.getOutputStream()); this.o = new NetworkReaderThread(this, paramString + " read thread");
/*     */     this.n = new NetworkWriterThread(this, paramString + " write thread");
/*     */     this.o.start();
/*     */     this.n.start(); } private void e() { 
/* 113 */     try { boolean bool = true;
/* 114 */       if (!this.j.isEmpty()) {
/* 115 */         Packet ha; bool = false;
/*     */         
/* 117 */         synchronized (this.d) {
/* 118 */           ha = (Packet)this.j.remove(0);
/* 119 */           this.s -= ha.getPacketSize() + 1;
/*     */         } 
/* 121 */         ha.writePacket(ha, this.g);
/*     */       } 
/*     */ 
/*     */       
/* 125 */       if ((bool || this.t-- <= 0) && !this.k.isEmpty()) {
/* 126 */         Packet ha; bool = false;
/*     */         
/* 128 */         synchronized (this.d) {
/* 129 */           ha = (Packet)this.k.remove(0);
/* 130 */           this.s -= ha.getPacketSize() + 1;
/*     */         } 
/* 132 */         ha.writePacket(ha, this.g);
/* 133 */         this.t = 50;
/*     */       } 
/*     */       
/* 136 */       if (bool) {
/* 137 */         Thread.sleep(10L);
/*     */       } }
/* 139 */     catch (InterruptedException interruptedException) {  }
/* 140 */     catch (Exception exception)
/* 141 */     { if (!this.p) a(exception);  }
/*     */      }
/*     */ 
/*     */   
/*     */   private void f() {
/*     */     try {
/* 147 */       Packet ha = Packet.readPacket(this.f);
/* 148 */       if (ha != null) { this.i.add(ha); }
/* 149 */       else {
                    a("End of stream");
                }
/* 150 */     } catch (Exception exception) {
/* 151 */       if (!this.p) a(exception); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(Exception paramException) {
/* 156 */     paramException.printStackTrace();
/* 157 */     a("Internal exception: " + paramException.toString());
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 161 */     if (!this.isRunning)
/* 162 */       return;  this.p = true;
/* 163 */     this.q = paramString;
/*     */     
/* 165 */     (new NetworkMasterThread(this)).start();

/* 188 */     this.isRunning = false;
/*     */     try {
/* 190 */       this.f.close();
/* 191 */     } catch (Throwable throwable) {}
/*     */     
/*     */     try {
/* 194 */       this.g.close();
/* 195 */     } catch (Throwable throwable) {}
/*     */     
/*     */     try {
/* 198 */       this.e.close();
/* 199 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 204 */     if (this.s > 1048576) {
/* 205 */       a("Send buffer overflow");
/*     */     }
/* 207 */     if (this.i.isEmpty()) {
/* 208 */       if (this.r++ == 1200) {
/* 209 */         a("Timed out");
/*     */       }
/*     */     } else {
/* 212 */       this.r = 0;
/*     */     } 
/*     */     
/* 215 */     int b = 100;
/* 216 */     while (!this.i.isEmpty() && b-- >= 0) {
/* 217 */       Packet ha = (Packet)this.i.remove(0);
/* 218 */       ha.a(this.l);
/*     */     } 
/*     */     
/* 221 */     if (this.p && this.i.isEmpty()) {
/* 222 */       this.l.a(this.q);
/*     */     }
/*     */   }
/*     */   
/*     */   public SocketAddress b() {
/* 227 */     return this.e.getRemoteSocketAddress();
/*     */   }
/*     */   
/*     */   public void c() {
/* 231 */     this.m = true;
/* 232 */     this.o.interrupt();
/* 233 */     (new ThreadMonitorConnection(this)).start();
/*     */   }
    static boolean a(NetworkManager networkmanager)
    {
        return networkmanager.isRunning;
    }

    static boolean b(NetworkManager networkmanager)
    {
        return networkmanager.m;
    }

    static void d(NetworkManager aw2) {
        aw2.e();
    }

    static void c(NetworkManager aw2) {
        aw2.f();
    }

/*     */   public int d() {
/* 249 */     return this.k.size();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\aw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */