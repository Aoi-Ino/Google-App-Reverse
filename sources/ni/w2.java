package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class w2 extends v2 {

    /* renamed from: i0  reason: collision with root package name */
    private static final SparseIntArray f29139i0;

    /* renamed from: e0  reason: collision with root package name */
    private final RelativeLayout f29140e0;

    /* renamed from: f0  reason: collision with root package name */
    private final LinearLayout f29141f0;

    /* renamed from: g0  reason: collision with root package name */
    private final LinearLayout f29142g0;

    /* renamed from: h0  reason: collision with root package name */
    private long f29143h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29139i0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.mHeader, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.multi_steps, 12);
        sparseIntArray.put(R.id.tv_submit_req, 13);
        sparseIntArray.put(R.id.txtAppCategory, 14);
        sparseIntArray.put(R.id.app_cat_layout, 15);
        sparseIntArray.put(R.id.spn_app_cat, 16);
        sparseIntArray.put(R.id.tv_state, 17);
        sparseIntArray.put(R.id.state, 18);
        sparseIntArray.put(R.id.tv_rto, 19);
        sparseIntArray.put(R.id.rto, 20);
        sparseIntArray.put(R.id.tv_change_addr, 21);
        sparseIntArray.put(R.id.tv_district, 22);
        sparseIntArray.put(R.id.dist_spinner, 23);
        sparseIntArray.put(R.id.tv_taluka_block, 24);
        sparseIntArray.put(R.id.spinner_taluka, 25);
        sparseIntArray.put(R.id.radio_group, 26);
        sparseIntArray.put(R.id.village, 27);
        sparseIntArray.put(R.id.town, 28);
        sparseIntArray.put(R.id.spinner_village_or_town, 29);
        sparseIntArray.put(R.id.tv_house_door_flat, 30);
        sparseIntArray.put(R.id.house_no, 31);
        sparseIntArray.put(R.id.tv_landmark, 32);
        sparseIntArray.put(R.id.landmark, 33);
        sparseIntArray.put(R.id.tv_pincode, 34);
        sparseIntArray.put(R.id.pincode, 35);
        sparseIntArray.put(R.id.submit, 36);
    }

    public w2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 37, (h.i) null, f29139i0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f29143h0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f29143h0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f29143h0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w2(androidx.databinding.e r41, android.view.View r42, java.lang.Object[] r43) {
        /*
            r40 = this;
            r15 = r40
            r3 = 0
            r0 = 15
            r0 = r43[r0]
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0 = 23
            r0 = r43[r0]
            r5 = r0
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0 = 6
            r0 = r43[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 31
            r0 = r43[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 9
            r0 = r43[r0]
            r8 = r0
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            r0 = 11
            r0 = r43[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 33
            r0 = r43[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 4
            r0 = r43[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0041
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r11 = r0
            goto L_0x0042
        L_0x0041:
            r11 = r14
        L_0x0042:
            r0 = 3
            r0 = r43[r0]
            if (r0 == 0) goto L_0x004f
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r12 = r0
            goto L_0x0050
        L_0x004f:
            r12 = r14
        L_0x0050:
            r0 = 12
            r0 = r43[r0]
            r13 = r0
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r0 = 35
            r0 = r43[r0]
            r38 = r0
            android.widget.EditText r38 = (android.widget.EditText) r38
            r0 = 5
            r0 = r43[r0]
            if (r0 == 0) goto L_0x006d
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            r39 = r0
            goto L_0x006f
        L_0x006d:
            r39 = r14
        L_0x006f:
            r0 = 26
            r0 = r43[r0]
            r16 = r0
            android.widget.RadioGroup r16 = (android.widget.RadioGroup) r16
            r0 = 10
            r0 = r43[r0]
            r17 = r0
            androidx.cardview.widget.CardView r17 = (androidx.cardview.widget.CardView) r17
            r0 = 20
            r0 = r43[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 8
            r0 = r43[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 25
            r0 = r43[r0]
            r20 = r0
            android.widget.Spinner r20 = (android.widget.Spinner) r20
            r0 = 29
            r0 = r43[r0]
            r21 = r0
            android.widget.Spinner r21 = (android.widget.Spinner) r21
            r0 = 16
            r0 = r43[r0]
            r22 = r0
            android.widget.Spinner r22 = (android.widget.Spinner) r22
            r0 = 18
            r0 = r43[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 36
            r0 = r43[r0]
            r24 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r24 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r24
            r0 = 28
            r0 = r43[r0]
            r25 = r0
            android.widget.RadioButton r25 = (android.widget.RadioButton) r25
            r0 = 21
            r0 = r43[r0]
            r26 = r0
            android.widget.CheckBox r26 = (android.widget.CheckBox) r26
            r0 = 22
            r0 = r43[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 30
            r0 = r43[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 32
            r0 = r43[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 34
            r0 = r43[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 19
            r0 = r43[r0]
            r31 = r0
            androidx.appcompat.widget.AppCompatTextView r31 = (androidx.appcompat.widget.AppCompatTextView) r31
            r0 = 17
            r0 = r43[r0]
            r32 = r0
            androidx.appcompat.widget.AppCompatTextView r32 = (androidx.appcompat.widget.AppCompatTextView) r32
            r0 = 13
            r0 = r43[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 24
            r0 = r43[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 14
            r0 = r43[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 7
            r0 = r43[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 27
            r0 = r43[r0]
            r37 = r0
            android.widget.RadioButton r37 = (android.widget.RadioButton) r37
            r0 = r40
            r1 = r41
            r2 = r42
            r14 = r38
            r15 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0 = -1
            r2 = r40
            r2.f29143h0 = r0
            r0 = 0
            r0 = r43[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f29140e0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r43[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f29141f0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r43[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f29142g0 = r0
            r0.setTag(r1)
            r0 = r42
            r2.w(r0)
            r40.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.w2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
