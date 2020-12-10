/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.zip.DataFormatException;
/*    */ import java.util.zip.Deflater;
/*    */ import java.util.zip.Inflater;
/*    */ 
/*    */ public class Packet10MapChunk extends Packet {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   
/*    */   public Packet10MapChunk() {
/* 15 */     this.j = true;
/*    */   }
/*    */   public int e; public int f; public byte[] g; private int h;
/*    */   public Packet10MapChunk(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, World paramdp) {
/* 19 */     this.j = true;
/* 20 */     this.a = paramInt1;
/* 21 */     this.b = paramInt2;
/* 22 */     this.c = paramInt3;
/* 23 */     this.d = paramInt4;
/* 24 */     this.e = paramInt5;
/* 25 */     this.f = paramInt6;
/* 26 */     byte[] arrayOfByte = paramdp.c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */     
/* 28 */     Deflater deflater = new Deflater(1);
/*    */     try {
/* 30 */       deflater.setInput(arrayOfByte);
/* 31 */       deflater.finish();
/* 32 */       this.g = new byte[paramInt4 * paramInt5 * paramInt6 * 5 / 2];
/* 33 */       this.h = deflater.deflate(this.g);
/*    */     } finally {
/* 35 */       deflater.end();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 40 */     this.a = paramDataInputStream.readInt();
/* 41 */     this.b = paramDataInputStream.readShort();
/* 42 */     this.c = paramDataInputStream.readInt();
/* 43 */     this.d = paramDataInputStream.read() + 1;
/* 44 */     this.e = paramDataInputStream.read() + 1;
/* 45 */     this.f = paramDataInputStream.read() + 1;
/*    */     
/* 47 */     int i = paramDataInputStream.readInt();
/* 48 */     byte[] arrayOfByte = new byte[i];
/* 49 */     paramDataInputStream.readFully(arrayOfByte);
/*    */     
/* 51 */     this.g = new byte[this.d * this.e * this.f * 5 / 2];
/*    */     
/* 53 */     Inflater inflater = new Inflater();
/* 54 */     inflater.setInput(arrayOfByte);
/*    */     try {
/* 56 */       inflater.inflate(this.g);
/* 57 */     } catch (DataFormatException dataFormatException) {
/* 58 */       throw new IOException("Bad compressed data format");
/*    */     } finally {
/* 60 */       inflater.end();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 65 */     paramDataOutputStream.writeInt(this.a);
/* 66 */     paramDataOutputStream.writeShort(this.b);
/* 67 */     paramDataOutputStream.writeInt(this.c);
/* 68 */     paramDataOutputStream.write(this.d - 1);
/* 69 */     paramDataOutputStream.write(this.e - 1);
/* 70 */     paramDataOutputStream.write(this.f - 1);
/*    */     
/* 72 */     paramDataOutputStream.writeInt(this.h);
/* 73 */     paramDataOutputStream.write(this.g, 0, this.h);
/*    */   }
/*    */   
/*    */   public void processPacket(NetClientManager paramdy) {
/* 77 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 81 */     return 17 + this.h;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */