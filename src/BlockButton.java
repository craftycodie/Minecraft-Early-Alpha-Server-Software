/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockButton
/*     */   extends Block
/*     */ {
/*     */   protected BlockButton(int paramInt1, int paramInt2) {
/*  12 */     super(paramInt1, paramInt2, Material.n);
/*  13 */     a(true);
/*     */   }
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  17 */     return null;
/*     */   }
/*     */   
/*     */   public int c() {
/*  21 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  29 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  37 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3))
/*  38 */       return true; 
/*  39 */     if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3))
/*  40 */       return true; 
/*  41 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1))
/*  42 */       return true; 
/*  43 */     if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) {
/*  44 */       return true;
/*     */     }
/*  46 */     return false;
/*     */   }
/*     */   
/*     */   public void c(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  50 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*     */     
/*  52 */     int j = i & 0x8;
/*  53 */     i &= 0x7;
/*     */     
/*  55 */     if (paramInt4 == 2 && paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) i = 4; 
/*  56 */     if (paramInt4 == 3 && paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/*  57 */     if (paramInt4 == 4 && paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) i = 2; 
/*  58 */     if (paramInt4 == 5 && paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) i = 1;
/*     */     
/*  60 */     paramdp.b(paramInt1, paramInt2, paramInt3, i + j);
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  64 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) {
/*  65 */       paramdp.b(paramInt1, paramInt2, paramInt3, 1);
/*  66 */     } else if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) {
/*  67 */       paramdp.b(paramInt1, paramInt2, paramInt3, 2);
/*  68 */     } else if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) {
/*  69 */       paramdp.b(paramInt1, paramInt2, paramInt3, 3);
/*  70 */     } else if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) {
/*  71 */       paramdp.b(paramInt1, paramInt2, paramInt3, 4);
/*     */     } 
/*  73 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  77 */     if (g(paramdp, paramInt1, paramInt2, paramInt3)) {
/*  78 */       int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3) & 0x7;
/*  79 */       boolean bool = false;
/*     */       
/*  81 */       if (!paramdp.d(paramInt1 - 1, paramInt2, paramInt3) && i == 1) bool = true; 
/*  82 */       if (!paramdp.d(paramInt1 + 1, paramInt2, paramInt3) && i == 2) bool = true; 
/*  83 */       if (!paramdp.d(paramInt1, paramInt2, paramInt3 - 1) && i == 3) bool = true; 
/*  84 */       if (!paramdp.d(paramInt1, paramInt2, paramInt3 + 1) && i == 4) bool = true;
/*     */       
/*  86 */       if (bool) {
/*  87 */         a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/*  88 */         paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  94 */     if (!a(paramdp, paramInt1, paramInt2, paramInt3)) {
/*  95 */       a_(paramdp, paramInt1, paramInt2, paramInt3, paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3));
/*  96 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*  97 */       return false;
/*     */     } 
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   public void a(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 103 */     int i = paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 104 */     int j = i & 0x7;
/* 105 */     boolean bool = ((i & 0x8) > 0) ? true : false;
/*     */     
/* 107 */     float f1 = 0.375F;
/* 108 */     float f2 = 0.625F;
/* 109 */     float f3 = 0.1875F;
/* 110 */     float f4 = 0.125F;
/* 111 */     if (bool) f4 = 0.0625F;
/*     */     
/* 113 */     if (j == 1) {
/* 114 */       a(0.0F, f1, 0.5F - f3, f4, f2, 0.5F + f3);
/* 115 */     } else if (j == 2) {
/* 116 */       a(1.0F - f4, f1, 0.5F - f3, 1.0F, f2, 0.5F + f3);
/* 117 */     } else if (j == 3) {
/* 118 */       a(0.5F - f3, f1, 0.0F, 0.5F + f3, f2, f4);
/* 119 */     } else if (j == 4) {
/* 120 */       a(0.5F - f3, f1, 1.0F - f4, 0.5F + f3, f2, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 125 */     a(paramdp, paramInt1, paramInt2, paramInt3, parameq);
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3, EntityPlayer parameq) {
/* 129 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 130 */     int j = i & 0x7;
/* 131 */     int k = 8 - (i & 0x8);
/* 132 */     if (k == 0) return true;
/*     */     
/* 134 */     paramdp.b(paramInt1, paramInt2, paramInt3, j + k);
/* 135 */     paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 137 */     paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     
/* 139 */     paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 140 */     if (j == 1) {
/* 141 */       paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/* 142 */     } else if (j == 2) {
/* 143 */       paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/* 144 */     } else if (j == 3) {
/* 145 */       paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/* 146 */     } else if (j == 4) {
/* 147 */       paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */     } else {
/* 149 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*     */     } 
/*     */     
/* 152 */     paramdp.h(paramInt1, paramInt2, paramInt3, this.blockId);
/*     */     
/* 154 */     return true;
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 158 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 159 */     if ((i & 0x8) > 0) {
/* 160 */       paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 161 */       int j = i & 0x7;
/* 162 */       if (j == 1) {
/* 163 */         paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/* 164 */       } else if (j == 2) {
/* 165 */         paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/* 166 */       } else if (j == 3) {
/* 167 */         paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/* 168 */       } else if (j == 4) {
/* 169 */         paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */       } else {
/* 171 */         paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*     */       } 
/*     */     } 
/* 174 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 178 */     return ((paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3) & 0x8) > 0);
/*     */   }
/*     */   
/*     */   public boolean d(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 182 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 183 */     if ((i & 0x8) == 0) return false; 
/* 184 */     int j = i & 0x7;
/*     */     
/* 186 */     if (j == 5 && paramInt4 == 1) return true; 
/* 187 */     if (j == 4 && paramInt4 == 2) return true; 
/* 188 */     if (j == 3 && paramInt4 == 3) return true; 
/* 189 */     if (j == 2 && paramInt4 == 4) return true; 
/* 190 */     if (j == 1 && paramInt4 == 5) return true;
/*     */     
/* 192 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 197 */     return true;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 201 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 202 */     if ((i & 0x8) == 0) {
/*     */       return;
/*     */     }
/* 205 */     paramdp.b(paramInt1, paramInt2, paramInt3, i & 0x7);
/*     */     
/* 207 */     paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 208 */     int j = i & 0x7;
/* 209 */     if (j == 1) {
/* 210 */       paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/* 211 */     } else if (j == 2) {
/* 212 */       paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/* 213 */     } else if (j == 3) {
/* 214 */       paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/* 215 */     } else if (j == 4) {
/* 216 */       paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */     } else {
/* 218 */       paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*     */     } 
/*     */     
/* 221 */     paramdp.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/* 222 */     paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\field_420_ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */