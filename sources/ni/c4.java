package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class c4 extends b4 {
    private static final SparseIntArray L;
    private final RelativeLayout J;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.select_service, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_image, 5);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 6);
        sparseIntArray.put(R.id.tv_cl_Details, 7);
        sparseIntArray.put(R.id.tv_view_details, 8);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 9);
        sparseIntArray.put(R.id.tv_reason, 10);
        sparseIntArray.put(R.id.dupdl_optional, 11);
        sparseIntArray.put(R.id.reset, 12);
        sparseIntArray.put(R.id.id_next_service, 13);
    }

    public c4(e eVar, View view) {
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

    public void z() {
        synchronized (this) {
            this.K = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c4(androidx.databinding.e r20, android.view.View r21, java.lang.Object[] r22) {
        /*
            r19 = this;
            r9 = r19
            r3 = 0
            r0 = 11
            r0 = r22[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 6
            r0 = r22[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 13
            r0 = r22[r0]
            r6 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r6
            r0 = 5
            r0 = r22[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2
            r0 = r22[r0]
            r8 = 0
            if (r0 == 0) goto L_0x002c
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r17 = r0
            goto L_0x002e
        L_0x002c:
            r17 = r8
        L_0x002e:
            r0 = 1
            r0 = r22[r0]
            if (r0 == 0) goto L_0x003c
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r18 = r0
            goto L_0x003e
        L_0x003c:
            r18 = r8
        L_0x003e:
            r0 = 12
            r0 = r22[r0]
            r10 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r10 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r10
            r0 = 4
            r0 = r22[r0]
            r11 = r0
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            r0 = 3
            r0 = r22[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r12 = (com.nic.mparivahan.dlservices.widget.MyTextView) r12
            r0 = 7
            r0 = r22[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 9
            r0 = r22[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r14 = (com.nic.mparivahan.dlservices.widget.MyTextView) r14
            r0 = 10
            r0 = r22[r0]
            r15 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r15 = (com.nic.mparivahan.dlservices.widget.MyTextView) r15
            r0 = 8
            r0 = r22[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = r19
            r1 = r20
            r2 = r21
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -1
            r2 = r19
            r2.K = r0
            r0 = 0
            r0 = r22[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.J = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r21
            r2.w(r0)
            r19.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.c4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
