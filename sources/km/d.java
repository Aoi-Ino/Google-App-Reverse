package km;

import cm.l;
import java.nio.charset.Charset;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24739a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f24740b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f24741c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f24742d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f24743e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f24744f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f24745g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Charset f24746h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Charset f24747i;

    static {
        Charset forName = Charset.forName("UTF-8");
        l.e(forName, "forName(\"UTF-8\")");
        f24740b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        l.e(forName2, "forName(\"UTF-16\")");
        f24741c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        l.e(forName3, "forName(\"UTF-16BE\")");
        f24742d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        l.e(forName4, "forName(\"UTF-16LE\")");
        f24743e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        l.e(forName5, "forName(\"US-ASCII\")");
        f24744f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        l.e(forName6, "forName(\"ISO-8859-1\")");
        f24745g = forName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f24747i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        l.e(forName, "forName(\"UTF-32BE\")");
        f24747i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f24746h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        l.e(forName, "forName(\"UTF-32LE\")");
        f24746h = forName;
        return forName;
    }
}
