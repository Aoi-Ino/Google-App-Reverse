package androidx.work.impl;

import cm.l;
import d1.g;
import z0.b;

public final class n extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final n f4252c = new n();

    private n() {
        super(6, 7);
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
