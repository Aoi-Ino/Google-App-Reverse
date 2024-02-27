package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class g7 extends f7 {
    private static final SparseIntArray C;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.holder1, 1);
        sparseIntArray.put(R.id.pdfView, 2);
        sparseIntArray.put(R.id.progressBar, 3);
        sparseIntArray.put(R.id.downloadpdf, 4);
    }

    public g7(e eVar, View view) {
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
    private g7(androidx.databinding.e r11, android.view.View r12, java.lang.Object[] r13) {
        /*
            r10 = this;
            r3 = 0
            r0 = 4
            r0 = r13[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r4
            r0 = 1
            r0 = r13[r0]
            r9 = 0
            if (r0 == 0) goto L_0x0015
            android.view.View r0 = (android.view.View) r0
            ni.qd r0 = ni.qd.a(r0)
            r5 = r0
            goto L_0x0016
        L_0x0015:
            r5 = r9
        L_0x0016:
            r0 = 0
            r0 = r13[r0]
            r6 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r6
            r0 = 2
            r0 = r13[r0]
            r7 = r0
            com.github.barteksc.pdfviewer.PDFView r7 = (com.github.barteksc.pdfviewer.PDFView) r7
            r0 = 3
            r13 = r13[r0]
            r8 = r13
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r0 = r10
            r1 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r10.B = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r11 = r10.f26269y
            r11.setTag(r9)
            r10.w(r12)
            r10.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.g7.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
