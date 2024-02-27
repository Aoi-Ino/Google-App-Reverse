package ip;

import java.lang.reflect.Array;

class i implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Class f24522a;

    public i(Class cls) {
        this.f24522a = cls;
    }

    private Object c(char[] cArr, int i10) {
        Object newInstance = Array.newInstance(this.f24522a, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Array.set(newInstance, i11, Character.valueOf(cArr[i11]));
        }
        return newInstance;
    }

    private String d(Object obj, int i10) {
        StringBuilder sb2 = new StringBuilder(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj2 = Array.get(obj, i11);
            if (obj2 != null) {
                sb2.append(obj2);
            }
        }
        return sb2.toString();
    }

    public String a(Object obj) {
        return this.f24522a == Character.TYPE ? new String((char[]) obj) : d(obj, Array.getLength(obj));
    }

    public Object b(String str) {
        char[] charArray = str.toCharArray();
        return this.f24522a == Character.TYPE ? charArray : c(charArray, charArray.length);
    }
}
