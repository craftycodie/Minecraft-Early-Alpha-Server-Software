/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class hx
/*    */   extends ha
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public hx() {}
/*    */   
/*    */   public hx(String paramString) {
/* 12 */     this.a = paramString;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 16 */     this.a = paramDataInputStream.readUTF();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 20 */     paramDataOutputStream.writeUTF(this.a);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 24 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 28 */     return this.a.length();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */