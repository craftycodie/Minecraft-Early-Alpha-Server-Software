/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class dh
/*    */   extends fs
/*    */ {
/*    */   public dh() {
/*  8 */     this.i = true;
/*  9 */     this.h = true;
/*    */   }
/*    */   
/*    */   public dh(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 13 */     this.a = paramDouble1;
/* 14 */     this.b = paramDouble2;
/* 15 */     this.d = paramDouble3;
/* 16 */     this.c = paramDouble4;
/* 17 */     this.e = paramFloat1;
/* 18 */     this.f = paramFloat2;
/* 19 */     this.g = paramBoolean;
/* 20 */     this.i = true;
/* 21 */     this.h = true;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 25 */     this.a = paramDataInputStream.readDouble();
/* 26 */     this.b = paramDataInputStream.readDouble();
/* 27 */     this.d = paramDataInputStream.readDouble();
/* 28 */     this.c = paramDataInputStream.readDouble();
/* 29 */     this.e = paramDataInputStream.readFloat();
/* 30 */     this.f = paramDataInputStream.readFloat();
/* 31 */     super.a(paramDataInputStream);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 35 */     paramDataOutputStream.writeDouble(this.a);
/* 36 */     paramDataOutputStream.writeDouble(this.b);
/* 37 */     paramDataOutputStream.writeDouble(this.d);
/* 38 */     paramDataOutputStream.writeDouble(this.c);
/* 39 */     paramDataOutputStream.writeFloat(this.e);
/* 40 */     paramDataOutputStream.writeFloat(this.f);
/* 41 */     super.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public int a() {
/* 45 */     return 41;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */