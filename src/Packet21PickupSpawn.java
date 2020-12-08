/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ 
/*    */ public class Packet21PickupSpawn
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int xPosition;
/*    */   public int yPosition;
/*    */   public int zPosition;
/*    */   public byte e;
/*    */   public byte f;
/*    */   public byte g;
/*    */   public int h;
/*    */   public int i;
/*    */
/*    */   public Packet21PickupSpawn(EntityItem paramfa) {
/* 21 */     this.a = paramfa.entityId;
/* 22 */     this.h = paramfa.item.c;
/* 23 */     this.i = paramfa.item.itemID;
/* 24 */     this.xPosition = MathHelper.floor_double(paramfa.posX * 32.0D);
/* 25 */     this.yPosition = MathHelper.floor_double(paramfa.posY * 32.0D);
/* 26 */     this.zPosition = MathHelper.floor_double(paramfa.posZ * 32.0D);
/* 27 */     this.e = (byte)(paramfa.motionX * 128.0D);
/* 28 */     this.f = (byte)(paramfa.motionY * 128.0D);
/* 29 */     this.g = (byte)(paramfa.motionZ * 128.0D);
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 33 */     this.a = paramDataInputStream.readInt();
/* 34 */     this.h = paramDataInputStream.readShort();
/* 35 */     this.i = paramDataInputStream.readByte();
/* 36 */     this.xPosition = paramDataInputStream.readInt();
/* 37 */     this.yPosition = paramDataInputStream.readInt();
/* 38 */     this.zPosition = paramDataInputStream.readInt();
/* 39 */     this.e = paramDataInputStream.readByte();
/* 40 */     this.f = paramDataInputStream.readByte();
/* 41 */     this.g = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 45 */     paramDataOutputStream.writeInt(this.a);
/* 46 */     paramDataOutputStream.writeShort(this.h);
/* 47 */     paramDataOutputStream.writeByte(this.i);
/* 48 */     paramDataOutputStream.writeInt(this.xPosition);
/* 49 */     paramDataOutputStream.writeInt(this.yPosition);
/* 50 */     paramDataOutputStream.writeInt(this.zPosition);
/* 51 */     paramDataOutputStream.writeByte(this.e);
/* 52 */     paramDataOutputStream.writeByte(this.f);
/* 53 */     paramDataOutputStream.writeByte(this.g);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 57 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 61 */     return 22;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundMetalFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */