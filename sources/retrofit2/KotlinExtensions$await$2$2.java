package retrofit2;

import cm.l;
import java.lang.reflect.Method;
import lm.j;
import pl.e;
import pl.p;
import pl.q;

public final class KotlinExtensions$await$2$2 implements Callback<T> {
    final /* synthetic */ j $continuation;

    KotlinExtensions$await$2$2(j jVar) {
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
            a10 = response.body();
            if (a10 == null) {
                Object i10 = call.request().i(Invocation.class);
                if (i10 == null) {
                    l.p();
                }
                l.b(i10, "call.request().tag(Invocation::class.java)!!");
                Method method = ((Invocation) i10).method();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Response from ");
                l.b(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                l.b(declaringClass, "method.declaringClass");
                sb2.append(declaringClass.getName());
                sb2.append('.');
                sb2.append(method.getName());
                sb2.append(" was null but response body type was declared as non-null");
                e eVar = new e(sb2.toString());
                jVar = this.$continuation;
                p.a aVar = p.f30426e;
                a10 = q.a(eVar);
            } else {
                jVar = this.$continuation;
            }
        } else {
            jVar = this.$continuation;
            HttpException httpException = new HttpException(response);
            p.a aVar2 = p.f30426e;
            a10 = q.a(httpException);
        }
        jVar.resumeWith(p.a(a10));
    }
}
