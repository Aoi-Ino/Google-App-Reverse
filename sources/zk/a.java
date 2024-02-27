package zk;

import al.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import xk.e;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private al.a f33220a;

    public a(al.a aVar) {
        this.f33220a = aVar;
    }

    private e a(int i10) {
        switch (i10) {
            case 0:
                return e.NONE;
            case 1:
                return e.COLOR;
            case 2:
                return e.SCALE;
            case 3:
                return e.WORM;
            case 4:
                return e.SLIDE;
            case 5:
                return e.FILL;
            case 6:
                return e.THIN_WORM;
            case 7:
                return e.DROP;
            case 8:
                return e.SWAP;
            case 9:
                return e.SCALE_DOWN;
            default:
                return e.NONE;
        }
    }

    public static d b(int i10) {
        if (i10 == 0) {
            return d.On;
        }
        if (i10 != 1) {
            return i10 != 2 ? d.Auto : d.Auto;
        }
        return d.Off;
    }

    private void d(TypedArray typedArray) {
        int i10 = 0;
        boolean z10 = typedArray.getBoolean(com.smarteist.autoimageslider.a.J, false);
        int i11 = typedArray.getInt(com.smarteist.autoimageslider.a.E, 350);
        if (i11 >= 0) {
            i10 = i11;
        }
        e a10 = a(typedArray.getInt(com.smarteist.autoimageslider.a.F, e.NONE.ordinal()));
        d b10 = b(typedArray.getInt(com.smarteist.autoimageslider.a.N, d.Off.ordinal()));
        this.f33220a.w((long) i10);
        this.f33220a.C(z10);
        this.f33220a.x(a10);
        this.f33220a.L(b10);
    }

    private void e(TypedArray typedArray) {
        int color = typedArray.getColor(com.smarteist.autoimageslider.a.S, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(com.smarteist.autoimageslider.a.Q, Color.parseColor("#ffffff"));
        this.f33220a.R(color);
        this.f33220a.N(color2);
    }

    private void f(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(com.smarteist.autoimageslider.a.T, -1);
        boolean z10 = typedArray.getBoolean(com.smarteist.autoimageslider.a.G, true);
        int i10 = 0;
        boolean z11 = typedArray.getBoolean(com.smarteist.autoimageslider.a.I, false);
        int i11 = typedArray.getInt(com.smarteist.autoimageslider.a.H, -1);
        if (i11 == -1) {
            i11 = 3;
        }
        int i12 = typedArray.getInt(com.smarteist.autoimageslider.a.P, 0);
        if (i12 >= 0 && (i11 <= 0 || i12 <= i11 - 1)) {
            i10 = i12;
        }
        this.f33220a.S(resourceId);
        this.f33220a.y(z10);
        this.f33220a.A(z11);
        this.f33220a.z(i11);
        this.f33220a.O(i10);
        this.f33220a.P(i10);
        this.f33220a.D(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r4 > 1.0f) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(android.content.res.TypedArray r8) {
        /*
            r7 = this;
            int r0 = com.smarteist.autoimageslider.a.K
            al.b r1 = al.b.HORIZONTAL
            int r2 = r1.ordinal()
            int r0 = r8.getInt(r0, r2)
            if (r0 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            al.b r1 = al.b.VERTICAL
        L_0x0011:
            int r0 = com.smarteist.autoimageslider.a.M
            r2 = 6
            int r2 = dl.b.a(r2)
            float r2 = (float) r2
            float r0 = r8.getDimension(r0, r2)
            int r0 = (int) r0
            r2 = 0
            if (r0 >= 0) goto L_0x0022
            r0 = r2
        L_0x0022:
            int r3 = com.smarteist.autoimageslider.a.L
            r4 = 8
            int r4 = dl.b.a(r4)
            float r4 = (float) r4
            float r3 = r8.getDimension(r3, r4)
            int r3 = (int) r3
            if (r3 >= 0) goto L_0x0033
            r3 = r2
        L_0x0033:
            int r4 = com.smarteist.autoimageslider.a.O
            r5 = 1060320051(0x3f333333, float:0.7)
            float r4 = r8.getFloat(r4, r5)
            r5 = 1050253722(0x3e99999a, float:0.3)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x0045
        L_0x0043:
            r4 = r5
            goto L_0x004c
        L_0x0045:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x004c
            goto L_0x0043
        L_0x004c:
            int r5 = com.smarteist.autoimageslider.a.R
            r6 = 1
            int r6 = dl.b.a(r6)
            float r6 = (float) r6
            float r8 = r8.getDimension(r5, r6)
            int r8 = (int) r8
            if (r8 <= r0) goto L_0x005c
            r8 = r0
        L_0x005c:
            al.a r5 = r7.f33220a
            xk.e r5 = r5.b()
            xk.e r6 = xk.e.FILL
            if (r5 == r6) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r2 = r8
        L_0x0068:
            al.a r8 = r7.f33220a
            r8.K(r0)
            al.a r8 = r7.f33220a
            r8.E(r1)
            al.a r8 = r7.f33220a
            r8.F(r3)
            al.a r8 = r7.f33220a
            r8.M(r4)
            al.a r8 = r7.f33220a
            r8.Q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.a.g(android.content.res.TypedArray):void");
    }

    public void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.smarteist.autoimageslider.a.D, 0, 0);
        f(obtainStyledAttributes);
        e(obtainStyledAttributes);
        d(obtainStyledAttributes);
        g(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
