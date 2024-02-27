package gn;

import cm.g;
import cm.l;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0298a f23993c = new C0298a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final e f23994b;

    /* renamed from: gn.a$a  reason: collision with other inner class name */
    public static final class C0298a {
        private C0298a() {
        }

        public /* synthetic */ C0298a(g gVar) {
            this();
        }
    }

    public a(e eVar) {
        l.f(eVar, "trustRootIndex");
        this.f23994b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!l.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public List a(List list, String str) {
        l.f(list, "chain");
        l.f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        l.e(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj != null) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                X509Certificate a10 = this.f23994b.a(x509Certificate);
                if (a10 != null) {
                    if (arrayList.size() > 1 || (!l.a(x509Certificate, a10))) {
                        arrayList.add(a10);
                    }
                    if (b(a10, a10)) {
                        return arrayList;
                    }
                    z10 = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    l.e(it, "queue.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (b(x509Certificate, x509Certificate2)) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z10) {
                        return arrayList;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                i10++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && l.a(((a) obj).f23994b, this.f23994b);
    }

    public int hashCode() {
        return this.f23994b.hashCode();
    }
}
