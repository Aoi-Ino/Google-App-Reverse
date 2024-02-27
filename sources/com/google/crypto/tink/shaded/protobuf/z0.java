package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class z0 {

    /* renamed from: c  reason: collision with root package name */
    private static final z0 f7297c = new z0();

    /* renamed from: a  reason: collision with root package name */
    private final e1 f7298a = new g0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f7299b = new ConcurrentHashMap();

    private z0() {
    }

    public static z0 a() {
        return f7297c;
    }

    public d1 b(Class cls, d1 d1Var) {
        z.b(cls, "messageType");
        z.b(d1Var, "schema");
        return (d1) this.f7299b.putIfAbsent(cls, d1Var);
    }

    public d1 c(Class cls) {
        z.b(cls, "messageType");
        d1 d1Var = (d1) this.f7299b.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        d1 a10 = this.f7298a.a(cls);
        d1 b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public d1 d(Object obj) {
        return c(obj.getClass());
    }
}
