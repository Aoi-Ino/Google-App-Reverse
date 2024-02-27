package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class u4 extends t4 {

    /* renamed from: e0  reason: collision with root package name */
    private static final SparseIntArray f28818e0;

    /* renamed from: b0  reason: collision with root package name */
    private final RelativeLayout f28819b0;

    /* renamed from: c0  reason: collision with root package name */
    private final LinearLayout f28820c0;

    /* renamed from: d0  reason: collision with root package name */
    private long f28821d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28818e0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.mHeader, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 8);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 9);
        sparseIntArray.put(R.id.multi_steps, 10);
        sparseIntArray.put(R.id.txtAppCategory, 11);
        sparseIntArray.put(R.id.app_cat_layout, 12);
        sparseIntArray.put(R.id.spn_app_cat, 13);
        sparseIntArray.put(R.id.txt_certificate, 14);
        sparseIntArray.put(R.id.certificate_number, 15);
        sparseIntArray.put(R.id.txt_issue_date, 16);
        sparseIntArray.put(R.id.txt_issue_date_val, 17);
        sparseIntArray.put(R.id.txt_valid_from, 18);
        sparseIntArray.put(R.id.txt_valid_from_val, 19);
        sparseIntArray.put(R.id.txt_valid_upto, 20);
        sparseIntArray.put(R.id.txt_valid_to, 21);
        sparseIntArray.put(R.id.tv_reason, 22);
        sparseIntArray.put(R.id.id_issued_by, 23);
        sparseIntArray.put(R.id.donate_layout, 24);
        sparseIntArray.put(R.id.tv_note_organ_donate, 25);
        sparseIntArray.put(R.id.willing_to_donate, 26);
        sparseIntArray.put(R.id.not_willing_to_donate, 27);
        sparseIntArray.put(R.id.org_mob_number, 28);
        sparseIntArray.put(R.id.id_dupdl_summit, 29);
        sparseIntArray.put(R.id.id_dupdl_cancle, 30);
        sparseIntArray.put(R.id.tv_cancel, 31);
        sparseIntArray.put(R.id.id_next_service, 32);
    }

    public u4(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 33, (h.i) null, f28818e0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28821d0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28821d0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f28821d0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u4(androidx.databinding.e r38, android.view.View r39, java.lang.Object[] r40) {
        /*
            r37 = this;
            r15 = r37
            r3 = 0
            r0 = 12
            r0 = r40[r0]
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0 = 15
            r0 = r40[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatEditText r5 = (androidx.appcompat.widget.AppCompatEditText) r5
            r0 = 6
            r0 = r40[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 24
            r0 = r40[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 8
            r0 = r40[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 30
            r0 = r40[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 29
            r0 = r40[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 23
            r0 = r40[r0]
            r11 = r0
            android.widget.Spinner r11 = (android.widget.Spinner) r11
            r0 = 32
            r0 = r40[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r12 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r12
            r0 = 4
            r0 = r40[r0]
            r14 = 0
            if (r0 == 0) goto L_0x004f
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r13 = r0
            goto L_0x0050
        L_0x004f:
            r13 = r14
        L_0x0050:
            r0 = 1
            r0 = r40[r0]
            r16 = r0
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r0 = 3
            r0 = r40[r0]
            if (r0 == 0) goto L_0x0065
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r17 = r0
            goto L_0x0067
        L_0x0065:
            r17 = r14
        L_0x0067:
            r0 = 10
            r0 = r40[r0]
            r18 = r0
            androidx.recyclerview.widget.RecyclerView r18 = (androidx.recyclerview.widget.RecyclerView) r18
            r0 = 27
            r0 = r40[r0]
            r19 = r0
            android.widget.RadioButton r19 = (android.widget.RadioButton) r19
            r0 = 28
            r0 = r40[r0]
            r35 = r0
            androidx.appcompat.widget.AppCompatEditText r35 = (androidx.appcompat.widget.AppCompatEditText) r35
            r0 = 5
            r0 = r40[r0]
            if (r0 == 0) goto L_0x008d
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            r36 = r0
            goto L_0x008f
        L_0x008d:
            r36 = r14
        L_0x008f:
            r0 = 13
            r0 = r40[r0]
            r20 = r0
            android.widget.Spinner r20 = (android.widget.Spinner) r20
            r0 = 31
            r0 = r40[r0]
            r21 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r21 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r21
            r0 = 9
            r0 = r40[r0]
            r22 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r22 = (com.nic.mparivahan.dlservices.widget.MyTextView) r22
            r0 = 25
            r0 = r40[r0]
            r23 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r23 = (com.nic.mparivahan.dlservices.widget.MyTextView) r23
            r0 = 22
            r0 = r40[r0]
            r24 = r0
            androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
            r0 = 11
            r0 = r40[r0]
            r25 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r25 = (com.nic.mparivahan.dlservices.widget.MyTextView) r25
            r0 = 14
            r0 = r40[r0]
            r26 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r26 = (com.nic.mparivahan.dlservices.widget.MyTextView) r26
            r0 = 16
            r0 = r40[r0]
            r27 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r27 = (com.nic.mparivahan.dlservices.widget.MyTextView) r27
            r0 = 17
            r0 = r40[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 18
            r0 = r40[r0]
            r29 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r29 = (com.nic.mparivahan.dlservices.widget.MyTextView) r29
            r0 = 19
            r0 = r40[r0]
            r30 = r0
            androidx.appcompat.widget.AppCompatEditText r30 = (androidx.appcompat.widget.AppCompatEditText) r30
            r0 = 21
            r0 = r40[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 20
            r0 = r40[r0]
            r32 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r32 = (com.nic.mparivahan.dlservices.widget.MyTextView) r32
            r0 = 7
            r0 = r40[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 26
            r0 = r40[r0]
            r34 = r0
            android.widget.RadioButton r34 = (android.widget.RadioButton) r34
            r0 = r37
            r1 = r38
            r2 = r39
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r35
            r19 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = -1
            r2 = r37
            r2.f28821d0 = r0
            android.widget.LinearLayout r0 = r2.G
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r40[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f28819b0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r40[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f28820c0 = r0
            r0.setTag(r1)
            r0 = r39
            r2.w(r0)
            r37.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.u4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
