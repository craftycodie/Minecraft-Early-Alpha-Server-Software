/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class BlockFluid
/*     */   extends Block
/*     */ {
/*  11 */   protected int d = 1;
/*     */   
/*     */   protected BlockFluid(int paramInt, Material paramhz) {
/*  14 */     super(paramInt, ((paramhz == Material.g) ? 14 : 12) * 16 + 13, paramhz);
/*  15 */     float f1 = 0.0F;
/*  16 */     float f2 = 0.0F;
/*     */     
/*  18 */     if (paramhz == Material.g) this.d = 2;
/*     */     
/*  20 */     a(0.0F + f2, 0.0F + f1, 0.0F + f2, 1.0F + f2, 1.0F + f1, 1.0F + f2);
/*  21 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static float b(int paramInt) {
/*  26 */     if (paramInt >= 8) paramInt = 0; 
/*  27 */     return (paramInt + 1) / 9.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int paramInt) {
/*  32 */     if (paramInt == 0 || paramInt == 1) {
/*  33 */       return this.aZ;
/*     */     }
/*  35 */     return this.aZ + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     if (paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3) != this.blockMaterial) return -1;
/*  41 */     return paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected int b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/*  45 */     if (paramhb.getBlockMaterial(paramInt1, paramInt2, paramInt3) != this.blockMaterial) return -1;
/*  46 */     int i = paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  47 */     if (i >= 8) i = 0; 
/*  48 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  56 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/*  60 */     return (paramBoolean && paramInt == 0);
/*     */   }
/*     */   
/*     */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  64 */     Material hz = paramhb.getBlockMaterial(paramInt1, paramInt2, paramInt3);
/*  65 */     if (hz == this.blockMaterial) return false;
/*  66 */     if (hz == hz.r) return false; 
/*  67 */     if (paramInt4 == 1) return true; 
/*  68 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  72 */     return null;
/*     */   }
/*     */   
/*     */   public int a() {
/*  76 */     return 4;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  80 */     return 0;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/*  84 */     return 0;
/*     */   }
/*     */   
/*     */   private Vec3D c(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/*  88 */     Vec3D as = Vec3D.b(0.0D, 0.0D, 0.0D);
/*  89 */     int i = b(paramhb, paramInt1, paramInt2, paramInt3); byte b;
/*  90 */     for (b = 0; b < 4; b++) {
/*     */       
/*  92 */       int j = paramInt1;
/*  93 */       int k = paramInt2;
/*  94 */       int m = paramInt3;
/*     */       
/*  96 */       if (b == 0) j--; 
/*  97 */       if (b == 1) m--; 
/*  98 */       if (b == 2) j++; 
/*  99 */       if (b == 3) m++;
/*     */       
/* 101 */       int n = b(paramhb, j, k, m);
/* 102 */       if (n < 0) {
/* 103 */         if (!paramhb.getBlockMaterial(j, k, m).c()) {
/* 104 */           n = b(paramhb, j, k - 1, m);
/* 105 */           if (n >= 0) {
/* 106 */             int i1 = n - i - 8;
/* 107 */             as = as.c(((j - paramInt1) * i1), ((k - paramInt2) * i1), ((m - paramInt3) * i1));
/*     */           }
/*     */         
/*     */         } 
/* 111 */       } else if (n >= 0) {
/* 112 */         int i1 = n - i;
/* 113 */         as = as.c(((j - paramInt1) * i1), ((k - paramInt2) * i1), ((m - paramInt3) * i1));
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 118 */     if (paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3) >= 8) {
/* 119 */       b = 0;
/* 120 */       if (b != 0 || a(paramhb, paramInt1, paramInt2, paramInt3 - 1, 2)) b = 1; 
/* 121 */       if (b != 0 || a(paramhb, paramInt1, paramInt2, paramInt3 + 1, 3)) b = 1; 
/* 122 */       if (b != 0 || a(paramhb, paramInt1 - 1, paramInt2, paramInt3, 4)) b = 1; 
/* 123 */       if (b != 0 || a(paramhb, paramInt1 + 1, paramInt2, paramInt3, 5)) b = 1; 
/* 124 */       if (b != 0 || a(paramhb, paramInt1, paramInt2 + 1, paramInt3 - 1, 2)) b = 1; 
/* 125 */       if (b != 0 || a(paramhb, paramInt1, paramInt2 + 1, paramInt3 + 1, 3)) b = 1; 
/* 126 */       if (b != 0 || a(paramhb, paramInt1 - 1, paramInt2 + 1, paramInt3, 4)) b = 1; 
/* 127 */       if (b != 0 || a(paramhb, paramInt1 + 1, paramInt2 + 1, paramInt3, 5)) b = 1; 
/* 128 */       if (b != 0) as = as.b().c(0.0D, -6.0D, 0.0D); 
/*     */     } 
/* 130 */     as = as.b();
/* 131 */     return as;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb, Vec3D paramas) {
/* 135 */     Vec3D as1 = c((IBlockAccess)paramdp, paramInt1, paramInt2, paramInt3);
/* 136 */     paramas.a += as1.a;
/* 137 */     paramas.b += as1.b;
/* 138 */     paramas.c += as1.c;
/*     */   }
/*     */   
/*     */   public int c() {
/* 142 */     if (this.blockMaterial == Material.f) return 5;
/* 143 */     if (this.blockMaterial == Material.g) return 30;
/* 144 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 154 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramRandom);
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
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 189 */     i(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 193 */     i(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void i(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 197 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != this.blockId)
/* 198 */       return;  if (this.blockMaterial == Material.g) {
/* 199 */       boolean bool = false;
/* 200 */       if (bool || paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3 - 1) == Material.f) bool = true;
/* 201 */       if (bool || paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3 + 1) == Material.f) bool = true;
/* 202 */       if (bool || paramdp.getBlockMaterial(paramInt1 - 1, paramInt2, paramInt3) == Material.f) bool = true;
/* 203 */       if (bool || paramdp.getBlockMaterial(paramInt1 + 1, paramInt2, paramInt3) == Material.f) bool = true;
/*     */       
/* 205 */       if (bool || paramdp.getBlockMaterial(paramInt1, paramInt2 + 1, paramInt3) == Material.f) bool = true;
/* 206 */       if (bool) {
/* 207 */         int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 208 */         if (i == 0) {
/* 209 */           paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.ap.blockId);
/* 210 */         } else if (i <= 4) {
/* 211 */           paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.w.blockId);
/*     */         } 
/* 213 */         h(paramdp, paramInt1, paramInt2, paramInt3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 219 */     paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "random.fizz", 0.5F, 2.6F + (paramdp.k.nextFloat() - paramdp.k.nextFloat()) * 0.8F);
/* 220 */     for (int b = 0; b < 8; b++)
/* 221 */       paramdp.a("largesmoke", paramInt1 + Math.random(), paramInt2 + 1.2D, paramInt3 + Math.random(), 0.0D, 0.0D, 0.0D); 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */