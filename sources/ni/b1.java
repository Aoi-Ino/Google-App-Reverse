package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class b1 extends a1 {
    private static final SparseIntArray K;
    private final LinearLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.mvvm_back, 1);
        sparseIntArray.put(R.id.main_icon, 2);
        sparseIntArray.put(R.id.service_label, 3);
        sparseIntArray.put(R.id.txt_dl_service, 4);
        sparseIntArray.put(R.id.btn_my_vehicle_two, 5);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 6);
        sparseIntArray.put(R.id.tv_dl_no, 7);
        sparseIntArray.put(R.id.cl_number, 8);
        sparseIntArray.put(R.id.chassi_number, 9);
        sparseIntArray.put(R.id.dl_dob, 10);
        sparseIntArray.put(R.id.btn_reset, 11);
        sparseIntArray.put(R.id.btn_submit, 12);
    }

    public b1(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 13, (h.i) null, K));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.J = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.J = 1;
        }
        u();
    }

    private b1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[5], objArr[11], objArr[12], objArr[9], objArr[8], objArr[10], objArr[2], objArr[1], objArr[6], objArr[3], objArr[7], objArr[4]);
        this.J = -1;
        LinearLayout linearLayout = objArr[0];
        this.I = linearLayout;
        linearLayout.setTag((Object) null);
        w(view);
        x();
    }
}
