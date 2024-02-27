package om;

import nm.a;
import qm.h0;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f30194a = new h0("NO_VALUE");

    public static final l a(int i10, int i11, a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        } else if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        } else if (i10 > 0 || i11 > 0 || aVar == a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new q(i10, i12, aVar);
        } else {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
    }

    public static /* synthetic */ l b(int i10, int i11, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    /* access modifiers changed from: private */
    public static final Object e(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* access modifiers changed from: private */
    public static final void f(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
