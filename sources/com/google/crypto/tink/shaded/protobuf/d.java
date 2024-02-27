package com.google.crypto.tink.shaded.protobuf;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f7062a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f7063b = (a("org.robolectric.Robolectric") != null);

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f7062a;
    }

    static boolean c() {
        return f7062a != null && !f7063b;
    }
}
