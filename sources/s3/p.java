package s3;

public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static p f16018b;

    /* renamed from: c  reason: collision with root package name */
    private static final q f16019c = new q(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private q f16020a;

    private p() {
    }

    public static synchronized p b() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f16018b == null) {
                    f16018b = new p();
                }
                pVar = f16018b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public q a() {
        return this.f16020a;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f16020a = f16019c;
            return;
        }
        q qVar2 = this.f16020a;
        if (qVar2 == null || qVar2.g() < qVar.g()) {
            this.f16020a = qVar;
        }
    }
}
