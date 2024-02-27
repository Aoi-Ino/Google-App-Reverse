package um;

import cm.g;
import cm.l;
import java.util.List;

public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f32102a = new a.C0365a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f32103b = new a((g) null);

    public static final class a {

        /* renamed from: um.n$a$a  reason: collision with other inner class name */
        private static final class C0365a implements n {
            public void a(v vVar, List list) {
                l.f(vVar, "url");
                l.f(list, "cookies");
            }

            public List b(v vVar) {
                l.f(vVar, "url");
                return q.i();
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    void a(v vVar, List list);

    List b(v vVar);
}
