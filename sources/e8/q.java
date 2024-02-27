package e8;

import java.util.HashMap;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap f10999a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap f11000b = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[SYNTHETIC, Splitter:B:37:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca A[SYNTHETIC, Splitter:B:41:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f10999a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f11000b = r0
            r0 = 0
            java.lang.String r1 = "com/itextpdf/text/pdf/fonts/glyphlist.txt"
            f8.a r2 = new f8.a     // Catch:{ Exception -> 0x0090 }
            r2.<init>()     // Catch:{ Exception -> 0x0090 }
            java.lang.Class<f8.a> r2 = f8.a.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x0090 }
            java.io.InputStream r1 = e8.c.r(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x00a0
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r3.<init>()     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
        L_0x002b:
            int r4 = r1.read(r2)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r5 = 0
            if (r4 >= 0) goto L_0x009c
            r1.close()     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            byte[] r1 = r3.toByteArray()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = e8.o0.d(r1, r0)     // Catch:{ Exception -> 0x0090 }
            java.util.StringTokenizer r2 = new java.util.StringTokenizer     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "\r\n"
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0090 }
        L_0x0044:
            boolean r1 = r2.hasMoreTokens()     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x00c7
            java.lang.String r1 = r2.nextToken()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "#"
            boolean r3 = r1.startsWith(r3)     // Catch:{ Exception -> 0x0090 }
            if (r3 == 0) goto L_0x0057
            goto L_0x0044
        L_0x0057:
            java.util.StringTokenizer r3 = new java.util.StringTokenizer     // Catch:{ Exception -> 0x0090 }
            java.lang.String r4 = " ;\r\n\t\f"
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = r3.hasMoreTokens()     // Catch:{ Exception -> 0x0090 }
            if (r1 != 0) goto L_0x0065
            goto L_0x0044
        L_0x0065:
            java.lang.String r1 = r3.nextToken()     // Catch:{ Exception -> 0x0090 }
            boolean r4 = r3.hasMoreTokens()     // Catch:{ Exception -> 0x0090 }
            if (r4 != 0) goto L_0x0070
            goto L_0x0044
        L_0x0070:
            java.lang.String r3 = r3.nextToken()     // Catch:{ Exception -> 0x0090 }
            r4 = 16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3, r4)     // Catch:{ Exception -> 0x0090 }
            java.util.HashMap r4 = f10999a     // Catch:{ Exception -> 0x0090 }
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0090 }
            java.util.HashMap r4 = f11000b     // Catch:{ Exception -> 0x0090 }
            r6 = 1
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0090 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0090 }
            r6[r5] = r3     // Catch:{ Exception -> 0x0090 }
            r4.put(r1, r6)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0044
        L_0x008e:
            r1 = move-exception
            goto L_0x00c8
        L_0x0090:
            r1 = move-exception
            goto L_0x00a8
        L_0x0092:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00c8
        L_0x0097:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00a8
        L_0x009c:
            r3.write(r2, r5, r4)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            goto L_0x002b
        L_0x00a0:
            java.lang.String r0 = "glyphlist.txt not found as resource. (It must exist as resource in the package com.itextpdf.text.pdf.fonts)"
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            throw r2     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
        L_0x00a8:
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x008e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r3.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "glyphlist.txt loading error: "
            r3.append(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008e }
            r3.append(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x008e }
            r2.println(r1)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x00c7
            r0.close()     // Catch:{ Exception -> 0x00c7 }
        L_0x00c7:
            return
        L_0x00c8:
            if (r0 == 0) goto L_0x00cd
            r0.close()     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.q.<clinit>():void");
    }

    public static int[] a(String str) {
        return (int[]) f11000b.get(str);
    }

    public static String b(int i10) {
        return (String) f10999a.get(Integer.valueOf(i10));
    }
}
