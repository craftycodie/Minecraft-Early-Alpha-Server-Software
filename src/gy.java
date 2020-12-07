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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class gy
/*    */   extends Thread
/*    */ {
/*    */   gy(aw paramaw, String paramString) {
/* 50 */     super(paramString);
/*    */   } public void run() {
/* 52 */     synchronized (aw.a) {
/* 53 */       aw.b++;
/*    */     } 
/*    */     try {
/* 56 */       while (aw.a(this.a) && !aw.b(this.a)) {
/* 57 */         aw.c(this.a);
/*    */       }
/*    */     } finally {
/* 60 */       synchronized (aw.a) {
/* 61 */         aw.b--;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */