package pm;

import bm.p;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.h0;
import nm.r;
import nm.t;
import om.e;
import om.f;
import pl.q;
import pl.x;
import tl.g;
import tl.h;

public abstract class d implements om.d {

    /* renamed from: a  reason: collision with root package name */
    public final g f30444a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30445b;

    /* renamed from: c  reason: collision with root package name */
    public final nm.a f30446c;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f30447f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f30448g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f30449h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f30450i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, d dVar, tl.d dVar2) {
            super(2, dVar2);
            this.f30449h = eVar;
            this.f30450i = dVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            a aVar = new a(this.f30449h, this.f30450i, dVar);
            aVar.f30448g = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f30447f;
            if (i10 == 0) {
                q.b(obj);
                e eVar = this.f30449h;
                t h10 = this.f30450i.h((d0) this.f30448g);
                this.f30447f = 1;
                if (f.e(eVar, h10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f30451f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f30452g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f30453h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, tl.d dVar2) {
            super(2, dVar2);
            this.f30453h = dVar;
        }

        /* renamed from: b */
        public final Object h(r rVar, tl.d dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            b bVar = new b(this.f30453h, dVar);
            bVar.f30452g = obj;
            return bVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f30451f;
            if (i10 == 0) {
                q.b(obj);
                d dVar = this.f30453h;
                this.f30451f = 1;
                if (dVar.e((r) this.f30452g, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    public d(g gVar, int i10, nm.a aVar) {
        this.f30444a = gVar;
        this.f30445b = i10;
        this.f30446c = aVar;
    }

    static /* synthetic */ Object d(d dVar, e eVar, tl.d dVar2) {
        Object c10 = e0.c(new a(eVar, dVar, (tl.d) null), dVar2);
        return c10 == d.c() ? c10 : x.f30437a;
    }

    public Object a(e eVar, tl.d dVar) {
        return d(this, eVar, dVar);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object e(r rVar, tl.d dVar);

    public final p f() {
        return new b(this, (tl.d) null);
    }

    public final int g() {
        int i10 = this.f30445b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public t h(d0 d0Var) {
        return nm.p.c(d0Var, this.f30444a, g(), this.f30446c, f0.ATOMIC, (bm.l) null, f(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c10 = c();
        if (c10 != null) {
            arrayList.add(c10);
        }
        if (this.f30444a != h.f31683e) {
            arrayList.add("context=" + this.f30444a);
        }
        if (this.f30445b != -3) {
            arrayList.add("capacity=" + this.f30445b);
        }
        if (this.f30446c != nm.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f30446c);
        }
        return h0.a(this) + '[' + y.d0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null) + ']';
    }
}
