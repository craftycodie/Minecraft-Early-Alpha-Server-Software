/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */ public class Packet15Place
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */
/*    */   public Packet15Place() {}


    /*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 25 */     this.a = paramDataInputStream.readShort();
/* 26 */     this.b = paramDataInputStream.readInt();
/* 27 */     this.c = paramDataInputStream.read();
/* 28 */     this.d = paramDataInputStream.readInt();
/* 29 */     this.e = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 33 */     paramDataOutputStream.writeShort(this.a);
/* 34 */     paramDataOutputStream.writeInt(this.b);
/* 35 */     paramDataOutputStream.write(this.c);
/* 36 */     paramDataOutputStream.writeInt(this.d);
/* 37 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 41 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 45 */     return 12;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\es.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */