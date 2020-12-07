/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class fi
/*    */   extends ha {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public fi() {}
/*    */   
/*    */   public fi(int paramInt1, int paramInt2) {
/* 12 */     this.a = paramInt1;
/* 13 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 17 */     this.a = paramDataInputStream.readInt();
/* 18 */     this.b = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 22 */     paramDataOutputStream.writeInt(this.a);
/* 23 */     paramDataOutputStream.writeShort(this.b);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 27 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 31 */     return 6;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */