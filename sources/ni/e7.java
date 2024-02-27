package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class e7 extends d7 {
    private static final SparseIntArray C;
    private final CoordinatorLayout A;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.holder1, 1);
        sparseIntArray.put(R.id.pdfView, 2);
        sparseIntArray.put(R.id.progressBar, 3);
        sparseIntArray.put(R.id.share, 4);
    }

    public e7(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 5, (h.i) null, C));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.B = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.B = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e7(androidx.databinding.e r10, android.view.View r11, java.lang.Object[] r12) {
        /*
            r9 = this;
            r3 = 0
            r0 = 1
            r0 = r12[r0]
            r8 = 0
            if (r0 == 0) goto L_0x000f
            android.view.View r0 = (android.view.View) r0
            ni.qd r0 = ni.qd.a(r0)
            r4 = r0
            goto L_0x0010
        L_0x000f:
            r4 = r8
        L_0x0010:
            r0 = 2
            r0 = r12[r0]
            r5 = r0
            com.pdfview.PDFView r5 = (com.pdfview.PDFView) r5
            r0 = 3
            r0 = r12[r0]
            r6 = r0
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            r0 = 4
            r0 = r12[r0]
            r7 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.B = r0
            r10 = 0
            r10 = r12[r10]
            androidx.coordinatorlayout.widget.CoordinatorLayout r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r10
            r9.A = r10
            r10.setTag(r8)
            r9.w(r11)
            r9.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.e7.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
