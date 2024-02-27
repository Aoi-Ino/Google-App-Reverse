package qk;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f30638a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f30639b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f30640c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30641d;

    /* renamed from: e  reason: collision with root package name */
    private int f30642e;

    /* renamed from: f  reason: collision with root package name */
    private int f30643f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f30644g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f30645h;

    private a(int i10) {
        this.f30639b = null;
        this.f30638a = null;
        this.f30640c = Integer.valueOf(i10);
        this.f30641d = true;
    }

    public static a a(String str) {
        if (str != null) {
            return m("file:///android_asset/" + str);
        }
        throw new NullPointerException("Asset name must not be null");
    }

    public static a j(int i10) {
        return new a(i10);
    }

    public static a m(String str) {
        if (str != null) {
            if (!str.contains("://")) {
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                str = "file:///" + str;
            }
            return new a(Uri.parse(str));
        }
        throw new NullPointerException("Uri must not be null");
    }

    /* access modifiers changed from: protected */
    public final Bitmap b() {
        return this.f30639b;
    }

    /* access modifiers changed from: protected */
    public final Integer c() {
        return this.f30640c;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return this.f30643f;
    }

    /* access modifiers changed from: protected */
    public final Rect e() {
        return this.f30644g;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.f30642e;
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.f30641d;
    }

    /* access modifiers changed from: protected */
    public final Uri h() {
        return this.f30638a;
    }

    /* access modifiers changed from: protected */
    public final boolean i() {
        return this.f30645h;
    }

    public a k(boolean z10) {
        this.f30641d = z10;
        return this;
    }

    public a l() {
        return k(true);
    }

    private a(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f30639b = null;
        this.f30638a = uri;
        this.f30640c = null;
        this.f30641d = true;
    }
}
