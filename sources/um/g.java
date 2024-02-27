package um;

import cm.l;
import cm.m;
import in.h;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f31983c = new a().a();

    /* renamed from: d  reason: collision with root package name */
    public static final b f31984d = new b((cm.g) null);

    /* renamed from: a  reason: collision with root package name */
    private final Set f31985a;

    /* renamed from: b  reason: collision with root package name */
    private final gn.c f31986b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f31987a = new ArrayList();

        public final g a() {
            return new g(y.x0(this.f31987a), (gn.c) null, 2, (cm.g) null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(cm.g gVar) {
            this();
        }

        public final String a(Certificate certificate) {
            l.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + b((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final h b(X509Certificate x509Certificate) {
            l.f(x509Certificate, "$this$sha256Hash");
            h.a aVar = h.f24468i;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l.e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            l.e(encoded, "publicKey.encoded");
            return h.a.e(aVar, encoded, 0, 0, 3, (Object) null).p();
        }
    }

    static final class c extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f31988e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f31989f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f31990g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, List list, String str) {
            super(0);
            this.f31988e = gVar;
            this.f31989f = list;
            this.f31990g = str;
        }

        /* renamed from: b */
        public final List a() {
            List list;
            gn.c d10 = this.f31988e.d();
            if (d10 == null || (list = d10.a(this.f31989f, this.f31990g)) == null) {
                list = this.f31989f;
            }
            Iterable<Certificate> iterable = list;
            ArrayList arrayList = new ArrayList(r.s(iterable, 10));
            for (Certificate certificate : iterable) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
    }

    public g(Set set, gn.c cVar) {
        l.f(set, "pins");
        this.f31985a = set;
        this.f31986b = cVar;
    }

    public final void a(String str, List list) {
        l.f(str, "hostname");
        l.f(list, "peerCertificates");
        b(str, new c(this, list, str));
    }

    public final void b(String str, bm.a aVar) {
        l.f(str, "hostname");
        l.f(aVar, "cleanedPeerCertificatesFn");
        List<Object> c10 = c(str);
        if (!c10.isEmpty()) {
            List<X509Certificate> list = (List) aVar.a();
            for (X509Certificate x509Certificate : list) {
                Iterator it = c10.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb2.append("\n    ");
                sb2.append(f31984d.a(x509Certificate2));
                sb2.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                l.e(subjectDN, "element.subjectDN");
                sb2.append(subjectDN.getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            for (Object a10 : c10) {
                android.support.v4.media.session.b.a(a10);
                sb2.append("\n    ");
                sb2.append((Object) null);
            }
            String sb3 = sb2.toString();
            l.e(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public final List c(String str) {
        l.f(str, "hostname");
        Set set = this.f31985a;
        List i10 = q.i();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return i10;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public final gn.c d() {
        return this.f31986b;
    }

    public final g e(gn.c cVar) {
        l.f(cVar, "certificateChainCleaner");
        return l.a(this.f31986b, cVar) ? this : new g(this.f31985a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return l.a(gVar.f31985a, this.f31985a) && l.a(gVar.f31986b, this.f31986b);
        }
    }

    public int hashCode() {
        int hashCode = (1517 + this.f31985a.hashCode()) * 41;
        gn.c cVar = this.f31986b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Set set, gn.c cVar, int i10, cm.g gVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
