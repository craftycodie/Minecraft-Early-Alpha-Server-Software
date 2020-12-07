/*    */ import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/*    */
/*    */
/*    */

/*    */
/*    */ public class CompressedStreamTools {
/*    */   public static NBTTagCompound a(InputStream paramInputStream) throws IOException {
/*  8 */     DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(paramInputStream));
/*    */     try {
/* 10 */       return unk_a(dataInputStream);
/*    */     } finally {
/* 12 */       dataInputStream.close();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(NBTTagCompound paramr, OutputStream paramOutputStream) throws IOException {
/* 17 */     DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(paramOutputStream));
/*    */     try {
/* 19 */       unk_a(paramr, dataOutputStream);
/*    */     } finally {
/* 21 */       dataOutputStream.close();
/*    */     } 
/*    */   }
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
/*    */   public static NBTTagCompound unk_a(DataInput paramDataInput) throws IOException {
/* 46 */     NBTBase ft = NBTBase.readTag(paramDataInput);
/* 47 */     if (ft instanceof NBTTagCompound) return (NBTTagCompound)ft;
/* 48 */     throw new IOException("Root tag must be writeTagContents named compound tag");
/*    */   }
/*    */   
/*    */   public static void unk_a(NBTTagCompound paramr, DataOutput paramDataOutput) throws IOException {
/* 52 */     NBTBase.writeTag(paramr, paramDataOutput);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\loadedChunks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */