/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;


/*    */ public class Packet31RelEntityMove
/*    */   extends Packet30Entity
/*    */ {
/*    */
/*    */   public Packet31RelEntityMove(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3) {
/* 49 */     super(paramInt);
/* 50 */     this.xPosition = paramByte1;
/* 51 */     this.yPosition = paramByte2;
/* 52 */     this.zPosition = paramByte3;

            // TODO: Remove
//            if(xPosition != 0 && yPosition != 0)
//                System.out.println("X " + xPosition + " y " + yPosition);
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 56 */     super.a(paramDataInputStream);
/* 57 */     this.xPosition = paramDataInputStream.readByte();
/* 58 */     this.yPosition = paramDataInputStream.readByte();
/* 59 */     this.zPosition = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 63 */     super.a(paramDataOutputStream);
/* 64 */     paramDataOutputStream.writeByte(this.xPosition);
/* 65 */     paramDataOutputStream.writeByte(this.yPosition);
/* 66 */     paramDataOutputStream.writeByte(this.zPosition);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 70 */     return 7;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\di.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */