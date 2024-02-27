package androidx.work.impl;

import cm.l;
import d1.g;
import z0.a;

public final class c implements a {
    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
