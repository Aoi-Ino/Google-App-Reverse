package androidx.work.impl;

import d1.g;
import z0.b;

class l0 extends b {
    public l0() {
        super(18, 19);
    }

    public void a(g gVar) {
        gVar.w("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
