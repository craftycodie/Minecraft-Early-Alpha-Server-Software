/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PathEntity
/*    */ {
/*    */   private final PathPoint[] b;
/*    */   public final int a;
/*    */   private int c;
/*    */   
/*    */   public PathEntity(PathPoint[] paramArrayOfa) {
/* 12 */     this.b = paramArrayOfa;
/* 13 */     this.a = paramArrayOfa.length;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 21 */     this.c++;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 25 */     return (this.c >= this.b.length);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Vec3D a(Entity paramdb) {
/* 33 */     double d1 = (this.b[this.c]).a + (int)(paramdb.C + 1.0F) * 0.5D;
/* 34 */     double d2 = (this.b[this.c]).b;
/* 35 */     double d3 = (this.b[this.c]).c + (int)(paramdb.C + 1.0F) * 0.5D;
/* 36 */     return Vec3D.b(d1, d2, d3);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */