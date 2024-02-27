package um;

import cm.g;
import cm.l;
import cm.m;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import pl.h;

public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f32123e = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f32124a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f32125b;

    /* renamed from: c  reason: collision with root package name */
    private final i f32126c;

    /* renamed from: d  reason: collision with root package name */
    private final List f32127d;

    public static final class a {

        /* renamed from: um.t$a$a  reason: collision with other inner class name */
        static final class C0367a extends m implements bm.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List f32128e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0367a(List list) {
                super(0);
                this.f32128e = list;
            }

            /* renamed from: b */
            public final List a() {
                return this.f32128e;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final List b(Certificate[] certificateArr) {
            return certificateArr != null ? vm.b.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : q.i();
        }

        public final t a(SSLSession sSLSession) {
            List list;
            l.f(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                i b10 = i.f32056s1.b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!l.a("NONE", protocol)) {
                    g0 a10 = g0.f31997l.a(protocol);
                    try {
                        list = b(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = q.i();
                    }
                    return new t(a10, b10, b(sSLSession.getLocalCertificates()), new C0367a(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    static final class b extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ bm.a f32129e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(bm.a aVar) {
            super(0);
            this.f32129e = aVar;
        }

        /* renamed from: b */
        public final List a() {
            try {
                return (List) this.f32129e.a();
            } catch (SSLPeerUnverifiedException unused) {
                return q.i();
            }
        }
    }

    public t(g0 g0Var, i iVar, List list, bm.a aVar) {
        l.f(g0Var, "tlsVersion");
        l.f(iVar, "cipherSuite");
        l.f(list, "localCertificates");
        l.f(aVar, "peerCertificatesFn");
        this.f32125b = g0Var;
        this.f32126c = iVar;
        this.f32127d = list;
        this.f32124a = j.a(new b(aVar));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        l.e(type, "type");
        return type;
    }

    public final i a() {
        return this.f32126c;
    }

    public final List c() {
        return this.f32127d;
    }

    public final List d() {
        return (List) this.f32124a.getValue();
    }

    public final g0 e() {
        return this.f32125b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            return tVar.f32125b == this.f32125b && l.a(tVar.f32126c, this.f32126c) && l.a(tVar.d(), d()) && l.a(tVar.f32127d, this.f32127d);
        }
    }

    public int hashCode() {
        return ((((((527 + this.f32125b.hashCode()) * 31) + this.f32126c.hashCode()) * 31) + d().hashCode()) * 31) + this.f32127d.hashCode();
    }

    public String toString() {
        Iterable<Certificate> d10 = d();
        ArrayList arrayList = new ArrayList(r.s(d10, 10));
        for (Certificate b10 : d10) {
            arrayList.add(b(b10));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f32125b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f32126c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        Iterable<Certificate> iterable = this.f32127d;
        ArrayList arrayList2 = new ArrayList(r.s(iterable, 10));
        for (Certificate b11 : iterable) {
            arrayList2.add(b(b11));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
