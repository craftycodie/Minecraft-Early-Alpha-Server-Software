/*     */ import java.awt.*;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.TitledBorder;
/*     */

/*     */
/*     */ public class ServerGUI extends JComponent {
/*  15 */   public static Logger a = Logger.getLogger("Minecraft");
/*     */   
/*     */   private MinecraftServer b;
/*     */ 
/*     */   
/*     */   public static void a(MinecraftServer paramMinecraftServer) {
/*     */     try {
/*  22 */       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*  23 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/*  26 */     ServerGUI fb1 = new ServerGUI(paramMinecraftServer);
/*  27 */     JFrame jFrame = new JFrame("Minecraft server");
/*  28 */     jFrame.add(fb1);
/*  29 */     jFrame.pack();
/*  30 */     jFrame.setLocationRelativeTo((Component) null);
/*  31 */     jFrame.setVisible(true);
/*  32 */     jFrame.addWindowListener(new ServerWindowAdapter(paramMinecraftServer));
/*     */   }
    static MinecraftServer a(ServerGUI servergui)
    {
        return servergui.b;
    }
/*     */ 
/*     */   
/*     */   public ServerGUI(MinecraftServer paramMinecraftServer) {
/*  48 */     this.b = paramMinecraftServer;
/*  49 */     setPreferredSize(new Dimension(854, 480));
/*     */     
/*  51 */     setLayout(new BorderLayout());
/*     */     try {
/*  53 */       add(c(), "Center");
/*  54 */       add(a(), "West");
/*  55 */     } catch (Exception exception) {
/*  56 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private JComponent a() {
/*  61 */     JPanel jPanel = new JPanel(new BorderLayout());
/*  62 */     jPanel.add(new GuiStatsComponent(), "North");
/*  63 */     jPanel.add(b(), "Center");
/*  64 */     jPanel.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
/*  65 */     return jPanel;
/*     */   }
/*     */   
/*     */   private JComponent b() {
/*  69 */     PlayerListBox g = new PlayerListBox(this.b);
/*  70 */     JScrollPane jScrollPane = new JScrollPane(g, 22, 30);
/*  71 */     jScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
/*     */     
/*  73 */     return jScrollPane;
/*     */   }
/*     */   
/*     */   private JComponent c() {
/*  77 */     JPanel jPanel = new JPanel(new BorderLayout());
/*  78 */     JTextArea jTextArea = new JTextArea();
/*  79 */     a.addHandler(new GuiLogOutputHandler(jTextArea));
/*  80 */     JScrollPane jScrollPane = new JScrollPane(jTextArea, 22, 30);
/*  81 */     jTextArea.setEditable(false);
/*     */     
/*  83 */     JTextField jTextField = new JTextField();
/*  84 */     jTextField.addActionListener(new ServerGuiCommandListener(this, jTextField));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     jTextArea.addFocusListener(new ServerGuiFocusAdapter(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     jPanel.add(jScrollPane, "Center");
/* 102 */     jPanel.add(jTextField, "South");
/* 103 */     jPanel.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
/*     */     
/* 105 */     return jPanel;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */