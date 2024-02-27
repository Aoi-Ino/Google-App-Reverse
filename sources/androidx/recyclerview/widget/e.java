package androidx.recyclerview.widget;

import androidx.core.os.l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class e implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    static final ThreadLocal f3860i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    static Comparator f3861j = new a();

    /* renamed from: e  reason: collision with root package name */
    ArrayList f3862e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    long f3863f;

    /* renamed from: g  reason: collision with root package name */
    long f3864g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f3865h = new ArrayList();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3873d;
            if ((recyclerView == null) != (cVar2.f3873d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3870a;
            if (z10 != cVar2.f3870a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f3871b - cVar.f3871b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3872c - cVar2.f3872c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        /* renamed from: a  reason: collision with root package name */
        int f3866a;

        /* renamed from: b  reason: collision with root package name */
        int f3867b;

        /* renamed from: c  reason: collision with root package name */
        int[] f3868c;

        /* renamed from: d  reason: collision with root package name */
        int f3869d;

        b() {
        }

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f3869d;
                int i13 = i12 * 2;
                int[] iArr = this.f3868c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3868c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 4)];
                    this.f3868c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3868c;
                iArr4[i13] = i10;
                iArr4[i13 + 1] = i11;
                this.f3869d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f3868c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3869d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z10) {
            this.f3869d = 0;
            int[] iArr = this.f3868c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f3574q;
            if (recyclerView.f3572p != null && pVar != null && pVar.A0()) {
                if (z10) {
                    if (!recyclerView.f3556h.p()) {
                        pVar.u(recyclerView.f3572p.e(), this);
                    }
                } else if (!recyclerView.m0()) {
                    pVar.t(this.f3866a, this.f3867b, recyclerView.f3565l0, this);
                }
                int i10 = this.f3869d;
                if (i10 > pVar.f3674m) {
                    pVar.f3674m = i10;
                    pVar.f3675n = z10;
                    recyclerView.f3552f.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (this.f3868c != null) {
                int i11 = this.f3869d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3868c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11) {
            this.f3866a = i10;
            this.f3867b = i11;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3870a;

        /* renamed from: b  reason: collision with root package name */
        public int f3871b;

        /* renamed from: c  reason: collision with root package name */
        public int f3872c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f3873d;

        /* renamed from: e  reason: collision with root package name */
        public int f3874e;

        c() {
        }

        public void a() {
            this.f3870a = false;
            this.f3871b = 0;
            this.f3872c = 0;
            this.f3873d = null;
            this.f3874e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f3862e.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f3862e.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3563k0.c(recyclerView, false);
                i10 += recyclerView.f3563k0.f3869d;
            }
        }
        this.f3865h.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3862e.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f3563k0;
                int abs = Math.abs(bVar.f3866a) + Math.abs(bVar.f3867b);
                for (int i14 = 0; i14 < bVar.f3869d * 2; i14 += 2) {
                    if (i12 >= this.f3865h.size()) {
                        cVar = new c();
                        this.f3865h.add(cVar);
                    } else {
                        cVar = (c) this.f3865h.get(i12);
                    }
                    int[] iArr = bVar.f3868c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3870a = i15 <= abs;
                    cVar.f3871b = abs;
                    cVar.f3872c = i15;
                    cVar.f3873d = recyclerView2;
                    cVar.f3874e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3865h, f3861j);
    }

    private void c(c cVar, long j10) {
        RecyclerView.d0 i10 = i(cVar.f3873d, cVar.f3874e, cVar.f3870a ? Long.MAX_VALUE : j10);
        if (i10 != null && i10.f3623f != null && i10.u() && !i10.v()) {
            h((RecyclerView) i10.f3623f.get(), j10);
        }
    }

    private void d(long j10) {
        int i10 = 0;
        while (i10 < this.f3865h.size()) {
            c cVar = (c) this.f3865h.get(i10);
            if (cVar.f3873d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.f3558i.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.d0 f02 = RecyclerView.f0(recyclerView.f3558i.i(i11));
            if (f02.f3624g == i10 && !f02.v()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView != null) {
            if (recyclerView.H && recyclerView.f3558i.j() != 0) {
                recyclerView.W0();
            }
            b bVar = recyclerView.f3563k0;
            bVar.c(recyclerView, true);
            if (bVar.f3869d != 0) {
                try {
                    l.a("RV Nested Prefetch");
                    recyclerView.f3565l0.f(recyclerView.f3572p);
                    for (int i10 = 0; i10 < bVar.f3869d * 2; i10 += 2) {
                        i(recyclerView, bVar.f3868c[i10], j10);
                    }
                } finally {
                    l.b();
                }
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f3552f;
        try {
            recyclerView.I0();
            RecyclerView.d0 I = vVar.I(i10, false, j10);
            if (I != null) {
                if (!I.u() || I.v()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.f3622e);
                }
            }
            return I;
        } finally {
            recyclerView.K0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f3862e.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f3863f == 0) {
            this.f3863f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3563k0.e(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f3862e.remove(recyclerView);
    }

    public void run() {
        try {
            l.a("RV Prefetch");
            if (!this.f3862e.isEmpty()) {
                int size = this.f3862e.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3862e.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3864g);
                    this.f3863f = 0;
                    l.b();
                }
            }
        } finally {
            this.f3863f = 0;
            l.b();
        }
    }
}
