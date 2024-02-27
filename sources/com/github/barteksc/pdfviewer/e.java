package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import android.util.Pair;
import com.github.barteksc.pdfviewer.PDFView;
import s2.b;
import s2.c;

class e {

    /* renamed from: a  reason: collision with root package name */
    private PDFView f5149a;

    /* renamed from: b  reason: collision with root package name */
    private int f5150b;

    /* renamed from: c  reason: collision with root package name */
    private float f5151c;

    /* renamed from: d  reason: collision with root package name */
    private float f5152d;

    /* renamed from: e  reason: collision with root package name */
    private Pair f5153e;

    /* renamed from: f  reason: collision with root package name */
    private float f5154f;

    /* renamed from: g  reason: collision with root package name */
    private float f5155g;

    /* renamed from: h  reason: collision with root package name */
    private float f5156h;

    /* renamed from: i  reason: collision with root package name */
    private float f5157i;

    /* renamed from: j  reason: collision with root package name */
    private float f5158j;

    /* renamed from: k  reason: collision with root package name */
    private float f5159k;

    /* renamed from: l  reason: collision with root package name */
    private float f5160l;

    /* renamed from: m  reason: collision with root package name */
    private float f5161m;

    /* renamed from: n  reason: collision with root package name */
    private int f5162n;

    /* renamed from: o  reason: collision with root package name */
    private int f5163o;

    /* renamed from: p  reason: collision with root package name */
    private float f5164p;

    /* renamed from: q  reason: collision with root package name */
    private final RectF f5165q = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    private class b {

        /* renamed from: a  reason: collision with root package name */
        int f5166a;

        /* renamed from: b  reason: collision with root package name */
        int f5167b;

        /* renamed from: c  reason: collision with root package name */
        int f5168c;

        private b() {
        }
    }

    e(PDFView pDFView) {
        this.f5149a = pDFView;
    }

    private int a(int i10) {
        int i11;
        if (this.f5149a.getOriginalUserPages() == null) {
            i11 = i10;
        } else if (i10 < 0 || i10 >= this.f5149a.getOriginalUserPages().length) {
            return -1;
        } else {
            i11 = this.f5149a.getOriginalUserPages()[i10];
        }
        if (i11 < 0 || i10 >= this.f5149a.getDocumentPageCount()) {
            return -1;
        }
        return i11;
    }

    private b b(float f10, boolean z10) {
        float f11;
        float f12;
        int b10;
        b bVar = new b();
        float f13 = -c.d(f10, 0.0f);
        if (this.f5149a.D()) {
            int b11 = c.b(f13 / (this.f5151c + this.f5164p));
            bVar.f5166a = b11;
            f11 = Math.abs(f13 - ((this.f5151c + this.f5164p) * ((float) b11))) / this.f5156h;
            f12 = this.f5154f / this.f5157i;
        } else {
            int b12 = c.b(f13 / (this.f5152d + this.f5164p));
            bVar.f5166a = b12;
            f12 = Math.abs(f13 - ((this.f5152d + this.f5164p) * ((float) b12))) / this.f5157i;
            f11 = this.f5155g / this.f5156h;
        }
        if (z10) {
            bVar.f5167b = c.a(f11);
            b10 = c.a(f12);
        } else {
            bVar.f5167b = c.b(f11);
            b10 = c.b(f12);
        }
        bVar.f5168c = b10;
        return bVar;
    }

    private Pair c() {
        float optimalPageHeight = (s2.b.f15879c * (1.0f / this.f5149a.getOptimalPageHeight())) / this.f5149a.getZoom();
        return new Pair(Integer.valueOf(c.a(1.0f / ((s2.b.f15879c * (1.0f / this.f5149a.getOptimalPageWidth())) / this.f5149a.getZoom()))), Integer.valueOf(c.a(1.0f / optimalPageHeight)));
    }

