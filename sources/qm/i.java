package qm;

import tl.g;

public final class i extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private final transient g f30819e;

    public i(g gVar) {
        this.f30819e = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f30819e.toString();
    }
}
