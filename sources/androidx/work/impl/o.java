package androidx.work.impl;

import cm.l;
import d1.g;
import z0.b;

public final class o extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final o f4253c = new o();

    private o() {
        super(7, 8);
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
