package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class o3 extends n3 {

    /* renamed from: b0  reason: collision with root package name */
    private static final SparseIntArray f27756b0;

    /* renamed from: a0  reason: collision with root package name */
    private long f27757a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27756b0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 7);
        sparseIntArray.put(R.id.app_status_title, 8);
        sparseIntArray.put(R.id.dl_app_status_request_tv, 9);
        sparseIntArray.put(R.id.renewal_dl, 10);
        sparseIntArray.put(R.id.dl_status, 11);
        sparseIntArray.put(R.id.dl_status_tv, 12);
        sparseIntArray.put(R.id.dl_app_no, 13);
        sparseIntArray.put(R.id.dl_name, 14);
        sparseIntArray.put(R.id.dl_s_d_w, 15);
        sparseIntArray.put(R.id.dl_dob, 16);
        sparseIntArray.put(R.id.dl_rto_name, 17);
        sparseIntArray.put(R.id.view3, 18);
        sparseIntArray.put(R.id.dl_status_label, 19);
        sparseIntArray.put(R.id.refresh_status, 20);
        sparseIntArray.put(R.id.refresh_status_pb, 21);
        sparseIntArray.put(R.id.view4, 22);
        sparseIntArray.put(R.id.dl_stages_to_compeleted_label, 23);
        sparseIntArray.put(R.id.dl_stages_rv, 24);
        sparseIntArray.put(R.id.view5, 25);
        sparseIntArray.put(R.id.dl_note_label, 26);
        sparseIntArray.put(R.id.dl_note_tv, 27);
        sparseIntArray.put(R.id.done, 28);
    }

    public o3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 29, (h.i) null, f27756b0));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f27757a0     // Catch:{ all -> 0x006e }
            r2 = 0
            r7.f27757a0 = r2     // Catch:{ all -> 0x006e }
            monitor-exit(r7)     // Catch:{ all -> 0x006e }
            com.nic.mparivahan.dlservices.data.model.DlStatusDycptResponse r4 = r7.Z
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0048
            if (r4 == 0) goto L_0x0019
            com.nic.mparivahan.dlservices.data.model.DlApplStatusDto r2 = r4.getDlApplStatusDto()
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            if (r2 == 0) goto L_0x0021
            java.util.List r2 = r2.getApplStatusDetails()
            goto L_0x0022
        L_0x0021:
            r2 = r1
        L_0x0022:
            if (r2 == 0) goto L_0x002c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem r2 = (com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem) r2
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r2 == 0) goto L_0x0048
            java.lang.String r1 = r2.getApplno()
            java.lang.String r3 = r2.getDob()
            java.lang.String r4 = r2.getSwdName()
            java.lang.String r5 = r2.getRtoName()
            java.lang.String r6 = r2.getApplpendStatus()
            java.lang.String r2 = r2.getApplName()
            goto L_0x004d
        L_0x0048:
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L_0x004d:
            if (r0 == 0) goto L_0x006d
            android.widget.TextView r0 = r7.f27549y
            d0.c.c(r0, r1)
            android.widget.TextView r0 = r7.B
            d0.c.c(r0, r3)
            android.widget.TextView r0 = r7.D
            d0.c.c(r0, r2)
            android.widget.TextView r0 = r7.H
            d0.c.c(r0, r5)
            android.widget.TextView r0 = r7.J
            d0.c.c(r0, r4)
            android.widget.TextView r0 = r7.O
            d0.c.c(r0, r6)
        L_0x006d:
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.o3.i():void");
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f27757a0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f27757a0 = 2;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o3(androidx.databinding.e r35, android.view.View r36, java.lang.Object[] r37) {
        /*
            r34 = this;
            r15 = r34
            r3 = 0
            r0 = 8
            r0 = r37[r0]
            r4 = r0
            com.nic.mparivahan.MyTextView r4 = (com.nic.mparivahan.MyTextView) r4
            r0 = 13
            r0 = r37[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r37[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 9
            r0 = r37[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 16
            r0 = r37[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 4
            r0 = r37[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 14
            r0 = r37[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2
            r0 = r37[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 26
            r0 = r37[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 27
            r0 = r37[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 17
            r0 = r37[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 5
            r0 = r37[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 15
            r0 = r37[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 3
            r0 = r37[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 24
            r0 = r37[r0]
            r19 = r0
            androidx.recyclerview.widget.RecyclerView r19 = (androidx.recyclerview.widget.RecyclerView) r19
            r0 = 23
            r0 = r37[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 11
            r0 = r37[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 19
            r0 = r37[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 6
            r0 = r37[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 12
            r0 = r37[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 28
            r0 = r37[r0]
            r25 = r0
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r0 = 7
            r0 = r37[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00a9
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r33 = r0
            goto L_0x00ab
        L_0x00a9:
            r33 = r2
        L_0x00ab:
            r0 = 20
            r0 = r37[r0]
            r26 = r0
            android.widget.ImageView r26 = (android.widget.ImageView) r26
            r0 = 21
            r0 = r37[r0]
            r27 = r0
            android.widget.ProgressBar r27 = (android.widget.ProgressBar) r27
            r0 = 10
            r0 = r37[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 0
            r0 = r37[r0]
            r29 = r0
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            r0 = 18
            r0 = r37[r0]
            r30 = r0
            android.view.View r30 = (android.view.View) r30
            r0 = 22
            r0 = r37[r0]
            r31 = r0
            android.view.View r31 = (android.view.View) r31
            r0 = 25
            r0 = r37[r0]
            r32 = r0
            android.view.View r32 = (android.view.View) r32
            r0 = r34
            r1 = r35
            r2 = r36
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = -1
            r2 = r34
            r2.f27757a0 = r0
            android.widget.TextView r0 = r2.f27549y
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.B
            r0.setTag(r1)
            android.widget.TextView r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.H
            r0.setTag(r1)
            android.widget.TextView r0 = r2.J
            r0.setTag(r1)
            android.widget.TextView r0 = r2.O
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r2.V
            r0.setTag(r1)
            r0 = r36
            r2.w(r0)
            r34.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.o3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
