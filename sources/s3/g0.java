package s3;

import android.content.Context;
import android.util.SparseIntArray;
import p3.j;
import q3.a;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f15973a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private j f15974b;

    public g0(j jVar) {
        o.i(jVar);
        this.f15974b = jVar;
    }

    public final int a(Context context, int i10) {
        return this.f15973a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        o.i(context);
        o.i(fVar);
        int i10 = 0;
        if (!fVar.e()) {
            return 0;
        }
        int f10 = fVar.f();
        int a10 = a(context, f10);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f15973a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f15973a.keyAt(i11);
                if (keyAt > f10 && this.f15973a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f15974b.g(context, f10) : i10;
            this.f15973a.put(f10, a10);
        }
        return a10;
    }

    public final void c() {
        this.f15973a.clear();
    }
}
