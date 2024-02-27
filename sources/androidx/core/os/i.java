package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final i f2422b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final j f2423a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Locale[] f2424a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale equals : f2424a) {
                if (equals.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a10 = androidx.core.text.b.a(locale);
            if (!a10.isEmpty()) {
                return a10.equals(androidx.core.text.b.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f2423a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f2422b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f2423a.get(i10);
    }

    public boolean e() {
        return this.f2423a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f2423a.equals(((i) obj).f2423a);
    }

    public int f() {
        return this.f2423a.size();
    }

    public String g() {
        return this.f2423a.a();
    }

    public Object h() {
        return this.f2423a.b();
    }

    public int hashCode() {
        return this.f2423a.hashCode();
    }

    public String toString() {
        return this.f2423a.toString();
    }
}
