package androidx.work.impl;

import cm.l;
import m1.m;

public abstract class g0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f4242a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f4243b = {"-journal", "-shm", "-wal"};

    static {
        String i10 = m.i("WrkDbPathHelper");
        l.e(i10, "tagWithPrefix(\"WrkDbPathHelper\")");
        f4242a = i10;
    }
}
