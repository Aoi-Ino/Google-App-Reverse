package com.google.crypto.tink.shaded.protobuf;

abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    private static final t0 f7274a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final t0 f7275b = new u0();

    static t0 a() {
        return f7274a;
    }

    static t0 b() {
        return f7275b;
    }

    private static t0 c() {
        try {
            return (t0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
