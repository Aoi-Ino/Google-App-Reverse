package retrofit2;

import cm.l;
import lm.j;
import pl.p;
import pl.q;

public final class KotlinExtensions$awaitResponse$2$2 implements Callback<T> {
    final /* synthetic */ j $continuation;

    KotlinExtensions$awaitResponse$2$2(j jVar) {
        this.$continuation = jVar;
    }

    public void onFailure(Call<T> call, Throwable th2) {
        l.g(call, "call");
        l.g(th2, "t");
        j jVar = this.$continuation;
        p.a aVar = p.f30426e;
        jVar.resumeWith(p.a(q.a(th2)));
    }

    public void onResponse(Call<T> call, Response<T> response) {
        l.g(call, "call");
        l.g(response, "response");
        this.$continuation.resumeWith(p.a(response));
    }
}
