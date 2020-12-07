/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.util.Properties;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ public class cj {
/*  8 */   public static Logger a = Logger.getLogger("Minecraft");
/*  9 */   private Properties b = new Properties();
/*    */   private File c;
/*    */   
/*    */   public cj(File paramFile) {
/* 13 */     this.c = paramFile;
/* 14 */     if (paramFile.exists()) {
/*    */       try {
/* 16 */         this.b.load(new FileInputStream(paramFile));
/* 17 */         for (String str : this.b.keySet()) {
/* 18 */           System.out.println(str + ":" + this.b.get(str));
/*    */         }
/* 20 */       } catch (Exception exception) {
/* 21 */         a.log(Level.WARNING, "Failed to load " + paramFile, exception);
/* 22 */         a();
/*    */       } 
/*    */     } else {
/* 25 */       a.log(Level.WARNING, paramFile + " does not exist");
/* 26 */       a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/* 31 */     a.log(Level.INFO, "Generating new properties file");
/* 32 */     b();
/*    */   }
/*    */   
/*    */   public void b() {
/*    */     try {
/* 37 */       this.b.store(new FileOutputStream(this.c), "Minecraft server properties");
/* 38 */     } catch (Exception exception) {
/* 39 */       a.log(Level.WARNING, "Failed to save " + this.c, exception);
/* 40 */       a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public String a(String paramString1, String paramString2) {
/* 45 */     System.out.println("Getting " + paramString1);
/* 46 */     if (!this.b.containsKey(paramString1)) {
/* 47 */       System.out.println("Nope!");
/* 48 */       this.b.setProperty(paramString1, paramString2);
/* 49 */       b();
/*    */     } 
/* 51 */     System.out.println("Yep: " + this.b.getProperty(paramString1, paramString2));
/* 52 */     return this.b.getProperty(paramString1, paramString2);
/*    */   }
/*    */   
/*    */   public int a(String paramString, int paramInt) {
/*    */     try {
/* 57 */       return Integer.parseInt(a(paramString, "" + paramInt));
/* 58 */     } catch (Exception exception) {
/* 59 */       this.b.setProperty(paramString, "" + paramInt);
/* 60 */       return paramInt;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */