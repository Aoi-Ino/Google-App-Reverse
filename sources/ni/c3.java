package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class c3 extends b3 {
    private static final SparseIntArray W;
    private final RelativeLayout T;
    private final LinearLayout U;
    private long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.mHeader, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.multi_steps, 12);
        sparseIntArray.put(R.id.tv_no_input_req, 13);
        sparseIntArray.put(R.id.txtAppCategory, 14);
        sparseIntArray.put(R.id.spn_app_cat, 15);
        sparseIntArray.put(R.id.tv_declation, 16);
        sparseIntArray.put(R.id.decelerate_cb, 17);
        sparseIntArray.put(R.id.donate_layout, 18);
        sparseIntArray.put(R.id.tv_note_organ_donate, 19);
        sparseIntArray.put(R.id.willing_to_donate, 20);
        sparseIntArray.put(R.id.no_willing_to_donate, 21);
        sparseIntArray.put(R.id.org_mob_number, 22);
        sparseIntArray.put(R.id.reset, 23);
        sparseIntArray.put(R.id.id_next_service, 24);
    }

    public c3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 25, (h.i) null, W));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.V = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.V = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c3(androidx.databinding.e r30, android.view.View r31, java.lang.Object[] r32) {
        /*
            r29 = this;
            r15 = r29
            r3 = 0
            r0 = 17
            r0 = r32[r0]
            r4 = r0
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r0 = 6
            r0 = r32[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 18
            r0 = r32[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 9
            r0 = r32[r0]
            r7 = r0
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            r0 = 24
            r0 = r32[r0]
            r8 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r8 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r8
            r0 = 11
            r0 = r32[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 4
            r0 = r32[r0]
            r14 = 0
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r10 = r0
            goto L_0x003b
        L_0x003a:
            r10 = r14
        L_0x003b:
            r0 = 1
            r0 = r32[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 3
            r0 = r32[r0]
            if (r0 == 0) goto L_0x004e
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r12 = r0
            goto L_0x004f
        L_0x004e:
            r12 = r14
        L_0x004f:
            r0 = 12
            r0 = r32[r0]
            r13 = r0
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r0 = 21
            r0 = r32[r0]
            r16 = r0
            android.widget.RadioButton r16 = (android.widget.RadioButton) r16
            r0 = 22
            r0 = r32[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatEditText r27 = (androidx.appcompat.widget.AppCompatEditText) r27
            r0 = 5
            r0 = r32[r0]
            if (r0 == 0) goto L_0x0074
            android.view.View r0 = (android.view.View) r0
            ni.nc r0 = ni.nc.a(r0)
            r28 = r0
            goto L_0x0076
        L_0x0074:
            r28 = r14
        L_0x0076:
            r0 = 23
            r0 = r32[r0]
            r17 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r17 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r17
            r0 = 10
            r0 = r32[r0]
            r18 = r0
            androidx.cardview.widget.CardView r18 = (androidx.cardview.widget.CardView) r18
            r0 = 8
            r0 = r32[r0]
            r19 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r19 = (com.nic.mparivahan.dlservices.widget.MyTextView) r19
            r0 = 15
            r0 = r32[r0]
            r20 = r0
            android.widget.Spinner r20 = (android.widget.Spinner) r20
            r0 = 16
            r0 = r32[r0]
            r21 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r21 = (com.nic.mparivahan.dlservices.widget.MyTextView) r21
            r0 = 13
            r0 = r32[r0]
            r22 = r0
            androidx.appcompat.widget.AppCompatTextView r22 = (androidx.appcompat.widget.AppCompatTextView) r22
            r0 = 19
            r0 = r32[r0]
            r23 = r0
            androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
            r0 = 14
            r0 = r32[r0]
            r24 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r24 = (com.nic.mparivahan.dlservices.widget.MyTextView) r24
            r0 = 7
            r0 = r32[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 20
            r0 = r32[r0]
            r26 = r0
            android.widget.RadioButton r26 = (android.widget.RadioButton) r26
            r0 = r29
            r1 = r30
            r2 = r31
            r14 = r16
            r15 = r27
            r16 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = -1
            r2 = r29
            r2.V = r0
            android.widget.LinearLayout r0 = r2.D
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r32[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.T = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r32[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.U = r0
            r0.setTag(r1)
            r0 = r31
            r2.w(r0)
            r29.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.c3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
