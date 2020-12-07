/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class d
/*    */   extends ft
/*    */ {
/*    */   public long a;
/*    */   
/*    */   public d() {}
/*    */   
/*    */   public d(long paramLong) {
/* 12 */     this.a = paramLong;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeLong(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readLong();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 4;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */