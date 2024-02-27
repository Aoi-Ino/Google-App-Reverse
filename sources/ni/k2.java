package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class k2 extends j2 {

    /* renamed from: b0  reason: collision with root package name */
    private static final SparseIntArray f27071b0;
    private final LinearLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    private long f27072a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27071b0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.addedLearningDataRv, 2);
        sparseIntArray.put(R.id.applicantTrainedFromLl, 3);
        sparseIntArray.put(R.id.classOfVehicleForTrainingTv, 4);
        sparseIntArray.put(R.id.trainingVehicleSpinnerRl, 5);
        sparseIntArray.put(R.id.trainingVehicleSpinner, 6);
        sparseIntArray.put(R.id.secondHolderLl, 7);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolRl, 8);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolCb, 9);
        sparseIntArray.put(R.id.stateWiseDSchoolListTv, 10);
        sparseIntArray.put(R.id.drivingSchoolRl, 11);
        sparseIntArray.put(R.id.drivingSchoolSpinner, 12);
        sparseIntArray.put(R.id.enrollmentDetailsLl, 13);
        sparseIntArray.put(R.id.enrollmentNoTv, 14);
        sparseIntArray.put(R.id.enrollmentNoEt, 15);
        sparseIntArray.put(R.id.enrollmentDateTv, 16);
        sparseIntArray.put(R.id.enrollmentDateEt, 17);
        sparseIntArray.put(R.id.certificateNoTv, 18);
        sparseIntArray.put(R.id.certificateNoEt, 19);
        sparseIntArray.put(R.id.certificateDateTv, 20);
        sparseIntArray.put(R.id.certificateDateEt, 21);
        sparseIntArray.put(R.id.trainedFromTv, 22);
        sparseIntArray.put(R.id.trainedFromEt, 23);
        sparseIntArray.put(R.id.trainedToTv, 24);
        sparseIntArray.put(R.id.trainedToEt, 25);
        sparseIntArray.put(R.id.doubleBtnHolder, 26);
        sparseIntArray.put(R.id.saveBtn, 27);
        sparseIntArray.put(R.id.saveSingleBtn, 28);
        sparseIntArray.put(R.id.backBtn, 29);
    }

    public k2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 30, (h.i) null, f27071b0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f27072a0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f27072a0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f27072a0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private k2(androidx.databinding.e r35, android.view.View r36, java.lang.Object[] r37) {
        /*
            r34 = this;
            r15 = r34
            r3 = 0
            r0 = 2
            r0 = r37[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 3
            r0 = r37[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 29
            r0 = r37[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 21
            r0 = r37[r0]
            r7 = r0
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7
            r0 = 20
            r0 = r37[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 19
            r0 = r37[r0]
            r9 = r0
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r0 = 18
            r0 = r37[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 4
            r0 = r37[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 26
            r0 = r37[r0]
            r12 = r0
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r0 = 11
            r0 = r37[r0]
            r13 = r0
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r0 = 12
            r0 = r37[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 17
            r0 = r37[r0]
            r16 = r0
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r0 = 16
            r0 = r37[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 13
            r0 = r37[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 15
            r0 = r37[r0]
            r19 = r0
            androidx.appcompat.widget.AppCompatEditText r19 = (androidx.appcompat.widget.AppCompatEditText) r19
            r0 = 14
            r0 = r37[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 1
            r0 = r37[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0084
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r33 = r0
            goto L_0x0086
        L_0x0084:
            r33 = r2
        L_0x0086:
            r0 = 27
            r0 = r37[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 28
            r0 = r37[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 7
            r0 = r37[r0]
            r23 = r0
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            r0 = 10
            r0 = r37[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 9
            r0 = r37[r0]
            r25 = r0
            android.widget.CheckBox r25 = (android.widget.CheckBox) r25
            r0 = 8
            r0 = r37[r0]
            r26 = r0
            android.widget.RelativeLayout r26 = (android.widget.RelativeLayout) r26
            r0 = 23
            r0 = r37[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatEditText r27 = (androidx.appcompat.widget.AppCompatEditText) r27
            r0 = 22
            r0 = r37[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 25
            r0 = r37[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatEditText r29 = (androidx.appcompat.widget.AppCompatEditText) r29
            r0 = 24
            r0 = r37[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 6
            r0 = r37[r0]
            r31 = r0
            android.widget.EditText r31 = (android.widget.EditText) r31
            r0 = 5
            r0 = r37[r0]
            r32 = r0
            android.widget.RelativeLayout r32 = (android.widget.RelativeLayout) r32
            r0 = r34
            r1 = r35
            r2 = r36
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = -1
            r2 = r34
            r2.f27072a0 = r0
            r0 = 0
            r0 = r37[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.Z = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r36
            r2.w(r0)
            r34.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.k2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
