/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class NBTTagCompound extends NBTBase {
/*   7 */   private Map a = new HashMap<Object, Object>();
/*     */   
/*     */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/*  10 */     for (Object ft1 : this.a.values()) {
/*  11 */       NBTBase.writeTag((NBTBase)ft1, paramDataOutput);
/*     */     }
/*  13 */     paramDataOutput.writeByte(0);
/*     */   }
/*     */   
/*     */   void readTagContents(DataInput paramDataInput) throws IOException {
/*  17 */     this.a.clear();
/*     */     NBTBase ft1;
/*  19 */     while ((ft1 = NBTBase.readTag(paramDataInput)).getType() != 0) {
/*  20 */       this.a.put(ft1.getKey(), ft1);
/*     */     }
/*     */   }
/*     */   
/*     */   public byte getType() {
/*  25 */     return 10;
/*     */   }
/*     */   
/*     */   public void a(String paramString, NBTBase paramft) {
/*  29 */     this.a.put(paramString, paramft.setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte paramByte) {
/*  33 */     this.a.put(paramString, (new NBTTagByte(paramByte)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, short paramShort) {
/*  37 */     this.a.put(paramString, (new NBTTagShort(paramShort)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt) {
/*  41 */     this.a.put(paramString, (new NBTTagInt(paramInt)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, long paramLong) {
/*  45 */     this.a.put(paramString, (new NBTTagLong(paramLong)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat) {
/*  49 */     this.a.put(paramString, (new NBTTagFloat(paramFloat)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, double paramDouble) {
/*  53 */     this.a.put(paramString, (new NBTTagDouble(paramDouble)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2) {
/*  57 */     this.a.put(paramString1, (new NBTTagString(paramString2)).setKey(paramString1));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte[] paramArrayOfbyte) {
/*  61 */     this.a.put(paramString, (new NbtTagByteArray(paramArrayOfbyte)).setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, NBTTagCompound paramr) {
/*  65 */     this.a.put(paramString, paramr.setKey(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, boolean paramBoolean) {
/*  69 */     a(paramString, paramBoolean ? (byte)1 : (byte)0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(String paramString) {
/*  77 */     return this.a.containsKey(paramString);
/*     */   }
/*     */   
/*     */   public byte b(String paramString) {
/*  81 */     if (!this.a.containsKey(paramString)) return 0; 
/*  82 */     return ((NBTTagByte)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public short c(String paramString) {
/*  86 */     if (!this.a.containsKey(paramString)) return 0; 
/*  87 */     return ((NBTTagShort)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public int d(String paramString) {
/*  91 */     if (!this.a.containsKey(paramString)) return 0; 
/*  92 */     return ((NBTTagInt)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public long e(String paramString) {
/*  96 */     if (!this.a.containsKey(paramString)) return 0L; 
/*  97 */     return ((NBTTagLong)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public float f(String paramString) {
/* 101 */     if (!this.a.containsKey(paramString)) return 0.0F; 
/* 102 */     return ((NBTTagFloat)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public double g(String paramString) {
/* 106 */     if (!this.a.containsKey(paramString)) return 0.0D; 
/* 107 */     return ((NBTTagDouble)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public String h(String paramString) {
/* 111 */     if (!this.a.containsKey(paramString)) return ""; 
/* 112 */     return ((NBTTagString)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public byte[] i(String paramString) {
/* 116 */     if (!this.a.containsKey(paramString)) return new byte[0]; 
/* 117 */     return ((NbtTagByteArray)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public NBTTagCompound j(String paramString) {
/* 121 */     if (!this.a.containsKey(paramString)) return new NBTTagCompound();
/* 122 */     return (NBTTagCompound)this.a.get(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public NBTTagList k(String paramString) {
/* 127 */     if (!this.a.containsKey(paramString)) return new NBTTagList();
/* 128 */     return (NBTTagList)this.a.get(paramString);
/*     */   }
/*     */   
/*     */   public boolean getBoolean(String paramString) {
/* 132 */     return (b(paramString) != 0);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 136 */     return "" + this.a.size() + " entries";
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\isBlockContainer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */