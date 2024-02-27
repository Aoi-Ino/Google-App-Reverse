package cn;

import cm.g;
import cm.l;
import cn.d;
import in.a0;
import in.b0;
import in.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class h implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f20400i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f20401j = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final b f20402e;

    /* renamed from: f  reason: collision with root package name */
    private final d.a f20403f;

    /* renamed from: g  reason: collision with root package name */
    private final in.g f20404g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f20405h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Logger a() {
            return h.f20400i;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    public static final class b implements a0 {

        /* renamed from: e  reason: collision with root package name */
        private int f20406e;

        /* renamed from: f  reason: collision with root package name */
        private int f20407f;

        /* renamed from: g  reason: collision with root package name */
        private int f20408g;

        /* renamed from: h  reason: collision with root package name */
        private int f20409h;

        /* renamed from: i  reason: collision with root package name */
        private int f20410i;

        /* renamed from: j  reason: collision with root package name */
        private final in.g f20411j;

        public b(in.g gVar) {
            l.f(gVar, "source");
            this.f20411j = gVar;
        }

        private final void e() {
            int i10 = this.f20408g;
            int G = vm.b.G(this.f20411j);
            this.f20409h = G;
            this.f20406e = G;
            int b10 = vm.b.b(this.f20411j.readByte(), 255);
            this.f20407f = vm.b.b(this.f20411j.readByte(), 255);
            a aVar = h.f20401j;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f20290e.c(true, this.f20408g, this.f20406e, b10, this.f20407f));
            }
            int readInt = this.f20411j.readInt() & Integer.MAX_VALUE;
            this.f20408g = readInt;
            if (b10 != 9) {
                throw new IOException(b10 + " != TYPE_CONTINUATION");
            } else if (readInt != i10) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final int c() {
            return this.f20409h;
        }

        public void close() {
        }

        public final void f(int i10) {
            this.f20407f = i10;
        }

        public final void g(int i10) {
            this.f20409h = i10;
        }

        public final void h(int i10) {
            this.f20406e = i10;
        }

        public final void l(int i10) {
            this.f20410i = i10;
        }

        public final void n(int i10) {
            this.f20408g = i10;
        }

        public long read(e eVar, long j10) {
            l.f(eVar, "sink");
            while (true) {
                int i10 = this.f20409h;
                if (i10 == 0) {
                    this.f20411j.skip((long) this.f20410i);
                    this.f20410i = 0;
                    if ((this.f20407f & 4) != 0) {
                        return -1;
                    }
                    e();
                } else {
                    long read = this.f20411j.read(eVar, Math.min(j10, (long) i10));
                    if (read == -1) {
                        return -1;
                    }
                    this.f20409h -= (int) read;
                    return read;
                }
            }
        }

        public b0 timeout() {
            return this.f20411j.timeout();
        }
    }

    public interface c {
        void b();

        void c(boolean z10, m mVar);

        void e(boolean z10, int i10, int i11);

        void f(boolean z10, int i10, in.g gVar, int i11);

        void i(int i10, int i11, int i12, boolean z10);

        void j(boolean z10, int i10, int i11, List list);

        void k(int i10, b bVar);

        void l(int i10, b bVar, in.h hVar);

        void m(int i10, long j10);

        void n(int i10, int i11, List list);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        l.e(logger, "Logger.getLogger(Http2::class.java.name)");
        f20400i = logger;
    }

    public h(in.g gVar, boolean z10) {
        l.f(gVar, "source");
        this.f20404g = gVar;
        this.f20405h = z10;
        b bVar = new b(gVar);
        this.f20402e = bVar;
        this.f20403f = new d.a(bVar, 4096, 0, 4, (g) null);
    }

    private final void B(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int b10 = (i11 & 8) != 0 ? vm.b.b(this.f20404g.readByte(), 255) : 0;
            cVar.n(i12, this.f20404g.readInt() & Integer.MAX_VALUE, l(f20401j.b(i10 - 4, i11, b10), b10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void E(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 != 0) {
            int readInt = this.f20404g.readInt();
            b a10 = b.f20253u.a(readInt);
            if (a10 != null) {
                cVar.k(i12, a10);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    private final void H(c cVar, int i10, int i11, int i12) {
        int readInt;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i11 & 1) != 0) {
            if (i10 == 0) {
                cVar.b();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i10 % 6 == 0) {
            m mVar = new m();
            hm.a h10 = f.h(f.i(0, i10), 6);
            int l10 = h10.l();
            int n10 = h10.n();
            int o10 = h10.o();
            if (o10 < 0 ? l10 >= n10 : l10 <= n10) {
                while (true) {
                    int c10 = vm.b.c(this.f20404g.readShort(), 65535);
                    readInt = this.f20404g.readInt();
                    if (c10 != 2) {
                        if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 != 4) {
                            if (c10 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            c10 = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.h(c10, readInt);
                    if (l10 == n10) {
                        break;
                    }
                    l10 += o10;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.c(false, mVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
    }

    private final void R(c cVar, int i10, int i11, int i12) {
        if (i10 == 4) {
            long d10 = vm.b.d(this.f20404g.readInt(), 2147483647L);
            if (d10 != 0) {
                cVar.m(i12, d10);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
    }

    private final void g(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = (i11 & 1) != 0;
            if ((i11 & 32) == 0) {
                if ((i11 & 8) != 0) {
                    i13 = vm.b.b(this.f20404g.readByte(), 255);
                }
                cVar.f(z10, i12, this.f20404g, f20401j.b(i10, i11, i13));
                this.f20404g.skip((long) i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void h(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f20404g.readInt();
            int readInt2 = this.f20404g.readInt();
            int i13 = i10 - 8;
            b a10 = b.f20253u.a(readInt2);
            if (a10 != null) {
                in.h hVar = in.h.f24467h;
                if (i13 > 0) {
                    hVar = this.f20404g.v((long) i13);
                }
                cVar.l(readInt, a10, hVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List l(int i10, int i11, int i12, int i13) {
        this.f20402e.g(i10);
        b bVar = this.f20402e;
        bVar.h(bVar.c());
        this.f20402e.l(i11);
        this.f20402e.f(i12);
        this.f20402e.n(i13);
        this.f20403f.k();
        return this.f20403f.e();
    }

    private final void n(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = (i11 & 1) != 0;
            if ((i11 & 8) != 0) {
                i13 = vm.b.b(this.f20404g.readByte(), 255);
            }
            if ((i11 & 32) != 0) {
                s(cVar, i12);
                i10 -= 5;
            }
            cVar.j(z10, i12, -1, l(f20401j.b(i10, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void o(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f20404g.readInt();
            int readInt2 = this.f20404g.readInt();
            boolean z10 = true;
            if ((i11 & 1) == 0) {
                z10 = false;
            }
            cVar.e(z10, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void s(c cVar, int i10) {
        int readInt = this.f20404g.readInt();
        cVar.i(i10, readInt & Integer.MAX_VALUE, vm.b.b(this.f20404g.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }

    private final void y(c cVar, int i10, int i11, int i12) {
        if (i10 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        } else if (i12 != 0) {
            s(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    public void close() {
        this.f20404g.close();
    }

    public final boolean e(boolean z10, c cVar) {
        l.f(cVar, "handler");
        try {
            this.f20404g.p0(9);
            int G = vm.b.G(this.f20404g);
            if (G <= 16384) {
                int b10 = vm.b.b(this.f20404g.readByte(), 255);
                int b11 = vm.b.b(this.f20404g.readByte(), 255);
                int readInt = this.f20404g.readInt() & Integer.MAX_VALUE;
                Logger logger = f20400i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f20290e.c(true, readInt, G, b10, b11));
                }
                if (!z10 || b10 == 4) {
                    switch (b10) {
                        case 0:
                            g(cVar, G, b11, readInt);
                            return true;
                        case 1:
                            n(cVar, G, b11, readInt);
                            return true;
                        case 2:
                            y(cVar, G, b11, readInt);
                            return true;
                        case 3:
                            E(cVar, G, b11, readInt);
                            return true;
                        case 4:
                            H(cVar, G, b11, readInt);
                            return true;
                        case 5:
                            B(cVar, G, b11, readInt);
                            return true;
                        case 6:
                            o(cVar, G, b11, readInt);
                            return true;
                        case 7:
                            h(cVar, G, b11, readInt);
                            return true;
                        case 8:
                            R(cVar, G, b11, readInt);
                            return true;
                        default:
                            this.f20404g.skip((long) G);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + e.f20290e.b(b10));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + G);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void f(c cVar) {
        l.f(cVar, "handler");
        if (!this.f20405h) {
            in.g gVar = this.f20404g;
            in.h hVar = e.f20286a;
            in.h v10 = gVar.v((long) hVar.q());
            Logger logger = f20400i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(vm.b.q("<< CONNECTION " + v10.i(), new Object[0]));
            }
            if (!l.a(hVar, v10)) {
                throw new IOException("Expected a connection header but was " + v10.t());
            }
        } else if (!e(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
