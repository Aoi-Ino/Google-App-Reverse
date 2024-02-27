package w3;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static String f17868a;

    /* renamed from: b  reason: collision with root package name */
    private static int f17869b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = f17868a
            if (r0 != 0) goto L_0x005a
            int r0 = f17869b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f17869b = r0
        L_0x000e:
            r1 = 0
            if (r0 > 0) goto L_0x0012
            goto L_0x0058
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            r2.<init>()     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            r2.append(r0)     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x004d }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x004d }
            r4.<init>(r0)     // Catch:{ all -> 0x004d }
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0044, all -> 0x0048 }
            s3.o.i(r0)     // Catch:{ IOException -> 0x0044, all -> 0x0048 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x0044, all -> 0x0048 }
        L_0x0044:
            w3.i.a(r3)
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            r1 = r3
            goto L_0x0052
        L_0x004b:
            r0 = move-exception
            goto L_0x0052
        L_0x004d:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0056, all -> 0x004b }
            throw r0     // Catch:{ IOException -> 0x0056, all -> 0x004b }
        L_0x0052:
            w3.i.a(r1)
            throw r0
        L_0x0056:
            r3 = r1
            goto L_0x0044
        L_0x0058:
            f17868a = r1
        L_0x005a:
            java.lang.String r0 = f17868a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.k.a():java.lang.String");
    }
}
