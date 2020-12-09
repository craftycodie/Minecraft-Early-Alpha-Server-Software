/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ChunkLoader
/*     */   implements IChunkLoader
/*     */ {
/*     */   private File a;
/*     */   private boolean b;
/*     */   
/*     */   public ChunkLoader(File paramFile, boolean paramBoolean) {
/*  17 */     this.a = paramFile;
/*  18 */     this.b = paramBoolean;
/*     */   }
/*     */   
/*     */   private File a(int paramInt1, int paramInt2) {
/*  22 */     String str1 = "c." + Integer.toString(paramInt1, 36) + "." + Integer.toString(paramInt2, 36) + ".dat";
/*  23 */     String str2 = Integer.toString(paramInt1 & 0x3F, 36);
/*  24 */     String str3 = Integer.toString(paramInt2 & 0x3F, 36);
/*  25 */     File file = new File(this.a, str2);
/*  26 */     if (!file.exists())
/*  27 */       if (this.b) { file.mkdir(); }
/*  28 */       else { return null; }
/*     */        
/*  30 */     file = new File(file, str3);
/*  31 */     if (!file.exists())
/*  32 */       if (this.b) { file.mkdir(); }
/*  33 */       else { return null; }
/*     */        
/*  35 */     file = new File(file, str1);
/*  36 */     if (!file.exists() && 
/*  37 */       !this.b) return null;
/*     */     
/*  39 */     return file;
/*     */   }
/*     */   
/*     */   public Chunk a(World paramdp, int paramInt1, int paramInt2) {
/*  43 */     File file = a(paramInt1, paramInt2);
/*  44 */     if (file != null && file.exists()) {
/*     */       try {
/*  46 */         FileInputStream fileInputStream = new FileInputStream(file);
/*  47 */         NBTTagCompound r = CompressedStreamTools.a(fileInputStream);
/*  48 */         if (!r.a("Level")) {
/*  49 */           System.out.println("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing level data, skipping");
/*  50 */           return null;
/*     */         } 
/*  52 */         if (!r.j("Level").a("Blocks")) {
/*  53 */           System.out.println("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing block data, skipping");
/*  54 */           return null;
/*     */         } 
/*  56 */         Chunk hv = a(paramdp, r.j("Level"));
/*  57 */         if (!hv.a(paramInt1, paramInt2)) {
/*  58 */           System.out.println("Chunk file at " + paramInt1 + "," + paramInt2 + " is in the wrong location; relocating. (Expected " + paramInt1 + ", " + paramInt2 + ", got " + hv.xPosition + ", " + hv.zPosition + ")");
/*  59 */           r.a("xPos", paramInt1);
/*  60 */           r.a("zPos", paramInt2);
/*  61 */           hv = a(paramdp, r.j("Level"));
/*     */         } 
/*  63 */         return hv;
/*  64 */       } catch (Exception exception) {
/*  65 */         exception.printStackTrace();
/*     */       } 
/*     */     }
/*  68 */     return null;
/*     */   }
/*     */   
/*     */   public void a(World paramdp, Chunk paramhv) {
/*  72 */     paramdp.g();
/*  73 */     File file = a(paramhv.xPosition, paramhv.zPosition);
/*  74 */     if (file.exists()) {
/*  75 */       paramdp.q -= file.length();
/*     */     }
/*     */     
/*     */     try {
/*  79 */       File file1 = new File(this.a, "tmp_chunk.dat");
/*     */       
/*  81 */       FileOutputStream fileOutputStream = new FileOutputStream(file1);
/*  82 */       NBTTagCompound r1 = new NBTTagCompound();
/*  83 */       NBTTagCompound r2 = new NBTTagCompound();
/*  84 */       r1.setCompoundTag("Level", r2);
/*  85 */       a(paramhv, paramdp, r2);
/*  86 */       CompressedStreamTools.a(r1, fileOutputStream);
/*  87 */       fileOutputStream.close();
/*     */       
/*  89 */       if (file.exists()) {
/*  90 */         file.delete();
/*     */       }
/*  92 */       file1.renameTo(file);
/*     */       
/*  94 */       paramdp.q += file.length();
/*  95 */     } catch (Exception exception) {
/*  96 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Chunk paramhv, World paramdp, NBTTagCompound paramr) {
/* 101 */     paramdp.g();
/* 102 */     paramr.a("xPos", paramhv.xPosition);
/* 103 */     paramr.a("zPos", paramhv.zPosition);
/* 104 */     paramr.a("LastUpdate", paramdp.b);
/* 105 */     paramr.a("Blocks", paramhv.b);
/* 106 */     paramr.a("Data", paramhv.e.a);
/* 107 */     paramr.a("SkyLight", paramhv.f.a);
/* 108 */     paramr.a("BlockLight", paramhv.g.a);
/* 109 */     paramr.a("HeightMap", paramhv.h);
/* 110 */     paramr.a("TerrainPopulated", paramhv.n);
/*     */     
/* 112 */     paramhv.r = false;
/* 113 */     NBTTagList de1 = new NBTTagList();
/* 114 */     for (int b = 0; b < paramhv.m.length; b++) {
/* 115 */       for (Object db : paramhv.m[b]) {
/* 116 */         paramhv.r = true;
/* 117 */         NBTTagCompound r1 = new NBTTagCompound();
/* 118 */         if (((Entity)db).c(r1)) {
/* 119 */           de1.a(r1);
/*     */         }
/*     */       } 
/*     */     } 
/* 123 */     paramr.a("Entities", de1);
/*     */     
/* 125 */     NBTTagList de2 = new NBTTagList();
/* 126 */     for (Object ap : paramhv.l.values()) {
/* 127 */       NBTTagCompound r1 = new NBTTagCompound();
/* 128 */       ((TileEntity)ap).b(r1);
/* 129 */       de2.a(r1);
/*     */     } 
/* 131 */     paramr.a("TileEntities", de2);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Chunk a(World paramdp, NBTTagCompound paramr) {
/* 136 */     int i = paramr.d("xPos");
/* 137 */     int j = paramr.d("zPos");
/*     */     
/* 139 */     Chunk hv = new Chunk(paramdp, i, j);
/* 140 */     hv.b = paramr.i("Blocks");
/* 141 */     hv.e = new gh(paramr.i("Data"));
/* 142 */     hv.f = new gh(paramr.i("SkyLight"));
/* 143 */     hv.g = new gh(paramr.i("BlockLight"));
/* 144 */     hv.h = paramr.i("HeightMap");
/* 145 */     hv.n = paramr.getBoolean("TerrainPopulated");
/*     */     
/* 147 */     if (!hv.e.a()) {
/* 148 */       hv.e = new gh(hv.b.length);
/*     */     }
/*     */     
/* 151 */     if (hv.h == null || !hv.f.a()) {
/* 152 */       hv.h = new byte[256];
/* 153 */       hv.f = new gh(hv.b.length);
/* 154 */       hv.b();
/*     */     } 
/*     */     
/* 157 */     if (!hv.g.a()) {
/* 158 */       hv.g = new gh(hv.b.length);
/* 159 */       hv.a();
/*     */     } 
/*     */     
/* 162 */     NBTTagList de1 = paramr.k("Entities");
/* 163 */     if (de1 != null) {
/* 164 */       for (int b = 0; b < de1.b(); b++) {
/* 165 */         NBTTagCompound r1 = (NBTTagCompound)de1.a(b);
/* 166 */         Entity db = EntityList.a(r1, paramdp);
/* 167 */         hv.r = true;
/* 168 */         if (db != null) {
/* 169 */           hv.a(db);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 174 */     NBTTagList de2 = paramr.k("TileEntities");
/* 175 */     if (de2 != null) {
/* 176 */       for (int b = 0; b < de2.b(); b++) {
/* 177 */         NBTTagCompound r1 = (NBTTagCompound)de2.a(b);
/* 178 */         TileEntity ap = TileEntity.c(r1);
/* 179 */         if (ap != null) {
/* 180 */           hv.a(ap);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 185 */     return hv;
/*     */   }
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public void b() {}
/*     */   
/*     */   public void b(World paramdp, Chunk paramhv) {}
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\ec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */