/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockDoor
/*     */   extends Block
/*     */ {
/*     */   protected BlockDoor(int paramInt, Material paramhz) {
/*  14 */     super(paramInt, paramhz);
/*  15 */     this.aZ = 97;
/*  16 */     if (paramhz == Material.e) this.aZ++;
/*     */     
/*  18 */     float f1 = 0.5F;
/*  19 */     float f2 = 1.0F;
/*  20 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
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
/*     */   public boolean b() {
/*  48 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  56 */     return 7;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  65 */     a(paramdp, paramInt1, paramInt2, paramInt3);
/*  66 */     return super.d(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/*  70 */     b(d(paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3)));
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*  74 */     float f = 0.1875F;
/*  75 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/*  76 */     if (paramInt == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
/*  77 */     if (paramInt == 1) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/*  78 */     if (paramInt == 2) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
/*  79 */     if (paramInt == 3) a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F); 
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/*  83 */     a(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/*  87 */     if (this.blockMaterial == Material.e) return true;
/*     */     
/*  89 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  90 */     if ((i & 0x8) != 0) {
/*  91 */       if (paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3) == this.blockId) {
/*  92 */         a(paramdp, paramInt1, paramInt2 - 1, paramInt3, parameq);
/*     */       }
/*  94 */       return true;
/*     */     } 
/*  96 */     if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) == this.blockId) {
/*  97 */       paramdp.b(paramInt1, paramInt2 + 1, paramInt3, (i ^ 0x4) + 8);
/*     */     }
/*     */     
/* 100 */     paramdp.b(paramInt1, paramInt2, paramInt3, i ^ 0x4);
/* 101 */     paramdp.b(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 103 */     if (Math.random() < 0.5D) {
/* 104 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_open", 1.0F, paramdp.k.nextFloat() * 0.1F + 0.9F);
/*     */     } else {
/* 106 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_close", 1.0F, paramdp.k.nextFloat() * 0.1F + 0.9F);
/*     */     } 
/* 108 */     return true;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 112 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*     */     
/* 114 */     if ((i & 0x8) != 0) {
/* 115 */       if (paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3) == this.blockId) {
/* 116 */         a(paramdp, paramInt1, paramInt2 - 1, paramInt3, paramBoolean);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 121 */     boolean bool = ((paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) & 0x4) > 0);
/* 122 */     if (bool == paramBoolean)
/*     */       return; 
/* 124 */     if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) == this.blockId) {
/* 125 */       paramdp.b(paramInt1, paramInt2 + 1, paramInt3, (i ^ 0x4) + 8);
/*     */     }
/*     */     
/* 128 */     paramdp.b(paramInt1, paramInt2, paramInt3, i ^ 0x4);
/* 129 */     paramdp.b(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 131 */     if (Math.random() < 0.5D) {
/* 132 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_open", 1.0F, paramdp.k.nextFloat() * 0.1F + 0.9F);
/*     */     } else {
/* 134 */       paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_close", 1.0F, paramdp.k.nextFloat() * 0.1F + 0.9F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 140 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 141 */     if ((i & 0x8) != 0) {
/* 142 */       if (paramdp.getBlockId(paramInt1, paramInt2 - 1, paramInt3) != this.blockId) {
/* 143 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       }
/* 145 */       if (paramInt4 > 0 && Block.blocksList[paramInt4].d()) {
/* 146 */         b(paramdp, paramInt1, paramInt2 - 1, paramInt3, paramInt4);
/*     */       }
/*     */     } else {
/* 149 */       boolean bool = false;
/* 150 */       if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) != this.blockId) {
/* 151 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/* 152 */         bool = true;
/*     */       } 
/* 154 */       if (!paramdp.d(paramInt1, paramInt2 - 1, paramInt3)) {
/* 155 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/* 156 */         bool = true;
/* 157 */         if (paramdp.getBlockId(paramInt1, paramInt2 + 1, paramInt3) == this.blockId) {
/* 158 */           paramdp.setBlockWithNotify(paramInt1, paramInt2 + 1, paramInt3, 0);
/*     */         }
/*     */       } 
/* 161 */       if (bool) {
/* 162 */         a_(paramdp, paramInt1, paramInt2, paramInt3, i);
/*     */       }
/* 164 */       else if (paramInt4 > 0 && Block.blocksList[paramInt4].d()) {
/* 165 */         boolean bool1 = (paramdp.o(paramInt1, paramInt2, paramInt3) || paramdp.o(paramInt1, paramInt2 + 1, paramInt3)) ? true : false;
/* 166 */         a(paramdp, paramInt1, paramInt2, paramInt3, bool1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 173 */     if ((paramInt & 0x8) != 0) return 0; 
/* 174 */     if (this.blockMaterial == Material.e) return Item.az.aQ;
/* 175 */     return Item.at.aQ;
/*     */   }
/*     */   
/*     */   public fe a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Vec3D paramas1, Vec3D paramas2) {
/* 179 */     a(paramdp, paramInt1, paramInt2, paramInt3);
/* 180 */     return super.a(paramdp, paramInt1, paramInt2, paramInt3, paramas1, paramas2);
/*     */   }
/*     */   
/*     */   public int d(int paramInt) {
/* 184 */     if ((paramInt & 0x4) == 0) {
/* 185 */       return paramInt - 1 & 0x3;
/*     */     }
/* 187 */     return paramInt & 0x3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 192 */     if (paramInt2 >= 127) return false;
/*     */     
/* 194 */     return (paramdp.d(paramInt1, paramInt2 - 1, paramInt3) && super.a(paramdp, paramInt1, paramInt2, paramInt3) && super.a(paramdp, paramInt1, paramInt2 + 1, paramInt3));
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */