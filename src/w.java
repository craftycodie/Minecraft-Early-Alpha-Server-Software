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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class w
/*    */   extends fs
/*    */ {
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 64 */     this.a = paramDataInputStream.readDouble();
/* 65 */     this.b = paramDataInputStream.readDouble();
/* 66 */     this.d = paramDataInputStream.readDouble();
/* 67 */     this.c = paramDataInputStream.readDouble();
/* 68 */     super.a(paramDataInputStream);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 72 */     paramDataOutputStream.writeDouble(this.a);
/* 73 */     paramDataOutputStream.writeDouble(this.b);
/* 74 */     paramDataOutputStream.writeDouble(this.d);
/* 75 */     paramDataOutputStream.writeDouble(this.c);
/* 76 */     super.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public int a() {
/* 80 */     return 33;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */