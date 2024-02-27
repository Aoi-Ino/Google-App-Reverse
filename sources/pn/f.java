package pn;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import mn.c;

abstract class f implements c {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f30496h = true;

    /* renamed from: i  reason: collision with root package name */
    static String[] f30497i = new String[0];

    /* renamed from: j  reason: collision with root package name */
    static Class[] f30498j = new Class[0];

    /* renamed from: a  reason: collision with root package name */
    int f30499a;

    /* renamed from: b  reason: collision with root package name */
    String f30500b;

    /* renamed from: c  reason: collision with root package name */
    String f30501c;

    /* renamed from: d  reason: collision with root package name */
    Class f30502d;

    /* renamed from: e  reason: collision with root package name */
    a f30503e;

    /* renamed from: f  reason: collision with root package name */
    private String f30504f;

    /* renamed from: g  reason: collision with root package name */
    ClassLoader f30505g = null;

    private interface a {
        void a(int i10, String str);

        String get(int i10);
    }

    private static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private SoftReference f30506a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f30506a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f30506a = new SoftReference(strArr);
            return strArr;
        }

        public void a(int i10, String str) {
            String[] b10 = b();
            if (b10 == null) {
                b10 = c();
            }
            b10[i10] = str;
        }

        public String get(int i10) {
            String[] b10 = b();
            if (b10 == null) {
                return null;
            }
            return b10[i10];
        }
    }

    f(int i10, String str, Class cls) {
        this.f30499a = i10;
        this.f30500b = str;
        this.f30502d = cls;
    }

    private ClassLoader h() {
        if (this.f30505g == null) {
            this.f30505g = getClass().getClassLoader();
        }
        return this.f30505g;
    }

    /* access modifiers changed from: protected */
    public abstract String a(h hVar);

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        return Integer.parseInt(c(i10), 16);
    }

    /* access modifiers changed from: package-private */
    public String c(int i10) {
        int indexOf = this.f30504f.indexOf(45);
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            i11 = indexOf + 1;
            indexOf = this.f30504f.indexOf(45, i11);
            i10 = i12;
        }
        if (indexOf == -1) {
            indexOf = this.f30504f.length();
        }
        return this.f30504f.substring(i11, indexOf);
    }

    /* access modifiers changed from: package-private */
    public Class d(int i10) {
        return b.b(c(i10), h());
    }

    /* access modifiers changed from: package-private */
    public Class[] e(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i10), ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i11 = 0; i11 < countTokens; i11++) {
            clsArr[i11] = b.b(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.f30502d == null) {
            this.f30502d = d(2);
        }
        return this.f30502d;
    }

    public String g() {
        if (this.f30501c == null) {
            this.f30501c = f().getName();
        }
        return this.f30501c;
    }

    public int i() {
        if (this.f30499a == -1) {
            this.f30499a = b(0);
        }
        return this.f30499a;
    }

    public String j() {
        if (this.f30500b == null) {
            this.f30500b = c(1);
        }
        return this.f30500b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String k(pn.h r3) {
        /*
            r2 = this;
            boolean r0 = f30496h
            if (r0 == 0) goto L_0x001b
            pn.f$a r0 = r2.f30503e
            if (r0 != 0) goto L_0x0014
            pn.f$b r0 = new pn.f$b     // Catch:{ all -> 0x0010 }
            r0.<init>()     // Catch:{ all -> 0x0010 }
            r2.f30503e = r0     // Catch:{ all -> 0x0010 }
            goto L_0x001b
        L_0x0010:
            r0 = 0
            f30496h = r0
            goto L_0x001b
        L_0x0014:
            int r1 = r3.f30521i
            java.lang.String r0 = r0.get(r1)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = r2.a(r3)
        L_0x0022:
            boolean r1 = f30496h
            if (r1 == 0) goto L_0x002d
            pn.f$a r1 = r2.f30503e
            int r3 = r3.f30521i
            r1.a(r3, r0)
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.f.k(pn.h):java.lang.String");
    }

    public final String toString() {
        return k(h.f30511k);
    }
}
