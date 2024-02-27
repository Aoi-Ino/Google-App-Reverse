package e4;

final class m0 extends l0 {

    /* renamed from: i  reason: collision with root package name */
    static final l0 f10072i = new m0(new Object[0], 0);

    /* renamed from: g  reason: collision with root package name */
    final transient Object[] f10073g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f10074h;

    m0(Object[] objArr, int i10) {
        this.f10073g = objArr;
        this.f10074h = i10;
    }

    public final Object get(int i10) {
        f0.a(i10, this.f10074h, "index");
        Object obj = this.f10073g[i10];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final int l(Object[] objArr, int i10) {
        System.arraycopy(this.f10073g, 0, objArr, 0, this.f10074h);
        return this.f10074h;
    }

    /* access modifiers changed from: package-private */
    public final int n() {
        return this.f10074h;
    }

    /* access modifiers changed from: package-private */
    public final int o() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return false;
    }

    public final int size() {
        return this.f10074h;
    }

    /* access modifiers changed from: package-private */
    public final Object[] v() {
        return this.f10073g;
    }
}
