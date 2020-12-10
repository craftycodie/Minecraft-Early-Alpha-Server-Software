/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;
/*    */ public class Packet102EntityLook
/*    */   extends Packet103Entity
/*    */ {
///*    */   public Packet32EntityLook() {
/////* 76 */     this.encodedRotationYaw = true;
///*    */   }
/*    */   
/*    */   public Packet102EntityLook(int paramInt, byte paramByte1, byte paramByte2) {
/* 80 */     super(paramInt);
/* 81 */     this.yaw = paramByte1;
/* 82 */     this.pitch = paramByte2;
///* 83 */     this.encodedRotationYaw = true;
/*    */   }
/*    */
public void readPacketData(DataInputStream dataInputStream) throws IOException {
    super.readPacketData(dataInputStream);
    this.xPosition = dataInputStream.readByte();
    this.yPosition = dataInputStream.readByte();
    this.zPosition = dataInputStream.readByte();
}
/*    */
@Override
public void writePacketData(DataOutputStream dataOutputStream) throws IOException {
    super.writePacketData(dataOutputStream);
    dataOutputStream.writeByte(this.xPosition);
    dataOutputStream.writeByte(this.yPosition);
    dataOutputStream.writeByte(this.zPosition);
}
/*    */   
/*    */   public int getPacketSize() {
/* 99 */     return 7;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */