package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class m6 extends l6 {

    /* renamed from: f0  reason: collision with root package name */
    private static final SparseIntArray f27434f0;

    /* renamed from: d0  reason: collision with root package name */
    private final RelativeLayout f27435d0;

    /* renamed from: e0  reason: collision with root package name */
    private long f27436e0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27434f0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txtFirstAidDetails, 2);
        sparseIntArray.put(R.id.new_app_arrow_up_current, 3);
        sparseIntArray.put(R.id.new_app_arrow_down_current, 4);
        sparseIntArray.put(R.id.txtFaIssuingInstName, 5);
        sparseIntArray.put(R.id.etFaIssuingInstName, 6);
        sparseIntArray.put(R.id.txtCertificationNo, 7);
        sparseIntArray.put(R.id.etCertificationNo, 8);
        sparseIntArray.put(R.id.txtIssuedPlace, 9);
        sparseIntArray.put(R.id.etIssuedPlace, 10);
        sparseIntArray.put(R.id.txtIssueDate, 11);
        sparseIntArray.put(R.id.issueDate, 12);
        sparseIntArray.put(R.id.txtPermanent, 13);
        sparseIntArray.put(R.id.permanentRg, 14);
        sparseIntArray.put(R.id.maleRb, 15);
        sparseIntArray.put(R.id.femaleRb, 16);
        sparseIntArray.put(R.id.txtMedicalFitnessDetails, 17);
        sparseIntArray.put(R.id.m_new_app_arrow_up_current, 18);
        sparseIntArray.put(R.id.m_new_app_arrow_down_current, 19);
        sparseIntArray.put(R.id.txtFitnessCertNo, 20);
        sparseIntArray.put(R.id.etFitnessCertNo, 21);
        sparseIntArray.put(R.id.txtDoctorName, 22);
        sparseIntArray.put(R.id.etDoctorName, 23);
        sparseIntArray.put(R.id.txtDoctorRegNo, 24);
        sparseIntArray.put(R.id.etDoctorRegNo, 25);
        sparseIntArray.put(R.id.txtClinicName, 26);
        sparseIntArray.put(R.id.etClinicName, 27);
        sparseIntArray.put(R.id.txtMedicalIssueDate, 28);
        sparseIntArray.put(R.id.medicalIssueDate, 29);
        sparseIntArray.put(R.id.txtDeclaration, 30);
        sparseIntArray.put(R.id.willingToDonate, 31);
        sparseIntArray.put(R.id.declare, 32);
        sparseIntArray.put(R.id.btnSubmit, 33);
    }

    public m6(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 34, (h.i) null, f27434f0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f27436e0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f27436e0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f27436e0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m6(androidx.databinding.e r39, android.view.View r40, java.lang.Object[] r41) {
        /*
            r38 = this;
            r15 = r38
            r3 = 0
            r0 = 33
            r0 = r41[r0]
            r4 = r0
            androidx.appcompat.widget.AppCompatButton r4 = (androidx.appcompat.widget.AppCompatButton) r4
            r0 = 32
            r0 = r41[r0]
            r5 = r0
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r0 = 8
            r0 = r41[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 27
            r0 = r41[r0]
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 23
            r0 = r41[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 25
            r0 = r41[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 6
            r0 = r41[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 21
            r0 = r41[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 10
            r0 = r41[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 16
            r0 = r41[r0]
            r13 = r0
            android.widget.RadioButton r13 = (android.widget.RadioButton) r13
            r0 = 12
            r0 = r41[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 1
            r0 = r41[r0]
            r2 = 0
            if (r0 == 0) goto L_0x005e
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r37 = r0
            goto L_0x0060
        L_0x005e:
            r37 = r2
        L_0x0060:
            r0 = 19
            r0 = r41[r0]
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r0 = 18
            r0 = r41[r0]
            r17 = r0
            android.widget.ImageView r17 = (android.widget.ImageView) r17
            r0 = 15
            r0 = r41[r0]
            r18 = r0
            android.widget.RadioButton r18 = (android.widget.RadioButton) r18
            r0 = 29
            r0 = r41[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 4
            r0 = r41[r0]
            r20 = r0
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            r0 = 3
            r0 = r41[r0]
            r21 = r0
            android.widget.ImageView r21 = (android.widget.ImageView) r21
            r0 = 14
            r0 = r41[r0]
            r22 = r0
            android.widget.RadioGroup r22 = (android.widget.RadioGroup) r22
            r0 = 7
            r0 = r41[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 26
            r0 = r41[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 30
            r0 = r41[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 22
            r0 = r41[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 24
            r0 = r41[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 5
            r0 = r41[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 2
            r0 = r41[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 20
            r0 = r41[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 11
            r0 = r41[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 9
            r0 = r41[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 17
            r0 = r41[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 28
            r0 = r41[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 13
            r0 = r41[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 31
            r0 = r41[r0]
            r36 = r0
            android.widget.CheckBox r36 = (android.widget.CheckBox) r36
            r0 = r38
            r1 = r39
            r2 = r40
            r15 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0 = -1
            r2 = r38
            r2.f27436e0 = r0
            r0 = 0
            r0 = r41[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f27435d0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r40
            r2.w(r0)
            r38.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.m6.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
