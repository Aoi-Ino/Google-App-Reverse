package lm;

import cm.l;
import java.util.concurrent.CancellationException;

public final class l1 extends CancellationException {

    /* renamed from: e  reason: collision with root package name */
    public final transient k1 f24982e;

    public l1(String str, Throwable th2, k1 k1Var) {
        super(str);
        this.f24982e = k1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof l1) {
                l1 l1Var = (l1) obj;
                if (!l.a(l1Var.getMessage(), getMessage()) || !l.a(l1Var.f24982e, this.f24982e) || !l.a(l1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        l.c(message);
        int hashCode = ((message.hashCode() * 31) + this.f24982e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f24982e;
    }
}
