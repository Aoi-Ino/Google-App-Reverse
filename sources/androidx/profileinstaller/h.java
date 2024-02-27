package androidx.profileinstaller;

import androidx.profileinstaller.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i.c f3474e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3475f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3476g;

    public /* synthetic */ h(i.c cVar, int i10, Object obj) {
        this.f3474e = cVar;
        this.f3475f = i10;
        this.f3476g = obj;
    }

    public final void run() {
        this.f3474e.b(this.f3475f, this.f3476g);
    }
}
