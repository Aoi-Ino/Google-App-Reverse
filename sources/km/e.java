package km;

import bm.p;
import cm.l;
import hm.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jm.g;

final class e implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f24748a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f24749b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f24750c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p f24751d;

    public static final class a implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private int f24752e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f24753f;

        /* renamed from: g  reason: collision with root package name */
        private int f24754g;

        /* renamed from: h  reason: collision with root package name */
        private c f24755h;

        /* renamed from: i  reason: collision with root package name */
        private int f24756i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f24757j;

        a(e eVar) {
            this.f24757j = eVar;
            int f10 = f.f(eVar.f24749b, 0, eVar.f24748a.length());
            this.f24753f = f10;
            this.f24754g = f10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < km.e.d(r6.f24757j)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f24754g
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f24752e = r1
                r0 = 0
                r6.f24755h = r0
                goto L_0x0099
            L_0x000c:
                km.e r0 = r6.f24757j
                int r0 = r0.f24750c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f24756i
                int r0 = r0 + r3
                r6.f24756i = r0
                km.e r4 = r6.f24757j
                int r4 = r4.f24750c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f24754g
                km.e r4 = r6.f24757j
                java.lang.CharSequence r4 = r4.f24748a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                hm.c r0 = new hm.c
                int r1 = r6.f24753f
                km.e r4 = r6.f24757j
                java.lang.CharSequence r4 = r4.f24748a
                int r4 = km.q.K(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f24755h = r0
            L_0x0044:
                r6.f24754g = r2
                goto L_0x0097
            L_0x0047:
                km.e r0 = r6.f24757j
                bm.p r0 = r0.f24751d
                km.e r4 = r6.f24757j
                java.lang.CharSequence r4 = r4.f24748a
                int r5 = r6.f24754g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.h(r4, r5)
                pl.o r0 = (pl.o) r0
                if (r0 != 0) goto L_0x0073
                hm.c r0 = new hm.c
                int r1 = r6.f24753f
                km.e r4 = r6.f24757j
                java.lang.CharSequence r4 = r4.f24748a
                int r4 = km.q.K(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f24753f
                hm.c r4 = hm.f.i(r4, r2)
                r6.f24755h = r4
                int r2 = r2 + r0
                r6.f24753f = r2
                if (r0 != 0) goto L_0x0095
                r1 = r3
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f24752e = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: km.e.a.a():void");
        }

        /* renamed from: b */
        public c next() {
            if (this.f24752e == -1) {
                a();
            }
            if (this.f24752e != 0) {
                c cVar = this.f24755h;
                l.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f24755h = null;
                this.f24752e = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f24752e == -1) {
                a();
            }
            return this.f24752e == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i10, int i11, p pVar) {
        l.f(charSequence, "input");
        l.f(pVar, "getNextMatch");
        this.f24748a = charSequence;
        this.f24749b = i10;
        this.f24750c = i11;
        this.f24751d = pVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
