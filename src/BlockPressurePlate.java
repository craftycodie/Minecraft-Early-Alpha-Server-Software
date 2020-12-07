/*     */ import java.util.List;
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
/*     */ public class BlockPressurePlate
/*     */   extends Block
/*     */ {
/*     */   private ck a;
/*     */   
/*     */   protected BlockPressurePlate(int paramInt1, int paramInt2, ck paramck) {
/*  19 */     super(paramInt1, paramInt2, Material.d);
/*  20 */     this.a = paramck;
/*  21 */     a(true);
/*     */     
/*  23 */     float f = 0.0625F;
/*  24 */     a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  29 */     return 20;
/*     */   }
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  37 */     return false;
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
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  49 */     return paramdp.d(paramInt1, paramInt2 - 1, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  56 */     boolean bool = false;
/*     */     
/*  58 */     if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) bool = true;
/*     */     
/*  60 */     if (bool) {
/*  61 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/*  62 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  67 */     if (paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  71 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb) {
/*  75 */     if (paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 1) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  83 */     boolean bool1 = (paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 1) ? true : false;
/*  84 */     boolean bool2 = false;
/*     */     
/*  86 */     float f = 0.125F;
/*  87 */     List list = null;
/*  88 */     if (this.a == ck.a) list = paramdp.b((Entity)null, AxisAlignedBB.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f)));
/*  89 */     if (this.a == ck.b) list = paramdp.a(EntityLiving.class, AxisAlignedBB.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f)));
/*  90 */     if (this.a == ck.c) list = paramdp.a(EntityPlayer.class, AxisAlignedBB.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f)));
/*  91 */     if (list.size() > 0) {
/*  92 */       bool2 = true;
/*     */     }
/*     */     
/*  95 */     if (bool2 && !bool1) {
/*  96 */       paramdp.b(paramInt1, paramInt2, paramInt3, 1);
/*  97 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/*  98 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*  99 */       paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 101 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     } 
/* 103 */     if (!bool2 && bool1) {
/* 104 */       paramdp.b(paramInt1, paramInt2, paramInt3, 0);
/* 105 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 106 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/* 107 */       paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 109 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/*     */     } 
/*     */     
/* 112 */     if (bool2) {
/* 113 */       paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 118 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 119 */     if (i > 0) {
/* 120 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 121 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*     */     } 
/* 123 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 127 */     boolean bool = (paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 1) ? true : false;
/*     */     
/* 129 */     float f = 0.0625F;
/* 130 */     if (bool) {
/* 131 */       a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */     } else {
/* 133 */       a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 138 */     return (paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 143 */     if (paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) return false;
/* 144 */     return (paramInt4 == 1);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 148 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */