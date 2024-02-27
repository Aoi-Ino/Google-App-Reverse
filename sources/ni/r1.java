package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class r1 extends q1 {

    /* renamed from: s0  reason: collision with root package name */
    private static final SparseIntArray f28321s0;

    /* renamed from: q0  reason: collision with root package name */
    private final RelativeLayout f28322q0;

    /* renamed from: r0  reason: collision with root package name */
    private long f28323r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28321s0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.selected_covs, 2);
        sparseIntArray.put(R.id.txt_app_category, 3);
        sparseIntArray.put(R.id.selectLearnerClassLl, 4);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 5);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 6);
        sparseIntArray.put(R.id.applicantTrainedFromLl, 7);
        sparseIntArray.put(R.id.classOfVehicleForTrainingTv, 8);
        sparseIntArray.put(R.id.trainingVehicleSpinnerRl, 9);
        sparseIntArray.put(R.id.trainingVehicleSpinner, 10);
        sparseIntArray.put(R.id.secondHolderLl, 11);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolRl, 12);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolCb, 13);
        sparseIntArray.put(R.id.drivingSchoolRl, 14);
        sparseIntArray.put(R.id.drivingSchoolSpinner, 15);
        sparseIntArray.put(R.id.enrollmentDetailsLl, 16);
        sparseIntArray.put(R.id.enrollmentNoEt, 17);
        sparseIntArray.put(R.id.enrollmentDateEt, 18);
        sparseIntArray.put(R.id.certificateNoEt, 19);
        sparseIntArray.put(R.id.certificateDateEt, 20);
        sparseIntArray.put(R.id.trainedFromEt, 21);
        sparseIntArray.put(R.id.trainedToEt, 22);
        sparseIntArray.put(R.id.addMoreBtn, 23);
        sparseIntArray.put(R.id.addedLearningDataRv, 24);
        sparseIntArray.put(R.id.form1Tv, 25);
        sparseIntArray.put(R.id.disqualificationLl, 26);
        sparseIntArray.put(R.id.dlNoTv, 27);
        sparseIntArray.put(R.id.dlNoEt, 28);
        sparseIntArray.put(R.id.issueDate, 29);
        sparseIntArray.put(R.id.issueDateEt, 30);
        sparseIntArray.put(R.id.txtStatus, 31);
        sparseIntArray.put(R.id.statusSpn, 32);
        sparseIntArray.put(R.id.fromDate, 33);
        sparseIntArray.put(R.id.fromDateValue, 34);
        sparseIntArray.put(R.id.toDate, 35);
        sparseIntArray.put(R.id.toDateValue, 36);
        sparseIntArray.put(R.id.issueAuthority, 37);
        sparseIntArray.put(R.id.issueAuthorityEt, 38);
        sparseIntArray.put(R.id.tv_note_organ_donate, 39);
        sparseIntArray.put(R.id.willToDonateRg, 40);
        sparseIntArray.put(R.id.willing_to_donate, 41);
        sparseIntArray.put(R.id.not_willing_to_donate, 42);
        sparseIntArray.put(R.id.org_mob_number, 43);
        sparseIntArray.put(R.id.selfDeclartionCb, 44);
        sparseIntArray.put(R.id.cancelTv, 45);
        sparseIntArray.put(R.id.nextTv, 46);
    }

    public r1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 47, (h.i) null, f28321s0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28323r0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28323r0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f28323r0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private r1(androidx.databinding.e r52, android.view.View r53, java.lang.Object[] r54) {
        /*
            r51 = this;
            r15 = r51
            r3 = 0
            r0 = 23
            r0 = r54[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 24
            r0 = r54[r0]
            r5 = r0
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r0 = 7
            r0 = r54[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 45
            r0 = r54[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 20
            r0 = r54[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatEditText r8 = (androidx.appcompat.widget.AppCompatEditText) r8
            r0 = 19
            r0 = r54[r0]
            r9 = r0
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r0 = 8
            r0 = r54[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 26
            r0 = r54[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 28
            r0 = r54[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 27
            r0 = r54[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 14
            r0 = r54[r0]
            r14 = r0
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            r0 = 15
            r0 = r54[r0]
            r16 = r0
            android.widget.Spinner r16 = (android.widget.Spinner) r16
            r0 = 18
            r0 = r54[r0]
            r17 = r0
            androidx.appcompat.widget.AppCompatEditText r17 = (androidx.appcompat.widget.AppCompatEditText) r17
            r0 = 16
            r0 = r54[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 17
            r0 = r54[r0]
            r19 = r0
            androidx.appcompat.widget.AppCompatEditText r19 = (androidx.appcompat.widget.AppCompatEditText) r19
            r0 = 25
            r0 = r54[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 33
            r0 = r54[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 34
            r0 = r54[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 37
            r0 = r54[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 38
            r0 = r54[r0]
            r24 = r0
            android.widget.EditText r24 = (android.widget.EditText) r24
            r0 = 29
            r0 = r54[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 30
            r0 = r54[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 1
            r0 = r54[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00b6
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r50 = r0
            goto L_0x00b8
        L_0x00b6:
            r50 = r2
        L_0x00b8:
            r0 = 46
            r0 = r54[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 42
            r0 = r54[r0]
            r28 = r0
            android.widget.RadioButton r28 = (android.widget.RadioButton) r28
            r0 = 43
            r0 = r54[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatEditText r29 = (androidx.appcompat.widget.AppCompatEditText) r29
            r0 = 11
            r0 = r54[r0]
            r30 = r0
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            r0 = 4
            r0 = r54[r0]
            r31 = r0
            android.widget.LinearLayout r31 = (android.widget.LinearLayout) r31
            r0 = 2
            r0 = r54[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 6
            r0 = r54[r0]
            r33 = r0
            android.widget.LinearLayout r33 = (android.widget.LinearLayout) r33
            r0 = 5
            r0 = r54[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 44
            r0 = r54[r0]
            r35 = r0
            android.widget.CheckBox r35 = (android.widget.CheckBox) r35
            r0 = 13
            r0 = r54[r0]
            r36 = r0
            android.widget.CheckBox r36 = (android.widget.CheckBox) r36
            r0 = 12
            r0 = r54[r0]
            r37 = r0
            android.widget.RelativeLayout r37 = (android.widget.RelativeLayout) r37
            r0 = 32
            r0 = r54[r0]
            r38 = r0
            android.widget.Spinner r38 = (android.widget.Spinner) r38
            r0 = 35
            r0 = r54[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 36
            r0 = r54[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 21
            r0 = r54[r0]
            r41 = r0
            androidx.appcompat.widget.AppCompatEditText r41 = (androidx.appcompat.widget.AppCompatEditText) r41
            r0 = 22
            r0 = r54[r0]
            r42 = r0
            androidx.appcompat.widget.AppCompatEditText r42 = (androidx.appcompat.widget.AppCompatEditText) r42
            r0 = 10
            r0 = r54[r0]
            r43 = r0
            android.widget.Spinner r43 = (android.widget.Spinner) r43
            r0 = 9
            r0 = r54[r0]
            r44 = r0
            android.widget.RelativeLayout r44 = (android.widget.RelativeLayout) r44
            r0 = 39
            r0 = r54[r0]
            r45 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r45 = (com.nic.mparivahan.dlservices.widget.MyTextView) r45
            r0 = 3
            r0 = r54[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 31
            r0 = r54[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 40
            r0 = r54[r0]
            r48 = r0
            android.widget.RadioGroup r48 = (android.widget.RadioGroup) r48
            r0 = 41
            r0 = r54[r0]
            r49 = r0
            android.widget.RadioButton r49 = (android.widget.RadioButton) r49
            r0 = r51
            r1 = r52
            r2 = r53
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
            r26 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r0 = -1
            r2 = r51
            r2.f28323r0 = r0
            r0 = 0
            r0 = r54[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f28322q0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r53
            r2.w(r0)
            r51.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.r1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
