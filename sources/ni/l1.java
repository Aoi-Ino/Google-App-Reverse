package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class l1 extends k1 {
    private static final SparseIntArray Y;
    private final CoordinatorLayout T;
    private final LinearLayout U;
    private final LinearLayout V;
    private final nc W;
    private long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(R.id.txtservicename, 3);
        sparseIntArray.put(R.id.select_service, 5);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 6);
        sparseIntArray.put(R.id.ll_personal_details, 7);
        sparseIntArray.put(R.id.txt_new_mobile, 8);
        sparseIntArray.put(R.id.edit_new_mobile, 9);
        sparseIntArray.put(R.id.confirm_mob_text, 10);
        sparseIntArray.put(R.id.confirm_mob, 11);
        sparseIntArray.put(R.id.mob_reason, 12);
        sparseIntArray.put(R.id.mob_reason_edit, 13);
        sparseIntArray.put(R.id.dl_personal_info_linear, 14);
        sparseIntArray.put(R.id.tv_dl_hol_name, 15);
        sparseIntArray.put(R.id.dl_holder_name, 16);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 17);
        sparseIntArray.put(R.id.holder_father_name, 18);
        sparseIntArray.put(R.id.tv_dl_dob, 19);
        sparseIntArray.put(R.id.dl_dob, 20);
        sparseIntArray.put(R.id.tv_dl_blood_group, 21);
        sparseIntArray.put(R.id.blood_group, 22);
        sparseIntArray.put(R.id.tv_present_addr, 23);
        sparseIntArray.put(R.id.present_address_txt, 24);
        sparseIntArray.put(R.id.close_request, 25);
        sparseIntArray.put(R.id.next_request, 26);
    }

    public l1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 27, (h.i) null, Y));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.X = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.X = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l1(androidx.databinding.e r29, android.view.View r30, java.lang.Object[] r31) {
        /*
            r28 = this;
            r15 = r28
            r3 = 0
            r0 = 22
            r0 = r31[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 25
            r0 = r31[r0]
            r5 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r5 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r5
            r0 = 11
            r0 = r31[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 10
            r0 = r31[r0]
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            r0 = 20
            r0 = r31[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 16
            r0 = r31[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 14
            r0 = r31[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 9
            r0 = r31[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 18
            r0 = r31[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 7
            r0 = r31[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 12
            r0 = r31[r0]
            r14 = r0
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            r0 = 13
            r0 = r31[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 26
            r0 = r31[r0]
            r17 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r17 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r17
            r0 = 24
            r0 = r31[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 5
            r0 = r31[r0]
            r19 = r0
            androidx.appcompat.widget.AppCompatTextView r19 = (androidx.appcompat.widget.AppCompatTextView) r19
            r0 = 21
            r0 = r31[r0]
            r20 = r0
            androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
            r0 = 19
            r0 = r31[r0]
            r21 = r0
            androidx.appcompat.widget.AppCompatTextView r21 = (androidx.appcompat.widget.AppCompatTextView) r21
            r0 = 15
            r0 = r31[r0]
            r22 = r0
            androidx.appcompat.widget.AppCompatTextView r22 = (androidx.appcompat.widget.AppCompatTextView) r22
            r0 = 23
            r0 = r31[r0]
            r23 = r0
            androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
            r0 = 6
            r0 = r31[r0]
            r24 = r0
            androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
            r0 = 17
            r0 = r31[r0]
            r25 = r0
            androidx.appcompat.widget.AppCompatTextView r25 = (androidx.appcompat.widget.AppCompatTextView) r25
            r0 = 8
            r0 = r31[r0]
            r26 = r0
            androidx.appcompat.widget.AppCompatTextView r26 = (androidx.appcompat.widget.AppCompatTextView) r26
            r0 = 3
            r0 = r31[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00b4
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r27 = r0
            goto L_0x00b6
        L_0x00b4:
            r27 = r2
        L_0x00b6:
            r0 = r28
            r1 = r29
            r2 = r30
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = -1
            r2 = r28
            r2.X = r0
            r0 = 0
            r0 = r31[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.T = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r31[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.U = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r31[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.V = r0
            r0.setTag(r1)
            r0 = 4
            r0 = r31[r0]
            if (r0 == 0) goto L_0x0108
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            r2.W = r0
            r0 = r30
            r2.w(r0)
            r28.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.l1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
