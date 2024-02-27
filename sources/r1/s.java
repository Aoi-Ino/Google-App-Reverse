package r1;

import d1.k;
import java.util.Collections;
import java.util.List;
import y0.a0;
import y0.i;
import y0.u;

public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final u f15467a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15468b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f15469c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f15470d;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public /* bridge */ /* synthetic */ void i(k kVar, Object obj) {
            android.support.v4.media.session.b.a(obj);
            k(kVar, (q) null);
        }

        public void k(k kVar, q qVar) {
            throw null;
        }
    }

    class b extends a0 {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends a0 {
        c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(u uVar) {
        this.f15467a = uVar;
        this.f15468b = new a(uVar);
        this.f15469c = new b(uVar);
        this.f15470d = new c(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f15467a.d();
        k b10 = this.f15469c.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15467a.e();
        try {
            b10.C();
            this.f15467a.A();
        } finally {
            this.f15467a.i();
            this.f15469c.h(b10);
        }
    }

    public void b() {
        this.f15467a.d();
        k b10 = this.f15470d.b();
        this.f15467a.e();
        try {
            b10.C();
            this.f15467a.A();
        } finally {
            this.f15467a.i();
            this.f15470d.h(b10);
        }
    }
}
