package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class m0 extends l0 {

    /* renamed from: u0  reason: collision with root package name */
    private static final SparseIntArray f27382u0;

    /* renamed from: s0  reason: collision with root package name */
    private final RelativeLayout f27383s0;

    /* renamed from: t0  reason: collision with root package name */
    private long f27384t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27382u0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.details_scroll_view, 2);
        sparseIntArray.put(R.id.round_card_view, 3);
        sparseIntArray.put(R.id.cl_photo, 4);
        sparseIntArray.put(R.id.tv_cl_Details, 5);
        sparseIntArray.put(R.id.tv_appln_detail, 6);
        sparseIntArray.put(R.id.app_arrow_up, 7);
        sparseIntArray.put(R.id.app_arrow_down, 8);
        sparseIntArray.put(R.id.ll_personal_details, 9);
        sparseIntArray.put(R.id.txt_name, 10);
        sparseIntArray.put(R.id.txt_name_value, 11);
        sparseIntArray.put(R.id.txt_father_name, 12);
        sparseIntArray.put(R.id.txt_father_name_value, 13);
        sparseIntArray.put(R.id.txt_mob_num, 14);
        sparseIntArray.put(R.id.txt_mob_num_value, 15);
        sparseIntArray.put(R.id.txt_blood, 16);
        sparseIntArray.put(R.id.spn_app_cat, 17);
        sparseIntArray.put(R.id.txt_add, 18);
        sparseIntArray.put(R.id.txt_add_value, 19);
        sparseIntArray.put(R.id.tv_lic_detail, 20);
        sparseIntArray.put(R.id.app_arrow_up_lic, 21);
        sparseIntArray.put(R.id.app_arrow_down_lic, 22);
        sparseIntArray.put(R.id.ll_details, 23);
        sparseIntArray.put(R.id.txt_lic_num, 24);
        sparseIntArray.put(R.id.txt_lic_num_val, 25);
        sparseIntArray.put(R.id.txt_lic_validity, 26);
        sparseIntArray.put(R.id.txt_lic_validity_val, 27);
        sparseIntArray.put(R.id.txt_doi, 28);
        sparseIntArray.put(R.id.txt_doi_value, 29);
        sparseIntArray.put(R.id.txt_duration, 30);
        sparseIntArray.put(R.id.txt_year, 31);
        sparseIntArray.put(R.id.txt_month, 32);
        sparseIntArray.put(R.id.tv_state, 33);
        sparseIntArray.put(R.id.ed_mother_name, 34);
        sparseIntArray.put(R.id.tv_marr_Status, 35);
        sparseIntArray.put(R.id.spn_mar_Status, 36);
        sparseIntArray.put(R.id.tv_relig, 37);
        sparseIntArray.put(R.id.spn_mar_religion, 38);
        sparseIntArray.put(R.id.tv_bp, 39);
        sparseIntArray.put(R.id.edit_place_of_birth, 40);
        sparseIntArray.put(R.id.tv_category, 41);
        sparseIntArray.put(R.id.spn_cat, 42);
        sparseIntArray.put(R.id.tv_ps, 43);
        sparseIntArray.put(R.id.et_ps, 44);
        sparseIntArray.put(R.id.tv_criminal, 45);
        sparseIntArray.put(R.id.spn_crim, 46);
        sparseIntArray.put(R.id.btn_reset, 47);
        sparseIntArray.put(R.id.btn_submit, 48);
    }

    public m0(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 49, (h.i) null, f27382u0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f27384t0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f27384t0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f27384t0 = 1;
        }
        u();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m0(androidx.databinding.e r54, android.view.View r55, java.lang.Object[] r56) {
        /*
            r53 = this;
            r15 = r53
            r3 = 0
            r0 = 8
            r0 = r56[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 22
            r0 = r56[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 7
            r0 = r56[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 21
            r0 = r56[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 47
            r0 = r56[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatButton r8 = (androidx.appcompat.widget.AppCompatButton) r8
            r0 = 48
            r0 = r56[r0]
            r9 = r0
            androidx.appcompat.widget.AppCompatButton r9 = (androidx.appcompat.widget.AppCompatButton) r9
            r0 = 4
            r0 = r56[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 2
            r0 = r56[r0]
            r11 = r0
            android.widget.ScrollView r11 = (android.widget.ScrollView) r11
            r0 = 34
            r0 = r56[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 40
            r0 = r56[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 44
            r0 = r56[r0]
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 23
            r0 = r56[r0]
            r16 = r0
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r0 = 9
            r0 = r56[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 1
            r0 = r56[r0]
            r2 = 0
            if (r0 == 0) goto L_0x006c
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r52 = r0
            goto L_0x006e
        L_0x006c:
            r52 = r2
        L_0x006e:
            r0 = 3
            r0 = r56[r0]
            r18 = r0
            androidx.cardview.widget.CardView r18 = (androidx.cardview.widget.CardView) r18
            r0 = 17
            r0 = r56[r0]
            r19 = r0
            android.widget.Spinner r19 = (android.widget.Spinner) r19
            r0 = 42
            r0 = r56[r0]
            r20 = r0
            android.widget.Spinner r20 = (android.widget.Spinner) r20
            r0 = 46
            r0 = r56[r0]
            r21 = r0
            android.widget.Spinner r21 = (android.widget.Spinner) r21
            r0 = 38
            r0 = r56[r0]
            r22 = r0
            android.widget.Spinner r22 = (android.widget.Spinner) r22
            r0 = 36
            r0 = r56[r0]
            r23 = r0
            android.widget.Spinner r23 = (android.widget.Spinner) r23
            r0 = 6
            r0 = r56[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 39
            r0 = r56[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 41
            r0 = r56[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 5
            r0 = r56[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 45
            r0 = r56[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 20
            r0 = r56[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 35
            r0 = r56[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 43
            r0 = r56[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 37
            r0 = r56[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 33
            r0 = r56[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 18
            r0 = r56[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 19
            r0 = r56[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 16
            r0 = r56[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 28
            r0 = r56[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 29
            r0 = r56[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 30
            r0 = r56[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 12
            r0 = r56[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 13
            r0 = r56[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 24
            r0 = r56[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 25
            r0 = r56[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 26
            r0 = r56[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 27
            r0 = r56[r0]
            r45 = r0
            android.widget.TextView r45 = (android.widget.TextView) r45
            r0 = 14
            r0 = r56[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 15
            r0 = r56[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 32
            r0 = r56[r0]
            r48 = r0
            android.widget.EditText r48 = (android.widget.EditText) r48
            r0 = 10
            r0 = r56[r0]
            r49 = r0
            android.widget.TextView r49 = (android.widget.TextView) r49
            r0 = 11
            r0 = r56[r0]
            r50 = r0
            android.widget.TextView r50 = (android.widget.TextView) r50
            r0 = 31
            r0 = r56[r0]
            r51 = r0
            android.widget.EditText r51 = (android.widget.EditText) r51
            r0 = r53
            r1 = r54
            r2 = r55
            r15 = r16
            r16 = r17
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r0 = -1
            r2 = r53
            r2.f27384t0 = r0
            r0 = 0
            r0 = r56[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f27383s0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = r55
            r2.w(r0)
            r53.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.m0.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
