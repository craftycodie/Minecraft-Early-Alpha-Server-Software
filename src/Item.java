/*     */ import java.util.Random;
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
/*     */ public class Item
/*     */ {
/*  14 */   protected static Random b = new Random();
/*     */   
/*  16 */   public static Item[] c = new Item[32000];
/*     */   
/*  18 */   public static Item d = (new ItemSpade(0, 2)).a(82);
/*  19 */   public static Item e = (new ItemPickaxe(1, 2)).a(98);
/*  20 */   public static Item f = (new ItemAxe(2, 2)).a(114);
/*  21 */   public static Item g = (new ItemFlintAndSteel(3)).a(5);
/*  22 */   public static Item h = (new ItemFood(4, 4)).a(10);
/*  23 */   public static Item i = (new ItemBow(5)).a(21);
/*  24 */   public static Item j = (new Item(6)).a(37);
/*  25 */   public static Item k = (new Item(7)).a(7);
/*  26 */   public static Item l = (new Item(8)).a(55);
/*  27 */   public static Item m = (new Item(9)).a(23);
/*  28 */   public static Item n = (new Item(10)).a(39);
/*  29 */   public static Item o = (new ItemSword(11, 2)).a(66);
/*     */   
/*  31 */   public static Item p = (new ItemSword(12, 0)).a(64);
/*  32 */   public static Item q = (new ItemSpade(13, 0)).a(80);
/*  33 */   public static Item r = (new ItemPickaxe(14, 0)).a(96);
/*  34 */   public static Item s = (new ItemAxe(15, 0)).a(112);
/*     */   
/*  36 */   public static Item t = (new ItemSword(16, 1)).a(65);
/*  37 */   public static Item u = (new ItemSpade(17, 1)).a(81);
/*  38 */   public static Item v = (new ItemPickaxe(18, 1)).a(97);
/*  39 */   public static Item w = (new ItemAxe(19, 1)).a(113);
/*     */   
/*  41 */   public static Item x = (new ItemSword(20, 3)).a(67);
/*  42 */   public static Item y = (new ItemSpade(21, 3)).a(83);
/*  43 */   public static Item z = (new ItemPickaxe(22, 3)).a(99);
/*  44 */   public static Item A = (new ItemAxe(23, 3)).a(115);
/*     */   
/*  46 */   public static Item B = (new Item(24)).a(53).c();
/*  47 */   public static Item C = (new Item(25)).a(71);
/*  48 */   public static Item D = (new ItemSoup(26, 10)).a(72);
/*     */   
/*  50 */   public static Item E = (new ItemSword(27, 0)).a(68);
/*  51 */   public static Item F = (new ItemSpade(28, 0)).a(84);
/*  52 */   public static Item G = (new ItemPickaxe(29, 0)).a(100);
/*  53 */   public static Item H = (new ItemAxe(30, 0)).a(116);
/*     */   
/*  55 */   public static Item I = (new Item(31)).a(8);
/*  56 */   public static Item J = (new Item(32)).a(24);
/*  57 */   public static Item K = (new Item(33)).a(40);
/*     */   
/*  59 */   public static Item L = (new ItemHoe(34, 0)).a(128);
/*  60 */   public static Item M = (new ItemHoe(35, 1)).a(129);
/*  61 */   public static Item N = (new ItemHoe(36, 2)).a(130);
/*  62 */   public static Item O = (new ItemHoe(37, 3)).a(131);
/*  63 */   public static Item P = (new ItemHoe(38, 4)).a(132);
/*     */   
/*  65 */   public static Item Q = (new ItemSeeds(39, Block.az.blockId)).a(9);
/*  66 */   public static Item R = (new Item(40)).a(25);
/*  67 */   public static Item S = (new ItemFood(41, 5)).a(41);
/*     */   
/*  69 */   public static Item T = (new ItemArmour(42, 0, 0, 0)).a(0);
/*  70 */   public static Item U = (new ItemArmour(43, 0, 0, 1)).a(16);
/*  71 */   public static Item V = (new ItemArmour(44, 0, 0, 2)).a(32);
/*  72 */   public static Item W = (new ItemArmour(45, 0, 0, 3)).a(48);
/*     */   
/*  74 */   public static Item X = (new ItemArmour(46, 1, 1, 0)).a(1);
/*  75 */   public static Item Y = (new ItemArmour(47, 1, 1, 1)).a(17);
/*  76 */   public static Item Z = (new ItemArmour(48, 1, 1, 2)).a(33);
/*  77 */   public static Item aa = (new ItemArmour(49, 1, 1, 3)).a(49);
/*     */   
/*  79 */   public static Item ab = (new ItemArmour(50, 2, 2, 0)).a(2);
/*  80 */   public static Item ac = (new ItemArmour(51, 2, 2, 1)).a(18);
/*  81 */   public static Item ad = (new ItemArmour(52, 2, 2, 2)).a(34);
/*  82 */   public static Item ae = (new ItemArmour(53, 2, 2, 3)).a(50);
/*     */   
/*  84 */   public static Item af = (new ItemArmour(54, 3, 3, 0)).a(3);
/*  85 */   public static Item ag = (new ItemArmour(55, 3, 3, 1)).a(19);
/*  86 */   public static Item ah = (new ItemArmour(56, 3, 3, 2)).a(35);
/*  87 */   public static Item ai = (new ItemArmour(57, 3, 3, 3)).a(51);
/*     */   
/*  89 */   public static Item aj = (new ItemArmour(58, 1, 4, 0)).a(4);
/*  90 */   public static Item ak = (new ItemArmour(59, 1, 4, 1)).a(20);
/*  91 */   public static Item al = (new ItemArmour(60, 1, 4, 2)).a(36);
/*  92 */   public static Item am = (new ItemArmour(61, 1, 4, 3)).a(52);
/*     */   
/*  94 */   public static Item an = (new Item(62)).a(6);
/*  95 */   public static Item ao = (new ItemFood(63, 3)).a(87);
/*  96 */   public static Item ap = (new ItemFood(64, 8)).a(88);
/*  97 */   public static Item aq = (new ItemPainting(65)).a(26);
/*     */   
/*  99 */   public static Item ar = (new ItemFood(66, 42)).a(11);
/*     */   
/* 101 */   public static Item as = (new ItemSign(67)).a(42);
/* 102 */   public static Item at = (new ItemDoor(68, Material.c)).a(43);
/*     */   
/* 104 */   public static Item au = (new ItemBucket(69, 0)).a(74);
/* 105 */   public static Item av = (new ItemBucket(70, Block.A.blockId)).a(75);
/* 106 */   public static Item aw = (new ItemBucket(71, Block.C.blockId)).a(76);
/*     */   
/* 108 */   public static Item ax = (new ItemMinecart(72, 0)).a(135);
/* 109 */   public static Item ay = (new ItemSaddle(73)).a(104);
/* 110 */   public static Item az = (new ItemDoor(74, Material.e)).a(44);
/* 111 */   public static Item aA = (new ItemRedstone(75)).a(56);
/* 112 */   public static Item aB = (new ItemSnowball(76)).a(14);
/*     */   
/* 114 */   public static Item aC = (new ItemBoat(77)).a(136);
/*     */   
/* 116 */   public static Item aD = (new Item(78)).a(103);
/* 117 */   public static Item aE = (new Item(79)).a(77);
/* 118 */   public static Item aF = (new Item(80)).a(22);
/* 119 */   public static Item aG = (new Item(81)).a(57);
/* 120 */   public static Item aH = (new ItemReed(82, Block.aX)).a(27);
/* 121 */   public static Item aI = (new Item(83)).a(58);
/* 122 */   public static Item aJ = (new Item(84)).a(59);
/*     */
/* 124 */   public static Item aK = (new Item(85)).a(30);

/* 126 */   public static Item aL = (new ItemMinecart(86, 1)).a(151);
/* 127 */   public static Item aM = (new ItemMinecart(87, 2)).a(167);
/*     */
/* 129 */   public static Item aN = (new Item(88)).a(12);
/*     */
/*     */
/* 132 */   public static Item aO = (new ItemRecord(2000, "13")).a(240);
/* 133 */   public static Item aP = (new ItemRecord(2001, "cat")).a(241);
/*     */
/*     */   
/*     */   public final int aQ;
/*     */   
/* 137 */   protected int maxStackSize = 64;
/* 138 */   protected int aS = 32;
/*     */   
/*     */   protected int aT;
/*     */   protected boolean aU = false;
/*     */   
/*     */   protected Item(int paramInt) {
/* 144 */     this.aQ = 256 + paramInt;
/* 145 */     if (c[256 + paramInt] != null) {
/* 146 */       System.out.println("CONFLICT @ " + paramInt);
/*     */     }
/*     */     
/* 149 */     c[256 + paramInt] = this;
/*     */   }
/*     */   
/*     */   public Item a(int paramInt) {
/* 153 */     this.aT = paramInt;
/* 154 */     return this;
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
/*     */   public boolean a(ItemStack paramgc, EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   public float a(ItemStack paramgc, Block paramet) {
/* 170 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 178 */     return this.maxStackSize;
/*     */   }
/*     */   
/*     */   public int b() {
/* 182 */     return this.aS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ItemStack paramgc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(Block paramet) {
/* 196 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Item c() {
/* 203 */     this.aU = true;
/* 204 */     return this;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\en.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */