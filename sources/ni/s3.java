package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class s3 extends r3 {
    private static final SparseIntArray E0;
    private final LinearLayout C0;
    private long D0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.tv_upload_pic_sign, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service_name, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.tv_appln_detail, 12);
        sparseIntArray.put(R.id.app_arrow_up, 13);
        sparseIntArray.put(R.id.app_arrow_down, 14);
        sparseIntArray.put(R.id.ll_bottom_design, 15);
        sparseIntArray.put(R.id.tv_appln_no, 16);
        sparseIntArray.put(R.id.application_number, 17);
        sparseIntArray.put(R.id.tv_appln_date, 18);
        sparseIntArray.put(R.id.application_date, 19);
        sparseIntArray.put(R.id.tv_name, 20);
        sparseIntArray.put(R.id.applicatn_name, 21);
        sparseIntArray.put(R.id.relation_name, 22);
        sparseIntArray.put(R.id.fathers_name, 23);
        sparseIntArray.put(R.id.tv_dob, 24);
        sparseIntArray.put(R.id.date_of_birth, 25);
        sparseIntArray.put(R.id.tv_rto, 26);
        sparseIntArray.put(R.id.rto_name, 27);
        sparseIntArray.put(R.id.tv_instruction, 28);
        sparseIntArray.put(R.id.app_ins_arrow_up, 29);
        sparseIntArray.put(R.id.app_ins_arrow_down, 30);
        sparseIntArray.put(R.id.ll_instructions, 31);
        sparseIntArray.put(R.id.tv_note_capture_photo, 32);
        sparseIntArray.put(R.id.tv_note_uplod_sign, 33);
        sparseIntArray.put(R.id.tv_note_uplod_pic_sign, 34);
        sparseIntArray.put(R.id.tv_spec_photo_sign, 35);
        sparseIntArray.put(R.id.spec_arrow_up, 36);
        sparseIntArray.put(R.id.spec_arrow_down, 37);
        sparseIntArray.put(R.id.ll_specifications, 38);
        sparseIntArray.put(R.id.tv_note_photo_dimen, 39);
        sparseIntArray.put(R.id.tv_note_warning, 40);
        sparseIntArray.put(R.id.title_uplod_pic_sign, 41);
        sparseIntArray.put(R.id.app_photo_arrow_up, 42);
        sparseIntArray.put(R.id.app_photo_arrow_down, 43);
        sparseIntArray.put(R.id.ll_photo, 44);
        sparseIntArray.put(R.id.tv_applic_photo, 45);
        sparseIntArray.put(R.id.photo_capture_button, 46);
        sparseIntArray.put(R.id.tv_applic_capture, 47);
        sparseIntArray.put(R.id.photo_gallery_button, 48);
        sparseIntArray.put(R.id.tv_applic_gallary, 49);
        sparseIntArray.put(R.id.tv_applic_sign, 50);
        sparseIntArray.put(R.id.sign_capture_button, 51);
        sparseIntArray.put(R.id.tv_applic_sign_capt, 52);
        sparseIntArray.put(R.id.sign_gallery_button, 53);
        sparseIntArray.put(R.id.tv_applic_sign_gally, 54);
        sparseIntArray.put(R.id.upload_image, 55);
        sparseIntArray.put(R.id.signature_image, 56);
        sparseIntArray.put(R.id.upload_photos_and_sign, 57);
        sparseIntArray.put(R.id.skipped, 58);
    }

    public s3(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 59, (h.i) null, E0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.D0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.D0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.D0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s3(androidx.databinding.e r64, android.view.View r65, java.lang.Object[] r66) {
        /*
            r63 = this;
            r15 = r63
            r3 = 0
            r0 = 14
            r0 = r66[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 13
            r0 = r66[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 30
            r0 = r66[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 29
            r0 = r66[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 43
            r0 = r66[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 42
            r0 = r66[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 19
            r0 = r66[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 17
            r0 = r66[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 21
            r0 = r66[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 25
            r0 = r66[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 6
            r0 = r66[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 23
            r0 = r66[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 3
            r0 = r66[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0066
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r17 = r0
            goto L_0x0068
        L_0x0066:
            r17 = r2
        L_0x0068:
            r0 = 9
            r0 = r66[r0]
            r18 = r0
            androidx.cardview.widget.CardView r18 = (androidx.cardview.widget.CardView) r18
            r0 = 11
            r0 = r66[r0]
            r19 = r0
            android.widget.ImageView r19 = (android.widget.ImageView) r19
            r0 = 15
            r0 = r66[r0]
            r20 = r0
            android.widget.LinearLayout r20 = (android.widget.LinearLayout) r20
            r0 = 31
            r0 = r66[r0]
            r21 = r0
            android.widget.LinearLayout r21 = (android.widget.LinearLayout) r21
            r0 = 44
            r0 = r66[r0]
            r22 = r0
            androidx.cardview.widget.CardView r22 = (androidx.cardview.widget.CardView) r22
            r0 = 38
            r0 = r66[r0]
            r23 = r0
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            r0 = 2
            r0 = r66[r0]
            if (r0 == 0) goto L_0x00a6
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r24 = r0
            goto L_0x00a8
        L_0x00a6:
            r24 = r2
        L_0x00a8:
            r0 = 0
            r0 = r66[r0]
            r25 = r0
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r0 = 46
            r0 = r66[r0]
            r26 = r0
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r0 = 48
            r0 = r66[r0]
            r27 = r0
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            r0 = 4
            r0 = r66[r0]
            if (r0 == 0) goto L_0x00cd
            android.view.View r0 = (android.view.View) r0
            ni.mc r0 = ni.mc.a(r0)
            r62 = r0
            goto L_0x00cf
        L_0x00cd:
            r62 = r2
        L_0x00cf:
            r0 = 22
            r0 = r66[r0]
            r28 = r0
            androidx.appcompat.widget.AppCompatTextView r28 = (androidx.appcompat.widget.AppCompatTextView) r28
            r0 = 10
            r0 = r66[r0]
            r29 = r0
            androidx.cardview.widget.CardView r29 = (androidx.cardview.widget.CardView) r29
            r0 = 27
            r0 = r66[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 8
            r0 = r66[r0]
            r31 = r0
            com.nic.mparivahan.dlservices.widget.MyTextView r31 = (com.nic.mparivahan.dlservices.widget.MyTextView) r31
            r0 = 51
            r0 = r66[r0]
            r32 = r0
            android.widget.LinearLayout r32 = (android.widget.LinearLayout) r32
            r0 = 53
            r0 = r66[r0]
            r33 = r0
            android.widget.LinearLayout r33 = (android.widget.LinearLayout) r33
            r0 = 56
            r0 = r66[r0]
            r34 = r0
            android.widget.ImageView r34 = (android.widget.ImageView) r34
            r0 = 58
            r0 = r66[r0]
            r35 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r35 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r35
            r0 = 37
            r0 = r66[r0]
            r36 = r0
            android.widget.ImageView r36 = (android.widget.ImageView) r36
            r0 = 36
            r0 = r66[r0]
            r37 = r0
            android.widget.ImageView r37 = (android.widget.ImageView) r37
            r0 = 41
            r0 = r66[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 47
            r0 = r66[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 49
            r0 = r66[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 45
            r0 = r66[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 50
            r0 = r66[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 52
            r0 = r66[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 54
            r0 = r66[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 18
            r0 = r66[r0]
            r45 = r0
            androidx.appcompat.widget.AppCompatTextView r45 = (androidx.appcompat.widget.AppCompatTextView) r45
            r0 = 12
            r0 = r66[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 16
            r0 = r66[r0]
            r47 = r0
            androidx.appcompat.widget.AppCompatTextView r47 = (androidx.appcompat.widget.AppCompatTextView) r47
            r0 = 24
            r0 = r66[r0]
            r48 = r0
            androidx.appcompat.widget.AppCompatTextView r48 = (androidx.appcompat.widget.AppCompatTextView) r48
            r0 = 28
            r0 = r66[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 20
            r0 = r66[r0]
            r50 = r0
            androidx.appcompat.widget.AppCompatTextView r50 = (androidx.appcompat.widget.AppCompatTextView) r50
            r0 = 32
            r0 = r66[r0]
            r51 = r0
            androidx.appcompat.widget.AppCompatTextView r51 = (androidx.appcompat.widget.AppCompatTextView) r51
            r0 = 39
            r0 = r66[r0]
            r52 = r0
            android.widget.TextView r52 = (android.widget.TextView) r52
            r0 = 34
            r0 = r66[r0]
            r53 = r0
            androidx.appcompat.widget.AppCompatTextView r53 = (androidx.appcompat.widget.AppCompatTextView) r53
            r0 = 33
            r0 = r66[r0]
            r54 = r0
            androidx.appcompat.widget.AppCompatTextView r54 = (androidx.appcompat.widget.AppCompatTextView) r54
            r0 = 40
            r0 = r66[r0]
            r55 = r0
            android.widget.TextView r55 = (android.widget.TextView) r55
            r0 = 26
            r0 = r66[r0]
            r56 = r0
            androidx.appcompat.widget.AppCompatTextView r56 = (androidx.appcompat.widget.AppCompatTextView) r56
            r0 = 35
            r0 = r66[r0]
            r57 = r0
            android.widget.TextView r57 = (android.widget.TextView) r57
            r0 = 5
            r0 = r66[r0]
            r58 = r0
            android.widget.TextView r58 = (android.widget.TextView) r58
            r0 = 7
            r0 = r66[r0]
            r59 = r0
            android.widget.TextView r59 = (android.widget.TextView) r59
            r0 = 55
            r0 = r66[r0]
            r60 = r0
            android.widget.ImageView r60 = (android.widget.ImageView) r60
            r0 = 57
            r0 = r66[r0]
            r61 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r61 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r61
            r0 = r63
            r1 = r64
            r2 = r65
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
            r27 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r0 = -1
            r2 = r63
            r2.D0 = r0
            r0 = 1
            r0 = r66[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.C0 = r0
            r1 = 0
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r2.Q
            r0.setTag(r1)
            r0 = r65
            r2.w(r0)
            r63.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.s3.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
