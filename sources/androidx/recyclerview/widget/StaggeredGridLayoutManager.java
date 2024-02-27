package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();

    /* renamed from: s  reason: collision with root package name */
    private int f3721s = -1;

    /* renamed from: t  reason: collision with root package name */
    f[] f3722t;

    /* renamed from: u  reason: collision with root package name */
    i f3723u;

    /* renamed from: v  reason: collision with root package name */
    i f3724v;

    /* renamed from: w  reason: collision with root package name */
    private int f3725w;

    /* renamed from: x  reason: collision with root package name */
    private int f3726x;

    /* renamed from: y  reason: collision with root package name */
    private final f f3727y;

    /* renamed from: z  reason: collision with root package name */
    boolean f3728z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.Y1();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f3730a;

        /* renamed from: b  reason: collision with root package name */
        int f3731b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3732c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3733d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3734e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3735f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3731b = this.f3732c ? StaggeredGridLayoutManager.this.f3723u.i() : StaggeredGridLayoutManager.this.f3723u.n();
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            this.f3731b = this.f3732c ? StaggeredGridLayoutManager.this.f3723u.i() - i10 : StaggeredGridLayoutManager.this.f3723u.n() + i10;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f3730a = -1;
            this.f3731b = Integer.MIN_VALUE;
            this.f3732c = false;
            this.f3733d = false;
            this.f3734e = false;
            int[] iArr = this.f3735f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3735f;
            if (iArr == null || iArr.length < length) {
                this.f3735f = new int[StaggeredGridLayoutManager.this.f3722t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3735f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        f f3737e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3738f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public boolean e() {
            return this.f3738f;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f3739a;

        /* renamed from: b  reason: collision with root package name */
        List f3740b;

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0063a();

            /* renamed from: e  reason: collision with root package name */
            int f3741e;

            /* renamed from: f  reason: collision with root package name */
            int f3742f;

            /* renamed from: g  reason: collision with root package name */
            int[] f3743g;

            /* renamed from: h  reason: collision with root package name */
            boolean f3744h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            class C0063a implements Parcelable.Creator {
                C0063a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f3741e = parcel.readInt();
                this.f3742f = parcel.readInt();
                this.f3744h = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3743g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int c(int i10) {
                int[] iArr = this.f3743g;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3741e + ", mGapDir=" + this.f3742f + ", mHasUnwantedGapAfter=" + this.f3744h + ", mGapPerSpan=" + Arrays.toString(this.f3743g) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3741e);
                parcel.writeInt(this.f3742f);
                parcel.writeInt(this.f3744h ? 1 : 0);
                int[] iArr = this.f3743g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3743g);
            }
        }

        d() {
        }

        private int i(int i10) {
            if (this.f3740b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f3740b.remove(f10);
            }
            int size = this.f3740b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (((a) this.f3740b.get(i11)).f3741e >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f3740b.remove(i11);
            return ((a) this.f3740b.get(i11)).f3741e;
        }

        private void l(int i10, int i11) {
            List list = this.f3740b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f3740b.get(size);
                    int i12 = aVar.f3741e;
                    if (i12 >= i10) {
                        aVar.f3741e = i12 + i11;
                    }
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f3740b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f3740b.get(size);
                    int i13 = aVar.f3741e;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f3740b.remove(size);
                        } else {
                            aVar.f3741e = i13 - i11;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f3740b == null) {
                this.f3740b = new ArrayList();
            }
            int size = this.f3740b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f3740b.get(i10);
                if (aVar2.f3741e == aVar.f3741e) {
                    this.f3740b.remove(i10);
                }
                if (aVar2.f3741e >= aVar.f3741e) {
                    this.f3740b.add(i10, aVar);
                    return;
                }
            }
            this.f3740b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f3739a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3740b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            int[] iArr = this.f3739a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f3739a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3739a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3739a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i10) {
            List list = this.f3740b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f3740b.get(size)).f3741e >= i10) {
                        this.f3740b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f3740b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f3740b.get(i13);
                int i14 = aVar.f3741e;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f3742f == i12 || (z10 && aVar.f3744h))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f3740b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3740b.get(size);
                if (aVar.f3741e == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i10) {
            int[] iArr = this.f3739a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* access modifiers changed from: package-private */
        public int h(int i10) {
            int[] iArr = this.f3739a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3739a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3739a.length;
            }
            int min = Math.min(i11 + 1, this.f3739a.length);
            Arrays.fill(this.f3739a, i10, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            int[] iArr = this.f3739a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f3739a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f3739a, i10, i12, -1);
                l(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i10, int i11) {
            int[] iArr = this.f3739a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f3739a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f3739a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i10, f fVar) {
            c(i10);
            this.f3739a[i10] = fVar.f3759e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i10) {
            int length = this.f3739a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        int f3745e;

        /* renamed from: f  reason: collision with root package name */
        int f3746f;

        /* renamed from: g  reason: collision with root package name */
        int f3747g;

        /* renamed from: h  reason: collision with root package name */
        int[] f3748h;

        /* renamed from: i  reason: collision with root package name */
        int f3749i;

        /* renamed from: j  reason: collision with root package name */
        int[] f3750j;

        /* renamed from: k  reason: collision with root package name */
        List f3751k;

        /* renamed from: l  reason: collision with root package name */
        boolean f3752l;

        /* renamed from: m  reason: collision with root package name */
        boolean f3753m;

        /* renamed from: n  reason: collision with root package name */
        boolean f3754n;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f3745e = parcel.readInt();
            this.f3746f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3747g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3748h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3749i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3750j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f3752l = parcel.readInt() == 1;
            this.f3753m = parcel.readInt() == 1;
            this.f3754n = parcel.readInt() == 1 ? true : z10;
            this.f3751k = parcel.readArrayList(d.a.class.getClassLoader());
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f3748h = null;
            this.f3747g = 0;
            this.f3745e = -1;
            this.f3746f = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f3748h = null;
            this.f3747g = 0;
            this.f3749i = 0;
            this.f3750j = null;
            this.f3751k = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3745e);
            parcel.writeInt(this.f3746f);
            parcel.writeInt(this.f3747g);
            if (this.f3747g > 0) {
                parcel.writeIntArray(this.f3748h);
            }
            parcel.writeInt(this.f3749i);
            if (this.f3749i > 0) {
                parcel.writeIntArray(this.f3750j);
            }
            parcel.writeInt(this.f3752l ? 1 : 0);
            parcel.writeInt(this.f3753m ? 1 : 0);
            parcel.writeInt(this.f3754n ? 1 : 0);
            parcel.writeList(this.f3751k);
        }

        public e(e eVar) {
            this.f3747g = eVar.f3747g;
            this.f3745e = eVar.f3745e;
            this.f3746f = eVar.f3746f;
            this.f3748h = eVar.f3748h;
            this.f3749i = eVar.f3749i;
            this.f3750j = eVar.f3750j;
            this.f3752l = eVar.f3752l;
            this.f3753m = eVar.f3753m;
            this.f3754n = eVar.f3754n;
            this.f3751k = eVar.f3751k;
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList f3755a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        int f3756b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f3757c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f3758d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f3759e;

        f(int i10) {
            this.f3759e = i10;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n10 = n(view);
            n10.f3737e = this;
            this.f3755a.add(view);
            this.f3757c = Integer.MIN_VALUE;
            if (this.f3755a.size() == 1) {
                this.f3756b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f3758d += StaggeredGridLayoutManager.this.f3723u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10, int i10) {
            int l10 = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l10 != Integer.MIN_VALUE) {
                if (z10 && l10 < StaggeredGridLayoutManager.this.f3723u.i()) {
                    return;
                }
                if (z10 || l10 <= StaggeredGridLayoutManager.this.f3723u.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        l10 += i10;
                    }
                    this.f3757c = l10;
                    this.f3756b = l10;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d.a f10;
            ArrayList arrayList = this.f3755a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f3757c = StaggeredGridLayoutManager.this.f3723u.d(view);
            if (n10.f3738f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) != null && f10.f3742f == 1) {
                this.f3757c += f10.c(this.f3759e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d.a f10;
            View view = (View) this.f3755a.get(0);
            c n10 = n(view);
            this.f3756b = StaggeredGridLayoutManager.this.f3723u.g(view);
            if (n10.f3738f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) != null && f10.f3742f == -1) {
                this.f3756b -= f10.c(this.f3759e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f3755a.clear();
            q();
            this.f3758d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f3728z ? i(this.f3755a.size() - 1, -1, true) : i(0, this.f3755a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f3728z ? i(0, this.f3755a.size(), true) : i(this.f3755a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int n10 = StaggeredGridLayoutManager.this.f3723u.n();
            int i12 = StaggeredGridLayoutManager.this.f3723u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f3755a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f3723u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f3723u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 < i12 : g10 <= i12;
                if (!z12 ? d10 > n10 : d10 >= n10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (!z10 || !z11) {
                        if (!z11 && g10 >= n10 && d10 <= i12) {
                        }
                    } else if (g10 >= n10 && d10 <= i12) {
                    }
                    return StaggeredGridLayoutManager.this.n0(view);
                }
                i10 += i13;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3758d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i10 = this.f3757c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3757c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            int i11 = this.f3757c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3755a.size() == 0) {
                return i10;
            }
            c();
            return this.f3757c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3755a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3755a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3728z && staggeredGridLayoutManager.n0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3728z && staggeredGridLayoutManager2.n0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3755a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = (View) this.f3755a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3728z && staggeredGridLayoutManager3.n0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3728z && staggeredGridLayoutManager4.n0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i10 = this.f3756b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3756b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i10) {
            int i11 = this.f3756b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3755a.size() == 0) {
                return i10;
            }
            d();
            return this.f3756b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f3756b = Integer.MIN_VALUE;
            this.f3757c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            int i11 = this.f3756b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3756b = i11 + i10;
            }
            int i12 = this.f3757c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3757c = i12 + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f3755a.size();
            View view = (View) this.f3755a.remove(size - 1);
            c n10 = n(view);
            n10.f3737e = null;
            if (n10.c() || n10.b()) {
                this.f3758d -= StaggeredGridLayoutManager.this.f3723u.e(view);
            }
            if (size == 1) {
                this.f3756b = Integer.MIN_VALUE;
            }
            this.f3757c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View view = (View) this.f3755a.remove(0);
            c n10 = n(view);
            n10.f3737e = null;
            if (this.f3755a.size() == 0) {
                this.f3757c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f3758d -= StaggeredGridLayoutManager.this.f3723u.e(view);
            }
            this.f3756b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n10 = n(view);
            n10.f3737e = this;
            this.f3755a.add(0, view);
            this.f3756b = Integer.MIN_VALUE;
            if (this.f3755a.size() == 1) {
                this.f3757c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f3758d += StaggeredGridLayoutManager.this.f3723u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10) {
            this.f3756b = i10;
            this.f3757c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d o02 = RecyclerView.p.o0(context, attributeSet, i10, i11);
        N2(o02.f3682a);
        P2(o02.f3683b);
        O2(o02.f3684c);
        this.f3727y = new f();
        g2();
    }

    private void A2(View view, int i10, int i11, boolean z10) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = cVar.leftMargin;
        Rect rect = this.K;
        int X2 = X2(i10, i12 + rect.left, cVar.rightMargin + rect.right);
        int i13 = cVar.topMargin;
        Rect rect2 = this.K;
        int X22 = X2(i11, i13 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z10 ? N1(view, X2, X22, cVar) : L1(view, X2, X22, cVar)) {
            view.measure(X2, X22);
        }
    }

    private void B2(View view, c cVar, boolean z10) {
        int P2;
        int P3;
        if (cVar.f3738f) {
            if (this.f3725w == 1) {
                P2 = this.J;
            } else {
                A2(view, RecyclerView.p.P(u0(), v0(), j0() + k0(), cVar.width, true), this.J, z10);
                return;
            }
        } else if (this.f3725w == 1) {
            P2 = RecyclerView.p.P(this.f3726x, v0(), 0, cVar.width, false);
        } else {
            P2 = RecyclerView.p.P(u0(), v0(), j0() + k0(), cVar.width, true);
            P3 = RecyclerView.p.P(this.f3726x, c0(), 0, cVar.height, false);
            A2(view, P2, P3, z10);
        }
        P3 = RecyclerView.p.P(b0(), c0(), m0() + h0(), cVar.height, true);
        A2(view, P2, P3, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0147, code lost:
        if (Y1() != false) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.q1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f3734e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.T1(r0)
            goto L_0x003e
        L_0x0037:
            r8.K2()
            boolean r5 = r8.A
            r0.f3732c = r5
        L_0x003e:
            r8.T2(r10, r0)
            r0.f3734e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3732c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.z2()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.E
            r5.b()
            r0.f3733d = r4
        L_0x0060:
            int r5 = r8.O()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3747g
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3733d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f3721s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3722t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f3731b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f3722t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            int[] r1 = r1.f3735f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f3721s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3722t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.L
            int[] r6 = r6.f3735f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f3721s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3722t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.f3731b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3722t
            r1.d(r5)
        L_0x00c9:
            r8.B(r9)
            androidx.recyclerview.widget.f r1 = r8.f3727y
            r1.f3875a = r3
            r8.M = r3
            androidx.recyclerview.widget.i r1 = r8.f3724v
            int r1 = r1.o()
            r8.V2(r1)
            int r1 = r0.f3730a
            r8.U2(r1, r10)
            boolean r1 = r0.f3732c
            if (r1 == 0) goto L_0x00fc
            r8.M2(r2)
            androidx.recyclerview.widget.f r1 = r8.f3727y
            r8.h2(r9, r1, r10)
            r8.M2(r4)
        L_0x00ef:
            androidx.recyclerview.widget.f r1 = r8.f3727y
            int r2 = r0.f3730a
            int r5 = r1.f3878d
            int r2 = r2 + r5
            r1.f3877c = r2
            r8.h2(r9, r1, r10)
            goto L_0x0108
        L_0x00fc:
            r8.M2(r4)
            androidx.recyclerview.widget.f r1 = r8.f3727y
            r8.h2(r9, r1, r10)
            r8.M2(r2)
            goto L_0x00ef
        L_0x0108:
            r8.J2()
            int r1 = r8.O()
            if (r1 <= 0) goto L_0x0122
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x011c
            r8.n2(r9, r10, r4)
            r8.o2(r9, r10, r3)
            goto L_0x0122
        L_0x011c:
            r8.o2(r9, r10, r4)
            r8.n2(r9, r10, r3)
        L_0x0122:
            if (r11 == 0) goto L_0x014a
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x014a
            int r11 = r8.F
            if (r11 == 0) goto L_0x014a
            int r11 = r8.O()
            if (r11 <= 0) goto L_0x014a
            boolean r11 = r8.M
            if (r11 != 0) goto L_0x013e
            android.view.View r11 = r8.x2()
            if (r11 == 0) goto L_0x014a
        L_0x013e:
            java.lang.Runnable r11 = r8.P
            r8.u1(r11)
            boolean r11 = r8.Y1()
            if (r11 == 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r4 = r3
        L_0x014b:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0156
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
        L_0x0156:
            boolean r11 = r0.f3732c
            r8.G = r11
            boolean r11 = r8.z2()
            r8.H = r11
            if (r4 == 0) goto L_0x016a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
            r8.C2(r9, r10, r3)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean D2(int i10) {
        if (this.f3725w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == z2();
    }

    private void F2(View view) {
        for (int i10 = this.f3721s - 1; i10 >= 0; i10--) {
            this.f3722t[i10].u(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f3879e == -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3875a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3883i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3876b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3879e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3881g
        L_0x0014:
            r2.H2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3880f
        L_0x001a:
            r2.I2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3879e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3880f
            int r1 = r2.s2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3881g
            int r4 = r4.f3876b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3881g
            int r0 = r2.t2(r0)
            int r1 = r4.f3881g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3880f
            int r4 = r4.f3876b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    private void H2(RecyclerView.v vVar, int i10) {
        int O2 = O() - 1;
        while (O2 >= 0) {
            View N2 = N(O2);
            if (this.f3723u.g(N2) >= i10 && this.f3723u.r(N2) >= i10) {
                c cVar = (c) N2.getLayoutParams();
                if (cVar.f3738f) {
                    int i11 = 0;
                    while (i11 < this.f3721s) {
                        if (this.f3722t[i11].f3755a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f3721s; i12++) {
                        this.f3722t[i12].s();
                    }
                } else if (cVar.f3737e.f3755a.size() != 1) {
                    cVar.f3737e.s();
                } else {
                    return;
                }
                s1(N2, vVar);
                O2--;
            } else {
                return;
            }
        }
    }

    private void I2(RecyclerView.v vVar, int i10) {
        while (O() > 0) {
            View N2 = N(0);
            if (this.f3723u.d(N2) <= i10 && this.f3723u.q(N2) <= i10) {
                c cVar = (c) N2.getLayoutParams();
                if (cVar.f3738f) {
                    int i11 = 0;
                    while (i11 < this.f3721s) {
                        if (this.f3722t[i11].f3755a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f3721s; i12++) {
                        this.f3722t[i12].t();
                    }
                } else if (cVar.f3737e.f3755a.size() != 1) {
                    cVar.f3737e.t();
                } else {
                    return;
                }
                s1(N2, vVar);
            } else {
                return;
            }
        }
    }

    private void J2() {
        if (this.f3724v.l() != 1073741824) {
            int O2 = O();
            float f10 = 0.0f;
            for (int i10 = 0; i10 < O2; i10++) {
                View N2 = N(i10);
                float e10 = (float) this.f3724v.e(N2);
                if (e10 >= f10) {
                    if (((c) N2.getLayoutParams()).e()) {
                        e10 = (e10 * 1.0f) / ((float) this.f3721s);
                    }
                    f10 = Math.max(f10, e10);
                }
            }
            int i11 = this.f3726x;
            int round = Math.round(f10 * ((float) this.f3721s));
            if (this.f3724v.l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3724v.o());
            }
            V2(round);
            if (this.f3726x != i11) {
                for (int i12 = 0; i12 < O2; i12++) {
                    View N3 = N(i12);
                    c cVar = (c) N3.getLayoutParams();
                    if (!cVar.f3738f) {
                        if (!z2() || this.f3725w != 1) {
                            int i13 = cVar.f3737e.f3759e;
                            int i14 = this.f3725w;
                            int i15 = (this.f3726x * i13) - (i13 * i11);
                            if (i14 == 1) {
                                N3.offsetLeftAndRight(i15);
                            } else {
                                N3.offsetTopAndBottom(i15);
                            }
                        } else {
                            int i16 = this.f3721s;
                            int i17 = cVar.f3737e.f3759e;
                            N3.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f3726x) - ((-((i16 - 1) - i17)) * i11));
                        }
                    }
                }
            }
        }
    }

    private void K2() {
        this.A = (this.f3725w == 1 || !z2()) ? this.f3728z : !this.f3728z;
    }

    private void M2(int i10) {
        f fVar = this.f3727y;
        fVar.f3879e = i10;
        int i11 = 1;
        if (this.A != (i10 == -1)) {
            i11 = -1;
        }
        fVar.f3878d = i11;
    }

    private void Q2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3721s; i12++) {
            if (!this.f3722t[i12].f3755a.isEmpty()) {
                W2(this.f3722t[i12], i10, i11);
            }
        }
    }

    private boolean R2(RecyclerView.a0 a0Var, b bVar) {
        boolean z10 = this.G;
        int b10 = a0Var.b();
        bVar.f3730a = z10 ? m2(b10) : i2(b10);
        bVar.f3731b = Integer.MIN_VALUE;
        return true;
    }

    private void S1(View view) {
        for (int i10 = this.f3721s - 1; i10 >= 0; i10--) {
            this.f3722t[i10].a(view);
        }
    }

    private void T1(b bVar) {
        boolean z10;
        e eVar = this.I;
        int i10 = eVar.f3747g;
        if (i10 > 0) {
            if (i10 == this.f3721s) {
                for (int i11 = 0; i11 < this.f3721s; i11++) {
                    this.f3722t[i11].e();
                    e eVar2 = this.I;
                    int i12 = eVar2.f3748h[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f3753m ? this.f3723u.i() : this.f3723u.n();
                    }
                    this.f3722t[i11].v(i12);
                }
            } else {
                eVar.d();
                e eVar3 = this.I;
                eVar3.f3745e = eVar3.f3746f;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f3754n;
        O2(eVar4.f3752l);
        K2();
        e eVar5 = this.I;
        int i13 = eVar5.f3745e;
        if (i13 != -1) {
            this.C = i13;
            z10 = eVar5.f3753m;
        } else {
            z10 = this.A;
        }
        bVar.f3732c = z10;
        if (eVar5.f3749i > 1) {
            d dVar = this.E;
            dVar.f3739a = eVar5.f3750j;
            dVar.f3740b = eVar5.f3751k;
        }
    }

    private void U2(int i10, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        int c10;
        f fVar = this.f3727y;
        boolean z10 = false;
        fVar.f3876b = 0;
        fVar.f3877c = i10;
        if (!D0() || (c10 = a0Var.c()) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            if (this.A == (c10 < i10)) {
                i12 = this.f3723u.o();
                i11 = 0;
            } else {
                i11 = this.f3723u.o();
                i12 = 0;
            }
        }
        if (R()) {
            this.f3727y.f3880f = this.f3723u.n() - i11;
            this.f3727y.f3881g = this.f3723u.i() + i12;
        } else {
            this.f3727y.f3881g = this.f3723u.h() + i12;
            this.f3727y.f3880f = -i11;
        }
        f fVar2 = this.f3727y;
        fVar2.f3882h = false;
        fVar2.f3875a = true;
        if (this.f3723u.l() == 0 && this.f3723u.h() == 0) {
            z10 = true;
        }
        fVar2.f3883i = z10;
    }

    private void W1(View view, c cVar, f fVar) {
        if (fVar.f3879e == 1) {
            if (cVar.f3738f) {
                S1(view);
            } else {
                cVar.f3737e.a(view);
            }
        } else if (cVar.f3738f) {
            F2(view);
        } else {
            cVar.f3737e.u(view);
        }
    }

    private void W2(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 > i11) {
                return;
            }
        } else if (fVar.k() - j10 < i11) {
            return;
        }
        this.B.set(fVar.f3759e, false);
    }

    private int X1(int i10) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < p2()) != this.A ? -1 : 1;
    }

    private int X2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean Z1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f3723u.i()) {
                ArrayList arrayList = fVar.f3755a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f3738f;
            }
        } else if (fVar.o() > this.f3723u.n()) {
            return !fVar.n((View) fVar.f3755a.get(0)).f3738f;
        }
        return false;
    }

    private int a2(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.a(a0Var, this.f3723u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int b2(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.b(a0Var, this.f3723u, k2(!this.N), j2(!this.N), this, this.N, this.A);
    }

    private int c2(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.c(a0Var, this.f3723u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int d2(int i10) {
        if (i10 == 1) {
            return (this.f3725w != 1 && z2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3725w != 1 && z2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3725w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3725w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f3725w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f3725w == 1 ? 1 : Integer.MIN_VALUE;
    }

    private d.a e2(int i10) {
        d.a aVar = new d.a();
        aVar.f3743g = new int[this.f3721s];
        for (int i11 = 0; i11 < this.f3721s; i11++) {
            aVar.f3743g[i11] = i10 - this.f3722t[i11].l(i10);
        }
        return aVar;
    }

    private d.a f2(int i10) {
        d.a aVar = new d.a();
        aVar.f3743g = new int[this.f3721s];
        for (int i11 = 0; i11 < this.f3721s; i11++) {
            aVar.f3743g[i11] = this.f3722t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void g2() {
        this.f3723u = i.b(this, this.f3725w);
        this.f3724v = i.b(this, 1 - this.f3725w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int h2(RecyclerView.v vVar, f fVar, RecyclerView.a0 a0Var) {
        f fVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view;
        int i14;
        int i15;
        boolean z10;
        RecyclerView.v vVar2 = vVar;
        f fVar3 = fVar;
        ? r92 = 0;
        this.B.set(0, this.f3721s, true);
        int i16 = this.f3727y.f3883i ? fVar3.f3879e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar3.f3879e == 1 ? fVar3.f3881g + fVar3.f3876b : fVar3.f3880f - fVar3.f3876b;
        Q2(fVar3.f3879e, i16);
        int i17 = this.A ? this.f3723u.i() : this.f3723u.n();
        boolean z11 = false;
        while (fVar.a(a0Var) && (this.f3727y.f3883i || !this.B.isEmpty())) {
            View b10 = fVar3.b(vVar2);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.E.g(a10);
            boolean z12 = g10 == -1 ? true : r92;
            if (z12) {
                fVar2 = cVar.f3738f ? this.f3722t[r92] : v2(fVar3);
                this.E.n(a10, fVar2);
            } else {
                fVar2 = this.f3722t[g10];
            }
            f fVar4 = fVar2;
            cVar.f3737e = fVar4;
            if (fVar3.f3879e == 1) {
                i(b10);
            } else {
                j(b10, r92);
            }
            B2(b10, cVar, r92);
            if (fVar3.f3879e == 1) {
                int r22 = cVar.f3738f ? r2(i17) : fVar4.l(i17);
                int e10 = this.f3723u.e(b10) + r22;
                if (z12 && cVar.f3738f) {
                    d.a e22 = e2(r22);
                    e22.f3742f = -1;
                    e22.f3741e = a10;
                    this.E.a(e22);
                }
                i10 = e10;
                i11 = r22;
            } else {
                int u22 = cVar.f3738f ? u2(i17) : fVar4.p(i17);
                i11 = u22 - this.f3723u.e(b10);
                if (z12 && cVar.f3738f) {
                    d.a f22 = f2(u22);
                    f22.f3742f = 1;
                    f22.f3741e = a10;
                    this.E.a(f22);
                }
                i10 = u22;
            }
            if (cVar.f3738f && fVar3.f3878d == -1) {
                if (!z12) {
                    if (!(fVar3.f3879e == 1 ? U1() : V1())) {
                        d.a f10 = this.E.f(a10);
                        if (f10 != null) {
                            f10.f3744h = true;
                        }
                    }
                }
                this.M = true;
            }
            W1(b10, cVar, fVar3);
            if (!z2() || this.f3725w != 1) {
                int n10 = cVar.f3738f ? this.f3724v.n() : (fVar4.f3759e * this.f3726x) + this.f3724v.n();
                i13 = n10;
                i12 = this.f3724v.e(b10) + n10;
            } else {
                int i18 = cVar.f3738f ? this.f3724v.i() : this.f3724v.i() - (((this.f3721s - 1) - fVar4.f3759e) * this.f3726x);
                i12 = i18;
                i13 = i18 - this.f3724v.e(b10);
            }
            if (this.f3725w == 1) {
                staggeredGridLayoutManager = this;
                view = b10;
                i14 = i13;
                i13 = i11;
                i15 = i12;
            } else {
                staggeredGridLayoutManager = this;
                view = b10;
                i14 = i11;
                i15 = i10;
                i10 = i12;
            }
            staggeredGridLayoutManager.F0(view, i14, i13, i15, i10);
            if (cVar.f3738f) {
                Q2(this.f3727y.f3879e, i16);
            } else {
                W2(fVar4, this.f3727y.f3879e, i16);
            }
            G2(vVar2, this.f3727y);
            if (this.f3727y.f3882h && b10.hasFocusable()) {
                if (cVar.f3738f) {
                    this.B.clear();
                } else {
                    z10 = false;
                    this.B.set(fVar4.f3759e, false);
                    r92 = z10;
                    z11 = true;
                }
            }
            z10 = false;
            r92 = z10;
            z11 = true;
        }
        int i19 = r92;
        if (!z11) {
            G2(vVar2, this.f3727y);
        }
        int n11 = this.f3727y.f3879e == -1 ? this.f3723u.n() - u2(this.f3723u.n()) : r2(this.f3723u.i()) - this.f3723u.i();
        return n11 > 0 ? Math.min(fVar3.f3876b, n11) : i19;
    }

    private int i2(int i10) {
        int O2 = O();
        for (int i11 = 0; i11 < O2; i11++) {
            int n02 = n0(N(i11));
            if (n02 >= 0 && n02 < i10) {
                return n02;
            }
        }
        return 0;
    }

    private int m2(int i10) {
        for (int O2 = O() - 1; O2 >= 0; O2--) {
            int n02 = n0(N(O2));
            if (n02 >= 0 && n02 < i10) {
                return n02;
            }
        }
        return 0;
    }

    private void n2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10;
        int r22 = r2(Integer.MIN_VALUE);
        if (r22 != Integer.MIN_VALUE && (i10 = this.f3723u.i() - r22) > 0) {
            int i11 = i10 - (-L2(-i10, vVar, a0Var));
            if (z10 && i11 > 0) {
                this.f3723u.s(i11);
            }
        }
    }

    private void o2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int n10;
        int u22 = u2(Integer.MAX_VALUE);
        if (u22 != Integer.MAX_VALUE && (n10 = u22 - this.f3723u.n()) > 0) {
            int L2 = n10 - L2(n10, vVar, a0Var);
            if (z10 && L2 > 0) {
                this.f3723u.s(-L2);
            }
        }
    }

    private int r2(int i10) {
        int l10 = this.f3722t[0].l(i10);
        for (int i11 = 1; i11 < this.f3721s; i11++) {
            int l11 = this.f3722t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int s2(int i10) {
        int p10 = this.f3722t[0].p(i10);
        for (int i11 = 1; i11 < this.f3721s; i11++) {
            int p11 = this.f3722t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int t2(int i10) {
        int l10 = this.f3722t[0].l(i10);
        for (int i11 = 1; i11 < this.f3721s; i11++) {
            int l11 = this.f3722t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int u2(int i10) {
        int p10 = this.f3722t[0].p(i10);
        for (int i11 = 1; i11 < this.f3721s; i11++) {
            int p11 = this.f3722t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private f v2(f fVar) {
        int i10;
        int i11;
        int i12;
        if (D2(fVar.f3879e)) {
            i12 = this.f3721s - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = this.f3721s;
            i12 = 0;
            i10 = 1;
        }
        f fVar2 = null;
        if (fVar.f3879e == 1) {
            int n10 = this.f3723u.n();
            int i13 = Integer.MAX_VALUE;
            while (i12 != i11) {
                f fVar3 = this.f3722t[i12];
                int l10 = fVar3.l(n10);
                if (l10 < i13) {
                    fVar2 = fVar3;
                    i13 = l10;
                }
                i12 += i10;
            }
            return fVar2;
        }
        int i14 = this.f3723u.i();
        int i15 = Integer.MIN_VALUE;
        while (i12 != i11) {
            f fVar4 = this.f3722t[i12];
            int p10 = fVar4.p(i14);
            if (p10 > i15) {
                fVar2 = fVar4;
                i15 = p10;
            }
            i12 += i10;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.q2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.p2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0017
            int r2 = r8 + 1
        L_0x0015:
            r3 = r7
            goto L_0x001e
        L_0x0017:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001e
        L_0x001b:
            int r2 = r7 + r8
            goto L_0x0015
        L_0x001e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003d
            r5 = 2
            if (r9 == r5) goto L_0x0037
            if (r9 == r1) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L_0x0042
        L_0x0037:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L_0x0042
        L_0x003d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L_0x0042:
            if (r2 > r0) goto L_0x0045
            return
        L_0x0045:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004e
            int r7 = r6.p2()
            goto L_0x0052
        L_0x004e:
            int r7 = r6.q2()
        L_0x0052:
            if (r3 > r7) goto L_0x0057
            r6.z1()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(int, int, int):void");
    }

    public int A(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    public int C1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return L2(i10, vVar, a0Var);
    }

    public void D1(int i10) {
        e eVar = this.I;
        if (!(eVar == null || eVar.f3745e == i10)) {
            eVar.c();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        z1();
    }

    public int E1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return L2(i10, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public void E2(int i10, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = q2();
            i11 = 1;
        } else {
            i12 = p2();
            i11 = -1;
        }
        this.f3727y.f3875a = true;
        U2(i12, a0Var);
        M2(i11);
        f fVar = this.f3727y;
        fVar.f3877c = i12 + fVar.f3878d;
        fVar.f3876b = Math.abs(i10);
    }

    public RecyclerView.q I() {
        return this.f3725w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void I0(int i10) {
        super.I0(i10);
        for (int i11 = 0; i11 < this.f3721s; i11++) {
            this.f3722t[i11].r(i10);
        }
    }

    public void I1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int j02 = j0() + k0();
        int m02 = m0() + h0();
        if (this.f3725w == 1) {
            i13 = RecyclerView.p.s(i11, rect.height() + m02, f0());
            i12 = RecyclerView.p.s(i10, (this.f3726x * this.f3721s) + j02, g0());
        } else {
            i12 = RecyclerView.p.s(i10, rect.width() + j02, g0());
            i13 = RecyclerView.p.s(i11, (this.f3726x * this.f3721s) + m02, f0());
        }
        H1(i12, i13);
    }

    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void J0(int i10) {
        super.J0(i10);
        for (int i11 = 0; i11 < this.f3721s; i11++) {
            this.f3722t[i11].r(i10);
        }
    }

    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void K0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f3721s; i10++) {
            this.f3722t[i10].e();
        }
    }

    /* access modifiers changed from: package-private */
    public int L2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        E2(i10, a0Var);
        int h22 = h2(vVar, this.f3727y, a0Var);
        if (this.f3727y.f3876b >= h22) {
            i10 = i10 < 0 ? -h22 : h22;
        }
        this.f3723u.s(-i10);
        this.G = this.A;
        f fVar = this.f3727y;
        fVar.f3876b = 0;
        G2(vVar, fVar);
        return i10;
    }

    public void N2(int i10) {
        if (i10 == 0 || i10 == 1) {
            l((String) null);
            if (i10 != this.f3725w) {
                this.f3725w = i10;
                i iVar = this.f3723u;
                this.f3723u = this.f3724v;
                this.f3724v = iVar;
                z1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void O0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.O0(recyclerView, vVar);
        u1(this.P);
        for (int i10 = 0; i10 < this.f3721s; i10++) {
            this.f3722t[i10].e();
        }
        recyclerView.requestLayout();
    }

    public void O1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        P1(gVar);
    }

    public void O2(boolean z10) {
        l((String) null);
        e eVar = this.I;
        if (!(eVar == null || eVar.f3752l == z10)) {
            eVar.f3752l = z10;
        }
        this.f3728z = z10;
        z1();
    }

    public View P0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View G2;
        View m10;
        if (O() == 0 || (G2 = G(view)) == null) {
            return null;
        }
        K2();
        int d22 = d2(i10);
        if (d22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) G2.getLayoutParams();
        boolean z10 = cVar.f3738f;
        f fVar = cVar.f3737e;
        int q22 = d22 == 1 ? q2() : p2();
        U2(q22, a0Var);
        M2(d22);
        f fVar2 = this.f3727y;
        fVar2.f3877c = fVar2.f3878d + q22;
        fVar2.f3876b = (int) (((float) this.f3723u.o()) * 0.33333334f);
        f fVar3 = this.f3727y;
        fVar3.f3882h = true;
        fVar3.f3875a = false;
        h2(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z10 && (m10 = fVar.m(q22, d22)) != null && m10 != G2) {
            return m10;
        }
        if (D2(d22)) {
            for (int i11 = this.f3721s - 1; i11 >= 0; i11--) {
                View m11 = this.f3722t[i11].m(q22, d22);
                if (m11 != null && m11 != G2) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3721s; i12++) {
                View m12 = this.f3722t[i12].m(q22, d22);
                if (m12 != null && m12 != G2) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f3728z ^ true) == (d22 == -1);
        if (!z10) {
            View H2 = H(z11 ? fVar.f() : fVar.g());
            if (!(H2 == null || H2 == G2)) {
                return H2;
            }
        }
        if (D2(d22)) {
            for (int i13 = this.f3721s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f3759e) {
                    f[] fVarArr = this.f3722t;
                    View H3 = H(z11 ? fVarArr[i13].f() : fVarArr[i13].g());
                    if (!(H3 == null || H3 == G2)) {
                        return H3;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3721s; i14++) {
                f[] fVarArr2 = this.f3722t;
                View H4 = H(z11 ? fVarArr2[i14].f() : fVarArr2[i14].g());
                if (H4 != null && H4 != G2) {
                    return H4;
                }
            }
        }
        return null;
    }

    public void P2(int i10) {
        l((String) null);
        if (i10 != this.f3721s) {
            y2();
            this.f3721s = i10;
            this.B = new BitSet(this.f3721s);
            this.f3722t = new f[this.f3721s];
            for (int i11 = 0; i11 < this.f3721s; i11++) {
                this.f3722t[i11] = new f(i11);
            }
            z1();
        }
    }

    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            View k22 = k2(false);
            View j22 = j2(false);
            if (k22 != null && j22 != null) {
                int n02 = n0(k22);
                int n03 = n0(j22);
                if (n02 < n03) {
                    accessibilityEvent.setFromIndex(n02);
                    accessibilityEvent.setToIndex(n03);
                    return;
                }
                accessibilityEvent.setFromIndex(n03);
                accessibilityEvent.setToIndex(n02);
            }
        }
    }

    public boolean R1() {
        return this.I == null;
    }

    /* access modifiers changed from: package-private */
    public boolean S2(RecyclerView.a0 a0Var, b bVar) {
        int i10;
        int n10;
        int g10;
        boolean z10 = false;
        if (!a0Var.e() && (i10 = this.C) != -1) {
            if (i10 < 0 || i10 >= a0Var.b()) {
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            } else {
                e eVar = this.I;
                if (eVar == null || eVar.f3745e == -1 || eVar.f3747g < 1) {
                    View H2 = H(this.C);
                    if (H2 != null) {
                        bVar.f3730a = this.A ? q2() : p2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3732c) {
                                n10 = this.f3723u.i() - this.D;
                                g10 = this.f3723u.d(H2);
                            } else {
                                n10 = this.f3723u.n() + this.D;
                                g10 = this.f3723u.g(H2);
                            }
                            bVar.f3731b = n10 - g10;
                            return true;
                        } else if (this.f3723u.e(H2) > this.f3723u.o()) {
                            bVar.f3731b = bVar.f3732c ? this.f3723u.i() : this.f3723u.n();
                            return true;
                        } else {
                            int g11 = this.f3723u.g(H2) - this.f3723u.n();
                            if (g11 < 0) {
                                bVar.f3731b = -g11;
                                return true;
                            }
                            int i11 = this.f3723u.i() - this.f3723u.d(H2);
                            if (i11 < 0) {
                                bVar.f3731b = i11;
                                return true;
                            }
                            bVar.f3731b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i12 = this.C;
                        bVar.f3730a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            if (X1(i12) == 1) {
                                z10 = true;
                            }
                            bVar.f3732c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3733d = true;
                    }
                } else {
                    bVar.f3731b = Integer.MIN_VALUE;
                    bVar.f3730a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void T2(RecyclerView.a0 a0Var, b bVar) {
        if (!S2(a0Var, bVar) && !R2(a0Var, bVar)) {
            bVar.a();
            bVar.f3730a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean U1() {
        int l10 = this.f3722t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3721s; i10++) {
            if (this.f3722t[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean V1() {
        int p10 = this.f3722t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3721s; i10++) {
            if (this.f3722t[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void V2(int i10) {
        this.f3726x = i10 / this.f3721s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3724v.l());
    }

    public void X0(RecyclerView recyclerView, int i10, int i11) {
        w2(i10, i11, 1);
    }

    public void Y0(RecyclerView recyclerView) {
        this.E.b();
        z1();
    }

    /* access modifiers changed from: package-private */
    public boolean Y1() {
        int i10;
        int i11;
        if (O() == 0 || this.F == 0 || !x0()) {
            return false;
        }
        if (this.A) {
            i11 = q2();
            i10 = p2();
        } else {
            i11 = p2();
            i10 = q2();
        }
        if (i11 == 0 && x2() != null) {
            this.E.b();
        } else if (!this.M) {
            return false;
        } else {
            int i12 = this.A ? -1 : 1;
            int i13 = i10 + 1;
            d.a e10 = this.E.e(i11, i13, i12, true);
            if (e10 == null) {
                this.M = false;
                this.E.d(i13);
                return false;
            }
            d.a e11 = this.E.e(i11, e10.f3741e, i12 * -1, true);
            if (e11 == null) {
                this.E.d(e10.f3741e);
            } else {
                this.E.d(e11.f3741e + 1);
            }
        }
        A1();
        z1();
        return true;
    }

    public void Z0(RecyclerView recyclerView, int i10, int i11, int i12) {
        w2(i10, i11, 8);
    }

    public void a1(RecyclerView recyclerView, int i10, int i11) {
        w2(i10, i11, 2);
    }

    public void c1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        w2(i10, i11, 4);
    }

    public PointF d(int i10) {
        int X1 = X1(i10);
        PointF pointF = new PointF();
        if (X1 == 0) {
            return null;
        }
        if (this.f3725w == 0) {
            pointF.x = (float) X1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) X1;
        }
        return pointF;
    }

    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        C2(vVar, a0Var, true);
    }

    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public void i1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.c();
                this.I.d();
            }
            z1();
        }
    }

    public Parcelable j1() {
        int i10;
        int n10;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f3752l = this.f3728z;
        eVar.f3753m = this.G;
        eVar.f3754n = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f3739a) == null) {
            eVar.f3749i = 0;
        } else {
            eVar.f3750j = iArr;
            eVar.f3749i = iArr.length;
            eVar.f3751k = dVar.f3740b;
        }
        if (O() > 0) {
            eVar.f3745e = this.G ? q2() : p2();
            eVar.f3746f = l2();
            int i11 = this.f3721s;
            eVar.f3747g = i11;
            eVar.f3748h = new int[i11];
            for (int i12 = 0; i12 < this.f3721s; i12++) {
                if (this.G) {
                    i10 = this.f3722t[i12].l(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        n10 = this.f3723u.i();
                    } else {
                        eVar.f3748h[i12] = i10;
                    }
                } else {
                    i10 = this.f3722t[i12].p(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        n10 = this.f3723u.n();
                    } else {
                        eVar.f3748h[i12] = i10;
                    }
                }
                i10 -= n10;
                eVar.f3748h[i12] = i10;
            }
        } else {
            eVar.f3745e = -1;
            eVar.f3746f = -1;
            eVar.f3747g = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public View j2(boolean z10) {
        int n10 = this.f3723u.n();
        int i10 = this.f3723u.i();
        View view = null;
        for (int O2 = O() - 1; O2 >= 0; O2--) {
            View N2 = N(O2);
            int g10 = this.f3723u.g(N2);
            int d10 = this.f3723u.d(N2);
            if (d10 > n10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return N2;
                }
                if (view == null) {
                    view = N2;
                }
            }
        }
        return view;
    }

    public void k1(int i10) {
        if (i10 == 0) {
            Y1();
        }
    }

    /* access modifiers changed from: package-private */
    public View k2(boolean z10) {
        int n10 = this.f3723u.n();
        int i10 = this.f3723u.i();
        int O2 = O();
        View view = null;
        for (int i11 = 0; i11 < O2; i11++) {
            View N2 = N(i11);
            int g10 = this.f3723u.g(N2);
            if (this.f3723u.d(N2) > n10 && g10 < i10) {
                if (g10 >= n10 || !z10) {
                    return N2;
                }
                if (view == null) {
                    view = N2;
                }
            }
        }
        return view;
    }

    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int l2() {
        View j22 = this.A ? j2(true) : k2(true);
        if (j22 == null) {
            return -1;
        }
        return n0(j22);
    }

    public boolean p() {
        return this.f3725w == 0;
    }

    /* access modifiers changed from: package-private */
    public int p2() {
        if (O() == 0) {
            return 0;
        }
        return n0(N(0));
    }

    public boolean q() {
        return this.f3725w == 1;
    }

    /* access modifiers changed from: package-private */
    public int q2() {
        int O2 = O();
        if (O2 == 0) {
            return 0;
        }
        return n0(N(O2 - 1));
    }

    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public void t(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.f3725w != 0) {
            i10 = i11;
        }
        if (O() != 0 && i10 != 0) {
            E2(i10, a0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.f3721s) {
                this.O = new int[this.f3721s];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f3721s; i14++) {
                f fVar = this.f3727y;
                if (fVar.f3878d == -1) {
                    l10 = fVar.f3880f;
                    i12 = this.f3722t[i14].p(l10);
                } else {
                    l10 = this.f3722t[i14].l(fVar.f3881g);
                    i12 = this.f3727y.f3881g;
                }
                int i15 = l10 - i12;
                if (i15 >= 0) {
                    this.O[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.O, 0, i13);
            for (int i16 = 0; i16 < i13 && this.f3727y.a(a0Var); i16++) {
                cVar.a(this.f3727y.f3877c, this.O[i16]);
                f fVar2 = this.f3727y;
                fVar2.f3877c += fVar2.f3878d;
            }
        }
    }

    public int v(RecyclerView.a0 a0Var) {
        return a2(a0Var);
    }

    public int w(RecyclerView.a0 a0Var) {
        return b2(a0Var);
    }

    public int x(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    /* access modifiers changed from: package-private */
    public View x2() {
        int i10;
        int O2 = O();
        int i11 = O2 - 1;
        BitSet bitSet = new BitSet(this.f3721s);
        bitSet.set(0, this.f3721s, true);
        int i12 = -1;
        char c10 = (this.f3725w != 1 || !z2()) ? (char) 65535 : 1;
        if (this.A) {
            O2 = -1;
        } else {
            i11 = 0;
        }
        if (i11 < O2) {
            i12 = 1;
        }
        while (i11 != O2) {
            View N2 = N(i11);
            c cVar = (c) N2.getLayoutParams();
            if (bitSet.get(cVar.f3737e.f3759e)) {
                if (Z1(cVar.f3737e)) {
                    return N2;
                }
                bitSet.clear(cVar.f3737e.f3759e);
            }
            if (!cVar.f3738f && (i10 = i11 + i12) != O2) {
                View N3 = N(i10);
                if (this.A) {
                    int d10 = this.f3723u.d(N2);
                    int d11 = this.f3723u.d(N3);
                    if (d10 < d11) {
                        return N2;
                    }
                    if (d10 != d11) {
                        continue;
                    }
                } else {
                    int g10 = this.f3723u.g(N2);
                    int g11 = this.f3723u.g(N3);
                    if (g10 > g11) {
                        return N2;
                    }
                    if (g10 != g11) {
                        continue;
                    }
                }
                if ((cVar.f3737e.f3759e - ((c) N3.getLayoutParams()).f3737e.f3759e < 0) != (c10 < 0)) {
                    return N2;
                }
            }
            i11 += i12;
        }
        return null;
    }

    public int y(RecyclerView.a0 a0Var) {
        return a2(a0Var);
    }

    public boolean y0() {
        return this.F != 0;
    }

    public void y2() {
        this.E.b();
        z1();
    }

    public int z(RecyclerView.a0 a0Var) {
        return b2(a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean z2() {
        return d0() == 1;
    }
}
