package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class hd extends gd {

    /* renamed from: l0  reason: collision with root package name */
    private static final SparseIntArray f26726l0;

    /* renamed from: h0  reason: collision with root package name */
    private final CoordinatorLayout f26727h0;

    /* renamed from: i0  reason: collision with root package name */
    private final LinearLayout f26728i0;

    /* renamed from: j0  reason: collision with root package name */
    private final mc f26729j0;

    /* renamed from: k0  reason: collision with root package name */
    private long f26730k0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26726l0 = sparseIntArray;
        sparseIntArray.put(R.id.parent_layout, 3);
        sparseIntArray.put(R.id.mvvm_back, 4);
        sparseIntArray.put(R.id.ll_home, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.select_service_name, 7);
        sparseIntArray.put(R.id.icon_image, 8);
        sparseIntArray.put(R.id.round_card_view, 9);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 10);
        sparseIntArray.put(R.id.app_arrow_up, 11);
        sparseIntArray.put(R.id.app_arrow_down, 12);
        sparseIntArray.put(R.id.ll_bottom_design, 13);
        sparseIntArray.put(R.id.application_number, 14);
        sparseIntArray.put(R.id.application_date, 15);
        sparseIntArray.put(R.id.applicatn_name, 16);
        sparseIntArray.put(R.id.relation_name, 17);
        sparseIntArray.put(R.id.fathers_name, 18);
        sparseIntArray.put(R.id.date_of_birth, 19);
        sparseIntArray.put(R.id.rto_name, 20);
        sparseIntArray.put(R.id.app_ins_arrow_up, 21);
        sparseIntArray.put(R.id.app_ins_arrow_down, 22);
        sparseIntArray.put(R.id.ll_instructions, 23);
        sparseIntArray.put(R.id.spec_arrow_up, 24);
        sparseIntArray.put(R.id.spec_arrow_down, 25);
        sparseIntArray.put(R.id.ll_specifications, 26);
        sparseIntArray.put(R.id.app_photo_arrow_up, 27);
        sparseIntArray.put(R.id.app_photo_arrow_down, 28);
        sparseIntArray.put(R.id.ll_photo, 29);
        sparseIntArray.put(R.id.image_name, 30);
        sparseIntArray.put(R.id.image_browse, 31);
        sparseIntArray.put(R.id.signature_name, 32);
        sparseIntArray.put(R.id.signature_browse, 33);
        sparseIntArray.put(R.id.capture_button, 34);
        sparseIntArray.put(R.id.browse_button, 35);
        sparseIntArray.put(R.id.upload_image, 36);
        sparseIntArray.put(R.id.signature_image, 37);
        sparseIntArray.put(R.id.upload_photos_and_sign, 38);
        sparseIntArray.put(R.id.skipped, 39);
    }

    public hd(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 40, (h.i) null, f26726l0));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.f26730k0 = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f26730k0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.f26730k0 = 1;
        }
        u();
    }

    private hd(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[12], objArr[11], objArr[22], objArr[21], objArr[28], objArr[27], objArr[15], objArr[14], objArr[16], objArr[35], objArr[34], objArr[19], objArr[6], objArr[18], objArr[8], objArr[31], objArr[30], objArr[10], objArr[13], objArr[5], objArr[23], objArr[29], objArr[26], objArr[4], objArr[3], objArr[17], objArr[9], objArr[20], objArr[7], objArr[33], objArr[37], objArr[32], objArr[39], objArr[25], objArr[24], objArr[36], objArr[38]);
        this.f26730k0 = -1;
        CoordinatorLayout coordinatorLayout = objArr[0];
        this.f26727h0 = coordinatorLayout;
        mc mcVar = null;
        coordinatorLayout.setTag((Object) null);
        LinearLayout linearLayout = objArr[1];
        this.f26728i0 = linearLayout;
        linearLayout.setTag((Object) null);
        View view2 = objArr[2];
        this.f26729j0 = view2 != null ? mc.a(view2) : mcVar;
        w(view);
        x();
    }
}
