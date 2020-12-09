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
/*     */   public void a(NetClientManager paramdy) {
/* 126 */     paramdy.a(this);
/*     */   }
/*     */   
/*     */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 130 */     this.onGround = (paramDataInputStream.read() != 0);
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
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