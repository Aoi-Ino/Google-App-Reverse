package sk;

import al.d;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.text.p;
import com.smarteist.autoimageslider.c;
import sk.a;
import xk.e;
import zk.b;

public class b extends View implements c.j, a.C0350a, c.i {

    /* renamed from: e  reason: collision with root package name */
    private a f31263e;

    /* renamed from: f  reason: collision with root package name */
    private DataSetObserver f31264f;

    /* renamed from: g  reason: collision with root package name */
    private c f31265g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f31266h;

    class a extends DataSetObserver {
        a() {
        }

        public void onChanged() {
            b.this.u();
        }
    }

    /* renamed from: sk.b$b  reason: collision with other inner class name */
    static /* synthetic */ class C0351b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31268a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                al.d[] r0 = al.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31268a = r0
                al.d r1 = al.d.On     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31268a     // Catch:{ NoSuchFieldError -> 0x001d }
                al.d r1 = al.d.Off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31268a     // Catch:{ NoSuchFieldError -> 0x0028 }
                al.d r1 = al.d.Auto     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sk.b.C0351b.<clinit>():void");
        }
    }

    public b(Context context) {
        super(context);
        j((AttributeSet) null);
    }

    private int g(int i10) {
        int c10 = this.f31263e.d().c() - 1;
        if (i10 <= 0) {
            return 0;
        }
        return i10 > c10 ? c10 : i10;
    }

    private c h(ViewGroup viewGroup, int i10) {
        View findViewById;
        if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i10)) != null && (findViewById instanceof c)) {
            return (c) findViewById;
        }
        return null;
    }

    private void i(ViewParent viewParent) {
        if (viewParent != null && (viewParent instanceof ViewGroup) && ((ViewGroup) viewParent).getChildCount() > 0) {
            c h10 = h((ViewGroup) viewParent, this.f31263e.d().s());
            if (h10 != null) {
                setViewPager(h10);
            } else {
                i(viewParent.getParent());
            }
        }
    }

    private void j(AttributeSet attributeSet) {
        s();
        k(attributeSet);
    }

    private void k(AttributeSet attributeSet) {
        a aVar = new a(this);
        this.f31263e = aVar;
        aVar.c().c(getContext(), attributeSet);
        al.a d10 = this.f31263e.d();
        d10.H(getPaddingLeft());
        d10.J(getPaddingTop());
        d10.I(getPaddingRight());
        d10.G(getPaddingBottom());
        this.f31266h = d10.v();
    }

    private boolean l() {
        int i10 = C0351b.f31268a[this.f31263e.d().l().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        return p.a(getContext().getResources().getConfiguration().locale) == 1;
    }

    private boolean m() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    private void n(int i10, float f10) {
        al.a d10 = this.f31263e.d();
        e b10 = d10.b();
        boolean v10 = d10.v();
        if (m() && v10 && b10 != e.NONE) {
            Pair c10 = dl.a.c(d10, i10, f10, l());
            r(((Integer) c10.first).intValue(), ((Float) c10.second).floatValue());
        }
    }

    private void o(int i10) {
        al.a d10 = this.f31263e.d();
        boolean m10 = m();
        int c10 = d10.c();
        if (m10) {
            if (l()) {
                i10 = (c10 - 1) - i10;
            }
            setSelection(i10);
        }
    }

    private void p() {
        c cVar;
        if (this.f31264f == null && (cVar = this.f31265g) != null && cVar.getAdapter() != null) {
            this.f31264f = new a();
            try {
                this.f31265g.getAdapter().i(this.f31264f);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
    }

    private void s() {
        if (getId() == -1) {
            setId(dl.c.a());
        }
    }

    private void t() {
        c cVar;
        if (this.f31264f != null && (cVar = this.f31265g) != null && cVar.getAdapter() != null) {
            try {
                this.f31265g.getAdapter().q(this.f31264f);
                this.f31264f = null;
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        int i10;
        int i11;
        c cVar = this.f31265g;
        if (cVar != null && cVar.getAdapter() != null) {
            if (this.f31265g.getAdapter() instanceof el.a) {
                i11 = ((el.a) this.f31265g.getAdapter()).t();
                i10 = i11 > 0 ? this.f31265g.getCurrentItem() % i11 : 0;
            } else {
                i11 = this.f31265g.getAdapter().d();
                i10 = this.f31265g.getCurrentItem();
            }
            if (l()) {
                i10 = (i11 - 1) - i10;
            }
            this.f31263e.d().O(i10);
            this.f31263e.d().P(i10);
            this.f31263e.d().D(i10);
            this.f31263e.d().z(i11);
            this.f31263e.b().b();
            v();
            requestLayout();
        }
    }

    private void v() {
        if (this.f31263e.d().t()) {
            int c10 = this.f31263e.d().c();
            int visibility = getVisibility();
            if (visibility != 0 && c10 > 1) {
                setVisibility(0);
            } else if (visibility != 4 && c10 <= 1) {
                setVisibility(4);
            }
        }
    }

    public void a(int i10, float f10, int i11) {
        n(i10, f10);
    }

    public void b(int i10) {
        if (i10 == 0) {
            this.f31263e.d().C(this.f31266h);
        }
    }

    public void c(int i10) {
        o(i10);
    }

    public void d(c cVar, l1.a aVar, l1.a aVar2) {
        u();
    }

    public void e() {
        invalidate();
    }

    public long getAnimationDuration() {
        return this.f31263e.d().a();
    }

    public int getCount() {
        return this.f31263e.d().c();
    }

    public int getPadding() {
        return this.f31263e.d().f();
    }

    public int getRadius() {
        return this.f31263e.d().k();
    }

    public float getScaleFactor() {
        return this.f31263e.d().m();
    }

    public int getSelectedColor() {
        return this.f31263e.d().n();
    }

    public int getSelection() {
        return this.f31263e.d().o();
    }

    public int getStrokeWidth() {
        return this.f31263e.d().q();
    }

    public int getUnselectedColor() {
        return this.f31263e.d().r();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i(getParent());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        t();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f31263e.c().a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        Pair d10 = this.f31263e.c().d(i10, i11);
        setMeasuredDimension(((Integer) d10.first).intValue(), ((Integer) d10.second).intValue());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof al.c) {
            al.a d10 = this.f31263e.d();
            al.c cVar = (al.c) parcelable;
            d10.O(cVar.d());
            d10.P(cVar.e());
            d10.D(cVar.c());
            parcelable = cVar.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        al.a d10 = this.f31263e.d();
        al.c cVar = new al.c(super.onSaveInstanceState());
        cVar.g(d10.o());
        cVar.h(d10.p());
        cVar.f(d10.d());
        return cVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f31263e.c().f(motionEvent);
        return true;
    }

    public void q() {
        c cVar = this.f31265g;
        if (cVar != null) {
            cVar.I(this);
            this.f31265g = null;
        }
    }

    public void r(int i10, float f10) {
        al.a d10 = this.f31263e.d();
        if (d10.v()) {
            int c10 = d10.c();
            if (c10 <= 0 || i10 < 0) {
                i10 = 0;
            } else {
                int i11 = c10 - 1;
                if (i10 > i11) {
                    i10 = i11;
                }
            }
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 == 1.0f) {
                d10.D(d10.o());
                d10.O(i10);
            }
            d10.P(i10);
            this.f31263e.b().c(f10);
        }
    }

    public void setAnimationDuration(long j10) {
        this.f31263e.d().w(j10);
    }

    public void setAnimationType(e eVar) {
        this.f31263e.a((vk.a) null);
        if (eVar != null) {
            this.f31263e.d().x(eVar);
        } else {
            this.f31263e.d().x(e.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z10) {
        if (!z10) {
            setVisibility(0);
        }
        this.f31263e.d().y(z10);
        v();
    }

    public void setClickListener(b.C0389b bVar) {
        this.f31263e.c().e(bVar);
    }

    public void setCount(int i10) {
        if (i10 >= 0 && this.f31263e.d().c() != i10) {
            this.f31263e.d().z(i10);
            v();
            requestLayout();
        }
    }

    public void setDynamicCount(boolean z10) {
        this.f31263e.d().A(z10);
        if (z10) {
            p();
        } else {
            t();
        }
    }

    public void setInteractiveAnimation(boolean z10) {
        this.f31263e.d().C(z10);
        this.f31266h = z10;
    }

    public void setOrientation(al.b bVar) {
        if (bVar != null) {
            this.f31263e.d().E(bVar);
            requestLayout();
        }
    }

    public void setPadding(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f31263e.d().F((int) f10);
        invalidate();
    }

    public void setRadius(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f31263e.d().K((int) f10);
        invalidate();
    }

    public void setRtlMode(d dVar) {
        al.a d10 = this.f31263e.d();
        if (dVar == null) {
            dVar = d.Off;
        }
        d10.L(dVar);
        if (this.f31265g != null) {
            int o10 = d10.o();
            if (l()) {
                o10 = (d10.c() - 1) - o10;
            } else {
                c cVar = this.f31265g;
                if (cVar != null) {
                    o10 = cVar.getCurrentItem();
                }
            }
            d10.D(o10);
            d10.P(o10);
            d10.O(o10);
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r3 < 0.3f) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScaleFactor(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0008
        L_0x0006:
            r3 = r0
            goto L_0x0010
        L_0x0008:
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0010
            goto L_0x0006
        L_0x0010:
            sk.a r0 = r2.f31263e
            al.a r0 = r0.d()
            r0.M(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.b.setScaleFactor(float):void");
    }

    public void setSelected(int i10) {
        al.a d10 = this.f31263e.d();
        e b10 = d10.b();
        d10.x(e.NONE);
        setSelection(i10);
        d10.x(b10);
    }

    public void setSelectedColor(int i10) {
        this.f31263e.d().N(i10);
        invalidate();
    }

    public void setSelection(int i10) {
        al.a d10 = this.f31263e.d();
        int g10 = g(i10);
        if (g10 != d10.o() && g10 != d10.p()) {
            d10.C(false);
            d10.D(d10.o());
            d10.P(g10);
            d10.O(g10);
            this.f31263e.b().a();
        }
    }

    public void setStrokeWidth(float f10) {
        int k10 = this.f31263e.d().k();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else {
            float f11 = (float) k10;
            if (f10 > f11) {
                f10 = f11;
            }
        }
        this.f31263e.d().Q((int) f10);
        invalidate();
    }

    public void setUnselectedColor(int i10) {
        this.f31263e.d().R(i10);
        invalidate();
    }

    public void setViewPager(c cVar) {
        q();
        if (cVar != null) {
            this.f31265g = cVar;
            cVar.d(this);
            this.f31265g.c(this);
            this.f31263e.d().S(this.f31265g.getId());
            setDynamicCount(this.f31263e.d().u());
            u();
        }
    }

    public void setPadding(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f31263e.d().F(dl.b.a(i10));
        invalidate();
    }

    public void setRadius(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f31263e.d().K(dl.b.a(i10));
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        int a10 = dl.b.a(i10);
        int k10 = this.f31263e.d().k();
        if (a10 < 0) {
            a10 = 0;
        } else if (a10 > k10) {
            a10 = k10;
        }
        this.f31263e.d().Q(a10);
        invalidate();
    }
}
