package o5;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class j implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ j f14443a = new j();

    private /* synthetic */ j() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
