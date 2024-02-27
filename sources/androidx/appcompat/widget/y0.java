package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class y0 implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1588a;

    public /* synthetic */ y0(Runnable runnable) {
        this.f1588a = runnable;
    }

    public final void onBackInvoked() {
        this.f1588a.run();
    }
}
