package androidx.work.impl;

import cm.l;
import z0.b;

public final class g extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final g f4241c = new g();

    private g() {
        super(11, 12);
    }

    public void a(d1.g gVar) {
        l.f(gVar, "db");
        gVar.w("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
