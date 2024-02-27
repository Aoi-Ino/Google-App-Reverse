package s1;

import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f15843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15844b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15845c;

    public /* synthetic */ j(k kVar, int i10, int i11) {
        this.f15843a = kVar;
        this.f15844b = i10;
        this.f15845c = i11;
    }

    public final Object call() {
        return k.f(this.f15843a, this.f15844b, this.f15845c);
    }
}
