package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class n5 extends m5 {
    private static final SparseIntArray E0;
    private final LinearLayout A0;
    private final LinearLayout B0;
    private final nc C0;
    private long D0;

    /* renamed from: z0  reason: collision with root package name */
    private final CoordinatorLayout f27576z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(R.id.txtservicename, 3);
        sparseIntArray.put(R.id.txt_dl_no, 5);
        sparseIntArray.put(R.id.image_cross, 6);
        sparseIntArray.put(R.id.select_service, 7);
        sparseIntArray.put(R.id.icon_image, 8);
        sparseIntArray.put(R.id.round_card_view, 9);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 10);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 11);
        sparseIntArray.put(R.id.tv_personal_info_title, 12);
        sparseIntArray.put(R.id.per_up_arrow, 13);
        sparseIntArray.put(R.id.per_down_arrow, 14);
        sparseIntArray.put(R.id.ll_personal_details, 15);
        sparseIntArray.put(R.id.tv_dl_holder_name, 16);
        sparseIntArray.put(R.id.txt_dl_holder_name, 17);
        sparseIntArray.put(R.id.tv_father_name, 18);
        sparseIntArray.put(R.id.txt_dl_father_name, 19);
        sparseIntArray.put(R.id.tv_dob, 20);
        sparseIntArray.put(R.id.txt_dl_holder_dob, 21);
        sparseIntArray.put(R.id.tv_blood_group, 22);
        sparseIntArray.put(R.id.txt_dl_blood_group, 23);
        sparseIntArray.put(R.id.tv_perm_addr, 24);
        sparseIntArray.put(R.id.txt_dl_address, 25);
        sparseIntArray.put(R.id.tv_dl_info_title, 26);
        sparseIntArray.put(R.id.dl_up_arrow, 27);
        sparseIntArray.put(R.id.dl_down_arrow, 28);
        sparseIntArray.put(R.id.ll_licence_details, 29);
        sparseIntArray.put(R.id.tv_dl_issue_date, 30);
        sparseIntArray.put(R.id.txt_dl_issue_date, 31);
        sparseIntArray.put(R.id.tv_nt_valid_upto, 32);
        sparseIntArray.put(R.id.txt_dl_nt_valid, 33);
        sparseIntArray.put(R.id.tv_last_endor_state, 34);
        sparseIntArray.put(R.id.txt_dl_last_state, 35);
        sparseIntArray.put(R.id.tv_last_endor_rto, 36);
        sparseIntArray.put(R.id.txt_dl_last_rto, 37);
        sparseIntArray.put(R.id.tv_class_vehicle_title, 38);
        sparseIntArray.put(R.id.vc_up_arrow, 39);
        sparseIntArray.put(R.id.vc_down_arrow, 40);
        sparseIntArray.put(R.id.lmvHolder, 41);
        sparseIntArray.put(R.id.txt_cov, 42);
        sparseIntArray.put(R.id.vehicle_Details_Cv, 43);
        sparseIntArray.put(R.id.new_driving_license_header, 44);
        sparseIntArray.put(R.id.down_arrow, 45);
        sparseIntArray.put(R.id.btn_drop_down, 46);
        sparseIntArray.put(R.id.dl_personal_info_linear, 47);
        sparseIntArray.put(R.id.tv_dl_hol_name, 48);
        sparseIntArray.put(R.id.dl_holder_name, 49);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 50);
        sparseIntArray.put(R.id.holder_father_name, 51);
        sparseIntArray.put(R.id.tv_dl_dob, 52);
        sparseIntArray.put(R.id.dl_dob, 53);
        sparseIntArray.put(R.id.tv_dl_blood_group, 54);
        sparseIntArray.put(R.id.blood_group, 55);
        sparseIntArray.put(R.id.tv_present_addr, 56);
        sparseIntArray.put(R.id.present_address_txt, 57);
        sparseIntArray.put(R.id.next_request, 58);
    }

    public n5(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 59, (h.i) null, E0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.D0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.D0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.D0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private n5(androidx.databinding.e r61, android.view.View r62, java.lang.Object[] r63) {
        /*
            r60 = this;
            r15 = r60
            r3 = 0
            r0 = 55
            r0 = r63[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 46
            r0 = r63[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatButton r5 = (androidx.appcompat.widget.AppCompatButton) r5
            r0 = 53
            r0 = r63[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 28
            r0 = r63[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 49
            r0 = r63[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 47
            r0 = r63[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 27
            r0 = r63[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 45
            r0 = r63[r0]
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 51
            r0 = r63[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 8
            r0 = r63[r0]
            r13 = r0
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            r0 = 6
            r0 = r63[r0]
            r14 = r0
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0 = 10
            r0 = r63[r0]
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r0 = 29
            r0 = r63[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 15
            r0 = r63[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 41
            r0 = r63[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 44
            r0 = r63[r0]
            r20 = r0
            androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
            r0 = 58
            r0 = r63[r0]
            r21 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r21 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r21
            r0 = 14
            r0 = r63[r0]
            r22 = r0
            android.widget.ImageView r22 = (android.widget.ImageView) r22
            r0 = 13
            r0 = r63[r0]
            r23 = r0
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            r0 = 57
            r0 = r63[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 9
            r0 = r63[r0]
            r25 = r0
            androidx.cardview.widget.CardView r25 = (androidx.cardview.widget.CardView) r25
            r0 = 7
            r0 = r63[r0]
            r26 = r0
            androidx.appcompat.widget.AppCompatTextView r26 = (androidx.appcompat.widget.AppCompatTextView) r26
            r0 = 22
            r0 = r63[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatTextView r27 = (androidx.appcompat.widget.AppCompatTextView) r27
            r0 = 38
            r0 = r63[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 54
            r0 = r63[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatTextView r29 = (androidx.appcompat.widget.AppCompatTextView) r29
            r0 = 52
            r0 = r63[r0]
            r30 = r0
            androidx.appcompat.widget.AppCompatTextView r30 = (androidx.appcompat.widget.AppCompatTextView) r30
            r0 = 48
            r0 = r63[r0]
            r31 = r0
            androidx.appcompat.widget.AppCompatTextView r31 = (androidx.appcompat.widget.AppCompatTextView) r31
            r0 = 16
            r0 = r63[r0]
            r32 = r0
            androidx.appcompat.widget.AppCompatTextView r32 = (androidx.appcompat.widget.AppCompatTextView) r32
            r0 = 26
            r0 = r63[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 30
            r0 = r63[r0]
            r34 = r0
            androidx.appcompat.widget.AppCompatTextView r34 = (androidx.appcompat.widget.AppCompatTextView) r34
            r0 = 20
            r0 = r63[r0]
            r35 = r0
            androidx.appcompat.widget.AppCompatTextView r35 = (androidx.appcompat.widget.AppCompatTextView) r35
            r0 = 18
            r0 = r63[r0]
            r36 = r0
            androidx.appcompat.widget.AppCompatTextView r36 = (androidx.appcompat.widget.AppCompatTextView) r36
            r0 = 36
            r0 = r63[r0]
            r37 = r0
            androidx.appcompat.widget.AppCompatTextView r37 = (androidx.appcompat.widget.AppCompatTextView) r37
            r0 = 34
            r0 = r63[r0]
            r38 = r0
            androidx.appcompat.widget.AppCompatTextView r38 = (androidx.appcompat.widget.AppCompatTextView) r38
            r0 = 32
            r0 = r63[r0]
            r39 = r0
            androidx.appcompat.widget.AppCompatTextView r39 = (androidx.appcompat.widget.AppCompatTextView) r39
            r0 = 24
            r0 = r63[r0]
            r40 = r0
            androidx.appcompat.widget.AppCompatTextView r40 = (androidx.appcompat.widget.AppCompatTextView) r40
            r0 = 12
            r0 = r63[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 56
            r0 = r63[r0]
            r42 = r0
            androidx.appcompat.widget.AppCompatTextView r42 = (androidx.appcompat.widget.AppCompatTextView) r42
            r0 = 11
            r0 = r63[r0]
            r43 = r0
            androidx.appcompat.widget.AppCompatTextView r43 = (androidx.appcompat.widget.AppCompatTextView) r43
            r0 = 50
            r0 = r63[r0]
            r44 = r0
            androidx.appcompat.widget.AppCompatTextView r44 = (androidx.appcompat.widget.AppCompatTextView) r44
            r0 = 42
            r0 = r63[r0]
            r45 = r0
            androidx.appcompat.widget.AppCompatTextView r45 = (androidx.appcompat.widget.AppCompatTextView) r45
            r0 = 25
            r0 = r63[r0]
            r46 = r0
            androidx.appcompat.widget.AppCompatTextView r46 = (androidx.appcompat.widget.AppCompatTextView) r46
            r0 = 23
            r0 = r63[r0]
            r47 = r0
            androidx.appcompat.widget.AppCompatTextView r47 = (androidx.appcompat.widget.AppCompatTextView) r47
            r0 = 19
            r0 = r63[r0]
            r48 = r0
            androidx.appcompat.widget.AppCompatTextView r48 = (androidx.appcompat.widget.AppCompatTextView) r48
            r0 = 21
            r0 = r63[r0]
            r49 = r0
            androidx.appcompat.widget.AppCompatTextView r49 = (androidx.appcompat.widget.AppCompatTextView) r49
            r0 = 17
            r0 = r63[r0]
            r50 = r0
            androidx.appcompat.widget.AppCompatTextView r50 = (androidx.appcompat.widget.AppCompatTextView) r50
            r0 = 31
            r0 = r63[r0]
            r51 = r0
            androidx.appcompat.widget.AppCompatTextView r51 = (androidx.appcompat.widget.AppCompatTextView) r51
            r0 = 37
            r0 = r63[r0]
            r52 = r0
            androidx.appcompat.widget.AppCompatTextView r52 = (androidx.appcompat.widget.AppCompatTextView) r52
            r0 = 35
            r0 = r63[r0]
            r53 = r0
            androidx.appcompat.widget.AppCompatTextView r53 = (androidx.appcompat.widget.AppCompatTextView) r53
            r0 = 5
            r0 = r63[r0]
            r54 = r0
            android.widget.TextView r54 = (android.widget.TextView) r54
            r0 = 33
            r0 = r63[r0]
            r55 = r0
            androidx.appcompat.widget.AppCompatTextView r55 = (androidx.appcompat.widget.AppCompatTextView) r55
            r0 = 3
            r0 = r63[r0]
            r2 = 0
            if (r0 == 0) goto L_0x019c
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r59 = r0
            goto L_0x019e
        L_0x019c:
            r59 = r2
        L_0x019e:
            r0 = 40
            r0 = r63[r0]
            r56 = r0
            android.widget.ImageView r56 = (android.widget.ImageView) r56
            r0 = 39
            r0 = r63[r0]
            r57 = r0
            android.widget.ImageView r57 = (android.widget.ImageView) r57
            r0 = 43
            r0 = r63[r0]
            r58 = r0
            androidx.cardview.widget.CardView r58 = (androidx.cardview.widget.CardView) r58
            r0 = r60
            r1 = r61
            r2 = r62
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
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r43
            r43 = r44
            r44 = r45
            r45 = r46
            r46 = r47
            r47 = r48
            r48 = r49
            r49 = r50
            r50 = r51
            r51 = r52
            r52 = r53
            r53 = r54
            r54 = r55
            r55 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r0 = -1
            r2 = r60
            r2.D0 = r0
            r0 = 0
            r0 = r63[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.f27576z0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r63[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.A0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r63[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.B0 = r0
            r0.setTag(r1)
            r0 = 4
            r0 = r63[r0]
            if (r0 == 0) goto L_0x0242
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            goto L_0x0243
        L_0x0242:
            r0 = r1
        L_0x0243:
            r2.C0 = r0
            r0 = r62
            r2.w(r0)
            r60.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.n5.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
