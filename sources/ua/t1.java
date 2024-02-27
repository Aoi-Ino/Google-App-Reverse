package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class t1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17185e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchDL f17186f;

    public /* synthetic */ t1(Dialog dialog, SearchDL searchDL) {
        this.f17185e = dialog;
        this.f17186f = searchDL;
    }

    public final void onClick(View view) {
        SearchDL.O2(this.f17185e, this.f17186f, view);
    }
}
