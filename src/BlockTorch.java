/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockTorch
/*     */   extends Block
/*     */ {
/*     */   protected BlockTorch(int paramInt1, int paramInt2) {
/*  11 */     super(paramInt1, paramInt2, Material.n);
/*  12 */     a(true);
/*     */   }
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  16 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  24 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  32 */     return 2;
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  36 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3))
/*  37 */       return true; 
/*  38 */     if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3))
/*  39 */       return true; 
/*  40 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1))
/*  41 */       return true; 
/*  42 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1))
/*  43 */       return true; 
/*  44 */     if (paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) {
/*  45 */       return true;
/*     */     }
/*  47 */     return false;
/*     */   }
/*     */   
/*     */   public void c(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  51 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*     */     
/*  53 */     if (paramInt4 == 1 && paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) i = 5; 
/*  54 */     if (paramInt4 == 2 && paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) i = 4; 
/*  55 */     if (paramInt4 == 3 && paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/*  56 */     if (paramInt4 == 4 && paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) i = 2; 
/*  57 */     if (paramInt4 == 5 && paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) i = 1;
/*     */     
/*  59 */     paramdp.b(paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  63 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramRandom);
/*  64 */     if (paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  68 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) {
/*  69 */       paramdp.b(paramInt1, paramInt2, paramInt3, 1);
/*  70 */     } else if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) {
/*  71 */       paramdp.b(paramInt1, paramInt2, paramInt3, 2);
/*  72 */     } else if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) {
/*  73 */       paramdp.b(paramInt1, paramInt2, paramInt3, 3);
/*  74 */     } else if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) {
/*  75 */       paramdp.b(paramInt1, paramInt2, paramInt3, 4);
/*  76 */     } else if (paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) {
/*  77 */       paramdp.b(paramInt1, paramInt2, paramInt3, 5);
/*     */     } 
/*  79 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  83 */     if (g(paramdp, paramInt1, paramInt2, paramInt3)) {
/*  84 */       int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  85 */       boolean bool = false;
/*     */       
/*  87 */       if (!paramdp.d(paramInt1 - 1, paramInt2, paramInt3) && i == 1) bool = true; 
/*  88 */       if (!paramdp.d(paramInt1 + 1, paramInt2, paramInt3) && i == 2) bool = true; 
/*  89 */       if (!paramdp.d(paramInt1, paramInt2, paramInt3 - 1) && i == 3) bool = true; 
/*  90 */       if (!paramdp.d(paramInt1, paramInt2, paramInt3 + 1) && i == 4) bool = true; 
/*  91 */       if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3) && i == 5) bool = true;
/*     */       
/*  93 */       if (bool) {
/*  94 */         a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/*  95 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 101 */     if (!a(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 102 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 103 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/* 104 */       return false;
/*     */     } 
/* 106 */     return true;
/*     */   }
/*     */   
/*     */   public fe a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Vec3D paramas1, Vec3D paramas2) {
/* 110 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) & 0x7;
/*     */     
/* 112 */     float f = 0.15F;
/* 113 */     if (i == 1) {
/* 114 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 115 */     } else if (i == 2) {
/* 116 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 117 */     } else if (i == 3) {
/* 118 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 119 */     } else if (i == 4) {
/* 120 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     } else {
/* 122 */       f = 0.1F;
/* 123 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */     } 
/*     */     
/* 126 */     return super.a(paramdp, paramInt1, paramInt2, paramInt3, paramas1, paramas2);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */