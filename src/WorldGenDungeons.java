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
/*     */ public class WorldGenDungeons
/*     */   extends WorldGenerator
/*     */ {
/*     */   public boolean a(World world, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    /*  16 */     int b1 = 3;
    /*  17 */     int i = paramRandom.nextInt(2) + 2;
    /*  18 */     int j = paramRandom.nextInt(2) + 2;
    /*     */
    /*  20 */     int b2 = 0; int k;
    /*  21 */     for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
        /*  22 */       for (int m = paramInt2 - 1; m <= paramInt2 + b1 + 1; m++) {
            /*  23 */         for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
                /*  24 */           Material hz = world.getBlockMaterial(k, m, n);
                /*  25 */           if (m == paramInt2 - 1 && !hz.a()) return false;
                /*  26 */           if (m == paramInt2 + b1 + 1 && !hz.a()) return false;
                /*     */
                /*  28 */           if ((k == paramInt1 - i - 1 || k == paramInt1 + i + 1 || n == paramInt3 - j - 1 || n == paramInt3 + j + 1) &&
                        /*  29 */             m == paramInt2 && world.getBlockId(k, m, n) == 0 && world.getBlockId(k, m + 1, n) == 0) {
                    /*  30 */             b2++;
                    /*     */           }
                /*     */         }
            /*     */       }
        /*     */     }
    /*     */
    /*     */
    /*     */
    /*  38 */     if (b2 < 1 || b2 > 5) return false;
    /*     */
    /*  40 */     for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
        /*  41 */       for (int m = paramInt2 + b1; m >= paramInt2 - 1; m--) {
            /*  42 */         for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
                /*     */
                /*  44 */           if (k == paramInt1 - i - 1 || m == paramInt2 - 1 || n == paramInt3 - j - 1 || k == paramInt1 + i + 1 || m == paramInt2 + b1 + 1 || n == paramInt3 + j + 1) {
                    /*  45 */             if (m >= 0 && !world.getBlockMaterial(k, m - 1, n).a()) {
                        /*  46 */               world.setBlockWithNotify(k, m, n, 0);
                        /*  47 */             } else if (world.getBlockMaterial(k, m, n).a()) {
                        /*  48 */               if (m == paramInt2 - 1 && paramRandom.nextInt(4) != 0) {
                            /*  49 */                 world.setBlockWithNotify(k, m, n, Block.ao.blockId);
                            /*     */               } else {
                            /*  51 */                 world.setBlockWithNotify(k, m, n, Block.w.blockId);
                            /*     */               }
                        /*     */             }
                    /*     */           } else {
                    /*  55 */             world.setBlockWithNotify(k, m, n, 0);
                    /*     */           }
                /*     */         }
            /*     */       }
        /*     */     }
    /*     */
    /*  61 */     for (k = 0; k < 2; k++) {
        /*  62 */       for (int b = 0; b < 3; b++) {
            /*  63 */         int m = paramInt1 + paramRandom.nextInt(i * 2 + 1) - i;
            /*  64 */         int n = paramInt2;
            /*  65 */         int i1 = paramInt3 + paramRandom.nextInt(j * 2 + 1) - j;
            /*  66 */         if (world.getBlockId(m, n, i1) == 0) {
                /*     */
                /*  68 */           int b3 = 0;
                /*  69 */           if (world.getBlockMaterial(m - 1, n, i1).a()) b3++;
                /*  70 */           if (world.getBlockMaterial(m + 1, n, i1).a()) b3++;
                /*  71 */           if (world.getBlockMaterial(m, n, i1 - 1).a()) b3++;
                /*  72 */           if (world.getBlockMaterial(m, n, i1 + 1).a()) b3++;
                /*     */
                /*  74 */           if (b3 == 1) {
                    /*     */
                    /*  76 */             world.setBlockWithNotify(m, n, i1, Block.au.blockId);
                    /*  77 */             TileEntityChest gn = (TileEntityChest)world.k(m, n, i1);
                    /*  78 */             for (int b4 = 0; b4 < 8; b4++) {
                        /*  79 */               ItemStack gc = a(paramRandom);
                        /*  80 */               if (gc != null) gn.a(paramRandom.nextInt(gn.a()), gc);
                        /*     */
                        /*     */             }
                    /*     */             break;
                    /*     */           }
                /*     */         }
            /*     */       }
        /*     */     }
    /*  88 */     world.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.mobSpawner.blockId);
    /*  89 */     TileEntityMobSpawner tileEntityMobSpawner = (TileEntityMobSpawner)world.k(paramInt1, paramInt2, paramInt3);
    /*  90 */     tileEntityMobSpawner.f = b(paramRandom);
/*     */
/*     */
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   private ItemStack a(Random paramRandom) {
/*  97 */     int i = paramRandom.nextInt(11);
/*  98 */     if (i == 0) return new ItemStack(Item.ay);
/*  99 */     if (i == 1) return new ItemStack(Item.m, paramRandom.nextInt(4) + 1);
/* 100 */     if (i == 2) return new ItemStack(Item.S);
/* 101 */     if (i == 3) return new ItemStack(Item.R, paramRandom.nextInt(4) + 1);
/* 102 */     if (i == 4) return new ItemStack(Item.K, paramRandom.nextInt(4) + 1);
/* 103 */     if (i == 5) return new ItemStack(Item.I, paramRandom.nextInt(4) + 1);
/* 104 */     if (i == 6) return new ItemStack(Item.au);
/* 105 */     if (i == 7 && paramRandom.nextInt(100) == 0) return new ItemStack(Item.ar);
/* 106 */     if (i == 8 && paramRandom.nextInt(2) == 0) return new ItemStack(Item.aA, paramRandom.nextInt(4) + 1);
/*     */
/* 109 */     return null;
/*     */   }
/*     */   
/*     */   private String b(Random paramRandom) {
/* 113 */     int i = paramRandom.nextInt(4);
/* 114 */     if (i == 0) return "Skeleton"; 
/* 115 */     if (i == 1) return "Zombie"; 
/* 116 */     if (i == 2) return "Zombie"; 
/* 117 */     if (i == 3) return "Spider"; 
/* 118 */     return "";
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */