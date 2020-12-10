/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */ public class Packet51Place
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */
/*    */   public Packet51Place() {}


    /*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 25 */     this.a = paramDataInputStream.read();
/* 26 */     this.b = paramDataInputStream.readInt();
/* 27 */     this.c = paramDataInputStream.read();
/* 28 */     this.d = paramDataInputStream.readInt();
/* 29 */     this.e = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 33 */     paramDataOutputStream.write(this.a);
/* 34 */     paramDataOutputStream.writeInt(this.b);
/* 35 */     paramDataOutputStream.write(this.c);
/* 36 */     paramDataOutputStream.writeInt(this.d);
/* 37 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void processPacket(NetClientManager paramdy) {
/* 41 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 45 */     return 11;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\es.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */