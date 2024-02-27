package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class j9 extends i9 {
    private static final SparseIntArray J;
    private final ScrollView G;
    private final LinearLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.holder, 2);
        sparseIntArray.put(R.id.paymentResponseIv, 3);
        sparseIntArray.put(R.id.transactionStatusTv, 4);
        sparseIntArray.put(R.id.challanNoTv, 5);
        sparseIntArray.put(R.id.challanNoValueTv, 6);
        sparseIntArray.put(R.id.amountTv, 7);
        sparseIntArray.put(R.id.amountValueTv, 8);
        sparseIntArray.put(R.id.vehicleNoTv, 9);
        sparseIntArray.put(R.id.vehcileNoValueTv, 10);
        sparseIntArray.put(R.id.buttonTv, 11);
    }

    public j9(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 12, (h.i) null, J));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.I = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.I = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private j9(androidx.databinding.e r17, android.view.View r18, java.lang.Object[] r19) {
        /*
            r16 = this;
            r14 = r16
            r3 = 0
            r0 = 7
            r0 = r19[r0]
            r4 = r0
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r0 = 8
            r0 = r19[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            r0 = 11
            r0 = r19[r0]
            r6 = r0
            com.nic.mparivahan.MyTextView r6 = (com.nic.mparivahan.MyTextView) r6
            r0 = 5
            r0 = r19[r0]
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            r0 = 6
            r0 = r19[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            r0 = 2
            r0 = r19[r0]
            r15 = 0
            if (r0 == 0) goto L_0x0031
            android.view.View r0 = (android.view.View) r0
            ni.qd r0 = ni.qd.a(r0)
            r9 = r0
            goto L_0x0032
        L_0x0031:
            r9 = r15
        L_0x0032:
            r0 = 3
            r0 = r19[r0]
            r10 = r0
            androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
            r0 = 4
            r0 = r19[r0]
            r11 = r0
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r0 = 10
            r0 = r19[r0]
            r12 = r0
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            r0 = 9
            r0 = r19[r0]
            r13 = r0
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.I = r0
            r0 = 0
            r0 = r19[r0]
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r14.G = r0
            r0.setTag(r15)
            r0 = 1
            r0 = r19[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r14.H = r0
            r0.setTag(r15)
            r0 = r18
            r14.w(r0)
            r16.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.j9.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
