package com.google.firebase.installations;

import h6.j;

public class d extends j {

    /* renamed from: e  reason: collision with root package name */
    private final a f7382e;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f7382e = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f7382e = aVar;
    }
}
