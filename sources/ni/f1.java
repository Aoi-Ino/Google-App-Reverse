package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class f1 extends e1 {
    private static final SparseIntArray R;
    private final LinearLayout O;
    private final LinearLayout P;
    private long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.dl_no_txt, 5);
        sparseIntArray.put(R.id.layoutCalender, 6);
        sparseIntArray.put(R.id.custom_view, 7);
        sparseIntArray.put(R.id.available_green_color, 8);
        sparseIntArray.put(R.id.available_green_label, 9);
        sparseIntArray.put(R.id.booked_red_color, 10);
        sparseIntArray.put(R.id.booked_red_label, 11);
        sparseIntArray.put(R.id.holiday_blue_color, 12);
        sparseIntArray.put(R.id.holiday_blue_label, 13);
        sparseIntArray.put(R.id.not_yet_gray_color, 14);
        sparseIntArray.put(R.id.not_yet_gray_label, 15);
        sparseIntArray.put(R.id.date_and_month_label, 16);
        sparseIntArray.put(R.id.day_of_month_tv, 17);
        sparseIntArray.put(R.id.view_line, 18);
        sparseIntArray.put(R.id.slots_list_rv, 19);
    }

    public f1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 20, (h.i) null, R));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.Q = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.Q = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private f1(androidx.databinding.e r25, android.view.View r26, java.lang.Object[] r27) {
        /*
            r24 = this;
            r15 = r24
            r3 = 0
            r0 = 8
            r0 = r27[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 9
            r0 = r27[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 10
            r0 = r27[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 11
            r0 = r27[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 7
            r0 = r27[r0]
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            r0 = 16
            r0 = r27[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 17
            r0 = r27[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 5
            r0 = r27[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2
            r0 = r27[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0047
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r12 = r0
            goto L_0x0048
        L_0x0047:
            r12 = r14
        L_0x0048:
            r0 = 12
            r0 = r27[r0]
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 13
            r0 = r27[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 6
            r0 = r27[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 3
            r0 = r27[r0]
            if (r0 == 0) goto L_0x006c
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r18 = r0
            goto L_0x006e
        L_0x006c:
            r18 = r14
        L_0x006e:
            r0 = 14
            r0 = r27[r0]
            r19 = r0
            android.widget.ImageView r19 = (android.widget.ImageView) r19
            r0 = 15
            r0 = r27[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 4
            r0 = r27[r0]
            if (r0 == 0) goto L_0x008c
            android.view.View r0 = (android.view.View) r0
            ni.ga r0 = ni.ga.a(r0)
            r23 = r0
            goto L_0x008e
        L_0x008c:
            r23 = r14
        L_0x008e:
            r0 = 19
            r0 = r27[r0]
            r20 = r0
            androidx.recyclerview.widget.RecyclerView r20 = (androidx.recyclerview.widget.RecyclerView) r20
            r0 = 18
            r0 = r27[r0]
            r21 = r0
            android.view.View r21 = (android.view.View) r21
            r0 = r24
            r1 = r25
            r2 = r26
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r22
            r19 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = -1
            r2 = r24
            r2.Q = r0
            r0 = 0
            r0 = r27[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.O = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r27[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.P = r0
            r0.setTag(r1)
            r0 = r26
            r2.w(r0)
            r24.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.f1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
