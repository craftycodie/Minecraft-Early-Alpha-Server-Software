/*    */ import java.util.ArrayList;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */
/*    */ public class EntityTracker
/*    */ {
/* 13 */   private Set trackedEntitySet = new HashSet();
/* 14 */   private MCHash trackedEntityHashTable = new MCHash();
/*    */   private MinecraftServer mcServer;
/*    */   private int maxTrackingDistanceThreshold;
/*    */   
/*    */   public EntityTracker(MinecraftServer paramMinecraftServer) {
/* 19 */     this.mcServer = paramMinecraftServer;
/* 20 */     this.maxTrackingDistanceThreshold = paramMinecraftServer.configManager.getMaxTrackingDistance();
/*    */   }
/*    */   
/*    */   public void trackEntity(Entity paramdb) {
/* 24 */     if (paramdb instanceof EntityPlayerMP) {
/* 25 */       trackEntity(paramdb, 256, 2);
/* 26 */       EntityPlayerMP dq = (EntityPlayerMP)paramdb;
/* 27 */       for (Object fl : this.trackedEntitySet) {
/* 28 */         if (((EntityTrackerEntry)fl).trackedEntity != dq) {
/* 29 */           ((EntityTrackerEntry)fl).updatePlayerEntity(dq);
/*    */         }
/*    */       } 
/*    */     } 
/* 33 */     if (paramdb instanceof EntityItem) trackEntity(paramdb, 64, 20);
///* 34 */     if (paramdb instanceof hs) trackEntity(paramdb, 160, 4);
/*    */   }
/*    */   
/*    */   public void trackEntity(Entity paramdb, int paramInt1, int paramInt2) {
/* 38 */     if (paramInt1 > this.maxTrackingDistanceThreshold) paramInt1 = this.maxTrackingDistanceThreshold;
/* 39 */     if (this.trackedEntityHashTable.containsItem(paramdb.entityId)) throw new IllegalStateException("Entity is already tracked!");
/* 40 */     EntityTrackerEntry fl = new EntityTrackerEntry(paramdb, paramInt1, paramInt2);
/* 41 */     this.trackedEntitySet.add(fl);
/* 42 */     this.trackedEntityHashTable.addKey(paramdb.entityId, fl);
/* 43 */     fl.updatePlayerEntities(this.mcServer.worldserver.i);
/*    */   }
/*    */   
/*    */   public void untrackEntity(Entity paramdb) {
/* 47 */     EntityTrackerEntry entitytrackerentry = (EntityTrackerEntry)this.trackedEntityHashTable.removeObject(paramdb.entityId);
/* 48 */     if (entitytrackerentry != null) {
/* 49 */       this.trackedEntitySet.remove(entitytrackerentry);
/* 50 */       entitytrackerentry.sendDestroyEntityPacketToTrackedPlayers();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void updateTrackedEntities() {
/* 55 */     ArrayList<EntityPlayerMP> arrayList = new ArrayList();
/* 56 */     for (Object entityTrackerEntry : this.trackedEntitySet) {
/* 57 */       ((EntityTrackerEntry)entityTrackerEntry).updatePlayerList(this.mcServer.worldserver.i);
/* 58 */       if (((EntityTrackerEntry)entityTrackerEntry).playerEntitiesUpdated && ((EntityTrackerEntry)entityTrackerEntry).trackedEntity instanceof EntityPlayerMP) {
/* 59 */         arrayList.add((EntityPlayerMP)((EntityTrackerEntry)entityTrackerEntry).trackedEntity);
/*    */       }
/*    */     } 
/*    */     
/* 63 */     for (int b = 0; b < arrayList.size(); b++) {
/* 64 */       EntityPlayerMP dq = arrayList.get(b);
/* 65 */       for (Object fl : this.trackedEntitySet) {
/* 66 */         if (((EntityTrackerEntry)fl).trackedEntity != dq) {
/* 67 */           ((EntityTrackerEntry)fl).updatePlayerEntity(dq);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void sendPacketToTrackedPlayers(Entity paramdb, Packet paramha) {
/* 74 */     EntityTrackerEntry fl = (EntityTrackerEntry)this.trackedEntityHashTable.lookup(paramdb.entityId);
/* 75 */     if (fl != null)
/* 76 */       fl.sendPacketToTrackedPlayers(paramha);
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\fj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */