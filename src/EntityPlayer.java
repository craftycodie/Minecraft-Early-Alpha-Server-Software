/*     */ import java.util.List;
/*     */
/*     */ public class EntityPlayer
/*     */   extends EntityLiving
/*     */ {
    /*  24 */   public fz inventory = new fz(this);
    /*  25 */   public byte aj = 0;
    /*  26 */   public int ak = 0;
    public float field_9150_ao;
    /*     */   public float field_9149_ap;
    /*     */   public boolean an = false;
    /*  29 */   public int ao = 0;
    /*     */   public String username;
    /*     */   private int a;

    /*     */
    public void t() {
        super.t();
        this.field_9150_ao = this.field_9149_ap;
        this.field_9149_ap = 0.0F;
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

    public void onLivingUpdate() {
        if(worldObj.difficultySetting == 0 && health < 20 && (ticksExisted % 20) * 12 == 0)
        {
            heal(1);
        }
        inventory.decrementAnimations();
        field_9150_ao = field_9149_ap;
        super.onLivingUpdate();
        float f = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
        float f1 = (float)Math.atan(-motionY * 0.20000000298023224D) * 15F;
        if(f > 0.1F)
        {
            f = 0.1F;
        }
        if(!onGround || health <= 0)
        {
            f = 0.0F;
        }
        if(onGround || health <= 0)
        {
            f1 = 0.0F;
        }
        field_9149_ap += (f - field_9149_ap) * 0.4F;
        field_9101_aY += (f1 - field_9101_aY) * 0.8F;
        if(health > 0)
        {
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.offset(0, -2, 0).expand(1.0D, 0.0D, 1.0D));
            if(list != null)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    Entity entity = (Entity)list.get(i);
                    if(!entity.isDead)
                    {
                        unknownPickupRelated(entity);
                    }
                }

            }
        }

