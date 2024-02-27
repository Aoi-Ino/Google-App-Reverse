package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: e  reason: collision with root package name */
    private WeakReference f427e;

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i10, Bundle bundle) {
        b.a(this.f427e.get());
    }
}
