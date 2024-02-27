package oo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class l implements w {

    /* renamed from: c  reason: collision with root package name */
    private static final Map f30264c;

    /* renamed from: a  reason: collision with root package name */
    private final int f30265a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30266b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67), new l(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(b("SHA-512", 64, 16, 131), new l(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(b("SHAKE128", 32, 16, 67), new l(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(b("SHAKE256", 64, 16, 131), new l(67108868, "WOTSP_SHAKE256_W16"));
        f30264c = Collections.unmodifiableMap(hashMap);
    }

    private l(int i10, String str) {
        this.f30265a = i10;
        this.f30266b = str;
    }

    private static String b(String str, int i10, int i11, int i12) {
        if (str != null) {
            return str + "-" + i10 + "-" + i11 + "-" + i12;
        }
        throw new NullPointerException("algorithmName == null");
    }

    protected static l c(String str, int i10, int i11, int i12) {
        if (str != null) {
            return (l) f30264c.get(b(str, i10, i11, i12));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public int a() {
        return this.f30265a;
    }

    public String toString() {
        return this.f30266b;
    }
}
