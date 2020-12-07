/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet17UnknownItemStack
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   
///*    */   public Packet17UnknownItemStack() {}
/*    */   
/*    */   public Packet17UnknownItemStack(ItemStack paramgc, int paramInt) {
/* 14 */     this.a = paramgc.c;
/* 15 */     this.b = paramInt;
/* 16 */     this.c = paramgc.d;
/*    */     
///* 18 */     if (paramInt == 0) paramInt = 1;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 22 */     this.a = paramDataInputStream.readShort();
/* 23 */     this.b = paramDataInputStream.readByte();
/* 24 */     this.c = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 28 */     paramDataOutputStream.writeShort(this.a);
/* 29 */     paramDataOutputStream.writeByte(this.b);
/* 30 */     paramDataOutputStream.writeShort(this.c);
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


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */