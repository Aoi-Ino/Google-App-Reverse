package sa;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dashboard.ui.VirtualDocScreen;

public final /* synthetic */ class g0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f16088e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f16089f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f16090g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f16091h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ VirtualDocScreen f16092i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f16093j;

    public /* synthetic */ g0(EditText editText, EditText editText2, EditText editText3, Dialog dialog, VirtualDocScreen virtualDocScreen, String str) {
        this.f16088e = editText;
        this.f16089f = editText2;
        this.f16090g = editText3;
        this.f16091h = dialog;
        this.f16092i = virtualDocScreen;
        this.f16093j = str;
    }

    public final void onClick(View view) {
        VirtualDocScreen.Y1(this.f16088e, this.f16089f, this.f16090g, this.f16091h, this.f16092i, this.f16093j, view);
    }
}
