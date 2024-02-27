package ai;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;

public final /* synthetic */ class r4 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19247e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanProcessWithAdhar f19248f;

    public /* synthetic */ r4(EditText editText, VahanProcessWithAdhar vahanProcessWithAdhar) {
        this.f19247e = editText;
        this.f19248f = vahanProcessWithAdhar;
    }

    public final void onClick(View view) {
        VahanProcessWithAdhar.y2(this.f19247e, this.f19248f, view);
    }
}
