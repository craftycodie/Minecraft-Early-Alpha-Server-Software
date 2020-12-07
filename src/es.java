/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class es
/*    */   extends ha
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 25 */     this.a = paramDataInputStream.readShort();
/* 26 */     this.b = paramDataInputStream.readInt();
/* 27 */     this.c = paramDataInputStream.read();
/* 28 */     this.d = paramDataInputStream.readInt();
/* 29 */     this.e = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 33 */     paramDataOutputStream.writeShort(this.a);
/* 34 */     paramDataOutputStream.writeInt(this.b);
/* 35 */     paramDataOutputStream.write(this.c);
/* 36 */     paramDataOutputStream.writeInt(this.d);
/* 37 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 41 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 45 */     return 12;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\es.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */