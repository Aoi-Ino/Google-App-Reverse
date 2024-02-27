package ip;

import java.lang.reflect.Array;

class b implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f24517a = new d0();

    /* renamed from: b  reason: collision with root package name */
    private final g0 f24518b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f24519c;

    public b(g0 g0Var, Class cls) {
        this.f24518b = g0Var;
        this.f24519c = cls;
    }

    private Object c(String[] strArr, int i10) {
        Object newInstance = Array.newInstance(this.f24519c, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object b10 = this.f24518b.b(strArr[i11]);
            if (b10 != null) {
                Array.set(newInstance, i11, b10);
            }
        }
        return newInstance;
    }

    private String d(Object obj, int i10) {
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj2 = Array.get(obj, i11);
            if (obj2 != null) {
                strArr[i11] = this.f24518b.a(obj2);
            }
        }
        return this.f24517a.a(strArr);
    }

    public String a(Object obj) {
        return d(obj, Array.getLength(obj));
    }

    public Object b(String str) {
        String[] c10 = this.f24517a.b(str);
        return c(c10, c10.length);
    }
}
