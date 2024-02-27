package qm;

import cm.l;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f30849a = new h0("CONDITION_FALSE");

    public static final Object a() {
        return f30849a;
    }

    public static final s b(Object obj) {
        s sVar;
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null && (sVar = b0Var.f30805a) != null) {
            return sVar;
        }
        l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (s) obj;
    }
}
