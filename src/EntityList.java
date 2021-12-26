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
/*    */ public class EntityList
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
/* 23 */     a(EntityArrow.class, "Arrow");
/* 24 */     a(EntitySnowball.class, "Snowball");
/* 25 */     a(EntityItem.class, "Item");
/* 26 */     a(EntityPainting.class, "Painting");
/*    */     
/* 28 */     a(EntityLiving.class, "Mob");
/* 29 */     a(EntityMob.class, "Monster");
/*    */     
/* 31 */     a(EntityCreeper.class, "Creeper");
/* 32 */     a(EntitySkeleton.class, "Skeleton");
/* 33 */     a(EntitySpider.class, "Spider");
/* 34 */     a(EntityGiantZombie.class, "Giant");
/* 35 */     a(EntityZombie.class, "Zombie");
/* 36 */     a(EntitySlime.class, "Slime");
/*    */
/* 38 */     a(EntityPig.class, "Pig");
/* 39 */     a(EntitySheep.class, "Sheep");
/* 40 */     a(EntityCow.class, "Cow");
/* 40 */     a(EntityChicken.class, "Chicken");
/*    */
/* 43 */     a(EntityTNTPrimed.class, "PrimedTnt");
/* 44 */     a(EntityFallingSand.class, "FallingSand");
/*    */     
/* 46 */     a(EntityMinecart.class, "Minecart");
/* 47 */     a(EntityBoat.class, "Boat");
/*    */   }
/*    */   
/*    */   public static Entity a(String paramString, World paramdp) {
/* 51 */     Entity db = null;
/*    */     try {
/* 53 */       Class<Entity> clazz = (Class)a.get(paramString);
/* 54 */       if (clazz != null) db = clazz.getConstructor(new Class[] { World.class }).newInstance(new Object[] { paramdp });
/*    */     
/* 56 */     } catch (Exception exception) {
/* 57 */       exception.printStackTrace();
/*    */     } 
/* 59 */     return db;
/*    */   }
/*    */   
/*    */   public static Entity a(NBTTagCompound paramr, World paramdp) {
/* 63 */     Entity db = null;
/*    */     try {
/* 65 */       Class<Entity> clazz = (Class)a.get(paramr.h("id"));
/* 66 */       if (clazz != null) db = clazz.getConstructor(new Class[] { World.class }).newInstance(new Object[] { paramdp });
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
/*    */   public static String a(Entity paramdb) {
/* 80 */     return (String)b.get(paramdb.getClass());
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ge.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */