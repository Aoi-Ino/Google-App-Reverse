package k6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v6.c;
import y6.b;

final class e0 implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Set f12967a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f12968b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f12969c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f12970d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f12971e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f12972f;

    /* renamed from: g  reason: collision with root package name */
    private final d f12973g;

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Set f12974a;

        /* renamed from: b  reason: collision with root package name */
        private final c f12975b;

        public a(Set set, c cVar) {
            this.f12974a = set;
            this.f12975b = cVar;
        }
    }

    e0(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.d()) {
                boolean f10 = qVar.f();
                d0 b10 = qVar.b();
                if (f10) {
                    hashSet4.add(b10);
                } else {
                    hashSet.add(b10);
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else {
                boolean f11 = qVar.f();
                d0 b11 = qVar.b();
                if (f11) {
                    hashSet5.add(b11);
                } else {
                    hashSet2.add(b11);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(d0.b(c.class));
        }
        this.f12967a = Collections.unmodifiableSet(hashSet);
        this.f12968b = Collections.unmodifiableSet(hashSet2);
        this.f12969c = Collections.unmodifiableSet(hashSet3);
        this.f12970d = Collections.unmodifiableSet(hashSet4);
        this.f12971e = Collections.unmodifiableSet(hashSet5);
        this.f12972f = cVar.k();
        this.f12973g = dVar;
    }

    public Object a(Class cls) {
        if (this.f12967a.contains(d0.b(cls))) {
            Object a10 = this.f12973g.a(cls);
            return !cls.equals(c.class) ? a10 : new a(this.f12972f, (c) a10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public Object b(d0 d0Var) {
        if (this.f12967a.contains(d0Var)) {
            return this.f12973g.b(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{d0Var}));
    }

    public b d(Class cls) {
        return e(d0.b(cls));
    }

    public b e(d0 d0Var) {
        if (this.f12968b.contains(d0Var)) {
            return this.f12973g.e(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{d0Var}));
    }

    public b f(d0 d0Var) {
        if (this.f12971e.contains(d0Var)) {
            return this.f12973g.f(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{d0Var}));
    }

    public Set g(d0 d0Var) {
        if (this.f12970d.contains(d0Var)) {
            return this.f12973g.g(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{d0Var}));
    }
}
