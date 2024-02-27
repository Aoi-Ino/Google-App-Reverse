package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import retrofit2.OkHttpCall;
import um.a0;
import um.b0;
import um.d0;
import um.e0;
import um.u;

public final class Response<T> {
    @Nullable
    private final T body;
    @Nullable
    private final e0 errorBody;
    private final d0 rawResponse;

    private Response(d0 d0Var, @Nullable T t10, @Nullable e0 e0Var) {
        this.rawResponse = d0Var;
        this.body = t10;
        this.errorBody = e0Var;
    }

    public static <T> Response<T> error(int i10, e0 e0Var) {
        Objects.requireNonNull(e0Var, "body == null");
        if (i10 >= 400) {
            return error(e0Var, new d0.a().b(new OkHttpCall.NoContentResponseBody(e0Var.contentType(), e0Var.contentLength())).g(i10).m("Response.error()").p(a0.HTTP_1_1).r(new b0.a().h("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> Response<T> success(int i10, @Nullable T t10) {
        if (i10 >= 200 && i10 < 300) {
            return success(t10, new d0.a().g(i10).m("Response.success()").p(a0.HTTP_1_1).r(new b0.a().h("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i10);
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.h();
    }

    @Nullable
    public e0 errorBody() {
        return this.errorBody;
    }

    public u headers() {
        return this.rawResponse.y();
    }

    public boolean isSuccessful() {
        return this.rawResponse.B();
    }

    public String message() {
        return this.rawResponse.E();
    }

    public d0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> error(e0 e0Var, d0 d0Var) {
        Objects.requireNonNull(e0Var, "body == null");
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (!d0Var.B()) {
            return new Response<>(d0Var, (Object) null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@Nullable T t10) {
        return success(t10, new d0.a().g(200).m("OK").p(a0.HTTP_1_1).r(new b0.a().h("http://localhost/").b()).c());
    }

    public static <T> Response<T> success(@Nullable T t10, u uVar) {
        Objects.requireNonNull(uVar, "headers == null");
        return success(t10, new d0.a().g(200).m("OK").p(a0.HTTP_1_1).k(uVar).r(new b0.a().h("http://localhost/").b()).c());
    }

    public static <T> Response<T> success(@Nullable T t10, d0 d0Var) {
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (d0Var.B()) {
            return new Response<>(d0Var, t10, (e0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
