package md;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import com.nic.mparivahan.Sos.AddContactScreen;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f14023e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f14024f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AddContactScreen f14025g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Spinner f14026h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Dialog f14027i;

    public /* synthetic */ l(EditText editText, EditText editText2, AddContactScreen addContactScreen, Spinner spinner, Dialog dialog) {
        this.f14023e = editText;
        this.f14024f = editText2;
        this.f14025g = addContactScreen;
        this.f14026h = spinner;
        this.f14027i = dialog;
    }

    public final void onClick(View view) {
        AddContactScreen.v1(this.f14023e, this.f14024f, this.f14025g, this.f14026h, this.f14027i, view);
    }
}
