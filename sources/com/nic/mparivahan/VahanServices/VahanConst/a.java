package com.nic.mparivahan.VahanServices.VahanConst;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20954e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f20955f;

    public /* synthetic */ a(Dialog dialog, Context context) {
        this.f20954e = dialog;
        this.f20955f = context;
    }

    public final void onClick(View view) {
        VContant.Companion.N(this.f20954e, this.f20955f, view);
    }
}
