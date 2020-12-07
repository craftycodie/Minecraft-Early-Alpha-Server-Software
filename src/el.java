/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class el
/*     */   extends ha
/*     */ {
/*     */   public int a;
/*     */   public byte b;
/*     */   public byte c;
/*     */   public byte d;
/*     */   public byte e;
/*     */   public byte f;
/*     */   public boolean g = false;
/*     */   
/*     */   public el() {}
/*     */   
/*     */   public el(int paramInt) {
/* 111 */     this.a = paramInt;
/*     */   }
/*     */   
/*     */   public void a(DataInputStream paramDataInputStream) {
/* 115 */     this.a = paramDataInputStream.readInt();
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) {
/* 119 */     paramDataOutputStream.writeInt(this.a);
/*     */   }
/*     */   
/*     */   public void a(dy paramdy) {
/* 123 */     paramdy.a(this);
/*     */   }
/*     */   
/*     */   public int a() {
/* 127 */     return 4;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\el.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */