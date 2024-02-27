package com.nic.mparivahan.DLServicesAuth.View;

import android.view.View;
import android.widget.TextView;

public final /* synthetic */ class f1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SarthiProcessWithAdhar f8245e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f8246f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f8247g;

    public /* synthetic */ f1(SarthiProcessWithAdhar sarthiProcessWithAdhar, TextView textView, TextView textView2) {
        this.f8245e = sarthiProcessWithAdhar;
        this.f8246f = textView;
        this.f8247g = textView2;
    }

    public final void onClick(View view) {
        SarthiProcessWithAdhar.k4(this.f8245e, this.f8246f, this.f8247g, view);
    }
}
