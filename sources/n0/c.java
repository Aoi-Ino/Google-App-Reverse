package n0;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.a0;
import androidx.fragment.app.f;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a0 f14069e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f14070f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Rect f14071g;

    public /* synthetic */ c(a0 a0Var, View view, Rect rect) {
        this.f14069e = a0Var;
        this.f14070f = view;
        this.f14071g = rect;
    }

    public final void run() {
        f.M(this.f14069e, this.f14070f, this.f14071g);
    }
}
