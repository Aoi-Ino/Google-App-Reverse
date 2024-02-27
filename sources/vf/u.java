package vf;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32295e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f32296f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f32297g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ NomineeMainViewScreen f32298h;

    public /* synthetic */ u(Dialog dialog, Context context, String str, NomineeMainViewScreen nomineeMainViewScreen) {
        this.f32295e = dialog;
        this.f32296f = context;
        this.f32297g = str;
        this.f32298h = nomineeMainViewScreen;
    }

    public final void onClick(View view) {
        NomineeMainViewScreen.v1(this.f32295e, this.f32296f, this.f32297g, this.f32298h, view);
    }
}
