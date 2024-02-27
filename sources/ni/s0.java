package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class s0 extends r0 {
    private static final SparseIntArray I;
    private final ConstraintLayout E;
    private final LinearLayout F;
    private final sc G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.paymentFeeFL, 6);
        sparseIntArray.put(R.id.shimmer_view_container, 7);
        sparseIntArray.put(R.id.paymentWv, 8);
        sparseIntArray.put(R.id.paymentFeeWv, 9);
        sparseIntArray.put(R.id.close_iv, 10);
    }

    public s0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 11, (h.i) null, I));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.H = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.H = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s0(androidx.databinding.e r15, android.view.View r16, java.lang.Object[] r17) {
        /*
            r14 = this;
            r12 = r14
            r3 = 0
            r0 = 10
            r0 = r17[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 3
            r0 = r17[r0]
            r13 = 0
            if (r0 == 0) goto L_0x0017
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r5 = r0
            goto L_0x0018
        L_0x0017:
            r5 = r13
        L_0x0018:
            r0 = 1
            r0 = r17[r0]
            r6 = r0
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 4
            r0 = r17[r0]
            if (r0 == 0) goto L_0x002b
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r7 = r0
            goto L_0x002c
        L_0x002b:
            r7 = r13
        L_0x002c:
            r0 = 6
            r0 = r17[r0]
            r8 = r0
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r0 = 9
            r0 = r17[r0]
            r9 = r0
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            r0 = 8
            r0 = r17[r0]
            r10 = r0
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            r0 = 7
            r0 = r17[r0]
            r11 = r0
            com.facebook.shimmer.ShimmerFrameLayout r11 = (com.facebook.shimmer.ShimmerFrameLayout) r11
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r12.H = r0
            android.widget.FrameLayout r0 = r12.f28319y
            r0.setTag(r13)
            r0 = 0
            r0 = r17[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r12.E = r0
            r0.setTag(r13)
            r0 = 2
            r0 = r17[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r12.F = r0
            r0.setTag(r13)
            r0 = 5
            r0 = r17[r0]
            if (r0 == 0) goto L_0x0075
            android.view.View r0 = (android.view.View) r0
            ni.sc r13 = ni.sc.a(r0)
        L_0x0075:
            r12.G = r13
            r0 = r16
            r14.w(r0)
            r14.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.s0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
