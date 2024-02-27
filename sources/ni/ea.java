package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class ea extends da {
    private static final SparseIntArray Q;
    private final LinearLayout M;
    private final FrameLayout N;
    private final dc O;
    private long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.closeIv, 3);
        sparseIntArray.put(R.id.rg_point_a, 4);
        sparseIntArray.put(R.id.a_y, 5);
        sparseIntArray.put(R.id.a_n, 6);
        sparseIntArray.put(R.id.b_y, 7);
        sparseIntArray.put(R.id.b_n, 8);
        sparseIntArray.put(R.id.c_y, 9);
        sparseIntArray.put(R.id.c_n, 10);
        sparseIntArray.put(R.id.d_y, 11);
        sparseIntArray.put(R.id.d_n, 12);
        sparseIntArray.put(R.id.e_y, 13);
        sparseIntArray.put(R.id.e_n, 14);
        sparseIntArray.put(R.id.f_y, 15);
        sparseIntArray.put(R.id.f_n, 16);
        sparseIntArray.put(R.id.form_dec_check, 17);
        sparseIntArray.put(R.id.next_request, 18);
    }

    public ea(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 19, (h.i) null, Q));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.P = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.P = 1;
        }
        u();
    }

    private ea(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[6], objArr[5], objArr[8], objArr[7], objArr[10], objArr[9], objArr[3], objArr[12], objArr[11], objArr[14], objArr[13], objArr[16], objArr[15], objArr[17], objArr[18], objArr[4]);
        this.P = -1;
        LinearLayout linearLayout = objArr[0];
        this.M = linearLayout;
        dc dcVar = null;
        linearLayout.setTag((Object) null);
        FrameLayout frameLayout = objArr[1];
        this.N = frameLayout;
        frameLayout.setTag((Object) null);
        View view2 = objArr[2];
        this.O = view2 != null ? dc.a(view2) : dcVar;
        w(view);
        x();
    }
}