    private boolean d(int i10, int i11, int i12, int i13, float f10, float f11) {
        float f12 = ((float) i13) * f10;
        float f13 = ((float) i12) * f11;
        float f14 = this.f5160l;
        float f15 = this.f5161m;
        float f16 = f12 + f10 > 1.0f ? 1.0f - f12 : f10;
        float f17 = f13 + f11 > 1.0f ? 1.0f - f13 : f11;
        float f18 = f14 * f16;
        float f19 = f15 * f17;
        RectF rectF = new RectF(f12, f13, f16 + f12, f17 + f13);
        if (f18 <= 0.0f || f19 <= 0.0f) {
            return false;
        }
        if (!this.f5149a.f5076i.j(i10, i11, f18, f19, rectF, this.f5150b)) {
            PDFView pDFView = this.f5149a;
            pDFView.C.b(i10, i11, f18, f19, rectF, false, this.f5150b, pDFView.C(), this.f5149a.B());
        }
        this.f5150b++;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int f(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r10.f5149a
            boolean r0 = r0.D()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            float r0 = r10.f5156h
            float r11 = (float) r11
            float r0 = r0 * r11
            r11 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r11
            com.github.barteksc.pdfviewer.PDFView r11 = r10.f5149a
            float r11 = r11.getCurrentYOffset()
            if (r13 == 0) goto L_0x001f
            com.github.barteksc.pdfviewer.PDFView r13 = r10.f5149a
            int r13 = r13.getHeight()
            goto L_0x0020
        L_0x001f:
            r13 = r1
        L_0x0020:
            float r13 = (float) r13
            float r11 = r11 - r13
            float r11 = r11 - r0
            goto L_0x0037
        L_0x0024:
            float r0 = r10.f5157i
            float r11 = (float) r11
            float r0 = r0 * r11
            com.github.barteksc.pdfviewer.PDFView r11 = r10.f5149a
            float r11 = r11.getCurrentXOffset()
            if (r13 == 0) goto L_0x001f
            com.github.barteksc.pdfviewer.PDFView r13 = r10.f5149a
            int r13 = r13.getWidth()
            goto L_0x0020
        L_0x0037:
            com.github.barteksc.pdfviewer.e$b r11 = r10.b(r11, r1)
            int r13 = r11.f5166a
            int r13 = r10.a(r13)
            if (r13 >= 0) goto L_0x0044
            return r1
        L_0x0044:
            int r0 = r11.f5166a
            r10.g(r0, r13)
            com.github.barteksc.pdfviewer.PDFView r0 = r10.f5149a
            boolean r0 = r0.D()
            if (r0 == 0) goto L_0x009c
            float r0 = r10.f5154f
            float r2 = r10.f5157i
            float r0 = r0 / r2
            int r0 = s2.c.b(r0)
            int r0 = r0 + -1
            int r0 = s2.c.f(r0, r1)
            float r2 = r10.f5154f
            com.github.barteksc.pdfviewer.PDFView r3 = r10.f5149a
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 + r3
            float r3 = r10.f5157i
            float r2 = r2 / r3
            int r2 = s2.c.a(r2)
            int r2 = r2 + 1
            android.util.Pair r3 = r10.f5153e
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r9 = s2.c.e(r2, r3)
        L_0x0081:
            if (r0 > r9) goto L_0x00e7
            int r3 = r11.f5166a
            int r5 = r11.f5167b
            float r7 = r10.f5158j
            float r8 = r10.f5159k
            r2 = r10
            r4 = r13
            r6 = r0
            boolean r2 = r2.d(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0096
            int r1 = r1 + 1
        L_0x0096:
            if (r1 < r12) goto L_0x0099
            return r1
        L_0x0099:
            int r0 = r0 + 1
            goto L_0x0081
        L_0x009c:
            float r0 = r10.f5155g
            float r2 = r10.f5156h
            float r0 = r0 / r2
            int r0 = s2.c.b(r0)
            int r0 = r0 + -1
            int r0 = s2.c.f(r0, r1)
            float r2 = r10.f5155g
            com.github.barteksc.pdfviewer.PDFView r3 = r10.f5149a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 + r3
            float r3 = r10.f5156h
            float r2 = r2 / r3
            int r2 = s2.c.a(r2)
            int r2 = r2 + 1
            android.util.Pair r3 = r10.f5153e
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r9 = s2.c.e(r2, r3)
        L_0x00cc:
            if (r0 > r9) goto L_0x00e7
            int r3 = r11.f5166a
            int r6 = r11.f5168c
            float r7 = r10.f5158j
            float r8 = r10.f5159k
            r2 = r10
            r4 = r13
            r5 = r0
            boolean r2 = r2.d(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00e1
            int r1 = r1 + 1
        L_0x00e1:
            if (r1 < r12) goto L_0x00e4
            return r1
        L_0x00e4:
            int r0 = r0 + 1
            goto L_0x00cc
        L_0x00e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.e.f(int, int, boolean):int");
    }

    private void g(int i10, int i11) {
        if (!this.f5149a.f5076i.c(i10, i11, (float) this.f5162n, (float) this.f5163o, this.f5165q)) {
            PDFView pDFView = this.f5149a;
            pDFView.C.b(i10, i11, (float) this.f5162n, (float) this.f5163o, this.f5165q, true, 0, pDFView.C(), this.f5149a.B());
        }
    }

    public void e() {
        PDFView pDFView = this.f5149a;
        this.f5151c = pDFView.W(pDFView.getOptimalPageHeight());
        PDFView pDFView2 = this.f5149a;
        this.f5152d = pDFView2.W(pDFView2.getOptimalPageWidth());
        this.f5162n = (int) (this.f5149a.getOptimalPageWidth() * s2.b.f15878b);
        this.f5163o = (int) (this.f5149a.getOptimalPageHeight() * s2.b.f15878b);
        this.f5153e = c();
        this.f5154f = -c.d(this.f5149a.getCurrentXOffset(), 0.0f);
        this.f5155g = -c.d(this.f5149a.getCurrentYOffset(), 0.0f);
        this.f5156h = this.f5151c / ((float) ((Integer) this.f5153e.second).intValue());
        this.f5157i = this.f5152d / ((float) ((Integer) this.f5153e.first).intValue());
        this.f5158j = 1.0f / ((float) ((Integer) this.f5153e.first).intValue());
        float intValue = 1.0f / ((float) ((Integer) this.f5153e.second).intValue());
        this.f5159k = intValue;
        float f10 = s2.b.f15879c;
        this.f5160l = f10 / this.f5158j;
        this.f5161m = f10 / intValue;
        this.f5150b = 1;
        PDFView pDFView3 = this.f5149a;
        float W = pDFView3.W((float) pDFView3.getSpacingPx());
        this.f5164p = W;
        this.f5164p = W - (W / ((float) this.f5149a.getPageCount()));
        int h10 = h();
        if (this.f5149a.getScrollDir().equals(PDFView.c.END)) {
            for (int i10 = 0; i10 < s2.b.f15880d && h10 < b.a.f15881a; i10++) {
                h10 += f(i10, h10, true);
            }
            return;
        }
        for (int i11 = 0; i11 > (-s2.b.f15880d) && h10 < b.a.f15881a; i11--) {
            h10 += f(i11, h10, false);
        }
    }

    public int h() {
        int i10;
        b bVar;
        int i11;
        int i12;
        if (!this.f5149a.D()) {
            bVar = b(this.f5149a.getCurrentXOffset(), false);
            b b10 = b((this.f5149a.getCurrentXOffset() - ((float) this.f5149a.getWidth())) + 1.0f, true);
            if (bVar.f5166a == b10.f5166a) {
                i11 = (b10.f5168c - bVar.f5168c) + 1;
            } else {
                int intValue = ((Integer) this.f5153e.first).intValue() - bVar.f5168c;
                for (int i13 = bVar.f5166a + 1; i13 < b10.f5166a; i13++) {
                    intValue += ((Integer) this.f5153e.first).intValue();
                }
                i11 = b10.f5168c + 1 + intValue;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = b.a.f15881a;
                if (i10 >= i16) {
                    break;
                }
                i14 = i10 + f(i15, i16 - i10, false);
            }
        } else {
            bVar = b(this.f5149a.getCurrentYOffset(), false);
            b b11 = b((this.f5149a.getCurrentYOffset() - ((float) this.f5149a.getHeight())) + 1.0f, true);
            if (bVar.f5166a == b11.f5166a) {
                i12 = (b11.f5167b - bVar.f5167b) + 1;
            } else {
                int intValue2 = ((Integer) this.f5153e.second).intValue() - bVar.f5167b;
                for (int i17 = bVar.f5166a + 1; i17 < b11.f5166a; i17++) {
                    intValue2 += ((Integer) this.f5153e.second).intValue();
                }
                i12 = b11.f5167b + 1 + intValue2;
            }
            i10 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                int i19 = b.a.f15881a;
                if (i10 >= i19) {
                    break;
                }
                i10 += f(i18, i19 - i10, false);
            }
        }
        int a10 = a(bVar.f5166a - 1);
        if (a10 >= 0) {
            g(bVar.f5166a - 1, a10);
        }
        int a11 = a(bVar.f5166a + 1);
        if (a11 >= 0) {
            g(bVar.f5166a + 1, a11);
        }
        return i10;
    }
}
