package com.google.crypto.tink.shaded.protobuf;

abstract class o {

    /* renamed from: a  reason: collision with root package name */
    static final Class f7161a = c();

    public static p a() {
        p b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : p.f7165d;
    }

    private static final p b(String str) {
        Class cls = f7161a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
