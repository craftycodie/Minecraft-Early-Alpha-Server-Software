/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.zip.DataFormatException;
/*    */ import java.util.zip.Deflater;
/*    */ import java.util.zip.Inflater;
/*    */ 
/*    */ public class Packet51MapChunk extends Packet {
/*    */   public int x;
/*    */   public int y;
/*    */   public int z;
/*    */   public int sizeX;
            private byte[] compressed;
/*    */   
/*    */   public Packet51MapChunk() {
/* 15 */     this.j = true;
/*    */   }
/*    */   public int sizeY; public int sizeZ; public byte[] data; private int length;
/*    */   public Packet51MapChunk(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, World paramdp) {
/* 19 */     this.j = true;
/* 20 */     this.x = paramInt1;
/* 21 */     this.y = paramInt2;
/* 22 */     this.z = paramInt3;
/* 23 */     this.sizeX = paramInt4;
/* 24 */     this.sizeY = paramInt5;
/* 25 */     this.sizeZ = paramInt6;
/* 26 */     byte[] arrayOfByte = paramdp.c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */     
/* 28 */     Deflater deflater = new Deflater(1);
/*    */     try {
/* 30 */       deflater.setInput(arrayOfByte);
/* 31 */       deflater.finish();
/* 32 */       this.data = new byte[paramInt4 * paramInt5 * paramInt6 * 5 / 2];
/* 33 */       this.length = deflater.deflate(this.data);
/*    */     } finally {
/* 35 */       deflater.end();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 40 */     this.x = paramDataInputStream.readInt();
/* 41 */     this.y = paramDataInputStream.readShort();
/* 42 */     this.z = paramDataInputStream.readInt();
/* 43 */     this.sizeX = paramDataInputStream.read() + 1;
/* 44 */     this.sizeY = paramDataInputStream.read() + 1;
/* 45 */     this.sizeZ = paramDataInputStream.read() + 1;
/*    */     
/* 47 */     int compressedSize = paramDataInputStream.readInt();
/* 48 */     byte[] compressedData = new byte[compressedSize];
/* 49 */     paramDataInputStream.readFully(compressedData);
                this.compressed = compressedData;
/*    */     
/* 51 */     this.data = new byte[this.sizeX * this.sizeY * this.sizeZ * 5 / 2];
/*    */     
/* 53 */     Inflater inflater = new Inflater();
/* 54 */     inflater.setInput(compressedData);
/*    */     try {
/* 56 */       inflater.inflate(this.data);
/* 57 */     } catch (DataFormatException dataFormatException) {
/* 58 */       throw new IOException("Bad compressed data format");
/*    */     } finally {
/* 60 */       inflater.end();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 65 */     paramDataOutputStream.writeInt(this.x);
/* 66 */     paramDataOutputStream.writeShort(this.y);
/* 67 */     paramDataOutputStream.writeInt(this.z);
/* 68 */     paramDataOutputStream.write(this.sizeX - 1);
/* 69 */     paramDataOutputStream.write(this.sizeY - 1);
/* 70 */     paramDataOutputStream.write(this.sizeZ - 1);
/*    */     
             if(this.compressed != null) {
                 /* 72 */     paramDataOutputStream.writeInt(this.compressed.length);

                 /* 73 */     paramDataOutputStream.write(this.compressed, 0, this.compressed.length);
             } else {
                 /* 72 */     paramDataOutputStream.writeInt(this.length);

/* 73 */     paramDataOutputStream.write(this.data, 0, this.length);
             }
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 77 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 81 */     return 17 + this.length;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */