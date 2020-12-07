/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TileEntityChest
/*    */   extends TileEntity
/*    */   implements IInventory
/*    */ {
/*  9 */   private ItemStack[] e = new ItemStack[36];
/*    */   
/*    */   public int a() {
/* 12 */     return 27;
/*    */   }
/*    */   
/*    */   public ItemStack a(int paramInt) {
/* 16 */     return this.e[paramInt];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(int paramInt, ItemStack paramgc) {
/* 35 */     this.e[paramInt] = paramgc;
/* 36 */     if (paramgc != null && paramgc.a > c()) paramgc.a = c();
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(NBTTagCompound paramr) {
/* 45 */     super.a(paramr);
/* 46 */     NBTTagList de = paramr.k("Items");
/* 47 */     this.e = new ItemStack[a()];
/* 48 */     for (int b = 0; b < de.b(); b++) {
/* 49 */       NBTTagCompound r1 = (NBTTagCompound)de.a(b);
/* 50 */       int i = r1.b("Slot") & 0xFF;
/* 51 */       if (i >= 0 && i < this.e.length) this.e[i] = new ItemStack(r1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(NBTTagCompound paramr) {
/* 56 */     super.b(paramr);
/* 57 */     NBTTagList de = new NBTTagList();
/*    */     
/* 59 */     for (int b = 0; b < this.e.length; b++) {
/* 60 */       if (this.e[b] != null) {
/* 61 */         NBTTagCompound r1 = new NBTTagCompound();
/* 62 */         r1.a("Slot", (byte)b);
/* 63 */         this.e[b].a(r1);
/* 64 */         de.a(r1);
/*    */       } 
/*    */     } 
/* 67 */     paramr.a("Items", de);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int c() {
/* 74 */     return 64;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */