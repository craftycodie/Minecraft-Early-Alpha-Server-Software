/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet33RelEntityMoveLook
/*    */   extends Packet30Entity
/*    */ {

/*    */   public Packet33RelEntityMoveLook(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) {
/* 12 */     super(paramInt);
/* 13 */     this.b = paramByte1;
/* 14 */     this.c = paramByte2;
/* 15 */     this.d = paramByte3;
/* 16 */     this.e = paramByte4;
/* 17 */     this.f = paramByte5;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 22 */     super.a(paramDataInputStream);
/* 23 */     this.b = paramDataInputStream.readByte();
/* 24 */     this.c = paramDataInputStream.readByte();
/* 25 */     this.d = paramDataInputStream.readByte();
/* 26 */     this.e = paramDataInputStream.readByte();
/* 27 */     this.f = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 31 */     super.a(paramDataOutputStream);
/* 32 */     paramDataOutputStream.writeByte(this.b);
/* 33 */     paramDataOutputStream.writeByte(this.c);
/* 34 */     paramDataOutputStream.writeByte(this.d);
/* 35 */     paramDataOutputStream.writeByte(this.e);
/* 36 */     paramDataOutputStream.writeByte(this.f);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 40 */     return 9;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */