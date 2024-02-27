package w0;

import c0.c;
import cm.g;
import cm.l;
import java.util.HashSet;
import java.util.Set;
import t0.p;
import t0.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set f17815a;

    /* renamed from: b  reason: collision with root package name */
    private final c f17816b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17817c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Set f17818a;

        /* renamed from: b  reason: collision with root package name */
        private c f17819b;

        /* renamed from: c  reason: collision with root package name */
        private b f17820c;

        public a(Set set) {
            l.f(set, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.f17818a = hashSet;
            hashSet.addAll(set);
        }

        public final d a() {
            return new d(this.f17818a, this.f17819b, this.f17820c, (g) null);
        }

        public final a b(b bVar) {
            this.f17820c = bVar;
            return this;
        }

        public final a c(c cVar) {
            this.f17819b = cVar;
            return this;
        }
    }

    public interface b {
        boolean b();
    }

    private d(Set set, c cVar, b bVar) {
        this.f17815a = set;
        this.f17816b = cVar;
        this.f17817c = bVar;
    }

    public final b a() {
        return this.f17817c;
    }

    public final c b() {
        return this.f17816b;
    }

    public final boolean c(p pVar) {
        l.f(pVar, "destination");
        for (p pVar2 : p.f16420n.c(pVar)) {
            if (this.f17815a.contains(Integer.valueOf(pVar2.H())) && (!(pVar2 instanceof q) || pVar.H() == q.f16440t.a((q) pVar2).H())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ d(Set set, c cVar, b bVar, g gVar) {
        this(set, cVar, bVar);
    }
}
