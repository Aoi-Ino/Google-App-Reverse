package com.google.crypto.tink.shaded.protobuf;

class w implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final w f7276a = new w();

    private w() {
    }

    public static w c() {
        return f7276a;
    }

    public m0 a(Class cls) {
        Class<x> cls2 = x.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (m0) x.u(cls.asSubclass(cls2)).m();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    public boolean b(Class cls) {
        return x.class.isAssignableFrom(cls);
    }
}
