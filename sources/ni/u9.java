package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class u9 extends t9 {
    private static final SparseIntArray H;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.mvvm_back, 3);
        sparseIntArray.put(R.id.mvvm_home, 4);
        sparseIntArray.put(R.id.application_ll, 5);
        sparseIntArray.put(R.id.application_No_Tv, 6);
        sparseIntArray.put(R.id.application_sarathi_url, 7);
        sparseIntArray.put(R.id.imageView6, 8);
        sparseIntArray.put(R.id.done, 9);
    }

    public u9(e eVar, View view) {
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
    private u9(androidx.databinding.e r17, android.view.View r18, java.lang.Object[] r19) {
        /*
            r16 = this;
            r14 = r16
            r3 = 0
            r0 = 5
            r0 = r19[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 6
            r0 = r19[r0]
            r5 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r5 = (com.nic.mparivahan.dlservices.widget.MyTextView) r5
            r0 = 7
            r0 = r19[r0]
            r6 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r6 = (com.nic.mparivahan.dlservices.widget.MyTextView) r6
            r0 = 9
            r0 = r19[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2
            r0 = r19[r0]
            r15 = 0
            if (r0 == 0) goto L_0x002a
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r8 = r0
            goto L_0x002b
        L_0x002a:
            r8 = r15
        L_0x002b:
            r0 = 8
            r0 = r19[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 1
            r0 = r19[r0]
            if (r0 == 0) goto L_0x003f
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r10 = r0
            goto L_0x0040
        L_0x003f:
            r10 = r15
        L_0x0040:
            r0 = 3
            r0 = r19[r0]
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 4
            r0 = r19[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 0
            r0 = r19[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.G = r0
            android.widget.LinearLayout r0 = r14.F
            r0.setTag(r15)
            r0 = r18
            r14.w(r0)
            r16.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.u9.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
