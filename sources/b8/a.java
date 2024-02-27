package b8;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap f4485a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap f4486b;

    static {
        f4485a = new HashMap();
        try {
            f4485a = c("en", (String) null);
        } catch (Exception unused) {
        }
        if (f4485a == null) {
            f4485a = new HashMap();
        }
    }

    private a() {
    }

    public static String a(String str, int i10) {
        return b(str, String.valueOf(i10), null, null, null);
    }

    public static String b(String str, Object... objArr) {
        String d10 = d(str);
        if (objArr != null) {
            int i10 = 1;
            for (Object obj : objArr) {
                if (obj != null) {
                    d10 = d10.replaceAll("\\{" + i10 + "\\}", obj.toString());
                }
                i10++;
            }
        }
        return d10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[SYNTHETIC, Splitter:B:43:0x00a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap c(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.Class<b8.a> r0 = b8.a.class
            java.lang.String r1 = "l10n/error/"
            if (r6 == 0) goto L_0x00a8
            java.lang.String r2 = ".lng"
            r3 = 0
            if (r7 == 0) goto L_0x0026
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r4.<init>()     // Catch:{ all -> 0x0023 }
            r4.append(r6)     // Catch:{ all -> 0x0023 }
            java.lang.String r5 = "_"
            r4.append(r5)     // Catch:{ all -> 0x0023 }
            r4.append(r7)     // Catch:{ all -> 0x0023 }
            r4.append(r2)     // Catch:{ all -> 0x0023 }
        L_0x001e:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0023 }
            goto L_0x0032
        L_0x0023:
            r6 = move-exception
            goto L_0x00a2
        L_0x0026:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r4.<init>()     // Catch:{ all -> 0x0023 }
            r4.append(r6)     // Catch:{ all -> 0x0023 }
            r4.append(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x001e
        L_0x0032:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r5.<init>()     // Catch:{ all -> 0x0023 }
            r5.append(r1)     // Catch:{ all -> 0x0023 }
            r5.append(r4)     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0023 }
            b8.a r5 = new b8.a     // Catch:{ all -> 0x0023 }
            r5.<init>()     // Catch:{ all -> 0x0023 }
            java.lang.ClassLoader r5 = r0.getClassLoader()     // Catch:{ all -> 0x0023 }
            java.io.InputStream r4 = e8.c.r(r4, r5)     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x005b
            java.util.HashMap r6 = e(r4)     // Catch:{ all -> 0x0058 }
            r4.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            return r6
        L_0x0058:
            r6 = move-exception
            r3 = r4
            goto L_0x00a2
        L_0x005b:
            if (r7 != 0) goto L_0x0063
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            return r3
        L_0x0063:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r7.<init>()     // Catch:{ all -> 0x0058 }
            r7.append(r6)     // Catch:{ all -> 0x0058 }
            r7.append(r2)     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0058 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r7.<init>()     // Catch:{ all -> 0x0058 }
            r7.append(r1)     // Catch:{ all -> 0x0058 }
            r7.append(r6)     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0058 }
            b8.a r7 = new b8.a     // Catch:{ all -> 0x0058 }
            r7.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch:{ all -> 0x0058 }
            java.io.InputStream r6 = e8.c.r(r6, r7)     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x009c
            java.util.HashMap r7 = e(r6)     // Catch:{ all -> 0x0098 }
            r6.close()     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            return r7
        L_0x0098:
            r7 = move-exception
            r3 = r6
            r6 = r7
            goto L_0x00a2
        L_0x009c:
            if (r6 == 0) goto L_0x00a1
            r6.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            return r3
        L_0x00a2:
            if (r3 == 0) goto L_0x00a7
            r3.close()     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            throw r6
        L_0x00a8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The language cannot be null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.c(java.lang.String, java.lang.String):java.util.HashMap");
    }

    public static String d(String str) {
        String str2;
        HashMap hashMap = f4486b;
        if (hashMap != null && (str2 = (String) hashMap.get(str)) != null) {
            return str2;
        }
        String str3 = (String) f4485a.get(str);
        if (str3 != null) {
            return str3;
        }
        return "No message found for " + str;
    }

    private static HashMap e(InputStream inputStream) {
        return f(new InputStreamReader(inputStream, "UTF-8"));
    }

    private static HashMap f(Reader reader) {
        HashMap hashMap = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return hashMap;
            }
            int indexOf = readLine.indexOf(61);
            if (indexOf >= 0) {
                String trim = readLine.substring(0, indexOf).trim();
                if (!trim.startsWith("#")) {
                    hashMap.put(trim, readLine.substring(indexOf + 1));
                }
            }
        }
    }
}
