package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class e4 extends d4 {

    /* renamed from: e0  reason: collision with root package name */
    private static final SparseIntArray f26059e0;

    /* renamed from: b0  reason: collision with root package name */
    private final RelativeLayout f26060b0;

    /* renamed from: c0  reason: collision with root package name */
    private final LinearLayout f26061c0;

    /* renamed from: d0  reason: collision with root package name */
    private long f26062d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26059e0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 3);
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 12);
        sparseIntArray.put(R.id.tv_detail_dupl_dl, 13);
        sparseIntArray.put(R.id.multi_steps, 14);
        sparseIntArray.put(R.id.txtAppCategory, 15);
        sparseIntArray.put(R.id.app_cat_layout, 16);
        sparseIntArray.put(R.id.spn_app_cat, 17);
        sparseIntArray.put(R.id.tv_reason, 18);
        sparseIntArray.put(R.id.id_dupdl_reason, 19);
        sparseIntArray.put(R.id.id_dupdl, 20);
        sparseIntArray.put(R.id.tv_reason_manually, 21);
        sparseIntArray.put(R.id.dupdl_optional, 22);
        sparseIntArray.put(R.id.donate_layout, 23);
        sparseIntArray.put(R.id.tv_note_organ_donate, 24);
        sparseIntArray.put(R.id.willing_to_donate, 25);
        sparseIntArray.put(R.id.not_willing_to_donate, 26);
        sparseIntArray.put(R.id.org_mob_number, 27);
        sparseIntArray.put(R.id.id_dupdl_summit, 28);
        sparseIntArray.put(R.id.id_dupdl_cancle, 29);
        sparseIntArray.put(R.id.tv_cancel, 30);
        sparseIntArray.put(R.id.reset, 31);
        sparseIntArray.put(R.id.id_next_service, 32);
    }

    public e4(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 33, (h.i) null, f26059e0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f26062d0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f26062d0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f26062d0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e4(androidx.databinding.e r37, android.view.View r38, java.lang.Object[] r39) {
        /*
            r36 = this;
            r15 = r36
            r3 = 0
            r0 = 16
            r0 = r39[r0]
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0 = 6
            r0 = r39[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 23
            r0 = r39[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 22
            r0 = r39[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 12
            r0 = r39[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 9
            r0 = r39[r0]
            r9 = r0
            androidx.cardview.widget.CardView r9 = (androidx.cardview.widget.CardView) r9
            r0 = 20
            r0 = r39[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 29
            r0 = r39[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 19
            r0 = r39[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 28
            r0 = r39[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 32
            r0 = r39[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r14 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r14
            r0 = 11
            r0 = r39[r0]
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r0 = 3
            r0 = r39[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0066
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r17 = r0
            goto L_0x0068
        L_0x0066:
            r17 = r2
        L_0x0068:
            r0 = 1
            r0 = r39[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 4
            r0 = r39[r0]
            if (r0 == 0) goto L_0x007d
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r19 = r0
            goto L_0x007f
        L_0x007d:
            r19 = r2
        L_0x007f:
            r0 = 14
            r0 = r39[r0]
            r20 = r0
            androidx.recyclerview.widget.RecyclerView r20 = (androidx.recyclerview.widget.RecyclerView) r20
            r0 = 26
            r0 = r39[r0]
            r21 = r0
            android.widget.RadioButton r21 = (android.widget.RadioButton) r21
            r0 = 27
            r0 = r39[r0]
            r22 = r0
            androidx.appcompat.widget.AppCompatEditText r22 = (androidx.appcompat.widget.AppCompatEditText) r22
            r0 = 5
            r0 = r39[r0]
            if (r0 == 0) goto L_0x00a5
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            r35 = r0
            goto L_0x00a7
        L_0x00a5:
            r35 = r2
        L_0x00a7:
            r0 = 31
            r0 = r39[r0]
            r23 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r23 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r23
            r0 = 10
            r0 = r39[r0]
            r24 = r0
            androidx.cardview.widget.CardView r24 = (androidx.cardview.widget.CardView) r24
            r0 = 8
            r0 = r39[r0]
            r25 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r25 = (com.nic.mparivahan.dlservices.widget.MyTextView) r25
            r0 = 17
            r0 = r39[r0]
            r26 = r0
            android.widget.Spinner r26 = (android.widget.Spinner) r26
            r0 = 30
            r0 = r39[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 13
            r0 = r39[r0]
            r28 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r28 = (com.nic.mparivahan.dlservices.widget.MyTextView) r28
            r0 = 24
            r0 = r39[r0]
            r29 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r29 = (com.nic.mparivahan.dlservices.widget.MyTextView) r29
            r0 = 18
            r0 = r39[r0]
            r30 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r30 = (com.nic.mparivahan.dlservices.widget.MyTextView) r30
            r0 = 21
            r0 = r39[r0]
            r31 = r0
            androidx.appcompat.widget.AppCompatTextView r31 = (androidx.appcompat.widget.AppCompatTextView) r31
            r0 = 15
            r0 = r39[r0]
            r32 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r32 = (com.nic.mparivahan.dlservices.widget.MyTextView) r32
            r0 = 7
            r0 = r39[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 25
            r0 = r39[r0]
            r34 = r0
            android.widget.RadioButton r34 = (android.widget.RadioButton) r34
            r0 = r36
            r1 = r37
            r2 = r38
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = -1
            r2 = r36
            r2.f26062d0 = r0
            android.widget.LinearLayout r0 = r2.J
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r39[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f26060b0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r39[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f26061c0 = r0
            r0.setTag(r1)
            r0 = r38
            r2.w(r0)
            r36.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.e4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
