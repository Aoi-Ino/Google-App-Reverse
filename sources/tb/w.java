package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.ChangeNameLL;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16839e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChangeNameLL f16840f;

    public /* synthetic */ w(Dialog dialog, ChangeNameLL changeNameLL) {
        this.f16839e = dialog;
        this.f16840f = changeNameLL;
    }

    public final void onClick(View view) {
        ChangeNameLL.g2(this.f16839e, this.f16840f, view);
    }
}
