package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class q4 extends p4 {
    private static final SparseIntArray F;
    private final LinearLayout D;
    private long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.applNoTv, 2);
        sparseIntArray.put(R.id.applNoEt, 3);
        sparseIntArray.put(R.id.txt_dob, 4);
        sparseIntArray.put(R.id.txt_dob_val, 5);
        sparseIntArray.put(R.id.submitTv, 6);
        sparseIntArray.put(R.id.resetTv, 7);
    }

    public q4(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 8, (h.i) null, F));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.E = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.E = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private q4(androidx.databinding.e r13, android.view.View r14, java.lang.Object[] r15) {
        /*
            r12 = this;
            r3 = 0
            r0 = 3
            r0 = r15[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 2
            r0 = r15[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r15[r0]
            r11 = 0
            if (r0 == 0) goto L_0x001b
            android.view.View r0 = (android.view.View) r0
            ni.rc r0 = ni.rc.a(r0)
            r6 = r0
            goto L_0x001c
        L_0x001b:
            r6 = r11
        L_0x001c:
            r0 = 7
            r0 = r15[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r15[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 4
            r0 = r15[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 5
            r0 = r15[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = r12
            r1 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r12.E = r0
            r13 = 0
            r13 = r15[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.D = r13
            r13.setTag(r11)
            r12.w(r14)
            r12.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.q4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
