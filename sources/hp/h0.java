package hp;

import java.util.Iterator;
import java.util.LinkedHashMap;

class h0 extends LinkedHashMap implements y {

    /* renamed from: e  reason: collision with root package name */
    private final g0 f24247e;

    public h0(g0 g0Var) {
        this.f24247e = g0Var;
    }

    /* renamed from: F */
    public g0 remove(String str) {
        return (g0) super.remove(str);
    }

    public Iterator iterator() {
        return keySet().iterator();
    }

    /* renamed from: r */
    public g0 i(String str) {
        return (g0) super.get(str);
    }

    /* renamed from: v */
    public g0 P(String str, String str2) {
        c0 c0Var = new c0(this.f24247e, str, str2);
        if (this.f24247e != null) {
            put(str, c0Var);
        }
        return c0Var;
    }
}
