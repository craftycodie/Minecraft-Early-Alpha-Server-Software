/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hw
/*    */ {
/*    */   private World b;
/*    */   public EntityPlayer a;
/*    */   private float c;
/* 12 */   private float d = 0.0F;
/* 13 */   private int e = 0;
/* 14 */   private float f = 0.0F;
/*    */   private int g;
/*    */   
/*    */   public hw(World paramdp) {
/* 18 */     this.b = paramdp;
/*    */   }
/*    */   private int h; private int i;
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 22 */     int i = this.b.getBlockId(paramInt1, paramInt2, paramInt3);
/* 23 */     if (i > 0 && this.d == 0.0F) Block.blocksList[i].b(this.b, paramInt1, paramInt2, paramInt3, this.a);
/* 24 */     if (i > 0 && Block.blocksList[i].a(this.a) >= 1.0F) {
/* 25 */       c(paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a() {
/* 30 */     this.d = 0.0F;
/* 31 */     this.e = 0;
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 35 */     if (this.e > 0) {
/* 36 */       this.e--;
/*    */       return;
/*    */     } 
/* 39 */     if (paramInt1 == this.g && paramInt2 == this.h && paramInt3 == this.i) {
/* 40 */       int i = this.b.getBlockId(paramInt1, paramInt2, paramInt3);
/* 41 */       if (i == 0)
/* 42 */         return;  Block et = Block.blocksList[i];
/*    */       
/* 44 */       this.d += et.a(this.a);
/*    */       
/* 46 */       this.f++;
/*    */       
/* 48 */       if (this.d >= 1.0F) {
/* 49 */         c(paramInt1, paramInt2, paramInt3);
/* 50 */         this.d = 0.0F;
/* 51 */         this.c = 0.0F;
/* 52 */         this.f = 0.0F;
/* 53 */         this.e = 5;
/*    */       } 
/*    */     } else {
/* 56 */       this.d = 0.0F;
/* 57 */       this.c = 0.0F;
/* 58 */       this.f = 0.0F;
/* 59 */       this.g = paramInt1;
/* 60 */       this.h = paramInt2;
/* 61 */       this.i = paramInt3;
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt1, int paramInt2, int paramInt3) {
/* 66 */     Block et = Block.blocksList[this.b.getBlockId(paramInt1, paramInt2, paramInt3)];
/* 67 */     int i = this.b.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 68 */     boolean bool = this.b.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/* 69 */     if (et != null && bool) {
/* 70 */       et.a(this.b, paramInt1, paramInt2, paramInt3, i);
/*    */     }
/* 72 */     return bool;
/*    */   }
/*    */   
/*    */   public boolean c(int paramInt1, int paramInt2, int paramInt3) {
/* 76 */     int i = this.b.getBlockId(paramInt1, paramInt2, paramInt3);
/* 77 */     int j = this.b.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 78 */     boolean bool = b(paramInt1, paramInt2, paramInt3);
/*    */     
/* 80 */     ItemStack gc = this.a.A();
/* 81 */     if (gc != null) {
/* 82 */       gc.a(i, paramInt1, paramInt2, paramInt3);
/* 83 */       if (gc.a == 0) {
/* 84 */         gc.a(this.a);
/* 85 */         this.a.B();
/*    */       } 
/*    */     } 
/* 88 */     if (bool && this.a.b(Block.blocksList[i])) Block.blocksList[i].a_(this.b, paramInt1, paramInt2, paramInt3, j);
/* 89 */     return bool;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(EntityPlayer parameq, World paramdp, ItemStack paramgc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 97 */     return paramgc.a(parameq, paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */