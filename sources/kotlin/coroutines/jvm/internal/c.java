package kotlin.coroutines.jvm.internal;

import tl.d;
import tl.g;

public final class c implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final c f24777e = new c();

    private c() {
    }

    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
