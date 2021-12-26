/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet50PreChunk
/*    */   extends Packet {
/*    */   public int x;
/*    */   public int y;
/*    */   public boolean mode;
/*    */   
/*    */   public Packet50PreChunk() {}
/*    */   
/*    */   public Packet50PreChunk(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 13 */     this.j = true;
/* 14 */     this.x = paramInt1;
/* 15 */     this.y = paramInt2;
/* 16 */     this.mode = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 20 */     this.x = paramDataInputStream.readInt();
/* 21 */     this.y = paramDataInputStream.readInt();
/* 22 */     this.mode = (paramDataInputStream.read() != 0);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 26 */     paramDataOutputStream.writeInt(this.x);
/* 27 */     paramDataOutputStream.writeInt(this.y);
/* 28 */     paramDataOutputStream.write(this.mode ? 1 : 0);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
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