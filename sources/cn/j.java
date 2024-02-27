package cn;

import cm.g;
import cm.l;
import cn.d;
import in.e;
import in.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vm.b;

public final class j implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f20440k = Logger.getLogger(e.class.getName());

    /* renamed from: l  reason: collision with root package name */
    public static final a f20441l = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final e f20442e;

    /* renamed from: f  reason: collision with root package name */
    private int f20443f = 16384;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20444g;

    /* renamed from: h  reason: collision with root package name */
    private final d.b f20445h;

    /* renamed from: i  reason: collision with root package name */
    private final f f20446i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f20447j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public j(f fVar, boolean z10) {
        l.f(fVar, "sink");
        this.f20446i = fVar;
        this.f20447j = z10;
        e eVar = new e();
        this.f20442e = eVar;
        this.f20445h = new d.b(0, false, eVar, 3, (g) null);
    }

    private final void R(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min((long) this.f20443f, j10);
            j10 -= min;
            h(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f20446i.b0(this.f20442e, min);
        }
    }

    public final synchronized void B(int i10, b bVar) {
        l.f(bVar, "errorCode");
        if (!this.f20444g) {
            if (bVar.a() != -1) {
                h(i10, 4, 3, 0);
                this.f20446i.writeInt(bVar.a());
                this.f20446i.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void E(m mVar) {
        try {
            l.f(mVar, "settings");
            if (!this.f20444g) {
                int i10 = 0;
                h(0, mVar.i() * 6, 4, 0);
                while (i10 < 10) {
                    if (mVar.f(i10)) {
                        this.f20446i.z(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                        this.f20446i.writeInt(mVar.a(i10));
                    }
                    i10++;
                }
                this.f20446i.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void H(int i10, long j10) {
        if (!this.f20444g) {
            if (j10 != 0 && j10 <= 2147483647L) {
                h(i10, 4, 8, 0);
                this.f20446i.writeInt((int) j10);
                this.f20446i.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(m mVar) {
        try {
            l.f(mVar, "peerSettings");
            if (!this.f20444g) {
                this.f20443f = mVar.e(this.f20443f);
                if (mVar.b() != -1) {
                    this.f20445h.e(mVar.b());
                }
                h(0, 0, 4, 1);
                this.f20446i.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void close() {
        this.f20444g = true;
        this.f20446i.close();
    }

    public final synchronized void e() {
        try {
            if (this.f20444g) {
                throw new IOException("closed");
            } else if (this.f20447j) {
                Logger logger = f20440k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.q(">> CONNECTION " + e.f20286a.i(), new Object[0]));
                }
                this.f20446i.N(e.f20286a);
                this.f20446i.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(boolean z10, int i10, e eVar, int i11) {
        if (!this.f20444g) {
            g(i10, z10 ? 1 : 0, eVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f20444g) {
            this.f20446i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void g(int i10, int i11, e eVar, int i12) {
        h(i10, i12, 0, i11);
        if (i12 > 0) {
            f fVar = this.f20446i;
            l.c(eVar);
            fVar.b0(eVar, (long) i12);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        Logger logger = f20440k;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f20290e.c(false, i10, i11, i12, i13));
        }
        boolean z10 = false;
        if (i11 <= this.f20443f) {
            if ((((int) 2147483648L) & i10) == 0) {
                z10 = true;
            }
            if (z10) {
                b.V(this.f20446i, i11);
                this.f20446i.Q(i12 & 255);
                this.f20446i.Q(i13 & 255);
                this.f20446i.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f20443f + ": " + i11).toString());
    }

    public final synchronized void l(int i10, b bVar, byte[] bArr) {
        try {
            l.f(bVar, "errorCode");
            l.f(bArr, "debugData");
            if (!this.f20444g) {
                boolean z10 = false;
                if (bVar.a() != -1) {
                    h(0, bArr.length + 8, 7, 0);
                    this.f20446i.writeInt(i10);
                    this.f20446i.writeInt(bVar.a());
                    if (bArr.length == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        this.f20446i.W(bArr);
                    }
                    this.f20446i.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void n(boolean z10, int i10, List list) {
        l.f(list, "headerBlock");
        if (!this.f20444g) {
            this.f20445h.g(list);
            long H0 = this.f20442e.H0();
            long min = Math.min((long) this.f20443f, H0);
            int i11 = (H0 > min ? 1 : (H0 == min ? 0 : -1));
            int i12 = i11 == 0 ? 4 : 0;
            if (z10) {
                i12 |= 1;
            }
            h(i10, (int) min, 1, i12);
            this.f20446i.b0(this.f20442e, min);
            if (i11 > 0) {
                R(i10, H0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int o() {
        return this.f20443f;
    }

    public final synchronized void s(boolean z10, int i10, int i11) {
        if (!this.f20444g) {
            h(0, 8, 6, z10 ? 1 : 0);
            this.f20446i.writeInt(i10);
            this.f20446i.writeInt(i11);
            this.f20446i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void y(int i10, int i11, List list) {
        l.f(list, "requestHeaders");
        if (!this.f20444g) {
            this.f20445h.g(list);
            long H0 = this.f20442e.H0();
            int min = (int) Math.min(((long) this.f20443f) - 4, H0);
            int i12 = min + 4;
            long j10 = (long) min;
            int i13 = (H0 > j10 ? 1 : (H0 == j10 ? 0 : -1));
            h(i10, i12, 5, i13 == 0 ? 4 : 0);
            this.f20446i.writeInt(i11 & Integer.MAX_VALUE);
            this.f20446i.b0(this.f20442e, j10);
            if (i13 > 0) {
                R(i10, H0 - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
