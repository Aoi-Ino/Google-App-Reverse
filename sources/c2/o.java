package c2;

import b2.d;
import java.nio.ByteBuffer;
import java.util.Date;
import mn.a;
import pn.b;
import w7.c;
import w7.e;
import z7.f;

public class o extends c {
    private static final /* synthetic */ a.C0323a F = null;
    private static final /* synthetic */ a.C0323a G = null;
    private static final /* synthetic */ a.C0323a H = null;
    private static final /* synthetic */ a.C0323a I = null;
    private static final /* synthetic */ a.C0323a J = null;
    private static final /* synthetic */ a.C0323a K = null;
    private static final /* synthetic */ a.C0323a L = null;
    private static final /* synthetic */ a.C0323a M = null;
    private static final /* synthetic */ a.C0323a N = null;
    private static final /* synthetic */ a.C0323a O = null;
    private static final /* synthetic */ a.C0323a P = null;
    private static final /* synthetic */ a.C0323a Q = null;
    private static final /* synthetic */ a.C0323a R = null;
    private static final /* synthetic */ a.C0323a S = null;
    private static final /* synthetic */ a.C0323a T = null;
    private static final /* synthetic */ a.C0323a U = null;
    private static final /* synthetic */ a.C0323a V = null;
    private static final /* synthetic */ a.C0323a W = null;
    private static final /* synthetic */ a.C0323a X = null;
    private static final /* synthetic */ a.C0323a Y = null;
    private static final /* synthetic */ a.C0323a Z = null;

    /* renamed from: a0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4683a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4684b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4685c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4686d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4687e0 = null;

    /* renamed from: f0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4688f0 = null;

    /* renamed from: g0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4689g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4690h0 = null;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;

    /* renamed from: r  reason: collision with root package name */
    private Date f4691r;

    /* renamed from: s  reason: collision with root package name */
    private Date f4692s;

    /* renamed from: t  reason: collision with root package name */
    private long f4693t;

    /* renamed from: u  reason: collision with root package name */
    private long f4694u;

    /* renamed from: v  reason: collision with root package name */
    private double f4695v = 1.0d;

    /* renamed from: w  reason: collision with root package name */
    private float f4696w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    private f f4697x = f.f18917j;

    /* renamed from: y  reason: collision with root package name */
    private long f4698y;

    /* renamed from: z  reason: collision with root package name */
    private int f4699z;

    static {
        n();
    }

    public o() {
        super("mvhd");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("MovieHeaderBox.java", o.class);
        F = bVar.f("method-execution", bVar.e("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        G = bVar.f("method-execution", bVar.e("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        P = bVar.f("method-execution", bVar.e("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        Q = bVar.f("method-execution", bVar.e("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        R = bVar.f("method-execution", bVar.e("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        S = bVar.f("method-execution", bVar.e("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        T = bVar.f("method-execution", bVar.e("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        U = bVar.f("method-execution", bVar.e("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        V = bVar.f("method-execution", bVar.e("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        W = bVar.f("method-execution", bVar.e("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        X = bVar.f("method-execution", bVar.e("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        Y = bVar.f("method-execution", bVar.e("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        H = bVar.f("method-execution", bVar.e("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        Z = bVar.f("method-execution", bVar.e("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 250);
        f4683a0 = bVar.f("method-execution", bVar.e("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        f4684b0 = bVar.f("method-execution", bVar.e("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        f4685c0 = bVar.f("method-execution", bVar.e("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        f4686d0 = bVar.f("method-execution", bVar.e("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        f4687e0 = bVar.f("method-execution", bVar.e("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        f4688f0 = bVar.f("method-execution", bVar.e("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        f4689g0 = bVar.f("method-execution", bVar.e("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        f4690h0 = bVar.f("method-execution", bVar.e("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        I = bVar.f("method-execution", bVar.e("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        J = bVar.f("method-execution", bVar.e("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        K = bVar.f("method-execution", bVar.e("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        L = bVar.f("method-execution", bVar.e("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        M = bVar.f("method-execution", bVar.e("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        N = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        O = bVar.f("method-execution", bVar.e("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }

    public float A() {
        e.b().c(b.c(K, this, this));
        return this.f4696w;
    }

    public void B(Date date) {
        e.b().c(b.d(O, this, this, date));
        this.f4691r = date;
        if (z7.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void C(long j10) {
        e.b().c(b.d(R, this, this, on.a.e(j10)));
        this.f4694u = j10;
        if (j10 >= 4294967296L) {
            s(1);
        }
    }

    public void D(f fVar) {
        e.b().c(b.d(U, this, this, fVar));
        this.f4697x = fVar;
    }

    public void E(Date date) {
        e.b().c(b.d(P, this, this, date));
        this.f4692s = date;
        if (z7.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void F(long j10) {
        e.b().c(b.d(V, this, this, on.a.e(j10)));
        this.f4698y = j10;
    }

    public void G(long j10) {
        e.b().c(b.d(Q, this, this, on.a.e(j10)));
        this.f4693t = j10;
    }

    public void a(ByteBuffer byteBuffer) {
        long j10;
        q(byteBuffer);
        if (p() == 1) {
            this.f4691r = z7.c.b(b2.c.k(byteBuffer));
            this.f4692s = z7.c.b(b2.c.k(byteBuffer));
            this.f4693t = b2.c.j(byteBuffer);
            j10 = b2.c.k(byteBuffer);
        } else {
            this.f4691r = z7.c.b(b2.c.j(byteBuffer));
            this.f4692s = z7.c.b(b2.c.j(byteBuffer));
            this.f4693t = b2.c.j(byteBuffer);
            j10 = b2.c.j(byteBuffer);
        }
        this.f4694u = j10;
        this.f4695v = b2.c.d(byteBuffer);
        this.f4696w = b2.c.e(byteBuffer);
        b2.c.h(byteBuffer);
        b2.c.j(byteBuffer);
        b2.c.j(byteBuffer);
        this.f4697x = f.a(byteBuffer);
        this.f4699z = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.f4698y = b2.c.j(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (p() == 1) {
            d.h(byteBuffer, z7.c.a(this.f4691r));
            d.h(byteBuffer, z7.c.a(this.f4692s));
            d.g(byteBuffer, this.f4693t);
            d.h(byteBuffer, this.f4694u);
        } else {
            d.g(byteBuffer, z7.c.a(this.f4691r));
            d.g(byteBuffer, z7.c.a(this.f4692s));
            d.g(byteBuffer, this.f4693t);
            d.g(byteBuffer, this.f4694u);
        }
        d.b(byteBuffer, this.f4695v);
        d.c(byteBuffer, (double) this.f4696w);
        d.e(byteBuffer, 0);
        d.g(byteBuffer, 0);
        d.g(byteBuffer, 0);
        this.f4697x.c(byteBuffer);
        byteBuffer.putInt(this.f4699z);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt(this.E);
        d.g(byteBuffer, this.f4698y);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (p() == 1 ? 32 : 20) + 80;
    }

    public String toString() {
        e.b().c(b.c(N, this, this));
        return "MovieHeaderBox[" + "creationTime=" + u() + ";" + "modificationTime=" + w() + ";" + "timescale=" + z() + ";" + "duration=" + v() + ";" + "rate=" + y() + ";" + "volume=" + A() + ";" + "matrix=" + this.f4697x + ";" + "nextTrackId=" + x() + "]";
    }

    public Date u() {
        e.b().c(b.c(F, this, this));
        return this.f4691r;
    }

    public long v() {
        e.b().c(b.c(I, this, this));
        return this.f4694u;
    }

    public Date w() {
        e.b().c(b.c(G, this, this));
        return this.f4692s;
    }

    public long x() {
        e.b().c(b.c(M, this, this));
        return this.f4698y;
    }

    public double y() {
        e.b().c(b.c(J, this, this));
        return this.f4695v;
    }

    public long z() {
        e.b().c(b.c(H, this, this));
        return this.f4693t;
    }
}
