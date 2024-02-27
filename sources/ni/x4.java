package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import d0.a;
import d0.c;

public class x4 extends w4 {
    private static final SparseIntArray S0;
    private final RelativeLayout P0;
    private final LinearLayout Q0;
    private long R0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 26);
        sparseIntArray.put(R.id.mHeader, 27);
        sparseIntArray.put(R.id.psl, 28);
        sparseIntArray.put(R.id.dl_no_txt, 29);
        sparseIntArray.put(R.id.txt_view_details, 30);
        sparseIntArray.put(R.id.select_service, 31);
        sparseIntArray.put(R.id.icon_image, 32);
        sparseIntArray.put(R.id.round_card_view, 33);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 34);
        sparseIntArray.put(R.id.multi_steps, 35);
        sparseIntArray.put(R.id.txtAppCategory, 36);
        sparseIntArray.put(R.id.spn_app_cat, 37);
        sparseIntArray.put(R.id.idpRto, 38);
        sparseIntArray.put(R.id.id_rto, 39);
        sparseIntArray.put(R.id.tv_birth_place, 40);
        sparseIntArray.put(R.id.tv_birth_country, 41);
        sparseIntArray.put(R.id.tv_passport_no, 42);
        sparseIntArray.put(R.id.tv_valid_upto, 43);
        sparseIntArray.put(R.id.tv_note_disqualified_dl, 44);
        sparseIntArray.put(R.id.iidp_yesNoType, 45);
        sparseIntArray.put(R.id.id_disqualify_et, 46);
        sparseIntArray.put(R.id.tv_note_barred_curr_country, 47);
        sparseIntArray.put(R.id.iidp_yesNoTypeSecond, 48);
        sparseIntArray.put(R.id.id_iidp_barred, 49);
        sparseIntArray.put(R.id.tv_count_visa, 50);
        sparseIntArray.put(R.id.id_iidp_restricteCountry, 51);
        sparseIntArray.put(R.id.tv_visa_no, 52);
        sparseIntArray.put(R.id.tv_visa_valid_upto, 53);
        sparseIntArray.put(R.id.tv_cov_grades_idp, 54);
        sparseIntArray.put(R.id.formIndianEmbassyLayout, 55);
        sparseIntArray.put(R.id.formIndianEmbassy, 56);
        sparseIntArray.put(R.id.tv_embassy_name, 57);
        sparseIntArray.put(R.id.tv_embassy_place, 58);
        sparseIntArray.put(R.id.tv_foren_nation_mob, 59);
        sparseIntArray.put(R.id.tv_email_id, 60);
        sparseIntArray.put(R.id.tv_date_verif_embassy, 61);
        sparseIntArray.put(R.id.tv_embassy_endor_no, 62);
        sparseIntArray.put(R.id.tv_idp_applied_from, 63);
        sparseIntArray.put(R.id.tv_note_enter_addr_foren, 64);
        sparseIntArray.put(R.id.tv_addr_one, 65);
        sparseIntArray.put(R.id.tv_addr_two, 66);
        sparseIntArray.put(R.id.tv_addr_three, 67);
        sparseIntArray.put(R.id.tv_pincode, 68);
        sparseIntArray.put(R.id.tv_click_desc_cov, 69);
        sparseIntArray.put(R.id.reset, 70);
        sparseIntArray.put(R.id.id_submit, 71);
    }

    public x4(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 72, (h.i) null, S0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        long j10;
        boolean z10;
        String str;
        synchronized (this) {
            j10 = this.R0;
            this.R0 = 0;
        }
        Boolean bool = this.O0;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i10 != 0) {
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            if (i10 != 0) {
                j10 |= booleanValue ? 168 : 84;
            }
            str = "";
            z10 = true;
        } else {
            str = null;
            z10 = false;
        }
        if ((j10 & 3) != 0) {
            c.c(this.C, str);
            c.c(this.E, str);
            c.c(this.F, str);
            c.c(this.H, str);
            c.c(this.I, str);
            c.c(this.J, str);
            c.c(this.K, str);
            c.c(this.L, str);
            c.c(this.M, str);
            c.c(this.N, str);
            c.c(this.O, str);
            c.c(this.P, str);
            c.c(this.Q, str);
            c.c(this.R, str);
            c.c(this.U, str);
            a.a(this.W, z10);
            a.a(this.X, z10);
            a.a(this.Y, false);
            a.a(this.f29148b0, false);
            c.c(this.f29153g0, str);
            c.c(this.f29154h0, str);
            c.c(this.M0, str);
            c.c(this.N0, str);
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.R0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x(Boolean bool) {
        this.O0 = bool;
        synchronized (this) {
            this.R0 |= 1;
        }
        b(1);
        super.u();
    }

    public void y() {
        synchronized (this) {
            this.R0 = 2;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private x4(androidx.databinding.e r76, android.view.View r77, java.lang.Object[] r78) {
        /*
            r75 = this;
            r15 = r75
            r3 = 0
            r0 = 29
            r0 = r78[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 56
            r0 = r78[r0]
            r5 = r0
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r0 = 55
            r0 = r78[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 1
            r0 = r78[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 32
            r0 = r78[r0]
            r8 = r0
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            r0 = 46
            r0 = r78[r0]
            r9 = r0
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r0 = 21
            r0 = r78[r0]
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 49
            r0 = r78[r0]
            r11 = r0
            androidx.appcompat.widget.AppCompatEditText r11 = (androidx.appcompat.widget.AppCompatEditText) r11
            r0 = 4
            r0 = r78[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 14
            r0 = r78[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 51
            r0 = r78[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 11
            r0 = r78[r0]
            r16 = r0
            android.widget.EditText r16 = (android.widget.EditText) r16
            r0 = 22
            r0 = r78[r0]
            r17 = r0
            android.widget.EditText r17 = (android.widget.EditText) r17
            r0 = 23
            r0 = r78[r0]
            r18 = r0
            android.widget.EditText r18 = (android.widget.EditText) r18
            r0 = 24
            r0 = r78[r0]
            r19 = r0
            android.widget.EditText r19 = (android.widget.EditText) r19
            r0 = 19
            r0 = r78[r0]
            r20 = r0
            android.widget.EditText r20 = (android.widget.EditText) r20
            r0 = 18
            r0 = r78[r0]
            r21 = r0
            android.widget.EditText r21 = (android.widget.EditText) r21
            r0 = 20
            r0 = r78[r0]
            r22 = r0
            android.widget.EditText r22 = (android.widget.EditText) r22
            r0 = 17
            r0 = r78[r0]
            r23 = r0
            android.widget.EditText r23 = (android.widget.EditText) r23
            r0 = 25
            r0 = r78[r0]
            r24 = r0
            android.widget.EditText r24 = (android.widget.EditText) r24
            r0 = 15
            r0 = r78[r0]
            r25 = r0
            android.widget.EditText r25 = (android.widget.EditText) r25
            r0 = 16
            r0 = r78[r0]
            r26 = r0
            android.widget.EditText r26 = (android.widget.EditText) r26
            r0 = 39
            r0 = r78[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 71
            r0 = r78[r0]
            r28 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r28 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r28
            r0 = 3
            r0 = r78[r0]
            r29 = r0
            android.widget.EditText r29 = (android.widget.EditText) r29
            r0 = 38
            r0 = r78[r0]
            r30 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r30 = (com.nic.mparivahan.dlservices.widget.MyTextView) r30
            r0 = 8
            r0 = r78[r0]
            r31 = r0
            android.widget.RadioButton r31 = (android.widget.RadioButton) r31
            r0 = 10
            r0 = r78[r0]
            r32 = r0
            android.widget.RadioButton r32 = (android.widget.RadioButton) r32
            r0 = 7
            r0 = r78[r0]
            r33 = r0
            android.widget.RadioButton r33 = (android.widget.RadioButton) r33
            r0 = 45
            r0 = r78[r0]
            r34 = r0
            android.widget.RadioGroup r34 = (android.widget.RadioGroup) r34
            r0 = 48
            r0 = r78[r0]
            r35 = r0
            android.widget.RadioGroup r35 = (android.widget.RadioGroup) r35
            r0 = 9
            r0 = r78[r0]
            r36 = r0
            android.widget.RadioButton r36 = (android.widget.RadioButton) r36
            r0 = 34
            r0 = r78[r0]
            r37 = r0
            android.widget.ImageView r37 = (android.widget.ImageView) r37
            r0 = 27
            r0 = r78[r0]
            r2 = 0
            if (r0 == 0) goto L_0x010c
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r38 = r0
            goto L_0x010e
        L_0x010c:
            r38 = r2
        L_0x010e:
            r0 = 26
            r0 = r78[r0]
            if (r0 == 0) goto L_0x011d
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r39 = r0
            goto L_0x011f
        L_0x011d:
            r39 = r2
        L_0x011f:
            r0 = 35
            r0 = r78[r0]
            r40 = r0
            androidx.recyclerview.widget.RecyclerView r40 = (androidx.recyclerview.widget.RecyclerView) r40
            r0 = 5
            r0 = r78[r0]
            r41 = r0
            android.widget.EditText r41 = (android.widget.EditText) r41
            r0 = 6
            r0 = r78[r0]
            r42 = r0
            android.widget.EditText r42 = (android.widget.EditText) r42
            r0 = 28
            r0 = r78[r0]
            if (r0 == 0) goto L_0x0144
            android.view.View r0 = (android.view.View) r0
            ni.fb r0 = ni.fb.a(r0)
            r74 = r0
            goto L_0x0146
        L_0x0144:
            r74 = r2
        L_0x0146:
            r0 = 70
            r0 = r78[r0]
            r43 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r43 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r43
            r0 = 33
            r0 = r78[r0]
            r44 = r0
            androidx.cardview.widget.CardView r44 = (androidx.cardview.widget.CardView) r44
            r0 = 31
            r0 = r78[r0]
            r45 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r45 = (com.nic.mparivahan.dlservices.widget.MyTextView) r45
            r0 = 37
            r0 = r78[r0]
            r46 = r0
            android.widget.Spinner r46 = (android.widget.Spinner) r46
            r0 = 65
            r0 = r78[r0]
            r47 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r47 = (com.nic.mparivahan.dlservices.widget.MyTextView) r47
            r0 = 67
            r0 = r78[r0]
            r48 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r48 = (com.nic.mparivahan.dlservices.widget.MyTextView) r48
            r0 = 66
            r0 = r78[r0]
            r49 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r49 = (com.nic.mparivahan.dlservices.widget.MyTextView) r49
            r0 = 41
            r0 = r78[r0]
            r50 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r50 = (com.nic.mparivahan.dlservices.widget.MyTextView) r50
            r0 = 40
            r0 = r78[r0]
            r51 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r51 = (com.nic.mparivahan.dlservices.widget.MyTextView) r51
            r0 = 69
            r0 = r78[r0]
            r52 = r0
            androidx.appcompat.widget.AppCompatTextView r52 = (androidx.appcompat.widget.AppCompatTextView) r52
            r0 = 50
            r0 = r78[r0]
            r53 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r53 = (com.nic.mparivahan.dlservices.widget.MyTextView) r53
            r0 = 54
            r0 = r78[r0]
            r54 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r54 = (com.nic.mparivahan.dlservices.widget.MyTextView) r54
            r0 = 61
            r0 = r78[r0]
            r55 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r55 = (com.nic.mparivahan.dlservices.widget.MyTextView) r55
            r0 = 60
            r0 = r78[r0]
            r56 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r56 = (com.nic.mparivahan.dlservices.widget.MyTextView) r56
            r0 = 62
            r0 = r78[r0]
            r57 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r57 = (com.nic.mparivahan.dlservices.widget.MyTextView) r57
            r0 = 57
            r0 = r78[r0]
            r58 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r58 = (com.nic.mparivahan.dlservices.widget.MyTextView) r58
            r0 = 58
            r0 = r78[r0]
            r59 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r59 = (com.nic.mparivahan.dlservices.widget.MyTextView) r59
            r0 = 59
            r0 = r78[r0]
            r60 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r60 = (com.nic.mparivahan.dlservices.widget.MyTextView) r60
            r0 = 63
            r0 = r78[r0]
            r61 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r61 = (com.nic.mparivahan.dlservices.widget.MyTextView) r61
            r0 = 47
            r0 = r78[r0]
            r62 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r62 = (com.nic.mparivahan.dlservices.widget.MyTextView) r62
            r0 = 44
            r0 = r78[r0]
            r63 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r63 = (com.nic.mparivahan.dlservices.widget.MyTextView) r63
            r0 = 64
            r0 = r78[r0]
            r64 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r64 = (com.nic.mparivahan.dlservices.widget.MyTextView) r64
            r0 = 42
            r0 = r78[r0]
            r65 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r65 = (com.nic.mparivahan.dlservices.widget.MyTextView) r65
            r0 = 68
            r0 = r78[r0]
            r66 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r66 = (com.nic.mparivahan.dlservices.widget.MyTextView) r66
            r0 = 43
            r0 = r78[r0]
            r67 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r67 = (com.nic.mparivahan.dlservices.widget.MyTextView) r67
            r0 = 52
            r0 = r78[r0]
            r68 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r68 = (com.nic.mparivahan.dlservices.widget.MyTextView) r68
            r0 = 53
            r0 = r78[r0]
            r69 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r69 = (com.nic.mparivahan.dlservices.widget.MyTextView) r69
            r0 = 36
            r0 = r78[r0]
            r70 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r70 = (com.nic.mparivahan.dlservices.widget.MyTextView) r70
            r0 = 30
            r0 = r78[r0]
            r71 = r0
            android.widget.TextView r71 = (android.widget.TextView) r71
            r0 = 12
            r0 = r78[r0]
            r72 = r0
            android.widget.EditText r72 = (android.widget.EditText) r72
            r0 = 13
            r0 = r78[r0]
            r73 = r0
            android.widget.EditText r73 = (android.widget.EditText) r73
            r0 = r75
            r1 = r76
            r2 = r77
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
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r74
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            r0 = -1
            r2 = r75
            r2.R0 = r0
            android.widget.LinearLayout r0 = r2.f29175z
            r1 = 0
            r0.setTag(r1)
            android.widget.EditText r0 = r2.C
            r0.setTag(r1)
            android.widget.EditText r0 = r2.E
            r0.setTag(r1)
            android.widget.EditText r0 = r2.F
            r0.setTag(r1)
            android.widget.EditText r0 = r2.H
            r0.setTag(r1)
            android.widget.EditText r0 = r2.I
            r0.setTag(r1)
            android.widget.EditText r0 = r2.J
            r0.setTag(r1)
            android.widget.EditText r0 = r2.K
            r0.setTag(r1)
            android.widget.EditText r0 = r2.L
            r0.setTag(r1)
            android.widget.EditText r0 = r2.M
            r0.setTag(r1)
            android.widget.EditText r0 = r2.N
            r0.setTag(r1)
            android.widget.EditText r0 = r2.O
            r0.setTag(r1)
            android.widget.EditText r0 = r2.P
            r0.setTag(r1)
            android.widget.EditText r0 = r2.Q
            r0.setTag(r1)
            android.widget.EditText r0 = r2.R
            r0.setTag(r1)
            android.widget.EditText r0 = r2.U
            r0.setTag(r1)
            android.widget.RadioButton r0 = r2.W
            r0.setTag(r1)
            android.widget.RadioButton r0 = r2.X
            r0.setTag(r1)
            android.widget.RadioButton r0 = r2.Y
            r0.setTag(r1)
            android.widget.RadioButton r0 = r2.f29148b0
            r0.setTag(r1)
            r0 = 0
            r0 = r78[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.P0 = r0
            r0.setTag(r1)
            r0 = 2
            r0 = r78[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.Q0 = r0
            r0.setTag(r1)
            android.widget.EditText r0 = r2.f29153g0
            r0.setTag(r1)
            android.widget.EditText r0 = r2.f29154h0
            r0.setTag(r1)
            android.widget.EditText r0 = r2.M0
            r0.setTag(r1)
            android.widget.EditText r0 = r2.N0
            r0.setTag(r1)
            r0 = r77
            r2.w(r0)
            r75.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.x4.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
