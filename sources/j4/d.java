package j4;

import android.content.Context;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12701a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12702b = false;

    /* renamed from: c  reason: collision with root package name */
    private static a f12703c = a.LEGACY;

    public enum a {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        int b10;
        synchronized (d.class) {
            b10 = b(context, (a) null, (f) null);
        }
        return b10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051 A[Catch:{ RemoteException -> 0x0081, RemoteException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ RemoteException -> 0x0081, RemoteException -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int b(android.content.Context r5, j4.d.a r6, j4.f r7) {
        /*
            java.lang.Class<j4.d> r0 = j4.d.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            s3.o.j(r5, r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = f12701a     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0024 }
            boolean r1 = f12702b     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 == 0) goto L_0x0028
            if (r7 == 0) goto L_0x0026
            j4.d$a r5 = f12703c     // Catch:{ all -> 0x0024 }
            r7.a(r5)     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            goto L_0x008d
        L_0x0026:
            monitor-exit(r0)
            return r2
        L_0x0028:
            k4.k r1 = k4.i.a(r5, r6)     // Catch:{ k -> 0x0088 }
            k4.a r3 = r1.e()     // Catch:{ RemoteException -> 0x0081 }
            j4.b.b(r3)     // Catch:{ RemoteException -> 0x0081 }
            f4.i r3 = r1.L()     // Catch:{ RemoteException -> 0x0081 }
            l4.c.a(r3)     // Catch:{ RemoteException -> 0x0081 }
            r3 = 1
            f12702b = r3     // Catch:{ all -> 0x0024 }
            r4 = 2
            if (r6 == 0) goto L_0x0048
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0024 }
            if (r6 == 0) goto L_0x004b
            if (r6 == r3) goto L_0x004a
        L_0x0048:
            r3 = r2
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            int r6 = r1.b()     // Catch:{ RemoteException -> 0x0056 }
            if (r6 != r4) goto L_0x0058
            j4.d$a r6 = j4.d.a.LATEST     // Catch:{ RemoteException -> 0x0056 }
            f12703c = r6     // Catch:{ RemoteException -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            r5 = move-exception
            goto L_0x0060
        L_0x0058:
            z3.b r5 = z3.d.l0(r5)     // Catch:{ RemoteException -> 0x0056 }
            r1.Q(r5, r3)     // Catch:{ RemoteException -> 0x0056 }
            goto L_0x0067
        L_0x0060:
            java.lang.String r6 = f12701a     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0024 }
        L_0x0067:
            java.lang.String r5 = f12701a     // Catch:{ all -> 0x0024 }
            j4.d$a r6 = f12703c     // Catch:{ all -> 0x0024 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0024 }
            if (r7 == 0) goto L_0x007f
            j4.d$a r5 = f12703c     // Catch:{ all -> 0x0024 }
            r7.a(r5)     // Catch:{ all -> 0x0024 }
        L_0x007f:
            monitor-exit(r0)
            return r2
        L_0x0081:
            r5 = move-exception
            l4.f r6 = new l4.f     // Catch:{ all -> 0x0024 }
            r6.<init>(r5)     // Catch:{ all -> 0x0024 }
            throw r6     // Catch:{ all -> 0x0024 }
        L_0x0088:
            r5 = move-exception
            int r5 = r5.f14647e     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)
            return r5
        L_0x008d:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.b(android.content.Context, j4.d$a, j4.f):int");
    }
}
