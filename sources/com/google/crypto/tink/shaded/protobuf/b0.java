package com.google.crypto.tink.shaded.protobuf;

public enum b0 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(h.class, h.class, h.f7078f),
    ENUM(r13, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: e  reason: collision with root package name */
    private final Class f7051e;

    /* renamed from: f  reason: collision with root package name */
    private final Class f7052f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f7053g;

    private b0(Class cls, Class cls2, Object obj) {
        this.f7051e = cls;
        this.f7052f = cls2;
        this.f7053g = obj;
    }

    public Class a() {
        return this.f7052f;
    }
}
