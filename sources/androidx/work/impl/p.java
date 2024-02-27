package androidx.work.impl;

import cm.l;
import d1.g;
import z0.b;

public final class p extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final p f4256c = new p();

    private p() {
        super(8, 9);
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
