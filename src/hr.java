/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class hr
/*     */   implements bf
/*     */ {
/*  35 */   private Set a = new HashSet();
/*     */   
/*     */   private hv b;
/*     */   private bf c;
/*     */   private am d;
/*  40 */   private Map e = new HashMap<Object, Object>();
/*  41 */   private List f = new ArrayList();
/*     */   private dp g;
/*     */   
/*     */   public hr(dp paramdp, am paramam, bf parambf) {
/*  45 */     this.b = new hv(paramdp, new byte[32768], 0, 0);
/*  46 */     this.b.q = true;
/*  47 */     this.b.p = true;
/*     */     
/*  49 */     this.g = paramdp;
/*  50 */     this.d = paramam;
/*  51 */     this.c = parambf;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2) {
/*  55 */     ia ia = new ia(paramInt1, paramInt2);
/*  56 */     return this.e.containsKey(ia);
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2) {
/*  60 */     int i = paramInt1 * 16 + 8 - this.g.l;
/*  61 */     int j = paramInt2 * 16 + 8 - this.g.n;
/*  62 */     byte b = 20;
/*  63 */     if (i < -b || i > b || j < -b || j > b) {
/*  64 */       this.a.add(new ia(paramInt1, paramInt2));
/*     */     }
/*     */   }
/*     */   
/*     */   public hv d(int paramInt1, int paramInt2) {
/*  69 */     ia ia = new ia(paramInt1, paramInt2);
/*  70 */     this.a.remove(new ia(paramInt1, paramInt2));
/*     */     
/*  72 */     hv hv1 = (hv)this.e.get(ia);
/*  73 */     if (hv1 == null) {
/*  74 */       hv1 = e(paramInt1, paramInt2);
/*  75 */       if (hv1 == null) {
/*  76 */         if (this.c == null) {
/*  77 */           hv1 = this.b;
/*     */         } else {
/*  79 */           hv1 = this.c.b(paramInt1, paramInt2);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*  84 */       this.e.put(ia, hv1);
/*  85 */       this.f.add(hv1);
/*     */       
/*  87 */       if (hv1 != null) {
/*  88 */         hv1.c();
/*     */       }
/*     */       
/*  91 */       if (!hv1.n && a(paramInt1 + 1, paramInt2 + 1) && a(paramInt1, paramInt2 + 1) && a(paramInt1 + 1, paramInt2)) a(this, paramInt1, paramInt2); 
/*  92 */       if (a(paramInt1 - 1, paramInt2) && !(b(paramInt1 - 1, paramInt2)).n && a(paramInt1 - 1, paramInt2 + 1) && a(paramInt1, paramInt2 + 1) && a(paramInt1 - 1, paramInt2)) a(this, paramInt1 - 1, paramInt2); 
/*  93 */       if (a(paramInt1, paramInt2 - 1) && !(b(paramInt1, paramInt2 - 1)).n && a(paramInt1 + 1, paramInt2 - 1) && a(paramInt1, paramInt2 - 1) && a(paramInt1 + 1, paramInt2)) a(this, paramInt1, paramInt2 - 1); 
/*  94 */       if (a(paramInt1 - 1, paramInt2 - 1) && !(b(paramInt1 - 1, paramInt2 - 1)).n && a(paramInt1 - 1, paramInt2 - 1) && a(paramInt1, paramInt2 - 1) && a(paramInt1 - 1, paramInt2)) a(this, paramInt1 - 1, paramInt2 - 1);
/*     */     
/*     */     } 
/*     */ 
/*     */     
/*  99 */     return hv1;
/*     */   }
/*     */ 
/*     */   
/*     */   public hv b(int paramInt1, int paramInt2) {
/* 104 */     ia ia = new ia(paramInt1, paramInt2);
/* 105 */     hv hv1 = (hv)this.e.get(ia);
/*     */     
/* 107 */     if (hv1 == null) {
/* 108 */       if (this.g.s) {
/* 109 */         return d(paramInt1, paramInt2);
/*     */       }
/* 111 */       return this.b;
/*     */     } 
/*     */     
/* 114 */     return hv1;
/*     */   }
/*     */   
/*     */   private hv e(int paramInt1, int paramInt2) {
/* 118 */     if (this.d == null) return null; 
/*     */     try {
/* 120 */       hv hv1 = this.d.a(this.g, paramInt1, paramInt2);
/* 121 */       if (hv1 != null) {
/* 122 */         hv1.s = this.g.b;
/*     */       }
/* 124 */       return hv1;
/* 125 */     } catch (Exception exception) {
/* 126 */       exception.printStackTrace();
/* 127 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(hv paramhv) {
/* 132 */     if (this.d == null)
/*     */       return;  try {
/* 134 */       this.d.b(this.g, paramhv);
/* 135 */     } catch (Exception exception) {
/* 136 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(hv paramhv) {
/* 141 */     if (this.d == null)
/*     */       return;  try {
/* 143 */       paramhv.s = this.g.b;
/* 144 */       this.d.a(this.g, paramhv);
/* 145 */     } catch (IOException iOException) {
/* 146 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bf parambf, int paramInt1, int paramInt2) {
/* 151 */     hv hv1 = b(paramInt1, paramInt2);
/* 152 */     if (!hv1.n) {
/* 153 */       hv1.n = true;
/* 154 */       if (this.c != null) {
/* 155 */         this.c.a(parambf, paramInt1, paramInt2);
/* 156 */         hv1.e();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(boolean paramBoolean, hg paramhg) {
/* 164 */     byte b1 = 0;
/* 165 */     for (byte b2 = 0; b2 < this.f.size(); b2++) {
/* 166 */       hv hv1 = this.f.get(b2);
/* 167 */       if (paramBoolean && !hv1.p) a(hv1); 
/* 168 */       if (hv1.a(paramBoolean)) {
/* 169 */         b(hv1);
/* 170 */         hv1.o = false;
/* 171 */         if (++b1 == 2 && !paramBoolean) return false;
/*     */       
/*     */       } 
/*     */     } 
/* 175 */     if (paramBoolean) {
/* 176 */       if (this.d == null) return true; 
/* 177 */       this.d.b();
/*     */     } 
/* 179 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 183 */     for (byte b = 0; b < 16; b++) {
/* 184 */       if (!this.a.isEmpty()) {
/* 185 */         ia ia = this.a.iterator().next();
/*     */         
/* 187 */         hv hv1 = b(ia.a, ia.b);
/* 188 */         hv1.d();
/* 189 */         b(hv1);
/* 190 */         a(hv1);
/* 191 */         this.a.remove(ia);
/*     */         
/* 193 */         this.e.remove(ia);
/* 194 */         this.f.remove(hv1);
/*     */       } 
/*     */     } 
/*     */     
/* 198 */     if (this.d != null) this.d.a(); 
/* 199 */     return this.c.a();
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 203 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */