package ua;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class x1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SearchDL f17199e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17200f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f17201g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f17202h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Dialog f17203i;

    public /* synthetic */ x1(SearchDL searchDL, EditText editText, EditText editText2, EditText editText3, Dialog dialog) {
        this.f17199e = searchDL;
        this.f17200f = editText;
        this.f17201g = editText2;
        this.f17202h = editText3;
        this.f17203i = dialog;
    }

    public final void onClick(View view) {
        SearchDL.F2(this.f17199e, this.f17200f, this.f17201g, this.f17202h, this.f17203i, view);
    }
}
