/*     */ import java.util.Random;
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
/*     */ public class hi
/*     */   implements bf
/*     */ {
/*     */   private Random j;
/*     */   private ej k;
/*     */   private ej l;
/*     */   private ej m;
/*     */   private ej n;
/*     */   private ej o;
/*     */   public ej a;
/*     */   public ej b;
/*     */   public ej c;
/*     */   private dp p;
/*     */   private double[] q;
/*     */   private double[] r;
/*     */   private double[] s;
/*     */   private double[] t;
/*     */   double[] d;
/*     */   double[] e;
/*     */   double[] f;
/*     */   double[] g;
/*     */   double[] h;
/*     */   int[][] i;
/*     */   
/*     */   public hi(dp paramdp, long paramLong) {
/* 138 */     this.r = new double[256];
/* 139 */     this.s = new double[256];
/* 140 */     this.t = new double[256];
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
/* 524 */     this.i = new int[32][32]; this.p = paramdp; this.j = new Random(paramLong); this.k = new ej(this.j, 16); this.l = new ej(this.j, 16); this.m = new ej(this.j, 8); this.n = new ej(this.j, 4); this.o = new ej(this.j, 4); this.a = new ej(this.j, 10); this.b = new ej(this.j, 16); this.c = new ej(this.j, 8);
/*     */   }
/*     */   public void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) { byte b1 = 4; byte b2 = 64; int i = b1 + 1; byte b3 = 17; int j = b1 + 1; this.q = a(this.q, paramInt1 * b1, 0, paramInt2 * b1, i, b3, j); for (byte b4 = 0; b4 < b1; b4++) { for (byte b = 0; b < b1; b++) { for (byte b5 = 0; b5 < 16; b5++) { double d1 = 0.125D; double d2 = this.q[((b4 + 0) * j + b + 0) * b3 + b5 + 0]; double d3 = this.q[((b4 + 0) * j + b + 1) * b3 + b5 + 0]; double d4 = this.q[((b4 + 1) * j + b + 0) * b3 + b5 + 0]; double d5 = this.q[((b4 + 1) * j + b + 1) * b3 + b5 + 0]; double d6 = (this.q[((b4 + 0) * j + b + 0) * b3 + b5 + 1] - d2) * d1; double d7 = (this.q[((b4 + 0) * j + b + 1) * b3 + b5 + 1] - d3) * d1; double d8 = (this.q[((b4 + 1) * j + b + 0) * b3 + b5 + 1] - d4) * d1; double d9 = (this.q[((b4 + 1) * j + b + 1) * b3 + b5 + 1] - d5) * d1; for (byte b6 = 0; b6 < 8; b6++) { double d10 = 0.25D; double d11 = d2; double d12 = d3; double d13 = (d4 - d2) * d10; double d14 = (d5 - d3) * d10; for (byte b7 = 0; b7 < 4; b7++) { int k = b7 + b4 * 4 << 11 | 0 + b * 4 << 7 | b5 * 8 + b6; char c = ''; double d15 = 0.25D; double d16 = d11; double d17 = (d12 - d11) * d15; for (byte b8 = 0; b8 < 4; b8++) {
/*     */                 int m = 0; if (b5 * 8 + b6 < b2)
/*     */                   if (this.p.c && b5 * 8 + b6 >= b2 - 1) {
/*     */                     m = et.aT.ba;
/*     */                   } else {
/*     */                     m = et.B.ba;
/*     */                   }   if (d16 > 0.0D)
/*     */                   m = et.t.ba;  paramArrayOfbyte[k] = (byte)m; k += c; d16 += d17;
/*     */               }  d11 += d13; d12 += d14; }
/*     */              d2 += d6; d3 += d7; d4 += d8; d5 += d9; }
/*     */            }
/*     */          }
/*     */        }
/*     */      }
/*     */   public void b(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) { byte b1 = 64; double d = 0.03125D; this.r = this.n.a(this.r, (paramInt1 * 16), (paramInt2 * 16), 0.0D, 16, 16, 1, d, d, 1.0D); this.s = this.n.a(this.s, (paramInt2 * 16), 109.0134D, (paramInt1 * 16), 16, 1, 16, d, 1.0D, d); this.t = this.o.a(this.t, (paramInt1 * 16), (paramInt2 * 16), 0.0D, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D); for (byte b2 = 0; b2 < 16; b2++) {
/*     */       for (byte b = 0; b < 16; b++) {
/*     */         boolean bool1 = (this.r[b2 + b * 16] + this.j.nextDouble() * 0.2D > 0.0D) ? true : false; boolean bool2 = (this.s[b2 + b * 16] + this.j.nextDouble() * 0.2D > 3.0D) ? true : false; int i = (int)(this.t[b2 + b * 16] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D); int j = -1; byte b3 = (byte)et.u.ba; byte b4 = (byte)et.v.ba; for (byte b5 = 127; b5 >= 0; b5--) {
/*     */           int k = (b2 * 16 + b) * 128 + b5; if (b5 <= 0 + this.j.nextInt(6) - 1) {
/*     */             paramArrayOfbyte[k] = (byte)et.z.ba;
/*     */           } else {
/*     */             byte b6 = paramArrayOfbyte[k]; if (b6 == 0) {
/*     */               j = -1;
/*     */             } else if (b6 == et.t.ba) {
/*     */               if (j == -1) {
/*     */                 if (i <= 0) {
/*     */                   b3 = 0; b4 = (byte)et.t.ba;
/*     */                 } else if (b5 >= b1 - 4 && b5 <= b1 + 1) {
/*     */                   b3 = (byte)et.u.ba; b4 = (byte)et.v.ba; if (bool2)
/*     */                     b3 = 0;  if (bool2)
/*     */                     b4 = (byte)et.F.ba;  if (bool1)
/*     */                     b3 = (byte)et.E.ba;  if (bool1)
/*     */                     b4 = (byte)et.E.ba; 
/*     */                 }  if (b5 < b1 && b3 == 0)
/*     */                   b3 = (byte)et.B.ba;  j = i; if (b5 >= b1 - 1) {
/*     */                   paramArrayOfbyte[k] = b3;
/*     */                 } else {
/*     */                   paramArrayOfbyte[k] = b4;
/*     */                 } 
/*     */               } else if (j > 0) {
/*     */                 j--; paramArrayOfbyte[k] = b4;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }  }
/* 572 */   public hv b(int paramInt1, int paramInt2) { this.j.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L); byte[] arrayOfByte = new byte[32768]; hv hv = new hv(this.p, arrayOfByte, paramInt1, paramInt2); a(paramInt1, paramInt2, arrayOfByte); b(paramInt1, paramInt2, arrayOfByte); c(paramInt1, paramInt2, arrayOfByte); hv.b(); return hv; } protected void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, double paramDouble1, double paramDouble2, double paramDouble3) { a(paramInt1, paramInt2, paramArrayOfbyte, paramDouble1, paramDouble2, paramDouble3, 1.0F + this.j.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D); } public void a(bf parambf, int paramInt1, int paramInt2) { fv fv; em.a = true;
/* 573 */     int i = paramInt1 * 16;
/* 574 */     int j = paramInt2 * 16;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 581 */     this.j.setSeed(this.p.p);
/* 582 */     long l1 = this.j.nextLong() / 2L * 2L + 1L;
/* 583 */     long l2 = this.j.nextLong() / 2L * 2L + 1L;
/* 584 */     this.j.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.p.p);
/* 585 */     double d = 0.25D;
/*     */     int k;
/* 587 */     for (k = 0; k < 8; k++) {
/* 588 */       int n = i + this.j.nextInt(16) + 8;
/* 589 */       int i1 = this.j.nextInt(128);
/* 590 */       int i2 = j + this.j.nextInt(16) + 8;
/* 591 */       (new dc()).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 594 */     for (k = 0; k < 10; k++) {
/* 595 */       int n = i + this.j.nextInt(16);
/* 596 */       int i1 = this.j.nextInt(128);
/* 597 */       int i2 = j + this.j.nextInt(16);
/* 598 */       (new e(32)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 601 */     for (k = 0; k < 20; k++) {
/* 602 */       int n = i + this.j.nextInt(16);
/* 603 */       int i1 = this.j.nextInt(128);
/* 604 */       int i2 = j + this.j.nextInt(16);
/* 605 */       (new dv(et.v.ba, 32)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 608 */     for (k = 0; k < 10; k++) {
/* 609 */       int n = i + this.j.nextInt(16);
/* 610 */       int i1 = this.j.nextInt(128);
/* 611 */       int i2 = j + this.j.nextInt(16);
/* 612 */       (new dv(et.F.ba, 32)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 615 */     for (k = 0; k < 20; k++) {
/* 616 */       int n = i + this.j.nextInt(16);
/* 617 */       int i1 = this.j.nextInt(128);
/* 618 */       int i2 = j + this.j.nextInt(16);
/* 619 */       (new dv(et.I.ba, 16)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 622 */     for (k = 0; k < 20; k++) {
/* 623 */       int n = i + this.j.nextInt(16);
/* 624 */       int i1 = this.j.nextInt(64);
/* 625 */       int i2 = j + this.j.nextInt(16);
/* 626 */       (new dv(et.H.ba, 8)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 629 */     for (k = 0; k < 2; k++) {
/* 630 */       int n = i + this.j.nextInt(16);
/* 631 */       int i1 = this.j.nextInt(32);
/* 632 */       int i2 = j + this.j.nextInt(16);
/* 633 */       (new dv(et.G.ba, 8)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 636 */     for (k = 0; k < 8; k++) {
/* 637 */       int n = i + this.j.nextInt(16);
/* 638 */       int i1 = this.j.nextInt(16);
/* 639 */       int i2 = j + this.j.nextInt(16);
/* 640 */       (new dv(et.aN.ba, 7)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 643 */     for (k = 0; k < 1; k++) {
/* 644 */       int n = i + this.j.nextInt(16);
/* 645 */       int i1 = this.j.nextInt(16);
/* 646 */       int i2 = j + this.j.nextInt(16);
/* 647 */       (new dv(et.aw.ba, 7)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 650 */     d = 0.5D;
/* 651 */     k = (int)((this.c.a(i * d, j * d) / 8.0D + this.j.nextDouble() * 4.0D + 4.0D) / 3.0D);
/* 652 */     if (k < 0) k = 0; 
/* 653 */     if (this.j.nextInt(10) == 0) k++; 
/* 654 */     hl hl = new hl();
/* 655 */     if (this.j.nextInt(10) == 0)
/* 656 */       fv = new fv(); 
/*     */     int m;
/* 658 */     for (m = 0; m < k; m++) {
/* 659 */       int n = i + this.j.nextInt(16) + 8;
/* 660 */       int i1 = j + this.j.nextInt(16) + 8;
/* 661 */       fv.a(1.0D, 1.0D, 1.0D);
/* 662 */       fv.a(this.p, this.j, n, this.p.c(n, i1), i1);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 667 */     for (m = 0; m < 2; m++) {
/* 668 */       int n = i + this.j.nextInt(16) + 8;
/* 669 */       int i1 = this.j.nextInt(128);
/* 670 */       int i2 = j + this.j.nextInt(16) + 8;
/* 671 */       (new an(et.ad.ba)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 674 */     if (this.j.nextInt(2) == 0) {
/* 675 */       m = i + this.j.nextInt(16) + 8;
/* 676 */       int n = this.j.nextInt(128);
/* 677 */       int i1 = j + this.j.nextInt(16) + 8;
/* 678 */       (new an(et.ae.ba)).a(this.p, this.j, m, n, i1);
/*     */     } 
/*     */     
/* 681 */     if (this.j.nextInt(4) == 0) {
/* 682 */       m = i + this.j.nextInt(16) + 8;
/* 683 */       int n = this.j.nextInt(128);
/* 684 */       int i1 = j + this.j.nextInt(16) + 8;
/* 685 */       (new an(et.af.ba)).a(this.p, this.j, m, n, i1);
/*     */     } 
/*     */     
/* 688 */     if (this.j.nextInt(8) == 0) {
/* 689 */       m = i + this.j.nextInt(16) + 8;
/* 690 */       int n = this.j.nextInt(128);
/* 691 */       int i1 = j + this.j.nextInt(16) + 8;
/* 692 */       (new an(et.ag.ba)).a(this.p, this.j, m, n, i1);
/*     */     } 
/*     */     
/* 695 */     for (m = 0; m < 10; m++) {
/* 696 */       int n = i + this.j.nextInt(16) + 8;
/* 697 */       int i1 = this.j.nextInt(128);
/* 698 */       int i2 = j + this.j.nextInt(16) + 8;
/* 699 */       (new fy()).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 702 */     for (m = 0; m < 1; m++) {
/* 703 */       int n = i + this.j.nextInt(16) + 8;
/* 704 */       int i1 = this.j.nextInt(128);
/* 705 */       int i2 = j + this.j.nextInt(16) + 8;
/* 706 */       (new ee()).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 709 */     for (m = 0; m < 50; m++) {
/* 710 */       int n = i + this.j.nextInt(16) + 8;
/* 711 */       int i1 = this.j.nextInt(this.j.nextInt(120) + 8);
/* 712 */       int i2 = j + this.j.nextInt(16) + 8;
/* 713 */       (new hc(et.A.ba)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 716 */     for (m = 0; m < 20; m++) {
/* 717 */       int n = i + this.j.nextInt(16) + 8;
/* 718 */       int i1 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
/* 719 */       int i2 = j + this.j.nextInt(16) + 8;
/* 720 */       (new hc(et.C.ba)).a(this.p, this.j, n, i1, i2);
/*     */     } 
/*     */     
/* 723 */     if (this.p.c) {
/* 724 */       for (m = i + 8 + 0; m < i + 8 + 16; m++) {
/* 725 */         for (int n = j + 8 + 0; n < j + 8 + 16; n++) {
/* 726 */           int i1 = this.p.d(m, n);
/* 727 */           if (i1 > 0 && i1 < 128 && this.p.a(m, i1, n) == 0 && this.p.c(m, i1 - 1, n).c() && 
/* 728 */             this.p.c(m, i1 - 1, n) != hz.r) this.p.d(m, i1, n, et.aS.ba);
/*     */         
/*     */         } 
/*     */       } 
/*     */     }
/* 733 */     em.a = false; }
/*     */   protected void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4) { double d1 = (paramInt1 * 16 + 8); double d2 = (paramInt2 * 16 + 8); float f1 = 0.0F; float f2 = 0.0F; Random random = new Random(this.j.nextLong()); if (paramInt4 <= 0) { byte b = 112; paramInt4 = b - random.nextInt(b / 4); }  boolean bool1 = false; if (paramInt3 == -1) { paramInt3 = paramInt4 / 2; bool1 = true; }  int i = random.nextInt(paramInt4 / 2) + paramInt4 / 4; boolean bool2 = (random.nextInt(6) == 0) ? true : false; for (; paramInt3 < paramInt4; paramInt3++) { double d3 = 1.5D + (fw.a(paramInt3 * 3.1415927F / paramInt4) * paramFloat1 * 1.0F); double d4 = d3 * paramDouble4; float f3 = fw.b(paramFloat3); float f4 = fw.a(paramFloat3); paramDouble1 += (fw.b(paramFloat2) * f3); paramDouble2 += f4; paramDouble3 += (fw.a(paramFloat2) * f3); if (bool2) { paramFloat3 *= 0.92F; } else { paramFloat3 *= 0.7F; }  paramFloat3 += f2 * 0.1F; paramFloat2 += f1 * 0.1F; f2 *= 0.9F; f1 *= 0.75F; f2 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F; f1 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F; if (!bool1 && paramInt3 == i && paramFloat1 > 1.0F) { a(paramInt1, paramInt2, paramArrayOfbyte, paramDouble1, paramDouble2, paramDouble3, random.nextFloat() * 0.5F + 0.5F, paramFloat2 - 1.5707964F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D); a(paramInt1, paramInt2, paramArrayOfbyte, paramDouble1, paramDouble2, paramDouble3, random.nextFloat() * 0.5F + 0.5F, paramFloat2 + 1.5707964F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D); return; }  if (bool1 || random.nextInt(4) != 0) { double d5 = paramDouble1 - d1; double d6 = paramDouble3 - d2; double d7 = (paramInt4 - paramInt3); double d8 = (paramFloat1 + 2.0F + 16.0F); if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8) return;  if (paramDouble1 >= d1 - 16.0D - d3 * 2.0D && paramDouble3 >= d2 - 16.0D - d3 * 2.0D && paramDouble1 <= d1 + 16.0D + d3 * 2.0D && paramDouble3 <= d2 + 16.0D + d3 * 2.0D) { int j = fw.b(paramDouble1 - d3) - paramInt1 * 16 - 1; int k = fw.b(paramDouble1 + d3) - paramInt1 * 16 + 1; int m = fw.b(paramDouble2 - d4) - 1; int n = fw.b(paramDouble2 + d4) + 1; int i1 = fw.b(paramDouble3 - d3) - paramInt2 * 16 - 1; int i2 = fw.b(paramDouble3 + d3) - paramInt2 * 16 + 1; if (j < 0) j = 0;  if (k > 16) k = 16;  if (m < 1) m = 1;  if (n > 120) n = 120;  if (i1 < 0) i1 = 0;  if (i2 > 16) i2 = 16;  boolean bool = false; int i3; for (i3 = j; !bool && i3 < k; i3++) { for (int i4 = i1; !bool && i4 < i2; i4++) { for (int i5 = n + 1; !bool && i5 >= m - 1; i5--) { int i6 = (i3 * 16 + i4) * 128 + i5; if (i5 >= 0 && i5 < 128) { if (paramArrayOfbyte[i6] == et.A.ba || paramArrayOfbyte[i6] == et.B.ba) bool = true;  if (i5 != m - 1 && i3 != j && i3 != k - 1 && i4 != i1 && i4 != i2 - 1) i5 = m;  }  }  }  }  if (!bool) { for (i3 = j; i3 < k; i3++) { double d = ((i3 + paramInt1 * 16) + 0.5D - paramDouble1) / d3; for (int i4 = i1; i4 < i2; i4++) { double d9 = ((i4 + paramInt2 * 16) + 0.5D - paramDouble3) / d3; int i5 = (i3 * 16 + i4) * 128 + n; boolean bool3 = false; for (int i6 = n - 1; i6 >= m; i6--) { double d10 = (i6 + 0.5D - paramDouble2) / d4; if (d10 > -0.7D && d * d + d10 * d10 + d9 * d9 < 1.0D) { byte b = paramArrayOfbyte[i5]; if (b == et.u.ba) bool3 = true;  if (b == et.t.ba || b == et.v.ba || b == et.u.ba) if (i6 < 10) { paramArrayOfbyte[i5] = (byte)et.C.ba; } else { paramArrayOfbyte[i5] = 0; if (bool3 && paramArrayOfbyte[i5 - 1] == et.v.ba) paramArrayOfbyte[i5 - 1] = (byte)et.u.ba;  }   }  i5--; }  }  }  if (bool1) break;  }  }  }  }  }
/*     */   private void c(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) { byte b = 8; this.j.setSeed(this.p.p); long l1 = this.j.nextLong() / 2L * 2L + 1L; long l2 = this.j.nextLong() / 2L * 2L + 1L; for (int i = paramInt1 - b; i <= paramInt1 + b; i++) { for (int j = paramInt2 - b; j <= paramInt2 + b; j++) { this.j.setSeed(i * l1 + j * l2 ^ this.p.p); int k = this.j.nextInt(this.j.nextInt(this.j.nextInt(40) + 1) + 1); if (this.j.nextInt(15) != 0) k = 0;  for (byte b1 = 0; b1 < k; b1++) { double d1 = (i * 16 + this.j.nextInt(16)); double d2 = this.j.nextInt(this.j.nextInt(120) + 8); double d3 = (j * 16 + this.j.nextInt(16)); int m = 1; if (this.j.nextInt(4) == 0) { a(paramInt1, paramInt2, paramArrayOfbyte, d1, d2, d3); m += this.j.nextInt(4); }  for (byte b2 = 0; b2 < m; b2++) { float f1 = this.j.nextFloat() * 3.1415927F * 2.0F; float f2 = (this.j.nextFloat() - 0.5F) * 2.0F / 8.0F; float f3 = this.j.nextFloat() * 2.0F + this.j.nextFloat(); a(paramInt1, paramInt2, paramArrayOfbyte, d1, d2, d3, f3, f1, f2, 0, 0, 1.0D); }  }  }  }  }
/*     */   private double[] a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { if (paramArrayOfdouble == null) paramArrayOfdouble = new double[paramInt4 * paramInt5 * paramInt6];  double d1 = 684.412D; double d2 = 684.412D; this.g = this.a.a(this.g, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 1.0D, 0.0D, 1.0D); this.h = this.b.a(this.h, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 100.0D, 0.0D, 100.0D); this.d = this.m.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D); this.e = this.k.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1); this.f = this.l.a(this.f, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1); byte b1 = 0; byte b2 = 0; for (byte b3 = 0; b3 < paramInt4; b3++) { for (byte b = 0; b < paramInt6; b++) { double d3 = (this.g[b2] + 256.0D) / 512.0D; if (d3 > 1.0D) d3 = 1.0D;  double d4 = 0.0D; double d5 = this.h[b2] / 8000.0D; if (d5 < 0.0D) d5 = -d5;  d5 = d5 * 3.0D - 3.0D; if (d5 < 0.0D) { d5 /= 2.0D; if (d5 < -1.0D) d5 = -1.0D;  d5 /= 1.4D; d5 /= 2.0D; d3 = 0.0D; } else { if (d5 > 1.0D) d5 = 1.0D;  d5 /= 6.0D; }  d3 += 0.5D; d5 = d5 * paramInt5 / 16.0D; double d6 = paramInt5 / 2.0D + d5 * 4.0D; b2++; for (byte b4 = 0; b4 < paramInt5; b4++) { double d7 = 0.0D; double d8 = (b4 - d6) * 12.0D / d3; if (d8 < 0.0D) d8 *= 4.0D;  double d9 = this.e[b1] / 512.0D; double d10 = this.f[b1] / 512.0D; double d11 = (this.d[b1] / 10.0D + 1.0D) / 2.0D; if (d11 < 0.0D) { d7 = d9; } else if (d11 > 1.0D) { d7 = d10; } else { d7 = d9 + (d10 - d9) * d11; }  d7 -= d8; if (b4 > paramInt5 - 4) { double d = ((b4 - paramInt5 - 4) / 3.0F); d7 = d7 * (1.0D - d) + -10.0D * d; }  if (b4 < d4) { double d = (d4 - b4) / 4.0D; if (d < 0.0D) d = 0.0D;  if (d > 1.0D) d = 1.0D;  d7 = d7 * (1.0D - d) + -10.0D * d; }  paramArrayOfdouble[b1] = d7; b1++; }  }  }  return paramArrayOfdouble; }
/* 737 */   public boolean a(int paramInt1, int paramInt2) { return true; } public boolean a(boolean paramBoolean, hg paramhg) { return true; }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 741 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 745 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */