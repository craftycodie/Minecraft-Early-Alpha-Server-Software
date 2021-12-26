/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
import java.io.IOException;

/*    */
/*    */ 
/*    */ public class Packet52MultiBlockChange
/*    */   extends Packet
/*    */ {
/*    */   public int x;
/*    */   public int y;
/*    */   public short[] coordArray;
/*    */   public byte[] typeArray;
/*    */   public byte[] metaArray;
/*    */   public int arraySize;
/*    */   
/*    */   public Packet52MultiBlockChange() {
/* 16 */     this.j = true;
/*    */   }
/*    */   
/*    */   public Packet52MultiBlockChange(int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, World paramdp) {
/* 20 */     this.j = true;
/* 21 */     this.x = paramInt1;
/* 22 */     this.y = paramInt2;
/* 23 */     this.arraySize = paramInt3;
/* 24 */     this.coordArray = new short[paramInt3];
/* 25 */     this.typeArray = new byte[paramInt3];
/* 26 */     this.metaArray = new byte[paramInt3];
/* 27 */     Chunk hv = paramdp.getChunkFromChunkCoords(paramInt1, paramInt2);
/* 28 */     for (int b = 0; b < paramInt3; b++) {
/* 29 */       int i = paramArrayOfshort[b] >> 12 & 0xF;
/* 30 */       int j = paramArrayOfshort[b] >> 8 & 0xF;
/* 31 */       int k = paramArrayOfshort[b] & 0xFF;
/*    */       
/* 33 */       this.coordArray[b] = paramArrayOfshort[b];
/* 34 */       this.typeArray[b] = (byte)hv.getBlockID(i, k, j);
/* 35 */       this.metaArray[b] = (byte)hv.getBlockMetadata(i, k, j);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) throws IOException {
/* 40 */     this.x = paramDataInputStream.readInt();
/* 41 */     this.y = paramDataInputStream.readInt();
/*    */
/* 43 */     this.arraySize = paramDataInputStream.readShort() & 0xFFFF;
/* 44 */     this.coordArray = new short[this.arraySize];
/* 45 */     this.typeArray = new byte[this.arraySize];
/* 46 */     this.metaArray = new byte[this.arraySize];
/* 47 */     for (int b = 0; b < this.arraySize; b++) {
/* 48 */       this.coordArray[b] = paramDataInputStream.readShort();
/*    */     }
/* 50 */     paramDataInputStream.readFully(this.typeArray);
/* 51 */     paramDataInputStream.readFully(this.metaArray);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) throws IOException {
/* 55 */     paramDataOutputStream.writeInt(this.x);
/* 56 */     paramDataOutputStream.writeInt(this.y);
/* 57 */     paramDataOutputStream.writeShort((short)this.arraySize);
/* 58 */     for (int b = 0; b < this.arraySize; b++) {
/* 59 */       paramDataOutputStream.writeShort(this.coordArray[b]);
/*    */     }
/* 61 */     paramDataOutputStream.write(this.typeArray);
/* 62 */     paramDataOutputStream.write(this.metaArray);
/*    */   }
/*    */   
/*    */   public void a(NetClientManager paramdy) {
/* 66 */     paramdy.a(this);
/*    */   }
/*    */   
/*    */   public int getPacketSize() {
/* 70 */     return 10 + this.arraySize * 4;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */