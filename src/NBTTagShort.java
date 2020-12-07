/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagShort
/*    */   extends NBTBase
/*    */ {
/*    */   public short a;
/*    */   
/*    */   public NBTTagShort() {}
/*    */   
/*    */   public NBTTagShort(short paramShort) {
/* 12 */     this.a = paramShort;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 16 */     paramDataOutput.writeShort(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     this.a = paramDataInput.readShort();
/*    */   }
/*    */   
/*    */   public byte getType() {
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