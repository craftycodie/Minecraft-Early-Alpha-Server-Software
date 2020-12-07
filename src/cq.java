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
/*    */ public class cq
/*    */   extends el
/*    */ {
/*    */   public cq() {
/* 76 */     this.g = true;
/*    */   }
/*    */   
/*    */   public cq(int paramInt, byte paramByte1, byte paramByte2) {
/* 80 */     super(paramInt);
/* 81 */     this.e = paramByte1;
/* 82 */     this.f = paramByte2;
/* 83 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 87 */     super.a(paramDataInputStream);
/* 88 */     this.e = paramDataInputStream.readByte();
/* 89 */     this.f = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 93 */     super.a(paramDataOutputStream);
/* 94 */     paramDataOutputStream.writeByte(this.e);
/* 95 */     paramDataOutputStream.writeByte(this.f);
/*    */   }
/*    */   
/*    */   public int a() {
/* 99 */     return 6;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */