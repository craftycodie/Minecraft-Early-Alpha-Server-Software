/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cx
/*     */   extends ap
/*     */   implements if
/*     */ {
/*  13 */   private gc[] e = new gc[3];
/*  14 */   private int f = 0;
/*  15 */   private int g = 0;
/*  16 */   private int h = 0;
/*     */   
/*     */   public int a() {
/*  19 */     return this.e.length;
/*     */   }
/*     */   
/*     */   public gc a(int paramInt) {
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
/*     */   public void a(r paramr) {
/*  52 */     super.a(paramr);
/*  53 */     de de = paramr.k("Items");
/*  54 */     this.e = new gc[a()];
/*  55 */     for (byte b = 0; b < de.b(); b++) {
/*  56 */       r r1 = (r)de.a(b);
/*  57 */       byte b1 = r1.b("Slot");
/*  58 */       if (b1 >= 0 && b1 < this.e.length) this.e[b1] = new gc(r1);
/*     */     
/*     */     } 
/*  61 */     this.f = paramr.c("BurnTime");
/*  62 */     this.h = paramr.c("CookTime");
/*  63 */     this.g = a(this.e[1]);
/*     */   }
/*     */   
/*     */   public void b(r paramr) {
/*  67 */     super.b(paramr);
/*  68 */     paramr.a("BurnTime", (short)this.f);
/*  69 */     paramr.a("CookTime", (short)this.h);
/*  70 */     de de = new de();
/*     */     
/*  72 */     for (byte b = 0; b < this.e.length; b++) {
/*  73 */       if (this.e[b] != null) {
/*  74 */         r r1 = new r();
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
/* 113 */           (this.e[1]).a--;
/* 114 */           if ((this.e[1]).a == 0) this.e[1] = null;
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
/* 132 */       dm.a((this.f > 0), this.a, this.b, this.c, this.d);
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
/* 144 */     if ((this.e[2]).a < c() && (this.e[2]).a < this.e[2].b()) return true; 
/* 145 */     if ((this.e[2]).a < en.c[i].a()) return true; 
/* 146 */     return false;
/*     */   }
/*     */   
/*     */   public void e() {
/* 150 */     if (!f())
/*     */       return; 
/* 152 */     int i = b((this.e[0].a()).aQ);
/* 153 */     if (this.e[2] == null) { this.e[2] = new gc(i, 1); }
/* 154 */     else if ((this.e[2]).c == i) { (this.e[2]).a++; }
/*     */     
/* 156 */     (this.e[0]).a--;
/* 157 */     if ((this.e[0]).a <= 0) this.e[0] = null; 
/*     */   }
/*     */   
/*     */   private int b(int paramInt) {
/* 161 */     if (paramInt == et.H.ba) return en.m.aQ; 
/* 162 */     if (paramInt == et.G.ba) return en.n.aQ; 
/* 163 */     if (paramInt == et.aw.ba) return en.l.aQ; 
/* 164 */     if (paramInt == et.E.ba) return et.M.ba; 
/* 165 */     if (paramInt == en.ao.aQ) return en.ap.aQ; 
/* 166 */     if (paramInt == et.w.ba) return et.t.ba; 
/* 167 */     if (paramInt == en.aG.aQ) return en.aF.aQ; 
/* 168 */     return -1;
/*     */   }
/*     */   
/*     */   private int a(gc paramgc) {
/* 172 */     if (paramgc == null) return 0; 
/* 173 */     int i = (paramgc.a()).aQ;
/*     */     
/* 175 */     if (i < 256 && (et.n[i]).bl == hz.c) {
/* 176 */       return 300;
/*     */     }
/*     */     
/* 179 */     if (i == en.B.aQ) {
/* 180 */       return 100;
/*     */     }
/*     */     
/* 183 */     if (i == en.k.aQ) return 1600;
/*     */     
/* 185 */     return 0;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\cx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */