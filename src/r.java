/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class r extends ft {
/*   7 */   private Map a = new HashMap<Object, Object>();
/*     */   
/*     */   void a(DataOutput paramDataOutput) {
/*  10 */     for (ft ft1 : this.a.values()) {
/*  11 */       ft.a(ft1, paramDataOutput);
/*     */     }
/*  13 */     paramDataOutput.writeByte(0);
/*     */   }
/*     */   
/*     */   void a(DataInput paramDataInput) {
/*  17 */     this.a.clear();
/*     */     ft ft1;
/*  19 */     while ((ft1 = ft.b(paramDataInput)).a() != 0) {
/*  20 */       this.a.put(ft1.c(), ft1);
/*     */     }
/*     */   }
/*     */   
/*     */   public byte a() {
/*  25 */     return 10;
/*     */   }
/*     */   
/*     */   public void a(String paramString, ft paramft) {
/*  29 */     this.a.put(paramString, paramft.m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte paramByte) {
/*  33 */     this.a.put(paramString, (new bj(paramByte)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, short paramShort) {
/*  37 */     this.a.put(paramString, (new ep(paramShort)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt) {
/*  41 */     this.a.put(paramString, (new bb(paramInt)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, long paramLong) {
/*  45 */     this.a.put(paramString, (new d(paramLong)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat) {
/*  49 */     this.a.put(paramString, (new k(paramFloat)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, double paramDouble) {
/*  53 */     this.a.put(paramString, (new dk(paramDouble)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2) {
/*  57 */     this.a.put(paramString1, (new gu(paramString2)).m(paramString1));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte[] paramArrayOfbyte) {
/*  61 */     this.a.put(paramString, (new fc(paramArrayOfbyte)).m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, r paramr) {
/*  65 */     this.a.put(paramString, paramr.m(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, boolean paramBoolean) {
/*  69 */     a(paramString, paramBoolean ? 1 : 0);
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
/*  82 */     return ((bj)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public short c(String paramString) {
/*  86 */     if (!this.a.containsKey(paramString)) return 0; 
/*  87 */     return ((ep)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public int d(String paramString) {
/*  91 */     if (!this.a.containsKey(paramString)) return 0; 
/*  92 */     return ((bb)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public long e(String paramString) {
/*  96 */     if (!this.a.containsKey(paramString)) return 0L; 
/*  97 */     return ((d)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public float f(String paramString) {
/* 101 */     if (!this.a.containsKey(paramString)) return 0.0F; 
/* 102 */     return ((k)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public double g(String paramString) {
/* 106 */     if (!this.a.containsKey(paramString)) return 0.0D; 
/* 107 */     return ((dk)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public String h(String paramString) {
/* 111 */     if (!this.a.containsKey(paramString)) return ""; 
/* 112 */     return ((gu)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public byte[] i(String paramString) {
/* 116 */     if (!this.a.containsKey(paramString)) return new byte[0]; 
/* 117 */     return ((fc)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public r j(String paramString) {
/* 121 */     if (!this.a.containsKey(paramString)) return new r(); 
/* 122 */     return (r)this.a.get(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public de k(String paramString) {
/* 127 */     if (!this.a.containsKey(paramString)) return new de(); 
/* 128 */     return (de)this.a.get(paramString);
/*     */   }
/*     */   
/*     */   public boolean l(String paramString) {
/* 132 */     return (b(paramString) != 0);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 136 */     return "" + this.a.size() + " entries";
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */