/*    */ 
/*    */ 
/*    */ public class PathPoint
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   public final int d;
/*  9 */   int e = -1;
/*    */   
/*    */   float f;
/*    */   float g;
/*    */   
/*    */   public PathPoint(int paramInt1, int paramInt2, int paramInt3) {
/* 15 */     this.a = paramInt1;
/* 16 */     this.b = paramInt2;
/* 17 */     this.c = paramInt3;
/*    */     
/* 19 */     this.d = paramInt1 | paramInt2 << 10 | paramInt3 << 20;
/*    */   }
/*    */   float h; PathPoint i; public boolean j = false;
/*    */   public float a(PathPoint parama) {
/* 23 */     float f1 = (parama.a - this.a);
/* 24 */     float f2 = (parama.b - this.b);
/* 25 */     float f3 = (parama.c - this.c);
/* 26 */     return MathHelper.c(f1 * f1 + f2 * f2 + f3 * f3);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 30 */     return (((PathPoint)paramObject).d == this.d);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 34 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 38 */     return (this.e >= 0);
/*    */   }
/*    */   
/*    */   public String toString() {
/* 42 */     return this.a + ", " + this.b + ", " + this.c;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\addIdClassMapping.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */