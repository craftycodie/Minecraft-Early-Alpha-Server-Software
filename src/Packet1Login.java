/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet1Login
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public String b;
/*    */   public String c;
/*    */   
/*    */   public Packet1Login() {}
/*    */   
/*    */   public Packet1Login(String paramString1, String paramString2, int paramInt) {
/* 14 */     this.b = paramString1;
/* 15 */     this.c = paramString2;
/* 16 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 20 */     this.a = paramDataInputStream.readInt();
/* 21 */     this.b = paramDataInputStream.readUTF();
/* 22 */     this.c = paramDataInputStream.readUTF();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 26 */     paramDataOutputStream.writeInt(this.a);
/* 27 */     paramDataOutputStream.writeUTF(this.b);
/* 28 */     paramDataOutputStream.writeUTF(this.c);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 32 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 36 */     return 4 + this.b.length() + this.c.length() + 4;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\onLivingUpdate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */