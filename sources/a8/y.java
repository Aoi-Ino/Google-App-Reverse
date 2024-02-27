package a8;

public abstract class y {
    public static Object[][] a(Object[][] objArr, Object[] objArr2) {
        if (objArr == null) {
            return new Object[][]{objArr2};
        }
        Object[][] objArr3 = new Object[(objArr.length + 1)][];
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        objArr3[objArr.length] = objArr2;
        return objArr3;
    }

    public static int b(char c10, char c11) {
        return ((c10 - 55296) * 1024) + c11 + 9216;
    }

    public static int c(String str, int i10) {
        return ((str.charAt(i10) - 55296) * 1024) + str.charAt(i10 + 1) + 9216;
    }

    public static int d(char[] cArr, int i10) {
        return ((cArr[i10] - 55296) * 1024) + cArr[i10 + 1] + 9216;
    }

    public static boolean e(char c10) {
        return c10 >= 55296 && c10 <= 56319;
    }

    public static boolean f(char c10) {
        return c10 >= 56320 && c10 <= 57343;
    }

    public static boolean g(String str, int i10) {
        return i10 >= 0 && i10 <= str.length() + -2 && e(str.charAt(i10)) && f(str.charAt(i10 + 1));
    }

    public static boolean h(char[] cArr, int i10) {
        return i10 >= 0 && i10 <= cArr.length + -2 && e(cArr[i10]) && f(cArr[i10 + 1]);
    }
}
