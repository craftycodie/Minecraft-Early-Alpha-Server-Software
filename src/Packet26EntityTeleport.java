/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */
/*    */ public class Packet26EntityTeleport
        /*    */   extends Packet
        /*    */ {
    /*    */   public int entityId;
    /*    */   public int xPosition;
    /*    */   public int yPosition;
    /*    */   public int zPosition;
    /*    */   public byte yaw;
    /*    */   public byte pitch;
    /*    */
    /*    */   public Packet26EntityTeleport() {}
    /*    */
    /*    */   public Packet26EntityTeleport(Entity paramdb) {
        /* 18 */     this.entityId = paramdb.entityId;
        /* 19 */     this.xPosition = MathHelper.floor_double(paramdb.posX * 32.0D);
        /* 20 */     this.yPosition = MathHelper.floor_double(paramdb.posY * 32.0D);
        /* 21 */     this.zPosition = MathHelper.floor_double(paramdb.posZ * 32.0D);
        /* 22 */     this.yaw = (byte)(int)(paramdb.rotationYaw * 256.0F / 360.0F);
        /* 23 */     this.pitch = (byte)(int)(paramdb.rotationPitch * 256.0F / 360.0F);
        /*    */   }
    /*    */
    /*    */   public Packet26EntityTeleport(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte1, byte paramByte2) {
        /* 27 */     this.entityId = paramInt1;
        /* 28 */     this.xPosition = paramInt2;
        /* 29 */     this.yPosition = paramInt3;
        /* 30 */     this.zPosition = paramInt4;
        /* 31 */     this.yaw = paramByte1;
        /* 32 */     this.pitch = paramByte2;

//            if(xPosition != 0 && yPosition != 0)
//                System.out.println("X " + xPosition + " y " + yPosition);
        /*    */   }
    /*    */
    /*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
        /* 36 */     this.entityId = paramDataInputStream.readInt();
        /* 37 */     this.xPosition = paramDataInputStream.readInt();
        /* 38 */     this.yPosition = paramDataInputStream.readInt();
        /* 39 */     this.zPosition = paramDataInputStream.readInt();
        /* 40 */     this.yaw = (byte)paramDataInputStream.read();
        /* 41 */     this.pitch = (byte)paramDataInputStream.read();
        /*    */   }
    /*    */
    /*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
        /* 45 */     paramDataOutputStream.writeInt(this.entityId);
        /* 46 */     paramDataOutputStream.writeInt(this.xPosition);
        /* 47 */     paramDataOutputStream.writeInt(this.yPosition);
        /* 48 */     paramDataOutputStream.writeInt(this.zPosition);
        /* 49 */     paramDataOutputStream.write(this.yaw);
        /* 50 */     paramDataOutputStream.write(this.pitch);
        /*    */   }
    /*    */
    /*    */   public void processPacket(NetClientManager paramdy) {
        /* 54 */     paramdy.a(this);
        /*    */   }
    /*    */
    /*    */   public int getPacketSize() {
        /* 58 */     return 34;
        /*    */   }
    /*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\by.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */