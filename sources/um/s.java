package um;

import cm.g;
import cm.l;
import in.e;
import in.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import um.v;

public final class s extends c0 {

    /* renamed from: c  reason: collision with root package name */
    private static final x f32116c = x.f32156g.a("application/x-www-form-urlencoded");

    /* renamed from: d  reason: collision with root package name */
    public static final b f32117d = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f32118a;

    /* renamed from: b  reason: collision with root package name */
    private final List f32119b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f32120a;

        /* renamed from: b  reason: collision with root package name */
        private final List f32121b;

        /* renamed from: c  reason: collision with root package name */
        private final Charset f32122c;

        public a() {
            this((Charset) null, 1, (g) null);
        }

        public final a a(String str, String str2) {
            String str3 = str;
            l.f(str3, "name");
            l.f(str2, "value");
            v.b bVar = v.f32134l;
            this.f32120a.add(v.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f32122c, 91, (Object) null));
            this.f32121b.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f32122c, 91, (Object) null));
            return this;
        }

        public final a b(String str, String str2) {
            String str3 = str;
            l.f(str3, "name");
            l.f(str2, "value");
            v.b bVar = v.f32134l;
            this.f32120a.add(v.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f32122c, 83, (Object) null));
            this.f32121b.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f32122c, 83, (Object) null));
            return this;
        }

        public final s c() {
            return new s(this.f32120a, this.f32121b);
        }

        public a(Charset charset) {
            this.f32122c = charset;
            this.f32120a = new ArrayList();
            this.f32121b = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Charset charset, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public s(List list, List list2) {
        l.f(list, "encodedNames");
        l.f(list2, "encodedValues");
        this.f32118a = vm.b.O(list);
        this.f32119b = vm.b.O(list2);
    }

    private final long a(f fVar, boolean z10) {
        e eVar;
        if (z10) {
            eVar = new e();
        } else {
            l.c(fVar);
            eVar = fVar.d();
        }
        int size = this.f32118a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                eVar.Q(38);
            }
            eVar.r0((String) this.f32118a.get(i10));
            eVar.Q(61);
            eVar.r0((String) this.f32119b.get(i10));
        }
        if (!z10) {
            return 0;
        }
        long H0 = eVar.H0();
        eVar.c();
        return H0;
    }

    public long contentLength() {
        return a((f) null, true);
    }

    public x contentType() {
        return f32116c;
    }

    public void writeTo(f fVar) {
        l.f(fVar, "sink");
        a(fVar, false);
    }
}
