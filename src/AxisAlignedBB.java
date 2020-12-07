/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class AxisAlignedBB
/*     */ {
/*   6 */   private static List g = new ArrayList();
/*   7 */   private static int h = 0; public double a; public double b; public double c;
/*     */   
/*     */   public static AxisAlignedBB a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  10 */     return new AxisAlignedBB(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*     */   }
/*     */   public double d; public double e; public double f;
/*     */   public static void a() {
/*  14 */     h = 0;
/*     */   }
/*     */   
/*     */   public static AxisAlignedBB b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  18 */     if (h >= g.size()) {
/*  19 */       g.add(a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
/*     */     }
/*  21 */     return ((AxisAlignedBB)g.get(h++)).c(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private AxisAlignedBB(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  29 */     this.a = paramDouble1;
/*  30 */     this.b = paramDouble2;
/*  31 */     this.c = paramDouble3;
/*  32 */     this.d = paramDouble4;
/*  33 */     this.e = paramDouble5;
/*  34 */     this.f = paramDouble6;
/*     */   }
/*     */   
/*     */   public AxisAlignedBB c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  38 */     this.a = paramDouble1;
/*  39 */     this.b = paramDouble2;
/*  40 */     this.c = paramDouble3;
/*  41 */     this.d = paramDouble4;
/*  42 */     this.e = paramDouble5;
/*  43 */     this.f = paramDouble6;
/*  44 */     return this;
/*     */   }
/*     */   
/*     */   public AxisAlignedBB a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  48 */     double d1 = this.a;
/*  49 */     double d2 = this.b;
/*  50 */     double d3 = this.c;
/*  51 */     double d4 = this.d;
/*  52 */     double d5 = this.e;
/*  53 */     double d6 = this.f;
/*     */     
/*  55 */     if (paramDouble1 < 0.0D) d1 += paramDouble1; 
/*  56 */     if (paramDouble1 > 0.0D) d4 += paramDouble1;
/*     */     
/*  58 */     if (paramDouble2 < 0.0D) d2 += paramDouble2; 
/*  59 */     if (paramDouble2 > 0.0D) d5 += paramDouble2;
/*     */     
/*  61 */     if (paramDouble3 < 0.0D) d3 += paramDouble3; 
/*  62 */     if (paramDouble3 > 0.0D) d6 += paramDouble3;
/*     */     
/*  64 */     return b(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public AxisAlignedBB b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  68 */     double d1 = this.a - paramDouble1;
/*  69 */     double d2 = this.b - paramDouble2;
/*  70 */     double d3 = this.c - paramDouble3;
/*  71 */     double d4 = this.d + paramDouble1;
/*  72 */     double d5 = this.e + paramDouble2;
/*  73 */     double d6 = this.f + paramDouble3;
/*     */     
/*  75 */     return b(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public AxisAlignedBB c(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  79 */     return b(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3, this.d + paramDouble1, this.e + paramDouble2, this.f + paramDouble3);
/*     */   }
/*     */   
/*     */   public double a(AxisAlignedBB paramcy, double paramDouble) {
/*  83 */     if (paramcy.e <= this.b || paramcy.b >= this.e) return paramDouble; 
/*  84 */     if (paramcy.f <= this.c || paramcy.c >= this.f) return paramDouble;
/*     */     
/*  86 */     if (paramDouble > 0.0D && paramcy.d <= this.a) {
/*  87 */       double d = this.a - paramcy.d;
/*  88 */       if (d < paramDouble) paramDouble = d; 
/*     */     } 
/*  90 */     if (paramDouble < 0.0D && paramcy.a >= this.d) {
/*  91 */       double d = this.d - paramcy.a;
/*  92 */       if (d > paramDouble) paramDouble = d;
/*     */     
/*     */     } 
/*  95 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public double b(AxisAlignedBB paramcy, double paramDouble) {
/*  99 */     if (paramcy.d <= this.a || paramcy.a >= this.d) return paramDouble; 
/* 100 */     if (paramcy.f <= this.c || paramcy.c >= this.f) return paramDouble;
/*     */     
/* 102 */     if (paramDouble > 0.0D && paramcy.e <= this.b) {
/* 103 */       double d = this.b - paramcy.e;
/* 104 */       if (d < paramDouble) paramDouble = d; 
/*     */     } 
/* 106 */     if (paramDouble < 0.0D && paramcy.b >= this.e) {
/* 107 */       double d = this.e - paramcy.b;
/* 108 */       if (d > paramDouble) paramDouble = d;
/*     */     
/*     */     } 
/* 111 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public double c(AxisAlignedBB paramcy, double paramDouble) {
/* 115 */     if (paramcy.d <= this.a || paramcy.a >= this.d) return paramDouble; 
/* 116 */     if (paramcy.e <= this.b || paramcy.b >= this.e) return paramDouble;
/*     */     
/* 118 */     if (paramDouble > 0.0D && paramcy.f <= this.c) {
/* 119 */       double d = this.c - paramcy.f;
/* 120 */       if (d < paramDouble) paramDouble = d; 
/*     */     } 
/* 122 */     if (paramDouble < 0.0D && paramcy.c >= this.f) {
/* 123 */       double d = this.f - paramcy.c;
/* 124 */       if (d > paramDouble) paramDouble = d;
/*     */     
/*     */     } 
/* 127 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public boolean a(AxisAlignedBB paramcy) {
/* 131 */     if (paramcy.d <= this.a || paramcy.a >= this.d) return false; 
/* 132 */     if (paramcy.e <= this.b || paramcy.b >= this.e) return false; 
/* 133 */     if (paramcy.f <= this.c || paramcy.c >= this.f) return false; 
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB d(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 145 */     this.a += paramDouble1;
/* 146 */     this.b += paramDouble2;
/* 147 */     this.c += paramDouble3;
/* 148 */     this.d += paramDouble1;
/* 149 */     this.e += paramDouble2;
/* 150 */     this.f += paramDouble3;
/* 151 */     return this;
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
/*     */   public AxisAlignedBB e(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 176 */     double d1 = this.a;
/* 177 */     double d2 = this.b;
/* 178 */     double d3 = this.c;
/* 179 */     double d4 = this.d;
/* 180 */     double d5 = this.e;
/* 181 */     double d6 = this.f;
/*     */     
/* 183 */     if (paramDouble1 < 0.0D) d1 -= paramDouble1; 
/* 184 */     if (paramDouble1 > 0.0D) d4 -= paramDouble1;
/*     */     
/* 186 */     if (paramDouble2 < 0.0D) d2 -= paramDouble2; 
/* 187 */     if (paramDouble2 > 0.0D) d5 -= paramDouble2;
/*     */     
/* 189 */     if (paramDouble3 < 0.0D) d3 -= paramDouble3; 
/* 190 */     if (paramDouble3 > 0.0D) d6 -= paramDouble3;
/*     */     
/* 192 */     return b(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public AxisAlignedBB b() {
/* 196 */     return b(this.a, this.b, this.c, this.d, this.e, this.f);
/*     */   }
/*     */   
/*     */   public fe a(Vec3D paramas1, Vec3D paramas2) {
/* 200 */     Vec3D as1 = paramas1.a(paramas2, this.a);
/* 201 */     Vec3D as2 = paramas1.a(paramas2, this.d);
/*     */     
/* 203 */     Vec3D as3 = paramas1.b(paramas2, this.b);
/* 204 */     Vec3D as4 = paramas1.b(paramas2, this.e);
/*     */     
/* 206 */     Vec3D as5 = paramas1.c(paramas2, this.c);
/* 207 */     Vec3D as6 = paramas1.c(paramas2, this.f);
/*     */     
/* 209 */     if (!a(as1)) as1 = null; 
/* 210 */     if (!a(as2)) as2 = null; 
/* 211 */     if (!b(as3)) as3 = null; 
/* 212 */     if (!b(as4)) as4 = null; 
/* 213 */     if (!c(as5)) as5 = null; 
/* 214 */     if (!c(as6)) as6 = null;
/*     */     
/* 216 */     Vec3D as7 = null;
/*     */     
/* 218 */     if (as1 != null && (as7 == null || paramas1.b(as1) < paramas1.b(as7))) as7 = as1; 
/* 219 */     if (as2 != null && (as7 == null || paramas1.b(as2) < paramas1.b(as7))) as7 = as2; 
/* 220 */     if (as3 != null && (as7 == null || paramas1.b(as3) < paramas1.b(as7))) as7 = as3; 
/* 221 */     if (as4 != null && (as7 == null || paramas1.b(as4) < paramas1.b(as7))) as7 = as4; 
/* 222 */     if (as5 != null && (as7 == null || paramas1.b(as5) < paramas1.b(as7))) as7 = as5; 
/* 223 */     if (as6 != null && (as7 == null || paramas1.b(as6) < paramas1.b(as7))) as7 = as6;
/*     */     
/* 225 */     if (as7 == null) return null;
/*     */     
/* 227 */     int b = -1;
/*     */     
/* 229 */     if (as7 == as1) b = 4; 
/* 230 */     if (as7 == as2) b = 5; 
/* 231 */     if (as7 == as3) b = 0; 
/* 232 */     if (as7 == as4) b = 1; 
/* 233 */     if (as7 == as5) b = 2; 
/* 234 */     if (as7 == as6) b = 3;
/*     */     
/* 236 */     return new fe(0, 0, 0, b, as7);
/*     */   }
/*     */   
/*     */   private boolean a(Vec3D paramas) {
/* 240 */     if (paramas == null) return false; 
/* 241 */     return (paramas.b >= this.b && paramas.b <= this.e && paramas.c >= this.c && paramas.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean b(Vec3D paramas) {
/* 245 */     if (paramas == null) return false; 
/* 246 */     return (paramas.a >= this.a && paramas.a <= this.d && paramas.c >= this.c && paramas.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean c(Vec3D paramas) {
/* 250 */     if (paramas == null) return false; 
/* 251 */     return (paramas.a >= this.a && paramas.a <= this.d && paramas.b >= this.b && paramas.b <= this.e);
/*     */   }
/*     */   
/*     */   public void b(AxisAlignedBB paramcy) {
/* 255 */     this.a = paramcy.a;
/* 256 */     this.b = paramcy.b;
/* 257 */     this.c = paramcy.c;
/* 258 */     this.d = paramcy.d;
/* 259 */     this.e = paramcy.e;
/* 260 */     this.f = paramcy.f;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */