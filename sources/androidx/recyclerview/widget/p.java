package androidx.recyclerview.widget;

import androidx.core.util.e;
import androidx.recyclerview.widget.RecyclerView;
import o.d;
import o.g;

class p {

    /* renamed from: a  reason: collision with root package name */
    final g f3916a = new g();

    /* renamed from: b  reason: collision with root package name */
    final d f3917b = new d();

    static class a {

        /* renamed from: d  reason: collision with root package name */
        static androidx.core.util.d f3918d = new e(20);

        /* renamed from: a  reason: collision with root package name */
        int f3919a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.c f3920b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.c f3921c;

        private a() {
        }

        static void a() {
            do {
            } while (f3918d.b() != null);
        }

        static a b() {
            a aVar = (a) f3918d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f3919a = 0;
            aVar.f3920b = null;
            aVar.f3921c = null;
            f3918d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    p() {
    }

    private RecyclerView.m.c l(RecyclerView.d0 d0Var, int i10) {
        a aVar;
        RecyclerView.m.c cVar;
        int f10 = this.f3916a.f(d0Var);
        if (f10 >= 0 && (aVar = (a) this.f3916a.m(f10)) != null) {
            int i11 = aVar.f3919a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f3919a = i12;
                if (i10 == 4) {
                    cVar = aVar.f3920b;
                } else if (i10 == 8) {
                    cVar = aVar.f3921c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3916a.k(f10);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = (a) this.f3916a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3916a.put(d0Var, aVar);
        }
        aVar.f3919a |= 2;
        aVar.f3920b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3916a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3916a.put(d0Var, aVar);
        }
        aVar.f3919a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.d0 d0Var) {
        this.f3917b.h(j10, d0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = (a) this.f3916a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3916a.put(d0Var, aVar);
        }
        aVar.f3921c = cVar;
        aVar.f3919a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = (a) this.f3916a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3916a.put(d0Var, aVar);
        }
        aVar.f3920b = cVar;
        aVar.f3919a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f3916a.clear();
        this.f3917b.a();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.d0 g(long j10) {
        return (RecyclerView.d0) this.f3917b.d(j10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3916a.get(d0Var);
        return (aVar == null || (aVar.f3919a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3916a.get(d0Var);
        return (aVar == null || (aVar.f3919a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.m.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.m.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        RecyclerView.m.c cVar;
        RecyclerView.m.c cVar2;
        for (int size = this.f3916a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.f3916a.i(size);
            a aVar = (a) this.f3916a.k(size);
            int i10 = aVar.f3919a;
            if ((i10 & 3) != 3) {
                if ((i10 & 1) != 0) {
                    cVar = aVar.f3920b;
                    if (cVar != null) {
                        cVar2 = aVar.f3921c;
                    }
                } else {
                    if ((i10 & 14) != 14) {
                        if ((i10 & 12) == 12) {
                            bVar.d(d0Var, aVar.f3920b, aVar.f3921c);
                        } else if ((i10 & 4) != 0) {
                            cVar = aVar.f3920b;
                            cVar2 = null;
                        } else if ((i10 & 8) == 0) {
                        }
                        a.c(aVar);
                    }
                    bVar.b(d0Var, aVar.f3920b, aVar.f3921c);
                    a.c(aVar);
                }
                bVar.c(d0Var, cVar, cVar2);
                a.c(aVar);
            }
            bVar.a(d0Var);
            a.c(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3916a.get(d0Var);
        if (aVar != null) {
            aVar.f3919a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.d0 d0Var) {
        int k10 = this.f3917b.k() - 1;
        while (true) {
            if (k10 < 0) {
                break;
            } else if (d0Var == this.f3917b.m(k10)) {
                this.f3917b.j(k10);
                break;
            } else {
                k10--;
            }
        }
        a aVar = (a) this.f3916a.remove(d0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
