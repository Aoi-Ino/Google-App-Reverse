package o1;

import bm.l;
import bm.q;
import cm.m;
import java.util.ArrayList;
import java.util.List;
import o1.b;
import om.d;
import om.f;
import p1.c;
import p1.g;
import p1.h;
import pl.x;
import q1.n;
import r1.u;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final List f14346a;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final a f14347e = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(c cVar) {
            cm.l.f(cVar, "it");
            String simpleName = cVar.getClass().getSimpleName();
            cm.l.e(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d[] f14348a;

        static final class a extends m implements bm.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d[] f14349e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d[] dVarArr) {
                super(0);
                this.f14349e = dVarArr;
            }

            /* renamed from: b */
            public final Object[] a() {
                return new b[this.f14349e.length];
            }
        }

        /* renamed from: o1.e$b$b  reason: collision with other inner class name */
        public static final class C0194b extends kotlin.coroutines.jvm.internal.l implements q {

            /* renamed from: f  reason: collision with root package name */
            int f14350f;

            /* renamed from: g  reason: collision with root package name */
            private /* synthetic */ Object f14351g;

            /* renamed from: h  reason: collision with root package name */
            /* synthetic */ Object f14352h;

            public C0194b(tl.d dVar) {
                super(3, dVar);
            }

            /* renamed from: b */
            public final Object g(om.e eVar, Object[] objArr, tl.d dVar) {
                C0194b bVar = new C0194b(dVar);
                bVar.f14351g = eVar;
                bVar.f14352h = objArr;
                return bVar.invokeSuspend(x.f30437a);
            }

            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object c10 = d.c();
                int i10 = this.f14350f;
                if (i10 == 0) {
                    pl.q.b(obj);
                    om.e eVar = (om.e) this.f14351g;
                    b[] bVarArr = (b[]) ((Object[]) this.f14352h);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!cm.l.a(bVar, b.a.f14340a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f14340a;
                    }
                    this.f14350f = 1;
                    if (eVar.c(bVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    pl.q.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.f30437a;
            }
        }

        public b(d[] dVarArr) {
            this.f14348a = dVarArr;
        }

        public Object a(om.e eVar, tl.d dVar) {
            d[] dVarArr = this.f14348a;
            Object a10 = pm.e.a(eVar, dVarArr, new a(dVarArr), new C0194b((tl.d) null), dVar);
            return a10 == d.c() ? a10 : x.f30437a;
        }
    }

    public e(List list) {
        cm.l.f(list, "controllers");
        this.f14346a = list;
    }

    public final boolean a(u uVar) {
        cm.l.f(uVar, "workSpec");
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f14346a) {
            if (((c) next).e(uVar)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            m1.m e10 = m1.m.e();
            String a10 = f.f14353a;
            e10.a(a10, "Work " + uVar.f15477a + " constrained by " + y.d0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f14347e, 31, (Object) null));
        }
        return arrayList.isEmpty();
    }

    public final d b(u uVar) {
        cm.l.f(uVar, "spec");
        ArrayList<c> arrayList = new ArrayList<>();
        for (Object next : this.f14346a) {
            if (((c) next).c(uVar)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.s(arrayList, 10));
        for (c f10 : arrayList) {
            arrayList2.add(f10.f());
        }
        return f.d(new b((d[]) y.t0(arrayList2).toArray(new d[0])));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(n nVar) {
        this(q.l(new p1.a(nVar.a()), new p1.b(nVar.b()), new h(nVar.d()), new p1.d(nVar.c()), new g(nVar.c()), new p1.f(nVar.c()), new p1.e(nVar.c())));
        cm.l.f(nVar, "trackers");
    }
}
