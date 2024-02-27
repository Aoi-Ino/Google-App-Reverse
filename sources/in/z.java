package in;

import cm.l;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

final class z extends d {

    /* renamed from: m  reason: collision with root package name */
    private final Socket f24513m;

    public z(Socket socket) {
        l.f(socket, "socket");
        this.f24513m = socket;
    }

    /* access modifiers changed from: protected */
    public IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.f24513m     // Catch:{ Exception -> 0x000a, AssertionError -> 0x0008 }
            r1.close()     // Catch:{ Exception -> 0x000a, AssertionError -> 0x0008 }
            goto L_0x003a
        L_0x0008:
            r1 = move-exception
            goto L_0x000c
        L_0x000a:
            r1 = move-exception
            goto L_0x002e
        L_0x000c:
            boolean r2 = in.o.c(r1)
            if (r2 == 0) goto L_0x002d
            java.util.logging.Logger r2 = in.p.f24485a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x001d:
            r4.append(r0)
            java.net.Socket r0 = r5.f24513m
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
            goto L_0x003a
        L_0x002d:
            throw r1
        L_0x002e:
            java.util.logging.Logger r2 = in.p.f24485a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x001d
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.z.x():void");
    }
}
