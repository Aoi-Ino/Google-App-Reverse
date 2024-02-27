package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;

public class o6 extends n6 {
    private static final SparseIntArray F0;
    private final RelativeLayout D0;
    private long E0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.round_card_view, 2);
        sparseIntArray.put(R.id.iv_image, 3);
        sparseIntArray.put(R.id.ll_existing_curr_perr_address, 4);
        sparseIntArray.put(R.id.tv_exist_curr_address, 5);
        sparseIntArray.put(R.id.present_address_txt, 6);
        sparseIntArray.put(R.id.tv_exist_perm_address, 7);
        sparseIntArray.put(R.id.permanent_address_txt, 8);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 9);
        sparseIntArray.put(R.id.new_app_arrow_up_current, 10);
        sparseIntArray.put(R.id.new_app_arrow_down_current, 11);
        sparseIntArray.put(R.id.ll_new_curr_existing, 12);
        sparseIntArray.put(R.id.tv_state, 13);
        sparseIntArray.put(R.id.dl_current_address_state_et, 14);
        sparseIntArray.put(R.id.tv_district, 15);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 16);
        sparseIntArray.put(R.id.tv_taluka_block, 17);
        sparseIntArray.put(R.id.dl_current_address_city_et, 18);
        sparseIntArray.put(R.id.village_town_rg, 19);
        sparseIntArray.put(R.id.village_rb, 20);
        sparseIntArray.put(R.id.town_rb, 21);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 22);
        sparseIntArray.put(R.id.tv_house_door_flat, 23);
        sparseIntArray.put(R.id.dl_select_house_number_et, 24);
        sparseIntArray.put(R.id.tv_street_locality, 25);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 26);
        sparseIntArray.put(R.id.tv_landmark, 27);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 28);
        sparseIntArray.put(R.id.tv_pincode, 29);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 30);
        sparseIntArray.put(R.id.header_title_current_address_details, 31);
        sparseIntArray.put(R.id.dropdown_arrow_ca_details, 32);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 33);
        sparseIntArray.put(R.id.same_as_current_address_cb, 34);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 35);
        sparseIntArray.put(R.id.new_app_arrow_up_perm, 36);
        sparseIntArray.put(R.id.new_app_arrow_down_perm, 37);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 38);
        sparseIntArray.put(R.id.tv_state_new, 39);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 40);
        sparseIntArray.put(R.id.tv_district_new, 41);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 42);
        sparseIntArray.put(R.id.tv_taluka_block_new, 43);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 44);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 45);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 46);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 47);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 48);
        sparseIntArray.put(R.id.tv_house_door_new, 49);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 50);
        sparseIntArray.put(R.id.tv_street_locality_new, 51);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 52);
        sparseIntArray.put(R.id.tv_landmark_new, 53);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 54);
        sparseIntArray.put(R.id.tv_pincode_new, 55);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 56);
        sparseIntArray.put(R.id.submit_request, 57);
        sparseIntArray.put(R.id.pb_coa, 58);
    }

    public o6(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 59, (h.i) null, F0));
    }

    public void A() {
        synchronized (this) {
            this.E0 = 4;
        }
        u();
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.E0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.E0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(DlAddress dlAddress) {
        this.C0 = dlAddress;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o6(androidx.databinding.e r64, android.view.View r65, java.lang.Object[] r66) {
        /*
            r63 = this;
            r15 = r63
            r3 = 0
            r0 = 18
            r0 = r66[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 16
            r0 = r66[r0]
            r5 = r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 14
            r0 = r66[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 50
            r0 = r66[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 54
            r0 = r66[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 56
            r0 = r66[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 52
            r0 = r66[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 44
            r0 = r66[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 42
            r0 = r66[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 40
            r0 = r66[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 48
            r0 = r66[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 47
            r0 = r66[r0]
            r16 = r0
            android.widget.RadioButton r16 = (android.widget.RadioButton) r16
            r0 = 46
            r0 = r66[r0]
            r17 = r0
            android.widget.RadioButton r17 = (android.widget.RadioButton) r17
            r0 = 45
            r0 = r66[r0]
            r18 = r0
            android.widget.RadioGroup r18 = (android.widget.RadioGroup) r18
            r0 = 24
            r0 = r66[r0]
            r19 = r0
            android.widget.EditText r19 = (android.widget.EditText) r19
            r0 = 22
            r0 = r66[r0]
            r20 = r0
            android.widget.EditText r20 = (android.widget.EditText) r20
            r0 = 28
            r0 = r66[r0]
            r21 = r0
            android.widget.EditText r21 = (android.widget.EditText) r21
            r0 = 30
            r0 = r66[r0]
            r22 = r0
            android.widget.EditText r22 = (android.widget.EditText) r22
            r0 = 26
            r0 = r66[r0]
            r23 = r0
            android.widget.EditText r23 = (android.widget.EditText) r23
            r0 = 32
            r0 = r66[r0]
            r24 = r0
            android.widget.ImageView r24 = (android.widget.ImageView) r24
            r0 = 33
            r0 = r66[r0]
            r25 = r0
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r0 = 38
            r0 = r66[r0]
            r26 = r0
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r0 = 31
            r0 = r66[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 3
            r0 = r66[r0]
            r28 = r0
            android.widget.ImageView r28 = (android.widget.ImageView) r28
            r0 = 4
            r0 = r66[r0]
            r29 = r0
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            r0 = 12
            r0 = r66[r0]
            r30 = r0
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            r0 = 1
            r0 = r66[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00d5
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r62 = r0
            goto L_0x00d7
        L_0x00d5:
            r62 = r2
        L_0x00d7:
            r0 = 11
            r0 = r66[r0]
            r31 = r0
            android.widget.ImageView r31 = (android.widget.ImageView) r31
            r0 = 37
            r0 = r66[r0]
            r32 = r0
            android.widget.ImageView r32 = (android.widget.ImageView) r32
            r0 = 10
            r0 = r66[r0]
            r33 = r0
            android.widget.ImageView r33 = (android.widget.ImageView) r33
            r0 = 36
            r0 = r66[r0]
            r34 = r0
            android.widget.ImageView r34 = (android.widget.ImageView) r34
            r0 = 58
            r0 = r66[r0]
            r35 = r0
            android.widget.ProgressBar r35 = (android.widget.ProgressBar) r35
            r0 = 8
            r0 = r66[r0]
            r36 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r36 = (com.nic.mparivahan.dlservices.widget.MyTextView) r36
            r0 = 6
            r0 = r66[r0]
            r37 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r37 = (com.nic.mparivahan.dlservices.widget.MyTextView) r37
            r0 = 2
            r0 = r66[r0]
            r38 = r0
            androidx.cardview.widget.CardView r38 = (androidx.cardview.widget.CardView) r38
            r0 = 34
            r0 = r66[r0]
            r39 = r0
            android.widget.CheckBox r39 = (android.widget.CheckBox) r39
            r0 = 57
            r0 = r66[r0]
            r40 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r40 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r40
            r0 = 21
            r0 = r66[r0]
            r41 = r0
            android.widget.RadioButton r41 = (android.widget.RadioButton) r41
            r0 = 15
            r0 = r66[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 41
            r0 = r66[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 5
            r0 = r66[r0]
            r44 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r44 = (com.nic.mparivahan.dlservices.widget.MyTextView) r44
            r0 = 7
            r0 = r66[r0]
            r45 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r45 = (com.nic.mparivahan.dlservices.widget.MyTextView) r45
            r0 = 23
            r0 = r66[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 49
            r0 = r66[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 27
            r0 = r66[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 53
            r0 = r66[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 9
            r0 = r66[r0]
            r50 = r0
            android.widget.TextView r50 = (android.widget.TextView) r50
            r0 = 35
            r0 = r66[r0]
            r51 = r0
            android.widget.TextView r51 = (android.widget.TextView) r51
            r0 = 29
            r0 = r66[r0]
            r52 = r0
            android.widget.TextView r52 = (android.widget.TextView) r52
            r0 = 55
            r0 = r66[r0]
            r53 = r0
            android.widget.TextView r53 = (android.widget.TextView) r53
            r0 = 13
            r0 = r66[r0]
            r54 = r0
            android.widget.TextView r54 = (android.widget.TextView) r54
            r0 = 39
            r0 = r66[r0]
            r55 = r0
            android.widget.TextView r55 = (android.widget.TextView) r55
            r0 = 25
            r0 = r66[r0]
            r56 = r0
            android.widget.TextView r56 = (android.widget.TextView) r56
            r0 = 51
            r0 = r66[r0]
            r57 = r0
            android.widget.TextView r57 = (android.widget.TextView) r57
            r0 = 17
            r0 = r66[r0]
            r58 = r0
            android.widget.TextView r58 = (android.widget.TextView) r58
            r0 = 43
            r0 = r66[r0]
            r59 = r0
            android.widget.TextView r59 = (android.widget.TextView) r59
            r0 = 20
            r0 = r66[r0]
            r60 = r0
            android.widget.RadioButton r60 = (android.widget.RadioButton) r60
            r0 = 19
            r0 = r66[r0]
            r61 = r0
            android.widget.RadioGroup r61 = (android.widget.RadioGroup) r61
            r0 = r63
            r1 = r64
            r2 = r65
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
            r30 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r0 = -1
            r2 = r63
            r2.E0 = r0
            r0 = 0
            r0 = r66[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.D0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r65
            r2.w(r0)
            r63.A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.o6.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
