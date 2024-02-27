package um;

import cm.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

public final class l {

    /* renamed from: e  reason: collision with root package name */
    private static final i[] f32073e;

    /* renamed from: f  reason: collision with root package name */
    private static final i[] f32074f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f32075g;

    /* renamed from: h  reason: collision with root package name */
    public static final l f32076h;

    /* renamed from: i  reason: collision with root package name */
    public static final l f32077i;

    /* renamed from: j  reason: collision with root package name */
    public static final l f32078j = new a(false).a();

    /* renamed from: k  reason: collision with root package name */
    public static final b f32079k = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32080a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32081b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String[] f32082c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String[] f32083d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f32084a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f32085b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f32086c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f32087d;

        public a(l lVar) {
            cm.l.f(lVar, "connectionSpec");
            this.f32084a = lVar.f();
            this.f32085b = lVar.f32082c;
            this.f32086c = lVar.f32083d;
            this.f32087d = lVar.h();
        }

        public final l a() {
            return new l(this.f32084a, this.f32087d, this.f32085b, this.f32086c);
        }

        public final a b(String... strArr) {
            cm.l.f(strArr, "cipherSuites");
            if (this.f32084a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f32085b = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(i... iVarArr) {
            cm.l.f(iVarArr, "cipherSuites");
            if (this.f32084a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i c10 : iVarArr) {
                    arrayList.add(c10.c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z10) {
            if (this.f32084a) {
                this.f32087d = z10;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            cm.l.f(strArr, "tlsVersions");
            if (this.f32084a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f32086c = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(g0... g0VarArr) {
            cm.l.f(g0VarArr, "tlsVersions");
            if (this.f32084a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 a10 : g0VarArr) {
                    arrayList.add(a10.a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return e((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(boolean z10) {
            this.f32084a = z10;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    static {
        i iVar = i.f32041n1;
        i iVar2 = i.f32044o1;
        i iVar3 = i.f32047p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f32011d1;
        i iVar6 = i.f32002a1;
        i iVar7 = i.f32014e1;
        i iVar8 = i.f32032k1;
        i iVar9 = i.f32029j1;
        i iVar10 = iVar;
        i iVar11 = iVar2;
        i iVar12 = iVar3;
        i iVar13 = iVar4;
        i iVar14 = iVar5;
        i iVar15 = iVar6;
        i iVar16 = iVar7;
        i iVar17 = iVar8;
        i[] iVarArr = {iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar9};
        f32073e = iVarArr;
        i[] iVarArr2 = iVarArr;
        i[] iVarArr3 = {iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar9, i.K0, i.L0, i.f32025i0, i.f32028j0, i.G, i.K, i.f32030k};
        f32074f = iVarArr3;
        a c10 = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        f32075g = c10.f(g0Var, g0Var2).d(true).a();
        f32076h = new a(true).c((i[]) Arrays.copyOf(iVarArr3, iVarArr3.length)).f(g0Var, g0Var2).d(true).a();
        f32077i = new a(true).c((i[]) Arrays.copyOf(iVarArr3, iVarArr3.length)).f(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0).d(true).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f32080a = z10;
        this.f32081b = z11;
        this.f32082c = strArr;
        this.f32083d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        String[] strArr2;
        if (this.f32082c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            cm.l.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = vm.b.B(enabledCipherSuites, this.f32082c, i.f32056s1.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f32083d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            cm.l.e(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = vm.b.B(enabledProtocols, this.f32083d, b.b());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        cm.l.e(supportedCipherSuites, "supportedCipherSuites");
        int u10 = vm.b.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f32056s1.c());
        if (z10 && u10 != -1) {
            cm.l.e(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u10];
            cm.l.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = vm.b.l(strArr, str);
        }
        a aVar = new a(this);
        cm.l.e(strArr, "cipherSuitesIntersection");
        a b10 = aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        cm.l.e(strArr2, "tlsVersionsIntersection");
        return b10.e((String[]) Arrays.copyOf(strArr2, strArr2.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        cm.l.f(sSLSocket, "sslSocket");
        l g10 = g(sSLSocket, z10);
        if (g10.i() != null) {
            sSLSocket.setEnabledProtocols(g10.f32083d);
        }
        if (g10.d() != null) {
            sSLSocket.setEnabledCipherSuites(g10.f32082c);
        }
    }

    public final List d() {
        String[] strArr = this.f32082c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(i.f32056s1.b(b10));
        }
        return y.t0(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "socket");
        if (!this.f32080a) {
            return false;
        }
        String[] strArr = this.f32083d;
        if (strArr != null && !vm.b.r(strArr, sSLSocket.getEnabledProtocols(), b.b())) {
            return false;
        }
        String[] strArr2 = this.f32082c;
        return strArr2 == null || vm.b.r(strArr2, sSLSocket.getEnabledCipherSuites(), i.f32056s1.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f32080a;
        l lVar = (l) obj;
        if (z10 != lVar.f32080a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f32082c, lVar.f32082c) && Arrays.equals(this.f32083d, lVar.f32083d) && this.f32081b == lVar.f32081b);
    }

    public final boolean f() {
        return this.f32080a;
    }

    public final boolean h() {
        return this.f32081b;
    }

    public int hashCode() {
        if (!this.f32080a) {
            return 17;
        }
        String[] strArr = this.f32082c;
        int i10 = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f32083d;
        if (strArr2 != null) {
            i10 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i10) * 31) + (this.f32081b ^ true ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f32083d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            arrayList.add(g0.f31997l.a(a10));
        }
        return y.t0(arrayList);
    }

    public String toString() {
        if (!this.f32080a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(" + "cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", " + "tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", " + "supportsTlsExtensions=" + this.f32081b + ')';
    }
}
