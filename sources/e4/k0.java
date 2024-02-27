package e4;

import java.util.List;

final class k0 extends l0 {

    /* renamed from: g  reason: collision with root package name */
    final transient int f10066g;

    /* renamed from: h  reason: collision with root package name */
    final transient int f10067h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ l0 f10068i;

    k0(l0 l0Var, int i10, int i11) {
        this.f10068i = l0Var;
        this.f10066g = i10;
        this.f10067h = i11;
    }

    public final Object get(int i10) {
        f0.a(i10, this.f10067h, "index");
        return this.f10068i.get(i10 + this.f10066g);
    }

    /* access modifiers changed from: package-private */
    public final int n() {
        return this.f10068i.o() + this.f10066g + this.f10067h;
    }

    /* access modifiers changed from: package-private */
    public final int o() {
        return this.f10068i.o() + this.f10066g;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return true;
    }

    public final int size() {
        return this.f10067h;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final Object[] v() {
        return this.f10068i.v();
    }

    public final l0 y(int i10, int i11) {
        f0.c(i10, i11, this.f10067h);
        l0 l0Var = this.f10068i;
        int i12 = this.f10066g;
        return l0Var.subList(i10 + i12, i11 + i12);
    }
}
