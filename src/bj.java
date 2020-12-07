/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class bj
/*    */   extends ft
/*    */ {
/*    */   public byte a;
/*    */   
/*    */   public bj() {}
/*    */   
/*    */   public bj(byte paramByte) {
/* 12 */     this.a = paramByte;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeByte(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readByte();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 1;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */