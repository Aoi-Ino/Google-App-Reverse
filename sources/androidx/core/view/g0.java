package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f2584e;

    public /* synthetic */ g0(View view) {
        this.f2584e = view;
    }

    public final void run() {
        ((InputMethodManager) this.f2584e.getContext().getSystemService("input_method")).showSoftInput(this.f2584e, 0);
    }
}
