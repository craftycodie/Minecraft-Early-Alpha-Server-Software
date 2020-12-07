/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ap
/*    */ {
/* 11 */   private static Map e = new HashMap<Object, Object>();
/* 12 */   private static Map f = new HashMap<Object, Object>(); public dp a; public int b;
/*    */   
/*    */   private static void a(Class<?> paramClass, String paramString) {
/* 15 */     if (f.containsKey(paramString)) throw new IllegalArgumentException("Duplicate id: " + paramString); 
/* 16 */     e.put(paramString, paramClass);
/* 17 */     f.put(paramClass, paramString);
/*    */   }
/*    */   public int c; public int d;
/*    */   static {
/* 21 */     a(cx.class, "Furnace");
/* 22 */     a(gn.class, "Chest");
/* 23 */     a(hp.class, "Sign");
/* 24 */     a(bm.class, "MobSpawner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(r paramr) {
/* 31 */     this.b = paramr.d("x");
/* 32 */     this.c = paramr.d("y");
/* 33 */     this.d = paramr.d("z");
/*    */   }
/*    */   
/*    */   public void b(r paramr) {
/* 37 */     String str = (String)f.get(getClass());
/* 38 */     if (str == null) {
/* 39 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*    */     }
/* 41 */     paramr.a("id", str);
/* 42 */     paramr.a("x", this.b);
/* 43 */     paramr.a("y", this.c);
/* 44 */     paramr.a("z", this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {}
/*    */   
/*    */   public static ap c(r paramr) {
/* 51 */     ap ap1 = null;
/*    */     try {
/* 53 */       Class<ap> clazz = (Class)e.get(paramr.h("id"));
/* 54 */       if (clazz != null) ap1 = clazz.newInstance(); 
/* 55 */     } catch (Exception exception) {
/* 56 */       exception.printStackTrace();
/*    */     } 
/* 58 */     if (ap1 != null) {
/* 59 */       ap1.a(paramr);
/*    */     } else {
/* 61 */       System.out.println("Skipping TileEntity with id " + paramr.h("id"));
/*    */     } 
/* 63 */     return ap1;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */