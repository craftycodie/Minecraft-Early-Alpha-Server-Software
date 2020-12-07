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
/*    */ public class di
/*    */   extends el
/*    */ {
/*    */   public di() {}
/*    */   
/*    */   public di(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3) {
/* 49 */     super(paramInt);
/* 50 */     this.b = paramByte1;
/* 51 */     this.c = paramByte2;
/* 52 */     this.d = paramByte3;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 56 */     super.a(paramDataInputStream);
/* 57 */     this.b = paramDataInputStream.readByte();
/* 58 */     this.c = paramDataInputStream.readByte();
/* 59 */     this.d = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 63 */     super.a(paramDataOutputStream);
/* 64 */     paramDataOutputStream.writeByte(this.b);
/* 65 */     paramDataOutputStream.writeByte(this.c);
/* 66 */     paramDataOutputStream.writeByte(this.d);
/*    */   }
/*    */   
/*    */   public int a() {
/* 70 */     return 7;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\di.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */