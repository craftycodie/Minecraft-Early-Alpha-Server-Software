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
/*    */ public class dd
/*    */   extends ha
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public dd() {}
/*    */   
/*    */   public dd(db paramdb, int paramInt) {
/* 23 */     this.a = paramdb.c;
/* 24 */     this.b = fw.b(paramdb.k * 32.0D);
/* 25 */     this.c = fw.b(paramdb.l * 32.0D);
/* 26 */     this.d = fw.b(paramdb.m * 32.0D);
/* 27 */     this.e = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 31 */     this.a = paramDataInputStream.readInt();
/* 32 */     this.e = paramDataInputStream.readByte();
/* 33 */     this.b = paramDataInputStream.readInt();
/* 34 */     this.c = paramDataInputStream.readInt();
/* 35 */     this.d = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 39 */     paramDataOutputStream.writeInt(this.a);
/* 40 */     paramDataOutputStream.writeByte(this.e);
/* 41 */     paramDataOutputStream.writeInt(this.b);
/* 42 */     paramDataOutputStream.writeInt(this.c);
/* 43 */     paramDataOutputStream.writeInt(this.d);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 47 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 51 */     return 17;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */