package ul;

import bm.p;
import cm.l;
import cm.y;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import pl.q;
import tl.d;
import tl.g;

abstract class c {

    public static final class a extends j {

        /* renamed from: e  reason: collision with root package name */
        private int f31874e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f31875f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f31876g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f31875f = pVar;
            this.f31876g = obj;
            l.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f31874e;
            if (i10 == 0) {
                this.f31874e = 1;
                q.b(obj);
                l.d(this.f31875f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) y.d(this.f31875f, 2)).h(this.f31876g, this);
            } else if (i10 == 1) {
                this.f31874e = 2;
                q.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        private int f31877e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f31878f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f31879g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f31878f = pVar;
            this.f31879g = obj;
            l.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f31877e;
            if (i10 == 0) {
                this.f31877e = 1;
                q.b(obj);
                l.d(this.f31878f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) y.d(this.f31878f, 2)).h(this.f31879g, this);
            } else if (i10 == 1) {
                this.f31877e = 2;
                q.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static d a(p pVar, Object obj, d dVar) {
        l.f(pVar, "<this>");
        l.f(dVar, "completion");
        d a10 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, a10);
        }
        g context = a10.getContext();
        return context == tl.h.f31683e ? new a(a10, pVar, obj) : new b(a10, context, pVar, obj);
    }

    public static d b(d dVar) {
        d intercepted;
        l.f(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
