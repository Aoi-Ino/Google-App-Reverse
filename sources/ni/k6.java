package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class k6 extends j6 {
    private static final SparseIntArray I;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.mvvm_back, 1);
        sparseIntArray.put(R.id.main_icon, 2);
        sparseIntArray.put(R.id.service_label, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 5);
        sparseIntArray.put(R.id.container_cl, 6);
        sparseIntArray.put(R.id.application_No_Tv, 7);
        sparseIntArray.put(R.id.imageView6, 8);
        sparseIntArray.put(R.id.save_screen, 9);
        sparseIntArray.put(R.id.save_continue_to_next, 10);
    }

    public k6(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 11, (h.i) null, I));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.H = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.H = 2;
        }
        u();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private k6(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[7], objArr[6], objArr[8], objArr[5], objArr[2], objArr[1], objArr[4], objArr[10], objArr[9], objArr[3], objArr[0]);
        this.H = -1;
        this.G.setTag((Object) null);
        w(view);
        z();
    }
}
