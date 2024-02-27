package pm;

import cm.l;
import java.util.Arrays;
import pl.p;
import pl.x;
import tl.d;

public abstract class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c[] f30440a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f30441b;

    /* renamed from: c  reason: collision with root package name */
    private int f30442c;

    /* access modifiers changed from: protected */
    public final c f() {
        c cVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.f30440a;
                if (cVarArr == null) {
                    cVarArr = h(2);
                    this.f30440a = cVarArr;
                } else if (this.f30441b >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    l.e(copyOf, "copyOf(this, newSize)");
                    this.f30440a = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i10 = this.f30442c;
                do {
                    cVar = cVarArr[i10];
                    if (cVar == null) {
                        cVar = g();
                        cVarArr[i10] = cVar;
                    }
                    i10++;
                    if (i10 >= cVarArr.length) {
                        i10 = 0;
                    }
                    l.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVar.a(this));
                this.f30442c = i10;
                this.f30441b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public abstract c g();

    /* access modifiers changed from: protected */
    public abstract c[] h(int i10);

    /* access modifiers changed from: protected */
    public final void i(c cVar) {
        int i10;
        d[] b10;
        synchronized (this) {
            try {
                int i11 = this.f30441b - 1;
                this.f30441b = i11;
                if (i11 == 0) {
                    this.f30442c = 0;
                }
                l.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (d dVar : b10) {
            if (dVar != null) {
                p.a aVar = p.f30426e;
                dVar.resumeWith(p.a(x.f30437a));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int j() {
        return this.f30441b;
    }

    /* access modifiers changed from: protected */
    public final c[] k() {
        return this.f30440a;
    }
}
