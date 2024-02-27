package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class k3 extends j3 {
    private static final SparseIntArray Q;
    private final LinearLayout N;
    private final LinearLayout O;
    private long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.psl, 3);
        sparseIntArray.put(R.id.dl_no_txt, 4);
        sparseIntArray.put(R.id.layoutCalender, 5);
        sparseIntArray.put(R.id.custom_view, 6);
        sparseIntArray.put(R.id.available_green_color, 7);
        sparseIntArray.put(R.id.available_green_label, 8);
        sparseIntArray.put(R.id.booked_red_color, 9);
        sparseIntArray.put(R.id.booked_red_label, 10);
        sparseIntArray.put(R.id.holiday_blue_color, 11);
        sparseIntArray.put(R.id.holiday_blue_label, 12);
        sparseIntArray.put(R.id.not_yet_gray_color, 13);
        sparseIntArray.put(R.id.not_yet_gray_label, 14);
        sparseIntArray.put(R.id.date_and_month_label, 15);
        sparseIntArray.put(R.id.day_of_month_tv, 16);
        sparseIntArray.put(R.id.view_line, 17);
        sparseIntArray.put(R.id.slots_list_rv, 18);
    }

    public k3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 19, (h.i) null, Q));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.P = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.P = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private k3(androidx.databinding.e r24, android.view.View r25, java.lang.Object[] r26) {
        /*
            r23 = this;
            r15 = r23
            r3 = 0
            r0 = 7
            r0 = r26[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 8
            r0 = r26[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 9
            r0 = r26[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 10
            r0 = r26[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r26[r0]
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            r0 = 15
            r0 = r26[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 16
            r0 = r26[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 4
            r0 = r26[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2
            r0 = r26[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0046
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r12 = r0
            goto L_0x0047
        L_0x0046:
            r12 = r14
        L_0x0047:
            r0 = 11
            r0 = r26[r0]
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 12
            r0 = r26[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 5
            r0 = r26[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 13
            r0 = r26[r0]
            r18 = r0
            android.widget.ImageView r18 = (android.widget.ImageView) r18
            r0 = 14
            r0 = r26[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 3
            r0 = r26[r0]
            if (r0 == 0) goto L_0x007b
            android.view.View r0 = (android.view.View) r0
            ni.ga r0 = ni.ga.a(r0)
            r22 = r0
            goto L_0x007d
        L_0x007b:
            r22 = r14
        L_0x007d:
            r0 = 18
            r0 = r26[r0]
            r19 = r0
            androidx.recyclerview.widget.RecyclerView r19 = (androidx.recyclerview.widget.RecyclerView) r19
            r0 = 17
            r0 = r26[r0]
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            r0 = r23
            r1 = r24
            r2 = r25
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r21
            r18 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = -1
            r2 = r23
            r2.P = r0
            r0 = 0
            r0 = r26[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.N = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r26[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.O = r0
            r0.setTag(r1)
            r0 = r25
            r2.w(r0)
            r23.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.k3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
