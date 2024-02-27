package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public class i1 extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private final List f7107e = null;

    public i1(o0 o0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public a0 a() {
        return new a0(getMessage());
    }
}
