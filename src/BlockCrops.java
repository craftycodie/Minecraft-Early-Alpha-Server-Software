/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockCrops
/*     */   extends BlockFlower
/*     */ {
/*     */   protected BlockCrops(int paramInt1, int paramInt2) {
/*  11 */     super(paramInt1, paramInt2);
/*  12 */     this.aZ = paramInt2;
/*     */     
/*  14 */     a(true);
/*  15 */     float f = 0.5F;
/*  16 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*     */   }
/*     */   
/*     */   protected boolean b(int paramInt) {
/*  20 */     return (paramInt == Block.aA.blockId);
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  24 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramRandom);
/*  25 */     if (paramdp.h(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/*     */       
/*  27 */       int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  28 */       if (i < 7) {
/*  29 */         float f = h(paramdp, paramInt1, paramInt2, paramInt3);
/*     */         
/*  31 */         if (paramRandom.nextInt((int)(100.0F / f)) == 0) {
/*  32 */           i++;
/*  33 */           paramdp.b(paramInt1, paramInt2, paramInt3, i);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private float h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     float f = 1.0F;
/*     */     
/*  42 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1);
/*  43 */     int j = paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1);
/*  44 */     int k = paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3);
/*  45 */     int m = paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  47 */     int n = paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3 - 1);
/*  48 */     int i1 = paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3 - 1);
/*  49 */     int i2 = paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3 + 1);
/*  50 */     int i3 = paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3 + 1);
/*     */     
/*  52 */     boolean bool1 = (k == this.blockId || m == this.blockId) ? true : false;
/*  53 */     boolean bool2 = (i == this.blockId || j == this.blockId) ? true : false;
/*  54 */     boolean bool3 = (n == this.blockId || i1 == this.blockId || i2 == this.blockId || i3 == this.blockId) ? true : false;
/*     */     
/*  56 */     for (int i4 = paramInt1 - 1; i4 <= paramInt1 + 1; i4++) {
/*  57 */       for (int i5 = paramInt3 - 1; i5 <= paramInt3 + 1; i5++) {
/*  58 */         int i6 = paramdp.getBlockId(i4, paramInt2 - 1, i5);
/*     */         
/*  60 */         float f1 = 0.0F;
/*  61 */         if (i6 == Block.aA.blockId) {
/*  62 */           f1 = 1.0F;
/*  63 */           if (paramdp.getBlockMetadata(i4, paramInt2 - 1, i5) > 0) f1 = 3.0F;
/*     */         
/*     */         } 
/*  66 */         if (i4 != paramInt1 || i5 != paramInt3) f1 /= 4.0F;
/*     */         
/*  68 */         f += f1;
/*     */       } 
/*     */     } 
/*  71 */     if (bool3 || (bool1 && bool2)) f /= 2.0F;
/*     */     
/*  73 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  82 */     return 6;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  86 */     super.a(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/*  88 */     for (int b = 0; b < 3; b++) {
/*  89 */       if (paramdp.k.nextInt(15) <= paramInt4) {
/*  90 */         float f1 = 0.7F;
/*  91 */         float f2 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  92 */         float f3 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  93 */         float f4 = paramdp.k.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  94 */         EntityItem fa = new EntityItem(paramdp, (paramInt1 + f2), (paramInt2 + f3), (paramInt3 + f4), new ItemStack(Item.Q));
/*  95 */         fa.delayBeforeCanPickup = 10;
/*  96 */         paramdp.a(fa);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public int a(int paramInt, Random paramRandom) {
/* 101 */     System.out.println("Get resource: " + paramInt);
/* 102 */     if (paramInt == 7) {
/* 103 */       return Item.R.aQ;
/*     */     }
/*     */     
/* 106 */     return -1;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 110 */     return 1;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundClothFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */