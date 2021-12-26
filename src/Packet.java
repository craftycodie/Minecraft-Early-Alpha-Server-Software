/*    */ import java.io.*;
/*    */
/*    */
import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class Packet {
/*  7 */   private static Map a = new HashMap<Object, Object>();
/*  8 */   private static Map b = new HashMap<Object, Object>();
            public static DataOutputStream LASTOUTSTREAM;
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
/* 20 */     addIdClassMapping(3, Packet3Chat.class);
/*    */     
/* 22 */     addIdClassMapping(10, Packet10Flying.class);
/* 23 */     addIdClassMapping(11, Packet11PlayerPosition.class);
/* 24 */     addIdClassMapping(12, Packet12PlayerLook.class);
/* 25 */     addIdClassMapping(13, Packet13PlayerLookMove.class);
/* 26 */     addIdClassMapping(14, Packet14BlockDig.class);
/* 27 */     addIdClassMapping(15, Packet15Place.class);
/* 28 */     addIdClassMapping(16, Packet16BlockItemSwitch.class);
/* 29 */     addIdClassMapping(17, Packet17UnknownItemStack.class);
/*    */
/* 32 */     addIdClassMapping(20, Packet20NamedEntitySpawn.class);
/* 33 */     addIdClassMapping(21, Packet21PickupSpawn.class);
/* 34 */     addIdClassMapping(22, Packet22Collect.class);

/* 36 */     addIdClassMapping(29, Packet29DestroyEntity.class);
/*    */     
/* 38 */     addIdClassMapping(30, Packet30Entity.class);
/* 39 */     addIdClassMapping(31, Packet31RelEntityMove.class);
/* 40 */     addIdClassMapping(32, Packet32EntityLook.class);
/* 41 */     addIdClassMapping(33, Packet33RelEntityMoveLook.class);
/* 42 */     addIdClassMapping(34, Packet34EntityTeleport.class);
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
//    System.out.println("reading " + i);

    /* 74 */     Packet ha1 = a(i);
/* 75 */     if (ha1 == null) throw new IOException("Bad packet id " + i);
/* 76 */     ha1.a(paramDataInputStream);
/* 77 */     return ha1;
/*    */   }
/*    */
    public static boolean lock = false;
/*    */   public static synchronized void writePacket(Packet paramha, DataOutputStream paramDataOutputStream) throws IOException {

//    System.out.println("sending " + paramha.b());



//    if (paramha.b() == 1) {
////        /* 81 */     paramDataOutputStream.write(paramha.b());
////        /* 82 */     paramha.a(paramDataOutputStream);
////        try {
////            Thread.sleep(100);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//        System.out.println("GOT LOGIN");
////        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Projects\\Local\\Notch's test server\\smptest_20100730_1.bin"));
//
////        sendPackets("D:\\Projects\\Local\\Notch's test server\\smptest_20100730_3.bin", paramDataOutputStream);
//
//
//
//    } else {
    if (!lock) {
        /* 81 */
        paramDataOutputStream.write(paramha.b());
        /* 82 */
        paramha.a(paramDataOutputStream);
    }
//    }










/*    */   }
/*    */   
/*    */   public abstract void a(DataInputStream paramDataInputStream) throws IOException;
/*    */   
/*    */   public abstract void a(DataOutputStream paramDataOutputStream) throws IOException;
/*    */   
/*    */   public abstract void a(NetClientManager paramdy);
/*    */   
/*    */   public abstract int getPacketSize();
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ha.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */