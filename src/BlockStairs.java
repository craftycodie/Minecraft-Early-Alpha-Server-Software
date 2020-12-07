/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockStairs
/*     */   extends Block
/*     */ {
/*     */   private Block a;
/*     */   
/*     */   protected BlockStairs(int paramInt, Block paramet) {
/*  14 */     super(paramInt, paramet.aZ, paramet.blockMaterial);
/*  15 */     this.a = paramet;
/*  16 */     c(paramet.bb);
/*  17 */     b(paramet.bc / 3.0F);
/*  18 */     a(paramet.bj);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  22 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  30 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  35 */     return super.a(paramhb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, AxisAlignedBB paramcy, ArrayList paramArrayList) {
/*  39 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  40 */     if (i == 0) {
/*  41 */       a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
/*  42 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  43 */       a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  44 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  45 */     } else if (i == 1) {
/*  46 */       a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
/*  47 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  48 */       a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  49 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  50 */     } else if (i == 2) {
/*  51 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
/*  52 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  53 */       a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
/*  54 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  55 */     } else if (i == 3) {
/*  56 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
/*  57 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*  58 */       a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
/*  59 */       super.a(paramdp, paramInt1, paramInt2, paramInt3, paramcy, paramArrayList);
/*     */     } 
/*  61 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  65 */     if (paramdp.getBlockMaterial(paramInt1, paramInt2 + 1, paramInt3).a()) {
/*  66 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, this.a.blockId);
/*     */     } else {
/*  68 */       g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */       
/*  70 */       g(paramdp, paramInt1 + 1, paramInt2 - 1, paramInt3);
/*  71 */       g(paramdp, paramInt1 - 1, paramInt2 - 1, paramInt3);
/*  72 */       g(paramdp, paramInt1, paramInt2 - 1, paramInt3 - 1);
/*  73 */       g(paramdp, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*     */       
/*  75 */       g(paramdp, paramInt1 + 1, paramInt2 + 1, paramInt3);
/*  76 */       g(paramdp, paramInt1 - 1, paramInt2 + 1, paramInt3);
/*  77 */       g(paramdp, paramInt1, paramInt2 + 1, paramInt3 - 1);
/*  78 */       g(paramdp, paramInt1, paramInt2 + 1, paramInt3 + 1);
/*     */     } 
/*  80 */     this.a.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   private void g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  84 */     if (!i(paramdp, paramInt1, paramInt2, paramInt3))
/*  85 */       return;  int b = -1;
/*     */     
/*  87 */     if (i(paramdp, paramInt1 + 1, paramInt2 + 1, paramInt3)) b = 0; 
/*  88 */     if (i(paramdp, paramInt1 - 1, paramInt2 + 1, paramInt3)) b = 1; 
/*  89 */     if (i(paramdp, paramInt1, paramInt2 + 1, paramInt3 + 1)) b = 2; 
/*  90 */     if (i(paramdp, paramInt1, paramInt2 + 1, paramInt3 - 1)) b = 3;
/*     */     
/*  92 */     if (b < 0) {
/*  93 */       if (h(paramdp, paramInt1 + 1, paramInt2, paramInt3) && !h(paramdp, paramInt1 - 1, paramInt2, paramInt3)) b = 0; 
/*  94 */       if (h(paramdp, paramInt1 - 1, paramInt2, paramInt3) && !h(paramdp, paramInt1 + 1, paramInt2, paramInt3)) b = 1; 
/*  95 */       if (h(paramdp, paramInt1, paramInt2, paramInt3 + 1) && !h(paramdp, paramInt1, paramInt2, paramInt3 - 1)) b = 2; 
/*  96 */       if (h(paramdp, paramInt1, paramInt2, paramInt3 - 1) && !h(paramdp, paramInt1, paramInt2, paramInt3 + 1)) b = 3;
/*     */     
/*     */     } 
/*  99 */     if (b < 0) {
/* 100 */       if (i(paramdp, paramInt1 - 1, paramInt2 - 1, paramInt3)) b = 0; 
/* 101 */       if (i(paramdp, paramInt1 + 1, paramInt2 - 1, paramInt3)) b = 1; 
/* 102 */       if (i(paramdp, paramInt1, paramInt2 - 1, paramInt3 - 1)) b = 2; 
/* 103 */       if (i(paramdp, paramInt1, paramInt2 - 1, paramInt3 + 1)) b = 3;
/*     */     
/*     */     } 
/* 106 */     if (b >= 0) {
/* 107 */       paramdp.b(paramInt1, paramInt2, paramInt3, b);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 112 */     return paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3).a();
/*     */   }
/*     */   
/*     */   private boolean i(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 116 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 117 */     if (i == 0) return false; 
/* 118 */     return (Block.blocksList[i].a() == 10);
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
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 135 */     this.a.b(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 139 */     this.a.a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(Entity paramdb) {
/* 147 */     return this.a.a(paramdb);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 155 */     return this.a.a(paramInt, paramRandom);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 159 */     return this.a.a(paramRandom);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int paramInt) {
/* 167 */     return this.a.a(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 175 */     return this.a.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb, Vec3D paramas) {
/* 183 */     this.a.a(paramdp, paramInt1, paramInt2, paramInt3, paramdb, paramas);
/*     */   }
/*     */   
/*     */   public boolean onBlockAdded() {
/* 187 */     return this.a.onBlockAdded();
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/* 191 */     return this.a.a(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 195 */     return this.a.a(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 199 */     b(paramdp, paramInt1, paramInt2, paramInt3, 0);
/* 200 */     this.a.onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 204 */     this.a.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
/* 212 */     this.a.a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat);
/*     */   }
/*     */   
/*     */   public void a_(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 216 */     this.a.a_(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb) {
/* 220 */     this.a.b(paramdp, paramInt1, paramInt2, paramInt3, paramdb);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 224 */     this.a.a(paramdp, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 228 */     return this.a.a(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*     */   }
/*     */   
/*     */   public void c(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 232 */     this.a.c(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\df.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */