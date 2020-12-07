/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class gr
/*     */ {
/* 121 */   private List a = new ArrayList();
/* 122 */   private ea b = new ea();
/* 123 */   private List c = new ArrayList();
/*     */   
/*     */   private MinecraftServer d;
/*     */   
/*     */   public gr(MinecraftServer paramMinecraftServer) {
/* 128 */     this.d = paramMinecraftServer;
/*     */   }
/*     */   
/*     */   public void a() {
/* 132 */     for (byte b = 0; b < this.c.size(); b++) {
/* 133 */       ((ab)this.c.get(b)).a();
/*     */     }
/* 135 */     this.c.clear();
/*     */   }
/*     */   
/*     */   private ab a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 139 */     long l = paramInt1 + 2147483647L | paramInt2 + 2147483647L << 32L;
/* 140 */     ab ab = (ab)this.b.a(l);
/* 141 */     if (ab == null && paramBoolean) {
/* 142 */       ab = new ab(this, paramInt1, paramInt2);
/* 143 */       this.b.a(l, ab);
/*     */     } 
/* 145 */     return ab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 150 */     int i = paramInt1 >> 4;
/* 151 */     int j = paramInt3 >> 4;
/* 152 */     ab ab = a(i, j, false);
/* 153 */     if (ab != null) {
/* 154 */       ab.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dq paramdq) {
/* 160 */     this.d.f.a(new ax("§e" + paramdq.ap + " joined the game."));
/*     */     
/* 162 */     int i = (int)paramdq.k >> 4;
/* 163 */     int j = (int)paramdq.m >> 4;
/*     */     
/* 165 */     paramdq.ad = paramdq.k;
/* 166 */     paramdq.ae = paramdq.m;
/*     */     
/* 168 */     for (int k = i - 10; k <= i + 10; k++) {
/* 169 */       for (int m = j - 10; m <= j + 10; m++) {
/* 170 */         a(k, m, true).a(paramdq);
/*     */       }
/*     */     } 
/* 173 */     this.a.add(paramdq);
/*     */   }
/*     */   
/*     */   public void b(dq paramdq) {
/* 177 */     this.d.f.a(new ax("§e" + paramdq.ap + " left the game."));
/* 178 */     int i = (int)paramdq.k >> 4;
/* 179 */     int j = (int)paramdq.m >> 4;
/*     */     
/* 181 */     for (int k = i - 10; k <= i + 10; k++) {
/* 182 */       for (int m = j - 10; m <= j + 10; m++) {
/* 183 */         ab ab = a(k, m, false);
/* 184 */         if (ab != null) ab.b(paramdq); 
/*     */       } 
/*     */     } 
/* 187 */     this.a.remove(paramdq);
/*     */   }
/*     */   
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 191 */     int i = paramInt1 - paramInt3;
/* 192 */     int j = paramInt2 - paramInt4;
/* 193 */     if (i < -10 || i > 10) return false; 
/* 194 */     if (j < -10 || j > 10) return false; 
/* 195 */     return true;
/*     */   }
/*     */   
/*     */   public void c(dq paramdq) {
/* 199 */     int i = (int)paramdq.k >> 4;
/* 200 */     int j = (int)paramdq.m >> 4;
/*     */     
/* 202 */     double d1 = paramdq.ad - paramdq.k;
/* 203 */     double d2 = paramdq.ae - paramdq.m;
/* 204 */     double d3 = d1 * d1 + d2 * d2;
/* 205 */     if (d3 < 64.0D)
/*     */       return; 
/* 207 */     int k = (int)paramdq.ad >> 4;
/* 208 */     int m = (int)paramdq.ae >> 4;
/*     */     
/* 210 */     int n = i - k;
/* 211 */     int i1 = j - m;
/* 212 */     if (n == 0 && i1 == 0)
/*     */       return; 
/* 214 */     for (int i2 = i - 10; i2 <= i + 10; i2++) {
/* 215 */       for (int i3 = j - 10; i3 <= j + 10; i3++) {
/* 216 */         if (!a(i2, i3, k, m)) {
/* 217 */           a(i2, i3, true).a(paramdq);
/*     */         }
/* 219 */         if (!a(i2 - n, i3 - i1, i, j)) {
/* 220 */           ab ab = a(i2 - n, i3 - i1, false);
/* 221 */           if (ab != null) ab.b(paramdq); 
/*     */         } 
/*     */       } 
/*     */     } 
/* 225 */     paramdq.ad = paramdq.k;
/* 226 */     paramdq.ae = paramdq.m;
/*     */   }
/*     */   
/*     */   public int b() {
/* 230 */     return 144;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\gr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */