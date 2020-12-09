/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TileEntity
/*    */ {
/* 11 */   private static Map e = new HashMap<Object, Object>();
/* 12 */   private static Map f = new HashMap<Object, Object>(); public World a; public int b;
/*    */   
/*    */   private static void a(Class<?> paramClass, String paramString) {
/* 15 */     if (f.containsKey(paramString)) throw new IllegalArgumentException("Duplicate id: " + paramString); 
/* 16 */     e.put(paramString, paramClass);
/* 17 */     f.put(paramClass, paramString);
/*    */   }
/*    */   public int c; public int d;
/*    */   static {
/* 21 */     a(TileEntityFurnace.class, "Furnace");
/* 22 */     a(TileEntityChest.class, "Chest");
/* 23 */     a(TileEntitySign.class, "Sign");
/* 24 */     a(TileEntityMobSpawner.class, "MobSpawner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(NBTTagCompound paramr) {
/* 31 */     this.b = paramr.d("onLivingUpdate");
/* 32 */     this.c = paramr.d("y");
/* 33 */     this.d = paramr.d("z");
/*    */   }
/*    */   
/*    */   public void b(NBTTagCompound paramr) {
/* 37 */     String str = (String)f.get(getClass());
/* 38 */     if (str == null) {
/* 39 */       throw new RuntimeException(getClass() + " is missing addIdClassMapping mapping! This is addIdClassMapping bug!");
/*    */     }
/* 41 */     paramr.a("id", str);
/* 42 */     paramr.a("onLivingUpdate", this.b);
/* 43 */     paramr.a("y", this.c);
/* 44 */     paramr.a("z", this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {}
/*    */   
/*    */   public static TileEntity c(NBTTagCompound paramr) {
/* 51 */     TileEntity ap1 = null;
/*    */     try {
/* 53 */       Class<TileEntity> clazz = (Class)e.get(paramr.h("id"));
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
