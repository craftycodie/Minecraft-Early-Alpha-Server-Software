/*    */ 
/*    */ 
/*    */ public class InventoryLargeChest
/*    */   implements IInventory
/*    */ {
/*    */   private String a;
/*    */   private IInventory b;
/*    */   private IInventory c;
/*    */   
/*    */   public InventoryLargeChest(String paramString, IInventory paramif1, IInventory paramif2) {
/* 11 */     this.a = paramString;
/* 12 */     this.b = paramif1;
/* 13 */     this.c = paramif2;
/*    */   }
/*    */   
/*    */   public int a() {
/* 17 */     return this.b.a() + this.c.a();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack a(int paramInt) {
/* 25 */     if (paramInt >= this.b.a()) return this.c.a(paramInt - this.b.a()); 
/* 26 */     return this.b.a(paramInt);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */