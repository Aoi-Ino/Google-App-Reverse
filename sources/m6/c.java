package m6;

public abstract class c {
    public static void a(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(d(str, obj));
        }
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void c(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(d(str, obj));
        }
    }

    static String d(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb2.append(valueOf, i11, indexOf);
            sb2.append(objArr[i10]);
            i11 = indexOf + 2;
            i10++;
        }
        sb2.append(valueOf, i11, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
