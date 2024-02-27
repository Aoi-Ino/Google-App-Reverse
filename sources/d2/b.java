package d2;

import b2.d;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class b extends a {
    private long A;
    private byte[] B;

    /* renamed from: p  reason: collision with root package name */
    private int f9683p;

    /* renamed from: q  reason: collision with root package name */
    private int f9684q;

    /* renamed from: r  reason: collision with root package name */
    private long f9685r;

    /* renamed from: s  reason: collision with root package name */
    private int f9686s;

    /* renamed from: t  reason: collision with root package name */
    private int f9687t;

    /* renamed from: u  reason: collision with root package name */
    private int f9688u;

    /* renamed from: v  reason: collision with root package name */
    private long f9689v;

    /* renamed from: w  reason: collision with root package name */
    private long f9690w;

    /* renamed from: x  reason: collision with root package name */
    private long f9691x;

    /* renamed from: y  reason: collision with root package name */
    private long f9692y;

    /* renamed from: z  reason: collision with root package name */
    private int f9693z;

    public b(String str) {
        super(str);
    }

    public int E() {
        return this.f9683p;
    }

    public long H() {
        return this.f9685r;
    }

    public void R(int i10) {
        this.f9683p = i10;
    }

    public void X(long j10) {
        this.f9685r = j10;
    }

    public void Y(int i10) {
        this.f9684q = i10;
    }

    public void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(y());
        int i10 = this.f9686s;
        int i11 = 0;
        int i12 = (i10 == 1 ? 16 : 0) + 28;
        if (i10 == 2) {
            i11 = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12 + i11);
        allocate.position(6);
        d.e(allocate, this.f9682o);
        d.e(allocate, this.f9686s);
        d.e(allocate, this.f9693z);
        d.g(allocate, this.A);
        d.e(allocate, this.f9683p);
        d.e(allocate, this.f9684q);
        d.e(allocate, this.f9687t);
        d.e(allocate, this.f9688u);
        d.g(allocate, this.f17938m.equals("mlpa") ? H() : H() << 16);
        if (this.f9686s == 1) {
            d.g(allocate, this.f9689v);
            d.g(allocate, this.f9690w);
            d.g(allocate, this.f9691x);
            d.g(allocate, this.f9692y);
        }
        if (this.f9686s == 2) {
            d.g(allocate, this.f9689v);
            d.g(allocate, this.f9690w);
            d.g(allocate, this.f9691x);
            d.g(allocate, this.f9692y);
            allocate.put(this.B);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        s(writableByteChannel);
    }

    public long f() {
        int i10 = this.f9686s;
        int i11 = 0;
        int i12 = 16;
        int i13 = (i10 == 1 ? 16 : 0) + 28;
        if (i10 == 2) {
            i11 = 36;
        }
        long n10 = ((long) (i13 + i11)) + n();
        if (!this.f17939n && 8 + n10 < 4294967296L) {
            i12 = 8;
        }
        return n10 + ((long) i12);
    }

    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.f9692y + ", bytesPerFrame=" + this.f9691x + ", bytesPerPacket=" + this.f9690w + ", samplesPerPacket=" + this.f9689v + ", packetSize=" + this.f9688u + ", compressionId=" + this.f9687t + ", soundVersion=" + this.f9686s + ", sampleRate=" + this.f9685r + ", sampleSize=" + this.f9684q + ", channelCount=" + this.f9683p + ", boxes=" + l() + '}';
    }
}
