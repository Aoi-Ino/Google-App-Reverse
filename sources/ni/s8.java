package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class s8 extends r8 {

    /* renamed from: r0  reason: collision with root package name */
    private static final SparseIntArray f28539r0;

    /* renamed from: m0  reason: collision with root package name */
    private final CoordinatorLayout f28540m0;

    /* renamed from: n0  reason: collision with root package name */
    private final LinearLayout f28541n0;

    /* renamed from: o0  reason: collision with root package name */
    private final LinearLayout f28542o0;

    /* renamed from: p0  reason: collision with root package name */
    private final nc f28543p0;

    /* renamed from: q0  reason: collision with root package name */
    private long f28544q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28539r0 = sparseIntArray;
        sparseIntArray.put(R.id.txtservicename, 3);
        sparseIntArray.put(R.id.txt_dl_no, 5);
        sparseIntArray.put(R.id.round_card_view_in, 6);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon_in, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 9);
        sparseIntArray.put(R.id.tv_personal_info_title, 10);
        sparseIntArray.put(R.id.per_up_arrow, 11);
        sparseIntArray.put(R.id.per_down_arrow, 12);
        sparseIntArray.put(R.id.ll_personal_details, 13);
        sparseIntArray.put(R.id.tv_dl_holder_name, 14);
        sparseIntArray.put(R.id.txt_dl_holder_name, 15);
        sparseIntArray.put(R.id.txt_dob, 16);
        sparseIntArray.put(R.id.txt_dob_value, 17);
        sparseIntArray.put(R.id.tv_rel, 18);
        sparseIntArray.put(R.id.txt_relation, 19);
        sparseIntArray.put(R.id.tv_gen, 20);
        sparseIntArray.put(R.id.txt_gender, 21);
        sparseIntArray.put(R.id.tv_dl_info_title, 22);
        sparseIntArray.put(R.id.dl_up_arrow, 23);
        sparseIntArray.put(R.id.dl_down_arrow, 24);
        sparseIntArray.put(R.id.ll_licence_details, 25);
        sparseIntArray.put(R.id.tv_hs, 26);
        sparseIntArray.put(R.id.tv_hs_val, 27);
        sparseIntArray.put(R.id.tv_street, 28);
        sparseIntArray.put(R.id.tv_street_val, 29);
        sparseIntArray.put(R.id.tv_loc, 30);
        sparseIntArray.put(R.id.tv_loc_val, 31);
        sparseIntArray.put(R.id.tv_land, 32);
        sparseIntArray.put(R.id.tv_land_val, 33);
        sparseIntArray.put(R.id.tv_vtc, 34);
        sparseIntArray.put(R.id.tv_vtc_val, 35);
        sparseIntArray.put(R.id.tv_pin, 36);
        sparseIntArray.put(R.id.tv_pin_val, 37);
        sparseIntArray.put(R.id.user_dis_text, 38);
        sparseIntArray.put(R.id.user_dis_val, 39);
        sparseIntArray.put(R.id.user_state_text, 40);
        sparseIntArray.put(R.id.user_state, 41);
        sparseIntArray.put(R.id.user_count_text, 42);
        sparseIntArray.put(R.id.user_count, 43);
        sparseIntArray.put(R.id.close_request, 44);
        sparseIntArray.put(R.id.next_request, 45);
    }

    public s8(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 46, (h.i) null, f28539r0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28544q0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28544q0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f28544q0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s8(androidx.databinding.e r48, android.view.View r49, java.lang.Object[] r50) {
        /*
            r47 = this;
            r15 = r47
            r3 = 0
            r0 = 44
            r0 = r50[r0]
            r4 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r4 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r4
            r0 = 24
            r0 = r50[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 23
            r0 = r50[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 7
            r0 = r50[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 25
            r0 = r50[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 13
            r0 = r50[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 45
            r0 = r50[r0]
            r10 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r10 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r10
            r0 = 12
            r0 = r50[r0]
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 11
            r0 = r50[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 6
            r0 = r50[r0]
            r13 = r0
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            r0 = 8
            r0 = r50[r0]
            r14 = r0
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            r0 = 14
            r0 = r50[r0]
            r16 = r0
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            r0 = 22
            r0 = r50[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 20
            r0 = r50[r0]
            r18 = r0
            androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
            r0 = 26
            r0 = r50[r0]
            r19 = r0
            androidx.appcompat.widget.AppCompatTextView r19 = (androidx.appcompat.widget.AppCompatTextView) r19
            r0 = 27
            r0 = r50[r0]
            r20 = r0
            androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
            r0 = 32
            r0 = r50[r0]
            r21 = r0
            androidx.appcompat.widget.AppCompatTextView r21 = (androidx.appcompat.widget.AppCompatTextView) r21
            r0 = 33
            r0 = r50[r0]
            r22 = r0
            androidx.appcompat.widget.AppCompatTextView r22 = (androidx.appcompat.widget.AppCompatTextView) r22
            r0 = 30
            r0 = r50[r0]
            r23 = r0
            androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
            r0 = 31
            r0 = r50[r0]
            r24 = r0
            androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
            r0 = 10
            r0 = r50[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 36
            r0 = r50[r0]
            r26 = r0
            androidx.appcompat.widget.AppCompatTextView r26 = (androidx.appcompat.widget.AppCompatTextView) r26
            r0 = 37
            r0 = r50[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatTextView r27 = (androidx.appcompat.widget.AppCompatTextView) r27
            r0 = 18
            r0 = r50[r0]
            r28 = r0
            androidx.appcompat.widget.AppCompatTextView r28 = (androidx.appcompat.widget.AppCompatTextView) r28
            r0 = 9
            r0 = r50[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatTextView r29 = (androidx.appcompat.widget.AppCompatTextView) r29
            r0 = 28
            r0 = r50[r0]
            r30 = r0
            androidx.appcompat.widget.AppCompatTextView r30 = (androidx.appcompat.widget.AppCompatTextView) r30
            r0 = 29
            r0 = r50[r0]
            r31 = r0
            androidx.appcompat.widget.AppCompatTextView r31 = (androidx.appcompat.widget.AppCompatTextView) r31
            r0 = 34
            r0 = r50[r0]
            r32 = r0
            androidx.appcompat.widget.AppCompatTextView r32 = (androidx.appcompat.widget.AppCompatTextView) r32
            r0 = 35
            r0 = r50[r0]
            r33 = r0
            androidx.appcompat.widget.AppCompatTextView r33 = (androidx.appcompat.widget.AppCompatTextView) r33
            r0 = 15
            r0 = r50[r0]
            r34 = r0
            androidx.appcompat.widget.AppCompatTextView r34 = (androidx.appcompat.widget.AppCompatTextView) r34
            r0 = 5
            r0 = r50[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 16
            r0 = r50[r0]
            r36 = r0
            androidx.appcompat.widget.AppCompatTextView r36 = (androidx.appcompat.widget.AppCompatTextView) r36
            r0 = 17
            r0 = r50[r0]
            r37 = r0
            androidx.appcompat.widget.AppCompatTextView r37 = (androidx.appcompat.widget.AppCompatTextView) r37
            r0 = 21
            r0 = r50[r0]
            r38 = r0
            androidx.appcompat.widget.AppCompatTextView r38 = (androidx.appcompat.widget.AppCompatTextView) r38
            r0 = 19
            r0 = r50[r0]
            r39 = r0
            androidx.appcompat.widget.AppCompatTextView r39 = (androidx.appcompat.widget.AppCompatTextView) r39
            r0 = 3
            r0 = r50[r0]
            r2 = 0
            if (r0 == 0) goto L_0x011c
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r46 = r0
            goto L_0x011e
        L_0x011c:
            r46 = r2
        L_0x011e:
            r0 = 43
            r0 = r50[r0]
            r40 = r0
            androidx.appcompat.widget.AppCompatTextView r40 = (androidx.appcompat.widget.AppCompatTextView) r40
            r0 = 42
            r0 = r50[r0]
            r41 = r0
            androidx.appcompat.widget.AppCompatTextView r41 = (androidx.appcompat.widget.AppCompatTextView) r41
            r0 = 38
            r0 = r50[r0]
            r42 = r0
            androidx.appcompat.widget.AppCompatTextView r42 = (androidx.appcompat.widget.AppCompatTextView) r42
            r0 = 39
            r0 = r50[r0]
            r43 = r0
            androidx.appcompat.widget.AppCompatTextView r43 = (androidx.appcompat.widget.AppCompatTextView) r43
            r0 = 41
            r0 = r50[r0]
            r44 = r0
            androidx.appcompat.widget.AppCompatTextView r44 = (androidx.appcompat.widget.AppCompatTextView) r44
            r0 = 40
            r0 = r50[r0]
            r45 = r0
            androidx.appcompat.widget.AppCompatTextView r45 = (androidx.appcompat.widget.AppCompatTextView) r45
            r0 = r47
            r1 = r48
            r2 = r49
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
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r0 = -1
            r2 = r47
            r2.f28544q0 = r0
            r0 = 0
            r0 = r50[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.f28540m0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r50[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f28541n0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r50[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f28542o0 = r0
            r0.setTag(r1)
            r0 = 4
            r0 = r50[r0]
            if (r0 == 0) goto L_0x01ba
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            goto L_0x01bb
        L_0x01ba:
            r0 = r1
        L_0x01bb:
            r2.f28543p0 = r0
            r0 = r49
            r2.w(r0)
            r47.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.s8.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
