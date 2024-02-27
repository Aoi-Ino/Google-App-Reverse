package n1;

import androidx.work.impl.w;
import java.util.HashMap;
import java.util.Map;
import m1.b;
import m1.m;
import m1.u;

public class a {

    /* renamed from: e  reason: collision with root package name */
    static final String f14086e = m.i("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final w f14087a;

    /* renamed from: b  reason: collision with root package name */
    private final u f14088b;

    /* renamed from: c  reason: collision with root package name */
    private final b f14089c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f14090d = new HashMap();

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    class C0185a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r1.u f14091e;

        C0185a(r1.u uVar) {
            this.f14091e = uVar;
        }

        public void run() {
            m e10 = m.e();
            String str = a.f14086e;
            e10.a(str, "Scheduling work " + this.f14091e.f15477a);
            a.this.f14087a.c(this.f14091e);
        }
    }

    public a(w wVar, u uVar, b bVar) {
        this.f14087a = wVar;
        this.f14088b = uVar;
        this.f14089c = bVar;
    }

    public void a(r1.u uVar, long j10) {
        Runnable runnable = (Runnable) this.f14090d.remove(uVar.f15477a);
        if (runnable != null) {
            this.f14088b.b(runnable);
        }
        C0185a aVar = new C0185a(uVar);
        this.f14090d.put(uVar.f15477a, aVar);
        this.f14088b.a(j10 - this.f14089c.a(), aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f14090d.remove(str);
        if (runnable != null) {
            this.f14088b.b(runnable);
        }
    }
}
