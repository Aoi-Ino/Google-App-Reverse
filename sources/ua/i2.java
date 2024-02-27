package ua;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class i2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f17121e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchDL f17122f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f17123g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f17124h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ EditText f17125i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f17126j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Dialog f17127k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f17128l;

    public /* synthetic */ i2(String str, SearchDL searchDL, EditText editText, EditText editText2, EditText editText3, int i10, Dialog dialog, String str2) {
        this.f17121e = str;
        this.f17122f = searchDL;
        this.f17123g = editText;
        this.f17124h = editText2;
        this.f17125i = editText3;
        this.f17126j = i10;
        this.f17127k = dialog;
        this.f17128l = str2;
    }

    public final void onClick(View view) {
        SearchDL.M2(this.f17121e, this.f17122f, this.f17123g, this.f17124h, this.f17125i, this.f17126j, this.f17127k, this.f17128l, view);
    }
}
