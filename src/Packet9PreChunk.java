/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet9PreChunk
/*    */   extends Packet {
/*    */   public int a;
/*    */   public int b;
/*    */   public boolean c;
/*    */   
/*    */   public Packet9PreChunk() {}
/*    */   
/*    */   public Packet9PreChunk(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 13 */     this.j = true;
/* 14 */     this.a = paramInt1;
/* 15 */     this.b = paramInt2;
/* 16 */     this.c = paramBoolean;
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 20 */     this.a = paramDataInputStream.readInt();
/* 21 */     this.b = paramDataInputStream.readInt();
/* 22 */     this.c = (paramDataInputStream.read() != 0);
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 26 */     paramDataOutputStream.writeInt(this.a);
/* 27 */     paramDataOutputStream.writeInt(this.b);
/* 28 */     paramDataOutputStream.write(this.c ? 1 : 0);
/*    */   }
/*    */   
/*    */   public void processPacket(NetClientManager paramdy) {
/* 32 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 36 */     return 9;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ct.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */