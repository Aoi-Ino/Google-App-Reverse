package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import t5.a;
import t5.y;

final class e1 {

    /* renamed from: k  reason: collision with root package name */
    private static final a f6662k = new a("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    private final w1 f6663a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f6664b;

    /* renamed from: c  reason: collision with root package name */
    private final f3 f6665c;

    /* renamed from: d  reason: collision with root package name */
    private final i2 f6666d;

    /* renamed from: e  reason: collision with root package name */
    private final n2 f6667e;

    /* renamed from: f  reason: collision with root package name */
    private final u2 f6668f;

    /* renamed from: g  reason: collision with root package name */
    private final y2 f6669g;

    /* renamed from: h  reason: collision with root package name */
    private final y f6670h;

    /* renamed from: i  reason: collision with root package name */
    private final z1 f6671i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f6672j = new AtomicBoolean(false);

    e1(w1 w1Var, y yVar, y0 y0Var, f3 f3Var, i2 i2Var, n2 n2Var, u2 u2Var, y2 y2Var, z1 z1Var) {
        this.f6663a = w1Var;
        this.f6670h = yVar;
        this.f6664b = y0Var;
        this.f6665c = f3Var;
        this.f6666d = i2Var;
        this.f6667e = n2Var;
        this.f6668f = u2Var;
        this.f6669g = y2Var;
        this.f6671i = z1Var;
    }

    private final void b(int i10, Exception exc) {
        try {
            this.f6663a.k(i10, 5);
            this.f6663a.l(i10);
        } catch (d1 unused) {
            f6662k.b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        y1 y1Var;
        a aVar = f6662k;
        aVar.a("Run extractor loop", new Object[0]);
        if (this.f6672j.compareAndSet(false, true)) {
            while (true) {
                try {
                    y1Var = this.f6671i.a();
                } catch (d1 e10) {
                    f6662k.b("Error while getting next extraction task: %s", e10.getMessage());
                    if (e10.f6642e >= 0) {
                        ((u3) this.f6670h.a()).i(e10.f6642e);
                        b(e10.f6642e, e10);
                    }
                    y1Var = null;
                }
                if (y1Var != null) {
                    try {
                        if (y1Var instanceof x0) {
                            this.f6664b.a((x0) y1Var);
                        } else if (y1Var instanceof e3) {
                            this.f6665c.a((e3) y1Var);
                        } else if (y1Var instanceof h2) {
                            this.f6666d.a((h2) y1Var);
                        } else if (y1Var instanceof k2) {
                            this.f6667e.a((k2) y1Var);
                        } else if (y1Var instanceof t2) {
                            this.f6668f.a((t2) y1Var);
                        } else if (y1Var instanceof w2) {
                            this.f6669g.a((w2) y1Var);
                        } else {
                            f6662k.b("Unknown task type: %s", y1Var.getClass().getName());
                        }
                    } catch (Exception e11) {
                        f6662k.b("Error during extraction task: %s", e11.getMessage());
                        ((u3) this.f6670h.a()).i(y1Var.f6998a);
                        b(y1Var.f6998a, e11);
                    }
                } else {
                    this.f6672j.set(false);
                    return;
                }
            }
        } else {
            aVar.e("runLoop already looping; return", new Object[0]);
        }
    }
}
