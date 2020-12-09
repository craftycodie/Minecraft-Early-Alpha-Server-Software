/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet25DestroyEntity
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   
/*    */   public Packet25DestroyEntity() {}
/*    */   
/*    */   public Packet25DestroyEntity(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 16 */     this.a = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 20 */     paramDataOutputStream.writeInt(this.a);
/*    */   }
/*    */   
/*    */   public void processPacket(NetClientManager paramdy) {
/* 24 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 28 */     return 4;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */