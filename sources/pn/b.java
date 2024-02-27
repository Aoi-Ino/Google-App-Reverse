package pn;

import java.util.Hashtable;
import java.util.StringTokenizer;
import mn.a;
import mn.c;
import pn.c;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    static Hashtable f30480e;

    /* renamed from: f  reason: collision with root package name */
    private static Object[] f30481f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f30482g;

    /* renamed from: a  reason: collision with root package name */
    Class f30483a;

    /* renamed from: b  reason: collision with root package name */
    ClassLoader f30484b;

    /* renamed from: c  reason: collision with root package name */
    String f30485c;

    /* renamed from: d  reason: collision with root package name */
    int f30486d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f30480e = hashtable;
        hashtable.put("void", Void.TYPE);
        f30480e.put("boolean", Boolean.TYPE);
        f30480e.put("byte", Byte.TYPE);
        f30480e.put("char", Character.TYPE);
        f30480e.put("short", Short.TYPE);
        f30480e.put("int", Integer.TYPE);
        f30480e.put("long", Long.TYPE);
        f30480e.put("float", Float.TYPE);
        f30480e.put("double", Double.TYPE);
    }

    public b(String str, Class cls) {
        this.f30485c = str;
        this.f30483a = cls;
        this.f30484b = cls.getClassLoader();
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    static Class b(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f30480e.get(str);
        if (cls != null) {
            return cls;
        }
        if (classLoader != null) {
            return Class.forName(str, false, classLoader);
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Class cls2 = f30482g;
            if (cls2 != null) {
                return cls2;
            }
            Class a10 = a("java.lang.ClassNotFoundException");
            f30482g = a10;
            return a10;
        }
    }

    public static a c(a.C0323a aVar, Object obj, Object obj2) {
        return new c(aVar, obj, obj2, f30481f);
    }

    public static a d(a.C0323a aVar, Object obj, Object obj2, Object obj3) {
        return new c(aVar, obj, obj2, new Object[]{obj3});
    }

    public nn.a e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        int parseInt = Integer.parseInt(str, 16);
        String str9 = str3;
        Class b10 = b(str3, this.f30484b);
        String str10 = str4;
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i10 = 0; i10 < countTokens; i10++) {
            clsArr[i10] = b(stringTokenizer.nextToken(), this.f30484b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i11 = 0; i11 < countTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i12 = 0; i12 < countTokens3; i12++) {
            clsArr2[i12] = b(stringTokenizer3.nextToken(), this.f30484b);
        }
        return new e(parseInt, str2, b10, clsArr, strArr, clsArr2, b(str7, this.f30484b));
    }

    public a.C0323a f(String str, c cVar, int i10) {
        int i11 = this.f30486d;
        this.f30486d = i11 + 1;
        return new c.a(i11, str, cVar, g(i10, -1));
    }

    public nn.b g(int i10, int i11) {
        return new g(this.f30483a, this.f30485c, i10);
    }
}
