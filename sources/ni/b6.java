package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class b6 extends a6 {
    private static final SparseIntArray L;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 1);
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.dl_details_title, 3);
        sparseIntArray.put(R.id.center_ll, 4);
        sparseIntArray.put(R.id.tv_appoint_book_succ, 5);
        sparseIntArray.put(R.id.tv_appoint_date, 6);
        sparseIntArray.put(R.id.appointment_date, 7);
        sparseIntArray.put(R.id.tv_appoint_time, 8);
        sparseIntArray.put(R.id.appointment_time, 9);
        sparseIntArray.put(R.id.tv_appln_submit_succ, 10);
        sparseIntArray.put(R.id.notes, 11);
        sparseIntArray.put(R.id.download_acknow, 12);
        sparseIntArray.put(R.id.save_continue_to_next, 13);
    }

    public b6(e eVar, View view) {
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
    private b6(androidx.databinding.e r21, android.view.View r22, java.lang.Object[] r23) {
        /*
            r20 = this;
            r10 = r20
            r3 = 0
            r0 = 7
            r0 = r23[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r4 = (com.nic.mparivahan.dlservices.widget.MyTextView) r4
            r0 = 9
            r0 = r23[r0]
            r5 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r5 = (com.nic.mparivahan.dlservices.widget.MyTextView) r5
            r0 = 4
            r0 = r23[r0]
            r6 = r0
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r0 = 3
            r0 = r23[r0]
            r7 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r7 = (com.nic.mparivahan.dlservices.widget.MyTextView) r7
            r0 = 12
            r0 = r23[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 1
            r0 = r23[r0]
            r9 = 0
            if (r0 == 0) goto L_0x0032
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r18 = r0
            goto L_0x0034
        L_0x0032:
            r18 = r9
        L_0x0034:
            r0 = 2
            r0 = r23[r0]
            if (r0 == 0) goto L_0x0042
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r19 = r0
            goto L_0x0044
        L_0x0042:
            r19 = r9
        L_0x0044:
            r0 = 11
            r0 = r23[r0]
            r11 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r11 = (com.nic.mparivahan.dlservices.widget.MyTextView) r11
            r0 = 13
            r0 = r23[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r12 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r12
            r0 = 0
            r0 = r23[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 10
            r0 = r23[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r14 = (com.nic.mparivahan.dlservices.widget.MyTextView) r14
            r0 = 5
            r0 = r23[r0]
            r15 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r15 = (com.nic.mparivahan.dlservices.widget.MyTextView) r15
            r0 = 6
            r0 = r23[r0]
            r16 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r16 = (com.nic.mparivahan.dlservices.widget.MyTextView) r16
            r0 = 8
            r0 = r23[r0]
            r17 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r17 = (com.nic.mparivahan.dlservices.widget.MyTextView) r17
            r0 = r20
            r1 = r21
            r2 = r22
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = -1
            r2 = r20
            r2.K = r0
            android.widget.LinearLayout r0 = r2.F
            r1 = 0
            r0.setTag(r1)
            r0 = r22
            r2.w(r0)
            r20.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.b6.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
