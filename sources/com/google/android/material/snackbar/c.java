package com.google.android.material.snackbar;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Snackbar f6340e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f6341f;

    public /* synthetic */ c(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f6340e = snackbar;
        this.f6341f = onClickListener;
    }

    public final void onClick(View view) {
        this.f6340e.k0(this.f6341f, view);
    }
}
