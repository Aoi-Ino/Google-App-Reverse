package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class b {

    /* renamed from: a  reason: collision with root package name */
    final C0065b f3773a;

    /* renamed from: b  reason: collision with root package name */
    final a f3774b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List f3775c = new ArrayList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f3776a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f3777b;

        a() {
        }

        private void c() {
            if (this.f3777b == null) {
                this.f3777b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f3777b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f3776a &= ~(1 << i10);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            a aVar = this.f3777b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f3776a) : Long.bitCount(this.f3776a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f3776a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3776a);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3776a & (1 << i10)) != 0;
            }
            c();
            return this.f3777b.d(i10 - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3777b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3776a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3776a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3777b != null) {
                c();
                this.f3777b.e(0, z11);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3777b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3776a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3776a = j12;
            long j13 = j10 - 1;
            this.f3776a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3777b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3777b.f(0);
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f3776a = 0;
            a aVar = this.f3777b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f3777b.h(i10 - 64);
                return;
            }
            this.f3776a |= 1 << i10;
        }

        public String toString() {
            if (this.f3777b == null) {
                return Long.toBinaryString(this.f3776a);
            }
            return this.f3777b.toString() + "xx" + Long.toBinaryString(this.f3776a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    interface C0065b {
        View a(int i10);

        void b(View view);

        RecyclerView.d0 c(View view);

        void d(int i10);

        void e(View view);

        void f(View view, int i10);

        int g();

        void h(int i10);

        void i();

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    b(C0065b bVar) {
        this.f3773a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int g10 = this.f3773a.g();
        int i11 = i10;
        while (i11 < g10) {
            int b10 = i10 - (i11 - this.f3774b.b(i11));
            if (b10 == 0) {
                while (this.f3774b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f3775c.add(view);
        this.f3773a.b(view);
    }

    private boolean t(View view) {
        if (!this.f3775c.remove(view)) {
            return false;
        }
        this.f3773a.e(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i10, boolean z10) {
        int g10 = i10 < 0 ? this.f3773a.g() : h(i10);
        this.f3774b.e(g10, z10);
        if (z10) {
            l(view);
        }
        this.f3773a.f(view, g10);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int g10 = i10 < 0 ? this.f3773a.g() : h(i10);
        this.f3774b.e(g10, z10);
        if (z10) {
            l(view);
        }
        this.f3773a.j(view, g10, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        int h10 = h(i10);
        this.f3774b.f(h10);
        this.f3773a.d(h10);
    }

    /* access modifiers changed from: package-private */
    public View e(int i10) {
        int size = this.f3775c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f3775c.get(i11);
            RecyclerView.d0 c10 = this.f3773a.c(view);
            if (c10.o() == i10 && !c10.v() && !c10.x()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f3773a.a(h(i10));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f3773a.g() - this.f3775c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i10) {
        return this.f3773a.a(i10);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f3773a.g();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int k10 = this.f3773a.k(view);
        if (k10 >= 0) {
            this.f3774b.h(k10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int k10 = this.f3773a.k(view);
        if (k10 != -1 && !this.f3774b.d(k10)) {
            return k10 - this.f3774b.b(k10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f3775c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f3774b.g();
        for (int size = this.f3775c.size() - 1; size >= 0; size--) {
            this.f3773a.e((View) this.f3775c.get(size));
            this.f3775c.remove(size);
        }
        this.f3773a.i();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int k10 = this.f3773a.k(view);
        if (k10 >= 0) {
            if (this.f3774b.f(k10)) {
                t(view);
            }
            this.f3773a.h(k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f3773a.a(h10);
        if (a10 != null) {
            if (this.f3774b.f(h10)) {
                t(a10);
            }
            this.f3773a.h(h10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int k10 = this.f3773a.k(view);
        if (k10 == -1) {
            t(view);
            return true;
        } else if (!this.f3774b.d(k10)) {
            return false;
        } else {
            this.f3774b.f(k10);
            t(view);
            this.f3773a.h(k10);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int k10 = this.f3773a.k(view);
        if (k10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3774b.d(k10)) {
            this.f3774b.a(k10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3774b.toString() + ", hidden list:" + this.f3775c.size();
    }
}
