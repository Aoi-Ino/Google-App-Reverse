package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class s2 extends r2 {

    /* renamed from: o0  reason: collision with root package name */
    private static final SparseIntArray f28500o0;

    /* renamed from: m0  reason: collision with root package name */
    private final RelativeLayout f28501m0;

    /* renamed from: n0  reason: collision with root package name */
    private long f28502n0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28500o0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txtappdetails, 2);
        sparseIntArray.put(R.id.txtApplicantName, 3);
        sparseIntArray.put(R.id.etApplicantName, 4);
        sparseIntArray.put(R.id.etApplicantmdlName, 5);
        sparseIntArray.put(R.id.etApplicantlastName, 6);
        sparseIntArray.put(R.id.txt_app_full_name, 7);
        sparseIntArray.put(R.id.txt_full_name_val, 8);
        sparseIntArray.put(R.id.txtRelation, 9);
        sparseIntArray.put(R.id.spnRelation, 10);
        sparseIntArray.put(R.id.relationDetails, 11);
        sparseIntArray.put(R.id.txtrelfnameval, 12);
        sparseIntArray.put(R.id.txtrelmnameval, 13);
        sparseIntArray.put(R.id.txtrellnameval, 14);
        sparseIntArray.put(R.id.txtGender, 15);
        sparseIntArray.put(R.id.genderRg, 16);
        sparseIntArray.put(R.id.maleRb, 17);
        sparseIntArray.put(R.id.femaleRb, 18);
        sparseIntArray.put(R.id.transgenderRb, 19);
        sparseIntArray.put(R.id.txtDob, 20);
        sparseIntArray.put(R.id.dl_dob, 21);
        sparseIntArray.put(R.id.txtBirthPlace, 22);
        sparseIntArray.put(R.id.etBirthPlace, 23);
        sparseIntArray.put(R.id.txtReligion, 24);
        sparseIntArray.put(R.id.etCountryName, 25);
        sparseIntArray.put(R.id.txtEducationQ, 26);
        sparseIntArray.put(R.id.etEducationQualification, 27);
        sparseIntArray.put(R.id.txtBloodGroup, 28);
        sparseIntArray.put(R.id.etBloodGroup, 29);
        sparseIntArray.put(R.id.txtPhoneNo, 30);
        sparseIntArray.put(R.id.etPhoneNo, 31);
        sparseIntArray.put(R.id.txtEmailId, 32);
        sparseIntArray.put(R.id.etEmailId, 33);
        sparseIntArray.put(R.id.txtMobileNo, 34);
        sparseIntArray.put(R.id.etMobileNo, 35);
        sparseIntArray.put(R.id.txtAltMobileNo, 36);
        sparseIntArray.put(R.id.etAltMobileNo, 37);
        sparseIntArray.put(R.id.txtIdentificationMark1, 38);
        sparseIntArray.put(R.id.etIdentificationMark1, 39);
        sparseIntArray.put(R.id.txtIdentificationMark2, 40);
        sparseIntArray.put(R.id.etIdentificationMark2, 41);
        sparseIntArray.put(R.id.btnNext, 42);
    }

    public s2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 43, (h.i) null, f28500o0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28502n0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28502n0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f28502n0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s2(androidx.databinding.e r48, android.view.View r49, java.lang.Object[] r50) {
        /*
            r47 = this;
            r15 = r47
            r3 = 0
            r0 = 42
            r0 = r50[r0]
            r4 = r0
            androidx.appcompat.widget.AppCompatButton r4 = (androidx.appcompat.widget.AppCompatButton) r4
            r0 = 21
            r0 = r50[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 37
            r0 = r50[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 4
            r0 = r50[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 6
            r0 = r50[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 5
            r0 = r50[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 23
            r0 = r50[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 29
            r0 = r50[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 25
            r0 = r50[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 27
            r0 = r50[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 33
            r0 = r50[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 39
            r0 = r50[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 41
            r0 = r50[r0]
            r17 = r0
            android.widget.EditText r17 = (android.widget.EditText) r17
            r0 = 35
            r0 = r50[r0]
            r18 = r0
            android.widget.EditText r18 = (android.widget.EditText) r18
            r0 = 31
            r0 = r50[r0]
            r19 = r0
            android.widget.EditText r19 = (android.widget.EditText) r19
            r0 = 18
            r0 = r50[r0]
            r20 = r0
            android.widget.RadioButton r20 = (android.widget.RadioButton) r20
            r0 = 16
            r0 = r50[r0]
            r21 = r0
            android.widget.RadioGroup r21 = (android.widget.RadioGroup) r21
            r0 = 1
            r0 = r50[r0]
            r2 = 0
            if (r0 == 0) goto L_0x008c
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r46 = r0
            goto L_0x008e
        L_0x008c:
            r46 = r2
        L_0x008e:
            r0 = 17
            r0 = r50[r0]
            r22 = r0
            android.widget.RadioButton r22 = (android.widget.RadioButton) r22
            r0 = 11
            r0 = r50[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 10
            r0 = r50[r0]
            r24 = r0
            android.widget.Spinner r24 = (android.widget.Spinner) r24
            r0 = 19
            r0 = r50[r0]
            r25 = r0
            android.widget.RadioButton r25 = (android.widget.RadioButton) r25
            r0 = 36
            r0 = r50[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 7
            r0 = r50[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 3
            r0 = r50[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 22
            r0 = r50[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 28
            r0 = r50[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 20
            r0 = r50[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 26
            r0 = r50[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 32
            r0 = r50[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 8
            r0 = r50[r0]
            r34 = r0
            android.widget.EditText r34 = (android.widget.EditText) r34
            r0 = 15
            r0 = r50[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 38
            r0 = r50[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 40
            r0 = r50[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 34
            r0 = r50[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 30
            r0 = r50[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 9
            r0 = r50[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 24
            r0 = r50[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 2
            r0 = r50[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 12
            r0 = r50[r0]
            r43 = r0
            android.widget.EditText r43 = (android.widget.EditText) r43
            r0 = 14
            r0 = r50[r0]
            r44 = r0
            android.widget.EditText r44 = (android.widget.EditText) r44
            r0 = 13
            r0 = r50[r0]
            r45 = r0
            android.widget.EditText r45 = (android.widget.EditText) r45
            r0 = r47
            r1 = r48
            r2 = r49
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r0 = -1
            r2 = r47
            r2.f28502n0 = r0
            r0 = 0
            r0 = r50[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f28501m0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r49
            r2.w(r0)
            r47.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.s2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
