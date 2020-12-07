/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockFurnace
/*     */   extends BlockContainer
/*     */ {
/*     */   private final boolean a;
/*     */   
/*     */   protected BlockFurnace(int paramInt, boolean paramBoolean) {
/*  14 */     super(paramInt, Material.d);
/*  15 */     this.a = paramBoolean;
/*  16 */     this.aZ = 45;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  20 */     return Block.aB.blockId;
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  24 */     super.onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/*  25 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  29 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3 - 1);
/*  30 */     int j = paramdp.getBlockId(paramInt1, paramInt2, paramInt3 + 1);
/*  31 */     int k = paramdp.getBlockId(paramInt1 - 1, paramInt2, paramInt3);
/*  32 */     int m = paramdp.getBlockId(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  34 */     int b = 3;
/*  35 */     if (Block.opaqueCubeLookup[i] && !Block.opaqueCubeLookup[j]) b = 3;
/*  36 */     if (Block.opaqueCubeLookup[j] && !Block.opaqueCubeLookup[i]) b = 2;
/*  37 */     if (Block.opaqueCubeLookup[k] && !Block.opaqueCubeLookup[m]) b = 5;
/*  38 */     if (Block.opaqueCubeLookup[m] && !Block.opaqueCubeLookup[k]) b = 4;
/*  39 */     paramdp.b(paramInt1, paramInt2, paramInt3, b);
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
/*     */   public int a(int paramInt) {
/*  80 */     if (paramInt == 1) return Block.stone.blockId;
/*  81 */     if (paramInt == 0) return Block.stone.blockId;
/*  82 */     if (paramInt == 3) return this.aZ - 1; 
/*  83 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/*  87 */     TileEntityFurnace cx = (TileEntityFurnace)paramdp.k(paramInt1, paramInt2, paramInt3);
/*  88 */     parameq.a(cx);
/*  89 */     return true;
/*     */   }
/*     */   
/*     */   public static void a(boolean paramBoolean, World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  94 */     TileEntity ap = paramdp.k(paramInt1, paramInt2, paramInt3);
/*     */     
/*  96 */     if (paramBoolean) { paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.aC.blockId); }
/*  97 */     else { paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, Block.aB.blockId); }
/*     */     
/*  99 */     paramdp.b(paramInt1, paramInt2, paramInt3, i);
/* 100 */     paramdp.a(paramInt1, paramInt2, paramInt3, ap);
/*     */   }
/*     */   
/*     */   protected TileEntity a_() {
/* 104 */     return new TileEntityFurnace();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */