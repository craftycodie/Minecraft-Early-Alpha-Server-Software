/*    */ 
/*    */ 
/*    */ 
/*    */ public class ah
/*    */   extends ci
/*    */ {
/*  7 */   private static et[] aV = new et[] { et.w, et.aj, et.ak, et.t, et.ao, et.H, et.ai, et.I, et.ah, et.G, et.aw, et.ax, et.aT };
/*    */   
/*    */   private int aW;
/*    */   
/*    */   public ah(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, 2, paramInt2, aV);
/* 13 */     this.aW = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(et paramet) {
/* 17 */     if (paramet == et.ap) return (this.aW == 3); 
/* 18 */     if (paramet == et.ax || paramet == et.aw) return (this.aW >= 2); 
/* 19 */     if (paramet == et.ah || paramet == et.G) return (this.aW >= 2); 
/* 20 */     if (paramet == et.ai || paramet == et.H) return (this.aW >= 1); 
/* 21 */     if (paramet == et.aN || paramet == et.aO) return (this.aW >= 2); 
/* 22 */     if (paramet.bl == hz.d) return true; 
/* 23 */     if (paramet.bl == hz.e) return true; 
/* 24 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */