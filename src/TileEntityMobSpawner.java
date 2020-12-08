/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TileEntityMobSpawner
/*     */   extends TileEntity
/*     */ {
/*  10 */   public int e = -1;
/*     */   public String f;
/*  12 */   public double h = 0.0D;
/*     */   public double g;
/*     */   
/*     */   public TileEntityMobSpawner() {
/*  16 */     this.f = "Pig";
/*  17 */     this.e = 20;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  21 */     return (this.a.a(this.b + 0.5D, this.c + 0.5D, this.d + 0.5D, 16.0D) != null);
/*     */   }
/*     */   
/*     */   public void b() {
/*  25 */     this.h = this.g;
/*     */     
/*  27 */     if (!a()) {
/*     */       return;
/*     */     }
/*     */     
/*  31 */     double d1 = (this.b + this.a.k.nextFloat());
/*  32 */     double d2 = (this.c + this.a.k.nextFloat());
/*  33 */     double d3 = (this.d + this.a.k.nextFloat());
/*  34 */     this.a.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  35 */     this.a.a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */ 
/*     */     
/*  38 */     this.g += (1000.0F / (this.e + 200.0F));
/*  39 */     while (this.g > 360.0D) {
/*  40 */       this.g -= 360.0D;
/*  41 */       this.h -= 360.0D;
/*     */     } 
/*     */     
/*  44 */     if (this.e == -1) c();
/*     */     
/*  46 */     if (this.e > 0) {
/*  47 */       this.e--;
/*     */       
/*     */       return;
/*     */     } 
/*  51 */     int b1 = 4;
/*  52 */     for (int b2 = 0; b2 < b1; b2++) {
/*  53 */       EntityLiving ic = (EntityLiving) EntityList.a(this.f, this.a);
/*  54 */       if (ic == null)
/*     */         return; 
/*  56 */       int i = this.a.a(ic.getClass(), AxisAlignedBB.b(this.b, this.c, this.d, (this.b + 1), (this.c + 1), (this.d + 1)).expand(8.0D, 4.0D, 8.0D)).size();
/*  57 */       if (i >= 6) {
/*  58 */         c();
/*     */         
/*     */         return;
/*     */       } 
/*  62 */       if (ic != null) {
/*  63 */         double d4 = this.b + (this.a.k.nextDouble() - this.a.k.nextDouble()) * 4.0D;
/*  64 */         double d5 = (this.c + this.a.k.nextInt(3) - 1);
/*  65 */         double d6 = this.d + (this.a.k.nextDouble() - this.a.k.nextDouble()) * 4.0D;
/*     */         
/*  67 */         ic.c(d4, d5, d6, this.a.k.nextFloat() * 360.0F, 0.0F);
/*     */         
/*  69 */         if (ic.a()) {
/*  70 */           this.a.a(ic);
/*     */           
/*  72 */           for (int b = 0; b < 20; b++) {
/*     */             
/*  74 */             d1 = this.b + 0.5D + (this.a.k.nextFloat() - 0.5D) * 2.0D;
/*  75 */             d2 = this.c + 0.5D + (this.a.k.nextFloat() - 0.5D) * 2.0D;
/*  76 */             d3 = this.d + 0.5D + (this.a.k.nextFloat() - 0.5D) * 2.0D;
/*     */             
/*  78 */             this.a.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  79 */             this.a.a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */           } 
/*     */           
/*  82 */           ic.C();
/*  83 */           c();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  88 */     super.b();
/*     */   }
/*     */   
/*     */   private void c() {
/*  92 */     this.e = 200 + this.a.k.nextInt(600);
/*     */   }
/*     */   
/*     */   public void a(NBTTagCompound paramr) {
/*  96 */     super.a(paramr);
/*  97 */     this.f = paramr.h("EntityId");
/*  98 */     this.e = paramr.getShort("Delay");
/*     */   }
/*     */   
/*     */   public void b(NBTTagCompound paramr) {
/* 102 */     super.b(paramr);
/* 103 */     paramr.a("EntityId", this.f);
/* 104 */     paramr.setShort("Delay", (short)this.e);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */