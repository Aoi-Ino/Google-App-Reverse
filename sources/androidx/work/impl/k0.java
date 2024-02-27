package androidx.work.impl;

import d1.g;
import z0.b;

class k0 extends b {
    public k0() {
        super(17, 18);
    }

    public void a(g gVar) {
        gVar.w("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        gVar.w("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
