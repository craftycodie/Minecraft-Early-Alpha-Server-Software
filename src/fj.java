/*    */ import java.util.ArrayList;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fj
/*    */ {
/* 13 */   private Set a = new HashSet();
/* 14 */   private gq b = new gq();
/*    */   private MinecraftServer c;
/*    */   private int d;
/*    */   
/*    */   public fj(MinecraftServer paramMinecraftServer) {
/* 19 */     this.c = paramMinecraftServer;
/* 20 */     this.d = paramMinecraftServer.f.a();
/*    */   }
/*    */   
/*    */   public void a(db paramdb) {
/* 24 */     if (paramdb instanceof dq) {
/* 25 */       a(paramdb, 256, 2);
/* 26 */       dq dq = (dq)paramdb;
/* 27 */       for (fl fl : this.a) {
/* 28 */         if (fl.a != dq) {
/* 29 */           fl.a(dq);
/*    */         }
/*    */       } 
/*    */     } 
/* 33 */     if (paramdb instanceof fa) a(paramdb, 64, 20); 
/* 34 */     if (paramdb instanceof hs) a(paramdb, 160, 4); 
/*    */   }
/*    */   
/*    */   public void a(db paramdb, int paramInt1, int paramInt2) {
/* 38 */     if (paramInt1 > this.d) paramInt1 = this.d; 
/* 39 */     if (this.b.b(paramdb.c)) throw new IllegalStateException("Entity is already tracked!"); 
/* 40 */     fl fl = new fl(paramdb, paramInt1, paramInt2);
/* 41 */     this.a.add(fl);
/* 42 */     this.b.a(paramdb.c, fl);
/* 43 */     fl.b(this.c.e.i);
/*    */   }
/*    */   
/*    */   public void b(db paramdb) {
/* 47 */     fl fl = (fl)this.b.d(paramdb.c);
/* 48 */     if (fl != null) {
/* 49 */       this.a.remove(fl);
/* 50 */       fl.a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/* 55 */     ArrayList<dq> arrayList = new ArrayList();
/* 56 */     for (fl fl : this.a) {
/* 57 */       fl.a(this.c.e.i);
/* 58 */       if (fl.j && fl.a instanceof dq) {
/* 59 */         arrayList.add((dq)fl.a);
/*    */       }
/*    */     } 
/*    */     
/* 63 */     for (byte b = 0; b < arrayList.size(); b++) {
/* 64 */       dq dq = arrayList.get(b);
/* 65 */       for (fl fl : this.a) {
/* 66 */         if (fl.a != dq) {
/* 67 */           fl.a(dq);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(db paramdb, ha paramha) {
/* 74 */     fl fl = (fl)this.b.a(paramdb.c);
/* 75 */     if (fl != null)
/* 76 */       fl.a(paramha); 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */