package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final c f2585a;

    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f2586a;

        a(View view) {
            this.f2586a = view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view = this.f2586a;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.f2586a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new g0(view));
                }
            }
        }
    }

    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f2587b;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsetsController f2588c;

        b(View view) {
            super(view);
            this.f2587b = view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view = this.f2587b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f2588c;
            if (windowInsetsController == null) {
                View view2 = this.f2587b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.a();
            }
        }

        b(WindowInsetsController windowInsetsController) {
            super((View) null);
            this.f2588c = windowInsetsController;
        }
    }

    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    public h0(View view) {
        this.f2585a = Build.VERSION.SDK_INT >= 30 ? new b(view) : new a(view);
    }

    public void a() {
        this.f2585a.a();
    }

    h0(WindowInsetsController windowInsetsController) {
        this.f2585a = new b(windowInsetsController);
    }
}
