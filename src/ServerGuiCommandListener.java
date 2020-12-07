/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JTextField;
/*    */
/*    */ class ServerGuiCommandListener
/*    */   implements ActionListener
/*    */ {
    final JTextField a; /* synthetic field */
    final ServerGUI b; /* synthetic field */

/*    */   ServerGuiCommandListener(ServerGUI paramfb, JTextField paramJTextField) {
    this.a = paramJTextField;
    this.b = paramfb;
}
/*    */   
/*    */   public void actionPerformed(ActionEvent paramActionEvent) {
/* 86 */     String str = this.a.getText().trim();
/* 87 */     if (str.length() > 0) {
/* 88 */       ServerGUI.a(this.b).a(str);
/*    */     }
/* 90 */     this.a.setText("");
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\stone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */