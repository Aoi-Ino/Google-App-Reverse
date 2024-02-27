package ua;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.NewDlSearch;

public final /* synthetic */ class h1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f17111e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17112f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f17113g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f17114h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ NewDlSearch f17115i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f17116j;

    public /* synthetic */ h1(EditText editText, EditText editText2, EditText editText3, Dialog dialog, NewDlSearch newDlSearch, String str) {
        this.f17111e = editText;
        this.f17112f = editText2;
        this.f17113g = editText3;
        this.f17114h = dialog;
        this.f17115i = newDlSearch;
        this.f17116j = str;
    }

    public final void onClick(View view) {
        NewDlSearch.M2(this.f17111e, this.f17112f, this.f17113g, this.f17114h, this.f17115i, this.f17116j, view);
    }
}
