package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class y0 extends x0 {

    /* renamed from: z0  reason: collision with root package name */
    private static final SparseIntArray f29432z0;

    /* renamed from: x0  reason: collision with root package name */
    private final LinearLayout f29433x0;

    /* renamed from: y0  reason: collision with root package name */
    private long f29434y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29432z0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.tv_upload_pic_sign, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.tv_appln_detail, 7);
        sparseIntArray.put(R.id.app_arrow_up, 8);
        sparseIntArray.put(R.id.app_arrow_down, 9);
        sparseIntArray.put(R.id.ll_bottom_design, 10);
        sparseIntArray.put(R.id.tv_appln_no, 11);
        sparseIntArray.put(R.id.application_number, 12);
        sparseIntArray.put(R.id.tv_appln_date, 13);
        sparseIntArray.put(R.id.application_date, 14);
        sparseIntArray.put(R.id.tv_name, 15);
        sparseIntArray.put(R.id.applicatn_name, 16);
        sparseIntArray.put(R.id.relation_name, 17);
        sparseIntArray.put(R.id.fathers_name, 18);
        sparseIntArray.put(R.id.tv_dob, 19);
        sparseIntArray.put(R.id.date_of_birth, 20);
        sparseIntArray.put(R.id.tv_rto, 21);
        sparseIntArray.put(R.id.rto_name, 22);
        sparseIntArray.put(R.id.tv_instruction, 23);
        sparseIntArray.put(R.id.app_ins_arrow_up, 24);
        sparseIntArray.put(R.id.app_ins_arrow_down, 25);
        sparseIntArray.put(R.id.ll_instructions, 26);
        sparseIntArray.put(R.id.tv_note_capture_photo, 27);
        sparseIntArray.put(R.id.tv_note_uplod_sign, 28);
        sparseIntArray.put(R.id.tv_note_uplod_pic_sign, 29);
        sparseIntArray.put(R.id.tv_spec_photo_sign, 30);
        sparseIntArray.put(R.id.spec_arrow_up, 31);
        sparseIntArray.put(R.id.spec_arrow_down, 32);
        sparseIntArray.put(R.id.ll_specifications, 33);
        sparseIntArray.put(R.id.tv_note_photo_dimen, 34);
        sparseIntArray.put(R.id.tv_note_warning, 35);
        sparseIntArray.put(R.id.title_uplod_pic_sign, 36);
        sparseIntArray.put(R.id.app_photo_arrow_up, 37);
        sparseIntArray.put(R.id.app_photo_arrow_down, 38);
        sparseIntArray.put(R.id.ll_photo, 39);
        sparseIntArray.put(R.id.tv_applic_photo, 40);
        sparseIntArray.put(R.id.photo_capture_button, 41);
        sparseIntArray.put(R.id.tv_applic_capture, 42);
        sparseIntArray.put(R.id.photo_gallery_button, 43);
        sparseIntArray.put(R.id.tv_applic_gallary, 44);
        sparseIntArray.put(R.id.tv_applic_sign, 45);
        sparseIntArray.put(R.id.sign_capture_button, 46);
        sparseIntArray.put(R.id.tv_applic_sign_capt, 47);
        sparseIntArray.put(R.id.sign_gallery_button, 48);
        sparseIntArray.put(R.id.tv_applic_sign_gally, 49);
        sparseIntArray.put(R.id.upload_image, 50);
        sparseIntArray.put(R.id.signature_image, 51);
        sparseIntArray.put(R.id.upload_photos_and_sign, 52);
        sparseIntArray.put(R.id.skipped, 53);
    }

    public y0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 54, (h.i) null, f29432z0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f29434y0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f29434y0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f29434y0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private y0(androidx.databinding.e r59, android.view.View r60, java.lang.Object[] r61) {
        /*
            r58 = this;
            r15 = r58
            r3 = 0
            r0 = 9
            r0 = r61[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 8
            r0 = r61[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 25
            r0 = r61[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 24
            r0 = r61[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 38
            r0 = r61[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 37
            r0 = r61[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 14
            r0 = r61[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 12
            r0 = r61[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 16
            r0 = r61[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 20
            r0 = r61[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 6
            r0 = r61[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 18
            r0 = r61[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 2
            r0 = r61[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0066
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r17 = r0
            goto L_0x0068
        L_0x0066:
            r17 = r2
        L_0x0068:
            r0 = 10
            r0 = r61[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 26
            r0 = r61[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 39
            r0 = r61[r0]
            r20 = r0
            androidx.cardview.widget.CardView r20 = (androidx.cardview.widget.CardView) r20
            r0 = 33
            r0 = r61[r0]
            r21 = r0
            android.widget.LinearLayout r21 = (android.widget.LinearLayout) r21
            r0 = 3
            r0 = r61[r0]
            if (r0 == 0) goto L_0x0096
            android.view.View r0 = (android.view.View) r0
            ni.yb r0 = ni.yb.a(r0)
            r22 = r0
            goto L_0x0098
        L_0x0096:
            r22 = r2
        L_0x0098:
            r0 = 0
            r0 = r61[r0]
            r23 = r0
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            r0 = 41
            r0 = r61[r0]
            r24 = r0
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            r0 = 43
            r0 = r61[r0]
            r25 = r0
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r0 = 4
            r0 = r61[r0]
            if (r0 == 0) goto L_0x00bd
            android.view.View r0 = (android.view.View) r0
            ni.aa r0 = ni.aa.a(r0)
            r57 = r0
            goto L_0x00bf
        L_0x00bd:
            r57 = r2
        L_0x00bf:
            r0 = 17
            r0 = r61[r0]
            r26 = r0
            androidx.appcompat.widget.AppCompatTextView r26 = (androidx.appcompat.widget.AppCompatTextView) r26
            r0 = 22
            r0 = r61[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 46
            r0 = r61[r0]
            r28 = r0
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            r0 = 48
            r0 = r61[r0]
            r29 = r0
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            r0 = 51
            r0 = r61[r0]
            r30 = r0
            android.widget.ImageView r30 = (android.widget.ImageView) r30
            r0 = 53
            r0 = r61[r0]
            r31 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r31 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r31
            r0 = 32
            r0 = r61[r0]
            r32 = r0
            android.widget.ImageView r32 = (android.widget.ImageView) r32
            r0 = 31
            r0 = r61[r0]
            r33 = r0
            android.widget.ImageView r33 = (android.widget.ImageView) r33
            r0 = 36
            r0 = r61[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 42
            r0 = r61[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 44
            r0 = r61[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 40
            r0 = r61[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 45
            r0 = r61[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 47
            r0 = r61[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 49
            r0 = r61[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 13
            r0 = r61[r0]
            r41 = r0
            androidx.appcompat.widget.AppCompatTextView r41 = (androidx.appcompat.widget.AppCompatTextView) r41
            r0 = 7
            r0 = r61[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 11
            r0 = r61[r0]
            r43 = r0
            androidx.appcompat.widget.AppCompatTextView r43 = (androidx.appcompat.widget.AppCompatTextView) r43
            r0 = 19
            r0 = r61[r0]
            r44 = r0
            androidx.appcompat.widget.AppCompatTextView r44 = (androidx.appcompat.widget.AppCompatTextView) r44
            r0 = 23
            r0 = r61[r0]
            r45 = r0
            android.widget.TextView r45 = (android.widget.TextView) r45
            r0 = 15
            r0 = r61[r0]
            r46 = r0
            androidx.appcompat.widget.AppCompatTextView r46 = (androidx.appcompat.widget.AppCompatTextView) r46
            r0 = 27
            r0 = r61[r0]
            r47 = r0
            androidx.appcompat.widget.AppCompatTextView r47 = (androidx.appcompat.widget.AppCompatTextView) r47
            r0 = 34
            r0 = r61[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 29
            r0 = r61[r0]
            r49 = r0
            androidx.appcompat.widget.AppCompatTextView r49 = (androidx.appcompat.widget.AppCompatTextView) r49
            r0 = 28
            r0 = r61[r0]
            r50 = r0
            androidx.appcompat.widget.AppCompatTextView r50 = (androidx.appcompat.widget.AppCompatTextView) r50
            r0 = 35
            r0 = r61[r0]
            r51 = r0
            android.widget.TextView r51 = (android.widget.TextView) r51
            r0 = 21
            r0 = r61[r0]
            r52 = r0
            androidx.appcompat.widget.AppCompatTextView r52 = (androidx.appcompat.widget.AppCompatTextView) r52
            r0 = 30
            r0 = r61[r0]
            r53 = r0
            android.widget.TextView r53 = (android.widget.TextView) r53
            r0 = 5
            r0 = r61[r0]
            r54 = r0
            android.widget.TextView r54 = (android.widget.TextView) r54
            r0 = 50
            r0 = r61[r0]
            r55 = r0
            android.widget.ImageView r55 = (android.widget.ImageView) r55
            r0 = 52
            r0 = r61[r0]
            r56 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r56 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r56
            r0 = r58
            r1 = r59
            r2 = r60
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
            r25 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r0 = -1
            r2 = r58
            r2.f29434y0 = r0
            r0 = 1
            r0 = r61[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f29433x0 = r0
            r1 = 0
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r2.O
            r0.setTag(r1)
            r0 = r60
            r2.w(r0)
            r58.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.y0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
