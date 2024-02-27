package com.google.crypto.tink.shaded.protobuf;

abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private static final q f7227a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final q f7228b = c();

    static q a() {
        q qVar = f7228b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q b() {
        return f7227a;
    }

    private static q c() {
        try {
            return (q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
