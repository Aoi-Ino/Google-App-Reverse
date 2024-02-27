package in;

import androidx.lifecycle.p;
import cm.l;
import java.util.concurrent.atomic.AtomicReference;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final int f24506a = 65536;

    /* renamed from: b  reason: collision with root package name */
    private static final v f24507b = new v(new byte[0], 0, 0, false, false);

    /* renamed from: c  reason: collision with root package name */
    private static final int f24508c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference[] f24509d;

    /* renamed from: e  reason: collision with root package name */
    public static final w f24510e = new w();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f24508c = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f24509d = atomicReferenceArr;
    }

    private w() {
    }

    private final AtomicReference a() {
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        return f24509d[(int) (currentThread.getId() & (((long) f24508c) - 1))];
    }

    public static final void b(v vVar) {
        l.f(vVar, "segment");
        if (!(vVar.f24504f == null && vVar.f24505g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!vVar.f24502d) {
            AtomicReference a10 = f24510e.a();
            v vVar2 = (v) a10.get();
            if (vVar2 != f24507b) {
                int i10 = vVar2 != null ? vVar2.f24501c : 0;
                if (i10 < f24506a) {
                    vVar.f24504f = vVar2;
                    vVar.f24500b = 0;
                    vVar.f24501c = i10 + 8192;
                    if (!p.a(a10, vVar2, vVar)) {
                        vVar.f24504f = null;
                    }
                }
            }
        }
    }

    public static final v c() {
        AtomicReference a10 = f24510e.a();
        v vVar = f24507b;
        v vVar2 = (v) a10.getAndSet(vVar);
        if (vVar2 == vVar) {
            return new v();
        }
        if (vVar2 == null) {
            a10.set((Object) null);
            return new v();
        }
        a10.set(vVar2.f24504f);
        vVar2.f24504f = null;
        vVar2.f24501c = 0;
        return vVar2;
    }
}
