package androidx.work.impl;

import cm.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r1.m;
import r1.u;
import r1.x;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4123a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map f4124b = new LinkedHashMap();

    public final boolean a(m mVar) {
        boolean containsKey;
        l.f(mVar, "id");
        synchronized (this.f4123a) {
            containsKey = this.f4124b.containsKey(mVar);
        }
        return containsKey;
    }

    public final a0 b(m mVar) {
        a0 a0Var;
        l.f(mVar, "id");
        synchronized (this.f4123a) {
            a0Var = (a0) this.f4124b.remove(mVar);
        }
        return a0Var;
    }

    public final List c(String str) {
        List t02;
        l.f(str, "workSpecId");
        synchronized (this.f4123a) {
            try {
                Map map = this.f4124b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (l.a(((m) entry.getKey()).b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (m remove : linkedHashMap.keySet()) {
                    this.f4124b.remove(remove);
                }
                t02 = y.t0(linkedHashMap.values());
            } finally {
            }
        }
        return t02;
    }

    public final a0 d(m mVar) {
        a0 a0Var;
        l.f(mVar, "id");
        synchronized (this.f4123a) {
            try {
                Map map = this.f4124b;
                Object obj = map.get(mVar);
                if (obj == null) {
                    obj = new a0(mVar);
                    map.put(mVar, obj);
                }
                a0Var = (a0) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    public final a0 e(u uVar) {
        l.f(uVar, "spec");
        return d(x.a(uVar));
    }
}
