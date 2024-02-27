package com.nic.mparivahan.DLServicesAuth.View;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public final /* synthetic */ class e1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f8239e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f8240f;

    public /* synthetic */ e1(EditText editText, ImageView imageView) {
        this.f8239e = editText;
        this.f8240f = imageView;
    }

    public final void onClick(View view) {
        SarthiProcessWithAdhar.j4(this.f8239e, this.f8240f, view);
    }
}
