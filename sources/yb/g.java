package yb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Language.ChangeMpinActivity;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f18653e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f18654f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ChangeMpinActivity f18655g;

    public /* synthetic */ g(Dialog dialog, int i10, ChangeMpinActivity changeMpinActivity) {
        this.f18653e = dialog;
        this.f18654f = i10;
        this.f18655g = changeMpinActivity;
    }

    public final void onClick(View view) {
        ChangeMpinActivity.o1(this.f18653e, this.f18654f, this.f18655g, view);
    }
}
