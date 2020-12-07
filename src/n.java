/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class n
/*    */   extends ha
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public n() {}
/*    */   
/*    */   public n(db paramdb, int paramInt) {
/* 19 */     this.a = paramdb.c;
/* 20 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 24 */     this.a = paramDataInputStream.readInt();
/* 25 */     this.b = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 29 */     paramDataOutputStream.writeInt(this.a);
/* 30 */     paramDataOutputStream.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 34 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 38 */     return 5;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */