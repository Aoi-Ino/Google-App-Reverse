package m1;

import android.util.Log;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f13694a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile m f13695b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final int f13696c = 20;

    public static class a extends m {

        /* renamed from: d  reason: collision with root package name */
        private final int f13697d;

        public a(int i10) {
            super(i10);
            this.f13697d = i10;
        }

        public void a(String str, String str2) {
            if (this.f13697d <= 3) {
                Log.d(str, str2);
            }
        }

        public void b(String str, String str2, Throwable th2) {
            if (this.f13697d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        public void c(String str, String str2) {
            if (this.f13697d <= 6) {
                Log.e(str, str2);
            }
        }

        public void d(String str, String str2, Throwable th2) {
            if (this.f13697d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        public void f(String str, String str2) {
            if (this.f13697d <= 4) {
                Log.i(str, str2);
            }
        }

        public void g(String str, String str2, Throwable th2) {
            if (this.f13697d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        public void j(String str, String str2) {
            if (this.f13697d <= 2) {
                Log.v(str, str2);
            }
        }

        public void k(String str, String str2) {
            if (this.f13697d <= 5) {
                Log.w(str, str2);
            }
        }

        public void l(String str, String str2, Throwable th2) {
            if (this.f13697d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public m(int i10) {
    }

    public static m e() {
        m mVar;
        synchronized (f13694a) {
            try {
                if (f13695b == null) {
                    f13695b = new a(3);
                }
                mVar = f13695b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    public static void h(m mVar) {
        synchronized (f13694a) {
            f13695b = mVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f13696c;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}
