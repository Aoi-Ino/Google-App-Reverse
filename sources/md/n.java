package md;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import com.nic.mparivahan.Sos.AddContactScreen;
import com.nic.mparivahan.Sos.SModle.MparSosContact;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f14029e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f14030f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AddContactScreen f14031g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Spinner f14032h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Dialog f14033i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MparSosContact f14034j;

    public /* synthetic */ n(EditText editText, EditText editText2, AddContactScreen addContactScreen, Spinner spinner, Dialog dialog, MparSosContact mparSosContact) {
        this.f14029e = editText;
        this.f14030f = editText2;
        this.f14031g = addContactScreen;
        this.f14032h = spinner;
        this.f14033i = dialog;
        this.f14034j = mparSosContact;
    }

    public final void onClick(View view) {
        AddContactScreen.m2(this.f14029e, this.f14030f, this.f14031g, this.f14032h, this.f14033i, this.f14034j, view);
    }
}
