package um;

import cm.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f31999a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32000b;

    public h(String str, Map map) {
        String str2;
        l.f(str, "scheme");
        l.f(map, "authParams");
        this.f32000b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                l.e(locale, "US");
                str2 = str3.toLowerCase(locale);
                l.e(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.e(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f31999a = unmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f31999a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                l.e(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        l.e(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return (String) this.f31999a.get("realm");
    }

    public final String c() {
        return this.f32000b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return l.a(hVar.f32000b, this.f32000b) && l.a(hVar.f31999a, this.f31999a);
        }
    }

    public int hashCode() {
        return ((899 + this.f32000b.hashCode()) * 31) + this.f31999a.hashCode();
    }

    public String toString() {
        return this.f32000b + " authParams=" + this.f31999a;
    }
}
