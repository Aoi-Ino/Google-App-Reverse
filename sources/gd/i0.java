package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ReprintReceipt;

public final /* synthetic */ class i0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f11878e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f11879f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ReprintReceipt f11880g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f11881h;

    public /* synthetic */ i0(String str, String str2, ReprintReceipt reprintReceipt, Dialog dialog) {
        this.f11878e = str;
        this.f11879f = str2;
        this.f11880g = reprintReceipt;
        this.f11881h = dialog;
    }

    public final void onClick(View view) {
        ReprintReceipt.j1(this.f11878e, this.f11879f, this.f11880g, this.f11881h, view);
    }
}
