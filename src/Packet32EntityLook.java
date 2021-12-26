/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;
/*    */ public class Packet32EntityLook
/*    */   extends Packet30Entity
/*    */ {
/*    */   public Packet32EntityLook() {
///* 76 */     this.encodedRotationYaw = true;
/*    */   }
/*    */   
/*    */   public Packet32EntityLook(int paramInt, byte paramByte1, byte paramByte2) {
/* 80 */     super(paramInt);
/* 81 */     this.yaw = paramByte1;
/* 82 */     this.pitch = paramByte2;
///* 83 */     this.encodedRotationYaw = true;
/*    */   }
/*    */
public void a(DataInputStream dataInputStream) throws IOException {
    super.a(dataInputStream);
    this.xPosition = dataInputStream.readByte();
    this.yPosition = dataInputStream.readByte();
//    this.zPosition = dataInputStream.readByte();
}
/*    */
@Override
public void a(DataOutputStream dataOutputStream) throws IOException {
    super.a(dataOutputStream);
    dataOutputStream.writeByte(this.xPosition);
    dataOutputStream.writeByte(this.yPosition);
//    dataOutputStream.writeByte(this.zPosition);
}
/*    */   
/*    */   public int getPacketSize() {
/* 99 */     return 6;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */