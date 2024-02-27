package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class u2 extends t2 {

    /* renamed from: y0  reason: collision with root package name */
    private static final SparseIntArray f28815y0;

    /* renamed from: w0  reason: collision with root package name */
    private final LinearLayout f28816w0;

    /* renamed from: x0  reason: collision with root package name */
    private long f28817x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28815y0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.psl, 3);
        sparseIntArray.put(R.id.tv_upload_pic_sign, 4);
        sparseIntArray.put(R.id.dl_no_txt, 5);
        sparseIntArray.put(R.id.tv_appln_detail, 6);
        sparseIntArray.put(R.id.app_arrow_up, 7);
        sparseIntArray.put(R.id.app_arrow_down, 8);
        sparseIntArray.put(R.id.ll_bottom_design, 9);
        sparseIntArray.put(R.id.tv_appln_no, 10);
        sparseIntArray.put(R.id.application_number, 11);
        sparseIntArray.put(R.id.tv_appln_date, 12);
        sparseIntArray.put(R.id.application_date, 13);
        sparseIntArray.put(R.id.tv_name, 14);
        sparseIntArray.put(R.id.applicatn_name, 15);
        sparseIntArray.put(R.id.relation_name, 16);
        sparseIntArray.put(R.id.fathers_name, 17);
        sparseIntArray.put(R.id.tv_dob, 18);
        sparseIntArray.put(R.id.date_of_birth, 19);
        sparseIntArray.put(R.id.tv_rto, 20);
        sparseIntArray.put(R.id.rto_name, 21);
        sparseIntArray.put(R.id.tv_instruction, 22);
        sparseIntArray.put(R.id.app_ins_arrow_up, 23);
        sparseIntArray.put(R.id.app_ins_arrow_down, 24);
        sparseIntArray.put(R.id.ll_instructions, 25);
        sparseIntArray.put(R.id.tv_note_capture_photo, 26);
        sparseIntArray.put(R.id.tv_note_uplod_sign, 27);
        sparseIntArray.put(R.id.tv_note_uplod_pic_sign, 28);
        sparseIntArray.put(R.id.tv_spec_photo_sign, 29);
        sparseIntArray.put(R.id.spec_arrow_up, 30);
        sparseIntArray.put(R.id.spec_arrow_down, 31);
        sparseIntArray.put(R.id.ll_specifications, 32);
        sparseIntArray.put(R.id.tv_note_photo_dimen, 33);
        sparseIntArray.put(R.id.tv_note_warning, 34);
        sparseIntArray.put(R.id.title_uplod_pic_sign, 35);
        sparseIntArray.put(R.id.app_photo_arrow_up, 36);
        sparseIntArray.put(R.id.app_photo_arrow_down, 37);
        sparseIntArray.put(R.id.ll_photo, 38);
        sparseIntArray.put(R.id.tv_applic_photo, 39);
        sparseIntArray.put(R.id.photo_capture_button, 40);
        sparseIntArray.put(R.id.tv_applic_capture, 41);
        sparseIntArray.put(R.id.photo_gallery_button, 42);
        sparseIntArray.put(R.id.tv_applic_gallary, 43);
        sparseIntArray.put(R.id.tv_applic_sign, 44);
        sparseIntArray.put(R.id.sign_capture_button, 45);
        sparseIntArray.put(R.id.tv_applic_sign_capt, 46);
        sparseIntArray.put(R.id.sign_gallery_button, 47);
        sparseIntArray.put(R.id.tv_applic_sign_gally, 48);
        sparseIntArray.put(R.id.upload_image, 49);
        sparseIntArray.put(R.id.signature_image, 50);
        sparseIntArray.put(R.id.upload_photos_and_sign, 51);
        sparseIntArray.put(R.id.skipped, 52);
    }

    public u2(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 53, (h.i) null, f28815y0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f28817x0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f28817x0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.f28817x0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private u2(androidx.databinding.e r58, android.view.View r59, java.lang.Object[] r60) {
        /*
            r57 = this;
            r15 = r57
            r3 = 0
            r0 = 8
            r0 = r60[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 7
            r0 = r60[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 24
            r0 = r60[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 23
            r0 = r60[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 37
            r0 = r60[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 36
            r0 = r60[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 13
            r0 = r60[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 11
            r0 = r60[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 15
            r0 = r60[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 19
            r0 = r60[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 5
            r0 = r60[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 17
            r0 = r60[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 2
            r0 = r60[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0065
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r17 = r0
            goto L_0x0067
        L_0x0065:
            r17 = r2
        L_0x0067:
            r0 = 9
            r0 = r60[r0]
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r0 = 25
            r0 = r60[r0]
            r19 = r0
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            r0 = 38
            r0 = r60[r0]
            r20 = r0
            androidx.cardview.widget.CardView r20 = (androidx.cardview.widget.CardView) r20
            r0 = 32
            r0 = r60[r0]
            r21 = r0
            android.widget.LinearLayout r21 = (android.widget.LinearLayout) r21
            r0 = 0
            r0 = r60[r0]
            r22 = r0
            android.widget.LinearLayout r22 = (android.widget.LinearLayout) r22
            r0 = 40
            r0 = r60[r0]
            r23 = r0
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            r0 = 42
            r0 = r60[r0]
            r24 = r0
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            r0 = 3
            r0 = r60[r0]
            if (r0 == 0) goto L_0x00ac
            android.view.View r0 = (android.view.View) r0
            ni.aa r0 = ni.aa.a(r0)
            r56 = r0
            goto L_0x00ae
        L_0x00ac:
            r56 = r2
        L_0x00ae:
            r0 = 16
            r0 = r60[r0]
            r25 = r0
            androidx.appcompat.widget.AppCompatTextView r25 = (androidx.appcompat.widget.AppCompatTextView) r25
            r0 = 21
            r0 = r60[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 45
            r0 = r60[r0]
            r27 = r0
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            r0 = 47
            r0 = r60[r0]
            r28 = r0
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            r0 = 50
            r0 = r60[r0]
            r29 = r0
            android.widget.ImageView r29 = (android.widget.ImageView) r29
            r0 = 52
            r0 = r60[r0]
            r30 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r30 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r30
            r0 = 31
            r0 = r60[r0]
            r31 = r0
            android.widget.ImageView r31 = (android.widget.ImageView) r31
            r0 = 30
            r0 = r60[r0]
            r32 = r0
            android.widget.ImageView r32 = (android.widget.ImageView) r32
            r0 = 35
            r0 = r60[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 41
            r0 = r60[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 43
            r0 = r60[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 39
            r0 = r60[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 44
            r0 = r60[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 46
            r0 = r60[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 48
            r0 = r60[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 12
            r0 = r60[r0]
            r40 = r0
            androidx.appcompat.widget.AppCompatTextView r40 = (androidx.appcompat.widget.AppCompatTextView) r40
            r0 = 6
            r0 = r60[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 10
            r0 = r60[r0]
            r42 = r0
            androidx.appcompat.widget.AppCompatTextView r42 = (androidx.appcompat.widget.AppCompatTextView) r42
            r0 = 18
            r0 = r60[r0]
            r43 = r0
            androidx.appcompat.widget.AppCompatTextView r43 = (androidx.appcompat.widget.AppCompatTextView) r43
            r0 = 22
            r0 = r60[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 14
            r0 = r60[r0]
            r45 = r0
            androidx.appcompat.widget.AppCompatTextView r45 = (androidx.appcompat.widget.AppCompatTextView) r45
            r0 = 26
            r0 = r60[r0]
            r46 = r0
            androidx.appcompat.widget.AppCompatTextView r46 = (androidx.appcompat.widget.AppCompatTextView) r46
            r0 = 33
            r0 = r60[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 28
            r0 = r60[r0]
            r48 = r0
            androidx.appcompat.widget.AppCompatTextView r48 = (androidx.appcompat.widget.AppCompatTextView) r48
            r0 = 27
            r0 = r60[r0]
            r49 = r0
            androidx.appcompat.widget.AppCompatTextView r49 = (androidx.appcompat.widget.AppCompatTextView) r49
            r0 = 34
            r0 = r60[r0]
            r50 = r0
            android.widget.TextView r50 = (android.widget.TextView) r50
            r0 = 20
            r0 = r60[r0]
            r51 = r0
            androidx.appcompat.widget.AppCompatTextView r51 = (androidx.appcompat.widget.AppCompatTextView) r51
            r0 = 29
            r0 = r60[r0]
            r52 = r0
            android.widget.TextView r52 = (android.widget.TextView) r52
            r0 = 4
            r0 = r60[r0]
            r53 = r0
            android.widget.TextView r53 = (android.widget.TextView) r53
            r0 = 49
            r0 = r60[r0]
            r54 = r0
            android.widget.ImageView r54 = (android.widget.ImageView) r54
            r0 = 51
            r0 = r60[r0]
            r55 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r55 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r55
            r0 = r57
            r1 = r58
            r2 = r59
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r0 = -1
            r2 = r57
            r2.f28817x0 = r0
            r0 = 1
            r0 = r60[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f28816w0 = r0
            r1 = 0
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r2.N
            r0.setTag(r1)
            r0 = r59
            r2.w(r0)
            r57.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.u2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
