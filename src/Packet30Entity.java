/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
import java.io.IOException;

/*     */ public class Packet30Entity
/*     */   extends Packet
/*     */ {
/*     */   public int entityId;
/*     */   public byte xPosition;
/*     */   public byte yPosition;
/*     */   public byte zPosition;
/*     */   public byte yaw;
/*     */   public byte pitch;
/*     */
/*     */   public Packet30Entity() {}
/*     */
/*     */   public Packet30Entity(int paramInt) {
/* 111 */     this.entityId = paramInt;
/*     */   }
/*     */   
/*     */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 115 */     this.entityId = paramDataInputStream.readInt();
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 119 */     paramDataOutputStream.writeInt(this.entityId);
/*     */   }
/*     */   
/*     */   public void a(NetClientManager paramdy) {
/* 123 */     paramdy.a(this);
/*     */   }
/*     */   
/*     */   public int getPacketSize() {
/* 127 */     return 4;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\el.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */