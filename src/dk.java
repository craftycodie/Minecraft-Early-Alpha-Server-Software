/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class dk
/*    */   extends ft
/*    */ {
/*    */   public double a;
/*    */   
/*    */   public dk() {}
/*    */   
/*    */   public dk(double paramDouble) {
/* 12 */     this.a = paramDouble;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeDouble(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readDouble();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 6;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */