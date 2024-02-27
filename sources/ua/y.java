package ua;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.DLDashboardNew;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f17204e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLDashboardNew f17205f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f17206g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f17207h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ EditText f17208i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Dialog f17209j;

    public /* synthetic */ y(String str, DLDashboardNew dLDashboardNew, EditText editText, EditText editText2, EditText editText3, Dialog dialog) {
        this.f17204e = str;
        this.f17205f = dLDashboardNew;
        this.f17206g = editText;
        this.f17207h = editText2;
        this.f17208i = editText3;
        this.f17209j = dialog;
    }

    public final void onClick(View view) {
        DLDashboardNew.m3(this.f17204e, this.f17205f, this.f17206g, this.f17207h, this.f17208i, this.f17209j, view);
    }
}
