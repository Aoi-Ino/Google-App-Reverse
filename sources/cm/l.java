package cm;

import java.util.Arrays;
import pl.e;
import pl.w;

public abstract class l {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) k(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) k(new NullPointerException(str + " must not be null")));
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static int h(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    private static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void j(int i10, String str) {
        s();
    }

    private static Throwable k(Throwable th2) {
        return l(th2, l.class.getName());
    }

    static Throwable l(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th2;
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static void n() {
        throw ((NullPointerException) k(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) k(new NullPointerException(str)));
    }

    public static void p() {
        throw ((e) k(new e()));
    }

    private static void q(String str) {
        throw ((IllegalArgumentException) k(new IllegalArgumentException(i(str))));
    }

    private static void r(String str) {
        throw ((NullPointerException) k(new NullPointerException(i(str))));
    }

    public static void s() {
        t("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void u(String str) {
        throw ((w) k(new w(str)));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}
