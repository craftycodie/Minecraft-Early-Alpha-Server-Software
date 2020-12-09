/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ 
/*    */ public class Packet21PickupSpawn
/*    */   extends Packet
/*    */ {
/*    */   public int entityId;
/*    */   public int xPosition;
/*    */   public int yPosition;
/*    */   public int zPosition;
/*    */   public byte rotation;
/*    */   public byte pitch;
/*    */   public byte roll;
/*    */   public int itemID;
/*    */   public int count;
/*    */
/*    */   public Packet21PickupSpawn() {}

/*    */   public Packet21PickupSpawn(EntityItem entityitem) {
/* 21 */     this.entityId = entityitem.entityId;
/* 22 */     this.itemID = entityitem.item.c;
/* 23 */     this.count = entityitem.item.itemID;
/* 24 */     this.xPosition = MathHelper.floor_double(entityitem.posX * 32.0D);
/* 25 */     this.yPosition = MathHelper.floor_double(entityitem.posY * 32.0D);
/* 26 */     this.zPosition = MathHelper.floor_double(entityitem.posZ * 32.0D);
    rotation = (byte)(int)(entityitem.motionX * 128D);
    pitch = (byte)(int)(entityitem.motionY * 128D);
    roll = (byte)(int)(entityitem.motionZ * 128D);
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 33 */     this.entityId = paramDataInputStream.readInt();
/* 34 */     this.itemID = paramDataInputStream.readShort();
/* 35 */     this.count = paramDataInputStream.readByte();
/* 36 */     this.xPosition = paramDataInputStream.readInt();
/* 37 */     this.yPosition = paramDataInputStream.readInt();
/* 38 */     this.zPosition = paramDataInputStream.readInt();
/* 39 */     this.rotation = paramDataInputStream.readByte();
/* 40 */     this.pitch = paramDataInputStream.readByte();
/* 41 */     this.roll = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 45 */     paramDataOutputStream.writeInt(this.entityId);
/* 46 */     paramDataOutputStream.writeShort(this.itemID);
/* 47 */     paramDataOutputStream.writeByte(this.count);
/* 48 */     paramDataOutputStream.writeInt(this.xPosition);
/* 49 */     paramDataOutputStream.writeInt(this.yPosition);
/* 50 */     paramDataOutputStream.writeInt(this.zPosition);
/* 51 */     paramDataOutputStream.writeByte(this.rotation);
/* 52 */     paramDataOutputStream.writeByte(this.pitch);
/* 53 */     paramDataOutputStream.writeByte(this.roll);
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