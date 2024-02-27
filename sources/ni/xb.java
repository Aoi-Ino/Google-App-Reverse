package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class xb extends wb {
    private static final SparseIntArray H;
    private final ConstraintLayout D;
    private final LinearLayout E;
    private final sc F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.paymentFeeFL, 5);
        sparseIntArray.put(R.id.shimmer_view_container, 6);
        sparseIntArray.put(R.id.paymentWv, 7);
        sparseIntArray.put(R.id.paymentFeeWv, 8);
        sparseIntArray.put(R.id.close_iv, 9);
    }

    public xb(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 10, (h.i) null, H));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.G = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.G = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private xb(androidx.databinding.e r13, android.view.View r14, java.lang.Object[] r15) {
        /*
            r12 = this;
            r3 = 0
            r0 = 9
            r0 = r15[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 3
            r0 = r15[r0]
            r11 = 0
            if (r0 == 0) goto L_0x0016
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r5 = r0
            goto L_0x0017
        L_0x0016:
            r5 = r11
        L_0x0017:
            r0 = 1
            r0 = r15[r0]
            r6 = r0
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 5
            r0 = r15[r0]
            r7 = r0
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r0 = 8
            r0 = r15[r0]
            r8 = r0
            android.webkit.WebView r8 = (android.webkit.WebView) r8
            r0 = 7
            r0 = r15[r0]
            r9 = r0
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            r0 = 6
            r0 = r15[r0]
            r10 = r0
            com.facebook.shimmer.ShimmerFrameLayout r10 = (com.facebook.shimmer.ShimmerFrameLayout) r10
            r0 = r12
            r1 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r12.G = r0
            android.widget.FrameLayout r13 = r12.f29229y
            r13.setTag(r11)
            r13 = 0
            r13 = r15[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.D = r13
            r13.setTag(r11)
            r13 = 2
            r13 = r15[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.E = r13
            r13.setTag(r11)
            r13 = 4
            r13 = r15[r13]
            if (r13 == 0) goto L_0x0064
            android.view.View r13 = (android.view.View) r13
            ni.sc r11 = ni.sc.a(r13)
        L_0x0064:
            r12.F = r11
            r12.w(r14)
            r12.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.xb.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
