package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class sa extends ra {
    private static final SparseIntArray O;
    private final LinearLayout M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txt_app_category, 2);
        sparseIntArray.put(R.id.infoIv, 3);
        sparseIntArray.put(R.id.covListLl, 4);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 5);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 6);
        sparseIntArray.put(R.id.tv_note_organ_donate, 7);
        sparseIntArray.put(R.id.willToDonateRg, 8);
        sparseIntArray.put(R.id.willing_to_donate, 9);
        sparseIntArray.put(R.id.not_willing_to_donate, 10);
        sparseIntArray.put(R.id.org_mob_number, 11);
        sparseIntArray.put(R.id.termCndRl, 12);
        sparseIntArray.put(R.id.selfDeclartionCb, 13);
        sparseIntArray.put(R.id.selfDeclartionTv, 14);
        sparseIntArray.put(R.id.cancelTv, 15);
        sparseIntArray.put(R.id.nextTv, 16);
    }

    public sa(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 17, (h.i) null, O));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.N = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.N = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private sa(androidx.databinding.e r22, android.view.View r23, java.lang.Object[] r24) {
        /*
            r21 = this;
            r7 = r21
            r3 = 0
            r0 = 15
            r0 = r24[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 4
            r0 = r24[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 3
            r0 = r24[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 1
            r0 = r24[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0025
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r20 = r0
            goto L_0x0027
        L_0x0025:
            r20 = r2
        L_0x0027:
            r0 = 16
            r0 = r24[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 10
            r0 = r24[r0]
            r9 = r0
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r0 = 11
            r0 = r24[r0]
            r10 = r0
            androidx.appcompat.widget.AppCompatEditText r10 = (androidx.appcompat.widget.AppCompatEditText) r10
            r0 = 6
            r0 = r24[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 5
            r0 = r24[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 13
            r0 = r24[r0]
            r13 = r0
            android.widget.CheckBox r13 = (android.widget.CheckBox) r13
            r0 = 14
            r0 = r24[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 12
            r0 = r24[r0]
            r15 = r0
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            r0 = 7
            r0 = r24[r0]
            r16 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r16 = (com.nic.mparivahan.dlservices.widget.MyTextView) r16
            r0 = 2
            r0 = r24[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 8
            r0 = r24[r0]
            r18 = r0
            android.widget.RadioGroup r18 = (android.widget.RadioGroup) r18
            r0 = 9
            r0 = r24[r0]
            r19 = r0
            android.widget.RadioButton r19 = (android.widget.RadioButton) r19
            r0 = r21
            r1 = r22
            r2 = r23
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = -1
            r2 = r21
            r2.N = r0
            r0 = 0
            r0 = r24[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.M = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r23
            r2.w(r0)
            r21.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.sa.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
