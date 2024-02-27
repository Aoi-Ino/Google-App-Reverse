package androidx.work.impl;

import cm.l;
import d1.g;
import z0.b;

public final class h extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final h f4244c = new h();

    private h() {
        super(12, 13);
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.w("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
