package androidx.recyclerview.widget;

import android.view.View;

class o {

    /* renamed from: a  reason: collision with root package name */
    final b f3909a;

    /* renamed from: b  reason: collision with root package name */
    a f3910b = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3911a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f3912b;

        /* renamed from: c  reason: collision with root package name */
        int f3913c;

        /* renamed from: d  reason: collision with root package name */
        int f3914d;

        /* renamed from: e  reason: collision with root package name */
        int f3915e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f3911a = i10 | this.f3911a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = this.f3911a;
            if ((i10 & 7) != 0 && (i10 & c(this.f3914d, this.f3912b)) == 0) {
                return false;
            }
            int i11 = this.f3911a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3914d, this.f3913c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3911a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3915e, this.f3912b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3911a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3915e, this.f3913c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f3911a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11, int i12, int i13) {
            this.f3912b = i10;
            this.f3913c = i11;
            this.f3914d = i12;
            this.f3915e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    o(b bVar) {
        this.f3909a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int d10 = this.f3909a.d();
        int b10 = this.f3909a.b();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f3909a.a(i10);
            this.f3910b.e(d10, b10, this.f3909a.c(a10), this.f3909a.e(a10));
            if (i12 != 0) {
                this.f3910b.d();
                this.f3910b.a(i12);
                if (this.f3910b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f3910b.d();
                this.f3910b.a(i13);
                if (this.f3910b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f3910b.e(this.f3909a.d(), this.f3909a.b(), this.f3909a.c(view), this.f3909a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f3910b.d();
        this.f3910b.a(i10);
        return this.f3910b.b();
    }
}
