/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;

/*    */ class GuiStatsListener
/*    */   implements ActionListener
/*    */ {
/*    */   GuiStatsListener(GuiStatsComponent paramhh) {
    statsComponent = paramhh;

}
/*    */   
/*    */   public void actionPerformed(ActionEvent paramActionEvent) {
/* 22 */     GuiStatsComponent.a(statsComponent);
/*    */   }
    final GuiStatsComponent statsComponent; /* synthetic field */

/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ib.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */