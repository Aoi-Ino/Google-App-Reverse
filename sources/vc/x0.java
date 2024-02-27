package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.SearchRC;

public final /* synthetic */ class x0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17772e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchRC f17773f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RcModelsDet f17774g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f17775h;

    public /* synthetic */ x0(Dialog dialog, SearchRC searchRC, RcModelsDet rcModelsDet, String str) {
        this.f17772e = dialog;
        this.f17773f = searchRC;
        this.f17774g = rcModelsDet;
        this.f17775h = str;
    }

    public final void onClick(View view) {
        SearchRC.L1(this.f17772e, this.f17773f, this.f17774g, this.f17775h, view);
    }
}