//        if (this.worldObj.difficultySetting == 0 && this.health < 20 && this.ticksExisted % 20 * 4 == 0)
//            heal(1);
//        this.inventory.decrementAnimations();
//        this.field_9150_ao = this.field_9149_ap;
//        super.onLivingUpdate();
//        float f1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
//        float f2 = (float) Math.atan(-this.motionY * 0.20000000298023224D) * 15.0F;
//        if (f1 > 0.1F) f1 = 0.1F;
//        if (!this.onGround || this.health <= 0) f1 = 0.0F;
//        if (this.onGround || this.health <= 0) f2 = 0.0F;
//        this.field_9149_ap += (f1 - this.field_9149_ap) * 0.4F;
//        this.field_9101_aY += (f2 - this.field_9101_aY) * 0.8F;
//
//        if (health > 0) {
//            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(1.0D, 0.0D, 1.0D));
//            if (list != null) {
//                for (int i = 0; i < list.size(); i++) {
//                    Entity entity = (Entity) list.get(i);
//                    if (!entity.isDead) {
//                        unknownPickupRelated(entity);
//                    }
//                }
//
//            }
//        }
//
//        if (this.health > 0) {
//            List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(1.0D, 0.0D, 1.0D));
//            if (list != null)
//                for (int b = 0; b < list.size(); b++)
//                    unknownPickupRelated(list.get(b));
//        }
    }


    private void unknownPickupRelated(Entity paramdb) {
        paramdb.onCollideWithPlayer(this);

    }

    public EntityPlayer(World paramdp) {
        super(paramdp);
        /*     */
        /*     */
        /* 219 */
        this.a = 0;
        this.yOffset = 1.62F;
        c(paramdp.l + 0.5D, (paramdp.m + 1), paramdp.n + 0.5D, 0.0F, 0.0F);
        this.health = 20;
        this.aE = "humanoid";
        this.aD = 180.0F;
        this.S = 20;
        this.aB = "/char.png";

    }

    /*     */
    public void f(Entity paramdb) {
        setSize(0.2F, 0.2F);
        setPosition(this.posX, this.posY, this.posZ);
        this.motionY = 0.10000000149011612D;
        if (this.username.equals("Notch")) a(new ItemStack(Item.h, 1), true);
        this.inventory.f();
        if (paramdb != null) {
            this.motionX = (-MathHelper.b((this.aO + this.rotationYaw) * 3.1415927F / 180.0F) * 0.1F);
            this.motionZ = (-MathHelper.a((this.aO + this.rotationYaw) * 3.1415927F / 180.0F) * 0.1F);
        } else {
            this.motionX = this.motionZ = 0.0D;
        }
        this.yOffset = 0.1F;
    }

    /*     */
    public void b(Entity paramdb, int paramInt) {
        this.ak += paramInt;
    }

    /* 222 */
    public void a(ItemStack paramgc) {
        a(paramgc, false);
    }

    public void a(ItemStack paramgc, boolean paramBoolean) {
        if (paramgc == null) return;
        EntityItem fa = new EntityItem(this.worldObj, this.posX, this.posY - 0.30000001192092896D + n(), this.posZ, paramgc);
        fa.delayBeforeCanPickup = 40;
        float f = 0.1F;
        if (paramBoolean) {
            float f1 = this.Q.nextFloat() * 0.5F;
            float f2 = this.Q.nextFloat() * 3.1415927F * 2.0F;
            fa.motionX = (-MathHelper.a(f2) * f1);
            fa.motionZ = (MathHelper.b(f2) * f1);
            fa.motionY = 0.20000000298023224D;
        } else {
            f = 0.3F;
            fa.motionX = (-MathHelper.a(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.b(this.rotationPitch / 180.0F * 3.1415927F) * f);
            fa.motionZ = (MathHelper.b(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.b(this.rotationPitch / 180.0F * 3.1415927F) * f);
            fa.motionY = (-MathHelper.a(this.rotationPitch / 180.0F * 3.1415927F) * f + 0.1F);
            f = 0.02F;
            float f1 = this.Q.nextFloat() * 3.1415927F * 2.0F;
            f *= this.Q.nextFloat();
            fa.motionX += Math.cos(f1) * f;
            fa.motionY += ((this.Q.nextFloat() - this.Q.nextFloat()) * 0.1F);
            fa.motionZ += Math.sin(f1) * f;
        }
        a(fa);
    }

    public boolean attackEntityFrom(Entity paramdb, int paramInt) {
        this.aZ = 0;
        /* 223 */
        if (this.health <= 0) return false;
        /*     */
        /* 225 */
        if (this.W > this.aq / 2.0F) return false;
        /*     */
        /* 227 */
        if (paramdb instanceof EntityMob || paramdb instanceof EntityArrow) {
            /* 228 */
            if (this.worldObj.difficultySetting == 0) paramInt = 0;
            /* 229 */
            if (this.worldObj.difficultySetting == 1) paramInt = paramInt / 3 + 1;
            /* 230 */
            if (this.worldObj.difficultySetting == 3) paramInt = paramInt * 3 / 2;
            /*     */
            /*     */
        }
        /* 233 */
        int i = 25 - this.inventory.e();
        /* 234 */
        int j = paramInt * i + this.a;
        /* 235 */
        this.inventory.b(paramInt);
        /* 236 */
        paramInt = j / 25;
        /* 237 */
        this.a = j % 25;
        /*     */
        /* 239 */
        if (paramInt == 0) return false;
        /*     */
        /* 241 */
        return super.attackEntityFrom(paramdb, paramInt);
    }

    protected void a(EntityItem paramfa) {
        this.worldObj.a(paramfa);
    }

    public float a(Block paramet) {
        float f = this.inventory.a(paramet);
        /*     */
        if (a(Material.f))
            /*     */ f /= 5.0F;
        /*     */
        if (!this.onGround)
            /*     */ f /= 5.0F;
        /*     */
        return f;

    }

    public boolean b(Block paramet) {
        return this.inventory.b(paramet);
    }


public void readEntityFromNBT(NBTTagCompound paramr) {
    super.readEntityFromNBT(paramr);
}
public void writeEntityToNBT(NBTTagCompound paramr) {
    super.writeEntityToNBT(paramr);
}
public void a(IInventory paramif) {}
public void z() {}
/*     */   public void onItemPickup(Entity paramdb, int paramInt) {}
/*     */   protected float n() {
/*     */     return 0.12F;
/*     */   }
/*     */   public void a(TileEntityFurnace paramcx) {}
/*     */   public void a(TileEntitySign paramhp) {}
/*     */   public ItemStack A() {
/* 254 */     return this.inventory.b();
/*     */   }
/*     */   
/*     */   public void B() {
/* 258 */     this.inventory.a(this.inventory.d, (ItemStack)null);
/*     */   }
/*     */   
/*     */   public double v() {
/* 262 */     return (this.yOffset - 0.5F);
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