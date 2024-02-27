package gl;

public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: e  reason: collision with root package name */
    final int f23889e;

    private q(int i10) {
        this.f23889e = i10;
    }

    public static boolean a(int i10) {
        return (i10 & OFFLINE.f23889e) != 0;
    }

    public static boolean b(int i10) {
        return (i10 & NO_CACHE.f23889e) == 0;
    }

    public static boolean c(int i10) {
        return (i10 & NO_STORE.f23889e) == 0;
    }
}
