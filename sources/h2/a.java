package h2;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class a implements b {

    /* renamed from: e  reason: collision with root package name */
    private URLConnection f11939e;

    private void a(k2.a aVar) {
        HashMap q10 = aVar.q();
        if (q10 != null) {
            for (Map.Entry entry : q10.entrySet()) {
                String str = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                if (list != null) {
                    for (String addRequestProperty : list) {
                        this.f11939e.addRequestProperty(str, addRequestProperty);
                    }
                }
            }
        }
    }

    public int B() {
        URLConnection uRLConnection = this.f11939e;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    public String E(String str) {
        return this.f11939e.getHeaderField(str);
    }

    public b clone() {
        return new a();
    }

    public void close() {
    }

    public Map i0() {
        return this.f11939e.getHeaderFields();
    }

    public long j0() {
        try {
            return Long.parseLong(this.f11939e.getHeaderField("Content-Length"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public InputStream l() {
        URLConnection uRLConnection = this.f11939e;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    public InputStream o() {
        return this.f11939e.getInputStream();
    }

    public void s(k2.a aVar) {
        URLConnection openConnection = new URL(aVar.y()).openConnection();
        this.f11939e = openConnection;
        openConnection.setReadTimeout(aVar.t());
        this.f11939e.setConnectTimeout(aVar.k());
        this.f11939e.addRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", new Object[]{Long.valueOf(aVar.o())}));
        this.f11939e.addRequestProperty("User-Agent", aVar.z());
        a(aVar);
        this.f11939e.connect();
    }
}
