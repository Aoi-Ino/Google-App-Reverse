package gl;

public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: e  reason: collision with root package name */
    final int f23884e;

    private p(int i10) {
        this.f23884e = i10;
    }

    static boolean a(int i10) {
        return (i10 & NO_CACHE.f23884e) == 0;
    }

    static boolean b(int i10) {
        return (i10 & NO_STORE.f23884e) == 0;
    }
}
