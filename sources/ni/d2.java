package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class d2 extends c2 {
    private static final SparseIntArray T;
    private final LinearLayout R;
    private long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.stateTv, 2);
        sparseIntArray.put(R.id.stateEt, 3);
        sparseIntArray.put(R.id.rtoTv, 4);
        sparseIntArray.put(R.id.rtoEt, 5);
        sparseIntArray.put(R.id.txt_app_category, 6);
        sparseIntArray.put(R.id.infoIv, 7);
        sparseIntArray.put(R.id.selectLearnerClassLl, 8);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 9);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 10);
        sparseIntArray.put(R.id.applicantTrainedFromDSchoolRl, 11);
        sparseIntArray.put(R.id.applicantTrainedFromCb, 12);
        sparseIntArray.put(R.id.addDrivingSchoolTv, 13);
        sparseIntArray.put(R.id.tv_note_organ_donate, 14);
        sparseIntArray.put(R.id.willToDonateRg, 15);
        sparseIntArray.put(R.id.willing_to_donate, 16);
        sparseIntArray.put(R.id.not_willing_to_donate, 17);
        sparseIntArray.put(R.id.selfDeclartionCb, 18);
        sparseIntArray.put(R.id.selfFormTv, 19);
        sparseIntArray.put(R.id.cancelTv, 20);
        sparseIntArray.put(R.id.nextTv, 21);
    }

    public d2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 22, (h.i) null, T));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.S = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.S = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private d2(androidx.databinding.e r27, android.view.View r28, java.lang.Object[] r29) {
        /*
            r26 = this;
            r9 = r26
            r3 = 0
            r0 = 13
            r0 = r29[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 12
            r0 = r29[r0]
            r5 = r0
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r0 = 11
            r0 = r29[r0]
            r6 = r0
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r0 = 20
            r0 = r29[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 7
            r0 = r29[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 1
            r0 = r29[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0034
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r25 = r0
            goto L_0x0036
        L_0x0034:
            r25 = r2
        L_0x0036:
            r0 = 21
            r0 = r29[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 17
            r0 = r29[r0]
            r11 = r0
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            r0 = 5
            r0 = r29[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 4
            r0 = r29[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 8
            r0 = r29[r0]
            r14 = r0
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r0 = 10
            r0 = r29[r0]
            r15 = r0
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r0 = 9
            r0 = r29[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 18
            r0 = r29[r0]
            r17 = r0
            android.widget.CheckBox r17 = (android.widget.CheckBox) r17
            r0 = 19
            r0 = r29[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 3
            r0 = r29[r0]
            r19 = r0
            android.widget.EditText r19 = (android.widget.EditText) r19
            r0 = 2
            r0 = r29[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 14
            r0 = r29[r0]
            r21 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r21 = (com.nic.mparivahan.dlservices.widget.MyTextView) r21
            r0 = 6
            r0 = r29[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 15
            r0 = r29[r0]
            r23 = r0
            android.widget.RadioGroup r23 = (android.widget.RadioGroup) r23
            r0 = 16
            r0 = r29[r0]
            r24 = r0
            android.widget.RadioButton r24 = (android.widget.RadioButton) r24
            r0 = r26
            r1 = r27
            r2 = r28
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = -1
            r2 = r26
            r2.S = r0
            r0 = 0
            r0 = r29[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.R = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r28
            r2.w(r0)
            r26.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.d2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
