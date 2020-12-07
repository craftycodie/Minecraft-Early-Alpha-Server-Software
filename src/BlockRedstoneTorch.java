/*     */ import java.util.ArrayList;
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
/*     */ public class BlockRedstoneTorch
/*     */   extends BlockTorch
/*     */ {
/*     */   private boolean a = false;
/*  30 */   private static List b = new ArrayList();
/*     */   
/*     */   private boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  33 */     if (paramBoolean) b.add(new he(paramInt1, paramInt2, paramInt3, paramdp.b)); 
/*  34 */     int b1 = 0;
/*  35 */     for (int b2 = 0; b2 < b.size(); b2++) {
/*  36 */       he he = (he)b.get(b2);
/*     */       
/*  38 */       b1++;
/*  39 */       if (he.a == paramInt1 && he.b == paramInt2 && he.c == paramInt3 && b1 >= 8) {
/*  40 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   protected BlockRedstoneTorch(int paramInt1, int paramInt2, boolean paramBoolean) {
/*  48 */     super(paramInt1, paramInt2);
/*  49 */     this.a = paramBoolean;
/*  50 */     a(true);
/*     */   }
/*     */   
/*     */   public int c() {
/*  54 */     return 2;
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  58 */     if (paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) super.onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/*  59 */     if (this.a) {
/*  60 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*  61 */       paramdp.g(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/*  62 */       paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/*  63 */       paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/*  64 */       paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/*  65 */       paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  70 */     if (this.a) {
/*  71 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*  72 */       paramdp.g(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/*  73 */       paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/*  74 */       paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/*  75 */       paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/*  76 */       paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  81 */     if (!this.a) return false;
/*     */     
/*  83 */     int i = paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*     */     
/*  85 */     if (i == 5 && paramInt4 == 1) return false; 
/*  86 */     if (i == 3 && paramInt4 == 3) return false; 
/*  87 */     if (i == 4 && paramInt4 == 2) return false; 
/*  88 */     if (i == 1 && paramInt4 == 5) return false; 
/*  89 */     if (i == 2 && paramInt4 == 4) return false;
/*     */     
/*  91 */     return true;
/*     */   }
/*     */   
/*     */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  95 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*     */     
/*  97 */     if (i == 5 && paramdp.j(paramInt1, paramInt2 - 1, paramInt3, 0)) return true; 
/*  98 */     if (i == 3 && paramdp.j(paramInt1, paramInt2, paramInt3 - 1, 2)) return true; 
/*  99 */     if (i == 4 && paramdp.j(paramInt1, paramInt2, paramInt3 + 1, 3)) return true; 
/* 100 */     if (i == 1 && paramdp.j(paramInt1 - 1, paramInt2, paramInt3, 4)) return true; 
/* 101 */     if (i == 2 && paramdp.j(paramInt1 + 1, paramInt2, paramInt3, 5)) return true; 
/* 102 */     return false;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 106 */     boolean bool = g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */     
/* 108 */     while (b.size() > 0 && paramdp.b - ((he)b.get(0)).d > 100L) {
/* 109 */       b.remove(0);
/*     */     }
/*     */     
/* 112 */     if (this.a) {
/* 113 */       if (bool) {
/* 114 */         paramdp.b(paramInt1, paramInt2, paramInt3, Block.aP.blockId, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/*     */         
/* 116 */         if (a(paramdp, paramInt1, paramInt2, paramInt3, true)) {
/* 117 */           paramdp.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "random.fizz", 0.5F, 2.6F + (paramdp.k.nextFloat() - paramdp.k.nextFloat()) * 0.8F);
/* 118 */           for (int b = 0; b < 5; b++) {
/* 119 */             double d1 = paramInt1 + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 120 */             double d2 = paramInt2 + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 121 */             double d3 = paramInt3 + paramRandom.nextDouble() * 0.6D + 0.2D;
/*     */             
/* 123 */             paramdp.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */         
/*     */         } 
/*     */       } 
/* 128 */     } else if (!bool && 
/* 129 */       !a(paramdp, paramInt1, paramInt2, paramInt3, false)) {
/* 130 */       paramdp.b(paramInt1, paramInt2, paramInt3, Block.aQ.blockId, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/*     */     } 
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
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 146 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/* 147 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */   }
/*     */   
/*     */   public boolean d(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 151 */     if (paramInt4 == 0) {
/* 152 */       return b((IBlockAccess)paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/* 154 */     return false;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 158 */     return Block.aQ.blockId;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 162 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */