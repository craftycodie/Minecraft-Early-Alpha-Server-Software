/*    */ import java.util.Vector;
/*    */ import javax.swing.JList;
/*    */

/*    */
/*    */ 
/*    */ public class g
/*    */   extends JList
/*    */   implements dn
/*    */ {
/*    */   private MinecraftServer a;
/* 11 */   private int b = 0;
/*    */   
/*    */   public g(MinecraftServer paramMinecraftServer) {
/* 14 */     this.a = paramMinecraftServer;
/* 15 */     paramMinecraftServer.a(this);
/*    */   }
/*    */   
/*    */   public void a() {
/* 19 */     if (this.b++ % 20 == 0) {
/* 20 */       Vector<String> vector = new Vector();
/* 21 */       for (int b = 0; b < this.a.f.b.size(); b++) {
/* 22 */         vector.add(((EntityPlayerMP)this.a.f.b.get(b)).username);
/*    */       }
/* 24 */       setListData((Vector)vector);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\soundGravelFootstep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */