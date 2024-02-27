package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class i6 extends h6 {

    /* renamed from: v0  reason: collision with root package name */
    private static final SparseIntArray f26805v0;

    /* renamed from: t0  reason: collision with root package name */
    private final RelativeLayout f26806t0;

    /* renamed from: u0  reason: collision with root package name */
    private long f26807u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26805v0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.state_rto, 2);
        sparseIntArray.put(R.id.txt_req_submit, 3);
        sparseIntArray.put(R.id.current_state, 4);
        sparseIntArray.put(R.id.txt_req_submit_rto, 5);
        sparseIntArray.put(R.id.current_rto, 6);
        sparseIntArray.put(R.id.txtappdetails, 7);
        sparseIntArray.put(R.id.txtApplicantName, 8);
        sparseIntArray.put(R.id.etApplicantName, 9);
        sparseIntArray.put(R.id.txtApplicantmdlName, 10);
        sparseIntArray.put(R.id.etApplicantmdlName, 11);
        sparseIntArray.put(R.id.txtApplicantlastName, 12);
        sparseIntArray.put(R.id.etApplicantlastName, 13);
        sparseIntArray.put(R.id.txtRelation, 14);
        sparseIntArray.put(R.id.spnRelation, 15);
        sparseIntArray.put(R.id.txtrelfname, 16);
        sparseIntArray.put(R.id.txtrelfnameval, 17);
        sparseIntArray.put(R.id.txtrelmname, 18);
        sparseIntArray.put(R.id.txtrelmnameval, 19);
        sparseIntArray.put(R.id.txtrellname, 20);
        sparseIntArray.put(R.id.txtrellnameval, 21);
        sparseIntArray.put(R.id.txtGender, 22);
        sparseIntArray.put(R.id.genderRg, 23);
        sparseIntArray.put(R.id.maleRb, 24);
        sparseIntArray.put(R.id.femaleRb, 25);
        sparseIntArray.put(R.id.transgenderRb, 26);
        sparseIntArray.put(R.id.txtDob, 27);
        sparseIntArray.put(R.id.dl_dob, 28);
        sparseIntArray.put(R.id.txtBirthPlace, 29);
        sparseIntArray.put(R.id.etBirthPlace, 30);
        sparseIntArray.put(R.id.txtReligion, 31);
        sparseIntArray.put(R.id.spnReligion, 32);
        sparseIntArray.put(R.id.txtEducationQ, 33);
        sparseIntArray.put(R.id.spnEduQual, 34);
        sparseIntArray.put(R.id.txtBloodGroup, 35);
        sparseIntArray.put(R.id.spnBloodGroup, 36);
        sparseIntArray.put(R.id.txtPhoneNo, 37);
        sparseIntArray.put(R.id.etPhoneNo, 38);
        sparseIntArray.put(R.id.txtEmailId, 39);
        sparseIntArray.put(R.id.etEmailId, 40);
        sparseIntArray.put(R.id.txtMobileNo, 41);
        sparseIntArray.put(R.id.etMobileNo, 42);
        sparseIntArray.put(R.id.txtAltMobileNo, 43);
        sparseIntArray.put(R.id.etAltMobileNo, 44);
        sparseIntArray.put(R.id.txtIdentificationMark1, 45);
        sparseIntArray.put(R.id.etIdentificationMark1, 46);
        sparseIntArray.put(R.id.txtIdentificationMark2, 47);
        sparseIntArray.put(R.id.etIdentificationMark2, 48);
        sparseIntArray.put(R.id.btnNext, 49);
    }

    public i6(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 50, (h.i) null, f26805v0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f26807u0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f26807u0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f26807u0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i6(androidx.databinding.e r55, android.view.View r56, java.lang.Object[] r57) {
        /*
            r54 = this;
            r15 = r54
            r3 = 0
            r0 = 49
            r0 = r57[r0]
            r4 = r0
            androidx.appcompat.widget.AppCompatButton r4 = (androidx.appcompat.widget.AppCompatButton) r4
            r0 = 6
            r0 = r57[r0]
            r5 = r0
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0 = 4
            r0 = r57[r0]
            r6 = r0
            android.widget.Spinner r6 = (android.widget.Spinner) r6
            r0 = 28
            r0 = r57[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 44
            r0 = r57[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 9
            r0 = r57[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 13
            r0 = r57[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 11
            r0 = r57[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 30
            r0 = r57[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 40
            r0 = r57[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 46
            r0 = r57[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 48
            r0 = r57[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 42
            r0 = r57[r0]
            r17 = r0
            android.widget.EditText r17 = (android.widget.EditText) r17
            r0 = 38
            r0 = r57[r0]
            r18 = r0
            android.widget.EditText r18 = (android.widget.EditText) r18
            r0 = 25
            r0 = r57[r0]
            r19 = r0
            android.widget.RadioButton r19 = (android.widget.RadioButton) r19
            r0 = 23
            r0 = r57[r0]
            r20 = r0
            android.widget.RadioGroup r20 = (android.widget.RadioGroup) r20
            r0 = 1
            r0 = r57[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0085
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r53 = r0
            goto L_0x0087
        L_0x0085:
            r53 = r2
        L_0x0087:
            r0 = 24
            r0 = r57[r0]
            r21 = r0
            android.widget.RadioButton r21 = (android.widget.RadioButton) r21
            r0 = 36
            r0 = r57[r0]
            r22 = r0
            android.widget.Spinner r22 = (android.widget.Spinner) r22
            r0 = 34
            r0 = r57[r0]
            r23 = r0
            android.widget.Spinner r23 = (android.widget.Spinner) r23
            r0 = 15
            r0 = r57[r0]
            r24 = r0
            android.widget.Spinner r24 = (android.widget.Spinner) r24
            r0 = 32
            r0 = r57[r0]
            r25 = r0
            android.widget.Spinner r25 = (android.widget.Spinner) r25
            r0 = 2
            r0 = r57[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 26
            r0 = r57[r0]
            r27 = r0
            android.widget.RadioButton r27 = (android.widget.RadioButton) r27
            r0 = 43
            r0 = r57[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 8
            r0 = r57[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 12
            r0 = r57[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 10
            r0 = r57[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 29
            r0 = r57[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 35
            r0 = r57[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 27
            r0 = r57[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 33
            r0 = r57[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 39
            r0 = r57[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 22
            r0 = r57[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 45
            r0 = r57[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 47
            r0 = r57[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 41
            r0 = r57[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 37
            r0 = r57[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 14
            r0 = r57[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 31
            r0 = r57[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 3
            r0 = r57[r0]
            r44 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r44 = (com.nic.mparivahan.dlservices.widget.MyTextView) r44
            r0 = 5
            r0 = r57[r0]
            r45 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r45 = (com.nic.mparivahan.dlservices.widget.MyTextView) r45
            r0 = 7
            r0 = r57[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 16
            r0 = r57[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 17
            r0 = r57[r0]
            r48 = r0
            android.widget.EditText r48 = (android.widget.EditText) r48
            r0 = 20
            r0 = r57[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 21
            r0 = r57[r0]
            r50 = r0
            android.widget.EditText r50 = (android.widget.EditText) r50
            r0 = 18
            r0 = r57[r0]
            r51 = r0
            android.widget.TextView r51 = (android.widget.TextView) r51
            r0 = 19
            r0 = r57[r0]
            r52 = r0
            android.widget.EditText r52 = (android.widget.EditText) r52
            r0 = r54
            r1 = r55
            r2 = r56
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r0 = -1
            r2 = r54
            r2.f26807u0 = r0
            r0 = 0
            r0 = r57[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f26806t0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r56
            r2.w(r0)
            r54.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.i6.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
