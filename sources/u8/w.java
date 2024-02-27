package u8;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Account.View.CreateNewMPIN;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17011e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CreateNewMPIN f17012f;

    public /* synthetic */ w(Dialog dialog, CreateNewMPIN createNewMPIN) {
        this.f17011e = dialog;
        this.f17012f = createNewMPIN;
    }

    public final void onClick(View view) {
        CreateNewMPIN.n1(this.f17011e, this.f17012f, view);
    }
}
