package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import p3.a;
import p4.d;
import p4.i;
import r3.b;
import s3.c;
import s3.f;
import s3.m;
import s3.p;
import s3.q;

final class v implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f5353a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5354b;

    /* renamed from: c  reason: collision with root package name */
    private final b f5355c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5356d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5357e;

    v(b bVar, int i10, b bVar2, long j10, long j11, String str, String str2) {
        this.f5353a = bVar;
        this.f5354b = i10;
        this.f5355c = bVar2;
        this.f5356d = j10;
        this.f5357e = j11;
    }

    static v b(b bVar, int i10, b bVar2) {
        boolean z10;
        if (!bVar.f()) {
            return null;
        }
        q a10 = p.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.e()) {
            return null;
        } else {
            z10 = a10.f();
            q w10 = bVar.w(bVar2);
            if (w10 != null) {
                if (!(w10.u() instanceof c)) {
                    return null;
                }
                c cVar = (c) w10.u();
                if (cVar.I() && !cVar.g()) {
                    f c10 = c(w10, cVar, i10);
                    if (c10 == null) {
                        return null;
                    }
                    w10.F();
                    z10 = c10.g();
                }
            }
        }
        return new v(bVar, i10, bVar2, z10 ? System.currentTimeMillis() : 0, z10 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static f c(q qVar, c cVar, int i10) {
        int[] d10;
        int[] e10;
        f G = cVar.G();
        if (G == null || !G.f() || ((d10 = G.d()) != null ? !w3.b.a(d10, i10) : !((e10 = G.e()) == null || !w3.b.a(e10, i10))) || qVar.s() >= G.c()) {
            return null;
        }
        return G;
    }

    public final void a(i iVar) {
        q w10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        if (this.f5353a.f()) {
            q a10 = p.b().a();
            if ((a10 == null || a10.e()) && (w10 = this.f5353a.w(this.f5355c)) != null && (w10.u() instanceof c)) {
                c cVar = (c) w10.u();
                boolean z10 = true;
                int i15 = 0;
                boolean z11 = this.f5356d > 0;
                int y10 = cVar.y();
                if (a10 != null) {
                    boolean f10 = z11 & a10.f();
                    int c10 = a10.c();
                    int d10 = a10.d();
                    i12 = a10.g();
                    if (cVar.I() && !cVar.g()) {
                        f c11 = c(w10, cVar, this.f5354b);
                        if (c11 != null) {
                            if (!c11.g() || this.f5356d <= 0) {
                                z10 = false;
                            }
                            d10 = c11.c();
                            f10 = z10;
                        } else {
                            return;
                        }
                    }
                    i11 = c10;
                    i10 = d10;
                } else {
                    i12 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                b bVar = this.f5353a;
                if (iVar.m()) {
                    i13 = 0;
                } else {
                    if (iVar.k()) {
                        i15 = 100;
                    } else {
                        Exception h10 = iVar.h();
                        if (h10 instanceof q3.b) {
                            Status a11 = ((q3.b) h10).a();
                            int d11 = a11.d();
                            a c12 = a11.c();
                            i13 = c12 == null ? -1 : c12.c();
                            i15 = d11;
                        } else {
                            i15 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z11) {
                    long j12 = this.f5356d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i14 = (int) (SystemClock.elapsedRealtime() - this.f5357e);
                    j11 = j12;
                    j10 = currentTimeMillis;
                } else {
                    j11 = 0;
                    j10 = 0;
                    i14 = -1;
                }
                bVar.G(new m(this.f5354b, i15, i13, j11, j10, (String) null, (String) null, y10, i14), i12, (long) i11, i10);
            }
        }
    }
}
