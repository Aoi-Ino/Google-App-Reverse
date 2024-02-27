package com.google.android.datatransport.cct;

import a3.h;
import a3.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b3.f;
import b3.g;
import b3.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import y2.c;
import z2.j;
import z2.k;
import z2.l;
import z2.m;
import z2.n;
import z2.o;
import z2.p;

final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final r6.a f5201a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f5202b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5203c;

    /* renamed from: d  reason: collision with root package name */
    final URL f5204d;

    /* renamed from: e  reason: collision with root package name */
    private final k3.a f5205e;

    /* renamed from: f  reason: collision with root package name */
    private final k3.a f5206f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5207g;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f5208a;

        /* renamed from: b  reason: collision with root package name */
        final j f5209b;

        /* renamed from: c  reason: collision with root package name */
        final String f5210c;

        a(URL url, j jVar, String str) {
            this.f5208a = url;
            this.f5209b = jVar;
            this.f5210c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f5209b, this.f5210c);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f5211a;

        /* renamed from: b  reason: collision with root package name */
        final URL f5212b;

        /* renamed from: c  reason: collision with root package name */
        final long f5213c;

        b(int i10, URL url, long j10) {
            this.f5211a = i10;
            this.f5212b = url;
            this.f5213c = j10;
        }
    }

    d(Context context, k3.a aVar, k3.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    /* access modifiers changed from: private */
    public b e(a aVar) {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        InputStream m10;
        e3.a.f("CctTransportBackend", "Making request to: %s", aVar.f5208a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5208a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5207g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5210c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            this.f5201a.a(aVar.f5209b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            e3.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
            e3.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
            e3.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new b(responseCode, (URL) null, 0);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                b bVar = new b(responseCode, (URL) null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                if (m10 != null) {
                    m10.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
            throw th;
            throw th;
            throw th;
        } catch (ConnectException | UnknownHostException e10) {
            e3.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, (URL) null, 0);
        } catch (IOException | r6.b e11) {
            e3.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(400, (URL) null, 0);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                bVar = o.b.COMBINED;
            } else if (o.b.a(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return bVar.b();
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.b() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e3.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j10 = iVar.j();
            if (!hashMap.containsKey(j10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j10, arrayList);
            } else {
                ((List) hashMap.get(j10)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = z2.m.a().f(p.DEFAULT).g(this.f5206f.a()).h(this.f5205e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(z2.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                c b11 = e10.b();
                if (b11.equals(c.b("proto"))) {
                    aVar = l.j(e10.a());
                } else if (b11.equals(c.b("json"))) {
                    aVar = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    e3.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                aVar.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVar.b(iVar3.d());
                }
                arrayList3.add(aVar.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f5212b;
        if (url == null) {
            return null;
        }
        e3.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f5212b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    public g a(f fVar) {
        j i10 = i(fVar);
        URL url = this.f5204d;
        String str = null;
        if (fVar.c() != null) {
            try {
                a c10 = a.c(fVar.c());
                if (c10.d() != null) {
                    str = c10.d();
                }
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) f3.b.a(5, new a(url, i10, str), new b(this), new c());
            int i11 = bVar.f5211a;
            if (i11 == 200) {
                return g.e(bVar.f5213c);
            }
            if (i11 < 500) {
                if (i11 != 404) {
                    return i11 == 400 ? g.d() : g.a();
                }
            }
            return g.f();
        } catch (IOException e10) {
            e3.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f5202b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f5203c).getSimOperator()).c("application_build", Integer.toString(h(this.f5203c))).d();
    }

    d(Context context, k3.a aVar, k3.a aVar2, int i10) {
        this.f5201a = j.b();
        this.f5203c = context;
        this.f5202b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5204d = n(a.f5192c);
        this.f5205e = aVar2;
        this.f5206f = aVar;
        this.f5207g = i10;
    }
}
