package androidx.work.impl;

import androidx.lifecycle.a0;
import androidx.work.impl.utils.futures.c;
import m1.q;

public class q implements m1.q {

    /* renamed from: c  reason: collision with root package name */
    private final a0 f4271c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private final c f4272d = c.t();

    public q() {
        a(m1.q.f13708b);
    }

    public void a(q.b bVar) {
        this.f4271c.k(bVar);
        if (bVar instanceof q.b.c) {
            this.f4272d.p((q.b.c) bVar);
        } else if (bVar instanceof q.b.a) {
            this.f4272d.q(((q.b.a) bVar).a());
        }
    }
}
