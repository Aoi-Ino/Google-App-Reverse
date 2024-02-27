package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class a0 extends z {

    /* renamed from: d0  reason: collision with root package name */
    private static final SparseIntArray f25168d0;

    /* renamed from: b0  reason: collision with root package name */
    private final RelativeLayout f25169b0;

    /* renamed from: c0  reason: collision with root package name */
    private long f25170c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25168d0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.select_service, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_image, 5);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 6);
        sparseIntArray.put(R.id.tv_ll_Details, 7);
        sparseIntArray.put(R.id.tv_view_details, 8);
        sparseIntArray.put(R.id.tv_reason, 9);
        sparseIntArray.put(R.id.id_change_dob_reason, 10);
        sparseIntArray.put(R.id.tv_lic_detail, 11);
        sparseIntArray.put(R.id.ll_relation, 12);
        sparseIntArray.put(R.id.txt_fname, 13);
        sparseIntArray.put(R.id.txt_fname_val, 14);
        sparseIntArray.put(R.id.txt_mname, 15);
        sparseIntArray.put(R.id.txt_mname_val, 16);
        sparseIntArray.put(R.id.txt_lname, 17);
        sparseIntArray.put(R.id.txt_lname_val, 18);
        sparseIntArray.put(R.id.txt_full_name, 19);
        sparseIntArray.put(R.id.txt_full_name_val, 20);
        sparseIntArray.put(R.id.ll_details, 21);
        sparseIntArray.put(R.id.txt_relation, 22);
        sparseIntArray.put(R.id.spn_rel_Status, 23);
        sparseIntArray.put(R.id.txt_ffname, 24);
        sparseIntArray.put(R.id.txt_name_val, 25);
        sparseIntArray.put(R.id.txt_md_name, 26);
        sparseIntArray.put(R.id.txt_md_name_val, 27);
        sparseIntArray.put(R.id.txt_last_name, 28);
        sparseIntArray.put(R.id.txt_last_name_val, 29);
        sparseIntArray.put(R.id.reset, 30);
        sparseIntArray.put(R.id.id_next_service, 31);
    }

    public a0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 32, (h.i) null, f25168d0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f25170c0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f25170c0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f25170c0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a0(androidx.databinding.e r38, android.view.View r39, java.lang.Object[] r40) {
        /*
            r37 = this;
            r11 = r37
            r3 = 0
            r0 = 6
            r0 = r40[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 10
            r0 = r40[r0]
            r5 = r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 31
            r0 = r40[r0]
            r6 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r6
            r0 = 5
            r0 = r40[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 21
            r0 = r40[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 12
            r0 = r40[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 2
            r0 = r40[r0]
            r10 = 0
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r35 = r0
            goto L_0x003c
        L_0x003a:
            r35 = r10
        L_0x003c:
            r0 = 1
            r0 = r40[r0]
            if (r0 == 0) goto L_0x004a
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r36 = r0
            goto L_0x004c
        L_0x004a:
            r36 = r10
        L_0x004c:
            r0 = 30
            r0 = r40[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r12 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r12
            r0 = 4
            r0 = r40[r0]
            r13 = r0
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            r0 = 3
            r0 = r40[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r14 = (com.nic.mparivahan.dlservices.widget.MyTextView) r14
            r0 = 23
            r0 = r40[r0]
            r15 = r0
            android.widget.Spinner r15 = (android.widget.Spinner) r15
            r0 = 11
            r0 = r40[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 7
            r0 = r40[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 9
            r0 = r40[r0]
            r18 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r18 = (com.nic.mparivahan.dlservices.widget.MyTextView) r18
            r0 = 8
            r0 = r40[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 24
            r0 = r40[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 13
            r0 = r40[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 14
            r0 = r40[r0]
            r22 = r0
            android.widget.EditText r22 = (android.widget.EditText) r22
            r0 = 19
            r0 = r40[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 20
            r0 = r40[r0]
            r24 = r0
            android.widget.EditText r24 = (android.widget.EditText) r24
            r0 = 28
            r0 = r40[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 29
            r0 = r40[r0]
            r26 = r0
            android.widget.EditText r26 = (android.widget.EditText) r26
            r0 = 17
            r0 = r40[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 18
            r0 = r40[r0]
            r28 = r0
            android.widget.EditText r28 = (android.widget.EditText) r28
            r0 = 26
            r0 = r40[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 27
            r0 = r40[r0]
            r30 = r0
            android.widget.EditText r30 = (android.widget.EditText) r30
            r0 = 15
            r0 = r40[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 16
            r0 = r40[r0]
            r32 = r0
            android.widget.EditText r32 = (android.widget.EditText) r32
            r0 = 25
            r0 = r40[r0]
            r33 = r0
            android.widget.EditText r33 = (android.widget.EditText) r33
            r0 = 22
            r0 = r40[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = r37
            r1 = r38
            r2 = r39
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = -1
            r2 = r37
            r2.f25170c0 = r0
            r0 = 0
            r0 = r40[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f25169b0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r39
            r2.w(r0)
            r37.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.a0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
