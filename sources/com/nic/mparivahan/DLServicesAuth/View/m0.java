package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.view.View;
import java.util.ArrayList;

public final /* synthetic */ class m0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f8284e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlServicesMainScreen f8285f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f8286g;

    public /* synthetic */ m0(Dialog dialog, DlServicesMainScreen dlServicesMainScreen, ArrayList arrayList) {
        this.f8284e = dialog;
        this.f8285f = dlServicesMainScreen;
        this.f8286g = arrayList;
    }

    public final void onClick(View view) {
        DlServicesMainScreen.O1(this.f8284e, this.f8285f, this.f8286g, view);
    }
}
