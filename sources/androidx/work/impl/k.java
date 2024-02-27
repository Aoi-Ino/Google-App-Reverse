package androidx.work.impl;

import cm.l;
import d1.g;
import z0.b;

public final class k extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final k f4248c = new k();

    private k() {
        super(1, 2);
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.w("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.w("DROP TABLE IF EXISTS alarmInfo");
        gVar.w("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
