/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
import java.io.IOException;

/*     */
/*     */ public class Packet10Flying
/*     */   extends Packet
/*     */ {
/*     */   public double xPosition;
/*     */   public double yPosition;
/*     */   public double zPosition;
/*     */   public float yaw;
/*     */   public float pitch;
/*     */   public boolean onGround;
/*     */   public boolean moving;
/*     */   public boolean rotating;
/*     */   
/*     */   public void processPacket(NetClientManager paramdy) {
/* 126 */     paramdy.a(this);
/*     */   }
/*     */
/*    */   public Packet10Flying() {

    /*    */   }

/*    */   public Packet10Flying(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, boolean onGround) {
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

/*     */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 130 */     this.onGround = (paramDataInputStream.read() != 0);
/*     */   }
/*     */   
/*     */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 134 */     paramDataOutputStream.write(this.onGround ? 1 : 0);
/*     */   }
/*     */   
/*     */   public int getPacketSize() {
/* 138 */     return 1;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */