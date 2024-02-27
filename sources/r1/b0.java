package r1;

import android.os.Build;
import cm.l;
import m1.n;
import m1.r;
import m1.x;
import pl.m;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f15437a = new b0();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15438a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15439b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f15440c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f15441d;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0098 */
        static {
            /*
                m1.x[] r0 = m1.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                m1.x r2 = m1.x.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                m1.x r3 = m1.x.RUNNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                m1.x r4 = m1.x.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                m1.x r5 = m1.x.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                m1.x r6 = m1.x.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                m1.x r6 = m1.x.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f15438a = r0
                m1.a[] r0 = m1.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m1.a r6 = m1.a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                m1.a r6 = m1.a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f15439b = r0
                m1.n[] r0 = m1.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m1.n r6 = m1.n.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                m1.n r6 = m1.n.CONNECTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                m1.n r6 = m1.n.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                m1.n r3 = m1.n.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                m1.n r3 = m1.n.METERED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                f15440c = r0
                m1.r[] r0 = m1.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m1.r r3 = m1.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                m1.r r1 = m1.r.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                f15441d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.b0.a.<clinit>():void");
        }
    }

    private b0() {
    }

    public static final int a(m1.a aVar) {
        l.f(aVar, "backoffPolicy");
        int i10 = a.f15439b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        zl.b.a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set b(byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            cm.l.f(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0046 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0046 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x003c }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x003e
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x003c }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x003c }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x003c }
            m1.d$c r7 = new m1.d$c     // Catch:{ all -> 0x003c }
            java.lang.String r8 = "uri"
            cm.l.e(r5, r8)     // Catch:{ all -> 0x003c }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x003c }
            r0.add(r7)     // Catch:{ all -> 0x003c }
            int r4 = r4 + 1
            goto L_0x001e
        L_0x003c:
            r3 = move-exception
            goto L_0x0048
        L_0x003e:
            pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x003c }
            zl.b.a(r2, r9)     // Catch:{ IOException -> 0x0046 }
            goto L_0x0051
        L_0x0044:
            r9 = move-exception
            goto L_0x0057
        L_0x0046:
            r2 = move-exception
            goto L_0x004e
        L_0x0048:
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            zl.b.a(r2, r3)     // Catch:{ IOException -> 0x0046 }
            throw r4     // Catch:{ IOException -> 0x0046 }
        L_0x004e:
            r2.printStackTrace()     // Catch:{ all -> 0x0044 }
        L_0x0051:
            pl.x r2 = pl.x.f30437a     // Catch:{ all -> 0x0044 }
            zl.b.a(r1, r9)
            return r0
        L_0x0057:
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            zl.b.a(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b0.b(byte[]):java.util.Set");
    }

    public static final m1.a c(int i10) {
        if (i10 == 0) {
            return m1.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return m1.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final n d(int i10) {
        if (i10 == 0) {
            return n.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return n.CONNECTED;
        }
        if (i10 == 2) {
            return n.UNMETERED;
        }
        if (i10 == 3) {
            return n.NOT_ROAMING;
        }
        if (i10 == 4) {
            return n.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return n.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final r e(int i10) {
        if (i10 == 0) {
            return r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return r.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final x f(int i10) {
        if (i10 == 0) {
            return x.ENQUEUED;
        }
        if (i10 == 1) {
            return x.RUNNING;
        }
        if (i10 == 2) {
            return x.SUCCEEDED;
        }
        if (i10 == 3) {
            return x.FAILED;
        }
        if (i10 == 4) {
            return x.BLOCKED;
        }
        if (i10 == 5) {
            return x.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(n nVar) {
        l.f(nVar, "networkType");
        int i10 = a.f15440c[nVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && nVar == n.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + nVar + " to int");
            }
        }
        return i11;
    }

    public static final int h(r rVar) {
        l.f(rVar, "policy");
        int i10 = a.f15441d[rVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        zl.b.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] i(java.util.Set r4) {
        /*
            java.lang.String r0 = "triggers"
            cm.l.f(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0058 }
            r1.<init>(r0)     // Catch:{ all -> 0x0058 }
            int r2 = r4.size()     // Catch:{ all -> 0x0043 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0043 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0043 }
        L_0x0024:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0043 }
            m1.d$c r2 = (m1.d.c) r2     // Catch:{ all -> 0x0043 }
            android.net.Uri r3 = r2.a()     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0043 }
            r1.writeUTF(r3)     // Catch:{ all -> 0x0043 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0043 }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x0043 }
            goto L_0x0024
        L_0x0043:
            r4 = move-exception
            goto L_0x005a
        L_0x0045:
            pl.x r4 = pl.x.f30437a     // Catch:{ all -> 0x0043 }
            r4 = 0
            zl.b.a(r1, r4)     // Catch:{ all -> 0x0058 }
            zl.b.a(r0, r4)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            cm.l.e(r4, r0)
            return r4
        L_0x0058:
            r4 = move-exception
            goto L_0x0060
        L_0x005a:
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r2 = move-exception
            zl.b.a(r1, r4)     // Catch:{ all -> 0x0058 }
            throw r2     // Catch:{ all -> 0x0058 }
        L_0x0060:
            throw r4     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            zl.b.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b0.i(java.util.Set):byte[]");
    }

    public static final int j(x xVar) {
        l.f(xVar, "state");
        switch (a.f15438a[xVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new m();
        }
    }
}
