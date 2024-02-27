package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.h;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h.e f2345e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Typeface f2346f;

    public /* synthetic */ i(h.e eVar, Typeface typeface) {
        this.f2345e = eVar;
        this.f2346f = typeface;
    }

    public final void run() {
        this.f2345e.g(this.f2346f);
    }
}
