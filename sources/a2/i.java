package a2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import c2.q;
import cm.l;
import d2.b;
import d2.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import y7.e;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f100a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f101b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private long f102c;

    /* renamed from: d  reason: collision with root package name */
    private String f103d;

    /* renamed from: e  reason: collision with root package name */
    private q f104e;

    /* renamed from: f  reason: collision with root package name */
    private LinkedList f105f;

    /* renamed from: g  reason: collision with root package name */
    private int f106g;

    /* renamed from: h  reason: collision with root package name */
    private final Date f107h = new Date();

    /* renamed from: i  reason: collision with root package name */
    private int f108i;

    /* renamed from: j  reason: collision with root package name */
    private int f109j;

    /* renamed from: k  reason: collision with root package name */
    private float f110k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList f111l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f112m;

    /* renamed from: n  reason: collision with root package name */
    private Map f113n;

    /* renamed from: o  reason: collision with root package name */
    private long f114o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f115p;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01bc, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01c1, code lost:
        r3.o(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(int r21, android.media.MediaFormat r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            java.lang.String r3 = "format"
            cm.l.f(r1, r3)
            r20.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f101b = r3
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            r0.f107h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f111l = r3
            r0.f112m = r2
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.f113n = r4
            r4 = 1
            r0.f115p = r4
            r5 = 96000(0x17700, float:1.34525E-40)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            pl.o r8 = pl.t.a(r5, r7)
            r5 = 88200(0x15888, float:1.23595E-40)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            pl.o r9 = pl.t.a(r5, r7)
            r5 = 64000(0xfa00, float:8.9683E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            pl.o r10 = pl.t.a(r5, r10)
            r5 = 48000(0xbb80, float:6.7262E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            pl.o r11 = pl.t.a(r5, r11)
            r5 = 44100(0xac44, float:6.1797E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            pl.o r12 = pl.t.a(r5, r12)
            r5 = 32000(0x7d00, float:4.4842E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            pl.o r5 = pl.t.a(r5, r14)
            r14 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r17 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            pl.o r14 = pl.t.a(r14, r13)
            r13 = 22050(0x5622, float:3.0899E-41)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r17 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)
            pl.o r15 = pl.t.a(r13, r15)
            r13 = 16000(0x3e80, float:2.2421E-41)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r17 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            pl.o r6 = pl.t.a(r13, r6)
            r13 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r17 = 9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            pl.o r17 = pl.t.a(r13, r7)
            r7 = 11025(0x2b11, float:1.545E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 10
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            pl.o r7 = pl.t.a(r7, r13)
            r13 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4 = 11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            pl.o r1 = pl.t.a(r13, r1)
            r4 = 5
            r13 = r5
            r5 = 4
            r16 = r6
            r18 = r7
            r19 = r1
            pl.o[] r1 = new pl.o[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.Map r1 = ql.i0.i(r1)
            r0.f113n = r1
            r1 = r21
            long r6 = (long) r1
            r0.f100a = r6
            if (r2 != 0) goto L_0x0246
            r1 = 3015(0xbc7, double:1.4896E-320)
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            r3.add(r6)
            r0.f102c = r1
            java.lang.String r1 = "width"
            r2 = r22
            int r1 = r2.getInteger(r1)
            r0.f109j = r1
            java.lang.String r1 = "height"
            int r1 = r2.getInteger(r1)
            r0.f108i = r1
            r1 = 90000(0x15f90, float:1.26117E-40)
            r0.f106g = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.f105f = r1
            java.lang.String r1 = "vide"
            r0.f103d = r1
            c2.q r1 = new c2.q
            r1.<init>()
            r0.f104e = r1
            java.lang.String r1 = "mime"
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r3 = "video/avc"
            boolean r3 = cm.l.a(r1, r3)
            if (r3 == 0) goto L_0x022e
            d2.c r1 = new d2.c
            java.lang.String r3 = "avc1"
            r1.<init>(r3)
            int r3 = r0.f109j
            int r6 = r0.f108i
            d2.c r1 = r0.p(r1, r3, r6)
            l8.a r3 = new l8.a
            r3.<init>()
            java.lang.String r6 = "csd-0"
            java.nio.ByteBuffer r7 = r2.getByteBuffer(r6)
            if (r7 == 0) goto L_0x01a2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.nio.ByteBuffer r6 = r2.getByteBuffer(r6)
            cm.l.c(r6)
            r6.position(r5)
            int r8 = r6.remaining()
            byte[] r8 = new byte[r8]
            r6.get(r8)
            r7.add(r8)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r8 = "csd-1"
            java.nio.ByteBuffer r8 = r2.getByteBuffer(r8)
            if (r8 == 0) goto L_0x01a2
            r8.position(r5)
            int r9 = r8.remaining()
            byte[] r9 = new byte[r9]
            r8.get(r9)
            r6.add(r9)
            r3.x(r7)
            r3.v(r6)
        L_0x01a2:
            java.lang.String r6 = "level"
            boolean r7 = r2.containsKey(r6)
            r8 = 13
            if (r7 == 0) goto L_0x0206
            int r2 = r2.getInteger(r6)
            r6 = 1
            if (r2 == r6) goto L_0x0200
            r6 = 2
            if (r2 == r6) goto L_0x01fc
            switch(r2) {
                case 4: goto L_0x01f8;
                case 8: goto L_0x01f4;
                case 16: goto L_0x01ef;
                case 32: goto L_0x01ec;
                case 64: goto L_0x01e8;
                case 128: goto L_0x01e1;
                case 256: goto L_0x01dc;
                case 512: goto L_0x01d9;
                case 1024: goto L_0x01d6;
                case 2048: goto L_0x01d2;
                case 4096: goto L_0x01cf;
                case 8192: goto L_0x01cc;
                case 16384: goto L_0x01c8;
                case 32768: goto L_0x01c5;
                case 65536: goto L_0x01bf;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            r3.o(r8)
        L_0x01bc:
            r2 = 3
        L_0x01bd:
            r4 = 1
            goto L_0x020b
        L_0x01bf:
            r2 = 52
        L_0x01c1:
            r3.o(r2)
            goto L_0x01bc
        L_0x01c5:
            r2 = 51
            goto L_0x01c1
        L_0x01c8:
            r3.o(r4)
            goto L_0x01bc
        L_0x01cc:
            r2 = 42
            goto L_0x01c1
        L_0x01cf:
            r2 = 41
            goto L_0x01c1
        L_0x01d2:
            r3.o(r5)
            goto L_0x01bc
        L_0x01d6:
            r2 = 32
            goto L_0x01c1
        L_0x01d9:
            r2 = 31
            goto L_0x01c1
        L_0x01dc:
            r2 = 3
            r3.o(r2)
            goto L_0x01bd
        L_0x01e1:
            r2 = 3
            r4 = 22
        L_0x01e4:
            r3.o(r4)
            goto L_0x01bd
        L_0x01e8:
            r2 = 3
            r4 = 21
            goto L_0x01e4
        L_0x01ec:
            r2 = 3
            r4 = 2
            goto L_0x01e4
        L_0x01ef:
            r2 = 3
            r3.o(r8)
            goto L_0x01bd
        L_0x01f4:
            r2 = 3
            r4 = 12
            goto L_0x01e4
        L_0x01f8:
            r2 = 3
            r4 = 11
            goto L_0x01e4
        L_0x01fc:
            r2 = 3
            r4 = 27
            goto L_0x01e4
        L_0x0200:
            r4 = r6
            r2 = 3
            r3.o(r4)
            goto L_0x020b
        L_0x0206:
            r2 = 3
            r4 = 1
            r3.o(r8)
        L_0x020b:
            r5 = 100
            r3.p(r5)
            r5 = -1
            r3.r(r5)
            r3.q(r5)
            r3.s(r5)
            r3.t(r4)
            r3.u(r2)
            r2 = 0
            r3.w(r2)
            r1.h(r3)
        L_0x0227:
            c2.q r2 = r0.f104e
            r2.h(r1)
            goto L_0x02d7
        L_0x022e:
            java.lang.String r2 = "video/mp4v"
            boolean r1 = cm.l.a(r1, r2)
            if (r1 == 0) goto L_0x02d7
            d2.c r1 = new d2.c
            java.lang.String r2 = "mp4v"
            r1.<init>(r2)
            int r2 = r0.f109j
            int r3 = r0.f108i
            d2.c r1 = r0.p(r1, r2, r3)
            goto L_0x0227
        L_0x0246:
            r2 = r22
            r4 = 1024(0x400, double:5.06E-321)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.add(r1)
            r0.f102c = r4
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f110k = r1
            java.lang.String r1 = "sample-rate"
            int r1 = r2.getInteger(r1)
            r0.f106g = r1
            java.lang.String r1 = "soun"
            r0.f103d = r1
            c2.q r1 = new c2.q
            r1.<init>()
            r0.f104e = r1
            d2.b r1 = new d2.b
            java.lang.String r3 = "mp4a"
            r1.<init>(r3)
            d2.b r1 = r0.o(r1, r2)
            x7.b r2 = new x7.b
            r2.<init>()
            y7.h r3 = new y7.h
            r3.<init>()
            r4 = 0
            r3.i(r4)
            y7.n r4 = new y7.n
            r4.<init>()
            r5 = 2
            r4.h(r5)
            r3.j(r4)
            y7.e r4 = new y7.e
            r4.<init>()
            y7.e r4 = r0.q(r4)
            y7.a r6 = new y7.a
            r6.<init>()
            r6.p(r5)
            java.util.Map r5 = r0.f113n
            long r7 = r1.H()
            int r7 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r5 = r5.get(r7)
            cm.l.c(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6.r(r5)
            int r5 = r1.E()
            r6.q(r5)
            r4.h(r6)
            r3.h(r4)
            java.nio.ByteBuffer r4 = r3.f()
            r2.w(r3)
            r2.u(r4)
            r1.h(r2)
            goto L_0x0227
        L_0x02d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i.<init>(int, android.media.MediaFormat, boolean):void");
    }

    private final b o(b bVar, MediaFormat mediaFormat) {
        bVar.R(mediaFormat.getInteger("channel-count") == 1 ? 2 : mediaFormat.getInteger("channel-count"));
        bVar.X((long) mediaFormat.getInteger("sample-rate"));
        bVar.B(1);
        bVar.Y(16);
        return bVar;
    }

    private final c p(c cVar, int i10, int i11) {
        cVar.B(1);
        cVar.j0(24);
        cVar.s0(1);
        cVar.B0(72.0d);
        cVar.C0(72.0d);
        cVar.D0(i10);
        cVar.A0(i11);
        cVar.i0("AVC Coding");
        return cVar;
    }

    private final e q(e eVar) {
        eVar.l(64);
        eVar.m(5);
        eVar.j(1536);
        eVar.k(96000);
        eVar.i(96000);
        return eVar;
    }

    public final void a(long j10, MediaCodec.BufferInfo bufferInfo) {
        l.f(bufferInfo, "bufferInfo");
        boolean z10 = !this.f112m && (bufferInfo.flags & 1) != 0;
        this.f101b.add(new g(j10, (long) bufferInfo.size));
        LinkedList linkedList = this.f105f;
        if (!(linkedList == null || !z10 || linkedList == null)) {
            linkedList.add(Integer.valueOf(this.f101b.size()));
        }
        long j11 = bufferInfo.presentationTimeUs;
        this.f114o = j11;
        long j12 = (((j11 - this.f114o) * ((long) this.f106g)) + 500000) / 1000000;
        if (!this.f115p) {
            ArrayList arrayList = this.f111l;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j12));
            this.f102c += j12;
        }
        this.f115p = false;
    }

    public final Date b() {
        return this.f107h;
    }

    public final long c() {
        return this.f102c;
    }

    public final String d() {
        return this.f103d;
    }

    public final int e() {
        return this.f108i;
    }

    public final q f() {
        return this.f104e;
    }

    public final ArrayList g() {
        return this.f111l;
    }

    public final ArrayList h() {
        return this.f101b;
    }

    public final long[] i() {
        LinkedList linkedList = this.f105f;
        if (linkedList == null) {
            return null;
        }
        l.c(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList linkedList2 = this.f105f;
        l.c(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList linkedList3 = this.f105f;
        l.c(linkedList3);
        int size = linkedList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinkedList linkedList4 = this.f105f;
            l.c(linkedList4);
            jArr[i10] = (long) ((Number) linkedList4.get(i10)).intValue();
        }
        return jArr;
    }

    public final int j() {
        return this.f106g;
    }

    public final long k() {
        return this.f100a;
    }

    public final float l() {
        return this.f110k;
    }

    public final int m() {
        return this.f109j;
    }

    public final boolean n() {
        return this.f112m;
    }
}
