package cn;

import cm.l;
import java.io.IOException;

public final class n extends IOException {

    /* renamed from: e  reason: collision with root package name */
    public final b f20460e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super("stream was reset: " + bVar);
        l.f(bVar, "errorCode");
        this.f20460e = bVar;
    }
}
