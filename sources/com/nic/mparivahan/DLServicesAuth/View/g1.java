package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public final /* synthetic */ class g1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f8251e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SarthiProcessWithAdhar f8252f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f8253g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImageView f8254h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Dialog f8255i;

    public /* synthetic */ g1(EditText editText, SarthiProcessWithAdhar sarthiProcessWithAdhar, TextView textView, ImageView imageView, Dialog dialog) {
        this.f8251e = editText;
        this.f8252f = sarthiProcessWithAdhar;
        this.f8253g = textView;
        this.f8254h = imageView;
        this.f8255i = dialog;
    }

    public final void onClick(View view) {
        SarthiProcessWithAdhar.l4(this.f8251e, this.f8252f, this.f8253g, this.f8254h, this.f8255i, view);
    }
}
