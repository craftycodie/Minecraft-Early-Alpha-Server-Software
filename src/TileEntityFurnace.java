/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TileEntityFurnace
/*     */   extends TileEntity
/*     */   implements IInventory
/*     */ {
/*  13 */   private ItemStack[] e = new ItemStack[3];
/*  14 */   private int f = 0;
/*  15 */   private int g = 0;
/*  16 */   private int h = 0;
/*     */   
/*     */   public int a() {
/*  19 */     return this.e.length;
/*     */   }
/*     */   
/*     */   public ItemStack a(int paramInt) {
/*  23 */     return this.e[paramInt];
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
/*     */   public void a(NBTTagCompound paramr) {
/*  52 */     super.a(paramr);
/*  53 */     NBTTagList de = paramr.k("Items");
/*  54 */     this.e = new ItemStack[a()];
/*  55 */     for (int b = 0; b < de.b(); b++) {
/*  56 */       NBTTagCompound r1 = (NBTTagCompound)de.a(b);
/*  57 */       int b1 = r1.b("Slot");
/*  58 */       if (b1 >= 0 && b1 < this.e.length) this.e[b1] = new ItemStack(r1);
/*     */     
/*     */     } 
/*  61 */     this.f = paramr.getShort("BurnTime");
/*  62 */     this.h = paramr.getShort("CookTime");
/*  63 */     this.g = a(this.e[1]);
/*     */   }
/*     */   
/*     */   public void b(NBTTagCompound paramr) {
/*  67 */     super.b(paramr);
/*  68 */     paramr.setShort("BurnTime", (short)this.f);
/*  69 */     paramr.setShort("CookTime", (short)this.h);
/*  70 */     NBTTagList de = new NBTTagList();
/*     */     
/*  72 */     for (int b = 0; b < this.e.length; b++) {
/*  73 */       if (this.e[b] != null) {
/*  74 */         NBTTagCompound r1 = new NBTTagCompound();
/*  75 */         r1.a("Slot", (byte)b);
/*  76 */         this.e[b].a(r1);
/*  77 */         de.a(r1);
/*     */       } 
/*     */     } 
/*  80 */     paramr.a("Items", de);
/*     */   }
/*     */   
/*     */   public int c() {
/*  84 */     return 64;
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
/*     */   public boolean d() {
/*  97 */     return (this.f > 0);
/*     */   }
/*     */   
/*     */   public void b() {
/* 101 */     boolean bool1 = (this.f > 0) ? true : false;
/* 102 */     boolean bool2 = false;
/* 103 */     if (this.f > 0) {
/* 104 */       this.f--;
/* 105 */       bool2 = true;
/*     */     } 
/*     */     
/* 108 */     if (this.f == 0 && f()) {
/* 109 */       this.g = this.f = a(this.e[1]);
/* 110 */       if (this.f > 0) {
/* 111 */         bool2 = true;
/* 112 */         if (this.e[1] != null) {
/* 113 */           (this.e[1]).stackSize--;
/* 114 */           if ((this.e[1]).stackSize == 0) this.e[1] = null;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/* 119 */     if (d() && f()) {
/* 120 */       this.h++;
/* 121 */       if (this.h == 200) {
/* 122 */         this.h = 0;
/* 123 */         e();
/* 124 */         bool2 = true;
/*     */       } 
/*     */     } else {
/* 127 */       this.h = 0;
/*     */     } 
/*     */     
/* 130 */     if (bool1 != ((this.f > 0) ? true : false)) {
/* 131 */       bool2 = true;
/* 132 */       BlockFurnace.a((this.f > 0), this.a, this.b, this.c, this.d);
/*     */     } 
/*     */     
/* 135 */     if (bool2) this.a.m(this.b, this.c, this.d); 
/*     */   }
/*     */   
/*     */   private boolean f() {
/* 139 */     if (this.e[0] == null) return false; 
/* 140 */     int i = b((this.e[0].a()).aQ);
/* 141 */     if (i < 0) return false; 
/* 142 */     if (this.e[2] == null) return true; 
/* 143 */     if ((this.e[2]).c != i) return false; 
/* 144 */     if ((this.e[2]).stackSize < c() && (this.e[2]).stackSize < this.e[2].b()) return true;
/* 145 */     if ((this.e[2]).stackSize < Item.c[i].a()) return true;
/* 146 */     return false;
/*     */   }
/*     */   
/*     */   public void e() {
/* 150 */     if (!f())
/*     */       return; 
/* 152 */     int i = b((this.e[0].a()).aQ);
/* 153 */     if (this.e[2] == null) { this.e[2] = new ItemStack(i, 1); }
/* 154 */     else if ((this.e[2]).c == i) { (this.e[2]).stackSize++; }
/*     */     
/* 156 */     (this.e[0]).stackSize--;
/* 157 */     if ((this.e[0]).stackSize <= 0) this.e[0] = null;
/*     */   }
/*     */   
/*     */   private int b(int paramInt) {
/* 161 */     if (paramInt == Block.H.blockId) return Item.m.aQ;
/* 162 */     if (paramInt == Block.G.blockId) return Item.n.aQ;
/* 163 */     if (paramInt == Block.aw.blockId) return Item.l.aQ;
/* 164 */     if (paramInt == Block.E.blockId) return Block.M.blockId;
/* 165 */     if (paramInt == Item.ao.aQ) return Item.ap.aQ;
/* 166 */     if (paramInt == Block.w.blockId) return Block.stone.blockId;
///* 167 */     if (paramInt == Item.aG.aQ) return Item.aF.aQ;
/* 168 */     return -1;
/*     */   }
/*     */   
/*     */   private int a(ItemStack paramgc) {
/* 172 */     if (paramgc == null) return 0; 
/* 173 */     int i = (paramgc.a()).aQ;
/*     */     
/* 175 */     if (i < 256 && (Block.blocksList[i]).blockMaterial == Material.c) {
/* 176 */       return 300;
/*     */     }
/*     */     
/* 179 */     if (i == Item.B.aQ) {
/* 180 */       return 100;
/*     */     }
/*     */     
/* 183 */     if (i == Item.k.aQ) return 1600;
/*     */     
/* 185 */     return 0;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */