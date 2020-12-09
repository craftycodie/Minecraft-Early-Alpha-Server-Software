/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
import java.io.IOException;

/*     */ public class Packet12PlayerLook
/*     */   extends Packet10Flying
/*     */ {
    /*    */   public Packet12PlayerLook() {
        /* 72 */     this.rotating = true;
        /*    */   }


    /*     */   public void a(DataInputStream paramDataInputStream) throws IOException {
/*  97 */     this.yaw = paramDataInputStream.readFloat();
/*  98 */     this.pitch = paramDataInputStream.readFloat();
                this.rotating = true;
/*  99 */     super.a(paramDataInputStream);
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 103 */     paramDataOutputStream.writeFloat(this.yaw);
/* 104 */     paramDataOutputStream.writeFloat(this.pitch);
/* 105 */     super.a(paramDataOutputStream);
/*     */   }
/*     */   
/*     */   public int getPacketSize() {
/* 109 */     return 9;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */