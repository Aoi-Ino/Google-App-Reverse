package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class z4 extends y4 {
    private static final SparseIntArray G;
    private final LinearLayout E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 2);
        sparseIntArray.put(R.id.tv_dl_no, 3);
        sparseIntArray.put(R.id.applNoEt, 4);
        sparseIntArray.put(R.id.dobTv, 5);
        sparseIntArray.put(R.id.dl_dob, 6);
        sparseIntArray.put(R.id.btnCancel, 7);
        sparseIntArray.put(R.id.btn_submit, 8);
    }

    public z4(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 9, (h.i) null, G));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.F = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.F = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private z4(androidx.databinding.e r15, android.view.View r16, java.lang.Object[] r17) {
        /*
            r14 = this;
            r12 = r14
            r3 = 0
            r0 = 4
            r0 = r17[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 7
            r0 = r17[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatButton r5 = (androidx.appcompat.widget.AppCompatButton) r5
            r0 = 8
            r0 = r17[r0]
            r6 = r0
            androidx.appcompat.widget.AppCompatButton r6 = (androidx.appcompat.widget.AppCompatButton) r6
            r0 = 6
            r0 = r17[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 5
            r0 = r17[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            r0 = 1
            r0 = r17[r0]
            r13 = 0
            if (r0 == 0) goto L_0x002f
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r9 = r0
            goto L_0x0030
        L_0x002f:
            r9 = r13
        L_0x0030:
            r0 = 2
            r0 = r17[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 3
            r0 = r17[r0]
            r11 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r11 = (com.nic.mparivahan.dlservices.widget.MyTextView) r11
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r12.F = r0
            r0 = 0
            r0 = r17[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r12.E = r0
            r0.setTag(r13)
            r0 = r16
            r14.w(r0)
            r14.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.z4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
