package zm;

import cm.l;
import java.io.IOException;

public final class j extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private IOException f33311e;

    /* renamed from: f  reason: collision with root package name */
    private final IOException f33312f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(IOException iOException) {
        super(iOException);
        l.f(iOException, "firstConnectException");
        this.f33312f = iOException;
        this.f33311e = iOException;
    }

    public final void a(IOException iOException) {
        l.f(iOException, "e");
        b.a(this.f33312f, iOException);
        this.f33311e = iOException;
    }

    public final IOException b() {
        return this.f33312f;
    }

    public final IOException c() {
        return this.f33311e;
    }
}
