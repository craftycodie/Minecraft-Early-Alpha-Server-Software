/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class cm
/*    */   extends ha
/*    */ {
/*    */   public int a;
/*    */   
/*    */   public cm() {}
/*    */   
/*    */   public cm(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 16 */     this.a = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 20 */     paramDataOutputStream.writeInt(this.a);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 24 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 28 */     return 4;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */