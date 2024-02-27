package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.f;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f3015e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f3016f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f.a f3017g;

    public /* synthetic */ g(f fVar, View view, f.a aVar) {
        this.f3015e = fVar;
        this.f3016f = view;
        this.f3017g = aVar;
    }

    public final void run() {
        f.C0050f.b(this.f3015e, this.f3016f, this.f3017g);
    }
}
