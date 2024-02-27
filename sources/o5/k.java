package o5;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class k implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k f14444a = new k();

    private /* synthetic */ k() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
