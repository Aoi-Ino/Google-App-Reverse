package p4;

public final class b extends IllegalStateException {
    private b(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(i iVar) {
        if (!iVar.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception h10 = iVar.h();
        return new b("Complete with: ".concat(h10 != null ? "failure" : iVar.m() ? "result ".concat(String.valueOf(iVar.i())) : iVar.k() ? "cancellation" : "unknown issue"), h10);
    }
}
