package androidx.profileinstaller;

enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    

    /* renamed from: e  reason: collision with root package name */
    private final long f3473e;

    private f(long j10) {
        this.f3473e = j10;
    }

    public long b() {
        return this.f3473e;
    }
}
