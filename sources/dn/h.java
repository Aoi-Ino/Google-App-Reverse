package dn;

import cm.g;
import cm.l;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public class h extends j {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f22934d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f22935e = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f22934d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            dn.h$a r0 = new dn.h$a
            r1 = 0
            r0.<init>(r1)
            f22935e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = km.o.i(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = r2
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            f22934d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.h.<clinit>():void");
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List b10 = j.f22941c.b(list);
        l.e(sSLParameters, "sslParameters");
        Object[] array = b10.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public String g(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        try {
            String a10 = sSLSocket.getApplicationProtocol();
            if (a10 == null) {
                return null;
            }
            if (a10.hashCode() == 0) {
                if (a10.equals("")) {
                    return null;
                }
            }
            return a10;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
