package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class p1 extends o1 {
    private static final SparseIntArray Q0;
    private final RelativeLayout O0;
    private long P0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txt_req_submit, 2);
        sparseIntArray.put(R.id.state, 3);
        sparseIntArray.put(R.id.txt_req_submit_rto, 4);
        sparseIntArray.put(R.id.rto_txt, 5);
        sparseIntArray.put(R.id.txtappdetails, 6);
        sparseIntArray.put(R.id.app_arrow_up, 7);
        sparseIntArray.put(R.id.app_arrow_down, 8);
        sparseIntArray.put(R.id.ll_personal, 9);
        sparseIntArray.put(R.id.txtApplicantName, 10);
        sparseIntArray.put(R.id.etApplicantName, 11);
        sparseIntArray.put(R.id.txtRelation, 12);
        sparseIntArray.put(R.id.txt_relation_val, 13);
        sparseIntArray.put(R.id.txtrelfname, 14);
        sparseIntArray.put(R.id.txtrelfnameval, 15);
        sparseIntArray.put(R.id.txtGender, 16);
        sparseIntArray.put(R.id.genderRg, 17);
        sparseIntArray.put(R.id.maleRb, 18);
        sparseIntArray.put(R.id.femaleRb, 19);
        sparseIntArray.put(R.id.txtDob, 20);
        sparseIntArray.put(R.id.dl_dob, 21);
        sparseIntArray.put(R.id.txtBirthPlace, 22);
        sparseIntArray.put(R.id.etBirthPlace, 23);
        sparseIntArray.put(R.id.txtEducationQ, 24);
        sparseIntArray.put(R.id.eteducation, 25);
        sparseIntArray.put(R.id.txtBloodGroup, 26);
        sparseIntArray.put(R.id.et_blood_group, 27);
        sparseIntArray.put(R.id.txtEmailId, 28);
        sparseIntArray.put(R.id.etEmailId, 29);
        sparseIntArray.put(R.id.txtMobileNo, 30);
        sparseIntArray.put(R.id.etMobileNo, 31);
        sparseIntArray.put(R.id.txtAltMobileNo, 32);
        sparseIntArray.put(R.id.etAltMobileNo, 33);
        sparseIntArray.put(R.id.txt_current_add, 34);
        sparseIntArray.put(R.id.pa_app_arrow_up, 35);
        sparseIntArray.put(R.id.pa_app_arrow_down, 36);
        sparseIntArray.put(R.id.add_one, 37);
        sparseIntArray.put(R.id.tv_state, 38);
        sparseIntArray.put(R.id.current_state, 39);
        sparseIntArray.put(R.id.tv_district, 40);
        sparseIntArray.put(R.id.current_dis, 41);
        sparseIntArray.put(R.id.tv_taluka_block, 42);
        sparseIntArray.put(R.id.current_taluka, 43);
        sparseIntArray.put(R.id.tv_house_door_flat, 44);
        sparseIntArray.put(R.id.current_house, 45);
        sparseIntArray.put(R.id.tv_street_locality, 46);
        sparseIntArray.put(R.id.current_Street, 47);
        sparseIntArray.put(R.id.tv_landmark, 48);
        sparseIntArray.put(R.id.current_landmark, 49);
        sparseIntArray.put(R.id.tv_pincode, 50);
        sparseIntArray.put(R.id.current_pin, 51);
        sparseIntArray.put(R.id.txt_perm_add, 52);
        sparseIntArray.put(R.id.pm_app_arrow_up, 53);
        sparseIntArray.put(R.id.pm_app_arrow_down, 54);
        sparseIntArray.put(R.id.add_two, 55);
        sparseIntArray.put(R.id.tv_p_state, 56);
        sparseIntArray.put(R.id.p_State, 57);
        sparseIntArray.put(R.id.tv_perm_district, 58);
        sparseIntArray.put(R.id.p_district, 59);
        sparseIntArray.put(R.id.tv_perm_taluka_block, 60);
        sparseIntArray.put(R.id.perm_taluka, 61);
        sparseIntArray.put(R.id.tv_perm_house_door_flat, 62);
        sparseIntArray.put(R.id.perm_house, 63);
        sparseIntArray.put(R.id.tv_perm_street_locality, 64);
        sparseIntArray.put(R.id.perm_Street, 65);
        sparseIntArray.put(R.id.tv_perm_landmark, 66);
        sparseIntArray.put(R.id.perm_land_mark, 67);
        sparseIntArray.put(R.id.tv_perm_pincode, 68);
        sparseIntArray.put(R.id.perm_pin_code, 69);
        sparseIntArray.put(R.id.btnNext, 70);
    }

    public p1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 71, (h.i) null, Q0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.P0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.P0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.P0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p1(androidx.databinding.e r76, android.view.View r77, java.lang.Object[] r78) {
        /*
            r75 = this;
            r15 = r75
            r3 = 0
            r0 = 37
            r0 = r78[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 55
            r0 = r78[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 8
            r0 = r78[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 7
            r0 = r78[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 70
            r0 = r78[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatButton r8 = (androidx.appcompat.widget.AppCompatButton) r8
            r0 = 41
            r0 = r78[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 45
            r0 = r78[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 49
            r0 = r78[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 51
            r0 = r78[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 39
            r0 = r78[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 47
            r0 = r78[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 43
            r0 = r78[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 21
            r0 = r78[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 33
            r0 = r78[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 11
            r0 = r78[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 23
            r0 = r78[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 27
            r0 = r78[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 29
            r0 = r78[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 31
            r0 = r78[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 25
            r0 = r78[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 19
            r0 = r78[r0]
            r25 = r0
            android.widget.RadioButton r25 = (android.widget.RadioButton) r25
            r0 = 17
            r0 = r78[r0]
            r26 = r0
            android.widget.RadioGroup r26 = (android.widget.RadioGroup) r26
            r0 = 9
            r0 = r78[r0]
            r27 = r0
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            r0 = 1
            r0 = r78[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00be
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r74 = r0
            goto L_0x00c0
        L_0x00be:
            r74 = r2
        L_0x00c0:
            r0 = 18
            r0 = r78[r0]
            r28 = r0
            android.widget.RadioButton r28 = (android.widget.RadioButton) r28
            r0 = 59
            r0 = r78[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 57
            r0 = r78[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 36
            r0 = r78[r0]
            r31 = r0
            android.widget.ImageView r31 = (android.widget.ImageView) r31
            r0 = 35
            r0 = r78[r0]
            r32 = r0
            android.widget.ImageView r32 = (android.widget.ImageView) r32
            r0 = 63
            r0 = r78[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 67
            r0 = r78[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 69
            r0 = r78[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 65
            r0 = r78[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 61
            r0 = r78[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 54
            r0 = r78[r0]
            r38 = r0
            android.widget.ImageView r38 = (android.widget.ImageView) r38
            r0 = 53
            r0 = r78[r0]
            r39 = r0
            android.widget.ImageView r39 = (android.widget.ImageView) r39
            r0 = 5
            r0 = r78[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 3
            r0 = r78[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 40
            r0 = r78[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 44
            r0 = r78[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 48
            r0 = r78[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 56
            r0 = r78[r0]
            r45 = r0
            android.widget.TextView r45 = (android.widget.TextView) r45
            r0 = 58
            r0 = r78[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 62
            r0 = r78[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 66
            r0 = r78[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 68
            r0 = r78[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 64
            r0 = r78[r0]
            r50 = r0
            android.widget.TextView r50 = (android.widget.TextView) r50
            r0 = 60
            r0 = r78[r0]
            r51 = r0
            android.widget.TextView r51 = (android.widget.TextView) r51
            r0 = 50
            r0 = r78[r0]
            r52 = r0
            android.widget.TextView r52 = (android.widget.TextView) r52
            r0 = 38
            r0 = r78[r0]
            r53 = r0
            android.widget.TextView r53 = (android.widget.TextView) r53
            r0 = 46
            r0 = r78[r0]
            r54 = r0
            android.widget.TextView r54 = (android.widget.TextView) r54
            r0 = 42
            r0 = r78[r0]
            r55 = r0
            android.widget.TextView r55 = (android.widget.TextView) r55
            r0 = 32
            r0 = r78[r0]
            r56 = r0
            android.widget.TextView r56 = (android.widget.TextView) r56
            r0 = 10
            r0 = r78[r0]
            r57 = r0
            android.widget.TextView r57 = (android.widget.TextView) r57
            r0 = 22
            r0 = r78[r0]
            r58 = r0
            android.widget.TextView r58 = (android.widget.TextView) r58
            r0 = 26
            r0 = r78[r0]
            r59 = r0
            android.widget.TextView r59 = (android.widget.TextView) r59
            r0 = 34
            r0 = r78[r0]
            r60 = r0
            android.widget.TextView r60 = (android.widget.TextView) r60
            r0 = 20
            r0 = r78[r0]
            r61 = r0
            android.widget.TextView r61 = (android.widget.TextView) r61
            r0 = 24
            r0 = r78[r0]
            r62 = r0
            android.widget.TextView r62 = (android.widget.TextView) r62
            r0 = 28
            r0 = r78[r0]
            r63 = r0
            android.widget.TextView r63 = (android.widget.TextView) r63
            r0 = 16
            r0 = r78[r0]
            r64 = r0
            android.widget.TextView r64 = (android.widget.TextView) r64
            r0 = 30
            r0 = r78[r0]
            r65 = r0
            android.widget.TextView r65 = (android.widget.TextView) r65
            r0 = 52
            r0 = r78[r0]
            r66 = r0
            android.widget.TextView r66 = (android.widget.TextView) r66
            r0 = 12
            r0 = r78[r0]
            r67 = r0
            android.widget.TextView r67 = (android.widget.TextView) r67
            r0 = 13
            r0 = r78[r0]
            r68 = r0
            android.widget.TextView r68 = (android.widget.TextView) r68
            r0 = 2
            r0 = r78[r0]
            r69 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r69 = (com.nic.mparivahan.dlservices.widget.MyTextView) r69
            r0 = 4
            r0 = r78[r0]
            r70 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r70 = (com.nic.mparivahan.dlservices.widget.MyTextView) r70
            r0 = 6
            r0 = r78[r0]
            r71 = r0
            android.widget.TextView r71 = (android.widget.TextView) r71
            r0 = 14
            r0 = r78[r0]
            r72 = r0
            android.widget.TextView r72 = (android.widget.TextView) r72
            r0 = 15
            r0 = r78[r0]
            r73 = r0
            android.widget.TextView r73 = (android.widget.TextView) r73
            r0 = r75
            r1 = r76
            r2 = r77
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
            r27 = r74
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            r0 = -1
            r2 = r75
            r2.P0 = r0
            r0 = 0
            r0 = r78[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.O0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r77
            r2.w(r0)
            r75.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.p1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
