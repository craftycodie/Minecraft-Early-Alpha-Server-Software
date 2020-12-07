/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockSand
/*    */   extends Block
/*    */ {
/*    */   public static boolean a = false;
/*    */   
/*    */   public BlockSand(int paramInt1, int paramInt2) {
/* 13 */     super(paramInt1, paramInt2, Material.m);
/*    */   }
/*    */   
/*    */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*    */   }
/*    */   
/*    */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*    */   }
/*    */   
/*    */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 25 */     h(paramdp, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   private void h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 29 */     int i = paramInt1;
/* 30 */     int j = paramInt2;
/* 31 */     int k = paramInt3;
/* 32 */     if (g(paramdp, i, j - 1, k) && j >= 0) {
/* 33 */       go go = new go(paramdp, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.blockId);
/* 34 */       if (a) {
/* 35 */         while (!go.A) {
/* 36 */           go.b_();
/*    */         }
/*    */       } else {
/* 39 */         paramdp.a(go);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public int c() {
/* 45 */     return 3;
/*    */   }
/*    */   
/*    */   public static boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 49 */     int i = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 50 */     if (i == 0) return true; 
/* 51 */     if (i == Block.ar.blockId) return true;
/* 52 */     Material hz = (Block.blocksList[i]).blockMaterial;
/* 53 */     if (hz == hz.f) return true; 
/* 54 */     if (hz == hz.g) return true; 
/* 55 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\em.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */