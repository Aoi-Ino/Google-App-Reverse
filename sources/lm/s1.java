package lm;

import qm.h0;

public abstract class s1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f25008a = new h0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f25009b = new h0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f25010c = new h0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f25011d = new h0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h0 f25012e = new h0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final t0 f25013f = new t0(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final t0 f25014g = new t0(true);

    public static final Object g(Object obj) {
        return obj instanceof f1 ? new g1((f1) obj) : obj;
    }

    public static final Object h(Object obj) {
        f1 f1Var;
        g1 g1Var = obj instanceof g1 ? (g1) obj : null;
        return (g1Var == null || (f1Var = g1Var.f24960a) == null) ? obj : f1Var;
    }
}
