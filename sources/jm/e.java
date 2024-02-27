package jm;

import bm.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f24635a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24636b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f24637c;

    public static final class a implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator f24638e;

        /* renamed from: f  reason: collision with root package name */
        private int f24639f = -1;

        /* renamed from: g  reason: collision with root package name */
        private Object f24640g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f24641h;

        a(e eVar) {
            this.f24641h = eVar;
            this.f24638e = eVar.f24635a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator r0 = r3.f24638e
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x002c
                java.util.Iterator r0 = r3.f24638e
                java.lang.Object r0 = r0.next()
                jm.e r1 = r3.f24641h
                bm.l r1 = r1.f24637c
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                jm.e r2 = r3.f24641h
                boolean r2 = r2.f24636b
                if (r1 != r2) goto L_0x0000
                r3.f24640g = r0
                r0 = 1
            L_0x0029:
                r3.f24639f = r0
                return
            L_0x002c:
                r0 = 0
                goto L_0x0029
            */
            throw new UnsupportedOperationException("Method not decompiled: jm.e.a.a():void");
        }

        public boolean hasNext() {
            if (this.f24639f == -1) {
                a();
            }
            return this.f24639f == 1;
        }

        public Object next() {
            if (this.f24639f == -1) {
                a();
            }
            if (this.f24639f != 0) {
                Object obj = this.f24640g;
                this.f24640g = null;
                this.f24639f = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar, boolean z10, l lVar) {
        cm.l.f(gVar, "sequence");
        cm.l.f(lVar, "predicate");
        this.f24635a = gVar;
        this.f24636b = z10;
        this.f24637c = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
