/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
import java.io.IOException;

/*    */
/*    */ public class NBTTagFloat
/*    */   extends NBTBase
/*    */ {
/*    */   public float a;
/*    */   
/*    */   public NBTTagFloat() {}
/*    */   
/*    */   public NBTTagFloat(float paramFloat) {
/* 12 */     this.a = paramFloat;
/*    */   }
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 16 */     paramDataOutput.writeFloat(this.a);
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 20 */     this.a = paramDataInput.readFloat();
/*    */   }
/*    */   
/*    */   public byte getType() {
/* 24 */     return 5;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundGlassFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */