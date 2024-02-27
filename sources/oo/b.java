package oo;

import ap.d;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import oo.j;
import qn.u;

public class b implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final Map f30225e = new TreeMap();

    /* renamed from: f  reason: collision with root package name */
    private transient long f30226f;

    b(long j10) {
        this.f30226f = j10;
    }

    /* access modifiers changed from: package-private */
    public a a(int i10) {
        return (a) this.f30225e.get(d.a(i10));
    }

    public long b() {
        return this.f30226f;
    }

    /* access modifiers changed from: package-private */
    public void c(int i10, a aVar) {
        this.f30225e.put(d.a(i10), aVar);
    }

    /* access modifiers changed from: package-private */
    public a d(int i10, byte[] bArr, byte[] bArr2, j jVar) {
        return (a) this.f30225e.put(d.a(i10), ((a) this.f30225e.get(d.a(i10))).d(bArr, bArr2, jVar));
    }

    /* access modifiers changed from: package-private */
    public void e(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        long j11 = j10;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        x h10 = rVar.h();
        int b10 = h10.b();
        long j12 = a0.j(j11, b10);
        int i10 = a0.i(j11, b10);
        j jVar = (j) ((j.b) new j.b().h(j12)).p(i10).l();
        int i11 = (1 << b10) - 1;
        if (i10 < i11) {
            if (a(0) == null || i10 == 0) {
                c(0, new a(h10, bArr3, bArr4, jVar));
            }
            d(0, bArr3, bArr4, jVar);
        }
        for (int i12 = 1; i12 < rVar.b(); i12++) {
            int i13 = a0.i(j12, b10);
            j12 = a0.j(j12, b10);
            j jVar2 = (j) ((j.b) ((j.b) new j.b().g(i12)).h(j12)).p(i13).l();
            if (this.f30225e.get(Integer.valueOf(i12)) == null || a0.n(j11, b10, i12)) {
                this.f30225e.put(Integer.valueOf(i12), new a(h10, bArr3, bArr4, jVar2));
            }
            if (i13 < i11 && a0.m(j11, b10, i12)) {
                d(i12, bArr3, bArr4, jVar2);
            }
        }
    }

    public b f(u uVar) {
        b bVar = new b(this.f30226f);
        for (Integer num : this.f30225e.keySet()) {
            bVar.f30225e.put(num, ((a) this.f30225e.get(num)).h(uVar));
        }
        return bVar;
    }

    b(b bVar, long j10) {
        for (Integer num : bVar.f30225e.keySet()) {
            this.f30225e.put(num, new a((a) bVar.f30225e.get(num)));
        }
        this.f30226f = j10;
    }

    b(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        this.f30226f = (1 << rVar.a()) - 1;
        for (long j11 = 0; j11 < j10; j11++) {
            e(rVar, j11, bArr, bArr2);
        }
    }
}
