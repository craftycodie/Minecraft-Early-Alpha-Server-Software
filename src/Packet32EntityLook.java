/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;
/*    */ public class Packet32EntityLook
/*    */   extends Packet30Entity
/*    */ {
///*    */   public Packet32EntityLook() {
/////* 76 */     this.encodedRotationYaw = true;
///*    */   }
/*    */   
/*    */   public Packet32EntityLook(int paramInt, byte paramByte1, byte paramByte2) {
/* 80 */     super(paramInt);
/* 81 */     this.e = paramByte1;
/* 82 */     this.f = paramByte2;
///* 83 */     this.encodedRotationYaw = true;
/*    */   }
/*    */
public void a(DataInputStream dataInputStream) throws IOException {
    super.a(dataInputStream);
    this.b = dataInputStream.readByte();
    this.c = dataInputStream.readByte();
    this.d = dataInputStream.readByte();
}
/*    */
@Override
public void a(DataOutputStream dataOutputStream) throws IOException {
    super.a(dataOutputStream);
    dataOutputStream.writeByte(this.b);
    dataOutputStream.writeByte(this.c);
    dataOutputStream.writeByte(this.d);
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