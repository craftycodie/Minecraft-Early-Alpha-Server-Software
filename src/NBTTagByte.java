/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagByte
/*    */   extends NBTBase
/*    */ {
/*    */   public byte a;
/*    */   
/*    */   public NBTTagByte() {}
/*    */   
/*    */   public NBTTagByte(byte paramByte) {
/* 12 */     this.a = paramByte;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 16 */     paramDataOutput.writeByte(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     this.a = paramDataInput.readByte();
/*    */   }
/*    */   
/*    */   public byte getType() {
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