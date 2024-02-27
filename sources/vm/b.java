package vm;

import cm.l;
import hm.c;
import in.a0;
import in.b0;
import in.g;
import in.h;
import in.r;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import km.d;
import km.f;
import um.c0;
import um.d0;
import um.e;
import um.e0;
import um.r;
import um.u;
import um.v;
import um.x;
import um.z;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f32397a;

    /* renamed from: b  reason: collision with root package name */
    public static final u f32398b = u.f32130f.g(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f32399c;

    /* renamed from: d  reason: collision with root package name */
    public static final c0 f32400d;

    /* renamed from: e  reason: collision with root package name */
    private static final r f32401e;

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f32402f;

    /* renamed from: g  reason: collision with root package name */
    private static final f f32403g = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f32404h = false;

    /* renamed from: i  reason: collision with root package name */
    public static final String f32405i;

    static final class a implements r.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ um.r f32406a;

        a(um.r rVar) {
            this.f32406a = rVar;
        }

        public final um.r a(e eVar) {
            l.f(eVar, "it");
            return this.f32406a;
        }
    }

    /* renamed from: vm.b$b  reason: collision with other inner class name */
    static final class C0372b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32408b;

        C0372b(String str, boolean z10) {
            this.f32407a = str;
            this.f32408b = z10;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f32407a);
            thread.setDaemon(this.f32408b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f32397a = bArr;
        f32399c = e0.b.i(e0.Companion, bArr, (x) null, 1, (Object) null);
        f32400d = c0.a.j(c0.Companion, bArr, (x) null, 0, 0, 7, (Object) null);
        r.a aVar = in.r.f24486h;
        h.a aVar2 = h.f24468i;
        f32401e = aVar.d(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        l.c(timeZone);
        f32402f = timeZone;
        String name = z.class.getName();
        l.e(name, "OkHttpClient::class.java.name");
        f32405i = q.f0(q.e0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i10) {
        l.f(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != 9) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator comparator) {
        l.f(strArr, "$this$intersect");
        l.f(strArr2, "other");
        l.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean C(Socket socket, g gVar) {
        int soTimeout;
        l.f(socket, "$this$isHealthy");
        l.f(gVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z10 = !gVar.P();
            socket.setSoTimeout(soTimeout);
            return z10;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th2) {
            socket.setSoTimeout(soTimeout);
            throw th2;
        }
    }

    public static final boolean D(String str) {
        l.f(str, "name");
        return p.o(str, "Authorization", true) || p.o(str, "Cookie", true) || p.o(str, "Proxy-Authorization", true) || p.o(str, "Set-Cookie", true);
    }

    public static final int E(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        if ('a' <= c10 && 'f' >= c10) {
            return c10 - 'W';
        }
        if ('A' <= c10 && 'F' >= c10) {
            return c10 - '7';
        }
        return -1;
    }

    public static final Charset F(g gVar, Charset charset) {
        Charset charset2;
        String str;
        l.f(gVar, "$this$readBomAsCharset");
        l.f(charset, "default");
        int I = gVar.I(f32401e);
        if (I == -1) {
            return charset;
        }
        if (I == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (I == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (I == 2) {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        } else if (I == 3) {
            return d.f24739a.a();
        } else {
            if (I == 4) {
                return d.f24739a.b();
            }
            throw new AssertionError();
        }
        l.e(charset2, str);
        return charset2;
    }

    public static final int G(g gVar) {
        l.f(gVar, "$this$readMedium");
        return b(gVar.readByte(), 255) | (b(gVar.readByte(), 255) << 16) | (b(gVar.readByte(), 255) << 8);
    }

    public static final int H(in.e eVar, byte b10) {
        l.f(eVar, "$this$skipAll");
        int i10 = 0;
        while (!eVar.P() && eVar.R(0) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final boolean I(a0 a0Var, int i10, TimeUnit timeUnit) {
        l.f(a0Var, "$this$skipAll");
        l.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = a0Var.timeout().e() ? a0Var.timeout().c() - nanoTime : Long.MAX_VALUE;
        a0Var.timeout().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            in.e eVar = new in.e();
            while (a0Var.read(eVar, 8192) != -1) {
                eVar.c();
            }
            int i11 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            b0 timeout = a0Var.timeout();
            if (i11 == 0) {
                timeout.a();
            } else {
                timeout.d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i12 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            b0 timeout2 = a0Var.timeout();
            if (i12 == 0) {
                timeout2.a();
            } else {
                timeout2.d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th2) {
            int i13 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            b0 timeout3 = a0Var.timeout();
            if (i13 == 0) {
                timeout3.a();
            } else {
                timeout3.d(nanoTime + c10);
            }
            throw th2;
        }
    }

    public static final ThreadFactory J(String str, boolean z10) {
        l.f(str, "name");
        return new C0372b(str, z10);
    }

    public static final List K(u uVar) {
        l.f(uVar, "$this$toHeaderList");
        c i10 = f.i(0, uVar.size());
        ArrayList arrayList = new ArrayList(r.s(i10, 10));
        Iterator it = i10.iterator();
        while (it.hasNext()) {
            int a10 = ((ql.e0) it).a();
            arrayList.add(new cn.c(uVar.n(a10), uVar.s(a10)));
        }
        return arrayList;
    }

    public static final u L(List list) {
        l.f(list, "$this$toHeaders");
        u.a aVar = new u.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cn.c cVar = (cn.c) it.next();
            aVar.d(cVar.a().t(), cVar.b().t());
        }
        return aVar.e();
    }

    public static final String M(v vVar, boolean z10) {
        String str;
        l.f(vVar, "$this$toHostHeader");
        if (q.F(vVar.i(), ":", false, 2, (Object) null)) {
            str = '[' + vVar.i() + ']';
        } else {
            str = vVar.i();
        }
        if (!z10 && vVar.n() == v.f32134l.c(vVar.r())) {
            return str;
        }
        return str + ':' + vVar.n();
    }

    public static /* synthetic */ String N(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return M(vVar, z10);
    }

    public static final List O(List list) {
        l.f(list, "$this$toImmutableList");
        List unmodifiableList = Collections.unmodifiableList(y.v0(list));
        l.e(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map P(Map map) {
        l.f(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return i0.g();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        l.e(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long Q(String str, long j10) {
        l.f(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int R(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String S(String str, int i10, int i11) {
        l.f(str, "$this$trimSubstring");
        int w10 = w(str, i10, i11);
        String substring = str.substring(w10, y(str, w10, i11));
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String T(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return S(str, i10, i11);
    }

    public static final Throwable U(Exception exc, List list) {
        l.f(exc, "$this$withSuppressed");
        l.f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void V(in.f fVar, int i10) {
        l.f(fVar, "$this$writeMedium");
        fVar.Q((i10 >>> 16) & 255);
        fVar.Q((i10 >>> 8) & 255);
        fVar.Q(i10 & 255);
    }

    public static final void a(List list, Object obj) {
        l.f(list, "$this$addIfAbsent");
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c e(um.r rVar) {
        l.f(rVar, "$this$asFactory");
        return new a(rVar);
    }

    public static final boolean f(String str) {
        l.f(str, "$this$canParseAsIpAddress");
        return f32403g.a(str);
    }

    public static final boolean g(v vVar, v vVar2) {
        l.f(vVar, "$this$canReuseConnectionFor");
        l.f(vVar2, "other");
        return l.a(vVar.i(), vVar2.i()) && vVar.n() == vVar2.n() && l.a(vVar.r(), vVar2.r());
    }

    public static final int h(String str, long j10, TimeUnit timeUnit) {
        l.f(str, "name");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        boolean z10 = false;
        if (i10 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis != 0 || i10 <= 0) {
                        z10 = true;
                    }
                    if (z10) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void i(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        l.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        l.f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!l.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        l.f(strArr, "$this$concat");
        l.f(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[m.x(strArr2)] = str;
        return strArr2;
    }

    public static final int m(String str, char c10, int i10, int i11) {
        l.f(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, String str2, int i10, int i11) {
        l.f(str, "$this$delimiterOffset");
        l.f(str2, "delimiters");
        while (i10 < i11) {
            if (q.E(str2, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int o(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m(str, c10, i10, i11);
    }

    public static final boolean p(a0 a0Var, int i10, TimeUnit timeUnit) {
        l.f(a0Var, "$this$discard");
        l.f(timeUnit, "timeUnit");
        try {
            return I(a0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        l.f(str, "format");
        l.f(objArr, "args");
        cm.x xVar = cm.x.f20237a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        l.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator comparator) {
        l.f(strArr, "$this$hasIntersection");
        l.f(comparator, "comparator");
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long s(d0 d0Var) {
        l.f(d0Var, "$this$headersContentLength");
        String l10 = d0Var.y().l("Content-Length");
        if (l10 != null) {
            return Q(l10, -1);
        }
        return -1;
    }

    public static final List t(Object... objArr) {
        l.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(q.l(Arrays.copyOf(objArr2, objArr2.length)));
        l.e(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator comparator) {
        l.f(strArr, "$this$indexOf");
        l.f(str, "value");
        l.f(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        l.f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (l.h(charAt, 31) <= 0 || l.h(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int w(String str, int i10, int i11) {
        l.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int x(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return w(str, i10, i11);
    }

    public static final int y(String str, int i10, int i11) {
        l.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return y(str, i10, i11);
    }
}
