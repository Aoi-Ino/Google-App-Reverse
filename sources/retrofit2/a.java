package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f31046e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Callback f31047f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Response f31048g;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r12, Callback callback, Response response) {
        this.f31046e = r12;
        this.f31047f = callback;
        this.f31048g = response;
    }

    public final void run() {
        this.f31046e.lambda$onResponse$0(this.f31047f, this.f31048g);
    }
}
