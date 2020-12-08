/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;

/*     */ public class Block
/*     */ {
/*  43 */   public static final StepSound soundPowderFootstep = new StepSound("stone", 1.0F, 1.0F);
/*  44 */   public static final StepSound soundWoodFootstep = new StepSound("wood", 1.0F, 1.0F);
/*  45 */   public static final StepSound soundGravelFootstep = new StepSound("gravel", 1.0F, 1.0F);
/*  46 */   public static final StepSound soundGrassFootstep = new StepSound("grass", 1.0F, 1.0F);
/*  47 */   public static final StepSound soundStoneFootstep = new StepSound("stone", 1.0F, 1.0F);
/*  48 */   public static final StepSound soundMetalFootstep = new StepSound("stone", 1.0F, 1.5F);
/*  49 */   public static final StepSound soundGlassFootstep = new StepSoundStone("stone", 1.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   public static final StepSound soundClothFootstep = new StepSound("cloth", 1.0F, 1.0F);
/*  55 */   public static final StepSound soundSandFootstep = new StepSoundSand("sand", 1.0F, 1.0F);
/*     */
/*     */   
/*  77 */   public static final Block[] blocksList = new Block[256];
/*     */   
/*  79 */   public static final boolean[] tickOnLoad = new boolean[256];
/*  80 */   public static final boolean[] opaqueCubeLookup = new boolean[256];
/*  81 */   public static final int[] lightOpacity = new int[256];
/*  82 */   public static final boolean[] isBlockContainer = new boolean[256];
/*  83 */   public static final int[] s = new int[256];
/*     */ 
/*     */   
/*  86 */   public static final Block stone = (new BlockStone(1, 1)).c(1.5F).b(10.0F).a(soundStoneFootstep);
/*  87 */   public static final BlockGrass u = (BlockGrass)(new BlockGrass(2)).c(0.6F).a(soundGrassFootstep);
/*  88 */   public static final Block v = (new BlockDirt(3, 2)).c(0.5F).a(soundGravelFootstep);
/*  89 */   public static final Block w = (new Block(4, 16, Material.d)).c(2.0F).b(10.0F).a(soundStoneFootstep);
/*  90 */   public static final Block x = (new Block(5, 4, Material.c)).c(2.0F).b(5.0F).a(soundWoodFootstep);
/*  91 */   public static final Block y = (new BlockSapling(6, 15)).c(0.0F).a(soundGrassFootstep);
/*  92 */   public static final Block z = (new Block(7, 17, Material.d)).c(-1.0F).b(6000000.0F).a(soundStoneFootstep);
/*  93 */   public static final Block A = (new BlockFlowing(8, Material.f)).c(100.0F).c(3);
/*  94 */   public static final Block B = (new BlockStationary(9, Material.f)).c(100.0F).c(3);
/*  95 */   public static final Block C = (new BlockFlowing(10, Material.g)).c(0.0F).a(1.0F).c(255);
/*  96 */   public static final Block D = (new BlockStationary(11, Material.g)).c(100.0F).a(1.0F).c(255);
/*  97 */   public static final Block E = (new BlockSand(12, 18)).c(0.5F).a(soundSandFootstep);
/*  98 */   public static final Block F = (new BlockGravel(13, 19)).c(0.6F).a(soundGravelFootstep);
/*  99 */   public static final Block G = (new BlockOre(14, 32)).c(3.0F).b(5.0F).a(soundStoneFootstep);
/* 100 */   public static final Block H = (new BlockOre(15, 33)).c(3.0F).b(5.0F).a(soundStoneFootstep);
/* 101 */   public static final Block I = (new BlockOre(16, 34)).c(3.0F).b(5.0F).a(soundStoneFootstep);
/* 102 */   public static final Block J = (new BlockLog(17)).c(2.0F).a(soundWoodFootstep);
/* 103 */   public static final BlockLeaves K = (BlockLeaves)(new BlockLeaves(18, 52)).c(0.2F).c(1).a(soundGrassFootstep);
/* 104 */   public static final Block L = (new BlockSponge(19)).c(0.6F).a(soundGrassFootstep);
/* 105 */   public static final Block M = (new BlockGlass(20, 49, Material.o, false)).c(0.3F).a(soundGlassFootstep);
/* 106 */   public static final Block N = null;
/* 107 */   public static final Block O = null;
/* 108 */   public static final Block P = null;
/* 109 */   public static final Block Q = null;
/* 110 */   public static final Block R = null;
/* 111 */   public static final Block S = null;
/* 112 */   public static final Block T = null;
/* 113 */   public static final Block U = null;
/* 114 */   public static final Block V = null;
/* 115 */   public static final Block W = null;
/* 116 */   public static final Block X = null;
/* 117 */   public static final Block Y = null;
/* 118 */   public static final Block Z = null;
/* 119 */   public static final Block aa = null;
/* 120 */   public static final Block ab = (new Block(35, 64, Material.k)).c(0.8F).a(soundClothFootstep);
/* 121 */   public static final Block ac = null;
/* 122 */   public static final BlockFlower ad = (BlockFlower)(new BlockFlower(37, 13)).c(0.0F).a(soundGrassFootstep);
/* 123 */   public static final BlockFlower ae = (BlockFlower)(new BlockFlower(38, 12)).c(0.0F).a(soundGrassFootstep);
/* 124 */   public static final BlockFlower af = (BlockFlower)(new dx(39, 29)).c(0.0F).a(soundGrassFootstep).a(0.125F);
/* 125 */   public static final BlockFlower ag = (BlockFlower)(new dx(40, 28)).c(0.0F).a(soundGrassFootstep);
/* 126 */   public static final Block ah = (new BlockOreStorage(41, 39)).c(3.0F).b(10.0F).a(soundMetalFootstep);
/* 127 */   public static final Block ai = (new BlockOreStorage(42, 38)).c(5.0F).b(10.0F).a(soundMetalFootstep);
/* 128 */   public static final Block aj = (new BlockStep(43, true)).c(2.0F).b(10.0F).a(soundStoneFootstep);
/* 129 */   public static final Block ak = (new BlockStep(44, false)).c(2.0F).b(10.0F).a(soundStoneFootstep);
/* 130 */   public static final Block al = (new Block(45, 7, Material.d)).c(2.0F).b(10.0F).a(soundStoneFootstep);
/* 131 */   public static final Block am = (new BlockTNT(46, 8)).c(0.0F).a(soundGrassFootstep);
/* 132 */   public static final Block an = (new BlockBookshelf(47, 35)).c(1.5F).a(soundWoodFootstep);
/* 133 */   public static final Block ao = (new Block(48, 36, Material.d)).c(2.0F).b(10.0F).a(soundStoneFootstep);
/* 134 */   public static final Block ap = (new BlockObsidian(49, 37)).c(10.0F).b(2000.0F).a(soundStoneFootstep);
/* 135 */   public static final Block aq = (new BlockTorch(50, 80)).c(0.0F).a(0.9375F).a(soundWoodFootstep);
/* 136 */   public static final BlockFire ar = (BlockFire)(new BlockFire(51, 31)).c(0.0F).a(1.0F).a(soundWoodFootstep);
/* 137 */   public static final Block mobSpawner = (new BlockMobSpawner(52, 65)).c(5.0F).a(soundMetalFootstep);
/* 138 */   public static final Block at = new BlockStairs(53, x);
/* 139 */   public static final Block au = (new BlockChest(54)).c(2.5F).a(soundWoodFootstep);
/* 140 */   public static final Block av = (new BlockRedstoneWire(55, 84)).c(0.0F).a(soundPowderFootstep);
/* 141 */   public static final Block aw = (new BlockOre(56, 50)).c(3.0F).b(5.0F).a(soundStoneFootstep);
/* 142 */   public static final Block ax = (new BlockOreStorage(57, 40)).c(5.0F).b(10.0F).a(soundMetalFootstep);
/* 143 */   public static final Block ay = (new BlockWorkbench(58)).c(2.5F).a(soundWoodFootstep);
/* 144 */   public static final Block az = (new BlockCrops(59, 88)).c(0.0F).a(soundGrassFootstep);
/* 145 */   public static final Block aA = (new BlockFarmland(60)).c(0.6F).a(soundGravelFootstep);
/* 146 */   public static final Block aB = (new BlockFurnace(61, false)).c(3.5F).a(soundStoneFootstep);
/* 147 */   public static final Block aC = (new BlockFurnace(62, true)).c(3.5F).a(soundStoneFootstep).a(0.875F);
/* 148 */   public static final Block aD = (new BlockSign(63, TileEntitySign.class, true)).c(1.0F).a(soundWoodFootstep);
/* 149 */   public static final Block aE = (new BlockDoor(64, Material.c)).c(3.0F).a(soundWoodFootstep);
/* 150 */   public static final Block aF = (new BlockLadder(65, 83)).c(0.4F).a(soundWoodFootstep);
/* 151 */   public static final Block aG = (new BlockRail(66, 128)).c(0.7F).a(soundMetalFootstep);
/* 152 */   public static final Block aH = new BlockStairs(67, w);
/* 153 */   public static final Block aI = (new BlockSign(68, TileEntitySign.class, false)).c(1.0F).a(soundWoodFootstep);
/* 154 */   public static final Block aJ = (new BlockLever(69, 96)).c(0.5F).a(soundWoodFootstep);
/* 155 */   public static final Block aK = (new BlockPressurePlate(70, stone.aZ, EnumMobType.mobs)).c(0.5F).a(soundStoneFootstep);
/* 156 */   public static final Block aL = (new BlockDoor(71, Material.e)).c(5.0F).a(soundMetalFootstep);
/* 157 */   public static final Block aM = (new BlockPressurePlate(72, x.aZ, EnumMobType.everything)).c(0.5F).a(soundWoodFootstep);
/* 158 */   public static final Block aN = (new BlockRedstoneOre(73, 51, false)).c(3.0F).b(5.0F).a(soundStoneFootstep);
/* 159 */   public static final Block aO = (new BlockRedstoneOre(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(soundStoneFootstep);
/* 160 */   public static final Block aP = (new BlockRedstoneTorch(75, 115, false)).c(0.0F).a(soundWoodFootstep);
/* 161 */   public static final Block aQ = (new BlockRedstoneTorch(76, 99, true)).c(0.0F).a(0.5F).a(soundWoodFootstep);
/* 162 */   public static final Block aR = (new BlockButton(77, stone.aZ)).c(0.5F).a(soundStoneFootstep);
/* 163 */   public static final Block aS = (new BlockSnow(78, 66)).c(0.1F).a(soundClothFootstep);
/* 164 */   public static final Block aT = (new BlockIce(79, 67)).c(0.5F).c(3).a(soundGlassFootstep);
/* 165 */   public static final Block aU = (new BlockSnowBlock(80, 66)).c(0.2F).a(soundClothFootstep);
/* 166 */   public static final Block aV = (new BlockCactus(81, 70)).c(0.4F).a(soundClothFootstep);
/*     */   public int aZ;
/*     */   public final int blockId;
/*     */   
/*     */   static {
/* 174 */     for (int b = 0; b < 256; b++) {
/* 175 */       if (blocksList[b] != null) {
/* 176 */         Item.c[b] = new be(b - 256);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected float bb;
/*     */   protected float bc;
/*     */   public double bd;
/*     */   public double be;
/* 186 */   public StepSound bj = soundPowderFootstep; public double bf; public double bg; public double bh;
/*     */   public double bi;
/* 188 */   public float bk = 1.0F;
/*     */   public final Material blockMaterial;
/* 190 */   public float bm = 0.6F;
/*     */   
/*     */   protected Block(int paramInt, Material paramhz) {
/* 193 */     if (blocksList[paramInt] != null) {
/* 194 */       throw new IllegalArgumentException("Slot " + paramInt + " is already occupied by " + blocksList[paramInt] + " when adding " + this);
/*     */     }
/* 196 */     this.blockMaterial = paramhz;
/* 197 */     blocksList[paramInt] = this;
/* 198 */     this.blockId = paramInt;
/* 199 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 200 */     opaqueCubeLookup[paramInt] = b();
/* 201 */     lightOpacity[paramInt] = b() ? 255 : 0;
/* 202 */     isBlockContainer[paramInt] = f();
/*     */   }
/*     */   
/*     */   protected Block(int paramInt1, int paramInt2, Material paramhz) {
/* 206 */     this(paramInt1, paramhz);
/* 207 */     this.aZ = paramInt2;
/*     */   }
/*     */   
/*     */   protected Block a(StepSound parambl) {
/* 211 */     this.bj = parambl;
/* 212 */     return this;
/*     */   }
/*     */   
/*     */   protected Block c(int paramInt) {
/* 216 */     lightOpacity[this.blockId] = paramInt;
/* 217 */     return this;
/*     */   }
/*     */   
/*     */   protected Block a(float paramFloat) {
/* 221 */     s[this.blockId] = (int)(15.0F * paramFloat);
/* 222 */     return this;
/*     */   }
/*     */   
/*     */   protected Block b(float paramFloat) {
/* 226 */     this.bc = paramFloat * 3.0F;
/* 227 */     return this;
/*     */   }
/*     */   
/*     */   private boolean f() {
/* 231 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 239 */     return 0;
/*     */   }
/*     */   
/*     */   protected Block c(float paramFloat) {
/* 243 */     this.bb = paramFloat;
/* 244 */     if (this.bc < paramFloat * 5.0F) this.bc = paramFloat * 5.0F; 
/* 245 */     return this;
/*     */   }
/*     */   
/*     */   protected void a(boolean paramBoolean) {
/* 249 */     tickOnLoad[this.blockId] = paramBoolean;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 253 */     this.bd = paramFloat1;
/* 254 */     this.be = paramFloat2;
/* 255 */     this.bf = paramFloat3;
/* 256 */     this.bg = paramFloat4;
/* 257 */     this.bh = paramFloat5;
/* 258 */     this.bi = paramFloat6;
/*     */   }
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
/*     */ 
/*     */   
/*     */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 276 */     if (paramInt4 == 0 && this.be > 0.0D) return true; 
/* 277 */     if (paramInt4 == 1 && this.bh < 1.0D) return true; 
/* 278 */     if (paramInt4 == 2 && this.bf > 0.0D) return true; 
/* 279 */     if (paramInt4 == 3 && this.bi < 1.0D) return true; 
/* 280 */     if (paramInt4 == 4 && this.bd > 0.0D) return true; 
/* 281 */     if (paramInt4 == 5 && this.bg < 1.0D) return true; 
/* 282 */     return !paramhb.d(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int paramInt) {
/* 294 */     return this.aZ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, AxisAlignedBB paramcy, ArrayList<AxisAlignedBB> paramArrayList) {
/* 302 */     AxisAlignedBB cy1 = d(paramdp, paramInt1, paramInt2, paramInt3);
/* 303 */     if (cy1 != null && paramcy.a(cy1)) paramArrayList.add(cy1); 
/*     */   }
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 307 */     return AxisAlignedBB.b(paramInt1 + this.bd, paramInt2 + this.be, paramInt3 + this.bf, paramInt1 + this.bg, paramInt2 + this.bh, paramInt3 + this.bi);
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 311 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/* 315 */     return onBlockAdded();
/*     */   }
/*     */   
/*     */   public boolean onBlockAdded() {
/* 319 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 338 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public int a(Random paramRandom) {
/* 348 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 352 */     return this.blockId;
/*     */   }
/*     */   
/*     */   public float a(EntityPlayer parameq) {
/* 356 */     if (this.bb < 0.0F) return 0.0F; 
/* 357 */     if (!parameq.b(this)) return 1.0F / this.bb / 100.0F; 
/* 358 */     return parameq.a(this) / this.bb / 30.0F;
/*     */   }
/*     */   
/*     */   public void a_(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 362 */     a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
/* 366 */     if (paramdp.singleplayerWorld)
/* 367 */       return;  int i = a(paramdp.k);
/* 368 */     for (int b = 0; b < i; b++) {
/* 369 */       if (paramdp.k.nextFloat() <= paramFloat) {
/* 370 */         int j = a(paramInt4, paramdp.k);
/* 371 */         if (j > 0) {
/* 372 */           float f = 0.7F;
/* 373 */           double d1 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 374 */           double d2 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 375 */           double d3 = (paramdp.k.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 376 */           EntityItem fa = new EntityItem(paramdp, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, new ItemStack(j));
/* 377 */           fa.delayBeforeCanPickup = 10;
/* 378 */           paramdp.a(fa);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } public float a(Entity paramdb) {
/* 383 */     return this.bc / 5.0F;
/*     */   }
/*     */   
/*     */   public fe a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Vec3D paramas1, Vec3D paramas2) {
/* 387 */     a(paramdp, paramInt1, paramInt2, paramInt3);
/* 388 */     paramas1 = paramas1.c(-paramInt1, -paramInt2, -paramInt3);
/* 389 */     paramas2 = paramas2.c(-paramInt1, -paramInt2, -paramInt3);
/*     */     
/* 391 */     Vec3D as1 = paramas1.a(paramas2, this.bd);
/* 392 */     Vec3D as2 = paramas1.a(paramas2, this.bg);
/*     */     
/* 394 */     Vec3D as3 = paramas1.b(paramas2, this.be);
/* 395 */     Vec3D as4 = paramas1.b(paramas2, this.bh);
/*     */     
/* 397 */     Vec3D as5 = paramas1.c(paramas2, this.bf);
/* 398 */     Vec3D as6 = paramas1.c(paramas2, this.bi);
/*     */     
/* 400 */     if (!a(as1)) as1 = null; 
/* 401 */     if (!a(as2)) as2 = null; 
/* 402 */     if (!b(as3)) as3 = null; 
/* 403 */     if (!b(as4)) as4 = null; 
/* 404 */     if (!c(as5)) as5 = null; 
/* 405 */     if (!c(as6)) as6 = null;
/*     */     
/* 407 */     Vec3D as7 = null;
/*     */     
/* 409 */     if (as1 != null && (as7 == null || paramas1.a(as1) < paramas1.a(as7))) as7 = as1; 
/* 410 */     if (as2 != null && (as7 == null || paramas1.a(as2) < paramas1.a(as7))) as7 = as2; 
/* 411 */     if (as3 != null && (as7 == null || paramas1.a(as3) < paramas1.a(as7))) as7 = as3; 
/* 412 */     if (as4 != null && (as7 == null || paramas1.a(as4) < paramas1.a(as7))) as7 = as4; 
/* 413 */     if (as5 != null && (as7 == null || paramas1.a(as5) < paramas1.a(as7))) as7 = as5; 
/* 414 */     if (as6 != null && (as7 == null || paramas1.a(as6) < paramas1.a(as7))) as7 = as6;
/*     */     
/* 416 */     if (as7 == null) return null;
/*     */     
/* 418 */     int b = -1;
/*     */     
/* 420 */     if (as7 == as1) b = 4; 
/* 421 */     if (as7 == as2) b = 5; 
/* 422 */     if (as7 == as3) b = 0; 
/* 423 */     if (as7 == as4) b = 1; 
/* 424 */     if (as7 == as5) b = 2; 
/* 425 */     if (as7 == as6) b = 3;
/*     */     
/* 427 */     return new fe(paramInt1, paramInt2, paramInt3, b, as7.c(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   private boolean a(Vec3D paramas) {
/* 431 */     if (paramas == null) return false; 
/* 432 */     return (paramas.b >= this.be && paramas.b <= this.bh && paramas.c >= this.bf && paramas.c <= this.bi);
/*     */   }
/*     */   
/*     */   private boolean b(Vec3D paramas) {
/* 436 */     if (paramas == null) return false; 
/* 437 */     return (paramas.a >= this.bd && paramas.a <= this.bg && paramas.c >= this.bf && paramas.c <= this.bi);
/*     */   }
/*     */   
/*     */   private boolean c(Vec3D paramas) {
/* 441 */     if (paramas == null) return false; 
/* 442 */     return (paramas.a >= this.bd && paramas.a <= this.bg && paramas.b >= this.be && paramas.b <= this.bh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(World paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 453 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 454 */     return (i == 0 || (blocksList[i]).blockMaterial.d());
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 458 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb, Vec3D paramas) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 492 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 496 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb) {}
/*     */   
/*     */   public boolean d(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 503 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean f(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 514 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\et.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */