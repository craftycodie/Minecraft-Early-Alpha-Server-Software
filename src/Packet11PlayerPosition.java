/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */ public class Packet11PlayerPosition
/*    */   extends Packet10Flying
/*    */ {
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 64 */     this.a = paramDataInputStream.readDouble();
/* 65 */     this.b = paramDataInputStream.readDouble();
///* 66 */     this.removeObject = paramDataInputStream.readDouble();
/* 67 */     this.c = paramDataInputStream.readDouble();
/* 68 */     super.a(paramDataInputStream);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 72 */     paramDataOutputStream.writeDouble(this.a);
/* 73 */     paramDataOutputStream.writeDouble(this.b);
///* 74 */     paramDataOutputStream.writeDouble(this.removeObject);
/* 75 */     paramDataOutputStream.writeDouble(this.c);
/* 76 */     super.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 80 */     return 33;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */