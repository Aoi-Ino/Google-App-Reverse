package x8;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.AddCov.View.CovApplication;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ CovApplication f18220e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f18221f;

    public /* synthetic */ f(CovApplication covApplication, EditText editText) {
        this.f18220e = covApplication;
        this.f18221f = editText;
    }

    public final void onClick(View view) {
        CovApplication.o2(this.f18220e, this.f18221f, view);
    }
}
