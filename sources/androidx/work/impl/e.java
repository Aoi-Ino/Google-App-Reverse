package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.h;
import m1.u;

public class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f4210a = h.a(Looper.getMainLooper());

    public void a(long j10, Runnable runnable) {
        this.f4210a.postDelayed(runnable, j10);
    }

    public void b(Runnable runnable) {
        this.f4210a.removeCallbacks(runnable);
    }
}
