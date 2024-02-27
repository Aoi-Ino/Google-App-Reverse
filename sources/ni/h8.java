package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class h8 extends g8 {
    private static final SparseIntArray K;
    private final RelativeLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.select_service, 2);
        sparseIntArray.put(R.id.tv_cl_Details, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_image, 5);
        sparseIntArray.put(R.id.services_text, 6);
        sparseIntArray.put(R.id.chk_renewal_cl, 7);
        sparseIntArray.put(R.id.chk_coa_cl, 8);
        sparseIntArray.put(R.id.chk_duplicate_cl, 9);
        sparseIntArray.put(R.id.chk_name_cl, 10);
        sparseIntArray.put(R.id.save_screen, 11);
        sparseIntArray.put(R.id.save_continue_to_next, 12);
    }

    public h8(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 13, (h.i) null, K));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.J = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.J = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h8(androidx.databinding.e r19, android.view.View r20, java.lang.Object[] r21) {
        /*
            r18 = this;
            r15 = r18
            r3 = 0
            r0 = 8
            r0 = r21[r0]
            r4 = r0
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r0 = 9
            r0 = r21[r0]
            r5 = r0
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r0 = 10
            r0 = r21[r0]
            r6 = r0
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r0 = 7
            r0 = r21[r0]
            r7 = r0
            android.widget.CheckBox r7 = (android.widget.CheckBox) r7
            r0 = 5
            r0 = r21[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 1
            r0 = r21[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0032
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r9 = r0
            goto L_0x0033
        L_0x0032:
            r9 = r14
        L_0x0033:
            r0 = 4
            r0 = r21[r0]
            r10 = r0
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            r0 = 12
            r0 = r21[r0]
            r11 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r11 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r11
            r0 = 11
            r0 = r21[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r12 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r12
            r0 = 2
            r0 = r21[r0]
            r13 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r13 = (com.nic.mparivahan.dlservices.widget.MyTextView) r13
            r0 = 6
            r0 = r21[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 3
            r0 = r21[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = r18
            r1 = r19
            r2 = r20
            r14 = r16
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r18
            r2.J = r0
            r0 = 0
            r0 = r21[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.I = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r20
            r2.w(r0)
            r18.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.h8.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
