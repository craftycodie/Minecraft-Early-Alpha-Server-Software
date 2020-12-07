/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagString
/*    */   extends NBTBase
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public NBTTagString() {}
/*    */   
/*    */   public NBTTagString(String paramString) {
/* 12 */     this.a = paramString;
/* 13 */     if (paramString == null) throw new IllegalArgumentException("Empty string not allowed"); 
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 17 */     paramDataOutput.writeUTF(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 21 */     this.a = paramDataInput.readUTF();
/*    */   }
/*    */   
/*    */   public byte getType() {
/* 25 */     return 8;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 29 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */