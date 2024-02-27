package ai;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;

public final /* synthetic */ class s4 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19259e;

    public /* synthetic */ s4(EditText editText) {
        this.f19259e = editText;
    }

    public final void onClick(View view) {
        VahanProcessWithAdhar.z2(this.f19259e, view);
    }
}
