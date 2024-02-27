package d3;

import a3.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f9702e = new C0129a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f9703a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9704b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9705c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9706d;

    /* renamed from: d3.a$a  reason: collision with other inner class name */
    public static final class C0129a {

        /* renamed from: a  reason: collision with root package name */
        private f f9707a = null;

        /* renamed from: b  reason: collision with root package name */
        private List f9708b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f9709c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f9710d = "";

        C0129a() {
        }

        public C0129a a(d dVar) {
            this.f9708b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f9707a, Collections.unmodifiableList(this.f9708b), this.f9709c, this.f9710d);
        }

        public C0129a c(String str) {
            this.f9710d = str;
            return this;
        }

        public C0129a d(b bVar) {
            this.f9709c = bVar;
            return this;
        }

        public C0129a e(f fVar) {
            this.f9707a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f9703a = fVar;
        this.f9704b = list;
        this.f9705c = bVar;
        this.f9706d = str;
    }

    public static C0129a e() {
        return new C0129a();
    }

    public String a() {
        return this.f9706d;
    }

    public b b() {
        return this.f9705c;
    }

    public List c() {
        return this.f9704b;
    }

    public f d() {
        return this.f9703a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
