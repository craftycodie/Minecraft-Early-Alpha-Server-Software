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
/*     */ public class BlockChest
/*     */   extends BlockContainer
/*     */ {
/*  14 */   private Random a = new Random();
/*     */   
/*     */   protected BlockChest(int paramInt) {
/*  17 */     super(paramInt, Material.c);
/*  18 */     this.aZ = 26;
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
/*     */   public int a(int paramInt) {
/*  74 */     if (paramInt == 1) return this.aZ - 1; 
/*  75 */     if (paramInt == 0) return this.aZ - 1; 
/*  76 */     if (paramInt == 3) return this.aZ + 1; 
/*  77 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  81 */     int b1 = 0;
/*     */     
/*  83 */     if (paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3) == this.blockId) b1++;
/*  84 */     if (paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3) == this.blockId) b1++;
/*  85 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1) == this.blockId) b1++;
/*  86 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1) == this.blockId) b1++;
/*     */     
/*  88 */     if (b1 > 1) return false;
/*     */     
/*  90 */     if (g(paramdp, paramInt1 - 1, paramInt2, paramInt3)) return false; 
/*  91 */     if (g(paramdp, paramInt1 + 1, paramInt2, paramInt3)) return false; 
/*  92 */     if (g(paramdp, paramInt1, paramInt2, paramInt3 - 1)) return false; 
/*  93 */     if (g(paramdp, paramInt1, paramInt2, paramInt3 + 1)) return false; 
/*  94 */     return true;
/*     */   }
/*     */   
/*     */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  98 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != this.blockId) return false;
/*  99 */     if (paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3) == this.blockId) return true;
/* 100 */     if (paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3) == this.blockId) return true;
/* 101 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1) == this.blockId) return true;
/* 102 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1) == this.blockId) return true;
/* 103 */     return false;
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 107 */     TileEntityChest gn = (TileEntityChest)paramdp.k(paramInt1, paramInt2, paramInt3);
/* 108 */     for (int b1 = 0; b1 < gn.a(); b1++) {
/* 109 */       ItemStack gc = gn.a(b1);
/* 110 */       if (gc != null) {
/* 111 */         float f1 = this.a.nextFloat() * 0.8F + 0.1F;
/* 112 */         float f2 = this.a.nextFloat() * 0.8F + 0.1F;
/* 113 */         float f3 = this.a.nextFloat() * 0.8F + 0.1F;
/*     */         
/* 115 */         while (gc.stackSize > 0) {
/* 116 */           int i = this.a.nextInt(21) + 10;
/* 117 */           if (i > gc.stackSize) i = gc.stackSize;
/* 118 */           gc.stackSize -= i;
/*     */           
/* 120 */           EntityItem fa = new EntityItem(paramdp, (paramInt1 + f1), (paramInt2 + f2), (paramInt3 + f3), new ItemStack(gc.c, i, gc.d));
/* 121 */           float f = 0.05F;
/* 122 */           fa.motionX = ((float)this.a.nextGaussian() * f);
/* 123 */           fa.motionY = ((float)this.a.nextGaussian() * f + 0.2F);
/* 124 */           fa.motionZ = ((float)this.a.nextGaussian() * f);
/* 125 */           paramdp.a(fa);
/*     */         } 
/*     */       } 
/*     */     } 
/* 129 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/*     */     Object obj = (TileEntityChest)paramdp.k(paramInt1, paramInt2, paramInt3);
/*     */     
/* 135 */     if (paramdp.d(paramInt1, paramInt2 + 1, paramInt3)) return true;
/*     */     
/* 137 */     if (paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3) == this.blockId && paramdp.d(paramInt1 - 1, paramInt2 + 1, paramInt3)) return true;
/* 138 */     if (paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3) == this.blockId && paramdp.d(paramInt1 + 1, paramInt2 + 1, paramInt3)) return true;
/* 139 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1) == this.blockId && paramdp.d(paramInt1, paramInt2 + 1, paramInt3 - 1)) return true;
/* 140 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1) == this.blockId && paramdp.d(paramInt1, paramInt2 + 1, paramInt3 + 1)) return true;
/*     */     
/* 142 */     if (paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3) == this.blockId) obj = new InventoryLargeChest("Large chest", (TileEntityChest)paramdp.k(paramInt1 - 1, paramInt2, paramInt3), ((IInventory) (obj)));
/* 143 */     if (paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3) == this.blockId) obj = new InventoryLargeChest("Large chest", ((IInventory) (obj)), (TileEntityChest)paramdp.k(paramInt1 + 1, paramInt2, paramInt3));
/* 144 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1) == this.blockId) obj = new InventoryLargeChest("Large chest", (TileEntityChest)paramdp.k(paramInt1, paramInt2, paramInt3 - 1), ((IInventory) (obj)));
/* 145 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1) == this.blockId) obj = new InventoryLargeChest("Large chest", ((IInventory) (obj)), (TileEntityChest)paramdp.k(paramInt1, paramInt2, paramInt3 + 1));
/*     */     
/* 147 */     parameq.a((IInventory) obj);
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   protected TileEntity a_() {
/* 152 */     return new TileEntityChest();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\readPacket.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */