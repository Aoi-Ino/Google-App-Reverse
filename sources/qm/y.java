package qm;

import lm.m0;
import lm.v1;
import pl.d;
import tl.g;

final class y extends v1 implements m0 {

    /* renamed from: g  reason: collision with root package name */
    private final Throwable f30869g;

    /* renamed from: h  reason: collision with root package name */
    private final String f30870h;

    public y(Throwable th2, String str) {
        this.f30869g = th2;
        this.f30870h = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void H0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f30869g
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f30870h
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f30869g
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            qm.x.d()
            pl.d r0 = new pl.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.y.H0():java.lang.Void");
    }

    public boolean C0(g gVar) {
        H0();
        throw new d();
    }

    public v1 E0() {
        return this;
    }

    /* renamed from: G0 */
    public Void A0(g gVar, Runnable runnable) {
        H0();
        throw new d();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f30869g != null) {
            str = ", cause=" + this.f30869g;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
