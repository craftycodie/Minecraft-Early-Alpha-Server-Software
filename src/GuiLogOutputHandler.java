/*    */ import java.util.logging.Formatter;
/*    */ import java.util.logging.Handler;
/*    */ import java.util.logging.LogRecord;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ 
/*    */ public class GuiLogOutputHandler
/*    */   extends Handler
/*    */ {
/* 10 */   private int[] b = new int[1024];
/* 11 */   private int c = 0;
/*    */   
/* 13 */   Formatter a = new fo(this);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private JTextArea d;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public GuiLogOutputHandler(JTextArea paramJTextArea) {
/* 43 */     setFormatter(this.a);
/* 44 */     this.d = paramJTextArea;
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {}
/*    */ 
/*    */   
/*    */   public void flush() {}
/*    */   
/*    */   public void publish(LogRecord paramLogRecord) {
/* 54 */     int i = this.d.getDocument().getLength();
/* 55 */     this.d.append(this.a.format(paramLogRecord));
/* 56 */     this.d.setCaretPosition(this.d.getDocument().getLength());
/* 57 */     int j = this.d.getDocument().getLength() - i;
/*    */     
/* 59 */     if (this.b[this.c] != 0) {
/* 60 */       this.d.replaceRange("", 0, this.b[this.c]);
/*    */     }
/* 62 */     this.b[this.c] = j;
/* 63 */     this.c = (this.c + 1) % 1024;
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ch.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */