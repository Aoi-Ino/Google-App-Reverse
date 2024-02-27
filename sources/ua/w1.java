package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class w1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17195e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchDL f17196f;

    public /* synthetic */ w1(Dialog dialog, SearchDL searchDL) {
        this.f17195e = dialog;
        this.f17196f = searchDL;
    }

    public final void onClick(View view) {
        SearchDL.E2(this.f17195e, this.f17196f, view);
    }
}
