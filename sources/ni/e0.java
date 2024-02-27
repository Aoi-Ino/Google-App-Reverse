package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;

public class e0 extends d0 {
    private static final SparseIntArray I0;
    private final RelativeLayout G0;
    private long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.round_card_view, 3);
        sparseIntArray.put(R.id.iv_image, 4);
        sparseIntArray.put(R.id.tv_cl_Details, 5);
        sparseIntArray.put(R.id.tv_view_details, 6);
        sparseIntArray.put(R.id.ll_existing_curr_perr_address, 7);
        sparseIntArray.put(R.id.tv_exist_curr_address, 8);
        sparseIntArray.put(R.id.present_address_txt, 9);
        sparseIntArray.put(R.id.tv_exist_perm_address, 10);
        sparseIntArray.put(R.id.permanent_address_txt, 11);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 12);
        sparseIntArray.put(R.id.new_app_arrow_up_current, 13);
        sparseIntArray.put(R.id.new_app_arrow_down_current, 14);
        sparseIntArray.put(R.id.ll_new_curr_existing, 15);
        sparseIntArray.put(R.id.tv_state, 16);
        sparseIntArray.put(R.id.dl_current_address_state_et, 17);
        sparseIntArray.put(R.id.tv_district, 18);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 19);
        sparseIntArray.put(R.id.tv_taluka_block, 20);
        sparseIntArray.put(R.id.dl_current_address_city_et, 21);
        sparseIntArray.put(R.id.village_town_rg, 22);
        sparseIntArray.put(R.id.village_rb, 23);
        sparseIntArray.put(R.id.town_rb, 24);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 25);
        sparseIntArray.put(R.id.tv_house_door_flat, 26);
        sparseIntArray.put(R.id.dl_select_house_number_et, 27);
        sparseIntArray.put(R.id.tv_street_locality, 28);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 29);
        sparseIntArray.put(R.id.tv_landmark, 30);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 31);
        sparseIntArray.put(R.id.tv_pincode, 32);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 33);
        sparseIntArray.put(R.id.header_title_current_address_details, 34);
        sparseIntArray.put(R.id.dropdown_arrow_ca_details, 35);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 36);
        sparseIntArray.put(R.id.same_as_current_address_cb, 37);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 38);
        sparseIntArray.put(R.id.new_app_arrow_up, 39);
        sparseIntArray.put(R.id.new_app_arrow_down, 40);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 41);
        sparseIntArray.put(R.id.tv_state_new, 42);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 43);
        sparseIntArray.put(R.id.tv_district_new, 44);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 45);
        sparseIntArray.put(R.id.tv_taluka_block_new, 46);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 47);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 48);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 49);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 50);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 51);
        sparseIntArray.put(R.id.tv_house_door_new, 52);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 53);
        sparseIntArray.put(R.id.tv_street_locality_new, 54);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 55);
        sparseIntArray.put(R.id.tv_landmark_new, 56);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 57);
        sparseIntArray.put(R.id.tv_pincode_new, 58);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 59);
        sparseIntArray.put(R.id.submit_request, 60);
        sparseIntArray.put(R.id.pb_coa, 61);
    }

    public e0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 62, (h.i) null, I0));
    }

    public void A() {
        synchronized (this) {
            this.H0 = 4;
        }
        u();
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.H0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.H0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(DlAddress dlAddress) {
        this.F0 = dlAddress;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e0(androidx.databinding.e r67, android.view.View r68, java.lang.Object[] r69) {
        /*
            r66 = this;
            r15 = r66
            r3 = 0
            r0 = 21
            r0 = r69[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 19
            r0 = r69[r0]
            r5 = r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 17
            r0 = r69[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 53
            r0 = r69[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 57
            r0 = r69[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 59
            r0 = r69[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 55
            r0 = r69[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 47
            r0 = r69[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 45
            r0 = r69[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 43
            r0 = r69[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 51
            r0 = r69[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 50
            r0 = r69[r0]
            r16 = r0
            android.widget.RadioButton r16 = (android.widget.RadioButton) r16
            r0 = 49
            r0 = r69[r0]
            r17 = r0
            android.widget.RadioButton r17 = (android.widget.RadioButton) r17
            r0 = 48
            r0 = r69[r0]
            r18 = r0
            android.widget.RadioGroup r18 = (android.widget.RadioGroup) r18
            r0 = 27
            r0 = r69[r0]
            r19 = r0
            android.widget.EditText r19 = (android.widget.EditText) r19
            r0 = 25
            r0 = r69[r0]
            r20 = r0
            android.widget.EditText r20 = (android.widget.EditText) r20
            r0 = 31
            r0 = r69[r0]
            r21 = r0
            android.widget.EditText r21 = (android.widget.EditText) r21
            r0 = 33
            r0 = r69[r0]
            r22 = r0
            android.widget.EditText r22 = (android.widget.EditText) r22
            r0 = 29
            r0 = r69[r0]
            r23 = r0
            android.widget.EditText r23 = (android.widget.EditText) r23
            r0 = 35
            r0 = r69[r0]
            r24 = r0
            android.widget.ImageView r24 = (android.widget.ImageView) r24
            r0 = 36
            r0 = r69[r0]
            r25 = r0
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r0 = 41
            r0 = r69[r0]
            r26 = r0
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r0 = 34
            r0 = r69[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 4
            r0 = r69[r0]
            r28 = r0
            android.widget.ImageView r28 = (android.widget.ImageView) r28
            r0 = 7
            r0 = r69[r0]
            r29 = r0
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            r0 = 15
            r0 = r69[r0]
            r30 = r0
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            r0 = 2
            r0 = r69[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00d5
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r31 = r0
            goto L_0x00d7
        L_0x00d5:
            r31 = r2
        L_0x00d7:
            r0 = 1
            r0 = r69[r0]
            if (r0 == 0) goto L_0x00e5
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r65 = r0
            goto L_0x00e7
        L_0x00e5:
            r65 = r2
        L_0x00e7:
            r0 = 40
            r0 = r69[r0]
            r32 = r0
            android.widget.ImageView r32 = (android.widget.ImageView) r32
            r0 = 14
            r0 = r69[r0]
            r33 = r0
            android.widget.ImageView r33 = (android.widget.ImageView) r33
            r0 = 39
            r0 = r69[r0]
            r34 = r0
            android.widget.ImageView r34 = (android.widget.ImageView) r34
            r0 = 13
            r0 = r69[r0]
            r35 = r0
            android.widget.ImageView r35 = (android.widget.ImageView) r35
            r0 = 61
            r0 = r69[r0]
            r36 = r0
            android.widget.ProgressBar r36 = (android.widget.ProgressBar) r36
            r0 = 11
            r0 = r69[r0]
            r37 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r37 = (com.nic.mparivahan.dlservices.widget.MyTextView) r37
            r0 = 9
            r0 = r69[r0]
            r38 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r38 = (com.nic.mparivahan.dlservices.widget.MyTextView) r38
            r0 = 3
            r0 = r69[r0]
            r39 = r0
            androidx.cardview.widget.CardView r39 = (androidx.cardview.widget.CardView) r39
            r0 = 37
            r0 = r69[r0]
            r40 = r0
            android.widget.CheckBox r40 = (android.widget.CheckBox) r40
            r0 = 60
            r0 = r69[r0]
            r41 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r41 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r41
            r0 = 24
            r0 = r69[r0]
            r42 = r0
            android.widget.RadioButton r42 = (android.widget.RadioButton) r42
            r0 = 5
            r0 = r69[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 18
            r0 = r69[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 44
            r0 = r69[r0]
            r45 = r0
            android.widget.TextView r45 = (android.widget.TextView) r45
            r0 = 8
            r0 = r69[r0]
            r46 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r46 = (com.nic.mparivahan.dlservices.widget.MyTextView) r46
            r0 = 10
            r0 = r69[r0]
            r47 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r47 = (com.nic.mparivahan.dlservices.widget.MyTextView) r47
            r0 = 26
            r0 = r69[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 52
            r0 = r69[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 30
            r0 = r69[r0]
            r50 = r0
            android.widget.TextView r50 = (android.widget.TextView) r50
            r0 = 56
            r0 = r69[r0]
            r51 = r0
            android.widget.TextView r51 = (android.widget.TextView) r51
            r0 = 12
            r0 = r69[r0]
            r52 = r0
            android.widget.TextView r52 = (android.widget.TextView) r52
            r0 = 38
            r0 = r69[r0]
            r53 = r0
            android.widget.TextView r53 = (android.widget.TextView) r53
            r0 = 32
            r0 = r69[r0]
            r54 = r0
            android.widget.TextView r54 = (android.widget.TextView) r54
            r0 = 58
            r0 = r69[r0]
            r55 = r0
            android.widget.TextView r55 = (android.widget.TextView) r55
            r0 = 16
            r0 = r69[r0]
            r56 = r0
            android.widget.TextView r56 = (android.widget.TextView) r56
            r0 = 42
            r0 = r69[r0]
            r57 = r0
            android.widget.TextView r57 = (android.widget.TextView) r57
            r0 = 28
            r0 = r69[r0]
            r58 = r0
            android.widget.TextView r58 = (android.widget.TextView) r58
            r0 = 54
            r0 = r69[r0]
            r59 = r0
            android.widget.TextView r59 = (android.widget.TextView) r59
            r0 = 20
            r0 = r69[r0]
            r60 = r0
            android.widget.TextView r60 = (android.widget.TextView) r60
            r0 = 46
            r0 = r69[r0]
            r61 = r0
            android.widget.TextView r61 = (android.widget.TextView) r61
            r0 = 6
            r0 = r69[r0]
            r62 = r0
            android.widget.TextView r62 = (android.widget.TextView) r62
            r0 = 23
            r0 = r69[r0]
            r63 = r0
            android.widget.RadioButton r63 = (android.widget.RadioButton) r63
            r0 = 22
            r0 = r69[r0]
            r64 = r0
            android.widget.RadioGroup r64 = (android.widget.RadioGroup) r64
            r0 = r66
            r1 = r67
            r2 = r68
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
            r31 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            r0 = -1
            r2 = r66
            r2.H0 = r0
            r0 = 0
            r0 = r69[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.G0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r68
            r2.w(r0)
            r66.A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.e0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
