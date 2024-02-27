package ai;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class q5 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19235e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19236f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f19237g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19238h;

    public /* synthetic */ q5(Dialog dialog, Context context, String str, VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19235e = dialog;
        this.f19236f = context;
        this.f19237g = str;
        this.f19238h = vahanSelectServiceScreen;
    }

    public final void onClick(View view) {
        VahanSelectServiceScreen.M1(this.f19235e, this.f19236f, this.f19237g, this.f19238h, view);
    }
}
