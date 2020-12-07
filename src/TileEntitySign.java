/*    */ 
/*    */ 
/*    */ public class TileEntitySign
/*    */   extends TileEntity
/*    */ {
/*  6 */   public String[] e = new String[] { "", "", "", "" };
/*  7 */   public int f = -1;
/*    */   
/*    */   public void b(NBTTagCompound paramr) {
/* 10 */     super.b(paramr);
/* 11 */     paramr.a("Text1", this.e[0]);
/* 12 */     paramr.a("Text2", this.e[1]);
/* 13 */     paramr.a("Text3", this.e[2]);
/* 14 */     paramr.a("Text4", this.e[3]);
/*    */   }
/*    */   
/*    */   public void a(NBTTagCompound paramr) {
/* 18 */     super.a(paramr);
/* 19 */     for (int b = 0; b < 4; b++) {
/* 20 */       this.e[b] = paramr.h("Text" + (b + 1));
/* 21 */       if (this.e[b].length() > 15) this.e[b] = this.e[b].substring(0, 15); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */