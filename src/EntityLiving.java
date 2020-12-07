/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityLiving
/*     */   extends Entity
/*     */ {
    /*  18 */   public int aq = 20;
    /*     */   public float ar;
    /*     */   public float as;
    /*     */   public float at;
    /*  22 */   public float au = 0.0F;
    public float av = 0.0F;
    protected float aw;
    protected float ax;
    /*     */   protected float ay;
    /*     */   protected float az;
    /*     */   protected boolean aA = true;
    /*  26 */   protected String aB = "/char.png";
    /*     */   protected boolean aC = true;
    /*  28 */   protected float aD = 0.0F;
    /*  29 */   protected String aE = null;
    /*  30 */   protected float aF = 1.0F;
    /*  31 */   protected int aG = 0;
    /*  32 */   protected float aH = 0.0F;
    /*     */
    /*     */   public float aI;
    /*     */
    /*     */   public float aJ;
    /*     */
    /*     */   public int aK;
    /*     */
    /*     */   public int aL;
    /*     */   private int a;
    /*     */   public int aM;
    /*     */   public int aN;
    /*  44 */   public float aO = 0.0F;
    /*  45 */   public int aP = 0;
    /*  46 */   public int aQ = 0;
    /*     */
    /*     */   public float aR;
    /*     */   public float aS;
    /*     */   protected boolean aT = false;
    /*  51 */   public int aU = -1;
    /*  52 */   public float aV = (float) (Math.random() * 0.8999999761581421D + 0.10000000149011612D);
    public float aW;
    public float aX;
    public float aY;
    protected int aZ;
    protected float ba;
    protected float bb;
    protected float bc;
    /*     */   protected boolean bd;
    /*     */   protected float be;
    /*     */   protected float bf;
    /*     */   private Entity b;
    /*     */   private int ac;

    /*     */
    /*  59 */
    public EntityLiving(World paramdp) {
        super(paramdp);
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /* 472 */
        this.aZ = 0;
        /*     */
        /* 474 */
        this.bd = false;
        /* 475 */
        this.be = 0.0F;
        /* 476 */
        this.bf = 0.7F;
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        /* 522 */
        this.ac = 0;
        this.aK = 10;
        this.d = true;
        this.at = (float) (Math.random() + 1.0D) * 0.01F;
        a(this.k, this.l, this.m);
        this.ar = (float) Math.random() * 12398.0F;
        this.q = (float) (Math.random() * 3.1415927410125732D * 2.0D);
        this.as = 1.0F;
        this.M = 0.5F;
    }

    /*     */
    protected boolean g(Entity paramdb) {
        return (this.g.a(Vec3D.b(this.k, this.l + n(), this.m), Vec3D.b(paramdb.k, paramdb.l + paramdb.n(), paramdb.m)) == null);
    }

    /*     */
    public boolean c_() {
        return !this.A;
    }

    /* 525 */
    public boolean p() {
        return !this.A;
    }

    protected float n() {
        return this.D * 0.85F;
    }

    public int b() {
        return 80;
    }

    public void j() {
        this.aI = this.aJ;
        super.j();
        if (this.Q.nextInt(1000) < this.a++) {
            this.a = -b();
            String str = c();
            if (str != null) this.g.a(this, str, f(), (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
        }
        if (r() && s()) a((Entity) null, 1);
        if (r() && a(Material.f)) {
            this.X--;
            if (this.X == -20) {
                this.X = 0;
                for (int b = 0; b < 8; b++) {
                    float f1 = this.Q.nextFloat() - this.Q.nextFloat();
                    float f2 = this.Q.nextFloat() - this.Q.nextFloat();
                    float f3 = this.Q.nextFloat() - this.Q.nextFloat();
                    this.g.a("bubble", this.k + f1, this.l + f2, this.m + f3, this.n, this.o, this.p);
                }
                a((Entity) null, 2);
            }
            this.T = 0;
        } else {
            this.X = this.U;
        }
        this.aR = this.aS;
        if (this.aQ > 0) this.aQ--;
        if (this.aM > 0) this.aM--;
        if (this.W > 0) this.W--;
        if (this.aK <= 0) {
            this.aP++;
            if (this.aP > 20) {
                F();
                i();
                for (int b = 0; b < 20; b++) {
                    double d1 = this.Q.nextGaussian() * 0.02D;
                    double d2 = this.Q.nextGaussian() * 0.02D;
                    double d3 = this.Q.nextGaussian() * 0.02D;
                    this.g.a("explode", this.k + (this.Q.nextFloat() * this.C * 2.0F) - this.C, this.l + (this.Q.nextFloat() * this.D), this.m + (this.Q.nextFloat() * this.C * 2.0F) - this.C, d1, d2, d3);
                }
            }
        }
        this.az = this.ay;
        this.av = this.au;
        this.s = this.q;
        this.t = this.r;
    }

    public void C() {
        for (int b = 0; b < 20; b++) {
            double d1 = this.Q.nextGaussian() * 0.02D;
            double d2 = this.Q.nextGaussian() * 0.02D;
            double d3 = this.Q.nextGaussian() * 0.02D;
            double d4 = 10.0D;
            this.g.a("explode", this.k + (this.Q.nextFloat() * this.C * 2.0F) - this.C - d1 * d4, this.l + (this.Q.nextFloat() * this.D) - d2 * d4, this.m + (this.Q.nextFloat() * this.C * 2.0F) - this.C - d3 * d4, d1, d2, d3);
        }
    }

    public void t() {
        super.t();
        this.aw = this.ax;
        this.ax = 0.0F;
    }

    public void b_() {
        super.b_();
        x();
        double d1 = this.k - this.h;
        double d2 = this.m - this.j;
        float f1 = fw.a(d1 * d1 + d2 * d2);
        float f2 = this.au;
        float f3 = 0.0F;
        this.aw = this.ax;
        float f4 = 0.0F;
        if (f1 > 0.05F) {
            f4 = 1.0F;
            f3 = f1 * 3.0F;
            f2 = (float) Math.atan2(d2, d1) * 180.0F / 3.1415927F - 90.0F;
        }
        if (this.aJ > 0.0F) f2 = this.q;
        if (!this.v) f4 = 0.0F;
        this.ax += (f4 - this.ax) * 0.3F;
        float f5 = f2 - this.au;
        while (f5 < -180.0F) f5 += 360.0F;
        while (f5 >= 180.0F) f5 -= 360.0F;
        this.au += f5 * 0.3F;
        float f6 = this.q - this.au;
        while (f6 < -180.0F) f6 += 360.0F;
        while (f6 >= 180.0F) f6 -= 360.0F;
        boolean bool = (f6 < -90.0F || f6 >= 90.0F) ? true : false;
        if (f6 < -75.0F) f6 = -75.0F;
        if (f6 >= 75.0F) f6 = 75.0F;
        this.au = this.q - f6;
        if (f6 * f6 > 2500.0F) this.au += f6 * 0.2F;
        if (bool) f3 *= -1.0F;
        while (this.q - this.s < -180.0F) this.s -= 360.0F;
        while (this.q - this.s >= 180.0F) this.s += 360.0F;
        while (this.au - this.av < -180.0F) this.av -= 360.0F;
        while (this.au - this.av >= 180.0F) this.av += 360.0F;
        while (this.r - this.t < -180.0F) this.t -= 360.0F;
        while (this.r - this.t >= 180.0F) this.t += 360.0F;
        this.ay += f3;
    }

    protected void a(float paramFloat1, float paramFloat2) {
        super.a(paramFloat1, paramFloat2);
    }
public void a(int paramInt) {
        if (this.aK <= 0) return;
        this.aK += paramInt;
        if (this.aK > 20) this.aK = 20;
        this.W = this.aq / 2;

    }
public boolean a(Entity paramdb, int paramInt) {
    this.aZ = 0;
    if (this.aK <= 0) return false;
    this.aX = 1.5F;
    if (this.W > this.aq / 2.0F) {
        if (this.aL - paramInt >= this.aK) return false;
        this.aK = this.aL - paramInt;
    } else {
        this.aL = this.aK;
        this.W = this.aq;
        this.aK -= paramInt;
        this.aM = this.aN = 10;
    }
    this.aO = 0.0F;
    if (paramdb != null) {
        double d1 = paramdb.k - this.k;
        double d2 = paramdb.m - this.m;
        while (d1 * d1 + d2 * d2 < 1.0E-4D) {
            d1 = (Math.random() - Math.random()) * 0.01D;
            d2 = (Math.random() - Math.random()) * 0.01D;
        }
        this.aO = (float) (Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - this.q;
        a(paramdb, paramInt, d1, d2);
    } else {
        this.aO = ((int) (Math.random() * 2.0D) * 180);
    }
    if (this.aK <= 0) {
        this.g.a(this, getDeathSound(), f(), (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
        f(paramdb);
    } else {
        this.g.a(this, getHurtSound(), f(), (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
    }
    return true;

}
protected float f() { return 1.0F; }
protected void d_() {
    this.aZ++;
    /*     */
    /* 527 */
    EntityPlayer eq = this.g.a(this, -1.0D);
    /*     */
    /* 529 */
    if (eq != null) {
        /* 530 */
        double d1 = eq.k - this.k;
        /* 531 */
        double d2 = eq.l - this.l;
        /* 532 */
        double d3 = eq.m - this.m;
        /* 533 */
        double d4 = d1 * d1 + d2 * d2 + d3 * d3;
        /*     */
        /* 535 */
        if (d4 > 16384.0D) {
            /* 536 */
            i();
            /*     */
        }
        /*     */
        /* 539 */
        if (this.aZ > 600 && this.Q.nextInt(800) == 0) {
            /* 540 */
            if (d4 < 1024.0D) {
                /* 541 */
                this.aZ = 0;
                /*     */
            } else {
                /* 543 */
                i();
                /*     */
            }
            /*     */
        }
        /*     */
    }
    /*     */
    /* 548 */
    this.ba = 0.0F;
    /* 549 */
    this.bb = 0.0F;
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /* 557 */
    float f = 8.0F;
    /* 558 */
    if (this.Q.nextFloat() < 0.02F) {
        /* 559 */
        eq = this.g.a(this, f);
        /* 560 */
        if (eq != null) {
            /* 561 */
            this.b = eq;
            /* 562 */
            this.ac = 10 + this.Q.nextInt(20);
            /*     */
        } else {
            /* 564 */
            this.bc = (this.Q.nextFloat() - 0.5F) * 20.0F;
            /*     */
        }
        /*     */
    }
    /*     */
    /* 568 */
    if (this.b != null) {
        /* 569 */
        b(this.b, 10.0F);
        /* 570 */
        if (this.ac-- <= 0 || this.b.A || this.b.b(this) > (f * f)) {
            /* 571 */
            this.b = null;
            /*     */
        }
        /*     */
    } else {
        /* 574 */
        if (this.Q.nextFloat() < 0.05F) {
            /* 575 */
            this.bc = (this.Q.nextFloat() - 0.5F) * 20.0F;
            /*     */
        }
        /* 577 */
        this.q += this.bc;
        /* 578 */
        this.r = this.be;
        /*     */
    }
    /*     */
    /* 581 */
    boolean bool1 = m();
    /* 582 */
    boolean bool2 = o();
    /* 583 */
    if (bool1 || bool2) this.bd = (this.Q.nextFloat() < 0.8F);
}
/*     */   protected String c() { return null; }
/*     */   protected String getHurtSound() { return "random.hurt"; }
/*     */   protected String getDeathSound() { return "random.hurt"; }
/* 587 */   public void a(Entity paramdb, int paramInt, double paramDouble1, double paramDouble2) { float f1 = fw.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2); float f2 = 0.4F; this.n /= 2.0D; this.o /= 2.0D; this.p /= 2.0D; this.n -= paramDouble1 / f1 * f2; this.o += 0.4000000059604645D; this.p -= paramDouble2 / f1 * f2; if (this.o > 0.4000000059604645D) this.o = 0.4000000059604645D;  } public void f(Entity paramdb) { if (this.aG > 0 && paramdb != null) paramdb.b(this, this.aG);  this.aT = true; int i = g(); if (i > 0) { int j = this.Q.nextInt(3); for (int b = 0; b < j; b++) a(i, 1);  }  } protected int g() { return 0; } protected void a(float paramFloat) { int i = (int)Math.ceil((paramFloat - 3.0F)); if (i > 0) { a((Entity)null, i); int j = this.g.getBlockId(fw.b(this.k), fw.b(this.l - 0.20000000298023224D - this.B), fw.b(this.m)); if (j > 0) { StepSound bl = (Block.blocksList[j]).bj; this.g.a(this, bl.c(), bl.a() * 0.5F, bl.b() * 0.75F); }  }  } public void c(float paramFloat1, float paramFloat2) { if (m()) { double d = this.l; a(paramFloat1, paramFloat2, 0.02F); c(this.n, this.o, this.p); this.n *= 0.800000011920929D; this.o *= 0.800000011920929D; this.p *= 0.800000011920929D; this.o -= 0.02D; if (this.w && b(this.n, this.o + 0.6000000238418579D - this.l + d, this.p)) this.o = 0.30000001192092896D;  } else if (o()) { double d = this.l; a(paramFloat1, paramFloat2, 0.02F); c(this.n, this.o, this.p); this.n *= 0.5D; this.o *= 0.5D; this.p *= 0.5D; this.o -= 0.02D; if (this.w && b(this.n, this.o + 0.6000000238418579D - this.l + d, this.p)) this.o = 0.30000001192092896D;  } else { float f1 = 0.91F; if (this.v) { f1 = 0.54600006F; int i = this.g.getBlockId(fw.b(this.k), fw.b(this.u.b) - 1, fw.b(this.m)); if (i > 0) f1 = (Block.blocksList[i]).bm * 0.91F;  }  float f2 = 0.16277136F / f1 * f1 * f1; a(paramFloat1, paramFloat2, this.v ? (0.1F * f2) : 0.02F); f1 = 0.91F; if (this.v) { f1 = 0.54600006F; int i = this.g.getBlockId(fw.b(this.k), fw.b(this.u.b) - 1, fw.b(this.m)); if (i > 0) f1 = (Block.blocksList[i]).bm * 0.91F;  }  if (D()) { this.H = 0.0F; if (this.o < -0.15D) this.o = -0.15D;  }  c(this.n, this.o, this.p); if (this.w && D()) this.o = 0.2D;  this.o -= 0.08D; this.o *= 0.9800000190734863D; this.n *= f1; this.p *= f1; }  this.aW = this.aX; double d1 = this.k - this.h; double d2 = this.m - this.j; float f = fw.a(d1 * d1 + d2 * d2) * 4.0F; if (f > 1.0F) f = 1.0F;  this.aX += (f - this.aX) * 0.4F; this.aY += this.aX; } public boolean D() { int i = fw.b(this.k); int j = fw.b(this.u.b); int k = fw.b(this.m); return (this.g.getBlockId(i, j, k) == Block.aF.blockId || this.g.getBlockId(i, j + 1, k) == Block.aF.blockId); } public void a(NBTTagCompound paramr) { paramr.a("Health", (short)this.aK); paramr.a("HurtTime", (short)this.aM); paramr.a("DeathTime", (short)this.aP); paramr.a("AttackTime", (short)this.aQ); } public void b(NBTTagCompound paramr) { this.aK = paramr.c("Health"); if (!paramr.a("Health")) this.aK = 10;  this.aM = paramr.c("HurtTime"); this.aP = paramr.c("DeathTime"); this.aQ = paramr.c("AttackTime"); } public boolean r() { return (!this.A && this.aK > 0); } public void x() { if (this.aK <= 0) { this.bd = false; this.ba = 0.0F; this.bb = 0.0F; this.bc = 0.0F; } else { d_(); }  boolean bool1 = m(); boolean bool2 = o(); if (this.bd) if (bool1) { this.o += 0.03999999910593033D; } else if (bool2) { this.o += 0.03999999910593033D; } else if (this.v) { E(); }   this.ba *= 0.98F; this.bb *= 0.98F; this.bc *= 0.9F; c(this.ba, this.bb); List<Entity> list = this.g.b(this, this.u.b(0.20000000298023224D, 0.0D, 0.20000000298023224D)); if (list != null && list.size() > 0) for (int b = 0; b < list.size(); b++) { Entity db1 = list.get(b); if (db1.p()) db1.c(this);  }   } protected void E() { this.o = 0.41999998688697815D; } public void b(Entity paramdb, float paramFloat) { double d2, d1 = paramdb.k - this.k;
/*     */     
/* 589 */     double d3 = paramdb.m - this.m;
/*     */     
/* 591 */     if (paramdb instanceof EntityLiving) {
/* 592 */       EntityLiving ic1 = (EntityLiving)paramdb;
/* 593 */       d2 = ic1.l + ic1.n() - this.l + n();
/*     */     } else {
/* 595 */       d2 = (paramdb.u.b + paramdb.u.e) / 2.0D - this.l + n();
/*     */     } 
/*     */     
/* 598 */     double d4 = fw.a(d1 * d1 + d3 * d3);
/*     */     
/* 600 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 601 */     float f2 = (float)(Math.atan2(d2, d4) * 180.0D / 3.1415927410125732D);
/* 602 */     this.r = b(this.r, f2, paramFloat);
/* 603 */     this.q = b(this.q, f1, paramFloat); }
/*     */ 
/*     */   
/*     */   private float b(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 607 */     float f = paramFloat2 - paramFloat1;
/* 608 */     while (f < -180.0F)
/* 609 */       f += 360.0F; 
/* 610 */     while (f >= 180.0F)
/* 611 */       f -= 360.0F; 
/* 612 */     if (f > paramFloat3) {
/* 613 */       f = paramFloat3;
/*     */     }
/* 615 */     if (f < -paramFloat3) {
/* 616 */       f = -paramFloat3;
/*     */     }
/* 618 */     return paramFloat1 + f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void F() {}
/*     */   
/*     */   public boolean a() {
/* 625 */     return (this.g.a(this.u) && this.g.a(this, this.u).size() == 0 && !this.g.b(this.u));
/*     */   }
/*     */   
/*     */   protected void k() {
/* 629 */     a((Entity)null, 4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vec3D c(float paramFloat) {
/* 640 */     if (paramFloat == 1.0F) {
/* 641 */       return Vec3D.b(this.k, this.l, this.m);
/*     */     }
/* 643 */     double d1 = this.h + (this.k - this.h) * paramFloat;
/* 644 */     double d2 = this.i + (this.l - this.i) * paramFloat;
/* 645 */     double d3 = this.j + (this.m - this.j) * paramFloat;
/*     */     
/* 647 */     return Vec3D.b(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public Vec3D d(float paramFloat) {
/* 651 */     if (paramFloat == 1.0F) {
/* 652 */       float f7 = fw.b(-this.q * 0.017453292F - 3.1415927F);
/* 653 */       float f8 = fw.a(-this.q * 0.017453292F - 3.1415927F);
/* 654 */       float f9 = -fw.b(-this.r * 0.017453292F);
/* 655 */       float f10 = fw.a(-this.r * 0.017453292F);
/*     */       
/* 657 */       return Vec3D.b((f8 * f9), f10, (f7 * f9));
/*     */     } 
/* 659 */     float f1 = this.t + (this.r - this.t) * paramFloat;
/* 660 */     float f2 = this.s + (this.q - this.s) * paramFloat;
/*     */     
/* 662 */     float f3 = fw.b(-f2 * 0.017453292F - 3.1415927F);
/* 663 */     float f4 = fw.a(-f2 * 0.017453292F - 3.1415927F);
/* 664 */     float f5 = -fw.b(-f1 * 0.017453292F);
/* 665 */     float f6 = fw.a(-f1 * 0.017453292F);
/*     */     
/* 667 */     return Vec3D.b((f4 * f5), f6, (f3 * f5));
/*     */   }
/*     */   
/*     */   public fe a(double paramDouble, float paramFloat) {
/* 671 */     Vec3D as1 = c(paramFloat);
/* 672 */     Vec3D as2 = d(paramFloat);
/* 673 */     Vec3D as3 = as1.c(as2.a * paramDouble, as2.b * paramDouble, as2.c * paramDouble);
/* 674 */     return this.g.a(as1, as3);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ic.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */