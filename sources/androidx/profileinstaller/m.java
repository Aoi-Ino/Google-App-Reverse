package androidx.profileinstaller;

import android.view.Choreographer;

public final /* synthetic */ class m implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f3483a;

    public /* synthetic */ m(Runnable runnable) {
        this.f3483a = runnable;
    }

    public final void doFrame(long j10) {
        this.f3483a.run();
    }
}
