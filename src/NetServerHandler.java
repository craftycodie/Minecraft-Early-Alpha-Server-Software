/*     */ import java.util.Random;
/*     */ import java.util.logging.Logger;
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
/*     */ public class NetServerHandler
/*     */   extends NetClientManager
/*     */ {
/*  19 */   public static Logger a = Logger.getLogger("Minecraft");
/*     */   
/*     */   public NetworkManager b;
/*     */   public boolean c = false;
/*     */   private MinecraftServer d;
/*     */   private EntityPlayerMP e;
/*  25 */   private int f = 0;
/*     */   
/*     */   private double g;
/*     */   
/*     */   private double h;
/*     */   
/*     */   private double i;
/*     */   
/*     */   private boolean j;
/*     */   
/*     */   public void a() {
/*  36 */     this.b.a();
/*  37 */     if (this.f++ % 20 == 0) {
/*  38 */       this.b.a(new Packet0KeepAlive());
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  43 */     this.b.a(new Packet255KickDisconnect(paramString));
/*  44 */     this.b.c();
/*  45 */     this.d.configManager.c(this.e);
/*  46 */     this.c = true;
/*     */   }
/*     */   
/*     */   public NetServerHandler(MinecraftServer paramMinecraftServer, NetworkManager paramaw, EntityPlayerMP paramdq) {
/*  50 */     this.j = true; this.d = paramMinecraftServer; this.b = paramaw;
/*     */     paramaw.a(this);
/*     */     this.e = paramdq;
/*  53 */     paramdq.playerNetServerHandler = this; }

public void a(Packet10Flying paramfs) {
    if (!this.j) {
        /*  54 */
        double d = paramfs.b - this.h;
        /*  55 */
        if (paramfs.a == this.g && d * d < 0.01D && paramfs.c == this.i) {
            /*  56 */
            this.j = true;
            /*     */
        }
        /*     */
    }
    /*  59 */
    if (this.j) {
        /*  60 */
        this.g = this.e.posX;
        /*  61 */
        this.h = this.e.posY;
        /*  62 */
        this.i = this.e.posZ;
        /*     */
        /*     */
        /*  65 */
        double d1 = this.e.posX;
        /*  66 */
        double d2 = this.e.posY;
        /*  67 */
        double d3 = this.e.posZ;
        /*     */
        /*  69 */
        float f1 = this.e.rotationYaw;
        /*  70 */
        float f2 = this.e.rotationPitch;
        /*     */
        /*  72 */
        if (paramfs.h) {
            /*  73 */
            d1 = paramfs.a;
            /*  74 */
            d2 = paramfs.b;
            /*  75 */
            d3 = paramfs.c;
//// TODO: Verify Changes, removed onUpdate parameter
///*  76 */         double removeObject = paramfs.removeObject - paramfs.lookup;
///*  77 */         if (paramfs.containsItem > 1.65D || paramfs.containsItem < 0.1D) {
////                System.out.println(paramfs.containsItem);
//
//                /*  78 */           lookup("Illegal stance");
///*  79 */           lookup.warning(this.removeEntry.username + " had an illegal stance: " + removeObject);
///*     */         }
            /*  81 */
            this.e.ah = paramfs.b;
            /*     */
        }
        /*  83 */
        if (paramfs.i) {
            /*  84 */
            f1 = paramfs.e;
            /*  85 */
            f2 = paramfs.f;
            /*     */
        }
        /*     */
        /*  88 */
        this.e.h();
        /*  89 */
        this.e.L = 0.0F;
        /*  90 */
        this.e.b(this.g, this.h, this.i, f1, f2);
        /*     */
        /*  92 */
        double d4 = d1 - this.e.posX;
        /*  93 */
        double d5 = d2 - this.e.posY;
        /*  94 */
        double d6 = d3 - this.e.posZ;
        /*     */
        /*  96 */
        float f3 = 0.0625F;
        /*  97 */
        boolean bool1 = (this.d.e.a(this.e, this.e.boundingBox.b().e(f3, f3, f3)).size() == 0) ? true : false;
        /*     */
        /*  99 */
        this.e.c(d4, d5, d6);
        /* 100 */
        d4 = d1 - this.e.posX;
        /* 101 */
        d5 = d2 - this.e.posY;
        /* 102 */
        if (d5 > -0.5D || d5 < 0.5D) {
            /* 103 */
            d5 = 0.0D;
            /*     */
        }
        /* 105 */
        d6 = d3 - this.e.posZ;
        /* 106 */
        double d7 = d4 * d4 + d5 * d5 + d6 * d6;
        /* 107 */
        boolean bool2 = false;
        /* 108 */
        if (d7 > 0.0625D) {
            /* 109 */
            bool2 = true;
            /* 110 */
            a.warning(this.e.username + " moved wrongly!");
            /*     */
        }
        /* 112 */
        this.e.b(d1, d2, d3, f1, f2);
        /*     */
        /* 114 */
        boolean bool3 = (this.d.e.a(this.e, this.e.boundingBox.b().e(f3, f3, f3)).size() == 0) ? true : false;
        /* 115 */
        if (bool1 && (bool2 || !bool3)) {
            /* 116 */
            a(this.g, this.h, this.i, f1, f2);
            /*     */
            /*     */
            return;
            /*     */
        }
        /*     */
        /* 121 */
        this.e.v = paramfs.g;
        /* 122 */
        this.d.configManager.b(this.e);
        /*     */
    }
}
/*     */ 
/*     */
    // TODO: Verify packet change, removed 1 double.
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 127 */     this.j = false;
/* 128 */     this.g = paramDouble1;
/* 129 */     this.h = paramDouble2;
/* 130 */     this.i = paramDouble3;
/* 131 */     this.e.b(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 132 */     this.e.playerNetServerHandler.sendPacket(new Packet13PlayerLookMove(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2, false));
/*     */   }
/*     */   
/*     */   public void a(Packet14BlockDig paramgp) {
/* 136 */     boolean bool = false;
/* 137 */     if (paramgp.e == 0) bool = true; 
/* 138 */     if (paramgp.e == 1) bool = true;
/*     */     
/* 140 */     if (bool) {
/* 141 */       double d = this.e.posY;
/* 142 */       this.e.posY = this.e.ah;
/* 143 */       fe fe = this.e.a(4.0D, 1.0F);
/* 144 */       this.e.posY = d;
// TODO: Fix maybe.
///* 145 */       if (fe == null) {
///* 146 */         System.out.println("MISMATCH: Got " + paramgp.item + ", " + paramgp.expand + ", " + paramgp.onItemPickup + ", " + paramgp.d + ", but expected <NO HIT>"); return;
///*     */       }
///* 148 */       if (fe.expand != paramgp.item || fe.onItemPickup != paramgp.expand || fe.d != paramgp.onItemPickup || fe.e != paramgp.d) {
///* 149 */         System.out.println("MISMATCH: Got " + paramgp.item + ", " + paramgp.expand + ", " + paramgp.onItemPickup + ", " + paramgp.d + ", but expected " + fe.expand + ", " + fe.onItemPickup + ", " + fe.d + ", " + fe.e);
///*     */         return;
///*     */       }
/*     */     } 
/* 153 */     int i = paramgp.a;
/* 154 */     int j = paramgp.b;
/* 155 */     int k = paramgp.c;
/* 156 */     int m = paramgp.d;
/* 157 */     int n = (int) MathHelper.e((i - this.d.e.l));
/* 158 */     int i1 = (int) MathHelper.e((k - this.d.e.n));
/* 159 */     if (n > i1) i1 = n; 
/* 160 */     if (paramgp.e == 0) {
/* 161 */       if (i1 > 16) this.e.ac.a(i, j, k); 
/* 162 */     } else if (paramgp.e == 2) {
/* 163 */       this.e.ac.a();
/* 164 */     } else if (paramgp.e == 1) {
/* 165 */       if (i1 > 16) this.e.ac.a(i, j, k, m); 
/* 166 */     } else if (paramgp.e == 3) {
/* 167 */       double d1 = this.e.posX - i + 0.5D;
/* 168 */       double d2 = this.e.posY - j + 0.5D;
/* 169 */       double d3 = this.e.posZ - k + 0.5D;
/* 170 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 171 */       if (d4 < 256.0D) {
/* 172 */         this.e.playerNetServerHandler.sendPacket(new Packet53BlockChange(i, j, k, this.d.e));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Packet15Place parames) {
/* 178 */     int i = parames.b;
/* 179 */     int j = parames.c;
/* 180 */     int k = parames.d;
/* 181 */     int m = parames.e;
/* 182 */     int n = (int) MathHelper.e((i - this.d.e.l));
/* 183 */     int i1 = (int) MathHelper.e((k - this.d.e.n));
/* 184 */     if (n > i1) i1 = n; 
/* 185 */     if (i1 > 16) {
/* 186 */       ItemStack gc = new ItemStack(parames.a);
/* 187 */       this.e.ac.a(this.e, this.d.e, gc, i, j, k, m);
/*     */     } 
/* 189 */     this.e.playerNetServerHandler.sendPacket(new Packet53BlockChange(i, j, k, this.d.e));
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 193 */     a.info(this.e.username + " lost connection: " + paramString);
/* 194 */     this.d.configManager.c(this.e);
/* 195 */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(Packet paramha) {
/* 199 */     a.warning(getClass() + " wasn'singleplayerWorld prepared to deal with lookup " + paramha.getClass());
/* 200 */     b("Protocol error, unexpected packet");
/*     */   }
/*     */   
/*     */   public void sendPacket(Packet paramha) {
/* 204 */     this.b.a(paramha);
/*     */   }
/*     */   
/*     */   public void a(Packet16BlockItemSwitch paramfi) {
/* 208 */     int i = paramfi.b;
/* 209 */     if (i == 0) {
/* 210 */       this.e.inventory.a[this.e.inventory.d] = null;
/*     */     } else {
/* 212 */       this.e.inventory.a[this.e.inventory.d] = new ItemStack(i);
/*     */     } 
/* 214 */     this.d.k.sendPacketToTrackedPlayers(this.e, new Packet16BlockItemSwitch(this.e.entityId, i));
/*     */   }
/*     */   
/*     */   public void a(Packet21PickupSpawn paramj) {
/* 218 */     double d1 = paramj.xPosition / 32.0D;
/* 219 */     double d2 = paramj.yPosition / 32.0D;
/* 220 */     double d3 = paramj.zPosition / 32.0D;
/* 221 */     EntityItem fa = new EntityItem(this.d.e, d1, d2, d3, new ItemStack(paramj.h, paramj.i));
/* 222 */     fa.motionX = paramj.e / 128.0D;
/* 223 */     fa.motionY = paramj.f / 128.0D;
/* 224 */     fa.motionZ = paramj.g / 128.0D;
/* 225 */     fa.delayBeforeCanPickup = 10;
/* 226 */     this.d.e.a(fa);
/*     */   }
/*     */   
/*     */   public void a(Packet3Chat paramax) {
/* 230 */     String str = paramax.a;
/* 231 */     if (str.length() > 100) {
/* 232 */       b("Chat message too long");
/*     */       return;
/*     */     } 
/* 235 */     str = str.trim();
/* 236 */     for (int b = 0; b < str.length(); b++) {
/* 237 */       if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(str.charAt(b)) < 0) {
/* 238 */         b("Illegal characters in chat");
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 243 */     if (str.startsWith("/")) {
/* 244 */       c(str);
/*     */     } else {
/* 246 */       str = "<" + this.e.username + "> " + str;
/* 247 */       a.info(str);
/* 248 */       this.d.configManager.a(new Packet3Chat(str));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(String paramString) {
/* 254 */     if (paramString.toLowerCase().startsWith("/me ")) {
/* 255 */       paramString = "* " + this.e.username + " " + paramString.substring(paramString.indexOf(" ")).trim();
/* 256 */       a.info(paramString);
/* 257 */       this.d.configManager.a(new Packet3Chat(paramString));
/* 258 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/home")) {
/* 259 */       a.info(this.e.username + " returned home");
/* 260 */       int i = this.d.e.d(this.d.e.l, this.d.e.n);
/* 261 */       a(this.d.e.l + 0.5D, i + 1.5D, this.d.e.n + 0.5D, 0.0F, 0.0F);
/* 262 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/away")) {
/* 263 */       Random random = new Random();
/* 264 */       a.info(this.e.username + " went away");
/* 265 */       double d1 = Math.random() * 10000.0D - 5000.0D;
/* 266 */       double d2 = Math.random() * 10000.0D - 5000.0D;
/* 267 */       a(d1, 80.0D, d2, random.nextFloat() * 360.0F, 0.0F);
/* 268 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/iron")) {
/* 269 */       if (MinecraftServer.b.containsKey(this.e.username)) {
/* 270 */         a.info(this.e.username + " failed to iron!");
/* 271 */         sendPacket(new Packet3Chat("§cYou can't /iron again so soon!"));
/*     */       } else {
/* 273 */         MinecraftServer.b.put(this.e.username, Integer.valueOf(6000));
/* 274 */         a.info(this.e.username + " ironed!");
/* 275 */         for (int b = 0; b < 4; b++) {
/* 276 */           this.e.a(new ItemStack(Item.m, 1));
/*     */         }
/*     */       } 
/* 279 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/wood")) {
/* 280 */       if (MinecraftServer.b.containsKey(this.e.username)) {
/* 281 */         a.info(this.e.username + " failed to wood!");
/* 282 */         sendPacket(new Packet3Chat("§cYou can't /wood again so soon!"));
/*     */       } else {
/* 284 */         MinecraftServer.b.put(this.e.username, Integer.valueOf(6000));
/* 285 */         a.info(this.e.username + " wooded!");
/* 286 */         for (int b = 0; b < 4; b++) {
/* 287 */           this.e.a(new ItemStack(Block.y, 1));
/*     */         }
/*     */       } 
/*     */     } else {
/* 291 */       sendPacket(new Packet3Chat("§9Unknown command"));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Packet18Animation paramn) {
/* 296 */     if (paramn.b == 1) {
/* 297 */       this.e.y();
/*     */     }
/*     */   }
/*     */
/*     */   public void a(Packet255KickDisconnect paramhx) {
/* 302 */     this.b.a("Quitting");
/*     */   }
/*     */   
/*     */   public int b() {
/* 306 */     return this.b.d();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */