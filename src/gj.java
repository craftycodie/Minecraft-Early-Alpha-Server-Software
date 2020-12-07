/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringWriter;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.logging.Formatter;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.LogRecord;
/*    */ 
/*    */ 
/*    */ final class gj
/*    */   extends Formatter
/*    */ {
/* 12 */   private SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*    */   
/*    */   public String format(LogRecord paramLogRecord) {
/* 15 */     StringBuilder stringBuilder = new StringBuilder();
/*    */     
/* 17 */     stringBuilder.append(this.a.format(Long.valueOf(paramLogRecord.getMillis())));
/* 18 */     Level level = paramLogRecord.getLevel();
/* 19 */     if (level == Level.FINEST) { stringBuilder.append(" [FINEST] "); }
/* 20 */     else if (level == Level.FINER) { stringBuilder.append(" [FINER] "); }
/* 21 */     else if (level == Level.FINE) { stringBuilder.append(" [FINE] "); }
/* 22 */     else if (level == Level.INFO) { stringBuilder.append(" [INFO] "); }
/* 23 */     else if (level == Level.WARNING) { stringBuilder.append(" [WARNING] "); }
/* 24 */     else if (level == Level.SEVERE) { stringBuilder.append(" [SEVERE] "); }
/* 25 */     else if (level == Level.SEVERE) { stringBuilder.append(" [" + level.getLocalizedName() + "] "); }
/*    */     
/* 27 */     stringBuilder.append(paramLogRecord.getMessage());
/* 28 */     stringBuilder.append('\n');
/*    */     
/* 30 */     Throwable throwable = paramLogRecord.getThrown();
/* 31 */     if (throwable != null) {
/* 32 */       StringWriter stringWriter = new StringWriter();
/* 33 */       throwable.printStackTrace(new PrintWriter(stringWriter));
/* 34 */       stringBuilder.append(stringWriter.toString());
/*    */     } 
/*    */     
/* 37 */     return stringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */