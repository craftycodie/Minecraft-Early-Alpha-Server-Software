/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet255KickDisconnect
/*    */   extends Packet
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public Packet255KickDisconnect() {}
/*    */   
/*    */   public Packet255KickDisconnect(String paramString) {
/* 12 */     this.a = paramString;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 16 */     this.a = paramDataInputStream.readUTF();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 20 */     paramDataOutputStream.writeUTF(this.a);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 24 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 28 */     return this.a.length();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */