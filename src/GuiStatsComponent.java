/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.Timer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GuiStatsComponent
/*    */   extends JComponent
/*    */ {
/* 12 */   private int[] a = new int[256];
/* 13 */   private int b = 0;
/* 14 */   private String[] c = new String[10];
/*    */   
/*    */   public GuiStatsComponent() {
/* 17 */     setPreferredSize(new Dimension(256, 196));
/* 18 */     setMinimumSize(new Dimension(256, 196));
/* 19 */     setMaximumSize(new Dimension(256, 196));
/* 20 */     (new Timer(500, new GuiStatsListener(this))).start();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     setBackground(Color.BLACK);
/*    */   }
/*    */   
/*    */   private void a() {
/* 29 */     long l = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
/* 30 */     System.gc();
/* 31 */     this.c[0] = "Memory use: " + (l / 1024L / 1024L) + " mb (" + (Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()) + "% free)";
/* 32 */     this.c[1] = "Threads: " + NetworkManager.b + " + " + NetworkManager.c;
/* 33 */     this.a[this.b++ & 0xFF] = (int)(l * 100L / Runtime.getRuntime().maxMemory());
/* 34 */     repaint();
/*    */   }

    static void a(GuiStatsComponent guistatscomponent)
    {
        guistatscomponent.a();
    }
/*    */   
/*    */   public void paint(Graphics paramGraphics) {
/* 38 */     paramGraphics.setColor(new Color(16777215));
/* 39 */     paramGraphics.fillRect(0, 0, 256, 192);
/*    */     byte b;
/* 41 */     for (b = 0; b < 256; b++) {
/* 42 */       int i = this.a[b + this.b & 0xFF];
/* 43 */       paramGraphics.setColor(new Color(i + 28 << 16));
/* 44 */       paramGraphics.fillRect(b, 100 - i, 1, i);
/*    */     } 
/* 46 */     paramGraphics.setColor(Color.BLACK);
/* 47 */     for (b = 0; b < this.c.length; b++) {
/* 48 */       String str = this.c[b];
/* 49 */       if (str != null) paramGraphics.drawString(str, 32, 116 + b * 16); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */