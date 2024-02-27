package com.google.crypto.tink.shaded.protobuf;

abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final j0 f7128a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final j0 f7129b = new k0();

    static j0 a() {
        return f7128a;
    }

    static j0 b() {
        return f7129b;
    }

    private static j0 c() {
        try {
            return (j0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
