package md;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sos.AddContactScreen;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14006e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AddContactScreen f14007f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f14008g;

    public /* synthetic */ c(Dialog dialog, AddContactScreen addContactScreen, int i10) {
        this.f14006e = dialog;
        this.f14007f = addContactScreen;
        this.f14008g = i10;
    }

    public final void onClick(View view) {
        AddContactScreen.X1(this.f14006e, this.f14007f, this.f14008g, view);
    }
}
