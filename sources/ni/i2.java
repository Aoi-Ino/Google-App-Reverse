package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class i2 extends h2 {

    /* renamed from: b0  reason: collision with root package name */
    private static final SparseIntArray f26799b0;
    private final FrameLayout X;
    private final LinearLayout Y;
    private final nb Z;

    /* renamed from: a0  reason: collision with root package name */
    private long f26800a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26799b0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.tv_appln_detail, 7);
        sparseIntArray.put(R.id.app_arrow_up, 8);
        sparseIntArray.put(R.id.app_arrow_down, 9);
        sparseIntArray.put(R.id.ll_app_layout, 10);
        sparseIntArray.put(R.id.tv_appln_no, 11);
        sparseIntArray.put(R.id.application_number_textview, 12);
        sparseIntArray.put(R.id.tv_appln_date, 13);
        sparseIntArray.put(R.id.doc_appl_date, 14);
        sparseIntArray.put(R.id.tv_name, 15);
        sparseIntArray.put(R.id.doc_appl_name, 16);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 17);
        sparseIntArray.put(R.id.doc_appl_fname, 18);
        sparseIntArray.put(R.id.tv_dob, 19);
        sparseIntArray.put(R.id.doc_appl_dob, 20);
        sparseIntArray.put(R.id.view8, 21);
        sparseIntArray.put(R.id.textView, 22);
        sparseIntArray.put(R.id.view9, 23);
        sparseIntArray.put(R.id.textView2, 24);
        sparseIntArray.put(R.id.shimmer_view_container, 25);
        sparseIntArray.put(R.id.upload_list_rv, 26);
        sparseIntArray.put(R.id.button_layout_button, 27);
        sparseIntArray.put(R.id.upload_documents, 28);
        sparseIntArray.put(R.id.skipped_upload_doc, 29);
    }

    public i2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 30, (h.i) null, f26799b0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f26800a0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f26800a0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f26800a0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i2(androidx.databinding.e r34, android.view.View r35, java.lang.Object[] r36) {
        /*
            r33 = this;
            r15 = r33
            r3 = 0
            r0 = 9
            r0 = r36[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 8
            r0 = r36[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 12
            r0 = r36[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 27
            r0 = r36[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 6
            r0 = r36[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 14
            r0 = r36[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 20
            r0 = r36[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 18
            r0 = r36[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 16
            r0 = r36[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 3
            r0 = r36[r0]
            r14 = 0
            if (r0 == 0) goto L_0x004f
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r13 = r0
            goto L_0x0050
        L_0x004f:
            r13 = r14
        L_0x0050:
            r0 = 1
            r0 = r36[r0]
            r16 = r0
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r0 = 10
            r0 = r36[r0]
            r31 = r0
            android.widget.LinearLayout r31 = (android.widget.LinearLayout) r31
            r0 = 4
            r0 = r36[r0]
            if (r0 == 0) goto L_0x006d
            android.view.View r0 = (android.view.View) r0
            ni.z9 r0 = ni.z9.a(r0)
            r32 = r0
            goto L_0x006f
        L_0x006d:
            r32 = r14
        L_0x006f:
            r0 = 25
            r0 = r36[r0]
            r17 = r0
            com.facebook.shimmer.ShimmerFrameLayout r17 = (com.facebook.shimmer.ShimmerFrameLayout) r17
            r0 = 29
            r0 = r36[r0]
            r18 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r18 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r18
            r0 = 22
            r0 = r36[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 24
            r0 = r36[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 13
            r0 = r36[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 7
            r0 = r36[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 11
            r0 = r36[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 19
            r0 = r36[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 15
            r0 = r36[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 17
            r0 = r36[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 28
            r0 = r36[r0]
            r27 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r27 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r27
            r0 = 26
            r0 = r36[r0]
            r28 = r0
            androidx.recyclerview.widget.RecyclerView r28 = (androidx.recyclerview.widget.RecyclerView) r28
            r0 = 21
            r0 = r36[r0]
            r29 = r0
            android.view.View r29 = (android.view.View) r29
            r0 = 23
            r0 = r36[r0]
            r30 = r0
            android.view.View r30 = (android.view.View) r30
            r0 = r33
            r1 = r34
            r2 = r35
            r14 = r16
            r15 = r31
            r16 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = -1
            r2 = r33
            r2.f26800a0 = r0
            android.widget.LinearLayout r0 = r2.G
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r36[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.X = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r36[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.Y = r0
            r0.setTag(r1)
            r0 = 5
            r0 = r36[r0]
            if (r0 == 0) goto L_0x0119
            android.view.View r0 = (android.view.View) r0
            ni.nb r14 = ni.nb.a(r0)
            goto L_0x011a
        L_0x0119:
            r14 = r1
        L_0x011a:
            r2.Z = r14
            r0 = r35
            r2.w(r0)
            r33.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.i2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
