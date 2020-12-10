/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
import java.io.IOException;

/*     */ public class Packet103Entity
/*     */   extends Packet
/*     */ {
/*     */   public int entityId;
/*     */   public byte xPosition;
/*     */   public byte yPosition;
/*     */   public byte zPosition;
/*     */   public byte yaw;
/*     */   public byte pitch;
/*     */
/*     */   public Packet103Entity() {}
/*     */
/*     */   public Packet103Entity(int paramInt) {
/* 111 */     this.entityId = paramInt;
/*     */   }
/*     */   
/*     */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 115 */     this.entityId = paramDataInputStream.readInt();
/*     */   }
/*     */   
/*     */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 119 */     paramDataOutputStream.writeInt(this.entityId);
/*     */   }
/*     */   
/*     */   public void processPacket(NetClientManager paramdy) {
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