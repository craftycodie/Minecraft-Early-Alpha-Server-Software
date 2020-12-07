/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class de extends ft {
/*  7 */   private List a = new ArrayList();
/*    */   private byte b;
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 11 */     if (this.a.size() > 0) { this.b = ((ft)this.a.get(0)).a(); }
/* 12 */     else { this.b = 1; }
/*    */     
/* 14 */     paramDataOutput.writeByte(this.b);
/* 15 */     paramDataOutput.writeInt(this.a.size());
/* 16 */     for (byte b = 0; b < this.a.size(); b++) {
/* 17 */       ((ft)this.a.get(b)).a(paramDataOutput);
/*    */     }
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 22 */     this.b = paramDataInput.readByte();
/* 23 */     int i = paramDataInput.readInt();
/*    */     
/* 25 */     this.a = new ArrayList();
/* 26 */     for (byte b = 0; b < i; b++) {
/* 27 */       ft ft1 = ft.a(this.b);
/* 28 */       ft1.a(paramDataInput);
/* 29 */       this.a.add(ft1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public byte a() {
/* 34 */     return 9;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 38 */     return "" + this.a.size() + " entries of type " + ft.b(this.b);
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
/*    */   public void a(ft paramft) {
/* 53 */     this.b = paramft.a();
/* 54 */     this.a.add(paramft);
/*    */   }
/*    */   
/*    */   public ft a(int paramInt) {
/* 58 */     return this.a.get(paramInt);
/*    */   }
/*    */   
/*    */   public int b() {
/* 62 */     return this.a.size();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\de.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */