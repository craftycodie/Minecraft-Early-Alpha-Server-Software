/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockCactus
/*    */   extends Block
/*    */ {
/*    */   protected BlockCactus(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, paramInt2, Material.u);
/* 13 */     a(true);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 17 */     if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) == 0) {
/* 18 */       int b = 1;
/* 19 */       while (paramdp.getBlockId(paramInt1, paramInt2 - b, paramInt3) == this.blockId) {
/* 20 */         b++;
/*    */       }
/* 22 */       if (b < 3) {
/* 23 */         int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 24 */         if (i == 15) {
/* 25 */           paramdp.setBlockWithNotify(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/* 26 */           paramdp.b(paramInt1, paramInt2, paramInt3, 0);
/*    */         } else {
/* 28 */           paramdp.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 35 */     float f = 0.0625F;
/* 36 */     return AxisAlignedBB.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), ((paramInt2 + 1) - f), ((paramInt3 + 1) - f));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int paramInt) {
/* 45 */     if (paramInt == 1) return this.aZ - 1; 
/* 46 */     if (paramInt == 0) return this.aZ + 1; 
/* 47 */     return this.aZ;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 55 */     return false;
/*    */   }
/*    */   
/*    */   public int a() {
/* 59 */     return 13;
/*    */   }
/*    */   
/*    */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 63 */     if (!super.a(paramdp, paramInt1, paramInt2, paramInt3)) return false;
/*    */     
/* 65 */     return f(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 69 */     if (!f(paramdp, paramInt1, paramInt2, paramInt3)) {
/* 70 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/* 71 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean f(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 76 */     if (paramdp.getBlockMaterial(paramInt1 - 1, paramInt2, paramInt3).a()) return false;
/* 77 */     if (paramdp.getBlockMaterial(paramInt1 + 1, paramInt2, paramInt3).a()) return false;
/* 78 */     if (paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3 - 1).a()) return false;
/* 79 */     if (paramdp.getBlockMaterial(paramInt1, paramInt2, paramInt3 + 1).a()) return false;
/* 80 */     int i = paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3);
/* 81 */     return (i == Block.aV.blockId || i == Block.E.blockId);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Entity paramdb) {
/* 85 */     paramdb.attackEntityFrom((Entity)null, 1);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\aj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */