package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import d0.c;

public class v1 extends u1 {

    /* renamed from: n0  reason: collision with root package name */
    private static final SparseIntArray f28949n0;

    /* renamed from: m0  reason: collision with root package name */
    private long f28950m0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28949n0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 13);
        sparseIntArray.put(R.id.dl_details_title, 14);
        sparseIntArray.put(R.id.dl_details_checked, 15);
        sparseIntArray.put(R.id.view, 16);
        sparseIntArray.put(R.id.dl_details_unchecked1, 17);
        sparseIntArray.put(R.id.view2, 18);
        sparseIntArray.put(R.id.dl_details_unchecked2, 19);
        sparseIntArray.put(R.id.dl_details_tv, 20);
        sparseIntArray.put(R.id.textView5, 21);
        sparseIntArray.put(R.id.acknowledgemnet_tv, 22);
        sparseIntArray.put(R.id.dl_holder_label, 23);
        sparseIntArray.put(R.id.dl_holder_tv, 24);
        sparseIntArray.put(R.id.dl_holder_s_d_w_tv, 25);
        sparseIntArray.put(R.id.dl_holder_dob_label, 26);
        sparseIntArray.put(R.id.dl_holder_dob_tv, 27);
        sparseIntArray.put(R.id.dl_present_add_label, 28);
        sparseIntArray.put(R.id.dl_present_add_tv, 29);
        sparseIntArray.put(R.id.dl_ack_applicant_gender_label, 30);
        sparseIntArray.put(R.id.dl_ack_nt_valid_tv, 31);
        sparseIntArray.put(R.id.view3, 32);
        sparseIntArray.put(R.id.dl_vehicle_class_label, 33);
        sparseIntArray.put(R.id.view4, 34);
        sparseIntArray.put(R.id.dl_rto_location_label, 35);
        sparseIntArray.put(R.id.view5, 36);
        sparseIntArray.put(R.id.dl_doc_proof_req_label, 37);
        sparseIntArray.put(R.id.view6, 38);
        sparseIntArray.put(R.id.dl_ack_note_label, 39);
        sparseIntArray.put(R.id.save_continue_to_next, 40);
    }

    public v1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 41, (h.i) null, f28949n0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        synchronized (this) {
            j10 = this.f28950m0;
            this.f28950m0 = 0;
        }
        ResultItemSubmit resultItemSubmit = this.f28810l0;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i10 == 0 || resultItemSubmit == null) {
            str12 = null;
            str11 = null;
            str10 = null;
            str9 = null;
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        } else {
            str12 = resultItemSubmit.getRtoLocation();
            str11 = resultItemSubmit.getDlno();
            str10 = resultItemSubmit.getApplicantGender();
            str8 = resultItemSubmit.getNTValidities();
            str7 = resultItemSubmit.getDateofBirth();
            str6 = resultItemSubmit.getApplicantAddress();
            str5 = resultItemSubmit.getApplicationNo();
            str4 = resultItemSubmit.getApplicationDate();
            str3 = resultItemSubmit.getNote1();
            str2 = resultItemSubmit.getDocumentaryProofsRequired();
            str = resultItemSubmit.getApplicantname();
            str9 = resultItemSubmit.getFatherName();
        }
        if (i10 != 0) {
            c.c(this.f28813y, str10);
            c.c(this.A, str3);
            c.c(this.C, str8);
            c.c(this.D, str5);
            c.c(this.E, str4);
            c.c(this.F, str6);
            c.c(this.M, str2);
            c.c(this.P, str11);
            c.c(this.Q, str);
            c.c(this.W, str9);
            c.c(this.X, str7);
            c.c(this.Z, str12);
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28950m0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f28950m0 = 2;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private v1(androidx.databinding.e r47, android.view.View r48, java.lang.Object[] r49) {
        /*
            r46 = this;
            r15 = r46
            r3 = 0
            r0 = 22
            r0 = r49[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 30
            r0 = r49[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 7
            r0 = r49[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 39
            r0 = r49[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 12
            r0 = r49[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 31
            r0 = r49[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 8
            r0 = r49[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 1
            r0 = r49[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2
            r0 = r49[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 9
            r0 = r49[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 15
            r0 = r49[r0]
            r14 = r0
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0 = 14
            r0 = r49[r0]
            r16 = r0
            com.nic.mparivahan.MyTextView r16 = (com.nic.mparivahan.MyTextView) r16
            r0 = 20
            r0 = r49[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 17
            r0 = r49[r0]
            r18 = r0
            android.widget.ImageView r18 = (android.widget.ImageView) r18
            r0 = 19
            r0 = r49[r0]
            r19 = r0
            android.widget.ImageView r19 = (android.widget.ImageView) r19
            r0 = 37
            r0 = r49[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 11
            r0 = r49[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 26
            r0 = r49[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 27
            r0 = r49[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 3
            r0 = r49[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 4
            r0 = r49[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 23
            r0 = r49[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 25
            r0 = r49[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 24
            r0 = r49[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 28
            r0 = r49[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 29
            r0 = r49[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 5
            r0 = r49[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 6
            r0 = r49[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 35
            r0 = r49[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 10
            r0 = r49[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 33
            r0 = r49[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 13
            r0 = r49[r0]
            r2 = 0
            if (r0 == 0) goto L_0x00f9
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r45 = r0
            goto L_0x00fb
        L_0x00f9:
            r45 = r2
        L_0x00fb:
            r0 = 40
            r0 = r49[r0]
            r36 = r0
            android.widget.LinearLayout r36 = (android.widget.LinearLayout) r36
            r0 = 0
            r0 = r49[r0]
            r37 = r0
            android.widget.LinearLayout r37 = (android.widget.LinearLayout) r37
            r0 = 21
            r0 = r49[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 16
            r0 = r49[r0]
            r39 = r0
            android.view.View r39 = (android.view.View) r39
            r0 = 18
            r0 = r49[r0]
            r40 = r0
            android.view.View r40 = (android.view.View) r40
            r0 = 32
            r0 = r49[r0]
            r41 = r0
            android.view.View r41 = (android.view.View) r41
            r0 = 34
            r0 = r49[r0]
            r42 = r0
            android.view.View r42 = (android.view.View) r42
            r0 = 36
            r0 = r49[r0]
            r43 = r0
            android.view.View r43 = (android.view.View) r43
            r0 = 38
            r0 = r49[r0]
            r44 = r0
            android.view.View r44 = (android.view.View) r44
            r0 = r46
            r1 = r47
            r2 = r48
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
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0 = -1
            r2 = r46
            r2.f28950m0 = r0
            android.widget.TextView r0 = r2.f28813y
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.A
            r0.setTag(r1)
            android.widget.TextView r0 = r2.C
            r0.setTag(r1)
            android.widget.TextView r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            android.widget.TextView r0 = r2.M
            r0.setTag(r1)
            android.widget.TextView r0 = r2.P
            r0.setTag(r1)
            android.widget.TextView r0 = r2.Q
            r0.setTag(r1)
            android.widget.TextView r0 = r2.W
            r0.setTag(r1)
            android.widget.TextView r0 = r2.X
            r0.setTag(r1)
            android.widget.TextView r0 = r2.Z
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r2.f28802d0
            r0.setTag(r1)
            r0 = r48
            r2.w(r0)
            r46.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.v1.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
