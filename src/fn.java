/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fn
/*    */   extends en
/*    */ {
/*    */   private hz a;
/*    */   
/*    */   public fn(int paramInt, hz paramhz) {
/* 13 */     super(paramInt);
/* 14 */     this.a = paramhz;
/* 15 */     this.aS = 64;
/* 16 */     this.aR = 1;
/*    */   }
/*    */   public boolean a(gc paramgc, eq parameq, dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     et et;
/* 20 */     if (paramInt4 != 1) return false; 
/* 21 */     paramInt2++;
/*    */ 
/*    */ 
/*    */     
/* 25 */     if (this.a == hz.c) { et = et.aE; }
/* 26 */     else { et = et.aL; }
/*    */     
/* 28 */     if (!et.a(paramdp, paramInt1, paramInt2, paramInt3)) return false;
/*    */     
/* 30 */     int i = fw.b(((parameq.q + 180.0F) * 4.0F / 360.0F) - 0.5D) & 0x3;
/*    */     
/* 32 */     byte b1 = 0;
/* 33 */     byte b2 = 0;
/* 34 */     if (i == 0) b2 = 1; 
/* 35 */     if (i == 1) b1 = -1; 
/* 36 */     if (i == 2) b2 = -1; 
/* 37 */     if (i == 3) b1 = 1;
/*    */ 
/*    */     
/* 40 */     int j = (paramdp.d(paramInt1 - b1, paramInt2, paramInt3 - b2) ? 1 : 0) + (paramdp.d(paramInt1 - b1, paramInt2 + 1, paramInt3 - b2) ? 1 : 0);
/* 41 */     int k = (paramdp.d(paramInt1 + b1, paramInt2, paramInt3 + b2) ? 1 : 0) + (paramdp.d(paramInt1 + b1, paramInt2 + 1, paramInt3 + b2) ? 1 : 0);
/*    */     
/* 43 */     boolean bool1 = (paramdp.a(paramInt1 - b1, paramInt2, paramInt3 - b2) == et.ba || paramdp.a(paramInt1 - b1, paramInt2 + 1, paramInt3 - b2) == et.ba) ? true : false;
/* 44 */     boolean bool2 = (paramdp.a(paramInt1 + b1, paramInt2, paramInt3 + b2) == et.ba || paramdp.a(paramInt1 + b1, paramInt2 + 1, paramInt3 + b2) == et.ba) ? true : false;
/*    */     
/* 46 */     boolean bool3 = false;
/* 47 */     if (bool1 && !bool2) { bool3 = true; }
/* 48 */     else if (k > j) { bool3 = true; }
/*    */     
/* 50 */     if (bool3) {
/* 51 */       i = i - 1 & 0x3;
/* 52 */       i += 4;
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     paramdp.d(paramInt1, paramInt2, paramInt3, et.ba);
/* 59 */     paramdp.b(paramInt1, paramInt2, paramInt3, i);
/*    */     
/* 61 */     paramdp.d(paramInt1, paramInt2 + 1, paramInt3, et.ba);
/* 62 */     paramdp.b(paramInt1, paramInt2 + 1, paramInt3, i + 8);
/*    */     
/* 64 */     paramgc.a--;
/* 65 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */