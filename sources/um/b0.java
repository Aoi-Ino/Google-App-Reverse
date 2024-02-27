package um;

import an.f;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import pl.o;
import um.u;
import vm.b;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private d f31903a;

    /* renamed from: b  reason: collision with root package name */
    private final v f31904b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31905c;

    /* renamed from: d  reason: collision with root package name */
    private final u f31906d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f31907e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f31908f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private v f31909a;

        /* renamed from: b  reason: collision with root package name */
        private String f31910b;

        /* renamed from: c  reason: collision with root package name */
        private u.a f31911c;

        /* renamed from: d  reason: collision with root package name */
        private c0 f31912d;

        /* renamed from: e  reason: collision with root package name */
        private Map f31913e;

        public a() {
            this.f31913e = new LinkedHashMap();
            this.f31910b = "GET";
            this.f31911c = new u.a();
        }

        public a a(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            this.f31911c.a(str, str2);
            return this;
        }

        public b0 b() {
            v vVar = this.f31909a;
            if (vVar != null) {
                return new b0(vVar, this.f31910b, this.f31911c.e(), this.f31912d, b.P(this.f31913e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            this.f31911c.h(str, str2);
            return this;
        }

        public a d(u uVar) {
            l.f(uVar, "headers");
            this.f31911c = uVar.o();
            return this;
        }

        public a e(String str, c0 c0Var) {
            l.f(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ f.d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!f.a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f31910b = str;
                this.f31912d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a f(String str) {
            l.f(str, "name");
            this.f31911c.g(str);
            return this;
        }

        public a g(Class cls, Object obj) {
            l.f(cls, "type");
            if (obj == null) {
                this.f31913e.remove(cls);
            } else {
                if (this.f31913e.isEmpty()) {
                    this.f31913e = new LinkedHashMap();
                }
                Map map = this.f31913e;
                Object cast = cls.cast(obj);
                l.c(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public a h(String str) {
            StringBuilder sb2;
            int i10;
            l.f(str, "url");
            if (p.y(str, "ws:", true)) {
                sb2 = new StringBuilder();
                sb2.append("http:");
                i10 = 3;
            } else {
                if (p.y(str, "wss:", true)) {
                    sb2 = new StringBuilder();
                    sb2.append("https:");
                    i10 = 4;
                }
                return i(v.f32134l.d(str));
            }
            String substring = str.substring(i10);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            str = sb2.toString();
            return i(v.f32134l.d(str));
        }

        public a i(v vVar) {
            l.f(vVar, "url");
            this.f31909a = vVar;
            return this;
        }

        public a(b0 b0Var) {
            l.f(b0Var, "request");
            this.f31913e = new LinkedHashMap();
            this.f31909a = b0Var.j();
            this.f31910b = b0Var.g();
            this.f31912d = b0Var.a();
            this.f31913e = b0Var.c().isEmpty() ? new LinkedHashMap() : i0.r(b0Var.c());
            this.f31911c = b0Var.e().o();
        }
    }

    public b0(v vVar, String str, u uVar, c0 c0Var, Map map) {
        l.f(vVar, "url");
        l.f(str, "method");
        l.f(uVar, "headers");
        l.f(map, "tags");
        this.f31904b = vVar;
        this.f31905c = str;
        this.f31906d = uVar;
        this.f31907e = c0Var;
        this.f31908f = map;
    }

    public final c0 a() {
        return this.f31907e;
    }

    public final d b() {
        d dVar = this.f31903a;
        if (dVar != null) {
            return dVar;
        }
        d b10 = d.f31924p.b(this.f31906d);
        this.f31903a = b10;
        return b10;
    }

    public final Map c() {
        return this.f31908f;
    }

    public final String d(String str) {
        l.f(str, "name");
        return this.f31906d.l(str);
    }

    public final u e() {
        return this.f31906d;
    }

    public final boolean f() {
        return this.f31904b.j();
    }

    public final String g() {
        return this.f31905c;
    }

    public final a h() {
        return new a(this);
    }

    public final Object i(Class cls) {
        l.f(cls, "type");
        return cls.cast(this.f31908f.get(cls));
    }

    public final v j() {
        return this.f31904b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f31905c);
        sb2.append(", url=");
        sb2.append(this.f31904b);
        if (this.f31906d.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object next : this.f31906d) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    q.r();
                }
                o oVar = (o) next;
                String str = (String) oVar.a();
                String str2 = (String) oVar.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f31908f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f31908f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
