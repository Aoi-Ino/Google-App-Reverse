package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class g3 extends f3 {
    private static final SparseIntArray N;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.multi_head_layout, 2);
        sparseIntArray.put(R.id.mvvm_back, 3);
        sparseIntArray.put(R.id.service_label_ack, 4);
        sparseIntArray.put(R.id.mvvm_home, 5);
        sparseIntArray.put(R.id.round_card_view, 6);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 7);
        sparseIntArray.put(R.id.container_cl, 8);
        sparseIntArray.put(R.id.application_No_Tv, 9);
        sparseIntArray.put(R.id.imageView6, 10);
        sparseIntArray.put(R.id.download_acknow, 11);
        sparseIntArray.put(R.id.save_continue_to_next, 12);
        sparseIntArray.put(R.id.screenshot_fb, 13);
        sparseIntArray.put(R.id.tv_save_image, 14);
        sparseIntArray.put(R.id.tv_save_forms, 15);
    }

    public g3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 16, (h.i) null, N));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.M = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.M = 2;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g3(androidx.databinding.e r22, android.view.View r23, java.lang.Object[] r24) {
        /*
            r21 = this;
            r9 = r21
            r3 = 0
            r0 = 9
            r0 = r24[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = (com.nic.mparivahan.dlservices.widget.MyTextView) r4
            r0 = 8
            r0 = r24[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 11
            r0 = r24[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 10
            r0 = r24[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 7
            r0 = r24[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 1
            r0 = r24[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0034
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r20 = r0
            goto L_0x0036
        L_0x0034:
            r20 = r2
        L_0x0036:
            r0 = 2
            r0 = r24[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 3
            r0 = r24[r0]
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 5
            r0 = r24[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 6
            r0 = r24[r0]
            r13 = r0
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            r0 = 12
            r0 = r24[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r14 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r14
            r0 = 13
            r0 = r24[r0]
            r15 = r0
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r0 = 4
            r0 = r24[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 0
            r0 = r24[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 15
            r0 = r24[r0]
            r18 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r18 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r18
            r0 = 14
            r0 = r24[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = r21
            r1 = r22
            r2 = r23
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = -1
            r2 = r21
            r2.M = r0
            android.widget.LinearLayout r0 = r2.J
            r1 = 0
            r0.setTag(r1)
            r0 = r23
            r2.w(r0)
            r21.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.g3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
