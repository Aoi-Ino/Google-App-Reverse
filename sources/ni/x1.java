package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class x1 extends w1 {

    /* renamed from: w0  reason: collision with root package name */
    private static final SparseIntArray f29284w0;

    /* renamed from: u0  reason: collision with root package name */
    private final RelativeLayout f29285u0;

    /* renamed from: v0  reason: collision with root package name */
    private long f29286v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29284w0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.topHolder, 2);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 3);
        sparseIntArray.put(R.id.infoIv, 4);
        sparseIntArray.put(R.id.ll_new_curr_existing, 5);
        sparseIntArray.put(R.id.tv_state, 6);
        sparseIntArray.put(R.id.dl_current_address_state_et, 7);
        sparseIntArray.put(R.id.tv_district, 8);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 9);
        sparseIntArray.put(R.id.tv_taluka_block, 10);
        sparseIntArray.put(R.id.dlCurrentSubDistrictEt, 11);
        sparseIntArray.put(R.id.village_town_rg, 12);
        sparseIntArray.put(R.id.village_rb, 13);
        sparseIntArray.put(R.id.town_rb, 14);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 15);
        sparseIntArray.put(R.id.tv_house_door_flat, 16);
        sparseIntArray.put(R.id.dl_select_house_number_et, 17);
        sparseIntArray.put(R.id.tv_street_locality, 18);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 19);
        sparseIntArray.put(R.id.tv_landmark, 20);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 21);
        sparseIntArray.put(R.id.tv_pincode, 22);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 23);
        sparseIntArray.put(R.id.durationTv, 24);
        sparseIntArray.put(R.id.yearEt, 25);
        sparseIntArray.put(R.id.monthsEt, 26);
        sparseIntArray.put(R.id.same_as_current_address_cb, 27);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 28);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 29);
        sparseIntArray.put(R.id.tv_state_new, 30);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 31);
        sparseIntArray.put(R.id.tv_district_new, 32);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 33);
        sparseIntArray.put(R.id.tv_taluka_block_new, 34);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 35);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 36);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 37);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 38);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 39);
        sparseIntArray.put(R.id.tv_house_door_new, 40);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 41);
        sparseIntArray.put(R.id.tv_street_locality_new, 42);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 43);
        sparseIntArray.put(R.id.tv_landmark_new, 44);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 45);
        sparseIntArray.put(R.id.tv_pincode_new, 46);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 47);
        sparseIntArray.put(R.id.pb_coa, 48);
        sparseIntArray.put(R.id.back, 49);
        sparseIntArray.put(R.id.submit_request, 50);
    }

    public x1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 51, (h.i) null, f29284w0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f29286v0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f29286v0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f29286v0 = 4;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private x1(androidx.databinding.e r56, android.view.View r57, java.lang.Object[] r58) {
        /*
            r55 = this;
            r15 = r55
            r3 = 0
            r0 = 49
            r0 = r58[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 9
            r0 = r58[r0]
            r5 = r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 7
            r0 = r58[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 11
            r0 = r58[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 41
            r0 = r58[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 45
            r0 = r58[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 47
            r0 = r58[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 43
            r0 = r58[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 35
            r0 = r58[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 33
            r0 = r58[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 31
            r0 = r58[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 39
            r0 = r58[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 38
            r0 = r58[r0]
            r17 = r0
            android.widget.RadioButton r17 = (android.widget.RadioButton) r17
            r0 = 37
            r0 = r58[r0]
            r18 = r0
            android.widget.RadioButton r18 = (android.widget.RadioButton) r18
            r0 = 36
            r0 = r58[r0]
            r19 = r0
            android.widget.RadioGroup r19 = (android.widget.RadioGroup) r19
            r0 = 17
            r0 = r58[r0]
            r20 = r0
            android.widget.EditText r20 = (android.widget.EditText) r20
            r0 = 15
            r0 = r58[r0]
            r21 = r0
            android.widget.EditText r21 = (android.widget.EditText) r21
            r0 = 21
            r0 = r58[r0]
            r22 = r0
            android.widget.EditText r22 = (android.widget.EditText) r22
            r0 = 23
            r0 = r58[r0]
            r23 = r0
            android.widget.EditText r23 = (android.widget.EditText) r23
            r0 = 19
            r0 = r58[r0]
            r24 = r0
            android.widget.EditText r24 = (android.widget.EditText) r24
            r0 = 24
            r0 = r58[r0]
            r25 = r0
            androidx.appcompat.widget.AppCompatTextView r25 = (androidx.appcompat.widget.AppCompatTextView) r25
            r0 = 29
            r0 = r58[r0]
            r26 = r0
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r0 = 4
            r0 = r58[r0]
            r27 = r0
            android.widget.ImageView r27 = (android.widget.ImageView) r27
            r0 = 5
            r0 = r58[r0]
            r28 = r0
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            r0 = 1
            r0 = r58[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00c4
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r54 = r0
            goto L_0x00c6
        L_0x00c4:
            r54 = r2
        L_0x00c6:
            r0 = 26
            r0 = r58[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatEditText r29 = (androidx.appcompat.widget.AppCompatEditText) r29
            r0 = 48
            r0 = r58[r0]
            r30 = r0
            android.widget.ProgressBar r30 = (android.widget.ProgressBar) r30
            r0 = 27
            r0 = r58[r0]
            r31 = r0
            android.widget.CheckBox r31 = (android.widget.CheckBox) r31
            r0 = 50
            r0 = r58[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 2
            r0 = r58[r0]
            r33 = r0
            android.widget.RelativeLayout r33 = (android.widget.RelativeLayout) r33
            r0 = 14
            r0 = r58[r0]
            r34 = r0
            android.widget.RadioButton r34 = (android.widget.RadioButton) r34
            r0 = 8
            r0 = r58[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 32
            r0 = r58[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 16
            r0 = r58[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 40
            r0 = r58[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 20
            r0 = r58[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 44
            r0 = r58[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 3
            r0 = r58[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 28
            r0 = r58[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 22
            r0 = r58[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 46
            r0 = r58[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 6
            r0 = r58[r0]
            r45 = r0
            android.widget.TextView r45 = (android.widget.TextView) r45
            r0 = 30
            r0 = r58[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 18
            r0 = r58[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 42
            r0 = r58[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 10
            r0 = r58[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 34
            r0 = r58[r0]
            r50 = r0
            android.widget.TextView r50 = (android.widget.TextView) r50
            r0 = 13
            r0 = r58[r0]
            r51 = r0
            android.widget.RadioButton r51 = (android.widget.RadioButton) r51
            r0 = 12
            r0 = r58[r0]
            r52 = r0
            android.widget.RadioGroup r52 = (android.widget.RadioGroup) r52
            r0 = 25
            r0 = r58[r0]
            r53 = r0
            androidx.appcompat.widget.AppCompatEditText r53 = (androidx.appcompat.widget.AppCompatEditText) r53
            r0 = r55
            r1 = r56
            r2 = r57
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
            r28 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r0 = -1
            r2 = r55
            r2.f29286v0 = r0
            r0 = 0
            r0 = r58[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f29285u0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r57
            r2.w(r0)
            r55.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.x1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
