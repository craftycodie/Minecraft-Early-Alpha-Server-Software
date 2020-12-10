/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class Packet {
/*  7 */   private static Map a = new HashMap<Object, Object>();
/*  8 */   private static Map b = new HashMap<Object, Object>();
/*    */   
/*    */   static void addIdClassMapping(int paramInt, Class<?> paramClass) {
/* 11 */     if (a.containsKey(Integer.valueOf(paramInt))) throw new IllegalArgumentException("Duplicate packet id:" + paramInt); 
/* 12 */     if (b.containsKey(paramClass)) throw new IllegalArgumentException("Duplicate packet class:" + paramClass); 
/* 13 */     a.put(Integer.valueOf(paramInt), paramClass);
/* 14 */     b.put(paramClass, Integer.valueOf(paramInt));
/*    */   }
/*    */   
/*    */   static {
/* 18 */     addIdClassMapping(0, Packet0KeepAlive.class);
/* 19 */     addIdClassMapping(1, Packet1Login.class);
/*    */
/* 22 */     addIdClassMapping(10, Packet10Flying.class);
/* 23 */     addIdClassMapping(11, Packet11PlayerPosition.class);
/* 24 */     addIdClassMapping(12, Packet12PlayerLook.class);
/* 25 */     addIdClassMapping(13, Packet13PlayerLookMove.class);
/* 26 */     addIdClassMapping(14, Packet14BlockDig.class);
/* 27 */     addIdClassMapping(15, Packet15Place.class);
/* 28 */     addIdClassMapping(16, Packet16BlockItemSwitch.class);
/*    */
/*    */     
/* 38 */     addIdClassMapping(20, Packet20Entity.class);
/* 39 */     addIdClassMapping(21, Packet21RelEntityMove.class);
/* 40 */     addIdClassMapping(22, Packet22EntityLook.class);
/* 41 */     addIdClassMapping(23, Packet23RelEntityMoveLook.class);
/* 42 */     addIdClassMapping(24, Packet24NamedEntitySpawn.class);
/* 36 */     addIdClassMapping(25, Packet25DestroyEntity.class);
/* 32 */     addIdClassMapping(26, Packet26EntityTeleport.class);
/*    */     
/* 44 */     addIdClassMapping(50, Packet50PreChunk.class);
/* 45 */     addIdClassMapping(51, Packet51MapChunk.class);
/* 46 */     addIdClassMapping(52, Packet52MultiBlockChange.class);
/* 47 */     addIdClassMapping(53, Packet53BlockChange.class);
/*    */
/* 49 */     addIdClassMapping(255, Packet255KickDisconnect.class);
/*    */   }
/*    */   
/*    */   public static Packet a(int paramInt) {
/*    */     try {
/* 54 */       Class<Packet> clazz = (Class)a.get(Integer.valueOf(paramInt));
/* 55 */       if (clazz == null) return null; 
/* 56 */       return clazz.newInstance();
/* 57 */     } catch (Exception exception) {
/* 58 */       exception.printStackTrace();
/* 59 */       System.out.println("Skipping packet with id " + paramInt);
/* 60 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int b() {
/* 65 */     return ((Integer)b.get(getClass())).intValue();
/*    */   }
/*    */   
/*    */   public boolean j = false;
/*    */   
/*    */   public static Packet readPacket(DataInputStream paramDataInputStream) throws IOException {
/* 71 */     int i = paramDataInputStream.read();
/* 72 */     if (i == -1) return null;
/*    */
//    System.out.println("Reading packet " + i);

    /* 74 */     Packet ha1 = a(i);
/* 75 */     if (ha1 == null) throw new IOException("Bad packet id " + i);
/* 76 */     ha1.readPacketData(paramDataInputStream);
/* 77 */     return ha1;
/*    */   }
/*    */   
/*    */   public static void writePacket(Packet paramha, DataOutputStream paramDataOutputStream) throws IOException {
//    if(paramha.b() < 53)
//    System.out.println("Sending packet " + paramha.b());
    /* 81 */     paramDataOutputStream.write(paramha.b());
/* 82 */     paramha.writePacketData(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public abstract void readPacketData(DataInputStream paramDataInputStream) throws IOException;
/*    */   
/*    */   public abstract void writePacketData(DataOutputStream paramDataOutputStream) throws IOException;
/*    */   
/*    */   public abstract void processPacket(NetClientManager paramdy);
/*    */   
/*    */   public abstract int getPacketSize();
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ha.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */