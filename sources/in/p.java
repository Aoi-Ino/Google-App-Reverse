package in;

import cm.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

abstract /* synthetic */ class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f24485a = Logger.getLogger("okio.Okio");

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r4 = r4.getMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(java.lang.AssertionError r4) {
        /*
            java.lang.String r0 = "$this$isAndroidGetsocknameError"
            cm.l.f(r4, r0)
            java.lang.Throwable r0 = r4.getCause()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.String r4 = r4.getMessage()
            if (r4 == 0) goto L_0x001d
            r0 = 2
            r2 = 0
            java.lang.String r3 = "getsockname failed"
            boolean r4 = km.q.F(r4, r3, r1, r0, r2)
            if (r4 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.p.b(java.lang.AssertionError):boolean");
    }

    public static final y c(OutputStream outputStream) {
        l.f(outputStream, "$this$sink");
        return new s(outputStream, new b0());
    }

    public static final y d(Socket socket) {
        l.f(socket, "$this$sink");
        z zVar = new z(socket);
        OutputStream outputStream = socket.getOutputStream();
        l.e(outputStream, "getOutputStream()");
        return zVar.v(new s(outputStream, zVar));
    }

    public static final a0 e(File file) {
        l.f(file, "$this$source");
        return o.g(new FileInputStream(file));
    }

    public static final a0 f(InputStream inputStream) {
        l.f(inputStream, "$this$source");
        return new n(inputStream, new b0());
    }

    public static final a0 g(Socket socket) {
        l.f(socket, "$this$source");
        z zVar = new z(socket);
        InputStream inputStream = socket.getInputStream();
        l.e(inputStream, "getInputStream()");
        return zVar.w(new n(inputStream, zVar));
    }
}
