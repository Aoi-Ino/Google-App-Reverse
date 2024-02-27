package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.SearchRC;

public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17730e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchRC f17731f;

    public /* synthetic */ k0(Dialog dialog, SearchRC searchRC) {
        this.f17730e = dialog;
        this.f17731f = searchRC;
    }

    public final void onClick(View view) {
        SearchRC.B3(this.f17730e, this.f17731f, view);
    }
}
