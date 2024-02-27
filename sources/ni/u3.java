package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class u3 extends t3 {
    private static final SparseIntArray L;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 1);
        sparseIntArray.put(R.id.dl_details_title, 2);
        sparseIntArray.put(R.id.dl_details_checked, 3);
        sparseIntArray.put(R.id.view, 4);
        sparseIntArray.put(R.id.dl_details_unchecked1, 5);
        sparseIntArray.put(R.id.view2, 6);
        sparseIntArray.put(R.id.dl_details_unchecked2, 7);
        sparseIntArray.put(R.id.dl_details_tv, 8);
        sparseIntArray.put(R.id.textView5, 9);
        sparseIntArray.put(R.id.acknowledgemnet_tv, 10);
        sparseIntArray.put(R.id.center_ll, 11);
        sparseIntArray.put(R.id.notes, 12);
        sparseIntArray.put(R.id.save_continue_to_next, 13);
    }

    public u3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 14, (h.i) null, L));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.K = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.K = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u3(androidx.databinding.e r20, android.view.View r21, java.lang.Object[] r22) {
        /*
            r19 = this;
            r11 = r19
            r3 = 0
            r0 = 10
            r0 = r22[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 11
            r0 = r22[r0]
            r5 = r0
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            r0 = 3
            r0 = r22[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 2
            r0 = r22[r0]
            r7 = r0
            com.nic.mparivahan.MyTextView r7 = (com.nic.mparivahan.MyTextView) r7
            r0 = 8
            r0 = r22[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 5
            r0 = r22[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 7
            r0 = r22[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 1
            r0 = r22[r0]
            r2 = 0
            if (r0 == 0) goto L_0x003f
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r18 = r0
            goto L_0x0041
        L_0x003f:
            r18 = r2
        L_0x0041:
            r0 = 12
            r0 = r22[r0]
            r12 = r0
            com.nic.mparivahan.MyTextView r12 = (com.nic.mparivahan.MyTextView) r12
            r0 = 13
            r0 = r22[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 0
            r0 = r22[r0]
            r14 = r0
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r0 = 9
            r0 = r22[r0]
            r15 = r0
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0 = 4
            r0 = r22[r0]
            r16 = r0
            android.view.View r16 = (android.view.View) r16
            r0 = 6
            r0 = r22[r0]
            r17 = r0
            android.view.View r17 = (android.view.View) r17
            r0 = r19
            r1 = r20
            r2 = r21
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = -1
            r2 = r19
            r2.K = r0
            android.widget.LinearLayout r0 = r2.G
            r1 = 0
            r0.setTag(r1)
            r0 = r21
            r2.w(r0)
            r19.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.u3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
