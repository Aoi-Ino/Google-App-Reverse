package androidx.work.impl;

import android.content.ContentValues;
import cm.l;
import d1.g;
import z0.a;

public final class b implements a {
    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.m0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
