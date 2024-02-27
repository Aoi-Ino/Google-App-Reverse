package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import cm.l;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2409a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f2410b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2411c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2412d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f2413e;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    private static final class C0032a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0032a f2414a = new C0032a();

        private C0032a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        f2410b = i10 >= 30 ? C0032a.f2414a.a(30) : 0;
        f2411c = i10 >= 30 ? C0032a.f2414a.a(31) : 0;
        f2412d = i10 >= 30 ? C0032a.f2414a.a(33) : 0;
        if (i10 >= 30) {
            i11 = C0032a.f2414a.a(1000000);
        }
        f2413e = i11;
    }

    private a() {
    }

    public static final boolean a(String str, String str2) {
        l.f(str, "codename");
        l.f(str2, "buildCodename");
        if (l.a("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        l.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        l.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String str = Build.VERSION.CODENAME;
                l.e(str, "CODENAME");
                if (a("Tiramisu", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
