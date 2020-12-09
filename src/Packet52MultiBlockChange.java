/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ 
/*    */ public class Packet52MultiBlockChange
/*    */   extends Packet
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public short[] c;
/*    */   public byte[] d;
/*    */   public byte[] e;
/*    */   public int f;
/*    */   
/*    */   public Packet52MultiBlockChange() {
/* 16 */     this.j = true;
/*    */   }
/*    */   
/*    */   public Packet52MultiBlockChange(int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, World paramdp) {
/* 20 */     this.j = true;
/* 21 */     this.a = paramInt1;
/* 22 */     this.b = paramInt2;
/* 23 */     this.f = paramInt3;
/* 24 */     this.c = new short[paramInt3];
/* 25 */     this.d = new byte[paramInt3];
/* 26 */     this.e = new byte[paramInt3];
/* 27 */     Chunk hv = paramdp.getChunkFromChunkCoords(paramInt1, paramInt2);
/* 28 */     for (int b = 0; b < paramInt3; b++) {
/* 29 */       int i = paramArrayOfshort[b] >> 12 & 0xF;
/* 30 */       int j = paramArrayOfshort[b] >> 8 & 0xF;
/* 31 */       int k = paramArrayOfshort[b] & 0xFF;
/*    */       
/* 33 */       this.c[b] = paramArrayOfshort[b];
/* 34 */       this.d[b] = (byte)hv.getBlockID(i, k, j);
/* 35 */       this.e[b] = (byte)hv.getBlockMetadata(i, k, j);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void readPacketData(DataInputStream paramDataInputStream) throws IOException {
/* 40 */     this.a = paramDataInputStream.readInt();
/* 41 */     this.b = paramDataInputStream.readInt();
/*    */
/* 43 */     this.f = paramDataInputStream.readShort() & 0xFFFF;
/* 44 */     this.c = new short[this.f];
/* 45 */     this.d = new byte[this.f];
/* 46 */     this.e = new byte[this.f];
/* 47 */     for (int b = 0; b < this.f; b++) {
/* 48 */       this.c[b] = paramDataInputStream.readShort();
/*    */     }
/* 50 */     paramDataInputStream.readFully(this.d);
/* 51 */     paramDataInputStream.readFully(this.e);
/*    */   }
/*    */   
/*    */   public void writePacketData(DataOutputStream paramDataOutputStream) throws IOException {
/* 55 */     paramDataOutputStream.writeInt(this.a);
/* 56 */     paramDataOutputStream.writeInt(this.b);
/* 57 */     paramDataOutputStream.writeShort((short)this.f);
/* 58 */     for (int b = 0; b < this.f; b++) {
/* 59 */       paramDataOutputStream.writeShort(this.c[b]);
/*    */     }
/* 61 */     paramDataOutputStream.write(this.d);
/* 62 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void processPacket(NetClientManager paramdy) {
/* 66 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 70 */     return 10 + this.f * 4;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */