/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagDouble
/*    */   extends NBTBase
/*    */ {
/*    */   public double a;
/*    */   
/*    */   public NBTTagDouble() {}
/*    */   
/*    */   public NBTTagDouble(double paramDouble) {
/* 12 */     this.a = paramDouble;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 16 */     paramDataOutput.writeDouble(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     this.a = paramDataInput.readDouble();
/*    */   }
/*    */   
/*    */   public byte getType() {
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