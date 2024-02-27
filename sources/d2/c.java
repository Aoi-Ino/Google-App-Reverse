package d2;

import b2.d;
import b2.e;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class c extends a {

    /* renamed from: p  reason: collision with root package name */
    private int f9694p;

    /* renamed from: q  reason: collision with root package name */
    private int f9695q;

    /* renamed from: r  reason: collision with root package name */
    private double f9696r = 72.0d;

    /* renamed from: s  reason: collision with root package name */
    private double f9697s = 72.0d;

    /* renamed from: t  reason: collision with root package name */
    private int f9698t = 1;

    /* renamed from: u  reason: collision with root package name */
    private String f9699u = "";

    /* renamed from: v  reason: collision with root package name */
    private int f9700v = 24;

    /* renamed from: w  reason: collision with root package name */
    private long[] f9701w = new long[3];

    public c(String str) {
        super(str);
    }

    public void A0(int i10) {
        this.f9695q = i10;
    }

    public void B0(double d10) {
        this.f9696r = d10;
    }

    public void C0(double d10) {
        this.f9697s = d10;
    }

    public void D0(int i10) {
        this.f9694p = i10;
    }

    public String E() {
        return this.f9699u;
    }

    public int H() {
        return this.f9700v;
    }

    public int R() {
        return this.f9698t;
    }

    public int X() {
        return this.f9695q;
    }

    public double Y() {
        return this.f9696r;
    }

    public double Z() {
        return this.f9697s;
    }

    public int c0() {
        return this.f9694p;
    }

    public void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(y());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        d.e(allocate, this.f9682o);
        d.e(allocate, 0);
        d.e(allocate, 0);
        d.g(allocate, this.f9701w[0]);
        d.g(allocate, this.f9701w[1]);
        d.g(allocate, this.f9701w[2]);
        d.e(allocate, c0());
        d.e(allocate, X());
        d.b(allocate, Y());
        d.b(allocate, Z());
        d.g(allocate, 0);
        d.e(allocate, R());
        d.i(allocate, e.c(E()));
        allocate.put(e.b(E()));
        int c10 = e.c(E());
        while (c10 < 31) {
            c10++;
            allocate.put((byte) 0);
        }
        d.e(allocate, H());
        d.e(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        s(writableByteChannel);
    }

    public long f() {
        long n10 = n();
        return 78 + n10 + ((long) ((this.f17939n || n10 + 86 >= 4294967296L) ? 16 : 8));
    }

    public void i0(String str) {
        this.f9699u = str;
    }

    public void j0(int i10) {
        this.f9700v = i10;
    }

    public void s0(int i10) {
        this.f9698t = i10;
    }
}
