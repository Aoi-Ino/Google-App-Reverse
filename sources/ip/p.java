package ip;

class p implements z {

    /* renamed from: a  reason: collision with root package name */
    private z f24535a = new b0();

    /* renamed from: b  reason: collision with root package name */
    private z f24536b;

    /* renamed from: c  reason: collision with root package name */
    private z f24537c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private z f24538d = new a(this);

    public p(z zVar) {
        this.f24536b = zVar;
    }

    private g0 b(Class cls) {
        return (cls.isArray() ? this.f24538d : cls.isPrimitive() ? this.f24535a : this.f24537c).a(cls);
    }

    public g0 a(Class cls) {
        g0 a10 = this.f24536b.a(cls);
        return a10 != null ? a10 : b(cls);
    }
}
