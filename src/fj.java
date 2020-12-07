/*    */ import java.util.ArrayList;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */
/*    */ public class fj
/*    */ {
/* 13 */   private Set a = new HashSet();
/* 14 */   private MCHash b = new MCHash();
/*    */   private MinecraftServer c;
/*    */   private int d;
/*    */   
/*    */   public fj(MinecraftServer paramMinecraftServer) {
/* 19 */     this.c = paramMinecraftServer;
/* 20 */     this.d = paramMinecraftServer.f.a();
/*    */   }
/*    */   
/*    */   public void a(Entity paramdb) {
/* 24 */     if (paramdb instanceof EntityPlayerMP) {
/* 25 */       a(paramdb, 256, 2);
/* 26 */       EntityPlayerMP dq = (EntityPlayerMP)paramdb;
/* 27 */       for (Object fl : this.a) {
/* 28 */         if (((fl)fl).a != dq) {
/* 29 */           ((fl)fl).a(dq);
/*    */         }
/*    */       } 
/*    */     } 
/* 33 */     if (paramdb instanceof EntityItem) a(paramdb, 64, 20);
/* 34 */     if (paramdb instanceof hs) a(paramdb, 160, 4); 
/*    */   }
/*    */   
/*    */   public void a(Entity paramdb, int paramInt1, int paramInt2) {
/* 38 */     if (paramInt1 > this.d) paramInt1 = this.d; 
/* 39 */     if (this.b.containsItem(paramdb.c)) throw new IllegalStateException("Entity is already tracked!");
/* 40 */     fl fl = new fl(paramdb, paramInt1, paramInt2);
/* 41 */     this.a.add(fl);
/* 42 */     this.b.addKey(paramdb.c, fl);
/* 43 */     fl.b(this.c.e.i);
/*    */   }
/*    */   
/*    */   public void b(Entity paramdb) {
/* 47 */     fl fl = (fl)this.b.removeObject(paramdb.c);
/* 48 */     if (fl != null) {
/* 49 */       this.a.remove(fl);
/* 50 */       fl.a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/* 55 */     ArrayList<EntityPlayerMP> arrayList = new ArrayList();
/* 56 */     for (Object fl : this.a) {
/* 57 */       ((fl)fl).a(this.c.e.i);
/* 58 */       if (((fl)fl).j && ((fl)fl).a instanceof EntityPlayerMP) {
/* 59 */         arrayList.add((EntityPlayerMP)((fl)fl).a);
/*    */       }
/*    */     } 
/*    */     
/* 63 */     for (int b = 0; b < arrayList.size(); b++) {
/* 64 */       EntityPlayerMP dq = arrayList.get(b);
/* 65 */       for (Object fl : this.a) {
/* 66 */         if (((fl)fl).a != dq) {
/* 67 */           ((fl)fl).a(dq);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(Entity paramdb, Packet paramha) {
/* 74 */     fl fl = (fl)this.b.lookup(paramdb.c);
/* 75 */     if (fl != null)
/* 76 */       fl.a(paramha); 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */