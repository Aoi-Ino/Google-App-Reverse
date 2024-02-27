package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class q3 extends p3 {

    /* renamed from: h0  reason: collision with root package name */
    private static final SparseIntArray f28134h0;

    /* renamed from: d0  reason: collision with root package name */
    private final FrameLayout f28135d0;

    /* renamed from: e0  reason: collision with root package name */
    private final LinearLayout f28136e0;

    /* renamed from: f0  reason: collision with root package name */
    private final nb f28137f0;

    /* renamed from: g0  reason: collision with root package name */
    private long f28138g0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28134h0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.headerLayout, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 7);
        sparseIntArray.put(R.id.txt_view_details, 8);
        sparseIntArray.put(R.id.select_service_name, 9);
        sparseIntArray.put(R.id.icon_image, 10);
        sparseIntArray.put(R.id.round_card_view, 11);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 12);
        sparseIntArray.put(R.id.tv_appln_detail, 13);
        sparseIntArray.put(R.id.app_arrow_up, 14);
        sparseIntArray.put(R.id.app_arrow_down, 15);
        sparseIntArray.put(R.id.ll_app_layout, 16);
        sparseIntArray.put(R.id.tv_appln_no, 17);
        sparseIntArray.put(R.id.application_number_textview, 18);
        sparseIntArray.put(R.id.tv_appln_date, 19);
        sparseIntArray.put(R.id.doc_appl_date, 20);
        sparseIntArray.put(R.id.tv_name, 21);
        sparseIntArray.put(R.id.doc_appl_name, 22);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 23);
        sparseIntArray.put(R.id.doc_appl_fname, 24);
        sparseIntArray.put(R.id.tv_dob, 25);
        sparseIntArray.put(R.id.doc_appl_dob, 26);
        sparseIntArray.put(R.id.view8, 27);
        sparseIntArray.put(R.id.textView, 28);
        sparseIntArray.put(R.id.view9, 29);
        sparseIntArray.put(R.id.textView2, 30);
        sparseIntArray.put(R.id.shimmer_view_container, 31);
        sparseIntArray.put(R.id.upload_list_rv, 32);
        sparseIntArray.put(R.id.button_layout_button, 33);
        sparseIntArray.put(R.id.upload_documents, 34);
        sparseIntArray.put(R.id.skipped_upload_doc, 35);
    }

    public q3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 36, (h.i) null, f28134h0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28138g0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28138g0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f28138g0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private q3(androidx.databinding.e r40, android.view.View r41, java.lang.Object[] r42) {
        /*
            r39 = this;
            r15 = r39
            r3 = 0
            r0 = 15
            r0 = r42[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 14
            r0 = r42[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 18
            r0 = r42[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 33
            r0 = r42[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 7
            r0 = r42[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 20
            r0 = r42[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 26
            r0 = r42[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 24
            r0 = r42[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 22
            r0 = r42[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 4
            r0 = r42[r0]
            r14 = 0
            if (r0 == 0) goto L_0x004f
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r13 = r0
            goto L_0x0050
        L_0x004f:
            r13 = r14
        L_0x0050:
            r0 = 10
            r0 = r42[r0]
            r16 = r0
            androidx.cardview.widget.CardView r16 = (androidx.cardview.widget.CardView) r16
            r0 = 12
            r0 = r42[r0]
            r17 = r0
            android.widget.ImageView r17 = (android.widget.ImageView) r17
            r0 = 1
            r0 = r42[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 16
            r0 = r42[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 3
            r0 = r42[r0]
            if (r0 == 0) goto L_0x007d
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r37 = r0
            goto L_0x007f
        L_0x007d:
            r37 = r14
        L_0x007f:
            r0 = 5
            r0 = r42[r0]
            if (r0 == 0) goto L_0x008d
            android.view.View r0 = (android.view.View) r0
            ni.fa r0 = ni.fa.a(r0)
            r38 = r0
            goto L_0x008f
        L_0x008d:
            r38 = r14
        L_0x008f:
            r0 = 11
            r0 = r42[r0]
            r20 = r0
            androidx.cardview.widget.CardView r20 = (androidx.cardview.widget.CardView) r20
            r0 = 9
            r0 = r42[r0]
            r21 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r21 = (com.nic.mparivahan.dlservices.widget.MyTextView) r21
            r0 = 31
            r0 = r42[r0]
            r22 = r0
            com.facebook.shimmer.ShimmerFrameLayout r22 = (com.facebook.shimmer.ShimmerFrameLayout) r22
            r0 = 35
            r0 = r42[r0]
            r23 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r23 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r23
            r0 = 28
            r0 = r42[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 30
            r0 = r42[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 19
            r0 = r42[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 13
            r0 = r42[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 17
            r0 = r42[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 25
            r0 = r42[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 21
            r0 = r42[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 23
            r0 = r42[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 8
            r0 = r42[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 34
            r0 = r42[r0]
            r33 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r33 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r33
            r0 = 32
            r0 = r42[r0]
            r34 = r0
            androidx.recyclerview.widget.RecyclerView r34 = (androidx.recyclerview.widget.RecyclerView) r34
            r0 = 27
            r0 = r42[r0]
            r35 = r0
            android.view.View r35 = (android.view.View) r35
            r0 = 29
            r0 = r42[r0]
            r36 = r0
            android.view.View r36 = (android.view.View) r36
            r0 = r39
            r1 = r40
            r2 = r41
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r37
            r19 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0 = -1
            r2 = r39
            r2.f28138g0 = r0
            android.widget.LinearLayout r0 = r2.I
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r42[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.f28135d0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r42[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f28136e0 = r0
            r0.setTag(r1)
            r0 = 6
            r0 = r42[r0]
            if (r0 == 0) goto L_0x0158
            android.view.View r0 = (android.view.View) r0
            ni.nb r14 = ni.nb.a(r0)
            goto L_0x0159
        L_0x0158:
            r14 = r1
        L_0x0159:
            r2.f28137f0 = r14
            r0 = r41
            r2.w(r0)
            r39.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.q3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
