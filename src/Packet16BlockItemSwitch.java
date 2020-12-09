/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet16BlockItemSwitch
/*    */   extends Packet {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public Packet16BlockItemSwitch() {}
/*    */   
/*    */   public Packet16BlockItemSwitch(int paramInt1, int paramInt2) {
/* 12 */     this.a = paramInt1;
/* 13 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 17 */     this.a = paramDataInputStream.readInt();
/* 18 */     this.b = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 22 */     paramDataOutputStream.writeInt(this.a);
/* 23 */     paramDataOutputStream.writeShort(this.b);
/*    */   }
/*    */   
/*    */   public void processPacket(NetClientManager paramdy) {
/* 27 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 31 */     return 6;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */