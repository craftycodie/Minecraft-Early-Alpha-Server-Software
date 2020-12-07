/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NbtTagByteArray
/*    */   extends NBTBase {
/*    */   public byte[] a;
/*    */   
/*    */   public NbtTagByteArray() {}
/*    */   
/*    */   public NbtTagByteArray(byte[] paramArrayOfbyte) {
/* 11 */     this.a = paramArrayOfbyte;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 15 */     paramDataOutput.writeInt(this.a.length);
/* 16 */     paramDataOutput.write(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     int i = paramDataInput.readInt();
/* 21 */     this.a = new byte[i];
/* 22 */     paramDataInput.readFully(this.a);
/*    */   }
/*    */   
/*    */   public byte getType() {
/* 26 */     return 7;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 30 */     return "[" + this.a.length + " bytes]";
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */