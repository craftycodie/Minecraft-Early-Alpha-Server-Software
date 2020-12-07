/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ge
/*    */ {
/* 14 */   private static Map a = new HashMap<Object, Object>();
/* 15 */   private static Map b = new HashMap<Object, Object>();
/*    */   
/*    */   private static void a(Class<?> paramClass, String paramString) {
/* 18 */     a.put(paramString, paramClass);
/* 19 */     b.put(paramClass, paramString);
/*    */   }
/*    */   
/*    */   static {
/* 23 */     a(da.class, "Arrow");
/* 24 */     a(av.class, "Snowball");
/* 25 */     a(fa.class, "Item");
/* 26 */     a(bp.class, "Painting");
/*    */     
/* 28 */     a(ic.class, "Mob");
/* 29 */     a(eu.class, "Monster");
/*    */     
/* 31 */     a(ei.class, "Creeper");
/* 32 */     a(dz.class, "Skeleton");
/* 33 */     a(bg.class, "Spider");
/* 34 */     a(p.class, "Giant");
/* 35 */     a(ez.class, "Zombie");
/* 36 */     a(ev.class, "Slime");
/*    */     
/* 38 */     a(gg.class, "Pig");
/* 39 */     a(cd.class, "Sheep");
/* 40 */     a(au.class, "Cow");
/* 41 */     a(gt.class, "Chicken");
/*    */     
/* 43 */     a(bs.class, "PrimedTnt");
/* 44 */     a(go.class, "FallingSand");
/*    */     
/* 46 */     a(hs.class, "Minecart");
/* 47 */     a(eg.class, "Boat");
/*    */   }
/*    */   
/*    */   public static db a(String paramString, dp paramdp) {
/* 51 */     db db = null;
/*    */     try {
/* 53 */       Class<db> clazz = (Class)a.get(paramString);
/* 54 */       if (clazz != null) db = clazz.getConstructor(new Class[] { dp.class }).newInstance(new Object[] { paramdp });
/*    */     
/* 56 */     } catch (Exception exception) {
/* 57 */       exception.printStackTrace();
/*    */     } 
/* 59 */     return db;
/*    */   }
/*    */   
/*    */   public static db a(r paramr, dp paramdp) {
/* 63 */     db db = null;
/*    */     try {
/* 65 */       Class<db> clazz = (Class)a.get(paramr.h("id"));
/* 66 */       if (clazz != null) db = clazz.getConstructor(new Class[] { dp.class }).newInstance(new Object[] { paramdp });
/*    */     
/* 68 */     } catch (Exception exception) {
/* 69 */       exception.printStackTrace();
/*    */     } 
/* 71 */     if (db != null) {
/* 72 */       db.e(paramr);
/*    */     } else {
/* 74 */       System.out.println("Skipping Entity with id " + paramr.h("id"));
/*    */     } 
/* 76 */     return db;
/*    */   }
/*    */   
/*    */   public static String a(db paramdb) {
/* 80 */     return (String)b.get(paramdb.getClass());
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ge.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */