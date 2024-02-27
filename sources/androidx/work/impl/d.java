package androidx.work.impl;

import cm.l;
import d1.g;
import m1.b;
import y0.u;

public final class d extends u.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f4207a;

    public d(b bVar) {
        l.f(bVar, "clock");
        this.f4207a = bVar;
    }

    private final long d() {
        return this.f4207a.a() - e0.f4211a;
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public void c(g gVar) {
        l.f(gVar, "db");
        super.c(gVar);
        gVar.j();
        try {
            gVar.w(e());
            gVar.g0();
        } finally {
            gVar.i();
        }
    }
}
