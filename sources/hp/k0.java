package hp;

import java.util.Iterator;
import java.util.LinkedHashMap;

class k0 extends LinkedHashMap implements t {

    /* renamed from: e  reason: collision with root package name */
    private final g0 f24273e;

    public k0(g0 g0Var) {
        this.f24273e = g0Var;
    }

    private String r(String str) {
        t e10 = this.f24273e.e();
        if (e10 == null) {
            return null;
        }
        String Z = e10.Z(str);
        if (!containsValue(Z)) {
            return Z;
        }
        return null;
    }

    private String v(String str) {
        t e10 = this.f24273e.e();
        if (e10 != null) {
            return e10.d0(str);
        }
        return null;
    }

    public String O(String str, String str2) {
        if (r(str) != null) {
            return null;
        }
        return (String) put(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (java.lang.String) get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Z(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x000f
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000f
            return r0
        L_0x000f:
            java.lang.String r2 = r1.r(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.k0.Z(java.lang.String):java.lang.String");
    }

    public String d0(String str) {
        if (containsValue(str)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = (String) get(str2);
                if (str3 != null && str3.equals(str)) {
                    return str2;
                }
            }
        }
        return v(str);
    }

    public Iterator iterator() {
        return keySet().iterator();
    }
}
