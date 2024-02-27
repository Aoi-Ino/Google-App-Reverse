package s3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p3.i;
import q3.a;
import q3.e;
import r3.c;

public abstract class h extends c implements a.f {
    private final e F;
    private final Set G;
    private final Account H;

    protected h(Context context, Looper looper, int i10, e eVar, e.a aVar, e.b bVar) {
        this(context, looper, i10, eVar, (c) aVar, (r3.h) bVar);
    }

    private final Set i0(Set set) {
        Set<Scope> h02 = h0(set);
        for (Scope contains : h02) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return h02;
    }

    /* access modifiers changed from: protected */
    public final Set B() {
        return this.G;
    }

    public Set b() {
        return n() ? this.G : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set h0(Set set) {
        return set;
    }

    public final Account t() {
        return this.H;
    }

    /* access modifiers changed from: protected */
    public final Executor v() {
        return null;
    }

    protected h(Context context, Looper looper, int i10, e eVar, c cVar, r3.h hVar) {
        this(context, looper, i.b(context), i.l(), i10, eVar, (c) o.i(cVar), (r3.h) o.i(hVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected h(android.content.Context r11, android.os.Looper r12, s3.i r13, p3.i r14, int r15, s3.e r16, r3.c r17, r3.h r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            s3.e0 r3 = new s3.e0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            s3.f0 r0 = new s3.f0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.F = r0
            android.accounts.Account r1 = r16.a()
            r9.H = r1
            java.util.Set r0 = r16.c()
            java.util.Set r0 = r10.i0(r0)
            r9.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.h.<init>(android.content.Context, android.os.Looper, s3.i, p3.i, int, s3.e, r3.c, r3.h):void");
    }
}
