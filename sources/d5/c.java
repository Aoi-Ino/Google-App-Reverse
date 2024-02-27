package d5;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final d f9753a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9754b;

    /* renamed from: c  reason: collision with root package name */
    private final View f9755c;

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private OnBackInvokedCallback f9756a;

        private b() {
        }

        public void a(b bVar, View view, boolean z10) {
            OnBackInvokedDispatcher a10;
            if (this.f9756a == null && (a10 = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback c10 = c(bVar);
                this.f9756a = c10;
                a10.registerOnBackInvokedCallback(z10 ? 1000000 : 0, c10);
            }
        }

        public void b(View view) {
            OnBackInvokedDispatcher a10 = view.findOnBackInvokedDispatcher();
            if (a10 != null) {
                a10.unregisterOnBackInvokedCallback(this.f9756a);
                this.f9756a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public OnBackInvokedCallback c(b bVar) {
            Objects.requireNonNull(bVar);
            return new e(bVar);
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.f9756a != null;
        }
    }

    /* renamed from: d5.c$c  reason: collision with other inner class name */
    private static class C0130c extends b {

        /* renamed from: d5.c$c$a */
        class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f9757a;

            a(b bVar) {
                this.f9757a = bVar;
            }

            public void onBackCancelled() {
                if (C0130c.this.d()) {
                    this.f9757a.d();
                }
            }

            public void onBackInvoked() {
                this.f9757a.a();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0130c.this.d()) {
                    this.f9757a.c(new androidx.activity.b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0130c.this.d()) {
                    this.f9757a.b(new androidx.activity.b(backEvent));
                }
            }
        }

        private C0130c() {
            super();
        }

        /* access modifiers changed from: package-private */
        public OnBackInvokedCallback c(b bVar) {
            return new a(bVar);
        }
    }

    private interface d {
        void a(b bVar, View view, boolean z10);

        void b(View view);
    }

    public c(View view) {
        this((b) view, view);
    }

    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0130c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean z10) {
        d dVar = this.f9753a;
        if (dVar != null) {
            dVar.a(this.f9754b, this.f9755c, z10);
        }
    }

    public boolean b() {
        return this.f9753a != null;
    }

    public void d() {
        c(true);
    }

    public void e() {
        d dVar = this.f9753a;
        if (dVar != null) {
            dVar.b(this.f9755c);
        }
    }

    public c(b bVar, View view) {
        this.f9753a = a();
        this.f9754b = bVar;
        this.f9755c = view;
    }
}
