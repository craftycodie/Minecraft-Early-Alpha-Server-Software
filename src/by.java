/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ public class by
/*    */   extends ha
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public byte e;
/*    */   public byte f;
/*    */   
/*    */   public by() {}
/*    */   
/*    */   public by(db paramdb) {
/* 18 */     this.a = paramdb.c;
/* 19 */     this.b = fw.b(paramdb.k * 32.0D);
/* 20 */     this.c = fw.b(paramdb.l * 32.0D);
/* 21 */     this.d = fw.b(paramdb.m * 32.0D);
/* 22 */     this.e = (byte)(int)(paramdb.q * 256.0F / 360.0F);
/* 23 */     this.f = (byte)(int)(paramdb.r * 256.0F / 360.0F);
/*    */   }
/*    */   
/*    */   public by(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte1, byte paramByte2) {
/* 27 */     this.a = paramInt1;
/* 28 */     this.b = paramInt2;
/* 29 */     this.c = paramInt3;
/* 30 */     this.d = paramInt4;
/* 31 */     this.e = paramByte1;
/* 32 */     this.f = paramByte2;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 36 */     this.a = paramDataInputStream.readInt();
/* 37 */     this.b = paramDataInputStream.readInt();
/* 38 */     this.c = paramDataInputStream.readInt();
/* 39 */     this.d = paramDataInputStream.readInt();
/* 40 */     this.e = (byte)paramDataInputStream.read();
/* 41 */     this.f = (byte)paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 45 */     paramDataOutputStream.writeInt(this.a);
/* 46 */     paramDataOutputStream.writeInt(this.b);
/* 47 */     paramDataOutputStream.writeInt(this.c);
/* 48 */     paramDataOutputStream.writeInt(this.d);
/* 49 */     paramDataOutputStream.write(this.e);
/* 50 */     paramDataOutputStream.write(this.f);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 54 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 58 */     return 34;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\by.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */