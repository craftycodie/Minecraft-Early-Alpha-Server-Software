/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet53BlockChange extends Packet {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public Packet53BlockChange() {
/* 12 */     this.j = true;
/*    */   }
/*    */   
/*    */   public Packet53BlockChange(int paramInt1, int paramInt2, int paramInt3, World paramdp) {
/* 16 */     this.j = true;
/* 17 */     this.a = paramInt1;
/* 18 */     this.b = paramInt2;
/* 19 */     this.c = paramInt3;
/* 20 */     this.d = paramdp.getBlockId(paramInt1, paramInt2, paramInt3);
/* 21 */     this.e = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 25 */     this.a = paramDataInputStream.readInt();
/* 26 */     this.b = paramDataInputStream.readByte();
/* 27 */     this.c = paramDataInputStream.readInt();
/* 28 */     this.d = paramDataInputStream.readByte();
/* 29 */     this.e = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 33 */     paramDataOutputStream.writeInt(this.a);
/* 34 */     paramDataOutputStream.writeByte(this.b);
/* 35 */     paramDataOutputStream.writeInt(this.c);
/* 36 */     paramDataOutputStream.writeByte(this.d);
/* 37 */     paramDataOutputStream.writeByte(this.e);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 41 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 45 */     return 11;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */