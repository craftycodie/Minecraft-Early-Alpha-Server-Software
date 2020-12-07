/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ItemStack
/*     */ {
/*  11 */   public int a = 0;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   
/*     */   public ItemStack(Block paramet) {
/*  17 */     this(paramet, 1);
/*     */   }
/*     */   
/*     */   public ItemStack(Block paramet, int paramInt) {
/*  21 */     this(paramet.blockId, paramInt);
/*     */   }
/*     */   
/*     */   public ItemStack(Item paramen) {
/*  25 */     this(paramen, 1);
/*     */   }
/*     */   
/*     */   public ItemStack(Item paramen, int paramInt) {
/*  29 */     this(paramen.aQ, paramInt);
/*     */   }
/*     */   
/*     */   public ItemStack(int paramInt) {
/*  33 */     this(paramInt, 1);
/*     */   }
/*     */   
/*     */   public ItemStack(int paramInt1, int paramInt2) {
/*  37 */     this.c = paramInt1;
/*  38 */     this.a = paramInt2;
/*     */   }
/*     */   
/*     */   public ItemStack(int paramInt1, int paramInt2, int paramInt3) {
/*  42 */     this.c = paramInt1;
/*  43 */     this.a = paramInt2;
/*  44 */     this.d = paramInt3;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack(NBTTagCompound paramr) {
/*  49 */     b(paramr);
/*     */   }
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
/*     */   public Item a() {
/*  63 */     return Item.c[this.c];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(EntityPlayer parameq, World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  71 */     return a().a(this, parameq, paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public float a(Block paramet) {
/*  75 */     return a().a(this, paramet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTTagCompound a(NBTTagCompound paramr) {
/*  83 */     paramr.a("id", (short)this.c);
/*  84 */     paramr.a("Count", (byte)this.a);
/*  85 */     paramr.a("Damage", (short)this.d);
/*  86 */     return paramr;
/*     */   }
/*     */   
/*     */   public void b(NBTTagCompound paramr) {
/*  90 */     this.c = paramr.c("id");
/*  91 */     this.a = paramr.b("Count");
/*  92 */     this.d = paramr.c("Damage");
/*     */   }
/*     */   
/*     */   public int b() {
/*  96 */     return a().a();
/*     */   }
/*     */   
/*     */   public int c() {
/* 100 */     return Item.c[this.c].b();
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 104 */     this.d += paramInt;
/* 105 */     if (this.d > c()) {
/* 106 */       this.a--;
/* 107 */       if (this.a < 0) this.a = 0; 
/* 108 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 117 */     Item.c[this.c].a(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(Block paramet) {
/* 125 */     return Item.c[this.c].a(paramet);
/*     */   }
/*     */   
/*     */   public void a(EntityPlayer parameq) {}
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */