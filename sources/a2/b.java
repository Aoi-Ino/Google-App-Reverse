package a2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import c2.a0;
import c2.b0;
import c2.e;
import c2.g;
import c2.h;
import c2.i;
import c2.j;
import c2.k;
import c2.m;
import c2.n;
import c2.o;
import c2.p;
import c2.r;
import c2.s;
import c2.t;
import c2.u;
import c2.v;
import c2.w;
import c2.x;
import c2.y;
import c2.z;
import cm.l;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import z7.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private c f58a;

    /* renamed from: b  reason: collision with root package name */
    private d f59b;

    /* renamed from: c  reason: collision with root package name */
    private FileOutputStream f60c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f61d;

    /* renamed from: e  reason: collision with root package name */
    private long f62e;

    /* renamed from: f  reason: collision with root package name */
    private long f63f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f64g = true;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f65h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private ByteBuffer f66i;

    private final h b() {
        return new h("isom", 0, q.l("isom", "iso2", "mp41"));
    }

    private final n d(d dVar) {
        n nVar = new n();
        o oVar = new o();
        oVar.B(new Date());
        oVar.E(new Date());
        oVar.D(f.f18917j);
        long p10 = p(dVar);
        Iterator it = dVar.e().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            long c10 = (iVar.c() * p10) / ((long) iVar.j());
            if (c10 > j10) {
                j10 = c10;
            }
        }
        oVar.C(j10);
        oVar.G(p10);
        oVar.F((long) (dVar.e().size() + 1));
        nVar.h(oVar);
        Iterator it2 = dVar.e().iterator();
        while (it2.hasNext()) {
            i iVar2 = (i) it2.next();
            l.e(iVar2, "track");
            nVar.h(l(iVar2, dVar));
        }
        return nVar;
    }

    private final c2.b e(i iVar) {
        s sVar = new s();
        h(iVar, sVar);
        k(iVar, sVar);
        i(iVar, sVar);
        g(iVar, sVar);
        j(iVar, sVar);
        f(iVar, sVar);
        return sVar;
    }

    private final void f(i iVar, s sVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iVar.h().iterator();
        long j10 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            long a10 = gVar.a();
            if (!(j10 == -1 || j10 == a10)) {
                j10 = -1;
            }
            if (j10 == -1) {
                arrayList.add(Long.valueOf(a10));
            }
            j10 = gVar.b() + a10;
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            l.e(obj, "chunksOffsets[a]");
            jArr[i10] = ((Number) obj).longValue();
        }
        v vVar = new v();
        vVar.v(jArr);
        sVar.h(vVar);
    }

    private final void g(i iVar, s sVar) {
        t tVar = new t();
        tVar.v(new LinkedList());
        int size = iVar.h().size();
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = iVar.h().get(i13);
            l.e(obj, "track.getSamples()[a]");
            g gVar = (g) obj;
            long a10 = gVar.a() + gVar.b();
            i12++;
            if (i13 != size - 1) {
                Object obj2 = iVar.h().get(i13 + 1);
                l.e(obj2, "track.getSamples()[a + 1]");
                if (a10 == ((g) obj2).a()) {
                }
            }
            if (i10 != i12) {
                tVar.u().add(new t.a((long) i11, (long) i12, 1));
                i10 = i12;
            }
            i11++;
            i12 = 0;
        }
        sVar.h(tVar);
    }

    private final void h(i iVar, s sVar) {
        sVar.h(iVar.f());
    }

    private final void i(i iVar, s sVar) {
        long[] i10 = iVar.i();
        if (i10 != null) {
            if (!(i10.length == 0)) {
                x xVar = new x();
                xVar.u(i10);
                sVar.h(xVar);
            }
        }
    }

    private final void j(i iVar, s sVar) {
        r rVar = new r();
        rVar.w((long[]) this.f65h.get(iVar));
        sVar.h(rVar);
    }

    private final void k(i iVar, s sVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iVar.g().iterator();
        y.a aVar = null;
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            if (aVar != null) {
                long b10 = aVar.b();
                if (l10 != null && b10 == l10.longValue()) {
                    aVar.c(aVar.a() + 1);
                }
            }
            l.e(l10, "delta");
            aVar = new y.a(1, l10.longValue());
            arrayList.add(aVar);
        }
        y yVar = new y();
        yVar.u(arrayList);
        sVar.h(yVar);
    }

    private final z l(i iVar, d dVar) {
        c2.b pVar;
        z zVar = new z();
        a0 a0Var = new a0();
        a0Var.G(true);
        a0Var.J(true);
        a0Var.I(true);
        a0Var.L(iVar.n() ? f.f18917j : dVar.d());
        a0Var.D(0);
        a0Var.E(iVar.b());
        a0Var.F((iVar.c() * p(dVar)) / ((long) iVar.j()));
        a0Var.H((double) iVar.e());
        a0Var.P((double) iVar.m());
        a0Var.K(0);
        a0Var.M(new Date());
        a0Var.N(iVar.k() + 1);
        a0Var.O(iVar.l());
        zVar.h(a0Var);
        k kVar = new k();
        zVar.h(kVar);
        c2.l lVar = new c2.l();
        lVar.z(iVar.b());
        lVar.A(iVar.c());
        lVar.C((long) iVar.j());
        lVar.B("eng");
        kVar.h(lVar);
        i iVar2 = new i();
        iVar2.x(iVar.n() ? "SoundHandle" : "VideoHandle");
        iVar2.w(iVar.d());
        kVar.h(iVar2);
        m mVar = new m();
        if (l.a(iVar.d(), "vide")) {
            pVar = new b0();
        } else if (l.a(iVar.d(), "soun")) {
            pVar = new u();
        } else if (l.a(iVar.d(), "text")) {
            pVar = new p();
        } else if (l.a(iVar.d(), "subt")) {
            pVar = new w();
        } else if (l.a(iVar.d(), "hint")) {
            pVar = new j();
        } else {
            if (l.a(iVar.d(), "sbtl")) {
                pVar = new p();
            }
            c2.f fVar = new c2.f();
            g gVar = new g();
            fVar.h(gVar);
            e eVar = new e();
            eVar.r(1);
            gVar.h(eVar);
            mVar.h(fVar);
            mVar.h(e(iVar));
            kVar.h(mVar);
            return zVar;
        }
        mVar.h(pVar);
        c2.f fVar2 = new c2.f();
        g gVar2 = new g();
        fVar2.h(gVar2);
        e eVar2 = new e();
        eVar2.r(1);
        gVar2.h(eVar2);
        mVar.h(fVar2);
        mVar.h(e(iVar));
        kVar.h(mVar);
        return zVar;
    }

    private final void n() {
        FileChannel fileChannel = this.f61d;
        FileOutputStream fileOutputStream = null;
        if (fileChannel == null) {
            l.v("fc");
            fileChannel = null;
        }
        long position = fileChannel.position();
        FileChannel fileChannel2 = this.f61d;
        if (fileChannel2 == null) {
            l.v("fc");
            fileChannel2 = null;
        }
        c cVar = this.f58a;
        if (cVar == null) {
            l.v("mdat");
            cVar = null;
        }
        fileChannel2.position(cVar.b());
        c cVar2 = this.f58a;
        if (cVar2 == null) {
            l.v("mdat");
            cVar2 = null;
        }
        FileChannel fileChannel3 = this.f61d;
        if (fileChannel3 == null) {
            l.v("fc");
            fileChannel3 = null;
        }
        cVar2.e(fileChannel3);
        FileChannel fileChannel4 = this.f61d;
        if (fileChannel4 == null) {
            l.v("fc");
            fileChannel4 = null;
        }
        fileChannel4.position(position);
        c cVar3 = this.f58a;
        if (cVar3 == null) {
            l.v("mdat");
            cVar3 = null;
        }
        cVar3.h(0);
        c cVar4 = this.f58a;
        if (cVar4 == null) {
            l.v("mdat");
            cVar4 = null;
        }
        cVar4.d(0);
        FileOutputStream fileOutputStream2 = this.f60c;
        if (fileOutputStream2 == null) {
            l.v("fos");
        } else {
            fileOutputStream = fileOutputStream2;
        }
        fileOutputStream.flush();
    }

    private final long o(long j10, long j11) {
        return j11 == 0 ? j10 : o(j11, j10 % j11);
    }

    private final long p(d dVar) {
        long j10 = dVar.e().isEmpty() ^ true ? (long) ((i) dVar.e().iterator().next()).j() : 0;
        Iterator it = dVar.e().iterator();
        while (it.hasNext()) {
            j10 = o((long) ((i) it.next()).j(), j10);
        }
        return j10;
    }

    public final int a(MediaFormat mediaFormat, boolean z10) {
        l.f(mediaFormat, "mediaFormat");
        d dVar = this.f59b;
        if (dVar == null) {
            l.v("currentMp4Movie");
            dVar = null;
        }
        return dVar.b(mediaFormat, z10);
    }

    public final b c(d dVar) {
        l.f(dVar, "mp4Movie");
        this.f59b = dVar;
        FileOutputStream fileOutputStream = new FileOutputStream(dVar.c());
        this.f60c = fileOutputStream;
        FileChannel channel = fileOutputStream.getChannel();
        l.e(channel, "fos.channel");
        this.f61d = channel;
        h b10 = b();
        FileChannel fileChannel = this.f61d;
        if (fileChannel == null) {
            l.v("fc");
            fileChannel = null;
        }
        b10.e(fileChannel);
        long f10 = this.f62e + b10.f();
        this.f62e = f10;
        this.f63f = f10;
        this.f58a = new c();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        l.e(allocateDirect, "allocateDirect(4)");
        this.f66i = allocateDirect;
        return this;
    }

    public final void m() {
        c cVar = this.f58a;
        FileOutputStream fileOutputStream = null;
        if (cVar == null) {
            l.v("mdat");
            cVar = null;
        }
        if (cVar.a() != 0) {
            n();
        }
        d dVar = this.f59b;
        if (dVar == null) {
            l.v("currentMp4Movie");
            dVar = null;
        }
        Iterator it = dVar.e().iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            ArrayList h10 = iVar.h();
            int size = h10.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = ((g) h10.get(i10)).b();
            }
            HashMap hashMap = this.f65h;
            l.e(iVar, "track");
            hashMap.put(iVar, jArr);
        }
        d dVar2 = this.f59b;
        if (dVar2 == null) {
            l.v("currentMp4Movie");
            dVar2 = null;
        }
        n d10 = d(dVar2);
        FileChannel fileChannel = this.f61d;
        if (fileChannel == null) {
            l.v("fc");
            fileChannel = null;
        }
        d10.e(fileChannel);
        FileOutputStream fileOutputStream2 = this.f60c;
        if (fileOutputStream2 == null) {
            l.v("fos");
            fileOutputStream2 = null;
        }
        fileOutputStream2.flush();
        FileChannel fileChannel2 = this.f61d;
        if (fileChannel2 == null) {
            l.v("fc");
            fileChannel2 = null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream3 = this.f60c;
        if (fileOutputStream3 == null) {
            l.v("fos");
        } else {
            fileOutputStream = fileOutputStream3;
        }
        fileOutputStream.close();
    }

    public final void q(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
        l.f(byteBuffer, "byteBuf");
        l.f(bufferInfo, "bufferInfo");
        FileOutputStream fileOutputStream = null;
        if (this.f64g) {
            c cVar = this.f58a;
            if (cVar == null) {
                l.v("mdat");
                cVar = null;
            }
            cVar.d(0);
            FileChannel fileChannel = this.f61d;
            if (fileChannel == null) {
                l.v("fc");
                fileChannel = null;
            }
            cVar.e(fileChannel);
            cVar.h(this.f62e);
            long j10 = (long) 16;
            this.f62e += j10;
            this.f63f += j10;
            this.f64g = false;
        }
        c cVar2 = this.f58a;
        if (cVar2 == null) {
            l.v("mdat");
            cVar2 = null;
        }
        c cVar3 = this.f58a;
        if (cVar3 == null) {
            l.v("mdat");
            cVar3 = null;
        }
        cVar2.d(cVar3.a() + ((long) bufferInfo.size));
        long j11 = this.f63f + ((long) bufferInfo.size);
        this.f63f = j11;
        if (j11 >= 32768) {
            n();
            z11 = true;
            this.f64g = true;
            this.f63f = 0;
        } else {
            z11 = false;
        }
        d dVar = this.f59b;
        if (dVar == null) {
            l.v("currentMp4Movie");
            dVar = null;
        }
        dVar.a(i10, this.f62e, bufferInfo);
        int i11 = bufferInfo.offset;
        if (!z10) {
            byteBuffer.position(i11 + 4);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer2 = this.f66i;
            if (byteBuffer2 == null) {
                l.v("sizeBuffer");
                byteBuffer2 = null;
            }
            byteBuffer2.position(0);
            ByteBuffer byteBuffer3 = this.f66i;
            if (byteBuffer3 == null) {
                l.v("sizeBuffer");
                byteBuffer3 = null;
            }
            byteBuffer3.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer4 = this.f66i;
            if (byteBuffer4 == null) {
                l.v("sizeBuffer");
                byteBuffer4 = null;
            }
            byteBuffer4.position(0);
            FileChannel fileChannel2 = this.f61d;
            if (fileChannel2 == null) {
                l.v("fc");
                fileChannel2 = null;
            }
            ByteBuffer byteBuffer5 = this.f66i;
            if (byteBuffer5 == null) {
                l.v("sizeBuffer");
                byteBuffer5 = null;
            }
            fileChannel2.write(byteBuffer5);
        } else {
            byteBuffer.position(i11);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        }
        FileChannel fileChannel3 = this.f61d;
        if (fileChannel3 == null) {
            l.v("fc");
            fileChannel3 = null;
        }
        fileChannel3.write(byteBuffer);
        this.f62e += (long) bufferInfo.size;
        if (z11) {
            FileOutputStream fileOutputStream2 = this.f60c;
            if (fileOutputStream2 == null) {
                l.v("fos");
            } else {
                fileOutputStream = fileOutputStream2;
            }
            fileOutputStream.flush();
        }
    }
}
