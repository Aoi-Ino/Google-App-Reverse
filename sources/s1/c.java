package s1;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.c0;
import androidx.work.impl.p0;
import androidx.work.impl.q;
import androidx.work.impl.z;
import java.util.List;
import m1.m;
import m1.q;

public class c implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final String f15832g = m.i("EnqueueRunnable");

    /* renamed from: e  reason: collision with root package name */
    private final c0 f15833e;

    /* renamed from: f  reason: collision with root package name */
    private final q f15834f;

    public c(c0 c0Var) {
        this(c0Var, new q());
    }

    private static boolean b(c0 c0Var) {
        boolean c10 = c(c0Var.g(), c0Var.f(), (String[]) c0.l(c0Var).toArray(new String[0]), c0Var.d(), c0Var.b());
        c0Var.k();
        return c10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(androidx.work.impl.p0 r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, m1.f r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            androidx.work.a r3 = r18.g()
            m1.b r3 = r3.a()
            long r3 = r3.a()
            androidx.work.impl.WorkDatabase r5 = r18.n()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x001f
            int r8 = r0.length
            if (r8 <= 0) goto L_0x001f
            r8 = r6
            goto L_0x0020
        L_0x001f:
            r8 = r7
        L_0x0020:
            if (r8 == 0) goto L_0x006d
            int r9 = r0.length
            r11 = r6
            r10 = r7
            r12 = r10
            r13 = r12
        L_0x0027:
            if (r10 >= r9) goto L_0x0070
            r14 = r0[r10]
            r1.v r15 = r5.H()
            r1.u r15 = r15.m(r14)
            if (r15 != 0) goto L_0x0055
            m1.m r0 = m1.m.e()
            java.lang.String r1 = f15832g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.c(r1, r2)
            return r7
        L_0x0055:
            m1.x r14 = r15.f15478b
            m1.x r15 = m1.x.SUCCEEDED
            if (r14 != r15) goto L_0x005d
            r15 = r6
            goto L_0x005e
        L_0x005d:
            r15 = r7
        L_0x005e:
            r11 = r11 & r15
            m1.x r15 = m1.x.FAILED
            if (r14 != r15) goto L_0x0065
            r13 = r6
            goto L_0x006a
        L_0x0065:
            m1.x r15 = m1.x.CANCELLED
            if (r14 != r15) goto L_0x006a
            r12 = r6
        L_0x006a:
            int r10 = r10 + 1
            goto L_0x0027
        L_0x006d:
            r11 = r6
            r12 = r7
            r13 = r12
        L_0x0070:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0156
            if (r8 != 0) goto L_0x0156
            r1.v r10 = r5.H()
            java.util.List r10 = r10.h(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0156
            m1.f r14 = m1.f.APPEND
            if (r2 == r14) goto L_0x008f
            m1.f r14 = m1.f.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x0092
        L_0x008f:
            r14 = r18
            goto L_0x00d4
        L_0x0092:
            m1.f r14 = m1.f.KEEP
            if (r2 != r14) goto L_0x00b1
            java.util.Iterator r2 = r10.iterator()
        L_0x009a:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00b1
            java.lang.Object r14 = r2.next()
            r1.u$b r14 = (r1.u.b) r14
            m1.x r14 = r14.f15501b
            m1.x r15 = m1.x.ENQUEUED
            if (r14 == r15) goto L_0x00b0
            m1.x r15 = m1.x.RUNNING
            if (r14 != r15) goto L_0x009a
        L_0x00b0:
            return r7
        L_0x00b1:
            r14 = r18
            s1.b r2 = s1.b.c(r1, r14, r7)
            r2.run()
            r1.v r2 = r5.H()
            java.util.Iterator r10 = r10.iterator()
        L_0x00c2:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x0159
            java.lang.Object r15 = r10.next()
            r1.u$b r15 = (r1.u.b) r15
            java.lang.String r15 = r15.f15500a
            r2.a(r15)
            goto L_0x00c2
        L_0x00d4:
            r1.b r8 = r5.C()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e1:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x011c
            java.lang.Object r16 = r10.next()
            r6 = r16
            r1.u$b r6 = (r1.u.b) r6
            java.lang.String r7 = r6.f15500a
            boolean r7 = r8.c(r7)
            if (r7 != 0) goto L_0x0115
            m1.x r7 = r6.f15501b
            r17 = r8
            m1.x r8 = m1.x.SUCCEEDED
            if (r7 != r8) goto L_0x0101
            r8 = 1
            goto L_0x0102
        L_0x0101:
            r8 = 0
        L_0x0102:
            r8 = r8 & r11
            m1.x r11 = m1.x.FAILED
            if (r7 != r11) goto L_0x0109
            r13 = 1
            goto L_0x010e
        L_0x0109:
            m1.x r11 = m1.x.CANCELLED
            if (r7 != r11) goto L_0x010e
            r12 = 1
        L_0x010e:
            java.lang.String r6 = r6.f15500a
            r15.add(r6)
            r11 = r8
            goto L_0x0117
        L_0x0115:
            r17 = r8
        L_0x0117:
            r8 = r17
            r6 = 1
            r7 = 0
            goto L_0x00e1
        L_0x011c:
            m1.f r6 = m1.f.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0148
            if (r12 != 0) goto L_0x0124
            if (r13 == 0) goto L_0x0148
        L_0x0124:
            r1.v r2 = r5.H()
            java.util.List r6 = r2.h(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0130:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0142
            java.lang.Object r7 = r6.next()
            r1.u$b r7 = (r1.u.b) r7
            java.lang.String r7 = r7.f15500a
            r2.a(r7)
            goto L_0x0130
        L_0x0142:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0148:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0153
            r8 = 1
            goto L_0x0154
        L_0x0153:
            r8 = 0
        L_0x0154:
            r6 = 0
            goto L_0x0159
        L_0x0156:
            r14 = r18
            goto L_0x0154
        L_0x0159:
            java.util.Iterator r2 = r19.iterator()
        L_0x015d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e6
            java.lang.Object r7 = r2.next()
            m1.z r7 = (m1.z) r7
            r1.u r10 = r7.d()
            if (r8 == 0) goto L_0x0180
            if (r11 != 0) goto L_0x0180
            if (r13 == 0) goto L_0x0178
            m1.x r15 = m1.x.FAILED
        L_0x0175:
            r10.f15478b = r15
            goto L_0x0182
        L_0x0178:
            if (r12 == 0) goto L_0x017d
            m1.x r15 = m1.x.CANCELLED
            goto L_0x0175
        L_0x017d:
            m1.x r15 = m1.x.BLOCKED
            goto L_0x0175
        L_0x0180:
            r10.f15490n = r3
        L_0x0182:
            m1.x r15 = r10.f15478b
            r19 = r2
            m1.x r2 = m1.x.ENQUEUED
            if (r15 != r2) goto L_0x018b
            r6 = 1
        L_0x018b:
            r1.v r2 = r5.H()
            java.util.List r15 = r18.l()
            r1.u r10 = s1.d.c(r15, r10)
            r2.u(r10)
            if (r8 == 0) goto L_0x01bd
            int r2 = r0.length
            r10 = 0
        L_0x019e:
            if (r10 >= r2) goto L_0x01bd
            r15 = r0[r10]
            r17 = r0
            r1.a r0 = new r1.a
            r20 = r2
            java.lang.String r2 = r7.b()
            r0.<init>(r2, r15)
            r1.b r2 = r5.C()
            r2.b(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x019e
        L_0x01bd:
            r17 = r0
            r1.z r0 = r5.I()
            java.lang.String r2 = r7.b()
            java.util.Set r10 = r7.c()
            r0.b(r2, r10)
            if (r9 == 0) goto L_0x01e0
            r1.o r0 = r5.F()
            r1.n r2 = new r1.n
            java.lang.String r7 = r7.b()
            r2.<init>(r1, r7)
            r0.a(r2)
        L_0x01e0:
            r2 = r19
            r0 = r17
            goto L_0x015d
        L_0x01e6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.c.c(androidx.work.impl.p0, java.util.List, java.lang.String[], java.lang.String, m1.f):boolean");
    }

    private static boolean e(c0 c0Var) {
        List<c0> e10 = c0Var.e();
        boolean z10 = false;
        if (e10 != null) {
            for (c0 c0Var2 : e10) {
                if (!c0Var2.j()) {
                    z10 |= e(c0Var2);
                } else {
                    m e11 = m.e();
                    String str = f15832g;
                    e11.k(str, "Already enqueued work ids (" + TextUtils.join(", ", c0Var2.c()) + ")");
                }
            }
        }
        return b(c0Var) | z10;
    }

    public boolean a() {
        p0 g10 = this.f15833e.g();
        WorkDatabase n10 = g10.n();
        n10.e();
        try {
            d.a(n10, g10.g(), this.f15833e);
            boolean e10 = e(this.f15833e);
            n10.A();
            return e10;
        } finally {
            n10.i();
        }
    }

    public m1.q d() {
        return this.f15834f;
    }

    public void f() {
        p0 g10 = this.f15833e.g();
        z.h(g10.g(), g10.n(), g10.l());
    }

    public void run() {
        try {
            if (!this.f15833e.h()) {
                if (a()) {
                    p.c(this.f15833e.g().f(), RescheduleReceiver.class, true);
                    f();
                }
                this.f15834f.a(m1.q.f13707a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f15833e + ")");
        } catch (Throwable th2) {
            this.f15834f.a(new q.b.a(th2));
        }
    }

    public c(c0 c0Var, androidx.work.impl.q qVar) {
        this.f15833e = c0Var;
        this.f15834f = qVar;
    }
}
