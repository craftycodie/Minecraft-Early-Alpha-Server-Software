/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet23RelEntityMoveLook
/*    */   extends Packet20Entity
/*    */ {

/*    */   public Packet23RelEntityMoveLook(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) {
/* 12 */     super(paramInt);
/* 13 */     this.xPosition = paramByte1;
/* 14 */     this.yPosition = paramByte2;
/* 15 */     this.zPosition = paramByte3;
/* 16 */     this.yaw = paramByte4;
/* 17 */     this.pitch = paramByte5;
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 22 */     super.readPacketData(paramDataInputStream);
/* 23 */     this.xPosition = paramDataInputStream.readByte();
/* 24 */     this.yPosition = paramDataInputStream.readByte();
/* 25 */     this.zPosition = paramDataInputStream.readByte();
/* 26 */     this.yaw = paramDataInputStream.readByte();
/* 27 */     this.pitch = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 31 */     super.writePacketData(paramDataOutputStream);
/* 32 */     paramDataOutputStream.writeByte(this.xPosition);
/* 33 */     paramDataOutputStream.writeByte(this.yPosition);
/* 34 */     paramDataOutputStream.writeByte(this.zPosition);
/* 35 */     paramDataOutputStream.writeByte(this.yaw);
/* 36 */     paramDataOutputStream.writeByte(this.pitch);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 40 */     return 9;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */