/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class c
/*    */   extends ha
/*    */ {
/*    */   public int a;
/*    */   public String b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   public byte f;
/*    */   public byte g;
/*    */   public int h;
/*    */   
/*    */   public c() {}
/*    */   
/*    */   public c(eq parameq) {
/* 21 */     this.a = parameq.c;
/* 22 */     this.b = parameq.ap;
/* 23 */     this.c = fw.b(parameq.k * 32.0D);
/* 24 */     this.d = fw.b(parameq.l * 32.0D);
/* 25 */     this.e = fw.b(parameq.m * 32.0D);
/* 26 */     this.f = (byte)(int)(parameq.q * 256.0F / 360.0F);
/* 27 */     this.g = (byte)(int)(parameq.r * 256.0F / 360.0F);
/*    */     
/* 29 */     gc gc = parameq.ai.b();
/* 30 */     this.h = (gc == null) ? 0 : gc.c;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 34 */     this.a = paramDataInputStream.readInt();
/* 35 */     this.b = paramDataInputStream.readUTF();
/* 36 */     this.c = paramDataInputStream.readInt();
/* 37 */     this.d = paramDataInputStream.readInt();
/* 38 */     this.e = paramDataInputStream.readInt();
/* 39 */     this.f = paramDataInputStream.readByte();
/* 40 */     this.g = paramDataInputStream.readByte();
/* 41 */     this.h = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 45 */     paramDataOutputStream.writeInt(this.a);
/* 46 */     paramDataOutputStream.writeUTF(this.b);
/* 47 */     paramDataOutputStream.writeInt(this.c);
/* 48 */     paramDataOutputStream.writeInt(this.d);
/* 49 */     paramDataOutputStream.writeInt(this.e);
/* 50 */     paramDataOutputStream.writeByte(this.f);
/* 51 */     paramDataOutputStream.writeByte(this.g);
/* 52 */     paramDataOutputStream.writeShort(this.h);
/*    */   }
/*    */   
/*    */   public void a(dy paramdy) {
/* 56 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 60 */     return 28;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */