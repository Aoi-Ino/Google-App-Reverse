package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class a3 extends z2 {
    private static final SparseIntArray V;
    private final LinearLayout S;
    private final LinearLayout T;
    private long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.dl_no_txt, 5);
        sparseIntArray.put(R.id.select_service, 6);
        sparseIntArray.put(R.id.icon_image, 7);
        sparseIntArray.put(R.id.round_card_view, 8);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 9);
        sparseIntArray.put(R.id.layoutCalender, 10);
        sparseIntArray.put(R.id.custom_view, 11);
        sparseIntArray.put(R.id.available_green_color, 12);
        sparseIntArray.put(R.id.available_green_label, 13);
        sparseIntArray.put(R.id.booked_red_color, 14);
        sparseIntArray.put(R.id.booked_red_label, 15);
        sparseIntArray.put(R.id.holiday_blue_color, 16);
        sparseIntArray.put(R.id.holiday_blue_label, 17);
        sparseIntArray.put(R.id.not_yet_gray_color, 18);
        sparseIntArray.put(R.id.not_yet_gray_label, 19);
        sparseIntArray.put(R.id.date_and_month_label, 20);
        sparseIntArray.put(R.id.day_of_month_tv, 21);
        sparseIntArray.put(R.id.view_line, 22);
        sparseIntArray.put(R.id.slots_list_rv, 23);
    }

    public a3(e eVar, View view) {
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
    private a3(androidx.databinding.e r29, android.view.View r30, java.lang.Object[] r31) {
        /*
            r28 = this;
            r15 = r28
            r3 = 0
            r0 = 12
            r0 = r31[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 13
            r0 = r31[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 14
            r0 = r31[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 15
            r0 = r31[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 11
            r0 = r31[r0]
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            r0 = 20
            r0 = r31[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 21
            r0 = r31[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 5
            r0 = r31[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 3
            r0 = r31[r0]
            r14 = 0
            if (r0 == 0) goto L_0x0048
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r12 = r0
            goto L_0x0049
        L_0x0048:
            r12 = r14
        L_0x0049:
            r0 = 16
            r0 = r31[r0]
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 17
            r0 = r31[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 7
            r0 = r31[r0]
            r17 = r0
            androidx.cardview.widget.CardView r17 = (androidx.cardview.widget.CardView) r17
            r0 = 9
            r0 = r31[r0]
            r18 = r0
            android.widget.ImageView r18 = (android.widget.ImageView) r18
            r0 = 10
            r0 = r31[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 2
            r0 = r31[r0]
            if (r0 == 0) goto L_0x007d
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r20 = r0
            goto L_0x007f
        L_0x007d:
            r20 = r14
        L_0x007f:
            r0 = 18
            r0 = r31[r0]
            r21 = r0
            android.widget.ImageView r21 = (android.widget.ImageView) r21
            r0 = 19
            r0 = r31[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 4
            r0 = r31[r0]
            if (r0 == 0) goto L_0x009d
            android.view.View r0 = (android.view.View) r0
            ni.ga r0 = ni.ga.a(r0)
            r27 = r0
            goto L_0x009f
        L_0x009d:
            r27 = r14
        L_0x009f:
            r0 = 8
            r0 = r31[r0]
            r22 = r0
            androidx.cardview.widget.CardView r22 = (androidx.cardview.widget.CardView) r22
            r0 = 6
            r0 = r31[r0]
            r23 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r23 = (com.nic.mparivahan.dlservices.widget.MyTextView) r23
            r0 = 23
            r0 = r31[r0]
            r24 = r0
            androidx.recyclerview.widget.RecyclerView r24 = (androidx.recyclerview.widget.RecyclerView) r24
            r0 = 22
            r0 = r31[r0]
            r25 = r0
            android.view.View r25 = (android.view.View) r25
            r0 = r28
            r1 = r29
            r2 = r30
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r26
            r21 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = -1
            r2 = r28
            r2.U = r0
            r0 = 0
            r0 = r31[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.S = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r31[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.T = r0
            r0.setTag(r1)
            r0 = r30
            r2.w(r0)
            r28.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.a3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}