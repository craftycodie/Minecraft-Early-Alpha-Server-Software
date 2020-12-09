/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Vec3D
/*     */ {
/*   8 */   private static List d = new ArrayList();
/*   9 */   private static int e = 0; public double a;
/*     */   
/*     */   public static Vec3D a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  12 */     return new Vec3D(paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   public double b; public double c;
/*     */   public static void a() {
/*  16 */     e = 0;
/*     */   }
/*     */   
/*     */   public static Vec3D b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  20 */     if (e >= d.size()) {
/*  21 */       d.add(a(0.0D, 0.0D, 0.0D));
/*     */     }
/*  23 */     return ((Vec3D)d.get(e++)).e(paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Vec3D(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  29 */     if (paramDouble1 == -0.0D) paramDouble1 = 0.0D; 
/*  30 */     if (paramDouble2 == -0.0D) paramDouble2 = 0.0D; 
/*  31 */     if (paramDouble3 == -0.0D) paramDouble3 = 0.0D; 
/*  32 */     this.a = paramDouble1;
/*  33 */     this.b = paramDouble2;
/*  34 */     this.c = paramDouble3;
/*     */   }
/*     */   
/*     */   private Vec3D e(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  38 */     this.a = paramDouble1;
/*  39 */     this.b = paramDouble2;
/*  40 */     this.c = paramDouble3;
/*  41 */     return this;
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
/*     */   public Vec3D b() {
/*  62 */     double d = MathHelper.sqrt_double(this.a * this.a + this.b * this.b + this.c * this.c);
/*  63 */     if (d < 1.0E-4D) return b(0.0D, 0.0D, 0.0D); 
/*  64 */     return b(this.a / d, this.b / d, this.c / d);
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
/*     */   public Vec3D c(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  76 */     return b(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3);
/*     */   }
/*     */   
/*     */   public double a(Vec3D paramas) {
/*  80 */     double d1 = paramas.a - this.a;
/*  81 */     double d2 = paramas.b - this.b;
/*  82 */     double d3 = paramas.c - this.c;
/*  83 */     return MathHelper.sqrt_double(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double b(Vec3D paramas) {
/*  87 */     double d1 = paramas.a - this.a;
/*  88 */     double d2 = paramas.b - this.b;
/*  89 */     double d3 = paramas.c - this.c;
/*  90 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double d(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  94 */     double d1 = paramDouble1 - this.a;
/*  95 */     double d2 = paramDouble2 - this.b;
/*  96 */     double d3 = paramDouble3 - this.c;
/*  97 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double c() {
/* 105 */     return MathHelper.sqrt_double(this.a * this.a + this.b * this.b + this.c * this.c);
/*     */   }
/*     */   
/*     */   public Vec3D a(Vec3D paramas, double paramDouble) {
/* 109 */     double d1 = paramas.a - this.a;
/* 110 */     double d2 = paramas.b - this.b;
/* 111 */     double d3 = paramas.c - this.c;
/*     */     
/* 113 */     if (d1 * d1 < 1.0000000116860974E-7D) return null;
/*     */     
/* 115 */     double d4 = (paramDouble - this.a) / d1;
/* 116 */     if (d4 < 0.0D || d4 > 1.0D) return null; 
/* 117 */     return b(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public Vec3D b(Vec3D paramas, double paramDouble) {
/* 121 */     double d1 = paramas.a - this.a;
/* 122 */     double d2 = paramas.b - this.b;
/* 123 */     double d3 = paramas.c - this.c;
/*     */     
/* 125 */     if (d2 * d2 < 1.0000000116860974E-7D) return null;
/*     */     
/* 127 */     double d4 = (paramDouble - this.b) / d2;
/* 128 */     if (d4 < 0.0D || d4 > 1.0D) return null; 
/* 129 */     return b(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public Vec3D c(Vec3D paramas, double paramDouble) {
/* 133 */     double d1 = paramas.a - this.a;
/* 134 */     double d2 = paramas.b - this.b;
/* 135 */     double d3 = paramas.c - this.c;
/*     */     
/* 137 */     if (d3 * d3 < 1.0000000116860974E-7D) return null;
/*     */     
/* 139 */     double d4 = (paramDouble - this.c) / d3;
/* 140 */     if (d4 < 0.0D || d4 > 1.0D) return null; 
/* 141 */     return b(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 145 */     return "(" + this.a + ", " + this.b + ", " + this.c + ")";
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\mobSpawner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */