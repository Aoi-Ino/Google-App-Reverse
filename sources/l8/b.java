package l8;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f13429a;

    /* renamed from: b  reason: collision with root package name */
    public int f13430b;

    /* renamed from: c  reason: collision with root package name */
    public int f13431c;

    /* renamed from: d  reason: collision with root package name */
    public int f13432d;

    /* renamed from: e  reason: collision with root package name */
    public int f13433e;

    /* renamed from: f  reason: collision with root package name */
    public List f13434f;

    /* renamed from: g  reason: collision with root package name */
    public List f13435g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13436h;

    /* renamed from: i  reason: collision with root package name */
    public int f13437i;

    /* renamed from: j  reason: collision with root package name */
    public int f13438j;

    /* renamed from: k  reason: collision with root package name */
    public int f13439k;

    /* renamed from: l  reason: collision with root package name */
    public List f13440l;

    /* renamed from: m  reason: collision with root package name */
    public int f13441m;

    /* renamed from: n  reason: collision with root package name */
    public int f13442n;

    /* renamed from: o  reason: collision with root package name */
    public int f13443o;

    /* renamed from: p  reason: collision with root package name */
    public int f13444p;

    /* renamed from: q  reason: collision with root package name */
    public int f13445q;

    public b() {
        this.f13434f = new ArrayList();
        this.f13435g = new ArrayList();
        this.f13436h = true;
        this.f13437i = 1;
        this.f13438j = 0;
        this.f13439k = 0;
        this.f13440l = new ArrayList();
        this.f13441m = 63;
        this.f13442n = 7;
        this.f13443o = 31;
        this.f13444p = 31;
        this.f13445q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        d.i(byteBuffer, this.f13429a);
        d.i(byteBuffer, this.f13430b);
        d.i(byteBuffer, this.f13431c);
        d.i(byteBuffer, this.f13432d);
        y7.d dVar = new y7.d(byteBuffer);
        dVar.a(this.f13441m, 6);
        dVar.a(this.f13433e, 2);
        dVar.a(this.f13442n, 3);
        dVar.a(this.f13435g.size(), 5);
        for (byte[] bArr : this.f13434f) {
            d.e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        d.i(byteBuffer, this.f13435g.size());
        for (byte[] bArr2 : this.f13435g) {
            d.e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f13436h) {
            int i10 = this.f13430b;
            if (i10 == 100 || i10 == 110 || i10 == 122 || i10 == 144) {
                y7.d dVar2 = new y7.d(byteBuffer);
                dVar2.a(this.f13443o, 6);
                dVar2.a(this.f13437i, 2);
                dVar2.a(this.f13444p, 5);
                dVar2.a(this.f13438j, 3);
                dVar2.a(this.f13445q, 5);
                dVar2.a(this.f13439k, 3);
                for (byte[] bArr3 : this.f13440l) {
                    d.e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        long j10;
        int i10;
        long j11 = 6;
        for (byte[] length : this.f13434f) {
            j11 = j11 + 2 + ((long) length.length);
        }
        long j12 = j11 + 1;
        for (byte[] length2 : this.f13435g) {
            j12 = j10 + 2 + ((long) length2.length);
        }
        if (this.f13436h && ((i10 = this.f13430b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            j10 += 4;
            for (byte[] length3 : this.f13440l) {
                j10 = j10 + 2 + ((long) length3.length);
            }
        }
        return j10;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f13429a + ", avcProfileIndication=" + this.f13430b + ", profileCompatibility=" + this.f13431c + ", avcLevelIndication=" + this.f13432d + ", lengthSizeMinusOne=" + this.f13433e + ", hasExts=" + this.f13436h + ", chromaFormat=" + this.f13437i + ", bitDepthLumaMinus8=" + this.f13438j + ", bitDepthChromaMinus8=" + this.f13439k + ", lengthSizeMinusOnePaddingBits=" + this.f13441m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f13442n + ", chromaFormatPaddingBits=" + this.f13443o + ", bitDepthLumaMinus8PaddingBits=" + this.f13444p + ", bitDepthChromaMinus8PaddingBits=" + this.f13445q + '}';
    }

    public b(ByteBuffer byteBuffer) {
        int i10;
        this.f13434f = new ArrayList();
        this.f13435g = new ArrayList();
        this.f13436h = true;
        this.f13437i = 1;
        this.f13438j = 0;
        this.f13439k = 0;
        this.f13440l = new ArrayList();
        this.f13441m = 63;
        this.f13442n = 7;
        this.f13443o = 31;
        this.f13444p = 31;
        this.f13445q = 31;
        this.f13429a = c.l(byteBuffer);
        this.f13430b = c.l(byteBuffer);
        this.f13431c = c.l(byteBuffer);
        this.f13432d = c.l(byteBuffer);
        y7.c cVar = new y7.c(byteBuffer);
        this.f13441m = cVar.a(6);
        this.f13433e = cVar.a(2);
        this.f13442n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i11 = 0; i11 < a10; i11++) {
            byte[] bArr = new byte[c.h(byteBuffer)];
            byteBuffer.get(bArr);
            this.f13434f.add(bArr);
        }
        long l10 = (long) c.l(byteBuffer);
        for (int i12 = 0; ((long) i12) < l10; i12++) {
            byte[] bArr2 = new byte[c.h(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f13435g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f13436h = false;
        }
        if (!this.f13436h || !((i10 = this.f13430b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            this.f13437i = -1;
            this.f13438j = -1;
            this.f13439k = -1;
            return;
        }
        y7.c cVar2 = new y7.c(byteBuffer);
        this.f13443o = cVar2.a(6);
        this.f13437i = cVar2.a(2);
        this.f13444p = cVar2.a(5);
        this.f13438j = cVar2.a(3);
        this.f13445q = cVar2.a(5);
        this.f13439k = cVar2.a(3);
        long l11 = (long) c.l(byteBuffer);
        for (int i13 = 0; ((long) i13) < l11; i13++) {
            byte[] bArr3 = new byte[c.h(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f13440l.add(bArr3);
        }
    }
}
