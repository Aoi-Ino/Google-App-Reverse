package androidx.work.impl;

import d1.g;
import z0.b;

public final class l extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final l f4249c = new l();

    private l() {
        super(3, 4);
    }

    public void a(g gVar) {
        cm.l.f(gVar, "db");
        gVar.w("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
