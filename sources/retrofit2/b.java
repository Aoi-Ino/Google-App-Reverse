package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f31049e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Callback f31050f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Throwable f31051g;

    public /* synthetic */ b(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r12, Callback callback, Throwable th2) {
        this.f31049e = r12;
        this.f31050f = callback;
        this.f31051g = th2;
    }

    public final void run() {
        this.f31049e.lambda$onFailure$1(this.f31050f, this.f31051g);
    }
}
