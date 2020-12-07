/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockRedstoneWire
/*     */   extends Block
/*     */ {
/*     */   private boolean a = true;
/*     */   
/*     */   public BlockRedstoneWire(int paramInt1, int paramInt2) {
/*  14 */     super(paramInt1, paramInt2, Material.n);
/*  15 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB d(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  23 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  27 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  35 */     return 5;
/*     */   }
/*     */   
/*     */   public boolean a(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  39 */     return paramdp.d(paramInt1, paramInt2 - 1, paramInt3);
/*     */   }
/*     */   
/*     */   private void g(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/*  43 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/*  44 */     int j = 0;
/*     */     
/*  46 */     this.a = false;
/*  47 */     boolean bool = paramdp.o(paramInt1, paramInt2, paramInt3);
/*  48 */     this.a = true;
/*     */     
/*  50 */     if (bool) {
/*  51 */       j = 15;
/*     */     } else {
/*  53 */       for (int b = 0; b < 4; b++) {
/*  54 */         int k = paramInt1;
/*  55 */         int m = paramInt3;
/*  56 */         if (b == 0) k--; 
/*  57 */         if (b == 1) k++; 
/*  58 */         if (b == 2) m--; 
/*  59 */         if (b == 3) m++;
/*     */ 
/*     */         
/*  62 */         j = f(paramdp, k, paramInt2, m, j);
/*  63 */         if (paramdp.d(k, paramInt2, m) && !paramdp.d(paramInt1, paramInt2 + 1, paramInt3)) {
/*  64 */           j = f(paramdp, k, paramInt2 + 1, m, j);
/*  65 */         } else if (!paramdp.d(k, paramInt2, m)) {
/*  66 */           j = f(paramdp, k, paramInt2 - 1, m, j);
/*     */         } 
/*     */       } 
/*  69 */       if (j > 0) { j--; }
/*  70 */       else { j = 0; }
/*     */     
/*     */     } 
/*  73 */     if (i != j) {
/*  74 */       paramdp.b(paramInt1, paramInt2, paramInt3, j);
/*  75 */       paramdp.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/*  77 */       if (j > 0) j--; 
/*  78 */       for (int b = 0; b < 4; b++) {
/*  79 */         int k = paramInt1;
/*  80 */         int m = paramInt3;
/*  81 */         int n = paramInt2 - 1;
/*  82 */         if (b == 0) k--; 
/*  83 */         if (b == 1) k++; 
/*  84 */         if (b == 2) m--; 
/*  85 */         if (b == 3) m++;
/*     */         
/*  87 */         if (paramdp.d(k, paramInt2, m)) n += 2;
/*     */         
/*  89 */         int i1 = f(paramdp, k, paramInt2, m, -1);
/*  90 */         if (i1 >= 0 && i1 != j) {
/*  91 */           g(paramdp, k, paramInt2, m);
/*     */         }
/*  93 */         i1 = f(paramdp, k, n, m, -1);
/*  94 */         if (i1 >= 0 && i1 != j) {
/*  95 */           g(paramdp, k, n, m);
/*     */         }
/*     */       } 
/*     */       
/*  99 */       if (i == 0 || j == 0) {
/* 100 */         paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 101 */         paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/* 102 */         paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/* 103 */         paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/* 104 */         paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */         
/* 106 */         paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/* 107 */         paramdp.g(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 113 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != this.blockId)
/*     */       return; 
/* 115 */     paramdp.g(paramInt1, paramInt2, paramInt3, this.blockId);
/* 116 */     paramdp.g(paramInt1 - 1, paramInt2, paramInt3, this.blockId);
/* 117 */     paramdp.g(paramInt1 + 1, paramInt2, paramInt3, this.blockId);
/* 118 */     paramdp.g(paramInt1, paramInt2, paramInt3 - 1, this.blockId);
/* 119 */     paramdp.g(paramInt1, paramInt2, paramInt3 + 1, this.blockId);
/*     */     
/* 121 */     paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/* 122 */     paramdp.g(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/*     */   }
/*     */   
/*     */   public void onBlockAdded(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 126 */     super.onBlockAdded(paramdp, paramInt1, paramInt2, paramInt3);
/* 127 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/* 128 */     paramdp.g(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/* 129 */     paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/*     */     
/* 131 */     h(paramdp, paramInt1 - 1, paramInt2, paramInt3);
/* 132 */     h(paramdp, paramInt1 + 1, paramInt2, paramInt3);
/* 133 */     h(paramdp, paramInt1, paramInt2, paramInt3 - 1);
/* 134 */     h(paramdp, paramInt1, paramInt2, paramInt3 + 1);
/*     */     
/* 136 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) { h(paramdp, paramInt1 - 1, paramInt2 + 1, paramInt3); }
/* 137 */     else { h(paramdp, paramInt1 - 1, paramInt2 - 1, paramInt3); }
/* 138 */      if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) { h(paramdp, paramInt1 + 1, paramInt2 + 1, paramInt3); }
/* 139 */     else { h(paramdp, paramInt1 + 1, paramInt2 - 1, paramInt3); }
/* 140 */      if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) { h(paramdp, paramInt1, paramInt2 + 1, paramInt3 - 1); }
/* 141 */     else { h(paramdp, paramInt1, paramInt2 - 1, paramInt3 - 1); }
/* 142 */      if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) { h(paramdp, paramInt1, paramInt2 + 1, paramInt3 + 1); }
/* 143 */     else { h(paramdp, paramInt1, paramInt2 - 1, paramInt3 + 1); }
/*     */   
/*     */   }
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3) {
/* 147 */     super.b(paramdp, paramInt1, paramInt2, paramInt3);
/* 148 */     paramdp.g(paramInt1, paramInt2 + 1, paramInt3, this.blockId);
/* 149 */     paramdp.g(paramInt1, paramInt2 - 1, paramInt3, this.blockId);
/* 150 */     g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */     
/* 152 */     h(paramdp, paramInt1 - 1, paramInt2, paramInt3);
/* 153 */     h(paramdp, paramInt1 + 1, paramInt2, paramInt3);
/* 154 */     h(paramdp, paramInt1, paramInt2, paramInt3 - 1);
/* 155 */     h(paramdp, paramInt1, paramInt2, paramInt3 + 1);
/*     */     
/* 157 */     if (paramdp.d(paramInt1 - 1, paramInt2, paramInt3)) { h(paramdp, paramInt1 - 1, paramInt2 + 1, paramInt3); }
/* 158 */     else { h(paramdp, paramInt1 - 1, paramInt2 - 1, paramInt3); }
/* 159 */      if (paramdp.d(paramInt1 + 1, paramInt2, paramInt3)) { h(paramdp, paramInt1 + 1, paramInt2 + 1, paramInt3); }
/* 160 */     else { h(paramdp, paramInt1 + 1, paramInt2 - 1, paramInt3); }
/* 161 */      if (paramdp.d(paramInt1, paramInt2, paramInt3 - 1)) { h(paramdp, paramInt1, paramInt2 + 1, paramInt3 - 1); }
/* 162 */     else { h(paramdp, paramInt1, paramInt2 - 1, paramInt3 - 1); }
/* 163 */      if (paramdp.d(paramInt1, paramInt2, paramInt3 + 1)) { h(paramdp, paramInt1, paramInt2 + 1, paramInt3 + 1); }
/* 164 */     else { h(paramdp, paramInt1, paramInt2 - 1, paramInt3 + 1); }
/*     */   
/*     */   }
/*     */   private int f(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 168 */     if (paramdp.getBlockId(paramInt1, paramInt2, paramInt3) != this.blockId) return paramInt4;
/* 169 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 170 */     if (i > paramInt4) return i; 
/* 171 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public void b(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 175 */     int i = paramdp.getBlockMetadata(paramInt1, paramInt2, paramInt3);
/* 176 */     boolean bool = a(paramdp, paramInt1, paramInt2, paramInt3);
/*     */     
/* 178 */     if (!bool) {
/* 179 */       a_(paramdp, paramInt1, paramInt2, paramInt3, i);
/* 180 */       paramdp.setBlockWithNotify(paramInt1, paramInt2, paramInt3, 0);
/*     */     } else {
/* 182 */       g(paramdp, paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */     
/* 185 */     super.b(paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 189 */     return Item.aA.aQ;
/*     */   }
/*     */   
/*     */   public boolean d(World paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 193 */     if (!this.a) return false; 
/* 194 */     return b((IBlockAccess)paramdp, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 198 */     if (!this.a) return false; 
/* 199 */     if (paramhb.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) return false;
/*     */     
/* 201 */     if (paramInt4 == 1) return true;
/*     */     
/* 203 */     boolean bool1 = (b(paramhb, paramInt1 - 1, paramInt2, paramInt3) || (!paramhb.d(paramInt1 - 1, paramInt2, paramInt3) && b(paramhb, paramInt1 - 1, paramInt2 - 1, paramInt3))) ? true : false;
/* 204 */     boolean bool2 = (b(paramhb, paramInt1 + 1, paramInt2, paramInt3) || (!paramhb.d(paramInt1 + 1, paramInt2, paramInt3) && b(paramhb, paramInt1 + 1, paramInt2 - 1, paramInt3))) ? true : false;
/* 205 */     boolean bool3 = (b(paramhb, paramInt1, paramInt2, paramInt3 - 1) || (!paramhb.d(paramInt1, paramInt2, paramInt3 - 1) && b(paramhb, paramInt1, paramInt2 - 1, paramInt3 - 1))) ? true : false;
/* 206 */     boolean bool4 = (b(paramhb, paramInt1, paramInt2, paramInt3 + 1) || (!paramhb.d(paramInt1, paramInt2, paramInt3 + 1) && b(paramhb, paramInt1, paramInt2 - 1, paramInt3 + 1))) ? true : false;
/* 207 */     if (!paramhb.d(paramInt1, paramInt2 + 1, paramInt3)) {
/* 208 */       if (paramhb.d(paramInt1 - 1, paramInt2, paramInt3) && b(paramhb, paramInt1 - 1, paramInt2 + 1, paramInt3)) bool1 = true; 
/* 209 */       if (paramhb.d(paramInt1 + 1, paramInt2, paramInt3) && b(paramhb, paramInt1 + 1, paramInt2 + 1, paramInt3)) bool2 = true; 
/* 210 */       if (paramhb.d(paramInt1, paramInt2, paramInt3 - 1) && b(paramhb, paramInt1, paramInt2 + 1, paramInt3 - 1)) bool3 = true; 
/* 211 */       if (paramhb.d(paramInt1, paramInt2, paramInt3 + 1) && b(paramhb, paramInt1, paramInt2 + 1, paramInt3 + 1)) bool4 = true;
/*     */     
/*     */     } 
/* 214 */     if (!bool3 && !bool2 && !bool1 && !bool4 && paramInt4 >= 2 && paramInt4 <= 5) return true;
/*     */     
/* 216 */     if (paramInt4 == 2 && bool3 && !bool1 && !bool2) return true; 
/* 217 */     if (paramInt4 == 3 && bool4 && !bool1 && !bool2) return true; 
/* 218 */     if (paramInt4 == 4 && bool1 && !bool3 && !bool4) return true; 
/* 219 */     if (paramInt4 == 5 && bool2 && !bool3 && !bool4) return true;
/*     */     
/* 221 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 225 */     return this.a;
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
/*     */   public static boolean b(IBlockAccess paramhb, int paramInt1, int paramInt2, int paramInt3) {
/* 238 */     int i = paramhb.getBlockId(paramInt1, paramInt2, paramInt3);
/* 239 */     if (i == Block.av.blockId) return true;
/* 240 */     if (i == 0) return false; 
/* 241 */     if (Block.blocksList[i].d()) return true;
/* 242 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */