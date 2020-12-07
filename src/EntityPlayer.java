/*     */ import java.util.List;
/*     */
/*     */ public class EntityPlayer
/*     */   extends EntityLiving
/*     */ {
    /*  24 */   public fz ai = new fz(this);
    /*  25 */   public byte aj = 0;
    /*  26 */   public int ak = 0;
    public float al;
    /*     */   public float am;
    /*     */   public boolean an = false;
    /*  29 */   public int ao = 0;
    /*     */   public String username;
    /*     */   private int a;

    /*     */
    public void t() {
        super.t();
        this.al = this.am;
        this.am = 0.0F;
    }

    /*     */
    protected void d_() {
        if (this.an) {
            this.ao++;
            if (this.ao == 8) {
                this.ao = 0;
                this.an = false;
            }
        } else {
            this.ao = 0;
        }
        this.aJ = this.ao / 8.0F;
    }

    public void x() {
        if (this.g.j == 0 && this.aK < 20 && this.R % 20 * 4 == 0) a(1);
        this.ai.c();
        this.al = this.am;
        super.x();
        float f1 = fw.a(this.n * this.n + this.p * this.p);
        float f2 = (float) Math.atan(-this.o * 0.20000000298023224D) * 15.0F;
        if (f1 > 0.1F) f1 = 0.1F;
        if (!this.v || this.aK <= 0) f1 = 0.0F;
        if (this.v || this.aK <= 0) f2 = 0.0F;
        this.am += (f1 - this.am) * 0.4F;
        this.aS += (f2 - this.aS) * 0.8F;
        if (this.aK > 0) {
            List<Entity> list = this.g.b(this, this.u.b(1.0D, 0.0D, 1.0D));
            if (list != null) for (int b = 0; b < list.size(); b++)
                /*  34 */
                h(list.get(b));
        }
    }


private void h(Entity paramdb) {
    paramdb.a(this);

}

public EntityPlayer(World paramdp) {
        super(paramdp);
        /*     */
        /*     */
        /* 219 */
        this.a = 0;
        this.B = 1.62F;
        c(paramdp.l + 0.5D, (paramdp.m + 1), paramdp.n + 0.5D, 0.0F, 0.0F);
        this.aK = 20;
        this.aE = "humanoid";
        this.aD = 180.0F;
        this.S = 20;
        this.aB = "/char.png";

    }
/*     */   public void f(Entity paramdb) { a(0.2F, 0.2F); a(this.k, this.l, this.m); this.o = 0.10000000149011612D; if (this.username.equals("Notch")) a(new ItemStack(Item.h, 1), true);  this.ai.f(); if (paramdb != null) { this.n = (-fw.b((this.aO + this.q) * 3.1415927F / 180.0F) * 0.1F); this.p = (-fw.a((this.aO + this.q) * 3.1415927F / 180.0F) * 0.1F); } else { this.n = this.p = 0.0D; }  this.B = 0.1F; }
/*     */   public void b(Entity paramdb, int paramInt) { this.ak += paramInt; }
/* 222 */   public void a(ItemStack paramgc) { a(paramgc, false); } public void a(ItemStack paramgc, boolean paramBoolean) { if (paramgc == null) return;  EntityItem fa = new EntityItem(this.g, this.k, this.l - 0.30000001192092896D + n(), this.m, paramgc); fa.ac = 40; float f = 0.1F; if (paramBoolean) { float f1 = this.Q.nextFloat() * 0.5F; float f2 = this.Q.nextFloat() * 3.1415927F * 2.0F; fa.n = (-fw.a(f2) * f1); fa.p = (fw.b(f2) * f1); fa.o = 0.20000000298023224D; } else { f = 0.3F; fa.n = (-fw.a(this.q / 180.0F * 3.1415927F) * fw.b(this.r / 180.0F * 3.1415927F) * f); fa.p = (fw.b(this.q / 180.0F * 3.1415927F) * fw.b(this.r / 180.0F * 3.1415927F) * f); fa.o = (-fw.a(this.r / 180.0F * 3.1415927F) * f + 0.1F); f = 0.02F; float f1 = this.Q.nextFloat() * 3.1415927F * 2.0F; f *= this.Q.nextFloat(); fa.n += Math.cos(f1) * f; fa.o += ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.1F); fa.p += Math.sin(f1) * f; }  a(fa); } public boolean a(Entity paramdb, int paramInt) { this.aZ = 0;
/* 223 */     if (this.aK <= 0) return false;
/*     */     
/* 225 */     if (this.W > this.aq / 2.0F) return false;
/*     */     
/* 227 */     if (paramdb instanceof eu || paramdb instanceof da) {
/* 228 */       if (this.g.j == 0) paramInt = 0; 
/* 229 */       if (this.g.j == 1) paramInt = paramInt / 3 + 1; 
/* 230 */       if (this.g.j == 3) paramInt = paramInt * 3 / 2;
/*     */     
/*     */     } 
/* 233 */     int i = 25 - this.ai.e();
/* 234 */     int j = paramInt * i + this.a;
/* 235 */     this.ai.b(paramInt);
/* 236 */     paramInt = j / 25;
/* 237 */     this.a = j % 25;
/*     */     
/* 239 */     if (paramInt == 0) return false;
/*     */     
/* 241 */     return super.a(paramdb, paramInt); } protected void a(EntityItem paramfa) { this.g.a(paramfa); } public float a(Block paramet) { float f = this.ai.a(paramet);
/*     */     if (a(Material.f))
/*     */       f /= 5.0F; 
/*     */     if (!this.v)
/*     */       f /= 5.0F; 
/*     */     return f; } public boolean b(Block paramet) { return this.ai.b(paramet); } public void b(NBTTagCompound paramr) { super.b(paramr); } public void a(NBTTagCompound paramr) { super.a(paramr); } public void a(IInventory paramif) {} public void z() {}
/*     */   public void c(Entity paramdb, int paramInt) {}
/*     */   protected float n() {
/*     */     return 0.12F;
/*     */   }
/*     */   public void a(TileEntityFurnace paramcx) {}
/*     */   public void a(TileEntitySign paramhp) {}
/*     */   public ItemStack A() {
/* 254 */     return this.ai.b();
/*     */   }
/*     */   
/*     */   public void B() {
/* 258 */     this.ai.a(this.ai.d, (ItemStack)null);
/*     */   }
/*     */   
/*     */   public double v() {
/* 262 */     return (this.B - 0.5F);
/*     */   }
/*     */   
/*     */   public void y() {
/* 266 */     this.ao = -1;
/* 267 */     this.an = true;
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\eq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */