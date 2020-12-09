/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */ public class Packet11PlayerPosition
/*    */   extends Packet10Flying
/*    */ {
    /*    */   public Packet11PlayerPosition() {
        /* 44 */     this.moving = true;
        /*    */   }

/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 64 */     this.xPosition = paramDataInputStream.readDouble();
/* 65 */     this.yPosition = paramDataInputStream.readDouble();
///* 66 */     this.removeObject = paramDataInputStream.readDouble();
/* 67 */     this.zPosition = paramDataInputStream.readDouble();
            this.moving = true;
/* 68 */     super.a(paramDataInputStream);
    /*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 72 */     paramDataOutputStream.writeDouble(this.xPosition);
/* 73 */     paramDataOutputStream.writeDouble(this.yPosition);
///* 74 */     paramDataOutputStream.writeDouble(this.removeObject);
/* 75 */     paramDataOutputStream.writeDouble(this.zPosition);
/* 76 */     super.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 80 */     return 33;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */