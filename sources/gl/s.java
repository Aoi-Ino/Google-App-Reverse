package gl;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import gl.j;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class s implements j {

    /* renamed from: a  reason: collision with root package name */
    private final OkHttpClient f23892a;

    public s(Context context) {
        this(e0.f(context));
    }

    private static OkHttpClient b() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000, timeUnit);
        okHttpClient.setReadTimeout(20000, timeUnit);
        okHttpClient.setWriteTimeout(20000, timeUnit);
        return okHttpClient;
    }

    public j.a a(Uri uri, int i10) {
        CacheControl cacheControl;
        if (i10 == 0) {
            cacheControl = null;
        } else if (q.a(i10)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!q.b(i10)) {
                builder.noCache();
            }
            if (!q.c(i10)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f23892a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z10 = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new j.a(body.byteStream(), z10, body.contentLength());
        }
        execute.body().close();
        throw new j.b(code + " " + execute.message(), i10, code);
    }

    public s(OkHttpClient okHttpClient) {
        this.f23892a = okHttpClient;
    }

    public s(File file) {
        this(file, e0.a(file));
    }

    public s(File file, long j10) {
        this(b());
        try {
            this.f23892a.setCache(new Cache(file, j10));
        } catch (IOException unused) {
        }
    }
}
