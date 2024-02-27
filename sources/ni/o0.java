package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class o0 extends n0 {

    /* renamed from: x0  reason: collision with root package name */
    private static final SparseIntArray f27720x0;

    /* renamed from: s0  reason: collision with root package name */
    private final CoordinatorLayout f27721s0;

    /* renamed from: t0  reason: collision with root package name */
    private final LinearLayout f27722t0;

    /* renamed from: u0  reason: collision with root package name */
    private final LinearLayout f27723u0;

    /* renamed from: v0  reason: collision with root package name */
    private final nc f27724v0;

    /* renamed from: w0  reason: collision with root package name */
    private long f27725w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27720x0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.txtservicename, 4);
        sparseIntArray.put(R.id.txt_dl_no, 6);
        sparseIntArray.put(R.id.image_cross, 7);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 8);
        sparseIntArray.put(R.id.select_service, 9);
        sparseIntArray.put(R.id.icon_image, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.round_card_view, 12);
        sparseIntArray.put(R.id.tv_personal_info_title, 13);
        sparseIntArray.put(R.id.per_up_arrow, 14);
        sparseIntArray.put(R.id.per_down_arrow, 15);
        sparseIntArray.put(R.id.ll_personal_details, 16);
        sparseIntArray.put(R.id.tv_dl_holder_name, 17);
        sparseIntArray.put(R.id.txt_dl_holder_name, 18);
        sparseIntArray.put(R.id.tv_father_name, 19);
        sparseIntArray.put(R.id.txt_dl_father_name, 20);
        sparseIntArray.put(R.id.tv_dob, 21);
        sparseIntArray.put(R.id.txt_dl_holder_dob, 22);
        sparseIntArray.put(R.id.tv_perm_addr, 23);
        sparseIntArray.put(R.id.txt_dl_address, 24);
        sparseIntArray.put(R.id.tv_dl_info_title, 25);
        sparseIntArray.put(R.id.dl_up_arrow, 26);
        sparseIntArray.put(R.id.dl_down_arrow, 27);
        sparseIntArray.put(R.id.ll_licence_details, 28);
        sparseIntArray.put(R.id.tv_nt_valid_upto, 29);
        sparseIntArray.put(R.id.txt_valid, 30);
        sparseIntArray.put(R.id.tv_issue_authority, 31);
        sparseIntArray.put(R.id.txt_authority, 32);
        sparseIntArray.put(R.id.tv_last_endor_rto, 33);
        sparseIntArray.put(R.id.txt_status, 34);
        sparseIntArray.put(R.id.lmvHolder, 35);
        sparseIntArray.put(R.id.vehicle_Details_Cv, 36);
        sparseIntArray.put(R.id.new_driving_license_header, 37);
        sparseIntArray.put(R.id.down_arrow, 38);
        sparseIntArray.put(R.id.btn_drop_down, 39);
        sparseIntArray.put(R.id.dl_personal_info_linear, 40);
        sparseIntArray.put(R.id.tv_dl_hol_name, 41);
        sparseIntArray.put(R.id.dl_holder_name, 42);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 43);
        sparseIntArray.put(R.id.holder_father_name, 44);
        sparseIntArray.put(R.id.tv_dl_dob, 45);
        sparseIntArray.put(R.id.dl_dob, 46);
        sparseIntArray.put(R.id.tv_dl_blood_group, 47);
        sparseIntArray.put(R.id.blood_group, 48);
        sparseIntArray.put(R.id.tv_present_addr, 49);
        sparseIntArray.put(R.id.present_address_txt, 50);
        sparseIntArray.put(R.id.next_request, 51);
    }

    public o0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 52, (h.i) null, f27720x0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f27725w0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f27725w0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f27725w0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o0(androidx.databinding.e r54, android.view.View r55, java.lang.Object[] r56) {
        /*
            r53 = this;
            r15 = r53
            r3 = 0
            r0 = 48
            r0 = r56[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 39
            r0 = r56[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatButton r5 = (androidx.appcompat.widget.AppCompatButton) r5
            r0 = 46
            r0 = r56[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 27
            r0 = r56[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 42
            r0 = r56[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 40
            r0 = r56[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 26
            r0 = r56[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 38
            r0 = r56[r0]
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 44
            r0 = r56[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 10
            r0 = r56[r0]
            r13 = r0
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            r0 = 7
            r0 = r56[r0]
            r14 = r0
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0 = 11
            r0 = r56[r0]
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r0 = 28
            r0 = r56[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 16
            r0 = r56[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 35
            r0 = r56[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 3
            r0 = r56[r0]
            r2 = 0
            if (r0 == 0) goto L_0x007e
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r20 = r0
            goto L_0x0080
        L_0x007e:
            r20 = r2
        L_0x0080:
            r0 = 37
            r0 = r56[r0]
            r21 = r0
            androidx.appcompat.widget.AppCompatTextView r21 = (androidx.appcompat.widget.AppCompatTextView) r21
            r0 = 51
            r0 = r56[r0]
            r22 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r22 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r22
            r0 = 15
            r0 = r56[r0]
            r23 = r0
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            r0 = 14
            r0 = r56[r0]
            r24 = r0
            android.widget.ImageView r24 = (android.widget.ImageView) r24
            r0 = 50
            r0 = r56[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 12
            r0 = r56[r0]
            r26 = r0
            androidx.cardview.widget.CardView r26 = (androidx.cardview.widget.CardView) r26
            r0 = 9
            r0 = r56[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatTextView r27 = (androidx.appcompat.widget.AppCompatTextView) r27
            r0 = 47
            r0 = r56[r0]
            r28 = r0
            androidx.appcompat.widget.AppCompatTextView r28 = (androidx.appcompat.widget.AppCompatTextView) r28
            r0 = 45
            r0 = r56[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatTextView r29 = (androidx.appcompat.widget.AppCompatTextView) r29
            r0 = 41
            r0 = r56[r0]
            r30 = r0
            androidx.appcompat.widget.AppCompatTextView r30 = (androidx.appcompat.widget.AppCompatTextView) r30
            r0 = 17
            r0 = r56[r0]
            r31 = r0
            androidx.appcompat.widget.AppCompatTextView r31 = (androidx.appcompat.widget.AppCompatTextView) r31
            r0 = 25
            r0 = r56[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 21
            r0 = r56[r0]
            r33 = r0
            androidx.appcompat.widget.AppCompatTextView r33 = (androidx.appcompat.widget.AppCompatTextView) r33
            r0 = 19
            r0 = r56[r0]
            r34 = r0
            androidx.appcompat.widget.AppCompatTextView r34 = (androidx.appcompat.widget.AppCompatTextView) r34
            r0 = 31
            r0 = r56[r0]
            r35 = r0
            androidx.appcompat.widget.AppCompatTextView r35 = (androidx.appcompat.widget.AppCompatTextView) r35
            r0 = 33
            r0 = r56[r0]
            r36 = r0
            androidx.appcompat.widget.AppCompatTextView r36 = (androidx.appcompat.widget.AppCompatTextView) r36
            r0 = 29
            r0 = r56[r0]
            r37 = r0
            androidx.appcompat.widget.AppCompatTextView r37 = (androidx.appcompat.widget.AppCompatTextView) r37
            r0 = 23
            r0 = r56[r0]
            r38 = r0
            androidx.appcompat.widget.AppCompatTextView r38 = (androidx.appcompat.widget.AppCompatTextView) r38
            r0 = 13
            r0 = r56[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 49
            r0 = r56[r0]
            r40 = r0
            androidx.appcompat.widget.AppCompatTextView r40 = (androidx.appcompat.widget.AppCompatTextView) r40
            r0 = 8
            r0 = r56[r0]
            r41 = r0
            androidx.appcompat.widget.AppCompatTextView r41 = (androidx.appcompat.widget.AppCompatTextView) r41
            r0 = 43
            r0 = r56[r0]
            r42 = r0
            androidx.appcompat.widget.AppCompatTextView r42 = (androidx.appcompat.widget.AppCompatTextView) r42
            r0 = 32
            r0 = r56[r0]
            r43 = r0
            androidx.appcompat.widget.AppCompatTextView r43 = (androidx.appcompat.widget.AppCompatTextView) r43
            r0 = 24
            r0 = r56[r0]
            r44 = r0
            androidx.appcompat.widget.AppCompatTextView r44 = (androidx.appcompat.widget.AppCompatTextView) r44
            r0 = 20
            r0 = r56[r0]
            r45 = r0
            androidx.appcompat.widget.AppCompatTextView r45 = (androidx.appcompat.widget.AppCompatTextView) r45
            r0 = 22
            r0 = r56[r0]
            r46 = r0
            androidx.appcompat.widget.AppCompatTextView r46 = (androidx.appcompat.widget.AppCompatTextView) r46
            r0 = 18
            r0 = r56[r0]
            r47 = r0
            androidx.appcompat.widget.AppCompatTextView r47 = (androidx.appcompat.widget.AppCompatTextView) r47
            r0 = 6
            r0 = r56[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 34
            r0 = r56[r0]
            r49 = r0
            androidx.appcompat.widget.AppCompatTextView r49 = (androidx.appcompat.widget.AppCompatTextView) r49
            r0 = 30
            r0 = r56[r0]
            r50 = r0
            androidx.appcompat.widget.AppCompatTextView r50 = (androidx.appcompat.widget.AppCompatTextView) r50
            r0 = 4
            r0 = r56[r0]
            if (r0 == 0) goto L_0x017d
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r52 = r0
            goto L_0x017f
        L_0x017d:
            r52 = r2
        L_0x017f:
            r0 = 36
            r0 = r56[r0]
            r51 = r0
            androidx.cardview.widget.CardView r51 = (androidx.cardview.widget.CardView) r51
            r0 = r53
            r1 = r54
            r2 = r55
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
            r50 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r0 = -1
            r2 = r53
            r2.f27725w0 = r0
            r0 = 0
            r0 = r56[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.f27721s0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r56[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f27722t0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r56[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f27723u0 = r0
            r0.setTag(r1)
            r0 = 5
            r0 = r56[r0]
            if (r0 == 0) goto L_0x0209
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            goto L_0x020a
        L_0x0209:
            r0 = r1
        L_0x020a:
            r2.f27724v0 = r0
            r0 = r55
            r2.w(r0)
            r53.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.o0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
