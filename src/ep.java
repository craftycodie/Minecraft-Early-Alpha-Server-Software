/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class ep
/*    */   extends ft
/*    */ {
/*    */   public short a;
/*    */   
/*    */   public ep() {}
/*    */   
/*    */   public ep(short paramShort) {
/* 12 */     this.a = paramShort;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeShort(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readShort();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 2;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */