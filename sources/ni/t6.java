package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class t6 extends s6 {

    /* renamed from: i0  reason: collision with root package name */
    private static final SparseIntArray f28679i0;

    /* renamed from: g0  reason: collision with root package name */
    private final LinearLayout f28680g0;

    /* renamed from: h0  reason: collision with root package name */
    private long f28681h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28679i0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.appCategory, 2);
        sparseIntArray.put(R.id.applicantCatFl, 3);
        sparseIntArray.put(R.id.spn_app_cat, 4);
        sparseIntArray.put(R.id.txt_app_category, 5);
        sparseIntArray.put(R.id.infoIv, 6);
        sparseIntArray.put(R.id.selectLearnerClassLl, 7);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 8);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 9);
        sparseIntArray.put(R.id.applicantTrainedFromDSchoolRl, 10);
        sparseIntArray.put(R.id.applicantTrainedFromCb, 11);
        sparseIntArray.put(R.id.addDrivingSchoolTv, 12);
        sparseIntArray.put(R.id.form1Tv, 13);
        sparseIntArray.put(R.id.disqualifiedLicenceCb, 14);
        sparseIntArray.put(R.id.disqualificationLl, 15);
        sparseIntArray.put(R.id.dlNoTv, 16);
        sparseIntArray.put(R.id.dlNoEt, 17);
        sparseIntArray.put(R.id.issueDate, 18);
        sparseIntArray.put(R.id.issueDateEt, 19);
        sparseIntArray.put(R.id.txtStatus, 20);
        sparseIntArray.put(R.id.statusSpn, 21);
        sparseIntArray.put(R.id.fromDate, 22);
        sparseIntArray.put(R.id.fromDateValue, 23);
        sparseIntArray.put(R.id.toDate, 24);
        sparseIntArray.put(R.id.toDateValue, 25);
        sparseIntArray.put(R.id.issueAuthority, 26);
        sparseIntArray.put(R.id.issueAuthorityEt, 27);
        sparseIntArray.put(R.id.tv_note_organ_donate, 28);
        sparseIntArray.put(R.id.willToDonateRg, 29);
        sparseIntArray.put(R.id.willing_to_donate, 30);
        sparseIntArray.put(R.id.not_willing_to_donate, 31);
        sparseIntArray.put(R.id.org_mob_number, 32);
        sparseIntArray.put(R.id.selfDeclartionCb, 33);
        sparseIntArray.put(R.id.selfFormTv, 34);
        sparseIntArray.put(R.id.cancelTv, 35);
        sparseIntArray.put(R.id.nextTv, 36);
    }

    public t6(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 37, (h.i) null, f28679i0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28681h0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28681h0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f28681h0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private t6(androidx.databinding.e r42, android.view.View r43, java.lang.Object[] r44) {
        /*
            r41 = this;
            r15 = r41
            r3 = 0
            r0 = 12
            r0 = r44[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r44[r0]
            r5 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r5 = (com.nic.mparivahan.dlservices.widget.MyTextView) r5
            r0 = 3
            r0 = r44[r0]
            r6 = r0
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 11
            r0 = r44[r0]
            r7 = r0
            android.widget.CheckBox r7 = (android.widget.CheckBox) r7
            r0 = 10
            r0 = r44[r0]
            r8 = r0
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r0 = 35
            r0 = r44[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 15
            r0 = r44[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 14
            r0 = r44[r0]
            r11 = r0
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11
            r0 = 17
            r0 = r44[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 16
            r0 = r44[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 13
            r0 = r44[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 22
            r0 = r44[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 23
            r0 = r44[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 6
            r0 = r44[r0]
            r18 = r0
            android.widget.ImageView r18 = (android.widget.ImageView) r18
            r0 = 26
            r0 = r44[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 27
            r0 = r44[r0]
            r20 = r0
            android.widget.EditText r20 = (android.widget.EditText) r20
            r0 = 18
            r0 = r44[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 19
            r0 = r44[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 1
            r0 = r44[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0094
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r40 = r0
            goto L_0x0096
        L_0x0094:
            r40 = r2
        L_0x0096:
            r0 = 36
            r0 = r44[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 31
            r0 = r44[r0]
            r24 = r0
            android.widget.RadioButton r24 = (android.widget.RadioButton) r24
            r0 = 32
            r0 = r44[r0]
            r25 = r0
            androidx.appcompat.widget.AppCompatEditText r25 = (androidx.appcompat.widget.AppCompatEditText) r25
            r0 = 7
            r0 = r44[r0]
            r26 = r0
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r0 = 9
            r0 = r44[r0]
            r27 = r0
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            r0 = 8
            r0 = r44[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 33
            r0 = r44[r0]
            r29 = r0
            android.widget.CheckBox r29 = (android.widget.CheckBox) r29
            r0 = 34
            r0 = r44[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 4
            r0 = r44[r0]
            r31 = r0
            android.widget.Spinner r31 = (android.widget.Spinner) r31
            r0 = 21
            r0 = r44[r0]
            r32 = r0
            android.widget.Spinner r32 = (android.widget.Spinner) r32
            r0 = 24
            r0 = r44[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 25
            r0 = r44[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 28
            r0 = r44[r0]
            r35 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r35 = (com.nic.mparivahan.dlservices.widget.MyTextView) r35
            r0 = 5
            r0 = r44[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 20
            r0 = r44[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 29
            r0 = r44[r0]
            r38 = r0
            android.widget.RadioGroup r38 = (android.widget.RadioGroup) r38
            r0 = 30
            r0 = r44[r0]
            r39 = r0
            android.widget.RadioButton r39 = (android.widget.RadioButton) r39
            r0 = r41
            r1 = r42
            r2 = r43
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0 = -1
            r2 = r41
            r2.f28681h0 = r0
            r0 = 0
            r0 = r44[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f28680g0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r43
            r2.w(r0)
            r41.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.t6.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
