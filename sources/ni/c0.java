package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;

public class c0 extends b0 {
    private static final SparseIntArray Y0;
    private final RelativeLayout V0;
    private final LinearLayout W0;
    private long X0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y0 = sparseIntArray;
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
        sparseIntArray.put(R.id.ll_cat, 13);
        sparseIntArray.put(R.id.txtAppCategory, 14);
        sparseIntArray.put(R.id.spn_app_cat, 15);
        sparseIntArray.put(R.id.tv_exist_address, 16);
        sparseIntArray.put(R.id.exsting_arrow_up, 17);
        sparseIntArray.put(R.id.existing_arrow_down, 18);
        sparseIntArray.put(R.id.ll_existing_curr_perr_address, 19);
        sparseIntArray.put(R.id.tv_exist_curr_address, 20);
        sparseIntArray.put(R.id.present_address_txt, 21);
        sparseIntArray.put(R.id.tv_exist_perm_address, 22);
        sparseIntArray.put(R.id.permanent_address_txt, 23);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 24);
        sparseIntArray.put(R.id.new_current_arrow_up, 25);
        sparseIntArray.put(R.id.new_current_arrow_down, 26);
        sparseIntArray.put(R.id.ll_new_curr_existing, 27);
        sparseIntArray.put(R.id.tv_valid_from, 28);
        sparseIntArray.put(R.id.header_old_address_title, 29);
        sparseIntArray.put(R.id.tv_old_addr_detail, 30);
        sparseIntArray.put(R.id.tv_state, 31);
        sparseIntArray.put(R.id.dl_current_address_state_et, 32);
        sparseIntArray.put(R.id.tv_district, 33);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 34);
        sparseIntArray.put(R.id.tv_taluka_block, 35);
        sparseIntArray.put(R.id.dl_current_address_city_et, 36);
        sparseIntArray.put(R.id.village_town_rg, 37);
        sparseIntArray.put(R.id.village_rb, 38);
        sparseIntArray.put(R.id.town_rb, 39);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 40);
        sparseIntArray.put(R.id.tv_house_door_flat, 41);
        sparseIntArray.put(R.id.dl_select_house_number_et, 42);
        sparseIntArray.put(R.id.tv_street_locality, 43);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 44);
        sparseIntArray.put(R.id.tv_landmark, 45);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 46);
        sparseIntArray.put(R.id.tv_pincode, 47);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 48);
        sparseIntArray.put(R.id.header_title_current_address_details, 49);
        sparseIntArray.put(R.id.dropdown_arrow_ca_details, 50);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 51);
        sparseIntArray.put(R.id.same_as_current_address_cb, 52);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 53);
        sparseIntArray.put(R.id.new_app_arrow_up, 54);
        sparseIntArray.put(R.id.new_app_arrow_down, 55);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 56);
        sparseIntArray.put(R.id.tv_state_new, 57);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 58);
        sparseIntArray.put(R.id.tv_district_new, 59);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 60);
        sparseIntArray.put(R.id.tv_taluka_block_new, 61);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 62);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 63);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 64);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 65);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 66);
        sparseIntArray.put(R.id.tv_house_door_new, 67);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 68);
        sparseIntArray.put(R.id.tv_street_locality_new, 69);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 70);
        sparseIntArray.put(R.id.tv_landmark_new, 71);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 72);
        sparseIntArray.put(R.id.tv_pincode_new, 73);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 74);
        sparseIntArray.put(R.id.submit_request, 75);
        sparseIntArray.put(R.id.pb_coa, 76);
    }

    public c0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 77, (h.i) null, Y0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.X0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.X0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x(DlAddress dlAddress) {
        this.U0 = dlAddress;
    }

    public void y(DlAddress dlAddress) {
        this.T0 = dlAddress;
    }

    public void z() {
        synchronized (this) {
            this.X0 = 4;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c0(androidx.databinding.e r81, android.view.View r82, java.lang.Object[] r83) {
        /*
            r80 = this;
            r15 = r80
            r3 = 0
            r0 = 36
            r0 = r83[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 34
            r0 = r83[r0]
            r5 = r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 32
            r0 = r83[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 6
            r0 = r83[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 68
            r0 = r83[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 72
            r0 = r83[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 74
            r0 = r83[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 70
            r0 = r83[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 62
            r0 = r83[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 60
            r0 = r83[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 58
            r0 = r83[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 66
            r0 = r83[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 65
            r0 = r83[r0]
            r17 = r0
            android.widget.RadioButton r17 = (android.widget.RadioButton) r17
            r0 = 64
            r0 = r83[r0]
            r18 = r0
            android.widget.RadioButton r18 = (android.widget.RadioButton) r18
            r0 = 63
            r0 = r83[r0]
            r19 = r0
            android.widget.RadioGroup r19 = (android.widget.RadioGroup) r19
            r0 = 42
            r0 = r83[r0]
            r20 = r0
            android.widget.EditText r20 = (android.widget.EditText) r20
            r0 = 40
            r0 = r83[r0]
            r21 = r0
            android.widget.EditText r21 = (android.widget.EditText) r21
            r0 = 46
            r0 = r83[r0]
            r22 = r0
            android.widget.EditText r22 = (android.widget.EditText) r22
            r0 = 48
            r0 = r83[r0]
            r23 = r0
            android.widget.EditText r23 = (android.widget.EditText) r23
            r0 = 44
            r0 = r83[r0]
            r24 = r0
            android.widget.EditText r24 = (android.widget.EditText) r24
            r0 = 50
            r0 = r83[r0]
            r25 = r0
            android.widget.ImageView r25 = (android.widget.ImageView) r25
            r0 = 51
            r0 = r83[r0]
            r26 = r0
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r0 = 56
            r0 = r83[r0]
            r27 = r0
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            r0 = 18
            r0 = r83[r0]
            r28 = r0
            android.widget.ImageView r28 = (android.widget.ImageView) r28
            r0 = 17
            r0 = r83[r0]
            r29 = r0
            android.widget.ImageView r29 = (android.widget.ImageView) r29
            r0 = 29
            r0 = r83[r0]
            r30 = r0
            android.widget.RelativeLayout r30 = (android.widget.RelativeLayout) r30
            r0 = 49
            r0 = r83[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 9
            r0 = r83[r0]
            r32 = r0
            androidx.cardview.widget.CardView r32 = (androidx.cardview.widget.CardView) r32
            r0 = 11
            r0 = r83[r0]
            r33 = r0
            android.widget.ImageView r33 = (android.widget.ImageView) r33
            r0 = 1
            r0 = r83[r0]
            r34 = r0
            android.widget.LinearLayout r34 = (android.widget.LinearLayout) r34
            r0 = 13
            r0 = r83[r0]
            r35 = r0
            android.widget.LinearLayout r35 = (android.widget.LinearLayout) r35
            r0 = 19
            r0 = r83[r0]
            r36 = r0
            android.widget.LinearLayout r36 = (android.widget.LinearLayout) r36
            r0 = 27
            r0 = r83[r0]
            r37 = r0
            android.widget.LinearLayout r37 = (android.widget.LinearLayout) r37
            r0 = 4
            r0 = r83[r0]
            r2 = 0
            if (r0 == 0) goto L_0x010d
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r38 = r0
            goto L_0x010f
        L_0x010d:
            r38 = r2
        L_0x010f:
            r0 = 3
            r0 = r83[r0]
            if (r0 == 0) goto L_0x011d
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r39 = r0
            goto L_0x011f
        L_0x011d:
            r39 = r2
        L_0x011f:
            r0 = 12
            r0 = r83[r0]
            r40 = r0
            androidx.recyclerview.widget.RecyclerView r40 = (androidx.recyclerview.widget.RecyclerView) r40
            r0 = 55
            r0 = r83[r0]
            r41 = r0
            android.widget.ImageView r41 = (android.widget.ImageView) r41
            r0 = 54
            r0 = r83[r0]
            r42 = r0
            android.widget.ImageView r42 = (android.widget.ImageView) r42
            r0 = 26
            r0 = r83[r0]
            r43 = r0
            android.widget.ImageView r43 = (android.widget.ImageView) r43
            r0 = 25
            r0 = r83[r0]
            r44 = r0
            android.widget.ImageView r44 = (android.widget.ImageView) r44
            r0 = 76
            r0 = r83[r0]
            r45 = r0
            android.widget.ProgressBar r45 = (android.widget.ProgressBar) r45
            r0 = 23
            r0 = r83[r0]
            r46 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r46 = (com.nic.mparivahan.dlservices.widget.MyTextView) r46
            r0 = 21
            r0 = r83[r0]
            r47 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r47 = (com.nic.mparivahan.dlservices.widget.MyTextView) r47
            r0 = 5
            r0 = r83[r0]
            if (r0 == 0) goto L_0x016d
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            r79 = r0
            goto L_0x016f
        L_0x016d:
            r79 = r2
        L_0x016f:
            r0 = 10
            r0 = r83[r0]
            r48 = r0
            androidx.cardview.widget.CardView r48 = (androidx.cardview.widget.CardView) r48
            r0 = 52
            r0 = r83[r0]
            r49 = r0
            android.widget.CheckBox r49 = (android.widget.CheckBox) r49
            r0 = 8
            r0 = r83[r0]
            r50 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r50 = (com.nic.mparivahan.dlservices.widget.MyTextView) r50
            r0 = 15
            r0 = r83[r0]
            r51 = r0
            android.widget.Spinner r51 = (android.widget.Spinner) r51
            r0 = 75
            r0 = r83[r0]
            r52 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r52 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r52
            r0 = 39
            r0 = r83[r0]
            r53 = r0
            android.widget.RadioButton r53 = (android.widget.RadioButton) r53
            r0 = 33
            r0 = r83[r0]
            r54 = r0
            android.widget.TextView r54 = (android.widget.TextView) r54
            r0 = 59
            r0 = r83[r0]
            r55 = r0
            android.widget.TextView r55 = (android.widget.TextView) r55
            r0 = 16
            r0 = r83[r0]
            r56 = r0
            android.widget.TextView r56 = (android.widget.TextView) r56
            r0 = 20
            r0 = r83[r0]
            r57 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r57 = (com.nic.mparivahan.dlservices.widget.MyTextView) r57
            r0 = 22
            r0 = r83[r0]
            r58 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r58 = (com.nic.mparivahan.dlservices.widget.MyTextView) r58
            r0 = 41
            r0 = r83[r0]
            r59 = r0
            android.widget.TextView r59 = (android.widget.TextView) r59
            r0 = 67
            r0 = r83[r0]
            r60 = r0
            android.widget.TextView r60 = (android.widget.TextView) r60
            r0 = 45
            r0 = r83[r0]
            r61 = r0
            android.widget.TextView r61 = (android.widget.TextView) r61
            r0 = 71
            r0 = r83[r0]
            r62 = r0
            android.widget.TextView r62 = (android.widget.TextView) r62
            r0 = 24
            r0 = r83[r0]
            r63 = r0
            android.widget.TextView r63 = (android.widget.TextView) r63
            r0 = 53
            r0 = r83[r0]
            r64 = r0
            android.widget.TextView r64 = (android.widget.TextView) r64
            r0 = 30
            r0 = r83[r0]
            r65 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r65 = (com.nic.mparivahan.dlservices.widget.MyTextView) r65
            r0 = 47
            r0 = r83[r0]
            r66 = r0
            android.widget.TextView r66 = (android.widget.TextView) r66
            r0 = 73
            r0 = r83[r0]
            r67 = r0
            android.widget.TextView r67 = (android.widget.TextView) r67
            r0 = 31
            r0 = r83[r0]
            r68 = r0
            android.widget.TextView r68 = (android.widget.TextView) r68
            r0 = 57
            r0 = r83[r0]
            r69 = r0
            android.widget.TextView r69 = (android.widget.TextView) r69
            r0 = 43
            r0 = r83[r0]
            r70 = r0
            android.widget.TextView r70 = (android.widget.TextView) r70
            r0 = 69
            r0 = r83[r0]
            r71 = r0
            android.widget.TextView r71 = (android.widget.TextView) r71
            r0 = 35
            r0 = r83[r0]
            r72 = r0
            android.widget.TextView r72 = (android.widget.TextView) r72
            r0 = 61
            r0 = r83[r0]
            r73 = r0
            android.widget.TextView r73 = (android.widget.TextView) r73
            r0 = 28
            r0 = r83[r0]
            r74 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r74 = (com.nic.mparivahan.dlservices.widget.MyTextView) r74
            r0 = 14
            r0 = r83[r0]
            r75 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r75 = (com.nic.mparivahan.dlservices.widget.MyTextView) r75
            r0 = 7
            r0 = r83[r0]
            r76 = r0
            android.widget.TextView r76 = (android.widget.TextView) r76
            r0 = 38
            r0 = r83[r0]
            r77 = r0
            android.widget.RadioButton r77 = (android.widget.RadioButton) r77
            r0 = 37
            r0 = r83[r0]
            r78 = r0
            android.widget.RadioGroup r78 = (android.widget.RadioGroup) r78
            r0 = r80
            r1 = r81
            r2 = r82
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
            r47 = r79
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78)
            r0 = -1
            r2 = r80
            r2.X0 = r0
            android.widget.LinearLayout r0 = r2.Z
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r83[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.V0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r83[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.W0 = r0
            r0.setTag(r1)
            r0 = r82
            r2.w(r0)
            r80.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.c0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
