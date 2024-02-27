package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f3479e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f3480f;

    public /* synthetic */ j(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f3479e = profileInstallerInitializer;
        this.f3480f = context;
    }

    public final void run() {
        this.f3479e.i(this.f3480f);
    }
}
