package yc;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cm.u;
import v8.h;
import yc.i;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProgressDialog f18671e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f18672f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f18673g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TextView f18674h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ u f18675i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f18676j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TextView f18677k;

    public /* synthetic */ d(ProgressDialog progressDialog, h hVar, String str, TextView textView, u uVar, Context context, TextView textView2) {
        this.f18671e = progressDialog;
        this.f18672f = hVar;
        this.f18673g = str;
        this.f18674h = textView;
        this.f18675i = uVar;
        this.f18676j = context;
        this.f18677k = textView2;
    }

    public final void onClick(View view) {
        i.a.o(this.f18671e, this.f18672f, this.f18673g, this.f18674h, this.f18675i, this.f18676j, this.f18677k, view);
    }
}
