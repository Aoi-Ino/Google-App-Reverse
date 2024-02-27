package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.DuplicateLL;

public final /* synthetic */ class f0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16745e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DuplicateLL f16746f;

    public /* synthetic */ f0(Dialog dialog, DuplicateLL duplicateLL) {
        this.f16745e = dialog;
        this.f16746f = duplicateLL;
    }

    public final void onClick(View view) {
        DuplicateLL.M1(this.f16745e, this.f16746f, view);
    }
}
