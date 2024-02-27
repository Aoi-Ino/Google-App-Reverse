package gl;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import gl.j;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class d0 implements j {

    /* renamed from: b  reason: collision with root package name */
    static volatile Object f23825b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f23826c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f23827d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f23828a;

    static class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    private static class b {
        static Object a(Context context) {
            File f10 = e0.f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(f10, e0.a(f10)) : installed;
        }
    }

    public d0(Context context) {
        this.f23828a = context.getApplicationContext();
    }

    private static void b(Context context) {
        if (f23825b == null) {
            try {
                synchronized (f23826c) {
                    if (f23825b == null) {
                        f23825b = b.a(context);
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public j.a a(Uri uri, int i10) {
        String str;
        b(this.f23828a);
        HttpURLConnection c10 = c(uri);
        c10.setUseCaches(true);
        if (i10 != 0) {
            if (q.a(i10)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb2 = (StringBuilder) f23827d.get();
                sb2.setLength(0);
                if (!q.b(i10)) {
                    sb2.append("no-cache");
                }
                if (!q.c(i10)) {
                    if (sb2.length() > 0) {
                        sb2.append(',');
                    }
                    sb2.append("no-store");
                }
                str = sb2.toString();
            }
            c10.setRequestProperty("Cache-Control", str);
        }
        int responseCode = c10.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) c10.getHeaderFieldInt("Content-Length", -1);
            return new j.a(c10.getInputStream(), e0.w(c10.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        c10.disconnect();
        throw new j.b(responseCode + " " + c10.getResponseMessage(), i10, responseCode);
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
