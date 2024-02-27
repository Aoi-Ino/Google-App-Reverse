package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class w7 extends v7 {
    private static final SparseIntArray P;
    private final RelativeLayout L;
    private final LinearLayout M;
    private final nc N;
    private long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.dl_no_txt, 4);
        sparseIntArray.put(R.id.select_service, 5);
        sparseIntArray.put(R.id.icon_image, 6);
        sparseIntArray.put(R.id.round_card_view, 7);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 8);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 9);
        sparseIntArray.put(R.id.tv_old_mob_no, 10);
        sparseIntArray.put(R.id.old_mob_number, 11);
        sparseIntArray.put(R.id.tv_new_mob_no, 12);
        sparseIntArray.put(R.id.new_mob_number, 13);
        sparseIntArray.put(R.id.tv_remark_reason, 14);
        sparseIntArray.put(R.id.remark_reason_et, 15);
        sparseIntArray.put(R.id.cancel_cwl, 16);
        sparseIntArray.put(R.id.submit_cwl, 17);
    }

    public w7(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 18, (h.i) null, P));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.O = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.O = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w7(androidx.databinding.e r21, android.view.View r22, java.lang.Object[] r23) {
        /*
            r20 = this;
            r9 = r20
            r3 = 0
            r0 = 16
            r0 = r23[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r4
            r0 = 4
            r0 = r23[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 9
            r0 = r23[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 6
            r0 = r23[r0]
            r7 = r0
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            r0 = 8
            r0 = r23[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 2
            r0 = r23[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0033
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r19 = r0
            goto L_0x0035
        L_0x0033:
            r19 = r2
        L_0x0035:
            r0 = 13
            r0 = r23[r0]
            r10 = r0
            androidx.appcompat.widget.AppCompatEditText r10 = (androidx.appcompat.widget.AppCompatEditText) r10
            r0 = 11
            r0 = r23[r0]
            r11 = r0
            androidx.appcompat.widget.AppCompatEditText r11 = (androidx.appcompat.widget.AppCompatEditText) r11
            r0 = 15
            r0 = r23[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 7
            r0 = r23[r0]
            r13 = r0
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            r0 = 5
            r0 = r23[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r14 = (com.nic.mparivahan.dlservices.widget.MyTextView) r14
            r0 = 17
            r0 = r23[r0]
            r15 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r15 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r15
            r0 = 12
            r0 = r23[r0]
            r16 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r16 = (com.nic.mparivahan.dlservices.widget.MyTextView) r16
            r0 = 10
            r0 = r23[r0]
            r17 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r17 = (com.nic.mparivahan.dlservices.widget.MyTextView) r17
            r0 = 14
            r0 = r23[r0]
            r18 = r0
            androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
            r0 = r20
            r1 = r21
            r2 = r22
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = -1
            r2 = r20
            r2.O = r0
            r0 = 0
            r0 = r23[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.L = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r23[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.M = r0
            r0.setTag(r1)
            r0 = 3
            r0 = r23[r0]
            if (r0 == 0) goto L_0x00a7
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            goto L_0x00a8
        L_0x00a7:
            r0 = r1
        L_0x00a8:
            r2.N = r0
            r0 = r22
            r2.w(r0)
            r20.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.w7.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
