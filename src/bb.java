/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class bb
/*    */   extends ft
/*    */ {
/*    */   public int a;
/*    */   
/*    */   public bb() {}
/*    */   
/*    */   public bb(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeInt(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readInt();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 3;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */