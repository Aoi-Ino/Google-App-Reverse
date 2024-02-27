package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f2431a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2432b;

    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    class C0033a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g.c f2433e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Typeface f2434f;

        C0033a(g.c cVar, Typeface typeface) {
            this.f2433e = cVar;
            this.f2434f = typeface;
        }

        public void run() {
            this.f2433e.b(this.f2434f);
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g.c f2436e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f2437f;

        b(g.c cVar, int i10) {
            this.f2436e = cVar;
            this.f2437f = i10;
        }

        public void run() {
            this.f2436e.a(this.f2437f);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2431a = cVar;
        this.f2432b = handler;
    }

    private void a(int i10) {
        this.f2432b.post(new b(this.f2431a, i10));
    }

    private void c(Typeface typeface) {
        this.f2432b.post(new C0033a(this.f2431a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2460a);
        } else {
            a(eVar.f2461b);
        }
    }
}
