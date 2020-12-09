/*      */ import java.io.DataInputStream;
/*      */ import java.io.DataOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.TreeSet;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class World
/*      */   implements IBlockAccess
/*      */ {
/*   30 */   private List u = new ArrayList();
/*   31 */   private List v = new ArrayList();
/*   32 */   private List w = new ArrayList();
/*      */ 
/*      */   
/*   35 */   private TreeSet x = new TreeSet();
/*   36 */   private Set y = new HashSet();
/*      */   
/*   38 */   public List a = new ArrayList();
/*      */   
/*   40 */   public long b = 0L;
/*      */   
/*      */   public boolean c = false;
/*   43 */   private long z = 8961023L;
/*   44 */   private long A = 12638463L;
/*      */   
/*   46 */   private long B = 16777215L;
/*   47 */   public int d = 0;
/*      */   
/*   49 */   protected int e = (new Random()).nextInt();
/*   50 */   protected int f = 1013904223;
/*      */   
/*      */   public boolean g = false;
/*      */   
/*   54 */   public static float[] h = new float[16];
/*      */   
/*   56 */   private final long C = System.currentTimeMillis();
/*      */   
/*      */   static {
/*   59 */     float f = 0.05F;
/*   60 */     for (int b = 0; b <= 15; b++) {
/*   61 */       float f1 = 1.0F - b / 15.0F;
/*   62 */       h[b] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*   68 */   public List i = new ArrayList();
/*      */   
/*      */   public int difficultySetting;
/*   71 */   public Random k = new Random(); public int l;
/*      */   public int m;
/*      */   public int n;
/*      */   public boolean o = false;
/*   75 */   private List D = new ArrayList();
/*      */   
/*      */   private IChunkProvider chunkProvider;
/*      */   
/*      */   private File F;
/*   80 */   public long p = 0L;
/*      */   private NBTTagCompound G;
/*   82 */   public long q = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final String r;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean s;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private ArrayList H;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Set I;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int J;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private List K;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean singleplayerWorld;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public World(File paramFile, String paramString) {
/*  143 */     this(paramFile, paramString, (new Random()).nextLong());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected IChunkProvider a(File paramFile) {
/*  222 */     return new hf(this, new ChunkLoader(paramFile, true), new hi(this, this.p));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean e(int paramInt1, int paramInt2) {
/*  236 */     int i = f(paramInt1, paramInt2);
/*      */     
/*  238 */     if (i != Block.E.blockId) return false;
/*  239 */     return true;
/*      */   }
/*      */   
/*      */   private int f(int paramInt1, int paramInt2) {
/*  243 */     int b = 63;
/*  244 */     while (getBlockId(paramInt1, b + 1, paramInt2) != 0) {
/*  245 */       b++;
/*      */     }
/*  247 */     return getBlockId(paramInt1, b, paramInt2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean, hg paramhg) {
/*  263 */     if (!this.chunkProvider.b())
/*      */       return; 
/*  265 */     if (paramhg != null) paramhg.a("Saving level"); 
/*  266 */     worldInfoUpdateTagCompound();
/*      */     
/*  268 */     if (paramhg != null) paramhg.b("Saving chunks"); 
/*  269 */     this.chunkProvider.a(paramBoolean, paramhg);
/*      */   }
/*      */   
/*      */   private void worldInfoUpdateTagCompound() {
/*  273 */     g();
/*      */     
/*  275 */     NBTTagCompound r1 = new NBTTagCompound();
/*  276 */     r1.a("RandomSeed", this.p);
/*  277 */     r1.a("SpawnX", this.l);
/*  278 */     r1.a("SpawnY", this.m);
/*  279 */     r1.a("SpawnZ", this.n);
/*  280 */     r1.a("Time", this.b);
/*  281 */     r1.a("SizeOnDisk", this.q);
/*  282 */     r1.a("SnowCovered", this.c);
/*  283 */     r1.a("LastPlayed", System.currentTimeMillis());
/*      */     
/*  285 */     EntityPlayer eq = null;
/*  286 */     if (this.i.size() > 0) eq = (EntityPlayer)this.i.get(0);
/*  287 */     if (eq != null) {
/*  288 */       NBTTagCompound r3 = new NBTTagCompound();
/*  289 */       eq.d(r3);
/*  290 */       r1.setCompoundTag("Player", r3);
/*      */     } 
/*      */     
/*  293 */     NBTTagCompound r2 = new NBTTagCompound();
/*  294 */     r2.setCompoundTag("Data", r1);
/*      */     
/*      */     try {
/*  297 */       File file1 = new File(this.F, "level.dat_new");
/*  298 */       File file2 = new File(this.F, "level.dat_old");
/*  299 */       File file3 = new File(this.F, "level.dat");
/*      */       
/*  301 */       CompressedStreamTools.a(r2, new FileOutputStream(file1));
/*      */       
/*  303 */       if (file2.exists()) file2.delete(); 
/*  304 */       file3.renameTo(file2);
/*  305 */       if (file3.exists()) file3.delete(); 
/*  306 */       file1.renameTo(file3);
/*  307 */       if (file1.exists()) file1.delete(); 
/*  308 */     } catch (Exception exception) {
/*  309 */       exception.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getBlockId(int paramInt1, int paramInt2, int paramInt3) {
/*  321 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  322 */       return 0;
/*      */     }
/*  324 */     if (paramInt2 < 0) return 0; 
/*  325 */     if (paramInt2 >= 128) return 0; 
/*  326 */     return getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4).getBlockID(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public boolean blockExists(int paramInt1, int paramInt2, int paramInt3) {
/*  330 */     if (paramInt2 < 0 || paramInt2 >= 128) return false; 
/*  331 */     return chunkExists(paramInt1 >> 4, paramInt3 >> 4);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  335 */     if (paramInt5 < 0 || paramInt2 >= 128) return false;
/*      */     
/*  337 */     paramInt1 >>= 4;
/*  338 */     paramInt2 >>= 4;
/*  339 */     paramInt3 >>= 4;
/*  340 */     paramInt4 >>= 4;
/*  341 */     paramInt5 >>= 4;
/*  342 */     paramInt6 >>= 4;
/*      */     
/*  344 */     for (int i = paramInt1; i <= paramInt4; i++) {
/*  345 */       for (int j = paramInt3; j <= paramInt6; j++) {
/*  346 */         if (!chunkExists(i, j)) return false;
/*      */       } 
/*  348 */     }  return true;
/*      */   }
/*      */   
/*      */   private boolean chunkExists(int paramInt1, int paramInt2) {
/*  352 */     return this.chunkProvider.chunkExists(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public Chunk a(int paramInt1, int paramInt2) {
/*  356 */     return getChunkFromChunkCoords(paramInt1 >> 4, paramInt2 >> 4);
/*      */   }
/*      */   
/*      */   public Chunk getChunkFromChunkCoords(int paramInt1, int paramInt2) {
/*  360 */     return this.chunkProvider.b(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  364 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  365 */       return false;
/*      */     }
/*  367 */     if (paramInt2 < 0) return false; 
/*  368 */     if (paramInt2 >= 128) return false; 
/*  369 */     Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4);
/*  370 */     return hv.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4, paramInt5);
/*      */   }
/*      */
public boolean setBlock(int i, int j, int k, int l)
{
    if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
    {
        return false;
    }
    if(j < 0)
    {
        return false;
    }
    if(j >= 128)
    {
        return false;
    } else
    {
        Chunk chunk = getChunkFromChunkCoords(i >> 4, k >> 4);
        return chunk.setBlockID(i & 0xf, j, k & 0xf, l);
    }
}

/*      */
public Material getBlockMaterial(int i, int j, int k)
{
    int l = getBlockId(i, j, k);
    if(l == 0)
    {
        return Material.air;
    } else
    {
        return Block.blocksList[l].blockMaterial;
    }
}
/*      */
public int getBlockMetadata(int i, int j, int k)
{
    if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
    {
        return 0;
    }
    if(j < 0)
    {
        return 0;
    }
    if(j >= 128)
    {
        return 0;
    } else
    {
        Chunk chunk = getChunkFromChunkCoords(i >> 4, k >> 4);
        i &= 0xf;
        k &= 0xf;
        return chunk.getBlockMetadata(i, j, k);
    }
}
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  402 */     c(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  406 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  407 */       return false;
/*      */     }
/*  409 */     if (paramInt2 < 0) return false; 
/*  410 */     if (paramInt2 >= 128) return false; 
/*  411 */     Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4);
/*  412 */     paramInt1 &= 0xF;
/*  413 */     paramInt3 &= 0xF;
/*  414 */     hv.b(paramInt1, paramInt2, paramInt3, paramInt4);
/*  415 */     return true;
/*      */   }
/*      */   
/*      */   public boolean setBlockWithNotify(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  419 */     if (setBlock(paramInt1, paramInt2, paramInt3, paramInt4)) {
/*  420 */       notifyBlockChange(paramInt1, paramInt2, paramInt3, paramInt4);
/*  421 */       return true;
/*      */     } 
/*  423 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  427 */     if (a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)) {
/*      */ 
/*      */       
/*  430 */       notifyBlockChange(paramInt1, paramInt2, paramInt3, paramInt4);
/*  431 */       return true;
/*      */     } 
/*  433 */     return false;
/*      */   }
/*      */   
/*      */   public void f(int paramInt1, int paramInt2, int paramInt3) {
/*  437 */     for (int b = 0; b < this.D.size(); b++) {
/*  438 */       ((ba)this.D.get(b)).a(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void notifyBlockChange(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  443 */     f(paramInt1, paramInt2, paramInt3);
/*  444 */     g(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  448 */     if (paramInt3 > paramInt4) {
/*  449 */       int i = paramInt4;
/*  450 */       paramInt4 = paramInt3;
/*  451 */       paramInt3 = i;
/*      */     } 
/*  453 */     b(paramInt1, paramInt3, paramInt2, paramInt1, paramInt4, paramInt2);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  457 */     for (int b = 0; b < this.D.size(); b++) {
/*  458 */       ((ba)this.D.get(b)).a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  476 */     k(paramInt1 - 1, paramInt2, paramInt3, paramInt4);
/*  477 */     k(paramInt1 + 1, paramInt2, paramInt3, paramInt4);
/*  478 */     k(paramInt1, paramInt2 - 1, paramInt3, paramInt4);
/*  479 */     k(paramInt1, paramInt2 + 1, paramInt3, paramInt4);
/*  480 */     k(paramInt1, paramInt2, paramInt3 - 1, paramInt4);
/*  481 */     k(paramInt1, paramInt2, paramInt3 + 1, paramInt4);
/*      */   }
/*      */   
/*      */   private void k(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  485 */     if (this.g || this.singleplayerWorld)
/*  486 */       return;  Block et = Block.blocksList[getBlockId(paramInt1, paramInt2, paramInt3)];
/*  487 */     if (et != null) et.b(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   
/*      */   }
/*      */   
/*      */   public boolean g(int paramInt1, int paramInt2, int paramInt3) {
/*  492 */     return getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4).c(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public int h(int paramInt1, int paramInt2, int paramInt3) {
/*  496 */     return a(paramInt1, paramInt2, paramInt3, true);
/*      */   }
/*      */   
/*      */   public int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  500 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  501 */       return 15;
/*      */     }
/*      */     
/*  504 */     if (paramBoolean) {
/*  505 */       int i = getBlockId(paramInt1, paramInt2, paramInt3);
/*  506 */       if (i == Block.ak.blockId || i == Block.aA.blockId) {
/*  507 */         int j = a(paramInt1, paramInt2 + 1, paramInt3, false);
/*  508 */         int k = a(paramInt1 + 1, paramInt2, paramInt3, false);
/*  509 */         int m = a(paramInt1 - 1, paramInt2, paramInt3, false);
/*  510 */         int n = a(paramInt1, paramInt2, paramInt3 + 1, false);
/*  511 */         int i1 = a(paramInt1, paramInt2, paramInt3 - 1, false);
/*  512 */         if (k > j) j = k; 
/*  513 */         if (m > j) j = m; 
/*  514 */         if (n > j) j = n; 
/*  515 */         if (i1 > j) j = i1; 
/*  516 */         return j;
/*      */       } 
/*      */     } 
/*      */     
/*  520 */     if (paramInt2 < 0) return 0; 
/*  521 */     if (paramInt2 >= 128) {
/*  522 */       int i = 15 - this.d;
/*  523 */       if (i < 0) i = 0; 
/*  524 */       return i;
/*      */     } 
/*      */     
/*  527 */     Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4);
/*  528 */     paramInt1 &= 0xF;
/*  529 */     paramInt3 &= 0xF;
/*  530 */     return hv.c(paramInt1, paramInt2, paramInt3, this.d);
/*      */   }
/*      */   
/*      */   public boolean i(int paramInt1, int paramInt2, int paramInt3) {
/*  534 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  535 */       return false;
/*      */     }
/*  537 */     if (paramInt2 < 0) return false; 
/*  538 */     if (paramInt2 >= 128) return true; 
/*  539 */     if (!chunkExists(paramInt1 >> 4, paramInt3 >> 4)) return false;
/*      */     
/*  541 */     Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4);
/*  542 */     paramInt1 &= 0xF;
/*  543 */     paramInt3 &= 0xF;
/*  544 */     return hv.c(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public int c(int paramInt1, int paramInt2) {
/*  548 */     if (paramInt1 < -32000000 || paramInt2 < -32000000 || paramInt1 >= 32000000 || paramInt2 > 32000000) {
/*  549 */       return 0;
/*      */     }
/*  551 */     if (!chunkExists(paramInt1 >> 4, paramInt2 >> 4)) return 0;
/*      */     
/*  553 */     Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt2 >> 4);
/*  554 */     return hv.b(paramInt1 & 0xF, paramInt2 & 0xF);
/*      */   }
/*      */   
/*      */   public void a(EnumSkyBlock paramcr, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  558 */     if (!blockExists(paramInt1, paramInt2, paramInt3))
/*      */       return; 
/*  560 */     if (paramcr == EnumSkyBlock.Sky) {
/*  561 */       if (i(paramInt1, paramInt2, paramInt3)) paramInt4 = 15; 
/*  562 */     } else if (paramcr == EnumSkyBlock.Block) {
/*  563 */       int i = getBlockId(paramInt1, paramInt2, paramInt3);
/*  564 */       if (Block.s[i] > paramInt4) paramInt4 = Block.s[i];
/*      */     
/*      */     } 
/*  567 */     if (a(paramcr, paramInt1, paramInt2, paramInt3) != paramInt4) {
/*  568 */       a(paramcr, paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public int a(EnumSkyBlock paramcr, int paramInt1, int paramInt2, int paramInt3) {
/*  573 */     if (paramInt2 < 0 || paramInt2 >= 128 || paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  574 */       return paramcr.c;
/*      */     }
/*  576 */     int i = paramInt1 >> 4;
/*  577 */     int j = paramInt3 >> 4;
/*  578 */     if (!chunkExists(i, j)) return 0;
/*  579 */     Chunk hv = getChunkFromChunkCoords(i, j);
/*  580 */     return hv.a(paramcr, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public void b(EnumSkyBlock paramcr, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  584 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*      */       return;
/*      */     }
/*  587 */     if (paramInt2 < 0)
/*  588 */       return;  if (paramInt2 >= 128)
/*  589 */       return;  if (!chunkExists(paramInt1 >> 4, paramInt3 >> 4))
/*  590 */       return;  Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4);
/*  591 */     hv.a(paramcr, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4);
/*  592 */     for (int b = 0; b < this.D.size(); b++) {
/*  593 */       ((ba)this.D.get(b)).a(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public float j(int paramInt1, int paramInt2, int paramInt3) {
/*  598 */     return h[h(paramInt1, paramInt2, paramInt3)];
/*      */   }
/*      */   
/*      */   public boolean a() {
/*  602 */     return (this.d < 4);
/*      */   }
/*      */   
/*      */   public fe a(Vec3D paramas1, Vec3D paramas2) {
/*  606 */     return a(paramas1, paramas2, false);
/*      */   }
/*      */   
/*      */   public fe a(Vec3D paramas1, Vec3D paramas2, boolean paramBoolean) {
/*  610 */     if (Double.isNaN(paramas1.a) || Double.isNaN(paramas1.b) || Double.isNaN(paramas1.c)) return null; 
/*  611 */     if (Double.isNaN(paramas2.a) || Double.isNaN(paramas2.b) || Double.isNaN(paramas2.c)) return null;
/*      */     
/*  613 */     int i = MathHelper.floor_double(paramas2.a);
/*  614 */     int j = MathHelper.floor_double(paramas2.b);
/*  615 */     int k = MathHelper.floor_double(paramas2.c);
/*      */     
/*  617 */     int m = MathHelper.floor_double(paramas1.a);
/*  618 */     int n = MathHelper.floor_double(paramas1.b);
/*  619 */     int i1 = MathHelper.floor_double(paramas1.c);
/*      */     
/*  621 */     int b = 20;
/*  622 */     while (b-- >= 0) {
/*  623 */       if (Double.isNaN(paramas1.a) || Double.isNaN(paramas1.b) || Double.isNaN(paramas1.c)) return null; 
/*  624 */       if (m == i && n == j && i1 == k) return null;
/*      */       
/*  626 */       double d1 = 999.0D;
/*  627 */       double d2 = 999.0D;
/*  628 */       double d3 = 999.0D;
/*      */       
/*  630 */       if (i > m) d1 = m + 1.0D; 
/*  631 */       if (i < m) d1 = m + 0.0D;
/*      */       
/*  633 */       if (j > n) d2 = n + 1.0D; 
/*  634 */       if (j < n) d2 = n + 0.0D;
/*      */       
/*  636 */       if (k > i1) d3 = i1 + 1.0D; 
/*  637 */       if (k < i1) d3 = i1 + 0.0D;
/*      */       
/*  639 */       double d4 = 999.0D;
/*  640 */       double d5 = 999.0D;
/*  641 */       double d6 = 999.0D;
/*      */       
/*  643 */       double d7 = paramas2.a - paramas1.a;
/*  644 */       double d8 = paramas2.b - paramas1.b;
/*  645 */       double d9 = paramas2.c - paramas1.c;
/*      */       
/*  647 */       if (d1 != 999.0D) d4 = (d1 - paramas1.a) / d7; 
/*  648 */       if (d2 != 999.0D) d5 = (d2 - paramas1.b) / d8; 
/*  649 */       if (d3 != 999.0D) d6 = (d3 - paramas1.c) / d9;
/*      */       
/*  651 */       int b1 = 0;
/*  652 */       if (d4 < d5 && d4 < d6) {
/*  653 */         if (i > m) { b1 = 4; }
/*  654 */         else { b1 = 5; }
/*      */         
/*  656 */         paramas1.a = d1;
/*  657 */         paramas1.b += d8 * d4;
/*  658 */         paramas1.c += d9 * d4;
/*  659 */       } else if (d5 < d6) {
/*  660 */         if (j > n) { b1 = 0; }
/*  661 */         else { b1 = 1; }
/*      */         
/*  663 */         paramas1.a += d7 * d5;
/*  664 */         paramas1.b = d2;
/*  665 */         paramas1.c += d9 * d5;
/*      */       } else {
/*  667 */         if (k > i1) { b1 = 2; }
/*  668 */         else { b1 = 3; }
/*      */         
/*  670 */         paramas1.a += d7 * d6;
/*  671 */         paramas1.b += d8 * d6;
/*  672 */         paramas1.c = d3;
/*      */       } 
/*      */       
/*  675 */       Vec3D as1 = Vec3D.b(paramas1.a, paramas1.b, paramas1.c);
/*  676 */       m = (int)(as1.a = MathHelper.floor_double(paramas1.a));
/*  677 */       if (b1 == 5) {
/*  678 */         m--;
/*  679 */         as1.a++;
/*      */       } 
/*  681 */       n = (int)(as1.b = MathHelper.floor_double(paramas1.b));
/*  682 */       if (b1 == 1) {
/*  683 */         n--;
/*  684 */         as1.b++;
/*      */       } 
/*  686 */       i1 = (int)(as1.c = MathHelper.floor_double(paramas1.c));
/*  687 */       if (b1 == 3) {
/*  688 */         i1--;
/*  689 */         as1.c++;
/*      */       } 
/*      */       
/*  692 */       int i2 = getBlockId(m, n, i1);
/*  693 */       int i3 = getBlockMetadata(m, n, i1);
/*  694 */       Block et = Block.blocksList[i2];
/*  695 */       if (i2 > 0 && et.a(i3, paramBoolean)) {
/*  696 */         fe fe = et.a(this, m, n, i1, paramas1, paramas2);
/*  697 */         if (fe != null) return fe;
/*      */       
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  708 */     return null;
/*      */   }
/*      */   
/*      */   public void playSoundAtEntity(Entity paramdb, String paramString, float paramFloat1, float paramFloat2) {
/*  712 */     for (int b = 0; b < this.D.size(); b++) {
/*  713 */       ((ba)this.D.get(b)).a(paramString, paramdb.posX, paramdb.posY - paramdb.yOffset, paramdb.posZ, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2) {
/*  718 */     for (int b = 0; b < this.D.size(); b++) {
/*  719 */       ((ba)this.D.get(b)).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  724 */     for (int b = 0; b < this.D.size(); b++) {
/*  725 */       ((ba)this.D.get(b)).a(paramString, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  733 */     for (int b = 0; b < this.D.size(); b++)
/*  734 */       ((ba)this.D.get(b)).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6); 
/*      */   }
/*      */   
/*      */   public boolean a(Entity paramdb) {
/*  738 */     int i = MathHelper.floor_double(paramdb.posX / 16.0D);
/*  739 */     int j = MathHelper.floor_double(paramdb.posZ / 16.0D);
/*      */     
/*  741 */     boolean bool = false;
/*  742 */     if (paramdb instanceof EntityPlayer) {
/*  743 */       bool = true;
/*      */     }
/*      */
               if (paramdb instanceof EntityPlayer) {
/*  748 */         this.i.add((EntityPlayer)paramdb);
/*  749 */         System.out.println("Player count: " + this.i.size());
/*      */       }
/*  746 */     if (bool || chunkExists(i, j)) {
/*  751 */       getChunkFromChunkCoords(i, j).a(paramdb);
/*  752 */       this.v.add(paramdb);
/*  753 */       b(paramdb);
/*  754 */       return true;
/*      */     } else {
        /*  729 */       System.out.println("Failed to add entity " + paramdb + " because the chunk wasn't loaded");

                }
/*  756 */     return false;
/*      */   }
/*      */   
/*      */   protected void b(Entity paramdb) {
/*  760 */     for (int b = 0; b < this.D.size(); b++) {
/*  761 */       ((ba)this.D.get(b)).a(paramdb);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void c(Entity paramdb) {
/*  766 */     for (int b = 0; b < this.D.size(); b++) {
/*  767 */       ((ba)this.D.get(b)).b(paramdb);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(Entity paramdb) {
/*  772 */     paramdb.setEntityDead();
/*  773 */     if (paramdb instanceof EntityPlayer) {
/*  774 */       this.i.remove(paramdb);
/*  775 */       System.out.println("Player count: " + this.i.size());
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(ba paramba) {
/*  780 */     this.D.add(paramba);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public World(String paramString)
/*      */   {
/*  787 */     this.H = new ArrayList();
/*      */ 

/* 1331 */     this.I = new HashSet();
/*      */     
/* 1333 */     this.J = this.k.nextInt(12000);

/* 1450 */     this.K = new ArrayList();
/* 1451 */     this.singleplayerWorld = false; this.r = paramString; this.chunkProvider = a(this.F); d(); } public World(File paramFile, String paramString, long paramLong) { this.H = new ArrayList(); this.I = new HashSet(); this.J = this.k.nextInt(12000); this.K = new ArrayList(); this.singleplayerWorld = false; this.r = paramString; paramFile.mkdirs(); this.F = new File(paramFile, paramString); this.F.mkdirs(); try { File file1 = new File(this.F, "session.lock"); DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file1)); try { dataOutputStream.writeLong(this.C); } finally { dataOutputStream.close(); }  } catch (IOException iOException) { throw new RuntimeException("Failed to check session lock, aborting"); }  File file = new File(this.F, "level.dat"); this.o = !file.exists(); if (file.exists()) { try { NBTTagCompound r1 = CompressedStreamTools.a(new FileInputStream(file)); NBTTagCompound r2 = r1.j("Data"); this.p = r2.e("RandomSeed"); this.l = r2.d("SpawnX"); this.m = r2.d("SpawnY"); this.n = r2.d("SpawnZ"); this.b = r2.e("Time"); this.q = r2.e("SizeOnDisk"); this.c = r2.getBoolean("SnowCovered"); if (r2.a("Player")) this.G = r2.j("Player");  } catch (Exception exception) { exception.printStackTrace(); }  } else { this.c = (this.k.nextInt(4) == 0); }  boolean bool = false; if (this.p == 0L) { this.p = paramLong; bool = true; }  this.chunkProvider = a(this.F); if (bool) { this.s = true; this.l = 0; this.m = 64; this.n = 0; while (!e(this.l, this.n)) { this.l += this.k.nextInt(64) - this.k.nextInt(64); this.n += this.k.nextInt(64) - this.k.nextInt(64); }  this.s = false; }  d(); }
/*      */   public List getCollidingBoundingBoxes(Entity paramdb, AxisAlignedBB paramcy) { this.H.clear(); int i = MathHelper.floor_double(paramcy.a); int j = MathHelper.floor_double(paramcy.d + 1.0D); int k = MathHelper.floor_double(paramcy.b); int m = MathHelper.floor_double(paramcy.e + 1.0D); int n = MathHelper.floor_double(paramcy.c); int i1 = MathHelper.floor_double(paramcy.f + 1.0D); for (int i2 = i; i2 < j; i2++) { for (int i3 = n; i3 < i1; i3++) { if (blockExists(i2, 64, i3)) for (int i4 = k - 1; i4 < m; i4++) { Block et = Block.blocksList[getBlockId(i2, i4, i3)]; if (et != null) et.a(this, i2, i4, i3, paramcy, this.H);  }   }  }  double d = 0.25D; List<Entity> list = getEntitiesWithinAABBExcludingEntity(paramdb, paramcy.expand(d, d, d)); for (int b = 0; b < list.size(); b++) { AxisAlignedBB cy1 = ((Entity)list.get(b)).l(); if (cy1 != null && cy1.a(paramcy)) this.H.add(cy1);  cy1 = paramdb.d(list.get(b)); if (cy1 != null && cy1.a(paramcy)) this.H.add(cy1);  }  return this.H; }
/*      */   public int a(float paramFloat) { float f1 = b(paramFloat); float f2 = 1.0F - MathHelper.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F; if (f2 < 0.0F) f2 = 0.0F;  if (f2 > 1.0F) f2 = 1.0F;  return (int)(f2 * 11.0F); }
/* 1454 */   public float b(float paramFloat) { int i = (int)(this.b % 24000L); float f1 = (i + paramFloat) / 24000.0F - 0.25F; if (f1 < 0.0F) f1++;  if (f1 > 1.0F) f1--;  float f2 = f1; f1 = 1.0F - (float)((Math.cos(f1 * Math.PI) + 1.0D) / 2.0D); f1 = f2 + (f1 - f2) / 3.0F; return f1; } public int d(int paramInt1, int paramInt2) {
        Chunk hv = a(paramInt1, paramInt2);
        int b = 127;
        paramInt1 &= 0xF;
        paramInt2 &= 0xF;
        while (b > 0) {
            int i = hv.getBlockID(paramInt1, b, paramInt2);
            if (i == 0 || (!(Block.blocksList[i]).blockMaterial.c() && !(Block.blocksList[i]).blockMaterial.d())) {
                b--;
                continue;
            }
            return b + 1;
        }
        return -1;
    }
public void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        bq bq = new bq(paramInt1, paramInt2, paramInt3, paramInt4);
        int b = 8;
        if (a(paramInt1 - b, paramInt2 - b, paramInt3 - b, paramInt1 + b, paramInt2 + b, paramInt3 + b)) {
            if (paramInt4 > 0) bq.a(Block.blocksList[paramInt4].c() + this.b);
            if (!this.y.contains(bq)) {
                this.y.add(bq);
                this.x.add(bq);
            }
        }
    }
public void b() {
        this.v.removeAll(this.w);
        for (int b = 0; b < this.w.size(); b++) {
            Entity db = (Entity) this.w.get(b);
            int i = db.Z;
            int j = db.ab;
            if (db.Y && chunkExists(i, j)) getChunkFromChunkCoords(i, j).b(db);
        }
        for (int b = 0; b < this.w.size(); b++) c((Entity) this.w.get(b));
        this.w.clear();
        for (int b = 0; b < this.v.size(); b++) {
            Entity db = (Entity) this.v.get(b);
            if (db.f != null) if (db.f.isDead || db.f.e != db) {
                db.f.e = null;
                db.f = null;
            } else {
                continue;
            }
            if (!db.isDead) e(db);
            if (db.isDead) {
                int i = db.Z;
                int j = db.ab;
                if (db.Y && chunkExists(i, j)) getChunkFromChunkCoords(i, j).b(db);
                this.v.remove(b--);
                c(db);
            }
            continue;
        }
        for (int b = 0; b < this.a.size(); b++) {
            TileEntity ap = (TileEntity) this.a.get(b);
            ap.b();
        }
    }
protected void e(Entity paramdb) {
        int i = MathHelper.floor_double(paramdb.posX);
        int j = MathHelper.floor_double(paramdb.posZ);
        int b = 16;
        if (!a(i - b, 0, j - b, i + b, 128, j + b)) return;
        paramdb.I = paramdb.posX;
        paramdb.J = paramdb.posY;
        paramdb.K = paramdb.posZ;
        paramdb.s = paramdb.rotationYaw;
        paramdb.t = paramdb.rotationPitch;
        if (paramdb.f != null) {
            paramdb.t();
        } else {
            paramdb.onUpdate();
        }
        int k = MathHelper.floor_double(paramdb.posX / 16.0D);
        int m = MathHelper.floor_double(paramdb.posY / 16.0D);
        int n = MathHelper.floor_double(paramdb.posZ / 16.0D);
        if (!paramdb.Y || paramdb.Z != k || paramdb.aa != m || paramdb.ab != n) {
            if (paramdb.Y && chunkExists(paramdb.Z, paramdb.ab))
                getChunkFromChunkCoords(paramdb.Z, paramdb.ab).a(paramdb, paramdb.aa);
            if (chunkExists(k, n)) {
                getChunkFromChunkCoords(k, n).a(paramdb);
            } else {
                paramdb.Y = false;
                System.out.println("Removing entity because it's not in lookup chunk!!");
                paramdb.setEntityDead();
            }
        }
        if (paramdb.e != null) if (paramdb.e.isDead || paramdb.e.f != paramdb) {
            paramdb.e.f = null;
            paramdb.e = null;
        } else {
            e(paramdb.e);
        }
        if (Double.isNaN(paramdb.posX) || Double.isInfinite(paramdb.posX)) paramdb.posX = paramdb.I;
        if (Double.isNaN(paramdb.posY) || Double.isInfinite(paramdb.posY)) paramdb.posY = paramdb.J;
        if (Double.isNaN(paramdb.posZ) || Double.isInfinite(paramdb.posZ)) paramdb.posZ = paramdb.K;
        if (Double.isNaN(paramdb.rotationPitch) || Double.isInfinite(paramdb.rotationPitch)) paramdb.rotationPitch = paramdb.t;
        if (Double.isNaN(paramdb.rotationYaw) || Double.isInfinite(paramdb.rotationYaw)) paramdb.rotationYaw = paramdb.s;
    }

public boolean a(AxisAlignedBB paramcy) {
        List<Entity> list = getEntitiesWithinAABBExcludingEntity((Entity) null, paramcy);
        for (int b = 0; b < list.size(); b++) {
            Entity db = list.get(b);
            if (!db.isDead && db.d) return false;
        }
        return true;
    }
public boolean b(AxisAlignedBB paramcy) {
        int i = MathHelper.floor_double(paramcy.a);
        int j = MathHelper.floor_double(paramcy.d + 1.0D);
        int k = MathHelper.floor_double(paramcy.b);
        int m = MathHelper.floor_double(paramcy.e + 1.0D);
        int n = MathHelper.floor_double(paramcy.c);
        int i1 = MathHelper.floor_double(paramcy.f + 1.0D);
        if (paramcy.a < 0.0D) i--;
        if (paramcy.b < 0.0D) k--;
        if (paramcy.c < 0.0D) n--;
        for (int i2 = i; i2 < j; i2++) {
            for (int i3 = k; i3 < m; i3++) {
                for (int i4 = n; i4 < i1; i4++) {
                    Block et = Block.blocksList[getBlockId(i2, i3, i4)];
                    if (et != null && et.blockMaterial.d()) return true;
                }
            }
        }
        return false;
    }
public boolean c(AxisAlignedBB paramcy) {
        int i = MathHelper.floor_double(paramcy.a);
        int j = MathHelper.floor_double(paramcy.d + 1.0D);
        int k = MathHelper.floor_double(paramcy.b);
        int m = MathHelper.floor_double(paramcy.e + 1.0D);
        int n = MathHelper.floor_double(paramcy.c);
        int i1 = MathHelper.floor_double(paramcy.f + 1.0D);
        for (int i2 = i; i2 < j; i2++) {
            for (int i3 = k; i3 < m; i3++) {
                for (int i4 = n; i4 < i1; i4++) {
                    int i5 = getBlockId(i2, i3, i4);
                    if (i5 == Block.ar.blockId || i5 == Block.C.blockId || i5 == Block.D.blockId) return true;
                }
            }
        }
        return false;
    }
public boolean a(AxisAlignedBB paramcy, Material paramhz, Entity paramdb) {
        int i = MathHelper.floor_double(paramcy.a);
        int j = MathHelper.floor_double(paramcy.d + 1.0D);
        int k = MathHelper.floor_double(paramcy.b);
        int m = MathHelper.floor_double(paramcy.e + 1.0D);
        int n = MathHelper.floor_double(paramcy.c);
        int i1 = MathHelper.floor_double(paramcy.f + 1.0D);
        boolean bool = false;
        Vec3D as = Vec3D.b(0.0D, 0.0D, 0.0D);
        for (int i2 = i; i2 < j; i2++) {
            for (int i3 = k; i3 < m; i3++) {
                for (int i4 = n; i4 < i1; i4++) {
                    Block et = Block.blocksList[getBlockId(i2, i3, i4)];
                    if (et != null && et.blockMaterial == paramhz) {
                        double d = ((i3 + 1) - BlockFluid.b(getBlockMetadata(i2, i3, i4)));
                        if (m >= d) {
                            bool = true;
                            et.a(this, i2, i3, i4, paramdb, as);
                        }
                    }
                }
            }
        }
        if (as.c() > 0.0D) {
            as = as.b();
            double d = 0.004D;
            paramdb.motionX += as.a * d;
            paramdb.motionY += as.b * d;
            paramdb.motionZ += as.c * d;
        }
        return bool;
    }
public boolean a(AxisAlignedBB paramcy, Material paramhz) {
        int i = MathHelper.floor_double(paramcy.a);
        int j = MathHelper.floor_double(paramcy.d + 1.0D);
        int k = MathHelper.floor_double(paramcy.b);
        int m = MathHelper.floor_double(paramcy.e + 1.0D);
        int n = MathHelper.floor_double(paramcy.c);
        int i1 = MathHelper.floor_double(paramcy.f + 1.0D);
        for (int i2 = i; i2 < j; i2++) {
            for (int i3 = k; i3 < m; i3++) {
                for (int i4 = n; i4 < i1; i4++) {
                    Block et = Block.blocksList[getBlockId(i2, i3, i4)];
                    if (et != null && et.blockMaterial == paramhz) return true;
                }
            }
        }
        return false;
    }
public boolean b(AxisAlignedBB paramcy, Material paramhz) {
        int i = MathHelper.floor_double(paramcy.a);
        int j = MathHelper.floor_double(paramcy.d + 1.0D);
        int k = MathHelper.floor_double(paramcy.b);
        int m = MathHelper.floor_double(paramcy.e + 1.0D);
        int n = MathHelper.floor_double(paramcy.c);
        int i1 = MathHelper.floor_double(paramcy.f + 1.0D);
        for (int i2 = i; i2 < j; i2++) {
            for (int i3 = k; i3 < m; i3++) {
                for (int i4 = n; i4 < i1; i4++) {
                    Block et = Block.blocksList[getBlockId(i2, i3, i4)];
                    if (et != null && et.blockMaterial == paramhz) {
                        int i5 = getBlockMetadata(i2, i3, i4);
                        double d = (i3 + 1);
                        if (i5 < 8) d = (i3 + 1) - i5 / 8.0D;
                        if (d >= paramcy.b) return true;
                    }
                }
            }
        }
        return false;
    }
public List getEntitiesWithinAABBExcludingEntity(Entity paramdb, AxisAlignedBB paramcy) {
        this.K.clear();
        /* 1455 */
        int i = MathHelper.floor_double((paramcy.a - 2.0D) / 16.0D);
        /* 1456 */
        int j = MathHelper.floor_double((paramcy.d + 2.0D) / 16.0D);
        /* 1457 */
        int k = MathHelper.floor_double((paramcy.c - 2.0D) / 16.0D);
        /* 1458 */
        int m = MathHelper.floor_double((paramcy.f + 2.0D) / 16.0D);
        /* 1459 */
        for (int n = i; n <= j; n++) {
            /* 1460 */
            for (int i1 = k; i1 <= m; i1++) {
                /* 1461 */
                if (chunkExists(n, i1))
                    /* 1462 */ getChunkFromChunkCoords(n, i1).a(paramdb, paramcy, this.K);
                /*      */
            }
            /*      */
        }
        /* 1465 */
        return this.K;
    }
/*      */   public void a(Entity paramdb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) { (new Explosion()).a(this, paramdb, paramDouble1, paramDouble2, paramDouble3, paramFloat); }
/*      */   public float a(Vec3D paramas, AxisAlignedBB paramcy) { double d1 = 1.0D / ((paramcy.d - paramcy.a) * 2.0D + 1.0D); double d2 = 1.0D / ((paramcy.e - paramcy.b) * 2.0D + 1.0D); double d3 = 1.0D / ((paramcy.f - paramcy.c) * 2.0D + 1.0D); int b1 = 0; int b2 = 0; float f; for (f = 0.0F; f <= 1.0F; f = (float)(f + d1)) { float f1; for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d2)) { float f2; for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d3)) { double d4 = paramcy.a + (paramcy.d - paramcy.a) * f; double d5 = paramcy.b + (paramcy.e - paramcy.b) * f1; double d6 = paramcy.c + (paramcy.f - paramcy.c) * f2; if (a(Vec3D.b(d4, d5, d6), paramas) == null) b1++;  b2++; }  }  }  return b1 / b2; }
/*      */   public TileEntity k(int paramInt1, int paramInt2, int paramInt3) {
                Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4);
                if (hv != null) return hv.getChunkBlockTileEntity(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
                return null;
            }
/* 1469 */   public void a(int paramInt1, int paramInt2, int paramInt3, TileEntity paramap) { Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4); if (hv != null) hv.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramap);  } public void l(int paramInt1, int paramInt2, int paramInt3) { Chunk hv = getChunkFromChunkCoords(paramInt1 >> 4, paramInt3 >> 4); if (hv != null) hv.e(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);  } public boolean d(int paramInt1, int paramInt2, int paramInt3) { Block et = Block.blocksList[getBlockId(paramInt1, paramInt2, paramInt3)]; if (et == null) return false;  return et.b(); } public boolean c() { char c = 'Ϩ'; while (this.u.size() > 0) { if (--c <= '\000') return true;  ((MetadataChunkBlock)this.u.remove(this.u.size() - 1)).a(this); }  return false; } public void a(EnumSkyBlock paramcr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { a(paramcr, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, true); } public void a(EnumSkyBlock paramcr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean) { int i = (paramInt4 + paramInt1) / 2; int j = (paramInt6 + paramInt3) / 2; if (!blockExists(i, 64, j)) return;  int k = this.u.size(); if (paramBoolean) { int m = 4; if (m > k) m = k;  for (int b = 0; b < m; b++) { MetadataChunkBlock dg = (MetadataChunkBlock)this.u.get(this.u.size() - b - 1); if (dg.a == paramcr && dg.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6)) return;  }  }  this.u.add(new MetadataChunkBlock(paramcr, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6)); if (this.u.size() > 100000) while (this.u.size() > 50000) c();   } public void d() { int i = a(1.0F); if (i != this.d) this.d = i;  } public void e() { this.chunkProvider.a(); int i = a(1.0F); if (i != this.d) { this.d = i; for (int b = 0; b < this.D.size(); b++) ((ba)this.D.get(b)).a();  }  this.b++; if (this.b % 20L == 0L) a(false, (hg)null);  a(false); f(); } protected void f() { this.I.clear(); for (int b = 0; b < this.i.size(); b++) { EntityPlayer eq = (EntityPlayer)this.i.get(b); int i = MathHelper.floor_double(eq.posX / 16.0D); int j = MathHelper.floor_double(eq.posZ / 16.0D); int b1 = 9; for (int b2 = -b1; b2 <= b1; b2++) { for (int b3 = -b1; b3 <= b1; b3++) this.I.add(new ChunkCoordIntPair(b2 + i, b3 + j));  }  }  if (this.J > 0) this.J--;  for (Object ih : this.I) { int i = ((ChunkCoordIntPair)ih).a * 16; int j = ((ChunkCoordIntPair)ih).b * 16; Chunk hv = getChunkFromChunkCoords(((ChunkCoordIntPair)ih).a, ((ChunkCoordIntPair)ih).b); if (this.J == 0) { this.e = this.e * 3 + this.f; int k = this.e >> 2; int m = k & 0xF; int n = k >> 8 & 0xF; int i1 = k >> 16 & 0x7F; int i2 = hv.getBlockID(m, i1, n); m += i; n += j; if (i2 == 0 && h(m, i1, n) <= this.k.nextInt(8) && a(EnumSkyBlock.Sky, m, i1, n) <= 0) { EntityPlayer eq = a(m + 0.5D, i1 + 0.5D, n + 0.5D, 8.0D); if (eq != null && eq.getDistanceSq(m + 0.5D, i1 + 0.5D, n + 0.5D) > 4.0D) { a(m + 0.5D, i1 + 0.5D, n + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.k.nextFloat() * 0.2F); this.J = this.k.nextInt(12000) + 6000; }  }  }  if (this.c && this.k.nextInt(4) == 0) { this.e = this.e * 3 + this.f; int k = this.e >> 2; int m = k & 0xF; int n = k >> 8 & 0xF; int i1 = d(m + i, n + j); if (i1 >= 0 && i1 < 128 && hv.a(EnumSkyBlock.Block, m, i1, n) < 10) { int i2 = hv.getBlockID(m, i1 - 1, n); if (hv.getBlockID(m, i1, n) == 0 && i2 != 0 && i2 != Block.aT.blockId && (Block.blocksList[i2]).blockMaterial.c()) setBlockWithNotify(m + i, i1, n + j, Block.aS.blockId);  if (i2 == Block.B.blockId && hv.getBlockMetadata(m, i1 - 1, n) == 0) setBlockWithNotify(m + i, i1 - 1, n + j, Block.aT.blockId);  }  }  for (int b1 = 0; b1 < 80; b1++) { this.e = this.e * 3 + this.f; int k = this.e >> 2; int m = k & 0xF; int n = k >> 8 & 0xF; int i1 = k >> 16 & 0x7F; int b2 = hv.b[m << 11 | n << 7 | i1]; if (Block.tickOnLoad[b2]) Block.blocksList[b2].a(this, m + i, i1, n + j, this.k);  }  }  } public boolean a(boolean paramBoolean) { int i = this.x.size(); if (i != this.y.size()) throw new IllegalStateException("TickNextTick list out of synch");  if (i > 1000) i = 1000;  for (int b = 0; b < i; b++) { bq bq = (bq)this.x.first(); if (!paramBoolean && bq.e > this.b) break;  this.x.remove(bq); this.y.remove(bq); int b1 = 8; if (a(bq.a - b1, bq.b - b1, bq.c - b1, bq.a + b1, bq.b + b1, bq.c + b1)) { int j = getBlockId(bq.a, bq.b, bq.c); if (j == bq.d && j > 0) Block.blocksList[j].a(this, bq.a, bq.b, bq.c, this.k);  }  }  return (this.x.size() != 0); } public List a(Class paramClass, AxisAlignedBB paramcy) {
        int i = MathHelper.floor_double((paramcy.a - 2.0D) / 16.0D);
        /* 1470 */
        int j = MathHelper.floor_double((paramcy.d + 2.0D) / 16.0D);
        /* 1471 */
        int k = MathHelper.floor_double((paramcy.c - 2.0D) / 16.0D);
        /* 1472 */
        int m = MathHelper.floor_double((paramcy.f + 2.0D) / 16.0D);
        /* 1473 */
        ArrayList arrayList = new ArrayList();
        /* 1474 */
        for (int n = i; n <= j; n++) {
            /* 1475 */
            for (int i1 = k; i1 <= m; i1++) {
                /* 1476 */
                if (chunkExists(n, i1))
                    /* 1477 */ getChunkFromChunkCoords(n, i1).a(paramClass, paramcy, arrayList);
                /*      */
            }
            /*      */
        }
        /* 1480 */
        return arrayList;

    }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void m(int paramInt1, int paramInt2, int paramInt3) {
/* 1489 */     if (blockExists(paramInt1, paramInt2, paramInt3)) {
/* 1490 */       a(paramInt1, paramInt3).e();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(List<Entity> paramList) {
/* 1504 */     this.v.addAll(paramList);
/* 1505 */     for (int b = 0; b < paramList.size(); b++) {
/* 1506 */       b(paramList.get(b));
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(List paramList) {
/* 1511 */     this.w.addAll(paramList);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/* 1520 */     int i = getBlockId(paramInt2, paramInt3, paramInt4);
/* 1521 */     Block et1 = Block.blocksList[i];
/*      */     
/* 1523 */     Block et2 = Block.blocksList[paramInt1];
/*      */     
/* 1525 */     AxisAlignedBB cy = et2.d(this, paramInt2, paramInt3, paramInt4);
/* 1526 */     if (paramBoolean) cy = null; 
/* 1527 */     if (cy != null && !a(cy)) return false; 
/* 1528 */     if (et1 == Block.A || et1 == Block.B || et1 == Block.C || et1 == Block.D || et1 == Block.ar || et1 == Block.aS) return true;
/* 1529 */     if (paramInt1 > 0 && et1 == null && 
/* 1530 */       et2.a(this, paramInt2, paramInt3, paramInt4)) {
/* 1531 */       return true;
/*      */     }
/*      */     
/* 1534 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PathEntity a(Entity paramdb1, Entity paramdb2, float paramFloat) {
/* 1542 */     int i = MathHelper.floor_double(paramdb1.posX);
/* 1543 */     int j = MathHelper.floor_double(paramdb1.posY);
/* 1544 */     int k = MathHelper.floor_double(paramdb1.posZ);
/*      */     
/* 1546 */     int m = (int)(paramFloat + 16.0F);
/* 1547 */     int n = i - m;
/* 1548 */     int i1 = j - m;
/* 1549 */     int i2 = k - m;
/* 1550 */     int i3 = i + m;
/* 1551 */     int i4 = j + m;
/* 1552 */     int i5 = k + m;
/* 1553 */     ChunkCache dj = new ChunkCache(this, n, i1, i2, i3, i4, i5);
/* 1554 */     return (new Pathfinder(dj)).a(paramdb1, paramdb2, paramFloat);
/*      */   }
/*      */   
/*      */   public PathEntity a(Entity paramdb, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/* 1558 */     int i = MathHelper.floor_double(paramdb.posX);
/* 1559 */     int j = MathHelper.floor_double(paramdb.posY);
/* 1560 */     int k = MathHelper.floor_double(paramdb.posZ);
/*      */     
/* 1562 */     int m = (int)(paramFloat + 8.0F);
/* 1563 */     int n = i - m;
/* 1564 */     int i1 = j - m;
/* 1565 */     int i2 = k - m;
/* 1566 */     int i3 = i + m;
/* 1567 */     int i4 = j + m;
/* 1568 */     int i5 = k + m;
/* 1569 */     ChunkCache dj = new ChunkCache(this, n, i1, i2, i3, i4, i5);
/* 1570 */     return (new Pathfinder(dj)).a(paramdb, paramInt1, paramInt2, paramInt3, paramFloat);
/*      */   }
/*      */   
/*      */   public boolean i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1574 */     int i = getBlockId(paramInt1, paramInt2, paramInt3);
/* 1575 */     if (i == 0) return false; 
/* 1576 */     return Block.blocksList[i].d(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean n(int paramInt1, int paramInt2, int paramInt3) {
/* 1580 */     if (i(paramInt1, paramInt2 - 1, paramInt3, 0)) return true; 
/* 1581 */     if (i(paramInt1, paramInt2 + 1, paramInt3, 1)) return true; 
/* 1582 */     if (i(paramInt1, paramInt2, paramInt3 - 1, 2)) return true; 
/* 1583 */     if (i(paramInt1, paramInt2, paramInt3 + 1, 3)) return true; 
/* 1584 */     if (i(paramInt1 - 1, paramInt2, paramInt3, 4)) return true; 
/* 1585 */     if (i(paramInt1 + 1, paramInt2, paramInt3, 5)) return true; 
/* 1586 */     return false;
/*      */   }
/*      */   
/*      */   public boolean j(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1590 */     if (d(paramInt1, paramInt2, paramInt3)) {
/* 1591 */       return n(paramInt1, paramInt2, paramInt3);
/*      */     }
/* 1593 */     int i = getBlockId(paramInt1, paramInt2, paramInt3);
/* 1594 */     if (i == 0) return false; 
/* 1595 */     return Block.blocksList[i].b((IBlockAccess)this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean o(int paramInt1, int paramInt2, int paramInt3) {
/* 1599 */     if (j(paramInt1, paramInt2 - 1, paramInt3, 0)) return true; 
/* 1600 */     if (j(paramInt1, paramInt2 + 1, paramInt3, 1)) return true; 
/* 1601 */     if (j(paramInt1, paramInt2, paramInt3 - 1, 2)) return true; 
/* 1602 */     if (j(paramInt1, paramInt2, paramInt3 + 1, 3)) return true; 
/* 1603 */     if (j(paramInt1 - 1, paramInt2, paramInt3, 4)) return true; 
/* 1604 */     if (j(paramInt1 + 1, paramInt2, paramInt3, 5)) return true; 
/* 1605 */     return false;
/*      */   }
/*      */   
/*      */   public EntityPlayer a(Entity paramdb, double paramDouble) {
/* 1609 */     return a(paramdb.posX, paramdb.posY, paramdb.posZ, paramDouble);
/*      */   }
/*      */   
/*      */   public EntityPlayer a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 1613 */     double d = -1.0D;
/* 1614 */     EntityPlayer eq = null;
/* 1615 */     for (int b = 0; b < this.i.size(); b++) {
/* 1616 */       EntityPlayer eq1 = (EntityPlayer)this.i.get(b);
/* 1617 */       double d1 = eq1.getDistanceSq(paramDouble1, paramDouble2, paramDouble3);
/* 1618 */       if ((paramDouble4 < 0.0D || d1 < paramDouble4 * paramDouble4) && (d == -1.0D || d1 < d)) {
/* 1619 */         d = d1;
/* 1620 */         eq = eq1;
/*      */       } 
/*      */     } 
/* 1623 */     return eq;
/*      */   }
/*      */   
/*      */   public byte[] c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 1627 */     byte[] arrayOfByte = new byte[paramInt4 * paramInt5 * paramInt6 * 5 / 2];
/* 1628 */     int i = paramInt1 >> 4;
/* 1629 */     int j = paramInt3 >> 4;
/* 1630 */     int k = paramInt1 + paramInt4 - 1 >> 4;
/* 1631 */     int m = paramInt3 + paramInt6 - 1 >> 4;
/*      */     
/* 1633 */     int n = 0;
/*      */     
/* 1635 */     int i1 = paramInt2;
/* 1636 */     int i2 = paramInt2 + paramInt5;
/* 1637 */     if (i1 < 0) i1 = 0; 
/* 1638 */     if (i2 > 128) i2 = 128; 
/* 1639 */     for (int i3 = i; i3 <= k; i3++) {
/* 1640 */       int i4 = paramInt1 - i3 * 16;
/* 1641 */       int i5 = paramInt1 + paramInt4 - i3 * 16;
/* 1642 */       if (i4 < 0) i4 = 0; 
/* 1643 */       if (i5 > 16) i5 = 16; 
/* 1644 */       for (int i6 = j; i6 <= m; i6++) {
/* 1645 */         int i7 = paramInt3 - i6 * 16;
/* 1646 */         int i8 = paramInt3 + paramInt6 - i6 * 16;
/* 1647 */         if (i7 < 0) i7 = 0; 
/* 1648 */         if (i8 > 16) i8 = 16; 
/* 1649 */         n = getChunkFromChunkCoords(i3, i6).a(arrayOfByte, i4, i1, i7, i5, i2, i8, n);
/*      */       } 
/*      */     } 
/*      */     
/* 1653 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g() {
/*      */     try {
/* 1689 */       File file = new File(this.F, "session.lock");
/* 1690 */       DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
/*      */       try {
/* 1692 */         if (dataInputStream.readLong() != this.C) {
/* 1693 */           throw new MinecraftException("The save is being accessed from another location, aborting");
/*      */         }
/*      */       } finally {
/* 1696 */         dataInputStream.close();
/*      */       } 
/* 1698 */     } catch (IOException iOException) {
/* 1699 */       throw new MinecraftException("Failed to check session lock, aborting");
/*      */     } 
/*      */   }
/*      */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\dp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */