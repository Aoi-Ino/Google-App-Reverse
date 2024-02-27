package ai;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;

public final /* synthetic */ class r3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19243e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19244f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f19245g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanMainViewScreen f19246h;

    public /* synthetic */ r3(Dialog dialog, Context context, String str, VahanMainViewScreen vahanMainViewScreen) {
        this.f19243e = dialog;
        this.f19244f = context;
        this.f19245g = str;
        this.f19246h = vahanMainViewScreen;
    }

    public final void onClick(View view) {
        VahanMainViewScreen.x1(this.f19243e, this.f19244f, this.f19245g, this.f19246h, view);
    }
}
