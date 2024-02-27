package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class m4 extends l4 {

    /* renamed from: s0  reason: collision with root package name */
    private static final SparseIntArray f27402s0;

    /* renamed from: q0  reason: collision with root package name */
    private final RelativeLayout f27403q0;

    /* renamed from: r0  reason: collision with root package name */
    private long f27404r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27402s0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 2);
        sparseIntArray.put(R.id.topHolder, 3);
        sparseIntArray.put(R.id.txt_app_category, 4);
        sparseIntArray.put(R.id.infoIv, 5);
        sparseIntArray.put(R.id.first_name_ll, 6);
        sparseIntArray.put(R.id.mdl_name_ll, 7);
        sparseIntArray.put(R.id.last_name_ll, 8);
        sparseIntArray.put(R.id.txt_full_name, 9);
        sparseIntArray.put(R.id.txt_full_name_val, 10);
        sparseIntArray.put(R.id.txt_relation, 11);
        sparseIntArray.put(R.id.relationSpinner, 12);
        sparseIntArray.put(R.id.first_name_rel_ll, 13);
        sparseIntArray.put(R.id.mdl_name_rel_ll, 14);
        sparseIntArray.put(R.id.last_name_rel_ll, 15);
        sparseIntArray.put(R.id.txtGender, 16);
        sparseIntArray.put(R.id.radioGroupGender, 17);
        sparseIntArray.put(R.id.radioMale, 18);
        sparseIntArray.put(R.id.radioFemale, 19);
        sparseIntArray.put(R.id.radiotrans, 20);
        sparseIntArray.put(R.id.txt_dob, 21);
        sparseIntArray.put(R.id.txt_dob_val, 22);
        sparseIntArray.put(R.id.orTxt, 23);
        sparseIntArray.put(R.id.txtAge, 24);
        sparseIntArray.put(R.id.ageEt, 25);
        sparseIntArray.put(R.id.txt_pob, 26);
        sparseIntArray.put(R.id.txt_pob_val, 27);
        sparseIntArray.put(R.id.txt_birth_con, 28);
        sparseIntArray.put(R.id.spn_birth_con, 29);
        sparseIntArray.put(R.id.txt_qualication, 30);
        sparseIntArray.put(R.id.spn_qualification, 31);
        sparseIntArray.put(R.id.txt_blood_grp, 32);
        sparseIntArray.put(R.id.spn_blood_grp, 33);
        sparseIntArray.put(R.id.txt_landline_number, 34);
        sparseIntArray.put(R.id.txt_landline_number_val, 35);
        sparseIntArray.put(R.id.txt_email_id, 36);
        sparseIntArray.put(R.id.txt_email_id_val, 37);
        sparseIntArray.put(R.id.txt_alt_mob, 38);
        sparseIntArray.put(R.id.txt_alternative_number, 39);
        sparseIntArray.put(R.id.txt_emer_mob, 40);
        sparseIntArray.put(R.id.txt_emer_mob_number, 41);
        sparseIntArray.put(R.id.txt_marks, 42);
        sparseIntArray.put(R.id.txt_marks_val, 43);
        sparseIntArray.put(R.id.txt_marks_val_two, 44);
        sparseIntArray.put(R.id.reset, 45);
        sparseIntArray.put(R.id.id_next_service, 46);
    }

    public m4(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 47, (h.i) null, f27402s0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f27404r0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f27404r0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f27404r0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m4(androidx.databinding.e r52, android.view.View r53, java.lang.Object[] r54) {
        /*
            r51 = this;
            r12 = r51
            r3 = 0
            r0 = 25
            r0 = r54[r0]
            r4 = r0
            androidx.appcompat.widget.AppCompatEditText r4 = (androidx.appcompat.widget.AppCompatEditText) r4
            r0 = 2
            r0 = r54[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 6
            r0 = r54[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 13
            r0 = r54[r0]
            r7 = r0
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7
            r0 = 46
            r0 = r54[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 5
            r0 = r54[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 8
            r0 = r54[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 15
            r0 = r54[r0]
            r11 = r0
            androidx.appcompat.widget.AppCompatEditText r11 = (androidx.appcompat.widget.AppCompatEditText) r11
            r0 = 1
            r0 = r54[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0047
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r50 = r0
            goto L_0x0049
        L_0x0047:
            r50 = r2
        L_0x0049:
            r0 = 7
            r0 = r54[r0]
            r13 = r0
            androidx.appcompat.widget.AppCompatEditText r13 = (androidx.appcompat.widget.AppCompatEditText) r13
            r0 = 14
            r0 = r54[r0]
            r14 = r0
            androidx.appcompat.widget.AppCompatEditText r14 = (androidx.appcompat.widget.AppCompatEditText) r14
            r0 = 23
            r0 = r54[r0]
            r15 = r0
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0 = 19
            r0 = r54[r0]
            r16 = r0
            android.widget.RadioButton r16 = (android.widget.RadioButton) r16
            r0 = 17
            r0 = r54[r0]
            r17 = r0
            android.widget.RadioGroup r17 = (android.widget.RadioGroup) r17
            r0 = 18
            r0 = r54[r0]
            r18 = r0
            android.widget.RadioButton r18 = (android.widget.RadioButton) r18
            r0 = 20
            r0 = r54[r0]
            r19 = r0
            android.widget.RadioButton r19 = (android.widget.RadioButton) r19
            r0 = 12
            r0 = r54[r0]
            r20 = r0
            android.widget.Spinner r20 = (android.widget.Spinner) r20
            r0 = 45
            r0 = r54[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 29
            r0 = r54[r0]
            r22 = r0
            android.widget.Spinner r22 = (android.widget.Spinner) r22
            r0 = 33
            r0 = r54[r0]
            r23 = r0
            android.widget.Spinner r23 = (android.widget.Spinner) r23
            r0 = 31
            r0 = r54[r0]
            r24 = r0
            android.widget.Spinner r24 = (android.widget.Spinner) r24
            r0 = 3
            r0 = r54[r0]
            r25 = r0
            android.widget.RelativeLayout r25 = (android.widget.RelativeLayout) r25
            r0 = 24
            r0 = r54[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 38
            r0 = r54[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatTextView r27 = (androidx.appcompat.widget.AppCompatTextView) r27
            r0 = 39
            r0 = r54[r0]
            r28 = r0
            androidx.appcompat.widget.AppCompatEditText r28 = (androidx.appcompat.widget.AppCompatEditText) r28
            r0 = 4
            r0 = r54[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 28
            r0 = r54[r0]
            r30 = r0
            androidx.appcompat.widget.AppCompatTextView r30 = (androidx.appcompat.widget.AppCompatTextView) r30
            r0 = 32
            r0 = r54[r0]
            r31 = r0
            androidx.appcompat.widget.AppCompatTextView r31 = (androidx.appcompat.widget.AppCompatTextView) r31
            r0 = 21
            r0 = r54[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 22
            r0 = r54[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 36
            r0 = r54[r0]
            r34 = r0
            androidx.appcompat.widget.AppCompatTextView r34 = (androidx.appcompat.widget.AppCompatTextView) r34
            r0 = 37
            r0 = r54[r0]
            r35 = r0
            androidx.appcompat.widget.AppCompatEditText r35 = (androidx.appcompat.widget.AppCompatEditText) r35
            r0 = 40
            r0 = r54[r0]
            r36 = r0
            androidx.appcompat.widget.AppCompatTextView r36 = (androidx.appcompat.widget.AppCompatTextView) r36
            r0 = 41
            r0 = r54[r0]
            r37 = r0
            androidx.appcompat.widget.AppCompatEditText r37 = (androidx.appcompat.widget.AppCompatEditText) r37
            r0 = 9
            r0 = r54[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 10
            r0 = r54[r0]
            r39 = r0
            android.widget.EditText r39 = (android.widget.EditText) r39
            r0 = 16
            r0 = r54[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 34
            r0 = r54[r0]
            r41 = r0
            androidx.appcompat.widget.AppCompatTextView r41 = (androidx.appcompat.widget.AppCompatTextView) r41
            r0 = 35
            r0 = r54[r0]
            r42 = r0
            androidx.appcompat.widget.AppCompatEditText r42 = (androidx.appcompat.widget.AppCompatEditText) r42
            r0 = 42
            r0 = r54[r0]
            r43 = r0
            androidx.appcompat.widget.AppCompatTextView r43 = (androidx.appcompat.widget.AppCompatTextView) r43
            r0 = 43
            r0 = r54[r0]
            r44 = r0
            androidx.appcompat.widget.AppCompatEditText r44 = (androidx.appcompat.widget.AppCompatEditText) r44
            r0 = 44
            r0 = r54[r0]
            r45 = r0
            androidx.appcompat.widget.AppCompatEditText r45 = (androidx.appcompat.widget.AppCompatEditText) r45
            r0 = 26
            r0 = r54[r0]
            r46 = r0
            androidx.appcompat.widget.AppCompatTextView r46 = (androidx.appcompat.widget.AppCompatTextView) r46
            r0 = 27
            r0 = r54[r0]
            r47 = r0
            androidx.appcompat.widget.AppCompatEditText r47 = (androidx.appcompat.widget.AppCompatEditText) r47
            r0 = 30
            r0 = r54[r0]
            r48 = r0
            androidx.appcompat.widget.AppCompatTextView r48 = (androidx.appcompat.widget.AppCompatTextView) r48
            r0 = 11
            r0 = r54[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = r51
            r1 = r52
            r2 = r53
            r12 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r0 = -1
            r2 = r51
            r2.f27404r0 = r0
            r0 = 0
            r0 = r54[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f27403q0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r53
            r2.w(r0)
            r51.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.m4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
