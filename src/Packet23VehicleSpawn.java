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
/*    */ 
/*    */ public class Packet23VehicleSpawn
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public Packet23VehicleSpawn() {}
/*    */   
/*    */   public Packet23VehicleSpawn(Entity paramdb, int paramInt) {
/* 23 */     this.a = paramdb.entityId;
/* 24 */     this.b = MathHelper.floor_double(paramdb.posX * 32.0D);
/* 25 */     this.c = MathHelper.floor_double(paramdb.posY * 32.0D);
/* 26 */     this.d = MathHelper.floor_double(paramdb.posZ * 32.0D);
/* 27 */     this.e = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 31 */     this.a = paramDataInputStream.readInt();
/* 32 */     this.e = paramDataInputStream.readByte();
/* 33 */     this.b = paramDataInputStream.readInt();
/* 34 */     this.c = paramDataInputStream.readInt();
/* 35 */     this.d = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 39 */     paramDataOutputStream.writeInt(this.a);
/* 40 */     paramDataOutputStream.writeByte(this.e);
/* 41 */     paramDataOutputStream.writeInt(this.b);
/* 42 */     paramDataOutputStream.writeInt(this.c);
/* 43 */     paramDataOutputStream.writeInt(this.d);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 47 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 51 */     return 17;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */