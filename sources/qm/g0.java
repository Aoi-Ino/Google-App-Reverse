package qm;

import a.a;
import pl.p;
import pl.q;

public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f30815a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f30816b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f30817c;

    static {
        Object obj;
        Object obj2;
        try {
            p.a aVar = p.f30426e;
            obj = p.a(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            p.a aVar2 = p.f30426e;
            obj = p.a(q.a(th2));
        }
        if (p.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f30816b = (String) obj;
        try {
            obj2 = p.a(g0.class.getCanonicalName());
        } catch (Throwable th3) {
            p.a aVar3 = p.f30426e;
            obj2 = p.a(q.a(th3));
        }
        if (p.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f30817c = (String) obj2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
