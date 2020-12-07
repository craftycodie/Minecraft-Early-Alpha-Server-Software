/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Chunk
/*     */ {
            public static boolean a;
            public byte[] b;
            public boolean c;
            public World d;
            public gh e;
            public gh f;
            public gh g;
            public byte[] h;
            public int i;
            public final int xPosition;
            public final int zPosition;
            public Map l = new HashMap();
            public List[] m = new List[8];
            public boolean n = false;
            public boolean o = false;
            public boolean p;
            public boolean q = false;
            public boolean r = false;
            public long s = 0L;

            public Chunk(World dp2, int n, int n2) {
                this.d = dp2;
                this.xPosition = n;
                this.zPosition = n2;
                this.h = new byte[256];
                for (int i = 0; i < this.m.length; ++i) {
                    this.m[i] = new ArrayList();
                }
            }

            public Chunk(World dp2, byte[] arrby, int n, int n2) {
                this(dp2, n, n2);
                this.b = arrby;
                this.e = new gh(arrby.length);
                this.f = new gh(arrby.length);
                this.g = new gh(arrby.length);
            }

            public boolean a(int n, int n2) {
                return n == this.xPosition && n2 == this.zPosition;
            }

            public int b(int n, int n2) {
                return this.h[n2 << 4 | n] & 0xFF;
            }

            public void a() {
            }

            public void b() {
                int n;
                int n2;
                int n3 = 127;
                for (n2 = 0; n2 < 16; ++n2) {
                    for (n = 0; n < 16; ++n) {
                        this.h[n << 4 | n2] = -128;
                        this.g(n2, 127, n);
                        if ((this.h[n << 4 | n2] & 0xFF) >= n3) continue;
                        n3 = this.h[n << 4 | n2] & 0xFF;
                    }
                }
                this.i = n3;
                for (n2 = 0; n2 < 16; ++n2) {
                    for (n = 0; n < 16; ++n) {
                        this.c(n2, n);
                    }
                }
                this.o = true;
            }

            private void c(int n, int n2) {
                int n3 = this.b(n, n2);
                int n4 = this.xPosition * 16 + n;
                int n5 = this.zPosition * 16 + n2;
                this.f(n4 - 1, n5, n3);
                this.f(n4 + 1, n5, n3);
                this.f(n4, n5 - 1, n3);
                this.f(n4, n5 + 1, n3);
            }

            private void f(int n, int n2, int n3) {
                int n4 = this.d.c(n, n2);
                if (n4 > n3) {
                    this.d.a(cr.a, n, n3, n2, n, n4, n2);
                } else if (n4 < n3) {
                    this.d.a(cr.a, n, n4, n2, n, n3, n2);
                }
                this.o = true;
            }

            private void g(int n, int n2, int n3) {
                int n4;
                int n5;
                int n6;
                int n7;
                int n8 = n7 = this.h[n3 << 4 | n] & 0xFF;
                if (n2 > n7) {
                    n8 = n2;
                }
                int n9 = n << 11 | n3 << 7;
                while (n8 > 0 && Block.lightOpacity[this.b[n9 + n8 - 1]] == 0) {
                    --n8;
                }
                if (n8 == n7) {
                    return;
                }
                this.d.f(n, n3, n8, n7);
                this.h[n3 << 4 | n] = (byte)n8;
                if (n8 < this.i) {
                    this.i = n8;
                } else {
                    n6 = 127;
                    for (n5 = 0; n5 < 16; ++n5) {
                        for (n4 = 0; n4 < 16; ++n4) {
                            if ((this.h[n4 << 4 | n5] & 0xFF) >= n6) continue;
                            n6 = this.h[n4 << 4 | n5] & 0xFF;
                        }
                    }
                    this.i = n6;
                }
                n6 = this.xPosition * 16 + n;
                n5 = this.zPosition * 16 + n3;
                if (n8 < n7) {
                    for (n4 = n8; n4 < n7; ++n4) {
                        this.f.a(n, n4, n3, 15);
                    }
                } else {
                    this.d.a(cr.a, n6, n7, n5, n6, n8, n5);
                    for (n4 = n7; n4 < n8; ++n4) {
                        this.f.a(n, n4, n3, 0);
                    }
                }
                n4 = 15;
                int n10 = n8;
                while (n8 > 0 && n4 > 0) {
                    int n11;
                    if ((n11 = Block.lightOpacity[this.getBlockID(n, --n8, n3)]) == 0) {
                        n11 = 1;
                    }
                    if ((n4 -= n11) < 0) {
                        n4 = 0;
                    }
                    this.f.a(n, n8, n3, n4);
                }
                while (n8 > 0 && Block.lightOpacity[this.getBlockID(n, n8 - 1, n3)] == 0) {
                    --n8;
                }
                if (n8 != n10) {
                    this.d.a(cr.a, n6 - 1, n8, n5 - 1, n6 + 1, n10, n5 + 1);
                }
                this.o = true;
            }

            public int getBlockID(int n, int n2, int n3) {
                return this.b[n << 11 | n3 << 7 | n2];
            }

            public boolean a(int n, int n2, int n3, int n4, int n5) {
                byte by = (byte)n4;
                int n6 = this.h[n3 << 4 | n] & 0xFF;
                int n7 = this.b[n << 11 | n3 << 7 | n2] & 0xFF;
                if (n7 == n4) {
                    return false;
                }
                int n8 = this.xPosition * 16 + n;
                int n9 = this.zPosition * 16 + n3;
                this.b[n << 11 | n3 << 7 | n2] = by;
                if (n7 != 0 && !this.d.t) {
                    Block.blocksList[n7].b(this.d, n8, n2, n9);
                }
                this.e.a(n, n2, n3, n5);
                if (Block.lightOpacity[by] != 0) {
                    if (n2 >= n6) {
                        this.g(n, n2 + 1, n3);
                    }
                } else if (n2 == n6 - 1) {
                    this.g(n, n2, n3);
                }
                this.d.a(cr.a, n8, n2, n9, n8, n2, n9);
                this.d.a(cr.b, n8, n2, n9, n8, n2, n9);
                this.c(n, n3);
                if (n4 != 0) {
                    Block.blocksList[n4].onBlockAdded(this.d, n8, n2, n9);
                }
                this.o = true;
                return true;
            }

            public boolean setBlockID(int n, int n2, int n3, int n4) {
                byte by = (byte)n4;
                int n5 = this.h[n3 << 4 | n] & 0xFF;
                int n6 = this.b[n << 11 | n3 << 7 | n2] & 0xFF;
                if (n6 == n4) {
                    return false;
                }
                int n7 = this.xPosition * 16 + n;
                int n8 = this.zPosition * 16 + n3;
                this.b[n << 11 | n3 << 7 | n2] = by;
                if (n6 != 0) {
                    Block.blocksList[n6].b(this.d, n7, n2, n8);
                }
                this.e.a(n, n2, n3, 0);
                if (Block.lightOpacity[by] != 0) {
                    if (n2 >= n5) {
                        this.g(n, n2 + 1, n3);
                    }
                } else if (n2 == n5 - 1) {
                    this.g(n, n2, n3);
                }
                this.d.a(cr.a, n7, n2, n8, n7, n2, n8);
                this.d.a(cr.b, n7, n2, n8, n7, n2, n8);
                this.c(n, n3);
                if (n4 != 0 && !this.d.t) {
                    Block.blocksList[n4].onBlockAdded(this.d, n7, n2, n8);
                }
                this.o = true;
                return true;
            }

            public int getBlockMetadata(int n, int n2, int n3) {
                return this.e.a(n, n2, n3);
            }

            public void b(int n, int n2, int n3, int n4) {
                this.o = true;
                this.e.a(n, n2, n3, n4);
            }

            public int a(cr cr2, int n, int n2, int n3) {
                if (cr2 == cr.a) {
                    return this.f.a(n, n2, n3);
                }
                if (cr2 == cr.b) {
                    return this.g.a(n, n2, n3);
                }
                return 0;
            }

            public void a(cr cr2, int n, int n2, int n3, int n4) {
                this.o = true;
                if (cr2 == cr.a) {
                    this.f.a(n, n2, n3, n4);
                } else if (cr2 == cr.b) {
                    this.g.a(n, n2, n3, n4);
                } else {
                    return;
                }
            }

            public int c(int n, int n2, int n3, int n4) {
                int n5;
                int n6 = this.f.a(n, n2, n3);
                if (n6 > 0) {
                    a = true;
                }
                if ((n5 = this.g.a(n, n2, n3)) > (n6 -= n4)) {
                    n6 = n5;
                }
                return n6;
            }

            public void a(Entity db2) {
                int n;
                if (this.q) {
                    return;
                }
                this.r = true;
                int n2 = fw.b(db2.k / 16.0);
                int n3 = fw.b(db2.m / 16.0);
                if (n2 != this.xPosition || n3 != this.zPosition) {
                    System.out.println("Wrong location! " + db2);
                }
                if ((n = fw.b(db2.l / 16.0)) < 0) {
                    n = 0;
                }
                if (n >= this.m.length) {
                    n = this.m.length - 1;
                }
                db2.Y = true;
                db2.Z = this.xPosition;
                db2.aa = n;
                db2.ab = this.zPosition;
                this.m[n].add(db2);
            }

            public void b(Entity db2) {
                this.a(db2, db2.aa);
            }

            public void a(Entity db2, int n) {
                if (n < 0) {
                    n = 0;
                }
                if (n >= this.m.length) {
                    n = this.m.length - 1;
                }
                this.m[n].remove(db2);
            }

            public boolean c(int n, int n2, int n3) {
                return n2 >= (this.h[n3 << 4 | n] & 0xFF);
            }

            public TileEntity getChunkBlockTileEntity(int n, int n2, int n3) {
                ChunkPosition gf2 = new ChunkPosition(n, n2, n3);
                TileEntity ap2 = (TileEntity) this.l.get(gf2);
                if (ap2 == null) {
                    int n4 = this.getBlockID(n, n2, n3);
                    BlockContainer cl2 = (BlockContainer) Block.blocksList[n4];
                    cl2.onBlockAdded(this.d, this.xPosition * 16 + n, n2, this.zPosition * 16 + n3);
                    ap2 = (TileEntity) this.l.get(gf2);
                }
                return ap2;
            }

            public void a(TileEntity ap2) {
                int n = ap2.b - this.xPosition * 16;
                int n2 = ap2.c;
                int n3 = ap2.d - this.zPosition * 16;
                this.a(n, n2, n3, ap2);
            }

            public void a(int n, int n2, int n3, TileEntity ap2) {
                ChunkPosition gf2 = new ChunkPosition(n, n2, n3);
                ap2.a = this.d;
                ap2.b = this.xPosition * 16 + n;
                ap2.c = n2;
                ap2.d = this.zPosition * 16 + n3;
                if (this.getBlockID(n, n2, n3) == 0 || !(Block.blocksList[this.getBlockID(n, n2, n3)] instanceof BlockContainer)) {
                    System.out.println("Attempted to place onUpdate tile entity where there was no entity tile!");
                    return;
                }
                if (this.c) {
                    if (this.l.get(gf2) != null) {
                        this.d.a.remove(this.l.get(gf2));
                    }
                    this.d.a.add(ap2);
                }
                this.l.put(gf2, ap2);
            }

            public void e(int n, int n2, int n3) {
                ChunkPosition gf2 = new ChunkPosition(n, n2, n3);
                if (this.c) {
                    this.d.a.remove(this.l.remove(gf2));
                }
            }

            public void c() {
                this.c = true;
                this.d.a.addAll(this.l.values());
                for (int i = 0; i < this.m.length; ++i) {
                    this.d.a(this.m[i]);
                }
            }

            public void d() {
                this.c = false;
                this.d.a.removeAll(this.l.values());
                for (int i = 0; i < this.m.length; ++i) {
                    this.d.b(this.m[i]);
                }
            }

            public void e() {
                this.o = true;
            }

            public void a(Entity db2, AxisAlignedBB cy2, List list) {
                int n = fw.b((cy2.b - 2.0) / 16.0);
                int n2 = fw.b((cy2.e + 2.0) / 16.0);
                if (n < 0) {
                    n = 0;
                }
                if (n2 >= this.m.length) {
                    n2 = this.m.length - 1;
                }
                for (int i = n; i <= n2; ++i) {
                    List list2 = this.m[i];
                    for (int j = 0; j < list2.size(); ++j) {
                        Entity db3 = (Entity) list2.get(j);
                        if (db3 == db2 || !db3.u.a(cy2)) continue;
                        list.add(db3);
                    }
                }
            }

            public void a(Class class_, AxisAlignedBB cy2, List list) {
                int n = fw.b((cy2.b - 2.0) / 16.0);
                int n2 = fw.b((cy2.e + 2.0) / 16.0);
                if (n < 0) {
                    n = 0;
                }
                if (n2 >= this.m.length) {
                    n2 = this.m.length - 1;
                }
                for (int i = n; i <= n2; ++i) {
                    List list2 = this.m[i];
                    for (int j = 0; j < list2.size(); ++j) {
                        Entity db2 = (Entity) list2.get(j);
                        if (!class_.isAssignableFrom(db2.getClass()) || !db2.u.a(cy2)) continue;
                        list.add(db2);
                    }
                }
            }

            public boolean a(boolean bl2) {
                if (this.p) {
                    return false;
                }
                if (this.r && this.d.b != this.s) {
                    return true;
                }
                return this.o;
            }

            public int a(byte[] arrby, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
                int n8;
                int n9;
                int n10;
                int n11;
                for (n11 = n; n11 < n4; ++n11) {
                    for (n10 = n3; n10 < n6; ++n10) {
                        n9 = n11 << 11 | n10 << 7 | n2;
                        n8 = n5 - n2;
                        System.arraycopy(this.b, n9, arrby, n7, n8);
                        n7 += n8;
                    }
                }
                for (n11 = n; n11 < n4; ++n11) {
                    for (n10 = n3; n10 < n6; ++n10) {
                        n9 = (n11 << 11 | n10 << 7 | n2) >> 1;
                        n8 = (n5 - n2) / 2;
                        System.arraycopy(this.e.a, n9, arrby, n7, n8);
                        n7 += n8;
                    }
                }
                for (n11 = n; n11 < n4; ++n11) {
                    for (n10 = n3; n10 < n6; ++n10) {
                        n9 = (n11 << 11 | n10 << 7 | n2) >> 1;
                        n8 = (n5 - n2) / 2;
                        System.arraycopy(this.g.a, n9, arrby, n7, n8);
                        n7 += n8;
                    }
                }
                for (n11 = n; n11 < n4; ++n11) {
                    for (n10 = n3; n10 < n6; ++n10) {
                        n9 = (n11 << 11 | n10 << 7 | n2) >> 1;
                        n8 = (n5 - n2) / 2;
                        System.arraycopy(this.f.a, n9, arrby, n7, n8);
                        n7 += n8;
                    }
                }
                return n7;
            }

            public Random a(long l) {
                return new Random(this.d.p + (long)(this.xPosition * this.xPosition * 4987142) + (long)(this.xPosition * 5947611) + (long)(this.zPosition * this.zPosition) * 4392871L + (long)(this.zPosition * 389711) ^ l);
            }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */