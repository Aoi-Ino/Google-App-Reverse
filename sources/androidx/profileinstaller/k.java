package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f3481e;

    public /* synthetic */ k(Context context) {
        this.f3481e = context;
    }

    public final void run() {
        ProfileInstallerInitializer.l(this.f3481e);
    }
}
