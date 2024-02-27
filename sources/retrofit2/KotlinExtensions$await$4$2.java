package retrofit2;

import cm.l;
import lm.j;
import pl.p;
import pl.q;

public final class KotlinExtensions$await$4$2 implements Callback<T> {
    final /* synthetic */ j $continuation;

    KotlinExtensions$await$4$2(j jVar) {
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
        j jVar;
        T a10;
        l.g(call, "call");
        l.g(response, "response");
        if (response.isSuccessful()) {
            jVar = this.$continuation;
            a10 = response.body();
        } else {
            jVar = this.$continuation;
            HttpException httpException = new HttpException(response);
            p.a aVar = p.f30426e;
            a10 = q.a(httpException);
        }
        jVar.resumeWith(p.a(a10));
    }
}
