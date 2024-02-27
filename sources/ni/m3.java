package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class m3 extends l3 {
    private static final SparseIntArray K;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 1);
        sparseIntArray.put(R.id.dl_details_title, 2);
        sparseIntArray.put(R.id.center_ll, 3);
        sparseIntArray.put(R.id.tv_appoint_book_succ, 4);
        sparseIntArray.put(R.id.tv_appoint_date, 5);
        sparseIntArray.put(R.id.appointment_date, 6);
        sparseIntArray.put(R.id.tv_appoint_time, 7);
        sparseIntArray.put(R.id.appointment_time, 8);
        sparseIntArray.put(R.id.tv_appln_submit_succ, 9);
        sparseIntArray.put(R.id.notes, 10);
        sparseIntArray.put(R.id.download_acknow, 11);
        sparseIntArray.put(R.id.save_continue_to_next, 12);
    }

    public m3(e eVar, View view) {
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
    private m3(androidx.databinding.e r19, android.view.View r20, java.lang.Object[] r21) {
        /*
            r18 = this;
            r9 = r18
            r3 = 0
            r0 = 6
            r0 = r21[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = (com.nic.mparivahan.dlservices.widget.MyTextView) r4
            r0 = 8
            r0 = r21[r0]
            r5 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r5 = (com.nic.mparivahan.dlservices.widget.MyTextView) r5
            r0 = 3
            r0 = r21[r0]
            r6 = r0
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r0 = 2
            r0 = r21[r0]
            r7 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r7 = (com.nic.mparivahan.dlservices.widget.MyTextView) r7
            r0 = 11
            r0 = r21[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 1
            r0 = r21[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0032
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r17 = r0
            goto L_0x0034
        L_0x0032:
            r17 = r2
        L_0x0034:
            r0 = 10
            r0 = r21[r0]
            r10 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r10 = (com.nic.mparivahan.dlservices.widget.MyTextView) r10
            r0 = 12
            r0 = r21[r0]
            r11 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r11 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r11
            r0 = 0
            r0 = r21[r0]
            r12 = r0
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r0 = 9
            r0 = r21[r0]
            r13 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r13 = (com.nic.mparivahan.dlservices.widget.MyTextView) r13
            r0 = 4
            r0 = r21[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r14 = (com.nic.mparivahan.dlservices.widget.MyTextView) r14
            r0 = 5
            r0 = r21[r0]
            r15 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r15 = (com.nic.mparivahan.dlservices.widget.MyTextView) r15
            r0 = 7
            r0 = r21[r0]
            r16 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r16 = (com.nic.mparivahan.dlservices.widget.MyTextView) r16
            r0 = r18
            r1 = r19
            r2 = r20
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -1
            r2 = r18
            r2.J = r0
            android.widget.LinearLayout r0 = r2.E
            r1 = 0
            r0.setTag(r1)
            r0 = r20
            r2.w(r0)
            r18.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.m3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
