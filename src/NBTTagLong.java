/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagLong
/*    */   extends NBTBase
/*    */ {
/*    */   public long a;
/*    */   
/*    */   public NBTTagLong() {}
/*    */   
/*    */   public NBTTagLong(long paramLong) {
/* 12 */     this.a = paramLong;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 16 */     paramDataOutput.writeLong(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     this.a = paramDataInput.readLong();
/*    */   }
/*    */   
/*    */   public byte getType() {
/* 24 */     return 4;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\getHurtSound.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */