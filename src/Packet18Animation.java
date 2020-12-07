/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Packet18Animation
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public Packet18Animation() {}
/*    */   
/*    */   public Packet18Animation(Entity paramdb, int paramInt) {
/* 19 */     this.a = paramdb.c;
/* 20 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 24 */     this.a = paramDataInputStream.readInt();
/* 25 */     this.b = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 29 */     paramDataOutputStream.writeInt(this.a);
/* 30 */     paramDataOutputStream.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 34 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 38 */     return 5;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\blocksList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */