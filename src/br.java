/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class br
/*     */ {
/*     */   public void a(World paramdp, Entity paramdb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  13 */     paramdp.a(paramDouble1, paramDouble2, paramDouble3, "random.explode", 4.0F, (1.0F + (paramdp.k.nextFloat() - paramdp.k.nextFloat()) * 0.2F) * 0.7F);
/*     */     
/*  15 */     HashSet<ChunkPosition> hashSet = new HashSet();
/*     */     
/*  17 */     float f = paramFloat;
/*     */     
/*  19 */     int b1 = 16; int i;
/*  20 */     for (i = 0; i < b1; i++) {
/*  21 */       for (int b = 0; b < b1; b++) {
/*  22 */         for (int b3 = 0; b3 < b1; b3++) {
/*  23 */           if (i == 0 || i == b1 - 1 || b == 0 || b == b1 - 1 || b3 == 0 || b3 == b1 - 1) {
/*     */             
/*  25 */             double d1 = (i / (b1 - 1.0F) * 2.0F - 1.0F);
/*  26 */             double d2 = (b / (b1 - 1.0F) * 2.0F - 1.0F);
/*  27 */             double d3 = (b3 / (b1 - 1.0F) * 2.0F - 1.0F);
/*  28 */             double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */             
/*  30 */             d1 /= d4;
/*  31 */             d2 /= d4;
/*  32 */             d3 /= d4;
/*     */             
/*  34 */             float f1 = paramFloat * (0.7F + paramdp.k.nextFloat() * 0.6F);
/*  35 */             double d5 = paramDouble1;
/*  36 */             double d6 = paramDouble2;
/*  37 */             double d7 = paramDouble3;
/*     */             
/*  39 */             float f2 = 0.3F;
/*  40 */             while (f1 > 0.0F) {
/*  41 */               int i3 = MathHelper.floor_double(d5);
/*  42 */               int i4 = MathHelper.floor_double(d6);
/*  43 */               int i5 = MathHelper.floor_double(d7);
/*  44 */               int i6 = paramdp.getBlockId(i3, i4, i5);
/*  45 */               if (i6 > 0) {
/*  46 */                 f1 -= (Block.blocksList[i6].a(paramdb) + 0.3F) * f2;
/*     */               }
/*  48 */               if (f1 > 0.0F) {
/*  49 */                 hashSet.add(new ChunkPosition(i3, i4, i5));
/*     */               }
/*     */               
/*  52 */               d5 += d1 * f2;
/*  53 */               d6 += d2 * f2;
/*  54 */               d7 += d3 * f2;
/*  55 */               f1 -= f2 * 0.75F;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  62 */     paramFloat *= 2.0F;
/*  63 */     i = MathHelper.floor_double(paramDouble1 - paramFloat - 1.0D);
/*  64 */     int j = MathHelper.floor_double(paramDouble1 + paramFloat + 1.0D);
/*  65 */     int k = MathHelper.floor_double(paramDouble2 - paramFloat - 1.0D);
/*  66 */     int m = MathHelper.floor_double(paramDouble2 + paramFloat + 1.0D);
/*  67 */     int n = MathHelper.floor_double(paramDouble3 - paramFloat - 1.0D);
/*  68 */     int i1 = MathHelper.floor_double(paramDouble3 + paramFloat + 1.0D);
/*  69 */     List<Entity> list = paramdp.b(paramdb, AxisAlignedBB.b(i, k, n, j, m, i1));
/*  70 */     Vec3D as = Vec3D.b(paramDouble1, paramDouble2, paramDouble3);
/*  71 */     for (int b2 = 0; b2 < list.size(); b2++) {
/*  72 */       Entity db1 = list.get(b2);
/*  73 */       double d = db1.e(paramDouble1, paramDouble2, paramDouble3) / paramFloat;
/*  74 */       if (d <= 1.0D) {
/*  75 */         double d1 = db1.posX - paramDouble1;
/*  76 */         double d2 = db1.posY - paramDouble2;
/*  77 */         double d3 = db1.posZ - paramDouble3;
/*     */         
/*  79 */         double d4 = MathHelper.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */         
/*  81 */         d1 /= d4;
/*  82 */         d2 /= d4;
/*  83 */         d3 /= d4;
/*     */         
/*  85 */         double d5 = paramdp.a(as, db1.u);
/*  86 */         double d6 = (1.0D - d) * d5;
/*  87 */         db1.a(paramdb, (int)((d6 * d6 + d6) / 2.0D * 8.0D * paramFloat + 1.0D));
/*     */         
/*  89 */         double d7 = d6;
/*  90 */         db1.n += d1 * d7;
/*  91 */         db1.o += d2 * d7;
/*  92 */         db1.p += d3 * d7;
/*     */       } 
/*     */     } 
/*  95 */     paramFloat = f;
/*     */     
/*  97 */     ArrayList<ChunkPosition> arrayList = new ArrayList();
/*  98 */     arrayList.addAll(hashSet);
/*  99 */     for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
/* 100 */       ChunkPosition gf = arrayList.get(i2);
/* 101 */       int i3 = gf.a;
/* 102 */       int i4 = gf.b;
/* 103 */       int i5 = gf.c;
/*     */       
/* 105 */       int i6 = paramdp.getBlockId(i3, i4, i5);
/*     */       
/* 107 */       for (int b = 0; b < 1; b++) {
/* 108 */         double d1 = (i3 + paramdp.k.nextFloat());
/* 109 */         double d2 = (i4 + paramdp.k.nextFloat());
/* 110 */         double d3 = (i5 + paramdp.k.nextFloat());
/*     */         
/* 112 */         double d4 = d1 - paramDouble1;
/* 113 */         double d5 = d2 - paramDouble2;
/* 114 */         double d6 = d3 - paramDouble3;
/*     */         
/* 116 */         double d7 = MathHelper.a(d4 * d4 + d5 * d5 + d6 * d6);
/*     */         
/* 118 */         d4 /= d7;
/* 119 */         d5 /= d7;
/* 120 */         d6 /= d7;
/*     */         
/* 122 */         double d8 = 0.5D / (d7 / paramFloat + 0.1D);
/* 123 */         d8 *= (paramdp.k.nextFloat() * paramdp.k.nextFloat() + 0.3F);
/* 124 */         d4 *= d8;
/* 125 */         d5 *= d8;
/* 126 */         d6 *= d8;
/*     */         
/* 128 */         paramdp.a("explode", (d1 + paramDouble1 * 1.0D) / 2.0D, (d2 + paramDouble2 * 1.0D) / 2.0D, (d3 + paramDouble3 * 1.0D) / 2.0D, d4, d5, d6);
/* 129 */         paramdp.a("smoke", d1, d2, d3, d4, d5, d6);
/*     */       } 
/*     */       
/* 132 */       if (i6 > 0) {
/* 133 */         Block.blocksList[i6].a(paramdp, i3, i4, i5, paramdp.getBlockMetadata(i3, i4, i5), 0.3F);
/* 134 */         paramdp.setBlockWithNotify(i3, i4, i5, 0);
/* 135 */         Block.blocksList[i6].c(paramdp, i3, i4, i5);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\br.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */