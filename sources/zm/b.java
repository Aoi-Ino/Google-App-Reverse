package zm;

import cm.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f33226a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33227b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33228c;

    /* renamed from: d  reason: collision with root package name */
    private final List f33229d;

    public b(List list) {
        l.f(list, "connectionSpecs");
        this.f33229d = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f33229d.size();
        for (int i10 = this.f33226a; i10 < size; i10++) {
            if (((um.l) this.f33229d.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final um.l a(SSLSocket sSLSocket) {
        um.l lVar;
        l.f(sSLSocket, "sslSocket");
        int i10 = this.f33226a;
        int size = this.f33229d.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (um.l) this.f33229d.get(i10);
            i10++;
            if (lVar.e(sSLSocket)) {
                this.f33226a = i10;
                break;
            }
        }
        if (lVar != null) {
            this.f33227b = c(sSLSocket);
            lVar.c(sSLSocket, this.f33228c);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f33228c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f33229d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        l.c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        l.e(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        l.f(iOException, "e");
        this.f33228c = true;
        return this.f33227b && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }
}
