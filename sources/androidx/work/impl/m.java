package androidx.work.impl;

import cm.l;
import d1.g;
import z0.b;

public final class m extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final m f4250c = new m();

    private m() {
        super(4, 5);
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.w("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
