package t0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.s;
import cm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ql.h;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16406a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f16407b;

    /* renamed from: c  reason: collision with root package name */
    private q f16408c;

    /* renamed from: d  reason: collision with root package name */
    private final List f16409d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f16410e;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f16411a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f16412b;

        public a(int i10, Bundle bundle) {
            this.f16411a = i10;
            this.f16412b = bundle;
        }

        public final Bundle a() {
            return this.f16412b;
        }

        public final int b() {
            return this.f16411a;
        }
    }

    public n(Context context) {
        Intent intent;
        l.f(context, "context");
        this.f16406a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f16407b = intent;
        this.f16409d = new ArrayList();
    }

    private final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        p pVar = null;
        for (a aVar : this.f16409d) {
            int b10 = aVar.b();
            Bundle a10 = aVar.a();
            p d10 = d(b10);
            if (d10 != null) {
                for (int valueOf : d10.v(pVar)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a10);
                }
                pVar = d10;
            } else {
                throw new IllegalArgumentException("Navigation destination " + p.f16420n.b(this.f16406a, b10) + " cannot be found in the navigation graph " + this.f16408c);
            }
        }
        this.f16407b.putExtra("android-support-nav:controller:deepLinkIds", y.s0(arrayList));
        this.f16407b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final p d(int i10) {
        h hVar = new h();
        q qVar = this.f16408c;
        l.c(qVar);
        hVar.add(qVar);
        while (!hVar.isEmpty()) {
            p pVar = (p) hVar.removeFirst();
            if (pVar.H() == i10) {
                return pVar;
            }
            if (pVar instanceof q) {
                Iterator it = ((q) pVar).iterator();
                while (it.hasNext()) {
                    hVar.add((p) it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ n g(n nVar, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return nVar.f(i10, bundle);
    }

    private final void h() {
        for (a b10 : this.f16409d) {
            int b11 = b10.b();
            if (d(b11) == null) {
                String b12 = p.f16420n.b(this.f16406a, b11);
                throw new IllegalArgumentException("Navigation destination " + b12 + " cannot be found in the navigation graph " + this.f16408c);
            }
        }
    }

    public final n a(int i10, Bundle bundle) {
        this.f16409d.add(new a(i10, bundle));
        if (this.f16408c != null) {
            h();
        }
        return this;
    }

    public final s b() {
        if (this.f16408c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!this.f16409d.isEmpty()) {
            c();
            s n10 = s.s(this.f16406a).n(new Intent(this.f16407b));
            l.e(n10, "create(context)\n        …rentStack(Intent(intent))");
            int y10 = n10.y();
            for (int i10 = 0; i10 < y10; i10++) {
                Intent v10 = n10.v(i10);
                if (v10 != null) {
                    v10.putExtra("android-support-nav:controller:deepLinkIntent", this.f16407b);
                }
            }
            return n10;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    public final n e(Bundle bundle) {
        this.f16410e = bundle;
        this.f16407b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final n f(int i10, Bundle bundle) {
        this.f16409d.clear();
        this.f16409d.add(new a(i10, bundle));
        if (this.f16408c != null) {
            h();
        }
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(k kVar) {
        this(kVar.B());
        l.f(kVar, "navController");
        this.f16408c = kVar.F();
    }
}
