/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
import java.util.List;
/*     */ import java.util.Set;
/*     */
/*     */
/*     */ public class EntityTrackerEntry
/*     */ {
/*     */   public Entity trackedEntity;
/*     */   public int trackingDistanceThreshold;
/*     */   public int field_9234_e;
/*     */   public int encodedPosX;
/*     */   public int encodedPosY;
/*     */   public int encodedPosZ;
/*     */   public int encodedRotationYaw;
/*     */   public int encodedRotationPitch;
/*  16 */   public int updateCounter = 0;
/*     */
/*     */   private double lastTrackedEntityPosX;
/*     */   private double lastTrackedEntityPosY;
/*     */   private double lastTrackedEntityPosZ;
/*     */   private boolean firstUpdateDone = false;
/*     */   public boolean playerEntitiesUpdated = false;
/*  23 */   public Set trackedPlayers = new HashSet();
/*     */
/*     */   public EntityTrackerEntry(Entity paramdb, int paramInt1, int paramInt2) {
/*  26 */     this.trackedEntity = paramdb;
/*  27 */     this.trackingDistanceThreshold = paramInt1;
/*  28 */     this.field_9234_e = paramInt2;
/*     */
/*  30 */     this.encodedPosX = MathHelper.floor_double(paramdb.posX * 32.0D);
/*  31 */     this.encodedPosY = MathHelper.floor_double(paramdb.posY * 32.0D);
/*  32 */     this.encodedPosZ = MathHelper.floor_double(paramdb.posZ * 32.0D);
/*  33 */     this.encodedRotationYaw = MathHelper.floor_float(paramdb.rotationYaw * 256.0F / 360.0F);
/*  34 */     this.encodedRotationPitch = MathHelper.floor_float(paramdb.rotationPitch * 256.0F / 360.0F);
/*     */   }
/*     */
/*     */   public boolean equals(Object paramObject) {
/*  38 */     if (paramObject instanceof EntityTrackerEntry) {
/*  39 */       return (((EntityTrackerEntry)paramObject).trackedEntity.entityId == this.trackedEntity.entityId);
/*     */     }
/*     */
/*  42 */     return false;
/*     */   }
/*     */
/*     */   public int hashCode() {
/*  46 */     return this.trackedEntity.entityId;
/*     */   }
/*     */
/*     */   public void updatePlayerList(List paramList) {
/*  50 */     this.playerEntitiesUpdated = false;
/*  51 */     if (!this.firstUpdateDone || this.trackedEntity.getDistanceSq(this.lastTrackedEntityPosX, this.lastTrackedEntityPosY, this.lastTrackedEntityPosZ) > 16.0D) {
/*  52 */       updatePlayerEntities(paramList);
/*  53 */       this.lastTrackedEntityPosX = this.trackedEntity.posX;
/*  54 */       this.lastTrackedEntityPosY = this.trackedEntity.posY;
/*  55 */       this.lastTrackedEntityPosZ = this.trackedEntity.posZ;
/*  56 */       this.firstUpdateDone = true;
/*  57 */       this.playerEntitiesUpdated = true;
/*     */     }
/*     */
/*  60 */     if (this.updateCounter++ % this.field_9234_e == 0) {
/*  61 */       Packet el = null;
                int i = MathHelper.floor_double(this.trackedEntity.posX * 32.0D);
/*  62 */       int j = MathHelper.floor_double(this.trackedEntity.posY * 32.0D);
/*  63 */       int k = MathHelper.floor_double(this.trackedEntity.posZ * 32.0D);
/*  64 */       int m = MathHelper.floor_float(this.trackedEntity.rotationYaw * 256.0F / 360.0F);
/*  65 */       int n = MathHelper.floor_float(this.trackedEntity.rotationPitch * 256.0F / 360.0F);
/*     */
/*  67 */       boolean bool1 = (i != this.encodedPosX || j != this.encodedPosY || k != this.encodedPosZ) ? true : false;
/*  68 */       boolean bool2 = (m != this.encodedRotationYaw || n != this.encodedRotationPitch) ? true : false;
/*     */
/*  70 */       int i1 = i - this.encodedPosX;
/*  71 */       int i2 = j - this.encodedPosY;
/*  72 */       int i3 = k - this.encodedPosZ;

//                boolean bool1 = Math.abs(i) >= 8 || Math.abs(difficultySetting) >= 8 || Math.abs(k) >= 8;
//                boolean bool2 = Math.abs(m - encodedRotationYaw) >= 8 || Math.abs(n - encodedRotationPitch) >= 8;
///*     */
///*  75 */       if (i1 < -128 || i1 >= 128 || i2 < -128 || i2 >= 128 || i3 < -128 || i3 >= 128) {
/*  76 */         el = new Packet26EntityTeleport(this.trackedEntity.entityId, i, j, k, (byte)m, (byte)n);
///*     */       }
///*  78 */       else if (bool1 && bool2) {
///*  79 */         el = new Packet33RelEntityMoveLook(this.trackedEntity.entityId, (byte)i1, (byte)i2, (byte)i3, (byte)m, (byte)n);
///*  80 */       } else if (bool1) {
///*  81 */         el = new Packet31RelEntityMove(this.trackedEntity.entityId, (byte)i1, (byte)i2, (byte)i3);
///*  82 */       } else if (bool2) {
///*  83 */         el = new Packet32EntityLook(this.trackedEntity.entityId, (byte)m, (byte)n);
///*     */       } else {
///*  85 */         el = new Packet30Entity(this.trackedEntity.entityId);
///*     */       }
/*     */
/*     */
/*  89 */       if (el != null) {
/*  90 */         sendPacketToTrackedPlayers(el);
/*     */       }
/*     */
        if(bool1)
        {
            encodedPosX = i;
            encodedPosY = j;
            encodedPosZ = k;
        }
        if(bool2)
        {
            encodedRotationYaw = m;
            encodedRotationPitch = n;
        }
/*     */     }
/*     */   }
/*     */
public void sendPacketToTrackedPlayers(Packet packet)
{
    EntityPlayerMP entityplayermp;
    for(Iterator iterator = trackedPlayers.iterator(); iterator.hasNext(); entityplayermp.playerNetServerHandler.sendPacket(packet))
    {
        entityplayermp = (EntityPlayerMP)iterator.next();
    }

}
/*     */
public void sendDestroyEntityPacketToTrackedPlayers()
{
    sendPacketToTrackedPlayers(new Packet25DestroyEntity(trackedEntity.entityId));
}
/*     */
/*     */
///*     */   public void updatePlayerEntity(EntityPlayerMP paramdq) {
///* 113 */     if (paramdq == this.trackedEntity)
///*     */       return;
///* 115 */     double d1 = paramdq.posX - (this.encodedPosX / 32);
///* 116 */     double d2 = paramdq.posZ - (this.encodedPosZ / 32);
///* 117 */     if (d1 >= -this.trackingDistanceThreshold && d1 <= this.trackingDistanceThreshold && d2 >= -this.trackingDistanceThreshold && d2 <= this.trackingDistanceThreshold) {
///* 118 */       if (!this.trackedPlayers.contains(paramdq)) {
///* 119 */         this.trackedPlayers.add(paramdq);
///* 120 */         paramdq.playerNetServerHandler.sendPacket(getSpawnPacket());
///*     */       }
///*     */
///* 123 */     } else if (this.trackedPlayers.contains(paramdq)) {
///* 124 */       this.trackedPlayers.remove(paramdq);
///* 125 */       paramdq.playerNetServerHandler.sendPacket(new Packet29DestroyEntity(this.trackedEntity.entityId));
///*     */     }
///*     */   }

    public void updatePlayerEntity(EntityPlayerMP entityplayermp)
    {
        if(entityplayermp == trackedEntity)
        {
            return;
        }
        double d = entityplayermp.posX - (double)(encodedPosX / 32);
        double d1 = entityplayermp.posZ - (double)(encodedPosZ / 32);
        if(d >= (double)(-trackingDistanceThreshold) && d <= (double)trackingDistanceThreshold && d1 >= (double)(-trackingDistanceThreshold) && d1 <= (double)trackingDistanceThreshold)
        {
            if(!trackedPlayers.contains(entityplayermp))
            {
                trackedPlayers.add(entityplayermp);
                Packet packet = getSpawnPacket();
                if (packet != null)
                    entityplayermp.playerNetServerHandler.sendPacket(packet);
//                if(shouldSendMotionUpdates)
//                {
//                    entityplayermp.playerNetServerHandler.sendPacket(new Packet28EntityVelocity(trackedEntity.entityId, trackedEntity.motionX, trackedEntity.motionY, trackedEntity.motionZ));
////                }
//                ItemStack aitemstack[] = trackedEntity.getInventory();
//                if(aitemstack != null)
//                {
//                    for(int setEntityDead = 0; setEntityDead < aitemstack.length; setEntityDead++)
//                    {
//                        entityplayermp.playerNetServerHandler.sendPacket(new Packet5PlayerInventory(trackedEntity.entityId, setEntityDead, aitemstack[setEntityDead]));
//                    }
//
//                }
//                if(trackedEntity instanceof EntityPlayer)
//                {
//                    EntityPlayer entityplayer = (EntityPlayer)trackedEntity;
//                    if(entityplayer.func_22057_E())
//                    {
//                        entityplayermp.playerNetServerHandler.sendPacket(new Packet17Sleep(trackedEntity, 0, MathHelper.floor_double(trackedEntity.posX), MathHelper.floor_double(trackedEntity.posY), MathHelper.floor_double(trackedEntity.posZ)));
//                    }
//                }
            }
        } else
        if(trackedPlayers.contains(entityplayermp))
        {
            trackedPlayers.remove(entityplayermp);
            entityplayermp.playerNetServerHandler.sendPacket(new Packet25DestroyEntity(trackedEntity.entityId));
        }
    }
/*     */
/*     */
            public void updatePlayerEntities(List list)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    updatePlayerEntity((EntityPlayerMP)list.get(i));
                }

            }
/*     */
/*     */   private Packet getSpawnPacket() {
//            if(trackedEntity instanceof EntityItem)
//            {
//                EntityItem entityitem = (EntityItem)trackedEntity;
//                Packet21PickupSpawn packet21pickupspawn = new Packet21PickupSpawn(entityitem);
//                entityitem.posX = (double)packet21pickupspawn.xPosition / 32D;
//                entityitem.posY = (double)packet21pickupspawn.yPosition / 32D;
//                entityitem.posZ = (double)packet21pickupspawn.zPosition / 32D;
////                entityitem.rotationYaw = (float) packet21pickupspawn.rotation / 128.0;
////                entityitem.rotationPitch = (float) packet21pickupspawn.pitch / 128.0;
//                //entityitem.posZ = (double)packet21pickupspawn.roll / 128.0;
//
//                return packet21pickupspawn;
//            }
    if(trackedEntity instanceof EntityPlayerMP)
    {
        return new Packet24NamedEntitySpawn((EntityPlayerMP)trackedEntity);
    }
    return null;
///* 160 */     throw new IllegalArgumentException("Don't know how to add " + this.trackedEntity.getClass() + "!");
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */