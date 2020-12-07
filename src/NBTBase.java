/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
import java.io.IOException;

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
/*     */ public abstract class NBTBase
/*     */ {
/*  18 */   private String a = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   abstract void writeTagContents(DataOutput paramDataOutput) throws IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   abstract void readTagContents(DataInput paramDataInput) throws IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract byte getType();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getKey() {
/*  45 */     if (this.a == null) return ""; 
/*  46 */     return this.a;
/*     */   }
/*     */   
/*     */   public NBTBase setKey(String paramString) {
/*  50 */     this.a = paramString;
/*  51 */     return this;
/*     */   }
/*     */   
/*     */   public static NBTBase readTag(DataInput paramDataInput) throws IOException {
/*  55 */     byte b = paramDataInput.readByte();
/*  56 */     if (b == 0) return new hq();
/*     */     
/*  58 */     NBTBase ft1 = writeTag(b);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     ft1.a = paramDataInput.readUTF();
/*  64 */     ft1.readTagContents(paramDataInput);
/*  65 */     return ft1;
/*     */   }
/*     */   
/*     */   public static void writeTag(NBTBase paramft, DataOutput paramDataOutput) throws IOException {
/*  69 */     paramDataOutput.writeByte(paramft.getType());
/*  70 */     if (paramft.getType() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  75 */     paramDataOutput.writeUTF(paramft.getKey());
/*     */     
/*  77 */     paramft.writeTagContents(paramDataOutput);
/*     */   }
/*     */   
/*     */   public static NBTBase writeTag(byte paramByte) {
/*  81 */     switch (paramByte) {
/*     */       case 0:
/*  83 */         return new hq();
/*     */       case 1:
/*  85 */         return new NBTTagByte();
/*     */       case 2:
/*  87 */         return new NBTTagShort();
/*     */       case 3:
/*  89 */         return new NBTTagInt();
/*     */       case 4:
/*  91 */         return new NBTTagLong();
/*     */       case 5:
/*  93 */         return new NBTTagFloat();
/*     */       case 6:
/*  95 */         return new NBTTagDouble();
/*     */       case 7:
/*  97 */         return new NbtTagByteArray();
/*     */       case 8:
/*  99 */         return new NBTTagString();
/*     */       case 9:
/* 101 */         return new NBTTagList();
/*     */       case 10:
/* 103 */         return new NBTTagCompound();
/*     */     } 
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   public static String readTag(byte paramByte) {
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