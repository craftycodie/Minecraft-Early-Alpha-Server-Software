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
/*     */ public class EntityItem
/*     */   extends Entity
/*     */ {
/*     */   public ItemStack a;
/*     */   private int ae;
/*  19 */   public int b = 0;
/*     */   
/*     */   public int ac;
/*  22 */   private int af = 5;
/*     */   
/*  24 */   public float ad = (float)(Math.random() * Math.PI * 2.0D);
/*     */   
/*     */   public EntityItem(World paramdp, double paramDouble1, double paramDouble2, double paramDouble3, ItemStack paramgc) {
/*  27 */     super(paramdp);
/*  28 */     a(0.25F, 0.25F);
/*  29 */     this.B = this.D / 2.0F;
/*  30 */     a(paramDouble1, paramDouble2, paramDouble3);
/*  31 */     this.a = paramgc;
/*     */     
/*  33 */     this.q = (float)(Math.random() * 360.0D);
/*     */     
/*  35 */     this.n = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  36 */     this.o = 0.20000000298023224D;
/*  37 */     this.p = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  38 */     this.G = false;
/*     */   }
/*     */   
/*     */   public EntityItem(World paramdp) {
/*  42 */     super(paramdp);
/*  43 */     a(0.25F, 0.25F);
/*  44 */     this.B = this.D / 2.0F;
/*     */   }
/*     */   
/*     */   public void b_() {
/*  48 */     super.b_();
/*  49 */     if (this.ac > 0) this.ac--; 
/*  50 */     this.h = this.k;
/*  51 */     this.i = this.l;
/*  52 */     this.j = this.m;
/*     */     
/*  54 */     this.o -= 0.03999999910593033D;
/*  55 */     if (this.g.getBlockMaterial(fw.b(this.k), fw.b(this.l), fw.b(this.m)) == Material.g) {
/*  56 */       this.o = 0.20000000298023224D;
/*  57 */       this.n = ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F);
/*  58 */       this.p = ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F);
/*  59 */       this.g.a(this, "random.fizz", 0.4F, 2.0F + this.Q.nextFloat() * 0.4F);
/*     */     } 
/*  61 */     g(this.k, this.l, this.m);
/*  62 */     m();
/*  63 */     c(this.n, this.o, this.p);
/*     */ 
/*     */     
/*  66 */     float f = 0.98F;
/*  67 */     if (this.v) {
/*  68 */       f = 0.58800006F;
/*  69 */       int i = this.g.getBlockId(fw.b(this.k), fw.b(this.u.b) - 1, fw.b(this.m));
/*  70 */       if (i > 0) {
/*  71 */         f = (Block.blocksList[i]).bm * 0.98F;
/*     */       }
/*     */     } 
/*     */     
/*  75 */     this.n *= f;
/*  76 */     this.o *= 0.9800000190734863D;
/*  77 */     this.p *= f;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     if (this.v) {
/*  99 */       this.o *= -0.5D;
/*     */     }
/*     */     
/* 102 */     this.ae++;
/* 103 */     this.b++;
/* 104 */     if (this.b >= 6000) {
/* 105 */       i();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 110 */     return this.g.a(this.u, Material.f, this);
/*     */   }
/*     */   
/*     */   private boolean g(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 114 */     int i = fw.b(paramDouble1);
/* 115 */     int j = fw.b(paramDouble2);
/* 116 */     int k = fw.b(paramDouble3);
/*     */     
/* 118 */     double d1 = paramDouble1 - i;
/* 119 */     double d2 = paramDouble2 - j;
/* 120 */     double d3 = paramDouble3 - k;
/*     */     
/* 122 */     if (Block.opaqueCubeLookup[this.g.getBlockId(i, j, k)]) {
/* 123 */       boolean bool1 = !Block.opaqueCubeLookup[this.g.getBlockId(i - 1, j, k)] ? true : false;
/* 124 */       boolean bool2 = !Block.opaqueCubeLookup[this.g.getBlockId(i + 1, j, k)] ? true : false;
/* 125 */       boolean bool3 = !Block.opaqueCubeLookup[this.g.getBlockId(i, j - 1, k)] ? true : false;
/* 126 */       boolean bool4 = !Block.opaqueCubeLookup[this.g.getBlockId(i, j + 1, k)] ? true : false;
/* 127 */       boolean bool5 = !Block.opaqueCubeLookup[this.g.getBlockId(i, j, k - 1)] ? true : false;
/* 128 */       boolean bool6 = !Block.opaqueCubeLookup[this.g.getBlockId(i, j, k + 1)] ? true : false;
/*     */       
/* 130 */       int b = -1;
/* 131 */       double d = 9999.0D;
/* 132 */       if (bool1 && d1 < d) {
/* 133 */         d = d1;
/* 134 */         b = 0;
/*     */       } 
/* 136 */       if (bool2 && 1.0D - d1 < d) {
/* 137 */         d = 1.0D - d1;
/* 138 */         b = 1;
/*     */       } 
/* 140 */       if (bool3 && d2 < d) {
/* 141 */         d = d2;
/* 142 */         b = 2;
/*     */       } 
/* 144 */       if (bool4 && 1.0D - d2 < d) {
/* 145 */         d = 1.0D - d2;
/* 146 */         b = 3;
/*     */       } 
/* 148 */       if (bool5 && d3 < d) {
/* 149 */         d = d3;
/* 150 */         b = 4;
/*     */       } 
/* 152 */       if (bool6 && 1.0D - d3 < d) {
/* 153 */         d = 1.0D - d3;
/* 154 */         b = 5;
/*     */       } 
/*     */       
/* 157 */       float f = this.Q.nextFloat() * 0.2F + 0.1F;
/* 158 */       if (b == 0) this.n = -f; 
/* 159 */       if (b == 1) this.n = f; 
/* 160 */       if (b == 2) this.o = -f; 
/* 161 */       if (b == 3) this.o = f; 
/* 162 */       if (b == 4) this.p = -f; 
/* 163 */       if (b == 5) this.p = f;
/*     */     
/*     */     } 
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   protected void b(int paramInt) {
/* 170 */     a((Entity)null, paramInt);
/*     */   }
/*     */   
/*     */   public boolean a(Entity paramdb, int paramInt) {
/* 174 */     this.af -= paramInt;
/* 175 */     if (this.af <= 0) {
/* 176 */       i();
/*     */     }
/* 178 */     return false;
/*     */   }
/*     */   
/*     */   public void a(NBTTagCompound paramr) {
/* 182 */     paramr.a("Health", (short)(byte)this.af);
/* 183 */     paramr.a("Age", (short)this.b);
/* 184 */     paramr.a("Item", this.a.a(new NBTTagCompound()));
/*     */   }
/*     */   
/*     */   public void b(NBTTagCompound paramr) {
/* 188 */     this.af = paramr.c("Health") & 0xFF;
/* 189 */     this.b = paramr.c("Age");
/* 190 */     NBTTagCompound r1 = paramr.j("Item");
/* 191 */     this.a = new ItemStack(r1);
/*     */   }
/*     */   
/*     */   public void a(EntityPlayer parameq) {
/* 195 */     if (this.g.t)
/*     */       return; 
/* 197 */     int i = this.a.a;
/* 198 */     if (this.ac == 0 && parameq.ai.a(this.a)) {
/* 199 */       this.g.a(this, "random.pop", 0.2F, ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 200 */       parameq.c(this, i);
/* 201 */       i();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */