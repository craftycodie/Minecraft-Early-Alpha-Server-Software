/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagInt
/*    */   extends NBTBase
/*    */ {
/*    */   public int a;
/*    */   
/*    */   public NBTTagInt() {}
/*    */   
/*    */   public NBTTagInt(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 16 */     paramDataOutput.writeInt(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     this.a = paramDataInput.readInt();
/*    */   }
/*    */   
/*    */   public byte getType() {
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