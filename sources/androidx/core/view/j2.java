package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import o.g;

public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    private final e f2589a;

    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f2590a;

        /* renamed from: b  reason: collision with root package name */
        private final h0 f2591b;

        a(Window window, h0 h0Var) {
            this.f2590a = window;
            this.f2591b = h0Var;
        }

        private void f(int i10) {
            if (i10 == 1) {
                g(4);
                h(1024);
            } else if (i10 == 2) {
                g(2);
            } else if (i10 == 8) {
                this.f2591b.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    f(i11);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            View decorView = this.f2590a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void e(int i10) {
            this.f2590a.addFlags(i10);
        }

        /* access modifiers changed from: protected */
        public void g(int i10) {
            View decorView = this.f2590a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            this.f2590a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, h0 h0Var) {
            super(window, h0Var);
        }

        public void b(boolean z10) {
            if (z10) {
                h(67108864);
                e(Integer.MIN_VALUE);
                d(8192);
                return;
            }
            g(8192);
        }
    }

    private static class c extends b {
        c(Window window, h0 h0Var) {
            super(window, h0Var);
        }

        public void a(boolean z10) {
            if (z10) {
                h(134217728);
                e(Integer.MIN_VALUE);
                d(16);
                return;
            }
            g(16);
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final j2 f2592a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f2593b;

        /* renamed from: c  reason: collision with root package name */
        final h0 f2594c;

        /* renamed from: d  reason: collision with root package name */
        private final g f2595d;

        /* renamed from: e  reason: collision with root package name */
        protected Window f2596e;

        d(Window window, j2 j2Var, h0 h0Var) {
            this(window.getInsetsController(), j2Var, h0Var);
            this.f2596e = window;
        }

        public void a(boolean z10) {
            if (z10) {
                if (this.f2596e != null) {
                    d(16);
                }
                this.f2593b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f2596e != null) {
                e(16);
            }
            this.f2593b.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z10) {
            if (z10) {
                if (this.f2596e != null) {
                    d(8192);
                }
                this.f2593b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f2596e != null) {
                e(8192);
            }
            this.f2593b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            if ((i10 & 8) != 0) {
                this.f2594c.a();
            }
            this.f2593b.show(i10 & -9);
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            View decorView = this.f2596e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void e(int i10) {
            View decorView = this.f2596e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, j2 j2Var, h0 h0Var) {
            this.f2595d = new g();
            this.f2593b = windowInsetsController;
            this.f2592a = j2Var;
            this.f2594c = h0Var;
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public abstract void b(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void c(int i10);
    }

    public j2(Window window, View view) {
        h0 h0Var = new h0(view);
        int i10 = Build.VERSION.SDK_INT;
        this.f2589a = i10 >= 30 ? new d(window, this, h0Var) : i10 >= 26 ? new c(window, h0Var) : new b(window, h0Var);
    }

    public static j2 d(WindowInsetsController windowInsetsController) {
        return new j2(windowInsetsController);
    }

    public void a(boolean z10) {
        this.f2589a.a(z10);
    }

    public void b(boolean z10) {
        this.f2589a.b(z10);
    }

    public void c(int i10) {
        this.f2589a.c(i10);
    }

    private j2(WindowInsetsController windowInsetsController) {
        this.f2589a = new d(windowInsetsController, this, new h0(windowInsetsController));
    }
}
