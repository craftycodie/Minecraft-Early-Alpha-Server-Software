/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class k
/*    */   extends ft
/*    */ {
/*    */   public float a;
/*    */   
/*    */   public k() {}
/*    */   
/*    */   public k(float paramFloat) {
/* 12 */     this.a = paramFloat;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeFloat(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readFloat();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 5;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */