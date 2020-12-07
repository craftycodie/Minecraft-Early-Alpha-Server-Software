/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class gu
/*    */   extends ft
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public gu() {}
/*    */   
/*    */   public gu(String paramString) {
/* 12 */     this.a = paramString;
/* 13 */     if (paramString == null) throw new IllegalArgumentException("Empty string not allowed"); 
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 17 */     paramDataOutput.writeUTF(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 21 */     this.a = paramDataInput.readUTF();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 25 */     return 8;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 29 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */