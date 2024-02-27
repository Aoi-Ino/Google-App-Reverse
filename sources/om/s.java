package om;

import pm.c;
import tl.d;

public final class s extends c {

    /* renamed from: a  reason: collision with root package name */
    public long f30195a = -1;

    /* renamed from: b  reason: collision with root package name */
    public d f30196b;

    /* renamed from: c */
    public boolean a(q qVar) {
        if (this.f30195a >= 0) {
            return false;
        }
        this.f30195a = qVar.U();
        return true;
    }

    /* renamed from: d */
    public d[] b(q qVar) {
        long j10 = this.f30195a;
        this.f30195a = -1;
        this.f30196b = null;
        return qVar.T(j10);
    }
}
