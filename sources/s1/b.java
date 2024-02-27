package s1;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p0;
import androidx.work.impl.q;
import androidx.work.impl.w;
import androidx.work.impl.z;
import java.util.LinkedList;
import java.util.UUID;
import m1.q;
import m1.x;
import r1.v;

public abstract class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final q f15823e = new q();

    class a extends b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p0 f15824f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UUID f15825g;

        a(p0 p0Var, UUID uuid) {
            this.f15824f = p0Var;
            this.f15825g = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase n10 = this.f15824f.n();
            n10.e();
            try {
                a(this.f15824f, this.f15825g.toString());
                n10.A();
                n10.i();
                f(this.f15824f);
            } catch (Throwable th2) {
                n10.i();
                throw th2;
            }
        }
    }

    /* renamed from: s1.b$b  reason: collision with other inner class name */
    class C0211b extends b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p0 f15826f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f15827g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f15828h;

        C0211b(p0 p0Var, String str, boolean z10) {
            this.f15826f = p0Var;
            this.f15827g = str;
            this.f15828h = z10;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase n10 = this.f15826f.n();
            n10.e();
            try {
                for (String a10 : n10.H().g(this.f15827g)) {
                    a(this.f15826f, a10);
                }
                n10.A();
                n10.i();
                if (this.f15828h) {
                    f(this.f15826f);
                }
            } catch (Throwable th2) {
                n10.i();
                throw th2;
            }
        }
    }

    public static b b(UUID uuid, p0 p0Var) {
        return new a(p0Var, uuid);
    }

    public static b c(String str, p0 p0Var, boolean z10) {
        return new C0211b(p0Var, str, z10);
    }

    private void e(WorkDatabase workDatabase, String str) {
        v H = workDatabase.H();
        r1.b C = workDatabase.C();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            x k10 = H.k(str2);
            if (!(k10 == x.SUCCEEDED || k10 == x.FAILED)) {
                H.q(str2);
            }
            linkedList.addAll(C.d(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(p0 p0Var, String str) {
        e(p0Var.n(), str);
        p0Var.k().t(str, 1);
        for (w a10 : p0Var.l()) {
            a10.a(str);
        }
    }

    public m1.q d() {
        return this.f15823e;
    }

    /* access modifiers changed from: package-private */
    public void f(p0 p0Var) {
        z.h(p0Var.g(), p0Var.n(), p0Var.l());
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    public void run() {
        try {
            g();
            this.f15823e.a(m1.q.f13707a);
        } catch (Throwable th2) {
            this.f15823e.a(new q.b.a(th2));
        }
    }
}
