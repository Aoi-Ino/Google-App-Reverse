package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class h5 extends g5 {
    private static final SparseIntArray J;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mvvm_back, 2);
        sparseIntArray.put(R.id.main_icon, 3);
        sparseIntArray.put(R.id.service_label, 4);
        sparseIntArray.put(R.id.round_card_view, 5);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 6);
        sparseIntArray.put(R.id.container_cl, 7);
        sparseIntArray.put(R.id.application_No_Tv, 8);
        sparseIntArray.put(R.id.imageView6, 9);
        sparseIntArray.put(R.id.save_screen, 10);
        sparseIntArray.put(R.id.save_continue_to_next, 11);
    }

    public h5(e eVar, View view) {
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

    public void z() {
        synchronized (this) {
            this.I = 2;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h5(androidx.databinding.e r19, android.view.View r20, java.lang.Object[] r21) {
        /*
            r18 = this;
            r15 = r18
            r3 = 0
            r0 = 8
            r0 = r21[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = (com.nic.mparivahan.dlservices.widget.MyTextView) r4
            r0 = 7
            r0 = r21[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 9
            r0 = r21[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 6
            r0 = r21[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 3
            r0 = r21[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 1
            r0 = r21[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0031
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r9 = r0
            goto L_0x0032
        L_0x0031:
            r9 = r14
        L_0x0032:
            r0 = 2
            r0 = r21[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 5
            r0 = r21[r0]
            r11 = r0
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            r0 = 11
            r0 = r21[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r12 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r12
            r0 = 10
            r0 = r21[r0]
            r13 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r13 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r13
            r0 = 4
            r0 = r21[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 0
            r0 = r21[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = r18
            r1 = r19
            r2 = r20
            r14 = r16
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r18
            r2.I = r0
            android.widget.LinearLayout r0 = r2.H
            r1 = 0
            r0.setTag(r1)
            r0 = r20
            r2.w(r0)
            r18.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.h5.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
