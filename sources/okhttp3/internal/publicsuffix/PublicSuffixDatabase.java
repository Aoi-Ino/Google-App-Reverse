package okhttp3.internal.publicsuffix;

import cm.g;
import cm.l;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import vm.b;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f30134e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    private static final List f30135f = p.d("*");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f30136g = new PublicSuffixDatabase();

    /* renamed from: h  reason: collision with root package name */
    public static final a f30137h = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f30138a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f30139b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f30140c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f30141d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int i12;
            boolean z10;
            int b10;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr3[i14] != ((byte) 10)) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr3[i11] == ((byte) 10)) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        i12 = b.b(bArr4[i18][i19], 255);
                        z10 = z12;
                    }
                    b10 = i12 - b.b(bArr3[i15 + i20], 255);
                    if (b10 == 0) {
                        i20++;
                        i19++;
                        if (i20 == i17) {
                            break;
                        } else if (bArr4[i18].length != i19) {
                            z11 = z10;
                        } else if (i18 == bArr4.length - 1) {
                            break;
                        } else {
                            i18++;
                            z11 = true;
                            i19 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (b10 >= 0) {
                    if (b10 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr4[i18].length - i19;
                        int length3 = bArr4.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr4[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                l.e(charset, "UTF_8");
                                return new String(bArr3, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i14;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f30136g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List b(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f30138a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f30138a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.e()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.f30139b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.f30140c
            if (r1 == 0) goto L_0x002b
            r1 = r3
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x011e
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x0035:
            if (r5 >= r1) goto L_0x005e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            cm.l.e(r8, r9)
            if (r7 == 0) goto L_0x0056
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "(this as java.lang.String).getBytes(charset)"
            cm.l.e(r7, r8)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0056:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            r5 = r2
        L_0x005f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0077
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f30137h
            byte[] r9 = r0.f30140c
            if (r9 != 0) goto L_0x006d
            cm.l.v(r6)
        L_0x006d:
            java.lang.String r8 = r8.b(r9, r4, r5)
            if (r8 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x0077:
            r8 = r7
        L_0x0078:
            if (r1 <= r3) goto L_0x009d
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x0083:
            if (r10 >= r9) goto L_0x009d
            byte[] r11 = f30134e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f30137h
            byte[] r12 = r0.f30140c
            if (r12 != 0) goto L_0x0092
            cm.l.v(r6)
        L_0x0092:
            java.lang.String r11 = r11.b(r12, r5, r10)
            if (r11 == 0) goto L_0x009a
            r5 = r11
            goto L_0x009e
        L_0x009a:
            int r10 = r10 + 1
            goto L_0x0083
        L_0x009d:
            r5 = r7
        L_0x009e:
            if (r5 == 0) goto L_0x00ba
            int r1 = r1 - r3
            r6 = r2
        L_0x00a2:
            if (r6 >= r1) goto L_0x00ba
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f30137h
            byte[] r10 = r0.f30141d
            if (r10 != 0) goto L_0x00af
            java.lang.String r11 = "publicSuffixExceptionListBytes"
            cm.l.v(r11)
        L_0x00af:
            java.lang.String r9 = r9.b(r10, r4, r6)
            if (r9 == 0) goto L_0x00b7
            r7 = r9
            goto L_0x00ba
        L_0x00b7:
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00ba:
            r1 = 46
            if (r7 == 0) goto L_0x00dc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r1 = km.q.k0(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00dc:
            if (r8 != 0) goto L_0x00e3
            if (r5 != 0) goto L_0x00e3
            java.util.List r1 = f30135f
            return r1
        L_0x00e3:
            if (r8 == 0) goto L_0x00f6
            char[] r7 = new char[r3]
            r7[r2] = r1
            r4 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = km.q.k0(r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            java.util.List r4 = ql.q.i()
        L_0x00fa:
            if (r5 == 0) goto L_0x010d
            char[] r12 = new char[r3]
            r12[r2] = r1
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r5
            java.util.List r1 = km.q.k0(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            java.util.List r1 = ql.q.i()
        L_0x0111:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r4 = r1
        L_0x011d:
            return r4
        L_0x011e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        zl.b.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004b
            in.l r1 = new in.l
            in.a0 r0 = in.o.g(r0)
            r1.<init>(r0)
            in.g r0 = in.o.b(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r1 = (long) r1     // Catch:{ all -> 0x0044 }
            byte[] r1 = r0.S(r1)     // Catch:{ all -> 0x0044 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r2 = (long) r2     // Catch:{ all -> 0x0044 }
            byte[] r2 = r0.S(r2)     // Catch:{ all -> 0x0044 }
            pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x0044 }
            r3 = 0
            zl.b.a(r0, r3)
            monitor-enter(r4)
            cm.l.c(r1)     // Catch:{ all -> 0x0041 }
            r4.f30140c = r1     // Catch:{ all -> 0x0041 }
            cm.l.c(r2)     // Catch:{ all -> 0x0041 }
            r4.f30141d = r2     // Catch:{ all -> 0x0041 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.f30139b
            r0.countDown()
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            zl.b.a(r0, r1)
            throw r2
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.d()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            dn.j$a r2 = dn.j.f22941c     // Catch:{ all -> 0x000e }
            dn.j r2 = r2.g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.j(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.e():void");
    }

    private final List f(String str) {
        List k02 = q.k0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return l.a((String) y.e0(k02), "") ? y.S(k02, 1) : k02;
    }

    public final String c(String str) {
        l.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        l.e(unicode, "unicodeDomain");
        List f10 = f(unicode);
        List b10 = b(f10);
        if (f10.size() == b10.size() && ((String) b10.get(0)).charAt(0) != '!') {
            return null;
        }
        char charAt = ((String) b10.get(0)).charAt(0);
        int size = f10.size();
        int size2 = b10.size();
        if (charAt != '!') {
            size2++;
        }
        return o.n(o.g(y.O(f(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null);
    }
}
