/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet3Chat
/*    */   extends Packet
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public Packet3Chat() {}
/*    */   
/*    */   public Packet3Chat(String paramString) {
/* 12 */     this.a = paramString;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 16 */     this.a = paramDataInputStream.readUTF();
System.out.println(a);
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


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */