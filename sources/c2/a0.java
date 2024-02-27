package c2;

import b2.d;
import java.nio.ByteBuffer;
import java.util.Date;
import mn.a;
import pn.b;
import w7.c;
import w7.e;
import z7.f;

public class a0 extends c {
    private static final /* synthetic */ a.C0323a B = null;
    private static final /* synthetic */ a.C0323a C = null;
    private static final /* synthetic */ a.C0323a D = null;
    private static final /* synthetic */ a.C0323a E = null;
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
    private static final /* synthetic */ a.C0323a f4622a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4623b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4624c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4625d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4626e0 = null;
    private double A;

    /* renamed from: r  reason: collision with root package name */
    private Date f4627r;

    /* renamed from: s  reason: collision with root package name */
    private Date f4628s;

    /* renamed from: t  reason: collision with root package name */
    private long f4629t;

    /* renamed from: u  reason: collision with root package name */
    private long f4630u;

    /* renamed from: v  reason: collision with root package name */
    private int f4631v;

    /* renamed from: w  reason: collision with root package name */
    private int f4632w;

    /* renamed from: x  reason: collision with root package name */
    private float f4633x;

    /* renamed from: y  reason: collision with root package name */
    private f f4634y = f.f18917j;

    /* renamed from: z  reason: collision with root package name */
    private double f4635z;

    static {
        n();
    }

    public a0() {
        super("tkhd");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("TrackHeaderBox.java", a0.class);
        B = bVar.f("method-execution", bVar.e("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        C = bVar.f("method-execution", bVar.e("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        L = bVar.f("method-execution", bVar.e("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        M = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        N = bVar.f("method-execution", bVar.e("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        O = bVar.f("method-execution", bVar.e("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        P = bVar.f("method-execution", bVar.e("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 211);
        Q = bVar.f("method-execution", bVar.e("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        R = bVar.f("method-execution", bVar.e("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        S = bVar.f("method-execution", bVar.e("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        T = bVar.f("method-execution", bVar.e("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        U = bVar.f("method-execution", bVar.e("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        D = bVar.f("method-execution", bVar.e("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        V = bVar.f("method-execution", bVar.e("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 238);
        W = bVar.f("method-execution", bVar.e("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 242);
        X = bVar.f("method-execution", bVar.e("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        Y = bVar.f("method-execution", bVar.e("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        Z = bVar.f("method-execution", bVar.e("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        f4622a0 = bVar.f("method-execution", bVar.e("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        f4623b0 = bVar.f("method-execution", bVar.e("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 263);
        f4624c0 = bVar.f("method-execution", bVar.e("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        f4625d0 = bVar.f("method-execution", bVar.e("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        f4626e0 = bVar.f("method-execution", bVar.e("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        E = bVar.f("method-execution", bVar.e("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        F = bVar.f("method-execution", bVar.e("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        G = bVar.f("method-execution", bVar.e("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        H = bVar.f("method-execution", bVar.e("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        I = bVar.f("method-execution", bVar.e("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        J = bVar.f("method-execution", bVar.e("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        K = bVar.f("method-execution", bVar.e("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public long A() {
        e.b().c(b.c(D, this, this));
        return this.f4629t;
    }

    public float B() {
        e.b().c(b.c(H, this, this));
        return this.f4633x;
    }

    public double C() {
        e.b().c(b.c(J, this, this));
        return this.f4635z;
    }

    public void D(int i10) {
        e.b().c(b.d(S, this, this, on.a.d(i10)));
        this.f4632w = i10;
    }

    public void E(Date date) {
        e.b().c(b.d(N, this, this, date));
        this.f4627r = date;
        if (z7.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void F(long j10) {
        e.b().c(b.d(Q, this, this, on.a.e(j10)));
        this.f4630u = j10;
        if (j10 >= 4294967296L) {
            r(1);
        }
    }

    public void G(boolean z10) {
        e.b().c(b.d(f4623b0, this, this, on.a.a(z10)));
        r(z10 ? o() | 1 : o() & -2);
    }

    public void H(double d10) {
        e.b().c(b.d(W, this, this, on.a.b(d10)));
        this.A = d10;
    }

    public void I(boolean z10) {
        e.b().c(b.d(f4624c0, this, this, on.a.a(z10)));
        r(z10 ? o() | 2 : o() & -3);
    }

    public void J(boolean z10) {
        e.b().c(b.d(f4625d0, this, this, on.a.a(z10)));
        r(z10 ? o() | 4 : o() & -5);
    }

    public void K(int i10) {
        e.b().c(b.d(R, this, this, on.a.d(i10)));
        this.f4631v = i10;
    }

    public void L(f fVar) {
        e.b().c(b.d(U, this, this, fVar));
        this.f4634y = fVar;
    }

    public void M(Date date) {
        e.b().c(b.d(O, this, this, date));
        this.f4628s = date;
        if (z7.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void N(long j10) {
        e.b().c(b.d(P, this, this, on.a.e(j10)));
        this.f4629t = j10;
    }

    public void O(float f10) {
        e.b().c(b.d(T, this, this, on.a.c(f10)));
        this.f4633x = f10;
    }

    public void P(double d10) {
        e.b().c(b.d(V, this, this, on.a.b(d10)));
        this.f4635z = d10;
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (p() == 1) {
            this.f4627r = z7.c.b(b2.c.k(byteBuffer));
            this.f4628s = z7.c.b(b2.c.k(byteBuffer));
            this.f4629t = b2.c.j(byteBuffer);
            b2.c.j(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f4630u = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f4627r = z7.c.b(b2.c.j(byteBuffer));
            this.f4628s = z7.c.b(b2.c.j(byteBuffer));
            this.f4629t = b2.c.j(byteBuffer);
            b2.c.j(byteBuffer);
            this.f4630u = b2.c.j(byteBuffer);
        }
        b2.c.j(byteBuffer);
        b2.c.j(byteBuffer);
        this.f4631v = b2.c.h(byteBuffer);
        this.f4632w = b2.c.h(byteBuffer);
        this.f4633x = b2.c.e(byteBuffer);
        b2.c.h(byteBuffer);
        this.f4634y = f.a(byteBuffer);
        this.f4635z = b2.c.d(byteBuffer);
        this.A = b2.c.d(byteBuffer);
    }

    public void b(ByteBuffer byteBuffer) {
        e.b().c(b.d(L, this, this, byteBuffer));
        t(byteBuffer);
        if (p() == 1) {
            d.h(byteBuffer, z7.c.a(this.f4627r));
            d.h(byteBuffer, z7.c.a(this.f4628s));
            d.g(byteBuffer, this.f4629t);
            d.g(byteBuffer, 0);
            d.h(byteBuffer, this.f4630u);
        } else {
            d.g(byteBuffer, z7.c.a(this.f4627r));
            d.g(byteBuffer, z7.c.a(this.f4628s));
            d.g(byteBuffer, this.f4629t);
            d.g(byteBuffer, 0);
            d.g(byteBuffer, this.f4630u);
        }
        d.g(byteBuffer, 0);
        d.g(byteBuffer, 0);
        d.e(byteBuffer, this.f4631v);
        d.e(byteBuffer, this.f4632w);
        d.c(byteBuffer, (double) this.f4633x);
        d.e(byteBuffer, 0);
        this.f4634y.c(byteBuffer);
        d.b(byteBuffer, this.f4635z);
        d.b(byteBuffer, this.A);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (p() == 1 ? 36 : 24) + 60;
    }

    public String toString() {
        e.b().c(b.c(M, this, this));
        return "TrackHeaderBox[" + "creationTime=" + v() + ";" + "modificationTime=" + z() + ";" + "trackId=" + A() + ";" + "duration=" + w() + ";" + "layer=" + y() + ";" + "alternateGroup=" + u() + ";" + "volume=" + B() + ";" + "matrix=" + this.f4634y + ";" + "width=" + C() + ";" + "height=" + x() + "]";
    }

    public int u() {
        e.b().c(b.c(G, this, this));
        return this.f4632w;
    }

    public Date v() {
        e.b().c(b.c(B, this, this));
        return this.f4627r;
    }

    public long w() {
        e.b().c(b.c(E, this, this));
        return this.f4630u;
    }

    public double x() {
        e.b().c(b.c(K, this, this));
        return this.A;
    }

    public int y() {
        e.b().c(b.c(F, this, this));
        return this.f4631v;
    }

    public Date z() {
        e.b().c(b.c(C, this, this));
        return this.f4628s;
    }
}
