package ql;

import cm.l;
import java.util.List;
import java.util.RandomAccess;

public final class l0 extends c implements RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private final List f30772f;

    /* renamed from: g  reason: collision with root package name */
    private int f30773g;

    /* renamed from: h  reason: collision with root package name */
    private int f30774h;

    public l0(List list) {
        l.f(list, "list");
        this.f30772f = list;
    }

    public Object get(int i10) {
        c.f30755e.a(i10, this.f30774h);
        return this.f30772f.get(this.f30773g + i10);
    }

    public int l() {
        return this.f30774h;
    }

    public final void n(int i10, int i11) {
        c.f30755e.c(i10, i11, this.f30772f.size());
        this.f30773g = i10;
        this.f30774h = i11 - i10;
    }
}
