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
/*    */ final class ia
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   
/*    */   public ia(int paramInt1, int paramInt2) {
/* 17 */     this.a = paramInt1;
/* 18 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 22 */     if (paramObject instanceof ia) {
/* 23 */       ia ia1 = (ia)paramObject;
/* 24 */       return (this.a == ia1.a && this.b == ia1.b);
/*    */     } 
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 31 */     return this.a << 16 ^ this.b;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ia.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */