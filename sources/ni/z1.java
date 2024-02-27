package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class z1 extends y1 {
    private static final SparseIntArray I;
    private final LinearLayout G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txt_dl_service, 2);
        sparseIntArray.put(R.id.btn_my_vehicle_two, 3);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 4);
        sparseIntArray.put(R.id.tv_dl_no, 5);
        sparseIntArray.put(R.id.cl_number, 6);
        sparseIntArray.put(R.id.chassi_number, 7);
        sparseIntArray.put(R.id.dl_dob, 8);
        sparseIntArray.put(R.id.btn_reset, 9);
        sparseIntArray.put(R.id.btn_submit, 10);
    }

    public z1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 11, (h.i) null, I));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.H = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.H = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private z1(androidx.databinding.e r17, android.view.View r18, java.lang.Object[] r19) {
        /*
            r16 = this;
            r14 = r16
            r3 = 0
            r0 = 3
            r0 = r19[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 9
            r0 = r19[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatButton r5 = (androidx.appcompat.widget.AppCompatButton) r5
            r0 = 10
            r0 = r19[r0]
            r6 = r0
            androidx.appcompat.widget.AppCompatButton r6 = (androidx.appcompat.widget.AppCompatButton) r6
            r0 = 7
            r0 = r19[r0]
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            r0 = 6
            r0 = r19[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 8
            r0 = r19[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 1
            r0 = r19[r0]
            r15 = 0
            if (r0 == 0) goto L_0x0038
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r10 = r0
            goto L_0x0039
        L_0x0038:
            r10 = r15
        L_0x0039:
            r0 = 4
            r0 = r19[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 5
            r0 = r19[r0]
            r12 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r12 = (com.nic.mparivahan.dlservices.widget.MyTextView) r12
            r0 = 2
            r0 = r19[r0]
            r13 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r13 = (com.nic.mparivahan.dlservices.widget.MyTextView) r13
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.H = r0
            r0 = 0
            r0 = r19[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r14.G = r0
            r0.setTag(r15)
            r0 = r18
            r14.w(r0)
            r16.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.z1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
