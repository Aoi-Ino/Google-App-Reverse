package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class y2 extends x2 {
    private static final SparseIntArray J;
    private final ConstraintLayout F;
    private final LinearLayout G;
    private final sc H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.header_layout, 5);
        sparseIntArray.put(R.id.paymentFeeFL, 7);
        sparseIntArray.put(R.id.shimmer_view_container, 8);
        sparseIntArray.put(R.id.paymentWv, 9);
        sparseIntArray.put(R.id.paymentFeeWv, 10);
        sparseIntArray.put(R.id.close_iv, 11);
    }

    public y2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 12, (h.i) null, J));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.I = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.I = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private y2(androidx.databinding.e r16, android.view.View r17, java.lang.Object[] r18) {
        /*
            r15 = this;
            r13 = r15
            r3 = 0
            r0 = 11
            r0 = r18[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 5
            r0 = r18[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0017
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r5 = r0
            goto L_0x0018
        L_0x0017:
            r5 = r14
        L_0x0018:
            r0 = 2
            r0 = r18[r0]
            r6 = r0
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 1
            r0 = r18[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 4
            r0 = r18[r0]
            if (r0 == 0) goto L_0x0031
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r8 = r0
            goto L_0x0032
        L_0x0031:
            r8 = r14
        L_0x0032:
            r0 = 7
            r0 = r18[r0]
            r9 = r0
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r0 = 10
            r0 = r18[r0]
            r10 = r0
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            r0 = 9
            r0 = r18[r0]
            r11 = r0
            android.webkit.WebView r11 = (android.webkit.WebView) r11
            r0 = 8
            r0 = r18[r0]
            r12 = r0
            com.facebook.shimmer.ShimmerFrameLayout r12 = (com.facebook.shimmer.ShimmerFrameLayout) r12
            r0 = r15
            r1 = r16
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.I = r0
            android.widget.FrameLayout r0 = r13.f29289y
            r0.setTag(r14)
            android.widget.LinearLayout r0 = r13.f29290z
            r0.setTag(r14)
            r0 = 0
            r0 = r18[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r13.F = r0
            r0.setTag(r14)
            r0 = 3
            r0 = r18[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.G = r0
            r0.setTag(r14)
            r0 = 6
            r0 = r18[r0]
            if (r0 == 0) goto L_0x0082
            android.view.View r0 = (android.view.View) r0
            ni.sc r14 = ni.sc.a(r0)
        L_0x0082:
            r13.H = r14
            r0 = r17
            r15.w(r0)
            r15.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.y2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
