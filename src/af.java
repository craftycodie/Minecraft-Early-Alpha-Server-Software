/*    */ import java.io.DataInput;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class af {
/*    */   public static r a(InputStream paramInputStream) {
/*  8 */     DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(paramInputStream));
/*    */     try {
/* 10 */       return a(dataInputStream);
/*    */     } finally {
/* 12 */       dataInputStream.close();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(r paramr, OutputStream paramOutputStream) {
/* 17 */     DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(paramOutputStream));
/*    */     try {
/* 19 */       a(paramr, dataOutputStream);
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
/*    */   public static r a(DataInput paramDataInput) {
/* 46 */     ft ft = ft.b(paramDataInput);
/* 47 */     if (ft instanceof r) return (r)ft; 
/* 48 */     throw new IOException("Root tag must be a named compound tag");
/*    */   }
/*    */   
/*    */   public static void a(r paramr, DataOutput paramDataOutput) {
/* 52 */     ft.a(paramr, paramDataOutput);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */