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
/*  19 */   public static Logger logger = Logger.getLogger("Minecraft");
/*     */   
/*     */   public NetworkManager netManager;
/*     */   public boolean connectionClosed = false;
/*     */   private MinecraftServer mcServer;
/*     */   private EntityPlayerMP playerEntity;
/*  25 */   private int f = 0;
/*     */   
/*     */   private double lastPosX;
/*     */   
/*     */   private double lastPosY;
/*     */   
/*     */   private double lastPosZ;
/*     */   
/*     */   private boolean hasMoved;
/*     */   
/*     */   public void a() {
/*  36 */     this.netManager.a();
/*  37 */     if (this.f++ % 20 == 0) {
/*  38 */       this.netManager.a(new Packet0KeepAlive());
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  43 */     this.netManager.a(new Packet255KickDisconnect(paramString));
/*  44 */     this.netManager.c();
/*  45 */     this.mcServer.configManager.c(this.playerEntity);
/*  46 */     this.connectionClosed = true;
/*     */   }
/*     */   
/*     */   public NetServerHandler(MinecraftServer paramMinecraftServer, NetworkManager paramaw, EntityPlayerMP paramdq) {
/*  50 */     this.hasMoved = true; this.mcServer = paramMinecraftServer; this.netManager = paramaw;
/*     */     paramaw.a(this);
/*     */     this.playerEntity = paramdq;
/*  53 */     paramdq.playerNetServerHandler = this; }

        public void a(Packet10Flying packet10flying) {
            if(!hasMoved)
            {
                double d = packet10flying.yPosition - lastPosY;
                if(packet10flying.xPosition == lastPosX && d * d < 0.01D && packet10flying.zPosition == lastPosZ)
                {
                    hasMoved = true;
                }
            }
            /*  59 */
            if (this.hasMoved) {
                double d1 = playerEntity.posY;
                lastPosX = playerEntity.posX;
                lastPosY = playerEntity.posY;
                lastPosZ = playerEntity.posZ;
                double d3 = playerEntity.posX;
                double d5 = playerEntity.posY;
                double d7 = playerEntity.posZ;
                float f2 = playerEntity.rotationYaw;
                float f3 = playerEntity.rotationPitch;
                /*     */
                /*  72 */
                if (packet10flying.moving) {
                    d3 = packet10flying.xPosition;
                    d5 = packet10flying.yPosition;
                    d7 = packet10flying.zPosition;
                    /*  81 */
                    this.playerEntity.ah = packet10flying.yPosition;
                    /*     */
                }
                /*  83 */
                if (packet10flying.rotating) {
                    f2 = packet10flying.yaw;
                    f3 = packet10flying.pitch;
                }
                /*     */
                /*  88 */
                playerEntity.onUpdateEntity();
                playerEntity.ySize = 0.0F;
                playerEntity.setPositionAndRotation(lastPosX, lastPosY, lastPosZ, f2, f3);

                // TODO: Validate, this is from b1.7.3
                if(!hasMoved)
                {
                    return;
                }
                /*     */
                double d11 = d3 - playerEntity.posX;
                double d12 = d5 - playerEntity.posY;
                double d13 = d7 - playerEntity.posZ;
                /*     */
                /*  96 */
                float f4 = 0.0625F;
                /*  97 */
                boolean bool1 = (this.mcServer.worldserver.getCollidingBoundingBoxes(this.playerEntity, this.playerEntity.boundingBox.copy().getInsetBoundingBox(f3, f3, f3)).size() == 0) ? true : false;
                /*     */
                /*  99 */
                playerEntity.moveEntity(d11, d12, d13);
                d11 = d3 - playerEntity.posX;
                d12 = d5 - playerEntity.posY;
                if(d12 > -0.5D || d12 < 0.5D)
                {
                    d12 = 0.0D;
                }
                /* 105 */
                d13 = d7 - playerEntity.posZ;
                double d14 = d11 * d11 + d12 * d12 + d13 * d13;
                boolean flag1 = false;
                /* 108 */
                if(d14 > 0.0625D)
                {
                    flag1 = true;
                    logger.warning((new StringBuilder()).append(playerEntity.username).append(" moved wrongly!").toString());
                    System.out.println((new StringBuilder()).append("Got position ").append(d3).append(", ").append(d5).append(", ").append(d7).toString());
                    System.out.println((new StringBuilder()).append("Expected ").append(playerEntity.posX).append(", ").append(playerEntity.posY).append(", ").append(playerEntity.posZ).toString());
                }
                /* 112 */
                playerEntity.setPositionAndRotation(d3, d5, d7, f2, f3);
                /*     */
                /* 114 */
                boolean bool3 = this.mcServer.worldserver.getCollidingBoundingBoxes(this.playerEntity, this.playerEntity.boundingBox.copy().getInsetBoundingBox(f3, f3, f3)).size() == 0;
                /* 115 */
                if (bool1 && (flag1 || !bool3)) {
                    teleportTo(lastPosX, lastPosY, lastPosZ, f2, f3);
                    return;
                }
                /*     */
                /* 121 */
                playerEntity.onGround = packet10flying.onGround;
                /* 122 */
                this.mcServer.configManager.b(this.playerEntity);
                /*     */
            }
        }
/*     */ 
/*     */
/*     */   public void teleportTo(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 127 */     this.hasMoved = false;
/* 128 */     this.lastPosX = paramDouble1;
/* 129 */     this.lastPosY = paramDouble2;
/* 130 */     this.lastPosZ = paramDouble3;
/* 131 */     this.playerEntity.setPositionAndRotation(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 132 */     this.playerEntity.playerNetServerHandler.sendPacket(new Packet13PlayerLookMove(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2, false));
/*     */   }
/*     */   
/*     */   public void a(Packet14BlockDig paramgp) {
/* 136 */     boolean bool = false;
/* 137 */     if (paramgp.e == 0) bool = true; 
/* 138 */     if (paramgp.e == 1) bool = true;
/*     */     
/* 140 */     if (bool) {
/* 141 */       double d = this.playerEntity.posY;
/* 142 */       this.playerEntity.posY = this.playerEntity.ah;
/* 143 */       fe fe = this.playerEntity.a(4.0D, 1.0F);
/* 144 */       this.playerEntity.posY = d;
// TODO: Fix maybe.
///* 145 */       if (fe == null) {
///* 146 */         System.out.println("MISMATCH: Got " + paramgp.item + ", " + paramgp.expand + ", " + paramgp.onItemPickup + ", " + paramgp.zPosition + ", but expected <NO HIT>"); return;
///*     */       }
///* 148 */       if (fe.expand != paramgp.item || fe.onItemPickup != paramgp.expand || fe.zPosition != paramgp.onItemPickup || fe.rotation != paramgp.zPosition) {
///* 149 */         System.out.println("MISMATCH: Got " + paramgp.item + ", " + paramgp.expand + ", " + paramgp.onItemPickup + ", " + paramgp.zPosition + ", but expected " + fe.expand + ", " + fe.onItemPickup + ", " + fe.zPosition + ", " + fe.rotation);
///*     */         return;
///*     */       }
/*     */     }
/* 153 */     int i = paramgp.a;
/* 154 */     int j = paramgp.b;
/* 155 */     int k = paramgp.c;
/* 156 */     int m = paramgp.d;
/* 157 */     int n = (int) MathHelper.e((i - this.mcServer.worldserver.l));
/* 158 */     int i1 = (int) MathHelper.e((k - this.mcServer.worldserver.n));
/* 159 */     if (n > i1) i1 = n; 
/* 160 */     if (paramgp.e == 0) {
/* 161 */       if (i1 > 16) this.playerEntity.itemInWorldManager.a(i, j, k);
/* 162 */     } else if (paramgp.e == 2) {
/* 163 */       this.playerEntity.itemInWorldManager.a();
/* 164 */     } else if (paramgp.e == 1) {
/* 165 */       if (i1 > 16) this.playerEntity.itemInWorldManager.a(i, j, k, m);
/* 166 */     } else if (paramgp.e == 3) {
/* 167 */       double d1 = this.playerEntity.posX - i + 0.5D;
/* 168 */       double d2 = this.playerEntity.posY - j + 0.5D;
/* 169 */       double d3 = this.playerEntity.posZ - k + 0.5D;
/* 170 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 171 */       if (d4 < 256.0D) {
/* 172 */         this.playerEntity.playerNetServerHandler.sendPacket(new Packet53BlockChange(i, j, k, this.mcServer.worldserver));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Packet15Place parames) {
/* 178 */     int i = parames.b;
/* 179 */     int j = parames.c;
/* 180 */     int k = parames.d;
/* 181 */     int m = parames.e;
/* 182 */     int n = (int) MathHelper.e((i - this.mcServer.worldserver.l));
/* 183 */     int i1 = (int) MathHelper.e((k - this.mcServer.worldserver.n));
/* 184 */     if (n > i1) i1 = n; 
/* 185 */     if (i1 > 16) {
/* 186 */       ItemStack gc = new ItemStack(parames.a);
/* 187 */       this.playerEntity.itemInWorldManager.a(this.playerEntity, this.mcServer.worldserver, gc, i, j, k, m);
/*     */     } 
/* 189 */     this.playerEntity.playerNetServerHandler.sendPacket(new Packet53BlockChange(i, j, k, this.mcServer.worldserver));
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 193 */     logger.info(this.playerEntity.username + " lost connection: " + paramString);
/* 194 */     this.mcServer.configManager.c(this.playerEntity);
/* 195 */     this.connectionClosed = true;
/*     */   }
/*     */   
/*     */   public void a(Packet paramha) {
/* 199 */     logger.warning(getClass() + " wasn'singleplayerWorld prepared to deal with lookup " + paramha.getClass());
/* 200 */     b("Protocol error, unexpected packet");
/*     */   }
/*     */   
/*     */   public void sendPacket(Packet paramha) {
/* 204 */     this.netManager.a(paramha);
/*     */   }
/*     */   
/*     */   public void a(Packet16BlockItemSwitch paramfi) {
/* 208 */     int i = paramfi.b;
/* 209 */     if (i == 0) {
/* 210 */       this.playerEntity.inventory.a[this.playerEntity.inventory.d] = null;
/*     */     } else {
/* 212 */       this.playerEntity.inventory.a[this.playerEntity.inventory.d] = new ItemStack(i);
/*     */     } 
/* 214 */     this.mcServer.k.sendPacketToTrackedPlayers(this.playerEntity, new Packet16BlockItemSwitch(this.playerEntity.entityId, i));
/*     */   }
/*     */   
/*     */   public void a(Packet21PickupSpawn paramj) {
/* 218 */     double d1 = paramj.xPosition / 32.0D;
/* 219 */     double d2 = paramj.yPosition / 32.0D;
/* 220 */     double d3 = paramj.zPosition / 32.0D;
/* 221 */     EntityItem fa = new EntityItem(this.mcServer.worldserver, d1, d2, d3, new ItemStack(paramj.itemID, paramj.count));
/* 222 */     fa.motionX = paramj.rotation / 128.0D;
/* 223 */     fa.motionY = paramj.pitch / 128.0D;
/* 224 */     fa.motionZ = paramj.roll / 128.0D;
/* 225 */     fa.delayBeforeCanPickup = 10;
/* 226 */     this.mcServer.worldserver.a(fa);
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
/* 246 */       str = "<" + this.playerEntity.username + "> " + str;
/* 247 */       logger.info(str);
/* 248 */       this.mcServer.configManager.a(new Packet3Chat(str));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(String paramString) {
/* 254 */     if (paramString.toLowerCase().startsWith("/me ")) {
/* 255 */       paramString = "* " + this.playerEntity.username + " " + paramString.substring(paramString.indexOf(" ")).trim();
/* 256 */       logger.info(paramString);
/* 257 */       this.mcServer.configManager.a(new Packet3Chat(paramString));
/* 258 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/home")) {
/* 259 */       logger.info(this.playerEntity.username + " returned home");
/* 260 */       int i = this.mcServer.worldserver.d(this.mcServer.worldserver.l, this.mcServer.worldserver.n);
/* 261 */       teleportTo(this.mcServer.worldserver.l + 0.5D, i + 1.5D, this.mcServer.worldserver.n + 0.5D, 0.0F, 0.0F);
/* 262 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/away")) {
/* 263 */       Random random = new Random();
/* 264 */       logger.info(this.playerEntity.username + " went away");
/* 265 */       double d1 = Math.random() * 10000.0D - 5000.0D;
/* 266 */       double d2 = Math.random() * 10000.0D - 5000.0D;
/* 267 */       teleportTo(d1, 80.0D, d2, random.nextFloat() * 360.0F, 0.0F);
/* 268 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/iron")) {
/* 269 */       if (MinecraftServer.b.containsKey(this.playerEntity.username)) {
/* 270 */         logger.info(this.playerEntity.username + " failed to iron!");
/* 271 */         sendPacket(new Packet3Chat("§cYou can't /iron again so soon!"));
/*     */       } else {
/* 273 */         MinecraftServer.b.put(this.playerEntity.username, Integer.valueOf(6000));
/* 274 */         logger.info(this.playerEntity.username + " ironed!");
/* 275 */         for (int b = 0; b < 4; b++) {
/* 276 */           this.playerEntity.a(new ItemStack(Item.m, 1));
/*     */         }
/*     */       } 
/* 279 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/wood")) {
/* 280 */       if (MinecraftServer.b.containsKey(this.playerEntity.username)) {
/* 281 */         logger.info(this.playerEntity.username + " failed to wood!");
/* 282 */         sendPacket(new Packet3Chat("§cYou can't /wood again so soon!"));
/*     */       } else {
/* 284 */         MinecraftServer.b.put(this.playerEntity.username, Integer.valueOf(6000));
/* 285 */         logger.info(this.playerEntity.username + " wooded!");
/* 286 */         for (int b = 0; b < 4; b++) {
/* 287 */           this.playerEntity.a(new ItemStack(Block.y, 1));
/*     */         }
/*     */       } 
/*     */     } else {
/* 291 */       sendPacket(new Packet3Chat("§9Unknown command"));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Packet18Animation paramn) {
/* 296 */     if (paramn.b == 1) {
/* 297 */       this.playerEntity.y();
/*     */     }
/*     */   }
/*     */
/*     */   public void a(Packet255KickDisconnect paramhx) {
/* 302 */     this.netManager.a("Quitting");
/*     */   }
/*     */   
/*     */   public int b() {
/* 306 */     return this.netManager.d();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */