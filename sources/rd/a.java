package rd;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final h f31020b;

    public a(h hVar) {
        l.f(hVar, "repository");
        this.f31020b = hVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(PaytaxViewModel.class)) {
            return new PaytaxViewModel(this.f31020b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
