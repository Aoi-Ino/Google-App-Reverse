package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

class h {

    /* renamed from: a  reason: collision with root package name */
    final a f3892a;

    interface a {
        void a(a.b bVar);

        a.b b(int i10, int i11, int i12, Object obj);
    }

    h(a aVar) {
        this.f3892a = aVar;
    }

    private int a(List list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f3769a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f3772d;
        int i13 = bVar2.f3770b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f3770b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f3770b = i15 + bVar2.f3772d;
        }
        int i16 = bVar2.f3770b;
        if (i16 <= i12) {
            bVar.f3772d = i12 + bVar2.f3772d;
        }
        bVar2.f3770b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List list, int i10, int i11) {
        a.b bVar = (a.b) list.get(i10);
        a.b bVar2 = (a.b) list.get(i11);
        int i12 = bVar2.f3769a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else if (i12 == 4) {
            f(list, i10, bVar, i11, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(List list) {
        while (true) {
            int a10 = a(list);
            if (a10 != -1) {
                d(list, a10, a10 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r0 > r14.f3770b) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cd, code lost:
        if (r0 >= r14.f3770b) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.util.List r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
            r9 = this;
            int r0 = r12.f3770b
            int r1 = r12.f3772d
            r2 = 1
            r3 = 0
            int r4 = r14.f3770b
            if (r0 >= r1) goto L_0x0017
            if (r4 != r0) goto L_0x0015
            int r4 = r14.f3772d
            int r0 = r1 - r0
            if (r4 != r0) goto L_0x0015
            r0 = r3
            r3 = r2
            goto L_0x0024
        L_0x0015:
            r0 = r3
            goto L_0x0024
        L_0x0017:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0023
            int r4 = r14.f3772d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0023
            r0 = r2
            r3 = r0
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            int r4 = r14.f3770b
            r5 = 2
            if (r1 >= r4) goto L_0x002d
            int r4 = r4 - r2
            r14.f3770b = r4
            goto L_0x0046
        L_0x002d:
            int r6 = r14.f3772d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0046
            int r6 = r6 - r2
            r14.f3772d = r6
            r12.f3769a = r5
            r12.f3772d = r2
            int r11 = r14.f3772d
            if (r11 != 0) goto L_0x0045
            r10.remove(r13)
            androidx.recyclerview.widget.h$a r10 = r9.f3892a
            r10.a(r14)
        L_0x0045:
            return
        L_0x0046:
            int r1 = r12.f3770b
            int r4 = r14.f3770b
            r6 = 0
            if (r1 > r4) goto L_0x0051
            int r4 = r4 + r2
            r14.f3770b = r4
            goto L_0x0067
        L_0x0051:
            int r7 = r14.f3772d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0067
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.h$a r7 = r9.f3892a
            int r1 = r1 + r2
            androidx.recyclerview.widget.a$b r6 = r7.b(r5, r1, r4, r6)
            int r1 = r12.f3770b
            int r2 = r14.f3770b
            int r1 = r1 - r2
            r14.f3772d = r1
        L_0x0067:
            if (r3 == 0) goto L_0x0075
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.h$a r10 = r9.f3892a
            r10.a(r12)
            return
        L_0x0075:
            if (r0 == 0) goto L_0x00a6
            if (r6 == 0) goto L_0x008f
            int r0 = r12.f3770b
            int r1 = r6.f3770b
            if (r0 <= r1) goto L_0x0084
            int r1 = r6.f3772d
            int r0 = r0 - r1
            r12.f3770b = r0
        L_0x0084:
            int r0 = r12.f3772d
            int r1 = r6.f3770b
            if (r0 <= r1) goto L_0x008f
            int r1 = r6.f3772d
            int r0 = r0 - r1
            r12.f3772d = r0
        L_0x008f:
            int r0 = r12.f3770b
            int r1 = r14.f3770b
            if (r0 <= r1) goto L_0x009a
            int r1 = r14.f3772d
            int r0 = r0 - r1
            r12.f3770b = r0
        L_0x009a:
            int r0 = r12.f3772d
            int r1 = r14.f3770b
            if (r0 <= r1) goto L_0x00d0
        L_0x00a0:
            int r1 = r14.f3772d
            int r0 = r0 - r1
            r12.f3772d = r0
            goto L_0x00d0
        L_0x00a6:
            if (r6 == 0) goto L_0x00be
            int r0 = r12.f3770b
            int r1 = r6.f3770b
            if (r0 < r1) goto L_0x00b3
            int r1 = r6.f3772d
            int r0 = r0 - r1
            r12.f3770b = r0
        L_0x00b3:
            int r0 = r12.f3772d
            int r1 = r6.f3770b
            if (r0 < r1) goto L_0x00be
            int r1 = r6.f3772d
            int r0 = r0 - r1
            r12.f3772d = r0
        L_0x00be:
            int r0 = r12.f3770b
            int r1 = r14.f3770b
            if (r0 < r1) goto L_0x00c9
            int r1 = r14.f3772d
            int r0 = r0 - r1
            r12.f3770b = r0
        L_0x00c9:
            int r0 = r12.f3772d
            int r1 = r14.f3770b
            if (r0 < r1) goto L_0x00d0
            goto L_0x00a0
        L_0x00d0:
            r10.set(r11, r14)
            int r14 = r12.f3770b
            int r0 = r12.f3772d
            if (r14 == r0) goto L_0x00dd
            r10.set(r13, r12)
            goto L_0x00e0
        L_0x00dd:
            r10.remove(r13)
        L_0x00e0:
            if (r6 == 0) goto L_0x00e5
            r10.add(r11, r6)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f3772d
            int r1 = r13.f3770b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f3770b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f3772d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f3772d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f3892a
            int r1 = r11.f3770b
            java.lang.Object r5 = r13.f3771c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f3770b
            int r5 = r13.f3770b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f3770b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f3772d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f3892a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f3771c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f3772d
            int r1 = r1 - r5
            r13.f3772d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f3772d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f3892a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
