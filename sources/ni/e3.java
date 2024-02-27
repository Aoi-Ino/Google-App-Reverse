package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class e3 extends d3 {
    private static final SparseIntArray V;
    private final LinearLayout S;
    private final LinearLayout T;
    private long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.txt_dl_service, 3);
        sparseIntArray.put(R.id.ll_layout, 4);
        sparseIntArray.put(R.id.btn_my_vehicle, 5);
        sparseIntArray.put(R.id.btn_othe_vehicle, 6);
        sparseIntArray.put(R.id.btn_my_vehicle_two, 7);
        sparseIntArray.put(R.id.vehicleServiceRecycler, 8);
        sparseIntArray.put(R.id.dl_virtual, 9);
        sparseIntArray.put(R.id.dl_dash_number, 10);
        sparseIntArray.put(R.id.dl_go, 11);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 12);
        sparseIntArray.put(R.id.tv_dl_no, 13);
        sparseIntArray.put(R.id.dl_number, 14);
        sparseIntArray.put(R.id.chassi_number, 15);
        sparseIntArray.put(R.id.dl_dob, 16);
        sparseIntArray.put(R.id.ll_note_layout, 17);
        sparseIntArray.put(R.id.tv_note, 18);
        sparseIntArray.put(R.id.noteText, 19);
        sparseIntArray.put(R.id.btn_cancel_button, 20);
        sparseIntArray.put(R.id.btn_cancel, 21);
        sparseIntArray.put(R.id.btn_reset, 22);
        sparseIntArray.put(R.id.btn_submit, 23);
    }

    public e3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 24, (h.i) null, V));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.U = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.U = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e3(androidx.databinding.e r28, android.view.View r29, java.lang.Object[] r30) {
        /*
            r27 = this;
            r15 = r27
            r3 = 0
            r0 = 21
            r0 = r30[r0]
            r4 = r0
            androidx.appcompat.widget.AppCompatButton r4 = (androidx.appcompat.widget.AppCompatButton) r4
            r0 = 20
            r0 = r30[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatButton r5 = (androidx.appcompat.widget.AppCompatButton) r5
            r0 = 5
            r0 = r30[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 7
            r0 = r30[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r30[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 22
            r0 = r30[r0]
            r9 = r0
            androidx.appcompat.widget.AppCompatButton r9 = (androidx.appcompat.widget.AppCompatButton) r9
            r0 = 23
            r0 = r30[r0]
            r10 = r0
            androidx.appcompat.widget.AppCompatButton r10 = (androidx.appcompat.widget.AppCompatButton) r10
            r0 = 15
            r0 = r30[r0]
            r11 = r0
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r0 = 10
            r0 = r30[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 16
            r0 = r30[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 11
            r0 = r30[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 14
            r0 = r30[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 9
            r0 = r30[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 4
            r0 = r30[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 17
            r0 = r30[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 2
            r0 = r30[r0]
            r2 = 0
            if (r0 == 0) goto L_0x007b
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r26 = r0
            goto L_0x007d
        L_0x007b:
            r26 = r2
        L_0x007d:
            r0 = 19
            r0 = r30[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 12
            r0 = r30[r0]
            r21 = r0
            android.widget.LinearLayout r21 = (android.widget.LinearLayout) r21
            r0 = 13
            r0 = r30[r0]
            r22 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r22 = (com.nic.mparivahan.dlservices.widget.MyTextView) r22
            r0 = 18
            r0 = r30[r0]
            r23 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r23 = (com.nic.mparivahan.dlservices.widget.MyTextView) r23
            r0 = 3
            r0 = r30[r0]
            r24 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r24 = (com.nic.mparivahan.dlservices.widget.MyTextView) r24
            r0 = 8
            r0 = r30[r0]
            r25 = r0
            androidx.recyclerview.widget.RecyclerView r25 = (androidx.recyclerview.widget.RecyclerView) r25
            r0 = r27
            r1 = r28
            r2 = r29
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = -1
            r2 = r27
            r2.U = r0
            r0 = 0
            r0 = r30[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.S = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r30[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.T = r0
            r0.setTag(r1)
            r0 = r29
            r2.w(r0)
            r27.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.e3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
