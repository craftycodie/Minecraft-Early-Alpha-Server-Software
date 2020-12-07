/*    */ public class gf {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   
/*    */   public gf(int paramInt1, int paramInt2, int paramInt3) {
/*  7 */     this.a = paramInt1;
/*  8 */     this.b = paramInt2;
/*  9 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 13 */     if (paramObject instanceof gf) {
/*    */       
/* 15 */       gf gf1 = (gf)paramObject;
/* 16 */       return (gf1.a == this.a && gf1.b == this.b && gf1.c == this.c);
/*    */     } 
/*    */     
/* 19 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 23 */     return this.a * 8976890 + this.b * 981131 + this.c;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */