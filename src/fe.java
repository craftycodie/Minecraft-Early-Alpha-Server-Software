/*    */ public class fe {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   public Vec3D f;
/*    */   public Entity g;
/*    */   
/*    */   public fe(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Vec3D paramas) {
/* 11 */     this.a = 0;
/* 12 */     this.b = paramInt1;
/* 13 */     this.c = paramInt2;
/* 14 */     this.d = paramInt3;
/* 15 */     this.e = paramInt4;
/* 16 */     this.f = Vec3D.b(paramas.a, paramas.b, paramas.c);
/*    */   }
/*    */   
/*    */   public fe(Entity paramdb) {
/* 20 */     this.a = 1;
/* 21 */     this.g = paramdb;
/* 22 */     this.f = Vec3D.b(paramdb.k, paramdb.l, paramdb.m);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */