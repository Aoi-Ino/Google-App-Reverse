package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class m7 extends l7 {
    private static final SparseIntArray K;
    private final RelativeLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.select_service, 3);
        sparseIntArray.put(R.id.tv_cl_Details, 4);
        sparseIntArray.put(R.id.tv_view_details, 5);
        sparseIntArray.put(R.id.round_card_view, 6);
        sparseIntArray.put(R.id.iv_image, 7);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 8);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 9);
        sparseIntArray.put(R.id.tv_reason, 10);
        sparseIntArray.put(R.id.id_cancel_service, 11);
        sparseIntArray.put(R.id.id_next_service, 12);
    }

    public m7(e eVar, View view) {
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
    private m7(androidx.databinding.e r19, android.view.View r20, java.lang.Object[] r21) {
        /*
            r18 = this;
            r15 = r18
            r3 = 0
            r0 = 9
            r0 = r21[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 11
            r0 = r21[r0]
            r5 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r5 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r5
            r0 = 12
            r0 = r21[r0]
            r6 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r6
            r0 = 7
            r0 = r21[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2
            r0 = r21[r0]
            r14 = 0
            if (r0 == 0) goto L_0x002c
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r8 = r0
            goto L_0x002d
        L_0x002c:
            r8 = r14
        L_0x002d:
            r0 = 1
            r0 = r21[r0]
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r9 = r0
            goto L_0x003b
        L_0x003a:
            r9 = r14
        L_0x003b:
            r0 = 6
            r0 = r21[r0]
            r10 = r0
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            r0 = 3
            r0 = r21[r0]
            r11 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r11 = (com.nic.mparivahan.dlservices.widget.MyTextView) r11
            r0 = 4
            r0 = r21[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 8
            r0 = r21[r0]
            r13 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r13 = (com.nic.mparivahan.dlservices.widget.MyTextView) r13
            r0 = 10
            r0 = r21[r0]
            r16 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r16 = (com.nic.mparivahan.dlservices.widget.MyTextView) r16
            r0 = 5
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
        throw new UnsupportedOperationException("Method not decompiled: ni.m7.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
