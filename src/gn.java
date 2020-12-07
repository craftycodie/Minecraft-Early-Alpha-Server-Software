/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gn
/*    */   extends ap
/*    */   implements if
/*    */ {
/*  9 */   private gc[] e = new gc[36];
/*    */   
/*    */   public int a() {
/* 12 */     return 27;
/*    */   }
/*    */   
/*    */   public gc a(int paramInt) {
/* 16 */     return this.e[paramInt];
/*    */   }
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
/*    */   public void a(int paramInt, gc paramgc) {
/* 35 */     this.e[paramInt] = paramgc;
/* 36 */     if (paramgc != null && paramgc.a > c()) paramgc.a = c();
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(r paramr) {
/* 45 */     super.a(paramr);
/* 46 */     de de = paramr.k("Items");
/* 47 */     this.e = new gc[a()];
/* 48 */     for (byte b = 0; b < de.b(); b++) {
/* 49 */       r r1 = (r)de.a(b);
/* 50 */       int i = r1.b("Slot") & 0xFF;
/* 51 */       if (i >= 0 && i < this.e.length) this.e[i] = new gc(r1); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(r paramr) {
/* 56 */     super.b(paramr);
/* 57 */     de de = new de();
/*    */     
/* 59 */     for (byte b = 0; b < this.e.length; b++) {
/* 60 */       if (this.e[b] != null) {
/* 61 */         r r1 = new r();
/* 62 */         r1.a("Slot", (byte)b);
/* 63 */         this.e[b].a(r1);
/* 64 */         de.a(r1);
/*    */       } 
/*    */     } 
/* 67 */     paramr.a("Items", de);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int c() {
/* 74 */     return 64;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */