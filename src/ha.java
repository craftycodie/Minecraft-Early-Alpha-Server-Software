/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class ha {
/*  7 */   private static Map a = new HashMap<Object, Object>();
/*  8 */   private static Map b = new HashMap<Object, Object>();
/*    */   
/*    */   static void a(int paramInt, Class<?> paramClass) {
/* 11 */     if (a.containsKey(Integer.valueOf(paramInt))) throw new IllegalArgumentException("Duplicate packet id:" + paramInt); 
/* 12 */     if (b.containsKey(paramClass)) throw new IllegalArgumentException("Duplicate packet class:" + paramClass); 
/* 13 */     a.put(Integer.valueOf(paramInt), paramClass);
/* 14 */     b.put(paramClass, Integer.valueOf(paramInt));
/*    */   }
/*    */   
/*    */   static {
/* 18 */     a(0, ii.class);
/* 19 */     a(1, x.class);
/* 20 */     a(3, ax.class);
/*    */     
/* 22 */     a(10, fs.class);
/* 23 */     a(11, w.class);
/* 24 */     a(12, fk.class);
/* 25 */     a(13, dh.class);
/* 26 */     a(14, gp.class);
/* 27 */     a(15, es.class);
/* 28 */     a(16, fi.class);
/* 29 */     a(17, eb.class);
/* 30 */     a(18, n.class);
/*    */     
/* 32 */     a(20, c.class);
/* 33 */     a(21, j.class);
/* 34 */     a(22, bz.class);
/* 35 */     a(23, dd.class);
/* 36 */     a(29, cm.class);
/*    */     
/* 38 */     a(30, el.class);
/* 39 */     a(31, di.class);
/* 40 */     a(32, cq.class);
/* 41 */     a(33, bc.class);
/* 42 */     a(34, by.class);
/*    */     
/* 44 */     a(50, ct.class);
/* 45 */     a(51, cs.class);
/* 46 */     a(52, gs.class);
/* 47 */     a(53, eh.class);
/*    */     
/* 49 */     a(255, hx.class);
/*    */   }
/*    */   
/*    */   public static ha a(int paramInt) {
/*    */     try {
/* 54 */       Class<ha> clazz = (Class)a.get(Integer.valueOf(paramInt));
/* 55 */       if (clazz == null) return null; 
/* 56 */       return clazz.newInstance();
/* 57 */     } catch (Exception exception) {
/* 58 */       exception.printStackTrace();
/* 59 */       System.out.println("Skipping packet with id " + paramInt);
/* 60 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int b() {
/* 65 */     return ((Integer)b.get(getClass())).intValue();
/*    */   }
/*    */   
/*    */   public boolean j = false;
/*    */   
/*    */   public static ha b(DataInputStream paramDataInputStream) {
/* 71 */     int i = paramDataInputStream.read();
/* 72 */     if (i == -1) return null;
/*    */     
/* 74 */     ha ha1 = a(i);
/* 75 */     if (ha1 == null) throw new IOException("Bad packet id " + i); 
/* 76 */     ha1.a(paramDataInputStream);
/* 77 */     return ha1;
/*    */   }
/*    */   
/*    */   public static void a(ha paramha, DataOutputStream paramDataOutputStream) {
/* 81 */     paramDataOutputStream.write(paramha.b());
/* 82 */     paramha.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public abstract void a(DataInputStream paramDataInputStream);
/*    */   
/*    */   public abstract void a(DataOutputStream paramDataOutputStream);
/*    */   
/*    */   public abstract void a(dy paramdy);
/*    */   
/*    */   public abstract int a();
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ha.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */