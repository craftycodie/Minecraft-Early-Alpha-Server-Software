/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ public class Packet13PlayerLookMove
/*    */   extends Packet10Flying
/*    */ {
/*    */   public Packet13PlayerLookMove() {
/*  8 */     this.rotating = true;
/*  9 */     this.moving = true;
/*    */   }
/*    */   
/*    */   public Packet13PlayerLookMove(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, boolean onGround) {
/* 13 */
    this.xPosition = paramDouble1;
/* 14 */     this.yPosition = paramDouble2;
/* 15 */     this.zPosition = paramDouble3;
/* 17 */     this.yaw = paramFloat1;
/* 18 */     this.pitch = paramFloat2;
/* 19 */     this.onGround = onGround;
/* 20 */     this.rotating = true;
/* 21 */     this.moving = true;
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 25 */     this.xPosition = paramDataInputStream.readDouble();
/* 26 */     this.yPosition = paramDataInputStream.readDouble();
/* 27 */     this.zPosition = paramDataInputStream.readDouble();
/* 29 */     this.yaw = paramDataInputStream.readFloat();
/* 30 */     this.pitch = paramDataInputStream.readFloat();
/* 31 */     super.readPacketData(paramDataInputStream);
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 35 */     paramDataOutputStream.writeDouble(this.xPosition);
/* 36 */     paramDataOutputStream.writeDouble(this.yPosition);
/* 37 */     paramDataOutputStream.writeDouble(this.zPosition);
/* 39 */     paramDataOutputStream.writeFloat(this.yaw);
/* 40 */     paramDataOutputStream.writeFloat(this.pitch);
/* 41 */     super.writePacketData(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 45 */     return 33;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */