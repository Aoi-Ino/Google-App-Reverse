package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class s7 extends r7 {
    private static final SparseIntArray G;
    private final ConstraintLayout C;
    private final LinearLayout D;
    private final sc E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.paymentFeeFL, 5);
        sparseIntArray.put(R.id.shimmer_view_container, 6);
        sparseIntArray.put(R.id.reprint_rec, 7);
        sparseIntArray.put(R.id.close_iv, 8);
    }

    public s7(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 9, (h.i) null, G));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.F = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.F = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s7(androidx.databinding.e r12, android.view.View r13, java.lang.Object[] r14) {
        /*
            r11 = this;
            r3 = 0
            r0 = 8
            r0 = r14[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 3
            r0 = r14[r0]
            r10 = 0
            if (r0 == 0) goto L_0x0016
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r5 = r0
            goto L_0x0017
        L_0x0016:
            r5 = r10
        L_0x0017:
            r0 = 1
            r0 = r14[r0]
            r6 = r0
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 5
            r0 = r14[r0]
            r7 = r0
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r0 = 7
            r0 = r14[r0]
            r8 = r0
            android.webkit.WebView r8 = (android.webkit.WebView) r8
            r0 = 6
            r0 = r14[r0]
            r9 = r0
            com.facebook.shimmer.ShimmerFrameLayout r9 = (com.facebook.shimmer.ShimmerFrameLayout) r9
            r0 = r11
            r1 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.F = r0
            android.widget.FrameLayout r12 = r11.f28388y
            r12.setTag(r10)
            r12 = 0
            r12 = r14[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r11.C = r12
            r12.setTag(r10)
            r12 = 2
            r12 = r14[r12]
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r11.D = r12
            r12.setTag(r10)
            r12 = 4
            r12 = r14[r12]
            if (r12 == 0) goto L_0x005d
            android.view.View r12 = (android.view.View) r12
            ni.sc r10 = ni.sc.a(r12)
        L_0x005d:
            r11.E = r10
            r11.w(r13)
            r11.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.s7.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
