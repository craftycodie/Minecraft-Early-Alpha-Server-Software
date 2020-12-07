/*    */ public class bq
/*    */   implements Comparable
/*    */ {
/*  4 */   private static long f = 0L;
/*    */   public int a;
/*    */   public int b;
/*  7 */   private long g = f++; public int c; public int d; public long e;
/*    */   
/*    */   public bq(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 10 */     this.a = paramInt1;
/* 11 */     this.b = paramInt2;
/* 12 */     this.c = paramInt3;
/* 13 */     this.d = paramInt4;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 17 */     if (paramObject instanceof bq) {
/* 18 */       bq bq1 = (bq)paramObject;
/* 19 */       return (this.a == bq1.a && this.b == bq1.b && this.c == bq1.c && this.d == bq1.d);
/*    */     } 
/* 21 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 25 */     return (this.a * 128 * 1024 + this.c * 128 + this.b) * 256 + this.d;
/*    */   }
/*    */   
/*    */   public bq a(long paramLong) {
/* 29 */     this.e = paramLong;
/* 30 */     return this;
/*    */   }
/*    */
/*    */   public int a(bq parambq) {
/* 34 */     if (this.e < parambq.e) return -1; 
/* 35 */     if (this.e > parambq.e) return 1; 
/* 36 */     if (this.g < parambq.g) return -1; 
/* 37 */     if (this.g > parambq.g) return 1; 
/* 38 */     return 0;
/*    */   }

/*    */   public int compareTo(Object parambq) {
/* 34 */     if (parambq instanceof bq)
                return a((bq)parambq);

            return 0;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */