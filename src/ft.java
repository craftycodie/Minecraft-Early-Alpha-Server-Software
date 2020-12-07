/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ft
/*     */ {
/*  18 */   private String a = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   abstract void a(DataOutput paramDataOutput);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   abstract void a(DataInput paramDataInput);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract byte a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c() {
/*  45 */     if (this.a == null) return ""; 
/*  46 */     return this.a;
/*     */   }
/*     */   
/*     */   public ft m(String paramString) {
/*  50 */     this.a = paramString;
/*  51 */     return this;
/*     */   }
/*     */   
/*     */   public static ft b(DataInput paramDataInput) {
/*  55 */     byte b = paramDataInput.readByte();
/*  56 */     if (b == 0) return new hq();
/*     */     
/*  58 */     ft ft1 = a(b);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     ft1.a = paramDataInput.readUTF();
/*  64 */     ft1.a(paramDataInput);
/*  65 */     return ft1;
/*     */   }
/*     */   
/*     */   public static void a(ft paramft, DataOutput paramDataOutput) {
/*  69 */     paramDataOutput.writeByte(paramft.a());
/*  70 */     if (paramft.a() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  75 */     paramDataOutput.writeUTF(paramft.c());
/*     */     
/*  77 */     paramft.a(paramDataOutput);
/*     */   }
/*     */   
/*     */   public static ft a(byte paramByte) {
/*  81 */     switch (paramByte) {
/*     */       case 0:
/*  83 */         return new hq();
/*     */       case 1:
/*  85 */         return new bj();
/*     */       case 2:
/*  87 */         return new ep();
/*     */       case 3:
/*  89 */         return new bb();
/*     */       case 4:
/*  91 */         return new d();
/*     */       case 5:
/*  93 */         return new k();
/*     */       case 6:
/*  95 */         return new dk();
/*     */       case 7:
/*  97 */         return new fc();
/*     */       case 8:
/*  99 */         return new gu();
/*     */       case 9:
/* 101 */         return new de();
/*     */       case 10:
/* 103 */         return new r();
/*     */     } 
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   public static String b(byte paramByte) {
/* 109 */     switch (paramByte) {
/*     */       case 0:
/* 111 */         return "TAG_End";
/*     */       case 1:
/* 113 */         return "TAG_Byte";
/*     */       case 2:
/* 115 */         return "TAG_Short";
/*     */       case 3:
/* 117 */         return "TAG_Int";
/*     */       case 4:
/* 119 */         return "TAG_Long";
/*     */       case 5:
/* 121 */         return "TAG_Float";
/*     */       case 6:
/* 123 */         return "TAG_Double";
/*     */       case 7:
/* 125 */         return "TAG_Byte_Array";
/*     */       case 8:
/* 127 */         return "TAG_String";
/*     */       case 9:
/* 129 */         return "TAG_List";
/*     */       case 10:
/* 131 */         return "TAG_Compound";
/*     */     } 
/* 133 */     return "UNKNOWN";
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ft.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */