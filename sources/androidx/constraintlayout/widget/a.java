package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import s.e;

public class a extends c {

    /* renamed from: n  reason: collision with root package name */
    private int f1755n;

    /* renamed from: o  reason: collision with root package name */
    private int f1756o;

    /* renamed from: p  reason: collision with root package name */
    private s.a f1757p;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r6 == 6) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 6) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p(s.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1756o = r5
            r5 = 0
            r0 = 6
            r1 = 1
            r2 = 5
            if (r6 == 0) goto L_0x0014
            int r6 = r3.f1755n
            if (r6 != r2) goto L_0x000f
        L_0x000c:
            r3.f1756o = r1
            goto L_0x001c
        L_0x000f:
            if (r6 != r0) goto L_0x001c
        L_0x0011:
            r3.f1756o = r5
            goto L_0x001c
        L_0x0014:
            int r6 = r3.f1755n
            if (r6 != r2) goto L_0x0019
            goto L_0x0011
        L_0x0019:
            if (r6 != r0) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            boolean r5 = r4 instanceof s.a
            if (r5 == 0) goto L_0x0027
            s.a r4 = (s.a) r4
            int r5 = r3.f1756o
            r4.A1(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.p(s.e, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f1757p.u1();
    }

    public int getMargin() {
        return this.f1757p.w1();
    }

    public int getType() {
        return this.f1755n;
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1757p = new s.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2027n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.D1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.C1) {
                    this.f1757p.z1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.E1) {
                    this.f1757p.B1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1779h = this.f1757p;
        o();
    }

    public void j(e eVar, boolean z10) {
        p(eVar, this.f1755n, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1757p.z1(z10);
    }

    public void setDpMargin(int i10) {
        s.a aVar = this.f1757p;
        aVar.B1((int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1757p.B1(i10);
    }

    public void setType(int i10) {
        this.f1755n = i10;
    }
}
