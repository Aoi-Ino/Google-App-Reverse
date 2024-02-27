package androidx.appcompat.app;

import androidx.appcompat.app.v;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ v.a f763e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f764f;

    public /* synthetic */ u(v.a aVar, Runnable runnable) {
        this.f763e = aVar;
        this.f764f = runnable;
    }

    public final void run() {
        this.f763e.b(this.f764f);
    }
}
