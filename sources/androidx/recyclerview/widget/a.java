package androidx.recyclerview.widget;

import androidx.core.util.d;
import androidx.core.util.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

final class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private d f3761a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList f3762b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f3763c;

    /* renamed from: d  reason: collision with root package name */
    final C0064a f3764d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f3765e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f3766f;

    /* renamed from: g  reason: collision with root package name */
    final h f3767g;

    /* renamed from: h  reason: collision with root package name */
    private int f3768h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    interface C0064a {
        void a(int i10, int i11);

        void b(b bVar);

        RecyclerView.d0 c(int i10);

        void d(int i10, int i11);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(b bVar);

        void h(int i10, int i11, Object obj);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f3769a;

        /* renamed from: b  reason: collision with root package name */
        int f3770b;

        /* renamed from: c  reason: collision with root package name */
        Object f3771c;

        /* renamed from: d  reason: collision with root package name */
        int f3772d;

        b(int i10, int i11, int i12, Object obj) {
            this.f3769a = i10;
            this.f3770b = i11;
            this.f3772d = i12;
            this.f3771c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i10 = this.f3769a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3769a;
            if (i10 != bVar.f3769a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3772d - this.f3770b) == 1 && this.f3772d == bVar.f3770b && this.f3770b == bVar.f3772d) {
                return true;
            }
            if (this.f3772d != bVar.f3772d || this.f3770b != bVar.f3770b) {
                return false;
            }
            Object obj2 = this.f3771c;
            Object obj3 = bVar.f3771c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3769a * 31) + this.f3770b) * 31) + this.f3772d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3770b + "c:" + this.f3772d + ",p:" + this.f3771c + "]";
        }
    }

    a(C0064a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        t(bVar);
    }

    private void d(b bVar) {
        t(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z10;
        boolean z11;
        int i10 = bVar.f3770b;
        int i11 = bVar.f3772d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3764d.c(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    t(b(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f3772d) {
            a(bVar);
            bVar = b(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f3770b;
        int i11 = bVar.f3772d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f3764d.c(i10) != null || h(i10)) {
                if (!z10) {
                    k(b(4, i13, i12, bVar.f3771c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    t(b(4, i13, i12, bVar.f3771c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f3772d) {
            Object obj = bVar.f3771c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (!z10) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f3763c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3763c.get(i11);
            int i12 = bVar.f3769a;
            if (i12 == 8) {
                if (n(bVar.f3772d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3770b;
                int i14 = bVar.f3772d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f3769a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int x10 = x(bVar.f3770b, i11);
        int i12 = bVar.f3770b;
        int i13 = bVar.f3769a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3772d; i15++) {
            int x11 = x(bVar.f3770b + (i10 * i15), bVar.f3769a);
            int i16 = bVar.f3769a;
            if (i16 == 2 ? x11 != x10 : !(i16 == 4 && x11 == x10 + 1)) {
                b b10 = b(i16, x10, i14, bVar.f3771c);
                l(b10, i12);
                a(b10);
                if (bVar.f3769a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                x10 = x11;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f3771c;
        a(bVar);
        if (i14 > 0) {
            b b11 = b(bVar.f3769a, x10, i14, obj);
            l(b11, i12);
            a(b11);
        }
    }

    private void t(b bVar) {
        this.f3763c.add(bVar);
        int i10 = bVar.f3769a;
        if (i10 == 1) {
            this.f3764d.e(bVar.f3770b, bVar.f3772d);
        } else if (i10 == 2) {
            this.f3764d.d(bVar.f3770b, bVar.f3772d);
        } else if (i10 == 4) {
            this.f3764d.h(bVar.f3770b, bVar.f3772d, bVar.f3771c);
        } else if (i10 == 8) {
            this.f3764d.a(bVar.f3770b, bVar.f3772d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f3763c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f3763c.get(size);
            int i18 = bVar.f3769a;
            if (i18 == 8) {
                int i19 = bVar.f3770b;
                int i20 = bVar.f3772d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f3770b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f3770b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f3772d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f3772d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f3770b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f3770b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f3770b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f3772d;
                } else if (i18 == 2) {
                    i10 += bVar.f3772d;
                }
            }
        }
        for (int size2 = this.f3763c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f3763c.get(size2);
            if (bVar2.f3769a == 8) {
                int i22 = bVar2.f3772d;
                if (i22 != bVar2.f3770b && i22 >= 0) {
                }
            } else if (bVar2.f3772d > 0) {
            }
            this.f3763c.remove(size2);
            a(bVar2);
        }
        return i10;
    }

    public void a(b bVar) {
        if (!this.f3766f) {
            bVar.f3771c = null;
            this.f3761a.a(bVar);
        }
    }

    public b b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f3761a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f3769a = i10;
        bVar.f3770b = i11;
        bVar.f3772d = i12;
        bVar.f3771c = obj;
        return bVar;
    }

    public int e(int i10) {
        int size = this.f3762b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3762b.get(i11);
            int i12 = bVar.f3769a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3770b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3772d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3770b;
                    if (i15 == i10) {
                        i10 = bVar.f3772d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3772d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3770b <= i10) {
                i10 += bVar.f3772d;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f3763c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3764d.b((b) this.f3763c.get(i10));
        }
        v(this.f3763c);
        this.f3768h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f3762b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3762b.get(i10);
            int i11 = bVar.f3769a;
            if (i11 == 1) {
                this.f3764d.b(bVar);
                this.f3764d.e(bVar.f3770b, bVar.f3772d);
            } else if (i11 == 2) {
                this.f3764d.b(bVar);
                this.f3764d.f(bVar.f3770b, bVar.f3772d);
            } else if (i11 == 4) {
                this.f3764d.b(bVar);
                this.f3764d.h(bVar.f3770b, bVar.f3772d, bVar.f3771c);
            } else if (i11 == 8) {
                this.f3764d.b(bVar);
                this.f3764d.a(bVar.f3770b, bVar.f3772d);
            }
            Runnable runnable = this.f3765e;
            if (runnable != null) {
                runnable.run();
            }
        }
        v(this.f3762b);
        this.f3768h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i10) {
        this.f3764d.g(bVar);
        int i11 = bVar.f3769a;
        if (i11 == 2) {
            this.f3764d.f(i10, bVar.f3772d);
        } else if (i11 == 4) {
            this.f3764d.h(i10, bVar.f3772d, bVar.f3771c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i10, int i11) {
        int size = this.f3763c.size();
        while (i11 < size) {
            b bVar = (b) this.f3763c.get(i11);
            int i12 = bVar.f3769a;
            if (i12 == 8) {
                int i13 = bVar.f3770b;
                if (i13 == i10) {
                    i10 = bVar.f3772d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3772d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3770b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3772d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3772d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f3768h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f3762b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.f3763c.isEmpty() && !this.f3762b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3762b.add(b(4, i10, i11, obj));
        this.f3768h |= 4;
        return this.f3762b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3762b.add(b(2, i10, i11, (Object) null));
        this.f3768h |= 2;
        return this.f3762b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.f3767g.b(this.f3762b);
        int size = this.f3762b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3762b.get(i10);
            int i11 = bVar.f3769a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3765e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3762b.clear();
    }

    /* access modifiers changed from: package-private */
    public void v(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((b) list.get(i10));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void w() {
        v(this.f3762b);
        v(this.f3763c);
        this.f3768h = 0;
    }

    a(C0064a aVar, boolean z10) {
        this.f3761a = new e(30);
        this.f3762b = new ArrayList();
        this.f3763c = new ArrayList();
        this.f3768h = 0;
        this.f3764d = aVar;
        this.f3766f = z10;
        this.f3767g = new h(this);
    }
}
