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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockFire
/*     */   extends Block
/*     */ {
/*  21 */   private int[] chanceToEncourageFire = new int[256];
/*  22 */   private int[] abilityToCatchFire = new int[256];
/*     */   
/*     */   protected BlockFire(int paramInt1, int paramInt2) {
/*  25 */     super(paramInt1, paramInt2, Material.l);
/*     */     
/*  27 */     setBurnRate(Block.x.blockId, 5, 20);
/*  28 */     setBurnRate(Block.J.blockId, 5, 5);
/*  29 */     setBurnRate(Block.K.blockId, 30, 60);
/*  30 */     setBurnRate(Block.an.blockId, 30, 20);
/*  31 */     setBurnRate(Block.am.blockId, 15, 100);
/*  32 */     setBurnRate(Block.ab.blockId, 30, 60);
/*     */     
/*  34 */     a(true);
/*     */   }
/*     */   
/*     */   private void setBurnRate(int paramInt1, int paramInt2, int paramInt3) {
/*  38 */     this.chanceToEncourageFire[paramInt1] = paramInt2;
/*  39 */     this.abilityToCatchFire[paramInt1] = paramInt3;
/*     */   }
/*     */ 
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  44 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  60 */     return 3;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/*  64 */     return 0;
/*     */   }
/*     */   
/*     */   public int c() {
/*  68 */     return 10;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  72 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  73 */     if (i < 15) {
/*  74 */       paramdp.b(paramInt1, paramInt2, paramInt3, i + 1);
/*  75 */       paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */     } 
/*  77 */     if (!g(paramdp, paramInt1, paramInt2, paramInt3)) {
/*  78 */       if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3) || i > 3) paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       
/*     */       return;
/*     */     } 
/*  82 */     if (!canBlockCatchFire(paramdp, paramInt1, paramInt2 - 1, paramInt3) &&
/*  83 */       i == 15 && paramRandom.nextInt(4) == 0) {
/*  84 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  89 */     if (i % 2 == 0 && i > 2) {
/*  90 */       setBurnRate(paramdp, paramInt1 + 1, paramInt2, paramInt3, 300, paramRandom);
/*  91 */       setBurnRate(paramdp, paramInt1 - 1, paramInt2, paramInt3, 300, paramRandom);
/*  92 */       setBurnRate(paramdp, paramInt1, paramInt2 - 1, paramInt3, 200, paramRandom);
/*  93 */       setBurnRate(paramdp, paramInt1, paramInt2 + 1, paramInt3, 250, paramRandom);
/*  94 */       setBurnRate(paramdp, paramInt1, paramInt2, paramInt3 - 1, 300, paramRandom);
/*  95 */       setBurnRate(paramdp, paramInt1, paramInt2, paramInt3 + 1, 300, paramRandom);
/*     */       
/*  97 */       for (int j = paramInt1 - 1; j <= paramInt1 + 1; j++) {
/*  98 */         for (int k = paramInt3 - 1; k <= paramInt3 + 1; k++) {
/*  99 */           for (int m = paramInt2 - 1; m <= paramInt2 + 4; m++) {
/* 100 */             if (j != paramInt1 || m != paramInt2 || k != paramInt3) {
/*     */               
/* 102 */               int n = 100;
/* 103 */               if (m > paramInt2 + 1) {
/* 104 */                 n += (m - paramInt2 + 1) * 100;
/*     */               }
/*     */               
/* 107 */               int i1 = h(paramdp, j, m, k);
/* 108 */               if (i1 > 0 && paramRandom.nextInt(n) <= i1)
/* 109 */                 paramdp.setBlockWithNotify(j, m, k, this.blockId);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setBurnRate(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
/* 118 */     int i = this.abilityToCatchFire[paramdp.getBlockId(paramInt1, paramInt2, paramInt3)];
/* 119 */     if (paramRandom.nextInt(paramInt4) < i) {
/* 120 */       boolean bool = (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) == Block.am.blockId) ? true : false;
/* 121 */       if (paramRandom.nextInt(2) == 0) {
/* 122 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */       } else {
/* 124 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/* 126 */       if (bool) {
/* 127 */         Block.am.a(paramdp, paramInt1, paramInt2, paramInt3, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 133 */     if (canBlockCatchFire(paramdp, paramInt1 + 1, paramInt2, paramInt3)) return true;
/* 134 */     if (canBlockCatchFire(paramdp, paramInt1 - 1, paramInt2, paramInt3)) return true;
/* 135 */     if (canBlockCatchFire(paramdp, paramInt1, paramInt2 - 1, paramInt3)) return true;
/* 136 */     if (canBlockCatchFire(paramdp, paramInt1, paramInt2 + 1, paramInt3)) return true;
/* 137 */     if (canBlockCatchFire(paramdp, paramInt1, paramInt2, paramInt3 - 1)) return true;
/* 138 */     if (canBlockCatchFire(paramdp, paramInt1, paramInt2, paramInt3 + 1)) return true;
/*     */     
/* 140 */     return false;
/*     */   }
/*     */   
/*     */   private int h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 144 */     int i = 0;
/* 145 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != 0) return 0;
/*     */     
/* 147 */     i = f(paramdp, paramInt1 + 1, paramInt2, paramInt3, i);
/* 148 */     i = f(paramdp, paramInt1 - 1, paramInt2, paramInt3, i);
/* 149 */     i = f(paramdp, paramInt1, paramInt2 - 1, paramInt3, i);
/* 150 */     i = f(paramdp, paramInt1, paramInt2 + 1, paramInt3, i);
/* 151 */     i = f(paramdp, paramInt1, paramInt2, paramInt3 - 1, i);
/* 152 */     i = f(paramdp, paramInt1, paramInt2, paramInt3 + 1, i);
/*     */     
/* 154 */     return i;
/*     */   }
/*     */   
/*     */   public boolean onBlockAdded() {
/* 158 */     return false;
/*     */   }
/*     */   
/*     */   public boolean canBlockCatchFire(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 162 */     return (this.chanceToEncourageFire[paramhb.getBlockId(paramInt1, paramInt2, paramInt3)] > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int f(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 167 */     int i = this.chanceToEncourageFire[paramdp.getBlockId(paramInt1, paramInt2, paramInt3)];
/* 168 */     if (i > paramInt4) return i; 
/* 169 */     return paramInt4;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 174 */     return (paramdp.d(paramInt1, paramInt2 - 1, paramInt3) || g(paramdp, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 178 */     if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3) && !g(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 179 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 185 */     if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3) && !g(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 186 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       return;
/*     */     } 
/* 189 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */