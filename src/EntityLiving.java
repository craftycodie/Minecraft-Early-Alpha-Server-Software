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
    /*     */   public int health;
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
        this.health = 10;
        this.d = true;
        this.at = (float) (Math.random() + 1.0D) * 0.01F;
        setPosition(this.posX, this.posY, this.posZ);
        this.ar = (float) Math.random() * 12398.0F;
        this.rotationYaw = (float) (Math.random() * 3.1415927410125732D * 2.0D);
        this.as = 1.0F;
        this.M = 0.5F;
    }

    /*     */
    protected boolean g(Entity paramdb) {
        return (this.worldObj.a(Vec3D.b(this.posX, this.posY + n(), this.posZ), Vec3D.b(paramdb.posX, paramdb.posY + paramdb.n(), paramdb.posZ)) == null);
    }

    /*     */
    public boolean c_() {
        return !this.isDead;
    }

    /* 525 */
    public boolean p() {
        return !this.isDead;
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
            if (str != null) this.worldObj.playSoundAtEntity(this, str, f(), (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
        }
        if (r() && s()) attackEntityFrom((Entity) null, 1);
        if (r() && a(Material.f)) {
            this.X--;
            if (this.X == -20) {
                this.X = 0;
                for (int b = 0; b < 8; b++) {
                    float f1 = this.Q.nextFloat() - this.Q.nextFloat();
                    float f2 = this.Q.nextFloat() - this.Q.nextFloat();
                    float f3 = this.Q.nextFloat() - this.Q.nextFloat();
                    this.worldObj.a("bubble", this.posX + f1, this.posY + f2, this.posZ + f3, this.motionX, this.motionY, this.motionZ);
                }
                attackEntityFrom((Entity) null, 2);
            }
            this.T = 0;
        } else {
            this.X = this.U;
        }
        this.aR = this.aS;
        if (this.aQ > 0) this.aQ--;
        if (this.aM > 0) this.aM--;
        if (this.W > 0) this.W--;
        if (this.health <= 0) {
            this.aP++;
            if (this.aP > 20) {
                F();
                setEntityDead();
                for (int b = 0; b < 20; b++) {
                    double d1 = this.Q.nextGaussian() * 0.02D;
                    double d2 = this.Q.nextGaussian() * 0.02D;
                    double d3 = this.Q.nextGaussian() * 0.02D;
                    this.worldObj.a("explode", this.posX + (this.Q.nextFloat() * this.C * 2.0F) - this.C, this.posY + (this.Q.nextFloat() * this.D), this.posZ + (this.Q.nextFloat() * this.C * 2.0F) - this.C, d1, d2, d3);
                }
            }
        }
        this.az = this.ay;
        this.av = this.au;
        this.s = this.rotationYaw;
        this.t = this.rotationPitch;
    }

    public void C() {
        for (int b = 0; b < 20; b++) {
            double d1 = this.Q.nextGaussian() * 0.02D;
            double d2 = this.Q.nextGaussian() * 0.02D;
            double d3 = this.Q.nextGaussian() * 0.02D;
            double d4 = 10.0D;
            this.worldObj.a("explode", this.posX + (this.Q.nextFloat() * this.C * 2.0F) - this.C - d1 * d4, this.posY + (this.Q.nextFloat() * this.D) - d2 * d4, this.posZ + (this.Q.nextFloat() * this.C * 2.0F) - this.C - d3 * d4, d1, d2, d3);
        }
    }

    public void t() {
        super.t();
        this.aw = this.ax;
        this.ax = 0.0F;
    }

    public void onUpdate() {
        super.onUpdate();
        x();
        double d1 = this.posX - this.h;
        double d2 = this.posZ - this.j;
        float f1 = MathHelper.a(d1 * d1 + d2 * d2);
        float f2 = this.au;
        float f3 = 0.0F;
        this.aw = this.ax;
        float f4 = 0.0F;
        if (f1 > 0.05F) {
            f4 = 1.0F;
            f3 = f1 * 3.0F;
            f2 = (float) Math.atan2(d2, d1) * 180.0F / 3.1415927F - 90.0F;
        }
        if (this.aJ > 0.0F) f2 = this.rotationYaw;
        if (!this.v) f4 = 0.0F;
        this.ax += (f4 - this.ax) * 0.3F;
        float f5 = f2 - this.au;
        while (f5 < -180.0F) f5 += 360.0F;
        while (f5 >= 180.0F) f5 -= 360.0F;
        this.au += f5 * 0.3F;
        float f6 = this.rotationYaw - this.au;
        while (f6 < -180.0F) f6 += 360.0F;
        while (f6 >= 180.0F) f6 -= 360.0F;
        boolean bool = (f6 < -90.0F || f6 >= 90.0F) ? true : false;
        if (f6 < -75.0F) f6 = -75.0F;
        if (f6 >= 75.0F) f6 = 75.0F;
        this.au = this.rotationYaw - f6;
        if (f6 * f6 > 2500.0F) this.au += f6 * 0.2F;
        if (bool) f3 *= -1.0F;
        while (this.rotationYaw - this.s < -180.0F) this.s -= 360.0F;
        while (this.rotationYaw - this.s >= 180.0F) this.s += 360.0F;
        while (this.au - this.av < -180.0F) this.av -= 360.0F;
        while (this.au - this.av >= 180.0F) this.av += 360.0F;
        while (this.rotationPitch - this.t < -180.0F) this.t -= 360.0F;
        while (this.rotationPitch - this.t >= 180.0F) this.t += 360.0F;
        this.ay += f3;
    }

    protected void setSize(float paramFloat1, float paramFloat2) {
        super.setSize(paramFloat1, paramFloat2);
    }
public void a(int paramInt) {
        if (this.health <= 0) return;
        this.health += paramInt;
        if (this.health > 20) this.health = 20;
        this.W = this.aq / 2;

    }
public boolean attackEntityFrom(Entity paramdb, int paramInt) {
    this.aZ = 0;
    if (this.health <= 0) return false;
    this.aX = 1.5F;
    if (this.W > this.aq / 2.0F) {
        if (this.aL - paramInt >= this.health) return false;
        this.health = this.aL - paramInt;
    } else {
        this.aL = this.health;
        this.W = this.aq;
        this.health -= paramInt;
        this.aM = this.aN = 10;
    }
    this.aO = 0.0F;
    if (paramdb != null) {
        double d1 = paramdb.posX - this.posX;
        double d2 = paramdb.posZ - this.posZ;
        while (d1 * d1 + d2 * d2 < 1.0E-4D) {
            d1 = (Math.random() - Math.random()) * 0.01D;
            d2 = (Math.random() - Math.random()) * 0.01D;
        }
        this.aO = (float) (Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - this.rotationYaw;
        a(paramdb, paramInt, d1, d2);
    } else {
        this.aO = ((int) (Math.random() * 2.0D) * 180);
    }
    if (this.health <= 0) {
        this.worldObj.playSoundAtEntity(this, getDeathSound(), f(), (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
        f(paramdb);
    } else {
        this.worldObj.playSoundAtEntity(this, getHurtSound(), f(), (this.Q.nextFloat() - this.Q.nextFloat()) * 0.2F + 1.0F);
    }
    return true;

}
protected float f() { return 1.0F; }
protected void d_() {
    this.aZ++;
    /*     */
    /* 527 */
    EntityPlayer eq = this.worldObj.a(this, -1.0D);
    /*     */
    /* 529 */
    if (eq != null) {
        /* 530 */
        double d1 = eq.posX - this.posX;
        /* 531 */
        double d2 = eq.posY - this.posY;
        /* 532 */
        double d3 = eq.posZ - this.posZ;
        /* 533 */
        double d4 = d1 * d1 + d2 * d2 + d3 * d3;
        /*     */
        /* 535 */
        if (d4 > 16384.0D) {
            /* 536 */
            setEntityDead();
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
                setEntityDead();
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
        eq = this.worldObj.a(this, f);
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
        if (this.ac-- <= 0 || this.b.isDead || this.b.b(this) > (f * f)) {
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
        this.rotationYaw += this.bc;
        /* 578 */
        this.rotationPitch = this.be;
        /*     */
    }
    /*     */
    /* 581 */
    boolean bool1 = handleWaterMovement();
    /* 582 */
    boolean bool2 = o();
    /* 583 */
    if (bool1 || bool2) this.bd = (this.Q.nextFloat() < 0.8F);
}
/*     */   protected String c() { return null; }
/*     */   protected String getHurtSound() { return "random.hurt"; }
/*     */   protected String getDeathSound() { return "random.hurt"; }
/* 587 */   public void a(Entity paramdb, int paramInt, double paramDouble1, double paramDouble2) { float f1 = MathHelper.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2); float f2 = 0.4F; this.motionX /= 2.0D; this.motionY /= 2.0D; this.motionZ /= 2.0D; this.motionX -= paramDouble1 / f1 * f2; this.motionY += 0.4000000059604645D; this.motionZ -= paramDouble2 / f1 * f2; if (this.motionY > 0.4000000059604645D) this.motionY = 0.4000000059604645D;  } public void f(Entity paramdb) { if (this.aG > 0 && paramdb != null) paramdb.b(this, this.aG);  this.aT = true; int i = g(); if (i > 0) { int j = this.Q.nextInt(3); for (int b = 0; b < j; b++) a(i, 1);  }  } protected int g() { return 0; } protected void a(float paramFloat) { int i = (int)Math.ceil((paramFloat - 3.0F)); if (i > 0) { attackEntityFrom((Entity)null, i); int j = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 0.20000000298023224D - this.yOffset), MathHelper.floor_double(this.posZ)); if (j > 0) { StepSound bl = (Block.blocksList[j]).bj; this.worldObj.playSoundAtEntity(this, bl.c(), bl.a() * 0.5F, bl.b() * 0.75F); }  }  } public void c(float paramFloat1, float paramFloat2) { if (handleWaterMovement()) { double d = this.posY; a(paramFloat1, paramFloat2, 0.02F); c(this.motionX, this.motionY, this.motionZ); this.motionX *= 0.800000011920929D; this.motionY *= 0.800000011920929D; this.motionZ *= 0.800000011920929D; this.motionY -= 0.02D; if (this.w && b(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d, this.motionZ)) this.motionY = 0.30000001192092896D;  } else if (o()) { double d = this.posY; a(paramFloat1, paramFloat2, 0.02F); c(this.motionX, this.motionY, this.motionZ); this.motionX *= 0.5D; this.motionY *= 0.5D; this.motionZ *= 0.5D; this.motionY -= 0.02D; if (this.w && b(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d, this.motionZ)) this.motionY = 0.30000001192092896D;  } else { float f1 = 0.91F; if (this.v) { f1 = 0.54600006F; int i = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.b) - 1, MathHelper.floor_double(this.posZ)); if (i > 0) f1 = (Block.blocksList[i]).bm * 0.91F;  }  float f2 = 0.16277136F / f1 * f1 * f1; a(paramFloat1, paramFloat2, this.v ? (0.1F * f2) : 0.02F); f1 = 0.91F; if (this.v) { f1 = 0.54600006F; int i = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.b) - 1, MathHelper.floor_double(this.posZ)); if (i > 0) f1 = (Block.blocksList[i]).bm * 0.91F;  }  if (D()) { this.H = 0.0F; if (this.motionY < -0.15D) this.motionY = -0.15D;  }  c(this.motionX, this.motionY, this.motionZ); if (this.w && D()) this.motionY = 0.2D;  this.motionY -= 0.08D; this.motionY *= 0.9800000190734863D; this.motionX *= f1; this.motionZ *= f1; }  this.aW = this.aX; double d1 = this.posX - this.h; double d2 = this.posZ - this.j; float f = MathHelper.a(d1 * d1 + d2 * d2) * 4.0F; if (f > 1.0F) f = 1.0F;  this.aX += (f - this.aX) * 0.4F; this.aY += this.aX; } public boolean D() { int i = MathHelper.floor_double(this.posX); int j = MathHelper.floor_double(this.boundingBox.b); int k = MathHelper.floor_double(this.posZ); return (this.worldObj.getBlockId(i, j, k) == Block.aF.blockId || this.worldObj.getBlockId(i, j + 1, k) == Block.aF.blockId); } public void writeEntityToNBT(NBTTagCompound paramr) { paramr.setShort("Health", (short)this.health); paramr.setShort("HurtTime", (short)this.aM); paramr.setShort("DeathTime", (short)this.aP); paramr.setShort("AttackTime", (short)this.aQ); } public void readEntityFromNBT(NBTTagCompound paramr) { this.health = paramr.getShort("Health"); if (!paramr.a("Health")) this.health = 10;  this.aM = paramr.getShort("HurtTime"); this.aP = paramr.getShort("DeathTime"); this.aQ = paramr.getShort("AttackTime"); } public boolean r() { return (!this.isDead && this.health > 0); } public void x() { if (this.health <= 0) { this.bd = false; this.ba = 0.0F; this.bb = 0.0F; this.bc = 0.0F; } else { d_(); }  boolean bool1 = handleWaterMovement(); boolean bool2 = o(); if (this.bd) if (bool1) { this.motionY += 0.03999999910593033D; } else if (bool2) { this.motionY += 0.03999999910593033D; } else if (this.v) { E(); }   this.ba *= 0.98F; this.bb *= 0.98F; this.bc *= 0.9F; c(this.ba, this.bb); List<Entity> list = this.worldObj.b(this, this.boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D)); if (list != null && list.size() > 0) for (int b = 0; b < list.size(); b++) { Entity db1 = list.get(b); if (db1.p()) db1.c(this);  }   } protected void E() { this.motionY = 0.41999998688697815D; } public void b(Entity paramdb, float paramFloat) { double d2, d1 = paramdb.posX - this.posX;
/*     */     
/* 589 */     double d3 = paramdb.posZ - this.posZ;
/*     */     
/* 591 */     if (paramdb instanceof EntityLiving) {
/* 592 */       EntityLiving ic1 = (EntityLiving)paramdb;
/* 593 */       d2 = ic1.posY + ic1.n() - this.posY + n();
/*     */     } else {
/* 595 */       d2 = (paramdb.boundingBox.b + paramdb.boundingBox.e) / 2.0D - this.posY + n();
/*     */     } 
/*     */     
/* 598 */     double d4 = MathHelper.a(d1 * d1 + d3 * d3);
/*     */     
/* 600 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 601 */     float f2 = (float)(Math.atan2(d2, d4) * 180.0D / 3.1415927410125732D);
/* 602 */     this.rotationPitch = b(this.rotationPitch, f2, paramFloat);
/* 603 */     this.rotationYaw = b(this.rotationYaw, f1, paramFloat); }
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
/* 625 */     return (this.worldObj.a(this.boundingBox) && this.worldObj.a(this, this.boundingBox).size() == 0 && !this.worldObj.b(this.boundingBox));
/*     */   }
/*     */   
/*     */   protected void k() {
/* 629 */     attackEntityFrom((Entity)null, 4);
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
/* 641 */       return Vec3D.b(this.posX, this.posY, this.posZ);
/*     */     }
/* 643 */     double d1 = this.h + (this.posX - this.h) * paramFloat;
/* 644 */     double d2 = this.i + (this.posY - this.i) * paramFloat;
/* 645 */     double d3 = this.j + (this.posZ - this.j) * paramFloat;
/*     */     
/* 647 */     return Vec3D.b(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public Vec3D d(float paramFloat) {
/* 651 */     if (paramFloat == 1.0F) {
/* 652 */       float f7 = MathHelper.b(-this.rotationYaw * 0.017453292F - 3.1415927F);
/* 653 */       float f8 = MathHelper.a(-this.rotationYaw * 0.017453292F - 3.1415927F);
/* 654 */       float f9 = -MathHelper.b(-this.rotationPitch * 0.017453292F);
/* 655 */       float f10 = MathHelper.a(-this.rotationPitch * 0.017453292F);
/*     */       
/* 657 */       return Vec3D.b((f8 * f9), f10, (f7 * f9));
/*     */     } 
/* 659 */     float f1 = this.t + (this.rotationPitch - this.t) * paramFloat;
/* 660 */     float f2 = this.s + (this.rotationYaw - this.s) * paramFloat;
/*     */     
/* 662 */     float f3 = MathHelper.b(-f2 * 0.017453292F - 3.1415927F);
/* 663 */     float f4 = MathHelper.a(-f2 * 0.017453292F - 3.1415927F);
/* 664 */     float f5 = -MathHelper.b(-f1 * 0.017453292F);
/* 665 */     float f6 = MathHelper.a(-f1 * 0.017453292F);
/*     */     
/* 667 */     return Vec3D.b((f4 * f5), f6, (f3 * f5));
/*     */   }
/*     */   
/*     */   public fe a(double paramDouble, float paramFloat) {
/* 671 */     Vec3D as1 = c(paramFloat);
/* 672 */     Vec3D as2 = d(paramFloat);
/* 673 */     Vec3D as3 = as1.c(as2.a * paramDouble, as2.b * paramDouble, as2.c * paramDouble);
/* 674 */     return this.worldObj.a(as1, as3);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ic.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */