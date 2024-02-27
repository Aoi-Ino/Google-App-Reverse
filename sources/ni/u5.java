package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class u5 extends t5 {
    private static final SparseIntArray W;
    private final LinearLayout T;
    private final LinearLayout U;
    private long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(R.id.layout, 2);
        sparseIntArray.put(R.id.dl_no_txt, 3);
        sparseIntArray.put(R.id.select_service, 4);
        sparseIntArray.put(R.id.icon_image, 5);
        sparseIntArray.put(R.id.round_card_view, 6);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 7);
        sparseIntArray.put(R.id.tv_dl_no, 8);
        sparseIntArray.put(R.id.dl_number, 9);
        sparseIntArray.put(R.id.linear_mob, 10);
        sparseIntArray.put(R.id.chassi_number, 11);
        sparseIntArray.put(R.id.mob_number, 12);
        sparseIntArray.put(R.id.linear_otp, 13);
        sparseIntArray.put(R.id.demo_top, 14);
        sparseIntArray.put(R.id.tv_otp, 15);
        sparseIntArray.put(R.id.et_otp, 16);
        sparseIntArray.put(R.id.otp_time, 17);
        sparseIntArray.put(R.id.time_text, 18);
        sparseIntArray.put(R.id.resendOtp, 19);
        sparseIntArray.put(R.id.tv_note, 20);
        sparseIntArray.put(R.id.tv_note_one, 21);
        sparseIntArray.put(R.id.tv_note_two, 22);
        sparseIntArray.put(R.id.reset_button, 23);
        sparseIntArray.put(R.id.submit, 24);
    }

    public u5(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 25, (h.i) null, W));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.V = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.V = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u5(androidx.databinding.e r29, android.view.View r30, java.lang.Object[] r31) {
        /*
            r28 = this;
            r11 = r28
            r3 = 0
            r0 = 11
            r0 = r31[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = (com.nic.mparivahan.dlservices.widget.MyTextView) r4
            r0 = 14
            r0 = r31[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            r0 = 3
            r0 = r31[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 9
            r0 = r31[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 16
            r0 = r31[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatEditText r8 = (androidx.appcompat.widget.AppCompatEditText) r8
            r0 = 5
            r0 = r31[r0]
            r9 = r0
            androidx.cardview.widget.CardView r9 = (androidx.cardview.widget.CardView) r9
            r0 = 7
            r0 = r31[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 2
            r0 = r31[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0040
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r27 = r0
            goto L_0x0042
        L_0x0040:
            r27 = r2
        L_0x0042:
            r0 = 10
            r0 = r31[r0]
            r12 = r0
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r0 = 13
            r0 = r31[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 12
            r0 = r31[r0]
            r14 = r0
            androidx.appcompat.widget.AppCompatEditText r14 = (androidx.appcompat.widget.AppCompatEditText) r14
            r0 = 17
            r0 = r31[r0]
            r15 = r0
            androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
            r0 = 19
            r0 = r31[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 23
            r0 = r31[r0]
            r17 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r17 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r17
            r0 = 6
            r0 = r31[r0]
            r18 = r0
            androidx.cardview.widget.CardView r18 = (androidx.cardview.widget.CardView) r18
            r0 = 4
            r0 = r31[r0]
            r19 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r19 = (com.nic.mparivahan.dlservices.widget.MyTextView) r19
            r0 = 24
            r0 = r31[r0]
            r20 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r20 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r20
            r0 = 18
            r0 = r31[r0]
            r21 = r0
            com.nic.mparivahan.MyTextView r21 = (com.nic.mparivahan.MyTextView) r21
            r0 = 8
            r0 = r31[r0]
            r22 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r22 = (com.nic.mparivahan.dlservices.widget.MyTextView) r22
            r0 = 20
            r0 = r31[r0]
            r23 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r23 = (com.nic.mparivahan.dlservices.widget.MyTextView) r23
            r0 = 21
            r0 = r31[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 22
            r0 = r31[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 15
            r0 = r31[r0]
            r26 = r0
            androidx.appcompat.widget.AppCompatTextView r26 = (androidx.appcompat.widget.AppCompatTextView) r26
            r0 = r28
            r1 = r29
            r2 = r30
            r11 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = -1
            r2 = r28
            r2.V = r0
            r0 = 0
            r0 = r31[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.T = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r31[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.U = r0
            r0.setTag(r1)
            r0 = r30
            r2.w(r0)
            r28.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.u5.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
