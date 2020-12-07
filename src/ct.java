/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class ct
/*    */   extends ha {
/*    */   public int a;
/*    */   public int b;
/*    */   public boolean c;
/*    */   
/*    */   public ct() {}
/*    */   
/*    */   public ct(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 13 */     this.j = true;
/* 14 */     this.a = paramInt1;
/* 15 */     this.b = paramInt2;
/* 16 */     this.c = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 20 */     this.a = paramDataInputStream.readInt();
/* 21 */     this.b = paramDataInputStream.readInt();
/* 22 */     this.c = (paramDataInputStream.read() != 0);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 26 */     paramDataOutputStream.writeInt(this.a);
/* 27 */     paramDataOutputStream.writeInt(this.b);
/* 28 */     paramDataOutputStream.write(this.c ? 1 : 0);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 32 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 36 */     return 9;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ct.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */