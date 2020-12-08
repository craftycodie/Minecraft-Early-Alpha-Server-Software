/*     */ public class MetadataChunkBlock {
/*     */   public final EnumSkyBlock a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   public int g;
/*     */   
/*     */   public MetadataChunkBlock(EnumSkyBlock paramcr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  11 */     this.a = paramcr;
/*  12 */     this.b = paramInt1;
/*  13 */     this.c = paramInt2;
/*  14 */     this.d = paramInt3;
/*  15 */     this.e = paramInt4;
/*  16 */     this.f = paramInt5;
/*  17 */     this.g = paramInt6;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(World paramdp) {
/*  22 */     int i = this.e - this.b;
/*  23 */     int j = this.f - this.c;
/*  24 */     int k = this.g - this.d;
/*  25 */     int m = i * j * k;
/*  26 */     if (m > 32768) {
/*     */       return;
/*     */     }
/*  29 */     for (int n = this.b; n <= this.e; n++) {
/*  30 */       for (int i1 = this.d; i1 <= this.g; i1++) {
/*  31 */         if (paramdp.blockExists(n, 0, i1)) {
/*  32 */           for (int i2 = this.c; i2 <= this.f; i2++) {
/*  33 */             if (i2 >= 0 && i2 < 128) {
/*  34 */               int i3 = paramdp.a(this.a, n, i2, i1);
/*     */               
/*  36 */               int i4 = 0;
/*  37 */               int i5 = paramdp.getBlockId(n, i2, i1);
/*  38 */               int i6 = Block.lightOpacity[i5];
/*  39 */               if (i6 == 0) i6 = 1; 
/*  40 */               int i7 = 0;
/*  41 */               if (this.a == EnumSkyBlock.Sky) {
/*  42 */                 if (paramdp.i(n, i2, i1)) i7 = 15; 
/*  43 */               } else if (this.a == EnumSkyBlock.Block) {
/*  44 */                 i7 = Block.s[i5];
/*     */               } 
/*     */               
/*  47 */               if (i6 >= 15 && i7 == 0) {
/*  48 */                 i4 = 0;
/*     */               } else {
/*     */                 
/*  51 */                 int i8 = paramdp.a(this.a, n - 1, i2, i1);
/*  52 */                 int i9 = paramdp.a(this.a, n + 1, i2, i1);
/*  53 */                 int i10 = paramdp.a(this.a, n, i2 - 1, i1);
/*  54 */                 int i11 = paramdp.a(this.a, n, i2 + 1, i1);
/*  55 */                 int i12 = paramdp.a(this.a, n, i2, i1 - 1);
/*  56 */                 int i13 = paramdp.a(this.a, n, i2, i1 + 1);
/*     */                 
/*  58 */                 i4 = i8;
/*  59 */                 if (i9 > i4) i4 = i9; 
/*  60 */                 if (i10 > i4) i4 = i10; 
/*  61 */                 if (i11 > i4) i4 = i11; 
/*  62 */                 if (i12 > i4) i4 = i12; 
/*  63 */                 if (i13 > i4) i4 = i13; 
/*  64 */                 i4 -= i6;
/*  65 */                 if (i4 < 0) i4 = 0;
/*     */                 
/*  67 */                 if (i7 > i4) i4 = i7;
/*     */               
/*     */               } 
/*     */               
/*  71 */               if (i3 != i4) {
/*  72 */                 paramdp.b(this.a, n, i2, i1, i4);
/*  73 */                 int i8 = i4 - 1;
/*  74 */                 if (i8 < 0) i8 = 0; 
/*  75 */                 paramdp.a(this.a, n - 1, i2, i1, i8);
/*  76 */                 paramdp.a(this.a, n, i2 - 1, i1, i8);
/*  77 */                 paramdp.a(this.a, n, i2, i1 - 1, i8);
/*     */                 
/*  79 */                 if (n + 1 >= this.e) paramdp.a(this.a, n + 1, i2, i1, i8); 
/*  80 */                 if (i2 + 1 >= this.f) paramdp.a(this.a, n, i2 + 1, i1, i8); 
/*  81 */                 if (i1 + 1 >= this.g) paramdp.a(this.a, n, i2, i1 + 1, i8);
/*     */               
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  96 */     if (paramInt1 >= this.b && paramInt2 >= this.c && paramInt3 >= this.d && paramInt4 <= this.e && paramInt5 <= this.f && paramInt6 <= this.g) return true;
/*     */     
/*  98 */     int b = 1;
/*  99 */     if (paramInt1 >= this.b - b && paramInt2 >= this.c - b && paramInt3 >= this.d - b && paramInt4 <= this.e + b && paramInt5 <= this.f + b && paramInt6 <= this.g + b) {
/* 100 */       int i = this.e - this.b;
/* 101 */       int j = this.f - this.c;
/* 102 */       int k = this.g - this.d;
/*     */ 
/*     */       
/* 105 */       if (paramInt1 > this.b) paramInt1 = this.b; 
/* 106 */       if (paramInt2 > this.c) paramInt2 = this.c; 
/* 107 */       if (paramInt3 > this.d) paramInt3 = this.d; 
/* 108 */       if (paramInt4 < this.e) paramInt4 = this.e; 
/* 109 */       if (paramInt5 < this.f) paramInt5 = this.f; 
/* 110 */       if (paramInt6 < this.g) paramInt6 = this.g;
/*     */       
/* 112 */       int m = paramInt4 - paramInt1;
/* 113 */       int n = paramInt5 - paramInt2;
/* 114 */       int i1 = paramInt6 - paramInt3;
/*     */       
/* 116 */       int i2 = i * j * k;
/* 117 */       int i3 = m * n * i1;
/* 118 */       if (i3 - i2 <= 2) {
/* 119 */         this.b = paramInt1;
/* 120 */         this.c = paramInt2;
/* 121 */         this.d = paramInt3;
/* 122 */         this.e = paramInt4;
/* 123 */         this.f = paramInt5;
/* 124 */         this.g = paramInt6;
/* 125 */         return true;
/*     */       } 
/*     */     } 
/* 128 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */